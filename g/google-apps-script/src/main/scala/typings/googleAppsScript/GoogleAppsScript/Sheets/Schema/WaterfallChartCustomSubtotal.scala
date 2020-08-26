package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallChartCustomSubtotal extends js.Object {
  var dataIsSubtotal: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var subtotalIndex: js.UndefOr[Double] = js.native
}

object WaterfallChartCustomSubtotal {
  @scala.inline
  def apply(): WaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartCustomSubtotal]
  }
  @scala.inline
  implicit class WaterfallChartCustomSubtotalOps[Self <: WaterfallChartCustomSubtotal] (val x: Self) extends AnyVal {
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
    def setDataIsSubtotal(value: Boolean): Self = this.set("dataIsSubtotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIsSubtotal: Self = this.set("dataIsSubtotal", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSubtotalIndex(value: Double): Self = this.set("subtotalIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotalIndex: Self = this.set("subtotalIndex", js.undefined)
  }
  
}

