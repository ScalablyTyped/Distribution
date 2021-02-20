package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.SunburstChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSunburstChartFn extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: SunburstChart = js.native
}
object TypeofSunburstChartFn {
  
  @scala.inline
  def apply(Locale: js.Any, fn: SunburstChart): TypeofSunburstChartFn = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSunburstChartFn]
  }
  
  @scala.inline
  implicit class TypeofSunburstChartFnMutableBuilder[Self <: TypeofSunburstChartFn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: SunburstChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
