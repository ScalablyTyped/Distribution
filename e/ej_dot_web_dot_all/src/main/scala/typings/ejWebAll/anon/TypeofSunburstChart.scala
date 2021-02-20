package typings.ejWebAll.anon

import typings.ejWebAll.ej.SunburstChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSunburstChart extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: SunburstChart = js.native
}
object TypeofSunburstChart {
  
  @scala.inline
  def apply(Locale: js.Any, fn: SunburstChart): TypeofSunburstChart = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSunburstChart]
  }
  
  @scala.inline
  implicit class TypeofSunburstChartMutableBuilder[Self <: TypeofSunburstChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: SunburstChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
