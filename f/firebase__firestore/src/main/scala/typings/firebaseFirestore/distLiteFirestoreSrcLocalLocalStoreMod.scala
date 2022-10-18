package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLocalDocumentsViewMod.LocalDocumentsView
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLruGarbageCollectorMod.LruResults
import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalLocalStoreMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/local_store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ignoreIfPrimaryLeaseLoss(err: FirestoreError): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreIfPrimaryLeaseLoss")(err.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait LocalStore extends StObject {
    
    def collectGarbage(garbageCollector: LruGarbageCollector): js.Promise[LruResults]
    
    /** Manages the list of active field and collection indices. */
    var indexManager: IndexManager
    
    /**
      * The "local" view of all documents (layering mutationQueue on top of
      * remoteDocumentCache).
      */
    var localDocuments: LocalDocumentsView
  }
  object LocalStore {
    
    inline def apply(
      collectGarbage: LruGarbageCollector => js.Promise[LruResults],
      indexManager: IndexManager,
      localDocuments: LocalDocumentsView
    ): LocalStore = {
      val __obj = js.Dynamic.literal(collectGarbage = js.Any.fromFunction1(collectGarbage), indexManager = indexManager.asInstanceOf[js.Any], localDocuments = localDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalStore]
    }
    
    extension [Self <: LocalStore](x: Self) {
      
      inline def setCollectGarbage(value: LruGarbageCollector => js.Promise[LruResults]): Self = StObject.set(x, "collectGarbage", js.Any.fromFunction1(value))
      
      inline def setIndexManager(value: IndexManager): Self = StObject.set(x, "indexManager", value.asInstanceOf[js.Any])
      
      inline def setLocalDocuments(value: LocalDocumentsView): Self = StObject.set(x, "localDocuments", value.asInstanceOf[js.Any])
    }
  }
}
