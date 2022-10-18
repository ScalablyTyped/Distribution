package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLocalSerializerMod.LocalSerializer
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.MutationMap
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.OverlayMap
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelOverlayMod.Overlay
import typings.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalIndexeddbDocumentOverlayCacheMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_document_overlay_cache", "IndexedDbDocumentOverlayCache")
  @js.native
  open class IndexedDbDocumentOverlayCache protected ()
    extends StObject
       with DocumentOverlayCache {
    /**
      * @param serializer - The document serializer.
      * @param userId - The userId for which we are accessing overlays.
      */
    def this(serializer: LocalSerializer, userId: String) = this()
    
    /**
      * Gets the saved overlay mutation for the given document key.
      * Returns null if there is no overlay for that key.
      */
    /* CompleteClass */
    override def getOverlay(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Overlay | Null] = js.native
    
    /**
      * Gets the saved overlay mutation for the given document keys. Skips keys for
      * which there are no overlays.
      */
    /* CompleteClass */
    override def getOverlays(transaction: PersistenceTransaction, keys: js.Array[DocumentKey]): PersistencePromise[OverlayMap] = js.native
    
    /**
      * Returns all saved overlays for the given collection.
      *
      * @param transaction - The persistence transaction to use for this operation.
      * @param collection - The collection path to get the overlays for.
      * @param sinceBatchId - The minimum batch ID to filter by (exclusive).
      * Only overlays that contain a change past `sinceBatchId` are returned.
      * @returns Mapping of each document key in the collection to its overlay.
      */
    /* CompleteClass */
    override def getOverlaysForCollection(transaction: PersistenceTransaction, collection: ResourcePath, sinceBatchId: Double): PersistencePromise[OverlayMap] = js.native
    
    /**
      * Returns `count` overlays with a batch ID higher than `sinceBatchId` for the
      * provided collection group, processed by ascending batch ID. The method
      * always returns all overlays for a batch even if the last batch contains
      * more documents than the remaining limit.
      *
      * @param transaction - The persistence transaction used for this operation.
      * @param collectionGroup - The collection group to get the overlays for.
      * @param sinceBatchId - The minimum batch ID to filter by (exclusive).
      * Only overlays that contain a change past `sinceBatchId` are returned.
      * @param count - The number of overlays to return. Can be exceeded if the last
      * batch contains more entries.
      * @return Mapping of each document key in the collection group to its overlay.
      */
    /* CompleteClass */
    override def getOverlaysForCollectionGroup(transaction: PersistenceTransaction, collectionGroup: String, sinceBatchId: Double, count: Double): PersistencePromise[OverlayMap] = js.native
    
    /** Removes overlays for the given document keys and batch ID. */
    /* CompleteClass */
    override def removeOverlaysForBatchId(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_, batchId: Double): PersistencePromise[Unit] = js.native
    
    /* private */ var saveOverlay: Any = js.native
    
    /**
      * Saves the given document mutation map to persistence as overlays.
      * All overlays will have their largest batch id set to `largestBatchId`.
      */
    /* CompleteClass */
    override def saveOverlays(transaction: PersistenceTransaction, largestBatchId: Double, overlays: MutationMap): PersistencePromise[Unit] = js.native
    
    /* private */ val serializer: Any = js.native
    
    /* private */ val userId: Any = js.native
  }
  /* static members */
  object IndexedDbDocumentOverlayCache {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_document_overlay_cache", "IndexedDbDocumentOverlayCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forUser(serializer: LocalSerializer, user: User): IndexedDbDocumentOverlayCache = (^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(serializer.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[IndexedDbDocumentOverlayCache]
  }
}
