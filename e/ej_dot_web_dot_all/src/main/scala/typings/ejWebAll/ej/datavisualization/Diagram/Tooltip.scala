package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
  /** Aligns the tooltip around nodes/connectors
    */
  var alignment: js.UndefOr[TooltipAlignment] = js.native
  /** Sets the margin of the tooltip
    * @Default {{ left: 5, right: 5, top: 5, bottom: 5 }}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines whether the tooltip should be shown at the mouse position or around node.
    * @Default {ej.datavisualization.Diagram.RelativeMode.Object}
    */
  var relativeMode: js.UndefOr[RelativeMode | String] = js.native
  /** Sets the svg/html template to be bound with tooltip
    */
  var templateId: js.UndefOr[String] = js.native
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
    def setAlignment(value: TooltipAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setRelativeMode(value: RelativeMode | String): Self = this.set("relativeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeMode: Self = this.set("relativeMode", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
  
}

