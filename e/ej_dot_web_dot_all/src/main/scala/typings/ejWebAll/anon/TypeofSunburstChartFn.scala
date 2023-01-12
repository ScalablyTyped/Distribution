package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.SunburstChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSunburstChartFn extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: SunburstChart
}
object TypeofSunburstChartFn {
  
  inline def apply(Locale: Any, fn: SunburstChart): TypeofSunburstChartFn = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSunburstChartFn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSunburstChartFn] (val x: Self) extends AnyVal {
    
    inline def setFn(value: SunburstChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
