package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  /** Fires when user click on toolbar item in the toolbar.
    * @Default {empty}
    */
  var click: js.UndefOr[String] = js.native
  /** Add the custom icon groups to the toolbar.
    * @Default {empty}
    */
  var customGroups: js.UndefOr[js.Array[_]] = js.native
  /** Add the custom icon item to the toolbar.
    * @Default {empty}
    */
  var customItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the toolbar items.
    * @Default {ej.ReportViewer.ToolbarItems.All}
    */
  var items: js.UndefOr[ToolbarItems | String] = js.native
  /** Shows or hides the toolbar.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Shows or hides the tooltip of toolbar items.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
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
    def setClick(value: String): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setCustomGroupsVarargs(value: js.Any*): Self = this.set("customGroups", js.Array(value :_*))
    @scala.inline
    def setCustomGroups(value: js.Array[_]): Self = this.set("customGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomGroups: Self = this.set("customGroups", js.undefined)
    @scala.inline
    def setCustomItemsVarargs(value: js.Any*): Self = this.set("customItems", js.Array(value :_*))
    @scala.inline
    def setCustomItems(value: js.Array[_]): Self = this.set("customItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomItems: Self = this.set("customItems", js.undefined)
    @scala.inline
    def setItems(value: ToolbarItems | String): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setShowToolbar(value: Boolean): Self = this.set("showToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolbar: Self = this.set("showToolbar", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
  
}

