package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the CustomLegendItem class.
  */
trait ASPxClientCustomLegendItem extends ASPxClientWebChartElementNamed {
  /**
    * Returns the text displayed by the custom legend item.
    * Value: A string value that specifies legend item text.
    */
  var text: java.lang.String
}

object ASPxClientCustomLegendItem {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: java.lang.String, text: java.lang.String): ASPxClientCustomLegendItem = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, text = text)
  
    __obj.asInstanceOf[ASPxClientCustomLegendItem]
  }
}

