package typings.firebaseFirestore

import typings.firebaseFirestore.indexeddbLruDelegateMod.IndexedDbLruDelegate
import typings.firebaseFirestore.indexeddbSchemaMod.DbTargetDocument
import typings.firebaseFirestore.indexeddbSentinelsMod.DbTargetDocumentKey
import typings.firebaseFirestore.localSerializerMod.LocalSerializer
import typings.firebaseFirestore.lruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.persistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.simpleDbMod.SimpleDbStore
import typings.firebaseFirestore.targetCacheMod.TargetCache
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import typings.firebaseFirestore.typesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexeddbTargetCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/indexeddb_target_cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/indexeddb_target_cache", "IndexedDbTargetCache")
  @js.native
  open class IndexedDbTargetCache protected ()
    extends StObject
       with TargetCache {
    def this(referenceDelegate: IndexedDbLruDelegate, serializer: LocalSerializer) = this()
    
    /**
      * Looks up a TargetData entry by target ID.
      *
      * @param targetId - The target ID of the TargetData entry to look up.
      * @returns The cached TargetData entry, or null if the cache has no entry for
      * the target.
      */
    def getTargetDataForTarget(transaction: PersistenceTransaction, targetId: TargetId): PersistencePromise[TargetData | Null] = js.native
    
    /* private */ val referenceDelegate: Any = js.native
    
    /**
      * Drops any targets with sequence number less than or equal to the upper bound, excepting those
      * present in `activeTargetIds`. Document associations for the removed targets are also removed.
      * Returns the number of targets removed.
      */
    def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
    
    /* private */ var retrieveMetadata: Any = js.native
    
    /* private */ var saveMetadata: Any = js.native
    
    /* private */ var saveTargetData: Any = js.native
    
    /* private */ var serializer: Any = js.native
    
    /**
      * In-place updates the provided metadata to account for values in the given
      * TargetData. Saving is done separately. Returns true if there were any
      * changes to the metadata.
      */
    /* private */ var updateMetadataFromTargetData: Any = js.native
  }
  
  inline def documentTargetStore(txn: PersistenceTransaction): SimpleDbStore[DbTargetDocumentKey, DbTargetDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentTargetStore")(txn.asInstanceOf[js.Any]).asInstanceOf[SimpleDbStore[DbTargetDocumentKey, DbTargetDocument]]
}
