package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.anon.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sf_ extends StObject {
  
  var _offlineComponentProvider: Aa
  
  var kind: String
  
  def toJSON(): Kind
}
object Sf_ {
  
  inline def apply(_offlineComponentProvider: Aa, kind: String, toJSON: () => Kind): Sf_ = {
    val __obj = js.Dynamic.literal(_offlineComponentProvider = _offlineComponentProvider.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Sf_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sf_] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Kind): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def set_offlineComponentProvider(value: Aa): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
  }
}
