package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CustomLegendItem class.
  */
@js.native
trait ASPxClientCustomLegendItem extends ASPxClientWebChartElementNamed {
  
  /**
    * Returns the text displayed by the custom legend item.
    */
  var text: String = js.native
}
object ASPxClientCustomLegendItem {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, text: String): ASPxClientCustomLegendItem = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomLegendItem]
  }
  
  @scala.inline
  implicit class ASPxClientCustomLegendItemMutableBuilder[Self <: ASPxClientCustomLegendItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
