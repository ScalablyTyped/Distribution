package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofChart extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Chart = js.native
}
object TypeofChart {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Chart): TypeofChart = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChart]
  }
  
  @scala.inline
  implicit class TypeofChartMutableBuilder[Self <: TypeofChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Chart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
