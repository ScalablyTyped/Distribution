package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.firestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.packagesFirestoreSrcCoreBundleMod.BundleMetadata
import typings.firebaseFirestore.packagesFirestoreSrcCoreBundleMod.NamedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcLocalBundleCacheMod {
  
  trait BundleCache extends StObject {
    
    /**
      * Gets the saved `BundleMetadata` for a given `bundleId`, returns undefined
      * if no bundle metadata is found under the given id.
      */
    def getBundleMetadata(transaction: PersistenceTransaction, bundleId: String): PersistencePromise[js.UndefOr[BundleMetadata]]
    
    /**
      * Gets a saved `NamedQuery` for the given query name. Returns undefined if
      * no queries are found under the given name.
      */
    def getNamedQuery(transaction: PersistenceTransaction, queryName: String): PersistencePromise[js.UndefOr[NamedQuery]]
    
    /**
      * Saves a `BundleMetadata` from a bundle into local storage, using its id as
      * the persistent key.
      */
    def saveBundleMetadata(
      transaction: PersistenceTransaction,
      metadata: typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
    ): PersistencePromise[Unit]
    
    /**
      * Saves a `NamedQuery` from a bundle, using its name as the persistent key.
      */
    def saveNamedQuery(
      transaction: PersistenceTransaction,
      query: typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.NamedQuery
    ): PersistencePromise[Unit]
  }
  object BundleCache {
    
    inline def apply(
      getBundleMetadata: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[BundleMetadata]],
      getNamedQuery: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[NamedQuery]],
      saveBundleMetadata: (PersistenceTransaction, typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata) => PersistencePromise[Unit],
      saveNamedQuery: (PersistenceTransaction, typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.NamedQuery) => PersistencePromise[Unit]
    ): BundleCache = {
      val __obj = js.Dynamic.literal(getBundleMetadata = js.Any.fromFunction2(getBundleMetadata), getNamedQuery = js.Any.fromFunction2(getNamedQuery), saveBundleMetadata = js.Any.fromFunction2(saveBundleMetadata), saveNamedQuery = js.Any.fromFunction2(saveNamedQuery))
      __obj.asInstanceOf[BundleCache]
    }
    
    extension [Self <: BundleCache](x: Self) {
      
      inline def setGetBundleMetadata(value: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[BundleMetadata]]): Self = StObject.set(x, "getBundleMetadata", js.Any.fromFunction2(value))
      
      inline def setGetNamedQuery(value: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[NamedQuery]]): Self = StObject.set(x, "getNamedQuery", js.Any.fromFunction2(value))
      
      inline def setSaveBundleMetadata(
        value: (PersistenceTransaction, typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata) => PersistencePromise[Unit]
      ): Self = StObject.set(x, "saveBundleMetadata", js.Any.fromFunction2(value))
      
      inline def setSaveNamedQuery(
        value: (PersistenceTransaction, typings.firebaseFirestore.firestoreSrcProtosFirestoreBundleProtoMod.NamedQuery) => PersistencePromise[Unit]
      ): Self = StObject.set(x, "saveNamedQuery", js.Any.fromFunction2(value))
    }
  }
}
