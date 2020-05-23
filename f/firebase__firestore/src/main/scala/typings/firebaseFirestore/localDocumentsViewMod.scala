package typings.firebaseFirestore

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.DocumentMap_
import typings.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.collectionsMod.NullableMaybeDocumentMap_
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.indexManagerMod.IndexManager
import typings.firebaseFirestore.mutationQueueMod.MutationQueue
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_documents_view", JSImport.Namespace)
@js.native
object localDocumentsViewMod extends js.Object {
  @js.native
  class LocalDocumentsView protected () extends js.Object {
    def this(remoteDocumentCache: RemoteDocumentCache, mutationQueue: MutationQueue, indexManager: IndexManager) = this()
    var addMissingBaseDocuments: js.Any = js.native
    var applyLocalMutationsToDocuments: js.Any = js.native
    /** Internal version of `getDocument` that allows reusing batches. */
    var getDocumentInternal: js.Any = js.native
    var getDocumentsMatchingCollectionGroupQuery: js.Any = js.native
    var getDocumentsMatchingCollectionQuery: js.Any = js.native
    var getDocumentsMatchingDocumentQuery: js.Any = js.native
    val indexManager: IndexManager = js.native
    val mutationQueue: MutationQueue = js.native
    val remoteDocumentCache: RemoteDocumentCache = js.native
    /**
      * Get the local view of the document identified by `key`.
      *
      * @return Local view of the document or null if we don't have any cached
      * state for it.
      */
    def getDocument(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[MaybeDocument | Null] = js.native
    /**
      * Gets the local view of the documents identified by `keys`.
      *
      * If we don't have cached state for a document in `keys`, a NoDocument will
      * be stored for that key in the resulting set.
      */
    def getDocuments(transaction: PersistenceTransaction, keys: DocumentKeySet_): PersistencePromise[MaybeDocumentMap_] = js.native
    /**
      * Performs a query against the local view of all documents.
      *
      * @param transaction The persistence transaction.
      * @param query The query to match documents against.
      * @param sinceReadTime If not set to SnapshotVersion.min(), return only
      *     documents that have been read since this snapshot version (exclusive).
      */
    def getDocumentsMatchingQuery(transaction: PersistenceTransaction, query: Query, sinceReadTime: SnapshotVersion): PersistencePromise[DocumentMap_] = js.native
    /**
      * Similar to `getDocuments`, but creates the local view from the given
      * `baseDocs` without retrieving documents from the local store.
      */
    def getLocalViewOfDocuments(transaction: PersistenceTransaction, baseDocs: NullableMaybeDocumentMap_): PersistencePromise[MaybeDocumentMap_] = js.native
  }
  
}

