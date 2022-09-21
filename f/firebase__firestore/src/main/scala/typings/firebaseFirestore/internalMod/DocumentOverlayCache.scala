package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to read and write document overlays.
  *
  * An overlay is a saved mutation, that gives a local view of a document when
  * applied to the remote version of the document.
  *
  * Each overlay stores the largest batch ID that is included in the overlay,
  * which allows us to remove the overlay once all batches leading up to it have
  * been acknowledged.
  */
trait DocumentOverlayCache extends StObject {
  
  /**
    * Gets the saved overlay mutation for the given document key.
    * Returns null if there is no overlay for that key.
    */
  def getOverlay(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Overlay | Null]
  
  /**
    * Gets the saved overlay mutation for the given document keys. Skips keys for
    * which there are no overlays.
    */
  def getOverlays(transaction: PersistenceTransaction, keys: js.Array[DocumentKey]): PersistencePromise[OverlayMap]
  
  /**
    * Returns all saved overlays for the given collection.
    *
    * @param transaction - The persistence transaction to use for this operation.
    * @param collection - The collection path to get the overlays for.
    * @param sinceBatchId - The minimum batch ID to filter by (exclusive).
    * Only overlays that contain a change past `sinceBatchId` are returned.
    * @returns Mapping of each document key in the collection to its overlay.
    */
  def getOverlaysForCollection(transaction: PersistenceTransaction, collection: ResourcePath, sinceBatchId: Double): PersistencePromise[OverlayMap]
  
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
  def getOverlaysForCollectionGroup(transaction: PersistenceTransaction, collectionGroup: String, sinceBatchId: Double, count: Double): PersistencePromise[OverlayMap]
  
  /** Removes overlays for the given document keys and batch ID. */
  def removeOverlaysForBatchId(transaction: PersistenceTransaction, documentKeys: DocumentKeySet, batchId: Double): PersistencePromise[Unit]
  
  /**
    * Saves the given document mutation map to persistence as overlays.
    * All overlays will have their largest batch id set to `largestBatchId`.
    */
  def saveOverlays(transaction: PersistenceTransaction, largestBatchId: Double, overlays: MutationMap): PersistencePromise[Unit]
}
object DocumentOverlayCache {
  
  inline def apply(
    getOverlay: (PersistenceTransaction, DocumentKey) => PersistencePromise[Overlay | Null],
    getOverlays: (PersistenceTransaction, js.Array[DocumentKey]) => PersistencePromise[OverlayMap],
    getOverlaysForCollection: (PersistenceTransaction, ResourcePath, Double) => PersistencePromise[OverlayMap],
    getOverlaysForCollectionGroup: (PersistenceTransaction, String, Double, Double) => PersistencePromise[OverlayMap],
    removeOverlaysForBatchId: (PersistenceTransaction, DocumentKeySet, Double) => PersistencePromise[Unit],
    saveOverlays: (PersistenceTransaction, Double, MutationMap) => PersistencePromise[Unit]
  ): DocumentOverlayCache = {
    val __obj = js.Dynamic.literal(getOverlay = js.Any.fromFunction2(getOverlay), getOverlays = js.Any.fromFunction2(getOverlays), getOverlaysForCollection = js.Any.fromFunction3(getOverlaysForCollection), getOverlaysForCollectionGroup = js.Any.fromFunction4(getOverlaysForCollectionGroup), removeOverlaysForBatchId = js.Any.fromFunction3(removeOverlaysForBatchId), saveOverlays = js.Any.fromFunction3(saveOverlays))
    __obj.asInstanceOf[DocumentOverlayCache]
  }
  
  extension [Self <: DocumentOverlayCache](x: Self) {
    
    inline def setGetOverlay(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Overlay | Null]): Self = StObject.set(x, "getOverlay", js.Any.fromFunction2(value))
    
    inline def setGetOverlays(value: (PersistenceTransaction, js.Array[DocumentKey]) => PersistencePromise[OverlayMap]): Self = StObject.set(x, "getOverlays", js.Any.fromFunction2(value))
    
    inline def setGetOverlaysForCollection(value: (PersistenceTransaction, ResourcePath, Double) => PersistencePromise[OverlayMap]): Self = StObject.set(x, "getOverlaysForCollection", js.Any.fromFunction3(value))
    
    inline def setGetOverlaysForCollectionGroup(value: (PersistenceTransaction, String, Double, Double) => PersistencePromise[OverlayMap]): Self = StObject.set(x, "getOverlaysForCollectionGroup", js.Any.fromFunction4(value))
    
    inline def setRemoveOverlaysForBatchId(value: (PersistenceTransaction, DocumentKeySet, Double) => PersistencePromise[Unit]): Self = StObject.set(x, "removeOverlaysForBatchId", js.Any.fromFunction3(value))
    
    inline def setSaveOverlays(value: (PersistenceTransaction, Double, MutationMap) => PersistencePromise[Unit]): Self = StObject.set(x, "saveOverlays", js.Any.fromFunction3(value))
  }
}
