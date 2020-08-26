package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltip extends js.Object {
  var ignoreBounds: js.UndefOr[Boolean] = js.native
  var isHtml: js.UndefOr[Boolean] = js.native
  var showColorCode: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  var trigger: js.UndefOr[String] = js.native
}

object ChartTooltip {
  @scala.inline
  def apply(): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltip]
  }
  @scala.inline
  implicit class ChartTooltipOps[Self <: ChartTooltip] (val x: Self) extends AnyVal {
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
    def setIgnoreBounds(value: Boolean): Self = this.set("ignoreBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreBounds: Self = this.set("ignoreBounds", js.undefined)
    @scala.inline
    def setIsHtml(value: Boolean): Self = this.set("isHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHtml: Self = this.set("isHtml", js.undefined)
    @scala.inline
    def setShowColorCode(value: Boolean): Self = this.set("showColorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColorCode: Self = this.set("showColorCode", js.undefined)
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

