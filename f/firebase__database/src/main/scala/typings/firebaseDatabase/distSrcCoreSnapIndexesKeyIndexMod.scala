package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreSnapIndexesKeyIndexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/KeyIndex", "KEY_INDEX")
  @js.native
  val KEY_INDEX: KeyIndex = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/KeyIndex", "KeyIndex")
  @js.native
  open class KeyIndex () extends Index {
    
    def makePost(indexValue: String, name: String): NamedNode = js.native
  }
}
