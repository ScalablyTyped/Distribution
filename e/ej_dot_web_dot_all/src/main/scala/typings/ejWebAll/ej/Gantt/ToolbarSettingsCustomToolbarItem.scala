package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettingsCustomToolbarItem extends js.Object {
  /** Allows the user to insert the custom icons in toolbar using script templates. Using this property we can bind HTML elements and other EJ controls to Gantt toolbar.
    */
  var templateID: js.UndefOr[String] = js.native
  /** Allows the user to insert the custom icons in toolbar using CSS class name selector.
    */
  var text: js.UndefOr[String] = js.native
  /** Allows the user to display custom tooltip text for Gantt custom toolbar items.
    */
  var tooltipText: js.UndefOr[String] = js.native
}

object ToolbarSettingsCustomToolbarItem {
  @scala.inline
  def apply(): ToolbarSettingsCustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
  }
  @scala.inline
  implicit class ToolbarSettingsCustomToolbarItemOps[Self <: ToolbarSettingsCustomToolbarItem] (val x: Self) extends AnyVal {
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
    def setTemplateID(value: String): Self = this.set("templateID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateID: Self = this.set("templateID", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTooltipText(value: String): Self = this.set("tooltipText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipText: Self = this.set("tooltipText", js.undefined)
  }
  
}

