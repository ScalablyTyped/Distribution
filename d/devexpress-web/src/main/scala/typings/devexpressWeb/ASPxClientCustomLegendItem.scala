package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientCustomLegendItemOps[Self <: ASPxClientCustomLegendItem] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

