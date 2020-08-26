package typings.ejWebAll.ej.datavisualization.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
  /** Options for customizing the border of the sunburst tooltip.
    */
  var border: js.UndefOr[TooltipBorder] = js.native
  /** Fill color for the sunburst tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the font of the tooltip.
    */
  var font: js.UndefOr[TooltipFont] = js.native
  /** Setting the format for the data displayed in the tooltip
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[String] = js.native
  /** Sets the opacity of the displayed tooltip
    * @Default {0.95}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Custom template to the tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** tooltip visibility of the Sunburst.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Tooltip {
  @scala.inline
  def apply(): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip]
  }
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
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
    def setBorder(value: TooltipBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: TooltipFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
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

