package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  /** Shows or hides the grouped items in the toolbar with the help of enum ej.ReportDesigner.ToolbarItems.
    * @Default {ej.ReportDesigner.ToolbarItems.All}
    */
  var items: js.UndefOr[ToolbarItems | String] = js.native
  /** Shows or hides the toolbar.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Specifies the toolbar template ID.
    * @Default {empty}
    */
  var templateId: js.UndefOr[String] = js.native
}

object ToolbarSettings {
  @scala.inline
  def apply(): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettings]
  }
  @scala.inline
  implicit class ToolbarSettingsOps[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
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
    def setItems(value: ToolbarItems | String): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setShowToolbar(value: Boolean): Self = this.set("showToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolbar: Self = this.set("showToolbar", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
  
}

