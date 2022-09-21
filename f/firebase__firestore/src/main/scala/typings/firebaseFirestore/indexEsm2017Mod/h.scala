package typings.firebaseFirestore.indexEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait h
  extends StObject
     with Oh {
  
  def _apply(t: Any): Ea
  
  var ga: Any
  
  var ma: Any
  
  var `type`: String
  
  var wa: Any
}
object h {
  
  inline def apply(_apply: Any => Ea, ga: Any, ma: Any, `type`: String, wa: Any): h = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply), ga = ga.asInstanceOf[js.Any], ma = ma.asInstanceOf[js.Any], wa = wa.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[h]
  }
  
  extension [Self <: h](x: Self) {
    
    inline def setGa(value: Any): Self = StObject.set(x, "ga", value.asInstanceOf[js.Any])
    
    inline def setMa(value: Any): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWa(value: Any): Self = StObject.set(x, "wa", value.asInstanceOf[js.Any])
    
    inline def set_apply(value: Any => Ea): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
