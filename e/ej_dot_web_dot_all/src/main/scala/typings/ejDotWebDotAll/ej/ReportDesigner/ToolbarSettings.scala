package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Shows or hides the grouped items in the toolbar with the help of enum ej.ReportDesigner.ToolbarItems.
    * @Default {ej.ReportDesigner.ToolbarItems.All}
    */
  var items: js.UndefOr[ToolbarItems | String] = js.undefined
  /** Shows or hides the toolbar.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[Boolean] = js.undefined
  /** Specifies the toolbar template ID.
    * @Default {empty}
    */
  var templateId: js.UndefOr[String] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    items: ToolbarItems | String = null,
    showToolbar: js.UndefOr[Boolean] = js.undefined,
    templateId: String = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarSettings]
  }
}

