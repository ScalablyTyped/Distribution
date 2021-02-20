package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPivotChart extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: PivotChart = js.native
}
object TypeofPivotChart {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotChart): TypeofPivotChart = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotChart]
  }
  
  @scala.inline
  implicit class TypeofPivotChartMutableBuilder[Self <: TypeofPivotChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
