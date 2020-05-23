package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the CustomLegendItem class.
  */
trait ASPxClientCustomLegendItem extends ASPxClientWebChartElementNamed {
  /**
    * Returns the text displayed by the custom legend item.
    */
  var text: String
}

object ASPxClientCustomLegendItem {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, text: String): ASPxClientCustomLegendItem = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomLegendItem]
  }
}

