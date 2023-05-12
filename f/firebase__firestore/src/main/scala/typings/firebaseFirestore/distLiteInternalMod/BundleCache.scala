package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides interfaces to save and read Firestore bundles.
  */
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
  def saveBundleMetadata(transaction: PersistenceTransaction, metadata: BundleMetadata2): PersistencePromise[Unit]
  
  /**
    * Saves a `NamedQuery` from a bundle, using its name as the persistent key.
    */
  def saveNamedQuery(transaction: PersistenceTransaction, query: NamedQuery2): PersistencePromise[Unit]
}
object BundleCache {
  
  inline def apply(
    getBundleMetadata: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[BundleMetadata]],
    getNamedQuery: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[NamedQuery]],
    saveBundleMetadata: (PersistenceTransaction, BundleMetadata2) => PersistencePromise[Unit],
    saveNamedQuery: (PersistenceTransaction, NamedQuery2) => PersistencePromise[Unit]
  ): BundleCache = {
    val __obj = js.Dynamic.literal(getBundleMetadata = js.Any.fromFunction2(getBundleMetadata), getNamedQuery = js.Any.fromFunction2(getNamedQuery), saveBundleMetadata = js.Any.fromFunction2(saveBundleMetadata), saveNamedQuery = js.Any.fromFunction2(saveNamedQuery))
    __obj.asInstanceOf[BundleCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleCache] (val x: Self) extends AnyVal {
    
    inline def setGetBundleMetadata(value: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[BundleMetadata]]): Self = StObject.set(x, "getBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setGetNamedQuery(value: (PersistenceTransaction, String) => PersistencePromise[js.UndefOr[NamedQuery]]): Self = StObject.set(x, "getNamedQuery", js.Any.fromFunction2(value))
    
    inline def setSaveBundleMetadata(value: (PersistenceTransaction, BundleMetadata2) => PersistencePromise[Unit]): Self = StObject.set(x, "saveBundleMetadata", js.Any.fromFunction2(value))
    
    inline def setSaveNamedQuery(value: (PersistenceTransaction, NamedQuery2) => PersistencePromise[Unit]): Self = StObject.set(x, "saveNamedQuery", js.Any.fromFunction2(value))
  }
}
