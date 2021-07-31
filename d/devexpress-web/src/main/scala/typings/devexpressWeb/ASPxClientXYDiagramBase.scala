package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the base class for all diagram classes, which have X and Y axes.
  */
trait ASPxClientXYDiagramBase
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the X-axis.
    */
  var axisX: ASPxClientAxisBase
  
  /**
    * Gets the Y-axis.
    */
  var axisY: ASPxClientAxisBase
}
object ASPxClientXYDiagramBase {
  
  @scala.inline
  def apply(axisX: ASPxClientAxisBase, axisY: ASPxClientAxisBase, chart: ASPxClientWebChart): ASPxClientXYDiagramBase = {
    val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagramBase]
  }
  
  @scala.inline
  implicit class ASPxClientXYDiagramBaseMutableBuilder[Self <: ASPxClientXYDiagramBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisX(value: ASPxClientAxisBase): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisY(value: ASPxClientAxisBase): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
  }
}
