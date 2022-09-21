package typings.firebaseFirestore

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.persistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryRemoteDocumentCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/memory_remote_document_cache", JSImport.Namespace)
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
