package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.firebaseFirestore.anon.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nf_ extends StObject {
  
  /**
    * @internal
    */ def _initialize(t: Any): Unit
  
  var _offlineComponentProvider: js.UndefOr[Ra] = js.undefined
  
  var _onlineComponentProvider: js.UndefOr[Pa] = js.undefined
  
  var forceOwnership: Any
  
  var kind: String
  
  def toJSON(): Kind
}
object Nf_ {
  
  inline def apply(_initialize: Any => Unit, forceOwnership: Any, kind: String, toJSON: () => Kind): Nf_ = {
    val __obj = js.Dynamic.literal(_initialize = js.Any.fromFunction1(_initialize), forceOwnership = forceOwnership.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Nf_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nf_] (val x: Self) extends AnyVal {
    
    inline def setForceOwnership(value: Any): Self = StObject.set(x, "forceOwnership", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Kind): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def set_initialize(value: Any => Unit): Self = StObject.set(x, "_initialize", js.Any.fromFunction1(value))
    
    inline def set_offlineComponentProvider(value: Ra): Self = StObject.set(x, "_offlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_offlineComponentProviderUndefined: Self = StObject.set(x, "_offlineComponentProvider", js.undefined)
    
    inline def set_onlineComponentProvider(value: Pa): Self = StObject.set(x, "_onlineComponentProvider", value.asInstanceOf[js.Any])
    
    inline def set_onlineComponentProviderUndefined: Self = StObject.set(x, "_onlineComponentProvider", js.undefined)
  }
}
