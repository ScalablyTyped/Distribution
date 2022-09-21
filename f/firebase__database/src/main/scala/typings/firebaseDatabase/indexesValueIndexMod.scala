package typings.firebaseDatabase

import typings.firebaseDatabase.indexesIndexMod.Index
import typings.firebaseDatabase.snapNodeMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexesValueIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/ValueIndex", "VALUE_INDEX")
  @js.native
  val VALUE_INDEX: ValueIndex = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/ValueIndex", "ValueIndex")
  @js.native
  open class ValueIndex () extends Index {
    
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
}
