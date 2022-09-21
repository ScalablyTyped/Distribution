package typings.firebaseFirestore

import typings.firebaseFirestore.localBundleCacheMod.BundleCache
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.srcCoreBundleMod.BundleMetadata
import typings.firebaseFirestore.srcCoreBundleMod.NamedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localIndexeddbBundleCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/indexeddb_bundle_cache", "IndexedDbBundleCache")
  @js.native
  open class IndexedDbBundleCache ()
    extends StObject
       with BundleCache {
    
    /**
      * Gets the saved `BundleMetadata` for a given `bundleId`, returns undefined
      * if no bundle metadata is found under the given id.
      */
    /* CompleteClass */
    override def getBundleMetadata(transaction: PersistenceTransaction, bundleId: String): PersistencePromise[js.UndefOr[BundleMetadata]] = js.native
    
    /**
      * Gets a saved `NamedQuery` for the given query name. Returns undefined if
      * no queries are found under the given name.
      */
    /* CompleteClass */
    override def getNamedQuery(transaction: PersistenceTransaction, queryName: String): PersistencePromise[js.UndefOr[NamedQuery]] = js.native
    
    /**
      * Saves a `BundleMetadata` from a bundle into local storage, using its id as
      * the persistent key.
      */
    /* CompleteClass */
    override def saveBundleMetadata(
      transaction: PersistenceTransaction,
      metadata: typings.firebaseFirestore.protosFirestoreBundleProtoMod.BundleMetadata
    ): PersistencePromise[Unit] = js.native
    
    /**
      * Saves a `NamedQuery` from a bundle, using its name as the persistent key.
      */
    /* CompleteClass */
    override def saveNamedQuery(
      transaction: PersistenceTransaction,
      query: typings.firebaseFirestore.protosFirestoreBundleProtoMod.NamedQuery
    ): PersistencePromise[Unit] = js.native
  }
}
