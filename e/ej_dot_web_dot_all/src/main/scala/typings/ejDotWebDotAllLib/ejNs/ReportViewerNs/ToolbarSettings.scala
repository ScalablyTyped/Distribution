package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Fires when user click on toolbar item in the toolbar.
    * @Default {empty}
    */
  var click: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the toolbar items.
    * @Default {ej.ReportViewer.ToolbarItems.All}
    */
  var items: js.UndefOr[ToolbarItems | java.lang.String] = js.undefined
  /** Shows or hides the toolbar.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or hides the tooltip of toolbar items.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the toolbar template ID.
    * @Default {empty}
    */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    click: java.lang.String = null,
    items: ToolbarItems | java.lang.String = null,
    showToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    templateId: java.lang.String = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    __obj.asInstanceOf[ToolbarSettings]
  }
}

