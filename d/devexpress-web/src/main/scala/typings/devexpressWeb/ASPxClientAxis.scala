package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Axis class.
  */
trait ASPxClientAxis
  extends StObject
     with ASPxClientAxis2D {
  
  /**
    * Gets a value indicating whether the axis is reversed.
    */
  var reverse: Boolean
}
object ASPxClientAxis {
  
  @scala.inline
  def apply(
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    constantLines: js.Array[ASPxClientConstantLine],
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange,
    reverse: Boolean,
    strips: js.Array[ASPxClientStrip]
  ): ASPxClientAxis = {
    val __obj = js.Dynamic.literal(axisTitle = axisTitle.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], constantLines = constantLines.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], strips = strips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxis]
  }
  
  @scala.inline
  implicit class ASPxClientAxisMutableBuilder[Self <: ASPxClientAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
  }
}
