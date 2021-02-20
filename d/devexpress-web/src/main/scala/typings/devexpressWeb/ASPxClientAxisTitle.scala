package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisTitle class.
  */
@js.native
trait ASPxClientAxisTitle extends ASPxClientWebChartElement {
  
  /**
    * Gets the axis to which the axis title belongs.
    */
  var axis: ASPxClientAxisBase = js.native
  
  /**
    * Gets the text of the axis title.
    */
  var text: String = js.native
}
object ASPxClientAxisTitle {
  
  @scala.inline
  def apply(axis: ASPxClientAxisBase, chart: ASPxClientWebChart, text: String): ASPxClientAxisTitle = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisTitle]
  }
  
  @scala.inline
  implicit class ASPxClientAxisTitleMutableBuilder[Self <: ASPxClientAxisTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: ASPxClientAxisBase): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
