package typings.firebaseFirestore.distInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentLocalCache_
  extends StObject
     with FirestoreLocalCache {
  
  /**
    * @internal
    */
  var _offlineComponentProvider: OfflineComponentProvider
  
  /**
    * @internal
    */
  var _onlineComponentProvider: OnlineComponentProvider
  
  var kind: persistent
}
object PersistentLocalCache_ {
  
  inline def apply(
    _offlineComponentProvider: OfflineComponentProvider,
    _onlineComponentProvider: OnlineComponentProvider
  ): PersistentLocalCache_ = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = "persistent")
    __obj.asInstanceOf[PersistentLocalCache_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentLocalCache_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: persistent): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def set_offlineComponentProvider(value: OfflineComponentProvider): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_onlineComponentProvider(value: OnlineComponentProvider): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
  }
}
