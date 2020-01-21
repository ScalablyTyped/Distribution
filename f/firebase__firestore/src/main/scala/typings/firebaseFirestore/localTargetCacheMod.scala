package typings.firebaseFirestore

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTargetMod.Target
import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/target_cache", JSImport.Namespace)
@js.native
object localTargetCacheMod extends js.Object {
  @js.native
  trait TargetCache extends js.Object {
    /**
      * Adds the given document keys to cached query results of the given target
      * ID.
      *
      * Multi-Tab Note: This operation should only be called by the primary client.
      */
    def addMatchingKeys(transaction: PersistenceTransaction, keys: DocumentKeySet_, targetId: TargetId): PersistencePromise[Unit] = js.native
    /**
      * Adds an entry in the cache.
      *
      * The cache key is extracted from `targetData.target`. The key must not already
      * exist in the cache.
      *
      * @param targetData A TargetData instance to put in the cache.
      */
    def addTargetData(transaction: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
    /**
      * Returns a new target ID that is higher than any query in the cache. If
      * there are no queries in the cache, returns the first valid target ID.
      * Allocated target IDs are persisted and `allocateTargetId()` will never
      * return the same ID twice.
      */
    def allocateTargetId(transaction: PersistenceTransaction): PersistencePromise[TargetId] = js.native
    def containsKey(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
    /**
      * Call provided function with each `TargetData` that we have cached.
      */
    def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* q */ TargetData, Unit]): PersistencePromise[Unit] = js.native
    /**
      * @return The highest sequence number observed, including any that might be
      *         persisted on-disk.
      */
    def getHighestSequenceNumber(transaction: PersistenceTransaction): PersistencePromise[ListenSequenceNumber] = js.native
    /**
      * A global snapshot version representing the last consistent snapshot we
      * received from the backend. This is monotonically increasing and any
      * snapshots received from the backend prior to this version (e.g. for targets
      * resumed with a resume_token) should be suppressed (buffered) until the
      * backend has caught up to this snapshot version again. This prevents our
      * cache from ever going backwards in time.
      *
      * This is updated whenever our we get a TargetChange with a read_time and
      * empty target_ids.
      */
    def getLastRemoteSnapshotVersion(transaction: PersistenceTransaction): PersistencePromise[SnapshotVersion] = js.native
    /**
      * Returns the document keys that match the provided target ID.
      */
    def getMatchingKeysForTargetId(transaction: PersistenceTransaction, targetId: TargetId): PersistencePromise[DocumentKeySet_] = js.native
    /**
      * The number of targets currently in the cache.
      */
    def getTargetCount(transaction: PersistenceTransaction): PersistencePromise[Double] = js.native
    /**
      * Looks up a TargetData entry by target.
      *
      * @param target The query target corresponding to the entry to look up.
      * @return The cached TargetData entry, or null if the cache has no entry for
      * the target.
      */
    def getTargetData(transaction: PersistenceTransaction, target: Target): PersistencePromise[TargetData | Null] = js.native
    /**
      * Looks up a TargetData entry by target ID.
      *
      * @param targetId The target ID of the TargetData entry to look up.
      * @return The cached TargetData entry, or null if the cache has no entry for
      * the target.
      */
    def getTargetDataForTarget(txn: PersistenceTransaction, targetId: TargetId): PersistencePromise[TargetData | Null] = js.native
    /**
      * Removes the given document keys from the cached query results of the
      * given target ID.
      *
      * Multi-Tab Note: This operation should only be called by the primary client.
      */
    def removeMatchingKeys(transaction: PersistenceTransaction, keys: DocumentKeySet_, targetId: TargetId): PersistencePromise[Unit] = js.native
    /**
      * Removes all the keys in the query results of the given target ID.
      *
      * Multi-Tab Note: This operation should only be called by the primary client.
      */
    def removeMatchingKeysForTargetId(transaction: PersistenceTransaction, targetId: TargetId): PersistencePromise[Unit] = js.native
    /**
      * Removes the cached entry for the given target data. It is an error to remove
      * a target data that does not exist.
      *
      * Multi-Tab Note: This operation should only be called by the primary client.
      */
    def removeTargetData(transaction: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
    /**
      * Set the highest listen sequence number and optionally updates the
      * snapshot version of the last consistent snapshot received from the backend
      * (see getLastRemoteSnapshotVersion() for more details).
      *
      * @param highestListenSequenceNumber The new maximum listen sequence number.
      * @param lastRemoteSnapshotVersion The new snapshot version. Optional.
      */
    def setTargetsMetadata(transaction: PersistenceTransaction, highestListenSequenceNumber: Double): PersistencePromise[Unit] = js.native
    def setTargetsMetadata(
      transaction: PersistenceTransaction,
      highestListenSequenceNumber: Double,
      lastRemoteSnapshotVersion: SnapshotVersion
    ): PersistencePromise[Unit] = js.native
    /**
      * Updates an entry in the cache.
      *
      * The cache key is extracted from `targetData.target`. The entry must already
      * exist in the cache, and it will be replaced.
      * @param {TargetData} targetData The TargetData to be replaced into the cache.
      */
    def updateTargetData(transaction: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
  }
  
}

