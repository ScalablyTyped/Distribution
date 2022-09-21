package typings.firebaseFirestore

import typings.firebaseFirestore.indexManagerMod.IndexManager
import typings.firebaseFirestore.pathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryIndexManagerMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/memory_index_manager", "MemoryCollectionParentIndex")
  @js.native
  open class MemoryCollectionParentIndex () extends StObject {
    
    def add(collectionPath: ResourcePath): Boolean = js.native
    
    def getEntries(collectionId: String): js.Array[ResourcePath] = js.native
    
    def has(collectionPath: ResourcePath): Boolean = js.native
    
    /* private */ var index: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/memory_index_manager", "MemoryIndexManager")
  @js.native
  open class MemoryIndexManager ()
    extends StObject
       with IndexManager {
    
    /* private */ var collectionParentIndex: Any = js.native
  }
}
