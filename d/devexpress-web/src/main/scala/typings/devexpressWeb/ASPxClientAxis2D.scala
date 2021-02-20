package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Axis2D class.
  */
@js.native
trait ASPxClientAxis2D extends ASPxClientAxisBase {
  
  /**
    * Provides access to an axis title object.
    */
  var axisTitle: ASPxClientAxisTitle = js.native
  
  /**
    * Provides access to the collection of the axis constant lines.
    */
  var constantLines: js.Array[ASPxClientConstantLine] = js.native
  
  /**
    * Provides access to the axis strips collection.
    */
  var strips: js.Array[ASPxClientStrip] = js.native
}
object ASPxClientAxis2D {
  
  @scala.inline
  def apply(
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    constantLines: js.Array[ASPxClientConstantLine],
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange,
    strips: js.Array[ASPxClientStrip]
  ): ASPxClientAxis2D = {
    val __obj = js.Dynamic.literal(axisTitle = axisTitle.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], constantLines = constantLines.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], strips = strips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxis2D]
  }
  
  @scala.inline
  implicit class ASPxClientAxis2DMutableBuilder[Self <: ASPxClientAxis2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisTitle(value: ASPxClientAxisTitle): Self = StObject.set(x, "axisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantLines(value: js.Array[ASPxClientConstantLine]): Self = StObject.set(x, "constantLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantLinesVarargs(value: ASPxClientConstantLine*): Self = StObject.set(x, "constantLines", js.Array(value :_*))
    
    @scala.inline
    def setStrips(value: js.Array[ASPxClientStrip]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripsVarargs(value: ASPxClientStrip*): Self = StObject.set(x, "strips", js.Array(value :_*))
  }
}
