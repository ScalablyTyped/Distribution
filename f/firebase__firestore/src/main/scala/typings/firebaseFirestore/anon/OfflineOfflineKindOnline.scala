package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPrivateMod.OfflineComponentProvider
import typings.firebaseFirestore.distPrivateMod.OnlineComponentProvider
import typings.firebaseFirestore.firebaseFirestoreStrings.memory
import typings.firebaseFirestore.firebaseFirestoreStrings.persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineOfflineKindOnline extends StObject {
  
  var _offline: OfflineComponentProvider
  
  var _offlineKind: memory | persistent
  
  var _online: OnlineComponentProvider
}
object OfflineOfflineKindOnline {
  
  inline def apply(
    _offline: OfflineComponentProvider,
    _offlineKind: memory | persistent,
    _online: OnlineComponentProvider
  ): OfflineOfflineKindOnline = {
    val __obj = js.Dynamic.literal(_offline = _offline.asInstanceOf[js.Any], _offlineKind = _offlineKind.asInstanceOf[js.Any], _online = _online.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOfflineKindOnline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfflineOfflineKindOnline] (val x: Self) extends AnyVal {
    
    inline def set_offline(value: OfflineComponentProvider): Self = StObject.set(x, "_offline", value.asInstanceOf[js.Any])
    
    inline def set_offlineKind(value: memory | persistent): Self = StObject.set(x, "_offlineKind", value.asInstanceOf[js.Any])
    
    inline def set_online(value: OnlineComponentProvider): Self = StObject.set(x, "_online", value.asInstanceOf[js.Any])
  }
}
