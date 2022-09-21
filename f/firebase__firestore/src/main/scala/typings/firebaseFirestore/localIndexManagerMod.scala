package typings.firebaseFirestore

import typings.firebaseFirestore.coreTargetMod.Target
import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.modelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.modelFieldIndexMod.IndexOffset
import typings.firebaseFirestore.modelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localIndexManagerMod {
  
  @js.native
  trait IndexManager extends StObject {
    
    /**
      * Adds a field path index.
      *
      * Values for this index are persisted via the index backfill, which runs
      * asynchronously in the background. Once the first values are written,
      * an index can be used to serve partial results for any matching queries.
      * Any unindexed portion of the database will continue to be served via
      * collection scons.
      */
    def addFieldIndex(transaction: PersistenceTransaction, index: FieldIndex): PersistencePromise[Unit] = js.native
    
    /**
      * Creates an index entry mapping the collectionId (last segment of the path)
      * to the parent path (either the containing document location or the empty
      * path for root-level collections). Index entries can be retrieved via
      * getCollectionParents().
      *
      * NOTE: Currently we don't remove index entries. If this ends up being an
      * issue we can devise some sort of GC strategy.
      */
    def addToCollectionParentIndex(transaction: PersistenceTransaction, collectionPath: ResourcePath): PersistencePromise[Unit] = js.native
    
    /** Removes the given field index and deletes all index values. */
    def deleteFieldIndex(transaction: PersistenceTransaction, index: FieldIndex): PersistencePromise[Unit] = js.native
    
    /**
      * Retrieves all parent locations containing the given collectionId, as a
      * list of paths (each path being either a document location or the empty
      * path for a root-level collection).
      */
    def getCollectionParents(transaction: PersistenceTransaction, collectionId: String): PersistencePromise[js.Array[ResourcePath]] = js.native
    
    /**
      * Returns the documents that match the given target based on the provided
      * index or `null` if the target does not have a matching index.
      */
    def getDocumentsMatchingTarget(transaction: PersistenceTransaction, target: Target): PersistencePromise[js.Array[DocumentKey] | Null] = js.native
    
    /** Returns all configured field indexes. */
    def getFieldIndexes(transaction: PersistenceTransaction): PersistencePromise[js.Array[FieldIndex]] = js.native
    /**
      * Returns a list of field indexes that correspond to the specified collection
      * group.
      *
      * @param collectionGroup The collection group to get matching field indexes
      * for.
      * @return A collection of field indexes for the specified collection group.
      */
    def getFieldIndexes(transaction: PersistenceTransaction, collectionGroup: String): PersistencePromise[js.Array[FieldIndex]] = js.native
    
    /**
      * Returns the type of index (if any) that can be used to serve the given
      * target.
      */
    def getIndexType(transaction: PersistenceTransaction, target: Target): PersistencePromise[IndexType] = js.native
    
    /**
      * Iterates over all field indexes that are used to serve the given target,
      * and returns the minimum offset of them all.
      */
    def getMinOffset(transaction: PersistenceTransaction, target: Target): PersistencePromise[IndexOffset] = js.native
    
    /** Returns the minimum offset for the given collection group. */
    def getMinOffsetFromCollectionGroup(transaction: PersistenceTransaction, collectionGroup: String): PersistencePromise[IndexOffset] = js.native
    
    /**
      * Returns the next collection group to update. Returns `null` if no group
      * exists.
      */
    def getNextCollectionGroupToUpdate(transaction: PersistenceTransaction): PersistencePromise[String | Null] = js.native
    
    /**
      * Sets the collection group's latest read time.
      *
      * This method updates the index offset for all field indices for the
      * collection group and increments their sequence number. Subsequent calls to
      * `getNextCollectionGroupToUpdate()` will return a different collection group
      * (unless only one collection group is configured).
      */
    def updateCollectionGroup(transaction: PersistenceTransaction, collectionGroup: String, offset: IndexOffset): PersistencePromise[Unit] = js.native
    
    /** Updates the index entries for the provided documents. */
    def updateIndexEntries(transaction: PersistenceTransaction, documents: DocumentMap_): PersistencePromise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
  */
  trait IndexType extends StObject
  object IndexType {
    
    /**
      * Indicates that a "full index" could be found for serving the target. A full
      * index is one which has a segment for every filter/orderBy in the target.
      */
    inline def FULL: `2` = 2.asInstanceOf[`2`]
    
    /** Indicates that no index could be found for serving the target. */
    inline def NONE: `0` = 0.asInstanceOf[`0`]
    
    /**
      * Indicates that only a "partial index" could be found for serving the
      * target. A partial index is one which does not have a segment for every
      * filter/orderBy in the target.
      */
    inline def PARTIAL: `1` = 1.asInstanceOf[`1`]
  }
}
