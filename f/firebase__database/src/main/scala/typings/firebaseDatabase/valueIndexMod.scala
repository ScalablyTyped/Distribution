package typings.firebaseDatabase

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/ValueIndex", "VALUE_INDEX")
  @js.native
  val VALUE_INDEX: ValueIndex = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/ValueIndex", "ValueIndex")
  @js.native
  class ValueIndex () extends Index {
    
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
}
