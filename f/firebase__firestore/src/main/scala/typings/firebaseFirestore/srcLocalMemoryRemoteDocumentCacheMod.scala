package typings.firebaseFirestore

import typings.firebaseFirestore.srcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.srcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.srcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.srcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.srcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLocalMemoryRemoteDocumentCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/memory_remote_document_cache", JSImport.Namespace)
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
