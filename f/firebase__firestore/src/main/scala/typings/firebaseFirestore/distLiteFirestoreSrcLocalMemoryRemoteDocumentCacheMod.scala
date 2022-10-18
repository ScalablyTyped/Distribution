package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLiteFirestoreSrcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalMemoryRemoteDocumentCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_remote_document_cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newMemoryRemoteDocumentCache(sizer: DocumentSizer): MemoryRemoteDocumentCache = ^.asInstanceOf[js.Dynamic].applyDynamic("newMemoryRemoteDocumentCache")(sizer.asInstanceOf[js.Any]).asInstanceOf[MemoryRemoteDocumentCache]
  
  type DocumentSizer = js.Function1[/* doc */ Document, Double]
  
  @js.native
  trait MemoryRemoteDocumentCache
    extends StObject
       with RemoteDocumentCache {
    
    def forEachDocumentKey(
      transaction: PersistenceTransaction,
      f: js.Function1[/* key */ DocumentKey, PersistencePromise[Unit]]
    ): PersistencePromise[Unit] = js.native
  }
}
