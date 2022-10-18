package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexeddbLruDelegateMod.IndexedDbLruDelegate
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalLruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalLruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalIndexeddbLruDelegateImplMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/indexeddb_lru_delegate_impl", "IndexedDbLruDelegateImpl")
  @js.native
  open class IndexedDbLruDelegateImpl protected ()
    extends StObject
       with IndexedDbLruDelegate {
    def this(db: Persistence, params: LruParams) = this()
    
    /** Notify the delegate that the given document was added to a target. */
    /* CompleteClass */
    override def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /* private */ val db: Any = js.native
    
    /**
      * Call provided function for each document in the cache that is 'orphaned'. Orphaned
      * means not a part of any target, so the only entry in the target-document index for
      * that document will be the sentinel row (targetId 0), which will also have the sequence
      * number for the last time the document was accessed.
      */
    /* private */ var forEachOrphanedDocument: Any = js.native
    
    /**
      * Enumerates sequence numbers for documents not associated with a target.
      * Note that this may include duplicate sequence numbers.
      */
    /* CompleteClass */
    override def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit] = js.native
    
    /** Enumerates all the targets in the TargetCache. */
    /* CompleteClass */
    override def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit] = js.native
    
    /* CompleteClass */
    override val garbageCollector: LruGarbageCollector = js.native
    
    /* CompleteClass */
    override def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
    
    /* CompleteClass */
    override def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
    
    /**
      * Returns true if anything would prevent this document from being garbage
      * collected, given that the document in question is not present in any
      * targets and has a sequence number less than or equal to the upper bound for
      * the collection run.
      */
    /* private */ var isPinned: Any = js.native
    
    /**
      * Notify the delegate that a document may no longer be part of any views or
      * have any mutations associated.
      */
    /* CompleteClass */
    override def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /* private */ var orphanedDocumentCount: Any = js.native
    
    /**
      * Removes all unreferenced documents from the cache that have a sequence
      * number less than or equal to the given `upperBound`.
      *
      * @returns the number of documents removed.
      */
    /* CompleteClass */
    override def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
    
    /** Notify the delegate that the given document was removed from a target. */
    /* CompleteClass */
    override def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
    
    /**
      * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
      * actually delete the target and associated data.
      */
    /* CompleteClass */
    override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
    
    /**
      * Removes all targets that have a sequence number less than or equal to
      * `upperBound`, and are not present in the `activeTargetIds` set.
      *
      * @returns the number of targets removed.
      */
    /* CompleteClass */
    override def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
    
    /** Notify the delegate that a limbo document was updated. */
    /* CompleteClass */
    override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  }
}
