package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Legend class.
  */
@js.native
trait ASPxClientLegend extends ASPxClientWebChartElement {
  /**
    * Returns a collection of custom legend items of the legend.
    */
  var customItems: js.Array[ASPxClientCustomLegendItem] = js.native
  /**
    * Returns the name of the legend.
    */
  var name: String = js.native
  /**
    * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
    */
  var useCheckBoxes: Boolean = js.native
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
  @scala.inline
  implicit class ASPxClientLegendOps[Self <: ASPxClientLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomItemsVarargs(value: ASPxClientCustomLegendItem*): Self = this.set("customItems", js.Array(value :_*))
    @scala.inline
    def setCustomItems(value: js.Array[ASPxClientCustomLegendItem]): Self = this.set("customItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCheckBoxes(value: Boolean): Self = this.set("useCheckBoxes", value.asInstanceOf[js.Any])
  }
  
}

