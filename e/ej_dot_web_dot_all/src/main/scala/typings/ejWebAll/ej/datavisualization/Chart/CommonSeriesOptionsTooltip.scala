package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSeriesOptionsTooltip extends js.Object {
  /** Options for customizing the border of the tooltip.
    */
  var border: js.UndefOr[CommonSeriesOptionsTooltipBorder] = js.native
  /** Specifies the duration, the tooltip has to be displayed.
    * @Default {500ms}
    */
  var duration: js.UndefOr[String] = js.native
  /** Enables/disables the animation of the tooltip when moving from one point to other.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Background color of the tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Format of the tooltip content.
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[String] = js.native
  /** Opacity of the tooltip.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Customize the corner radius of the tooltip rectangle.
    * @Default {0}
    */
  var rx: js.UndefOr[Double] = js.native
  /** Customize the corner radius of the tooltip rectangle.
    * @Default {0}
    */
  var ry: js.UndefOr[Double] = js.native
  /** Custom template to format the tooltip content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Controls the visibility of the tooltip.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object CommonSeriesOptionsTooltip {
  @scala.inline
  def apply(): CommonSeriesOptionsTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsTooltip]
  }
  @scala.inline
  implicit class CommonSeriesOptionsTooltipOps[Self <: CommonSeriesOptionsTooltip] (val x: Self) extends AnyVal {
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
    def setBorder(value: CommonSeriesOptionsTooltipBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

