package typings.flot

import typings.flot.jquery.flot.dataSeries
import typings.flot.jquery.flot.plotOptions
import typings.flot.jquery.flot.plotStatic
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[Any | dataSeries]): typings.flot.jquery.flot.plot
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[Any | dataSeries], options: plotOptions): typings.flot.jquery.flot.plot
  @JSName("plot")
  var plot_Original: plotStatic
}
object JQueryStatic {
  
  inline def apply(plot: plotStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(plot = plot.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setPlot(value: plotStatic): Self = StObject.set(x, "plot", value.asInstanceOf[js.Any])
  }
}
