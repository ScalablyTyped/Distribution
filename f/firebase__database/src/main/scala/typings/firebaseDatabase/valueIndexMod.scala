package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/indexes/ValueIndex", JSImport.Namespace)
@js.native
object valueIndexMod extends js.Object {
  @js.native
  class ValueIndex () extends Index {
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
  
  val VALUE_INDEX: ValueIndex = js.native
}

