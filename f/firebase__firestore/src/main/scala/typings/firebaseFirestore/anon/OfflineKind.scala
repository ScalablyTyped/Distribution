package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distInternalMod.OfflineComponentProvider
import typings.firebaseFirestore.distInternalMod.OnlineComponentProvider
import typings.firebaseFirestore.firebaseFirestoreStrings.memory
import typings.firebaseFirestore.firebaseFirestoreStrings.persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineKind extends StObject {
  
  var _offline: OfflineComponentProvider
  
  var _offlineKind: memory | persistent
  
  var _online: OnlineComponentProvider
}
object OfflineKind {
  
  inline def apply(
    _offline: OfflineComponentProvider,
    _offlineKind: memory | persistent,
    _online: OnlineComponentProvider
  ): OfflineKind = {
    val __obj = js.Dynamic.literal(_offline = _offline.asInstanceOf[js.Any], _offlineKind = _offlineKind.asInstanceOf[js.Any], _online = _online.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineKind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfflineKind] (val x: Self) extends AnyVal {
    
    inline def set_offline(value: OfflineComponentProvider): Self = StObject.set(x, "_offline", value.asInstanceOf[js.Any])
    
    inline def set_offlineKind(value: memory | persistent): Self = StObject.set(x, "_offlineKind", value.asInstanceOf[js.Any])
    
    inline def set_online(value: OnlineComponentProvider): Self = StObject.set(x, "_online", value.asInstanceOf[js.Any])
  }
}
