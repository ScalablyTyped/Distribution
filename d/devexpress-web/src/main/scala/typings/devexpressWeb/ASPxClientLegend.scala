package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Legend class.
  */
trait ASPxClientLegend extends ASPxClientWebChartElement {
  /**
    * Returns a collection of custom legend items of the legend.
    */
  var customItems: js.Array[ASPxClientCustomLegendItem]
  /**
    * Returns the name of the legend.
    */
  var name: String
  /**
    * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
    */
  var useCheckBoxes: Boolean
}

object ASPxClientLegend {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    customItems: js.Array[ASPxClientCustomLegendItem],
    name: String,
    useCheckBoxes: Boolean
  ): ASPxClientLegend = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], customItems = customItems.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], useCheckBoxes = useCheckBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLegend]
  }
}

