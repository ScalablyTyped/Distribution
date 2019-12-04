package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcLocalIndexUnderscoreManagerMod.IndexManager
import typings.atFirebaseFirestore.distSrcLocalMemoryUnderscoreRemoteUnderscoreDocumentUnderscoreCacheMod.DocumentSizer
import typings.atFirebaseFirestore.distSrcLocalPersistenceMod.PersistenceTransaction
import typings.atFirebaseFirestore.distSrcLocalPersistenceUnderscorePromiseMod.PersistencePromise
import typings.atFirebaseFirestore.distSrcLocalRemoteUnderscoreDocumentUnderscoreCacheMod.RemoteDocumentCache
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_remote_document_cache", JSImport.Namespace)
@js.native
object distSrcLocalMemoryUnderscoreRemoteUnderscoreDocumentUnderscoreCacheMod extends js.Object {
  @js.native
  class MemoryRemoteDocumentCache protected () extends RemoteDocumentCache {
    /**
      * @param sizer Used to assess the size of a document. For eager GC, this is expected to just
      * return 0 to avoid unnecessarily doing the work of calculating the size.
      */
    def this(indexManager: IndexManager, sizer: DocumentSizer) = this()
    /**
      * Adds the supplied entry to the cache and updates the cache size as appropriate.
      *
      * All calls of `addEntry`  are required to go through the RemoteDocumentChangeBuffer
      * returned by `newChangeBuffer()`.
      */
    var addEntry: js.Any = js.native
    /** Underlying cache of documents and their read times. */
    var docs: js.Any = js.native
    val indexManager: js.Any = js.native
    /**
      * Removes the specified entry from the cache and updates the cache size as appropriate.
      *
      * All calls of `removeEntry` are required to go through the RemoteDocumentChangeBuffer
      * returned by `newChangeBuffer()`.
      */
    var removeEntry: js.Any = js.native
    /** Size of all cached documents. */
    var size: js.Any = js.native
    val sizer: js.Any = js.native
    def forEachDocumentKey(
      transaction: PersistenceTransaction,
      f: js.Function1[/* key */ DocumentKey, PersistencePromise[Unit]]
    ): PersistencePromise[Unit] = js.native
  }
  
  /* static members */
  @js.native
  object MemoryRemoteDocumentCache extends js.Object {
    /**
      * Handles the details of adding and updating documents in the MemoryRemoteDocumentCache.
      */
    var RemoteDocumentChangeBuffer: js.Any = js.native
  }
  
  type DocumentSizer = js.Function1[/* doc */ MaybeDocument, Double]
}

