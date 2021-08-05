package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ahei extends StObject {
  
  var a_hei: Double
  
  var a_wid: Double
  
  var max_h: Double
  
  var max_ratio: Double
  
  var max_w: Double
  
  var min_ratio: Double
  
  var t_hei: Double
  
  var t_wid: Double
}
object Ahei {
  
  inline def apply(
    a_hei: Double,
    a_wid: Double,
    max_h: Double,
    max_ratio: Double,
    max_w: Double,
    min_ratio: Double,
    t_hei: Double,
    t_wid: Double
  ): Ahei = {
    val __obj = js.Dynamic.literal(a_hei = a_hei.asInstanceOf[js.Any], a_wid = a_wid.asInstanceOf[js.Any], max_h = max_h.asInstanceOf[js.Any], max_ratio = max_ratio.asInstanceOf[js.Any], max_w = max_w.asInstanceOf[js.Any], min_ratio = min_ratio.asInstanceOf[js.Any], t_hei = t_hei.asInstanceOf[js.Any], t_wid = t_wid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ahei]
  }
  
  extension [Self <: Ahei](x: Self) {
    
    inline def setA_hei(value: Double): Self = StObject.set(x, "a_hei", value.asInstanceOf[js.Any])
    
    inline def setA_wid(value: Double): Self = StObject.set(x, "a_wid", value.asInstanceOf[js.Any])
    
    inline def setMax_h(value: Double): Self = StObject.set(x, "max_h", value.asInstanceOf[js.Any])
    
    inline def setMax_ratio(value: Double): Self = StObject.set(x, "max_ratio", value.asInstanceOf[js.Any])
    
    inline def setMax_w(value: Double): Self = StObject.set(x, "max_w", value.asInstanceOf[js.Any])
    
    inline def setMin_ratio(value: Double): Self = StObject.set(x, "min_ratio", value.asInstanceOf[js.Any])
    
    inline def setT_hei(value: Double): Self = StObject.set(x, "t_hei", value.asInstanceOf[js.Any])
    
    inline def setT_wid(value: Double): Self = StObject.set(x, "t_wid", value.asInstanceOf[js.Any])
  }
}
