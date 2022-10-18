package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distLiteFirestoreSrcLocalLocalStoreImplMod.LocalWriteResult
import typings.firebaseFirestore.distLiteFirestoreSrcLocalMutationQueueMod.MutationQueue
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLiteFirestoreSrcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeyMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.MutableDocumentMap_
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.OverlayMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.OverlayedDocumentMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldIndexMod.IndexOffset
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldMaskMod.FieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalLocalDocumentsViewMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/local_documents_view", "LocalDocumentsView")
  @js.native
  open class LocalDocumentsView protected () extends StObject {
    def this(
      remoteDocumentCache: RemoteDocumentCache,
      mutationQueue: MutationQueue,
      documentOverlayCache: DocumentOverlayCache,
      indexManager: IndexManager
    ) = this()
    
    /**
      * Computes the local view for the given documents.
      *
      * @param docs - The documents to compute views for. It also has the base
      *   version of the documents.
      * @param overlays - The overlays that need to be applied to the given base
      *   version of the documents.
      * @param existenceStateChanged - A set of documents whose existence states
      *   might have changed. This is used to determine if we need to re-calculate
      *   overlays from mutation queues.
      * @return A map represents the local documents view.
      */
    def computeViews(
      transaction: PersistenceTransaction,
      docs: MutableDocumentMap_,
      overlays: OverlayMap,
      existenceStateChanged: DocumentKeySet_
    ): PersistencePromise[OverlayedDocumentMap] = js.native
    
    val documentOverlayCache: DocumentOverlayCache = js.native
    
    /** Returns a base document that can be used to apply `overlay`. */
    /* private */ var getBaseDocument: Any = js.native
    
    /**
      * Get the local view of the document identified by `key`.
      *
      * @returns Local view of the document or null if we don't have any cached
      * state for it.
      */
    def getDocument(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Document] = js.native
    
    /**
      * Gets the local view of the documents identified by `keys`.
      *
      * If we don't have cached state for a document in `keys`, a NoDocument will
      * be stored for that key in the resulting set.
      */
    def getDocuments(transaction: PersistenceTransaction, keys: DocumentKeySet_): PersistencePromise[DocumentMap_] = js.native
    
    /* private */ var getDocumentsMatchingCollectionGroupQuery: Any = js.native
    
    /* private */ var getDocumentsMatchingCollectionQuery: Any = js.native
    
    /* private */ var getDocumentsMatchingDocumentQuery: Any = js.native
    
    /**
      * Performs a query against the local view of all documents.
      *
      * @param transaction - The persistence transaction.
      * @param query - The query to match documents against.
      * @param offset - Read time and key to start scanning by (exclusive).
      */
    def getDocumentsMatchingQuery(transaction: PersistenceTransaction, query: Query, offset: IndexOffset): PersistencePromise[DocumentMap_] = js.native
    
    /**
      * Similar to `getDocuments`, but creates the local view from the given
      * `baseDocs` without retrieving documents from the local store.
      *
      * @param transaction - The transaction this operation is scoped to.
      * @param docs - The documents to apply local mutations to get the local views.
      * @param existenceStateChanged - The set of document keys whose existence state
      *   is changed. This is useful to determine if some documents overlay needs
      *   to be recalculated.
      */
    def getLocalViewOfDocuments(transaction: PersistenceTransaction, docs: MutableDocumentMap_): PersistencePromise[DocumentMap_] = js.native
    def getLocalViewOfDocuments(
      transaction: PersistenceTransaction,
      docs: MutableDocumentMap_,
      existenceStateChanged: DocumentKeySet_
    ): PersistencePromise[DocumentMap_] = js.native
    
    /**
      * Given a collection group, returns the next documents that follow the provided offset, along
      * with an updated batch ID.
      *
      * <p>The documents returned by this method are ordered by remote version from the provided
      * offset. If there are no more remote documents after the provided offset, documents with
      * mutations in order of batch id from the offset are returned. Since all documents in a batch are
      * returned together, the total number of documents returned can exceed {@code count}.
      *
      * @param transaction
      * @param collectionGroup The collection group for the documents.
      * @param offset The offset to index into.
      * @param count The number of documents to return
      * @return A LocalWriteResult with the documents that follow the provided offset and the last processed batch id.
      */
    def getNextDocuments(transaction: PersistenceTransaction, collectionGroup: String, offset: IndexOffset, count: Double): PersistencePromise[LocalWriteResult] = js.native
    
    /**
      * Gets the overlayed documents for the given document map, which will include
      * the local view of those documents and a `FieldMask` indicating which fields
      * are mutated locally, `null` if overlay is a Set or Delete mutation.
      */
    def getOverlayedDocuments(transaction: PersistenceTransaction, docs: MutableDocumentMap_): PersistencePromise[OverlayedDocumentMap] = js.native
    
    val indexManager: IndexManager = js.native
    
    val mutationQueue: MutationQueue = js.native
    
    /**
      * Fetches the overlays for {@code docs} and adds them to provided overlay map
      * if the map does not already contain an entry for the given document key.
      */
    /* private */ var populateOverlays: Any = js.native
    
    /* private */ var recalculateAndSaveOverlays: Any = js.native
    
    /**
      * Recalculates overlays by reading the documents from remote document cache
      * first, and saves them after they are calculated.
      */
    def recalculateAndSaveOverlaysForDocumentKeys(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[DocumentKeyMap[FieldMask | Null]] = js.native
    
    val remoteDocumentCache: RemoteDocumentCache = js.native
  }
}
