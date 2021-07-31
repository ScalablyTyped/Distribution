package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
trait ASPxClientAxisBase
  extends StObject
     with ASPxClientWebChartElementNamed {
  
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  var diagram: ASPxClientXYDiagramBase
  
  /**
    * Provides acess to the range of the axis coordinates.
    */
  var range: ASPxClientAxisRange
}
object ASPxClientAxisBase {
  
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange
  ): ASPxClientAxisBase = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisBase]
  }
  
  @scala.inline
  implicit class ASPxClientAxisBaseMutableBuilder[Self <: ASPxClientAxisBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagram(value: ASPxClientXYDiagramBase): Self = StObject.set(x, "diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: ASPxClientAxisRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
