package typings.firebaseDatabase

import typings.firebaseDatabase.childrenNodeMod.ChildrenNode
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/indexes/KeyIndex", JSImport.Namespace)
@js.native
object keyIndexMod extends js.Object {
  @js.native
  class KeyIndex () extends Index {
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: String, name: String): NamedNode = js.native
  }
  
  val KEY_INDEX: KeyIndex = js.native
  /* static members */
  @js.native
  object KeyIndex extends js.Object {
    def __EMPTY_NODE(): ChildrenNode = js.native
    def __EMPTY_NODE(`val`: ChildrenNode): js.Any = js.native
  }
  
}

