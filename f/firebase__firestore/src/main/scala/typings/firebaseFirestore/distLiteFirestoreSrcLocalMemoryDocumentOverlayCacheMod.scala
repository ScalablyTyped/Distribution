package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.MutationMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelCollectionsMod.OverlayMap
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelOverlayMod.Overlay
import typings.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalMemoryDocumentOverlayCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/memory_document_overlay_cache", "MemoryDocumentOverlayCache")
  @js.native
  open class MemoryDocumentOverlayCache ()
    extends StObject
       with DocumentOverlayCache {
    
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
    
    /* private */ var overlayByBatchId: Any = js.native
    
    /* private */ var overlays: Any = js.native
    
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
  }
}
