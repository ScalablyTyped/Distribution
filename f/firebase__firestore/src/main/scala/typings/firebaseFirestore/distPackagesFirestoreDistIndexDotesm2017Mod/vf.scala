package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.anon.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait vf extends StObject {
  
  var _offlineComponentProvider: Any
  
  var _onlineComponentProvider: Pa
  
  var kind: String
  
  def toJSON(): Kind
}
object vf {
  
  inline def apply(_offlineComponentProvider: Any, _onlineComponentProvider: Pa, kind: String, toJSON: () => Kind): vf = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], _onlineComponentProvider = _onlineComponentProvider.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[vf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vf] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Kind): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def set_offlineComponentProvider(value: Any): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_onlineComponentProvider(value: Pa): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
  }
}
