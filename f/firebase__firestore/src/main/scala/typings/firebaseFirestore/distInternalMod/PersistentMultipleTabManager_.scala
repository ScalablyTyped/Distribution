package typings.firebaseFirestore.distInternalMod

import typings.firebaseFirestore.anon.OmitPersistentCacheSettin
import typings.firebaseFirestore.firebaseFirestoreStrings.PersistentMultipleTab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentMultipleTabManager_
  extends StObject
     with PersistentTabManager {
  
  /**
    * @internal
    */
  def _initialize(settings: OmitPersistentCacheSettin): Unit
  
  /**
    * @internal
    */
  var _offlineComponentProvider: js.UndefOr[OfflineComponentProvider] = js.undefined
  
  /**
    * @internal
    */
  var _onlineComponentProvider: js.UndefOr[OnlineComponentProvider] = js.undefined
  
  var kind: PersistentMultipleTab
}
object PersistentMultipleTabManager_ {
  
  inline def apply(_initialize: OmitPersistentCacheSettin => Unit): PersistentMultipleTabManager_ = {
    val __obj = js.Dynamic.literal(_initialize = js.Any.fromFunction1(_initialize), kind = "PersistentMultipleTab")
    __obj.asInstanceOf[PersistentMultipleTabManager_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentMultipleTabManager_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: PersistentMultipleTab): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def set_initialize(value: OmitPersistentCacheSettin => Unit): Self = StObject.set(x, "_initialize", js.Any.fromFunction1(value))
    
    inline def set_offlineComponentProvider(value: OfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_offlineComponentProviderUndefined: Self = StObject.set(x, "_offlineComponentProvider", js.undefined)
    
    inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_onlineComponentProviderUndefined: Self = StObject.set(x, "_onlineComponentProvider", js.undefined)
  }
}
