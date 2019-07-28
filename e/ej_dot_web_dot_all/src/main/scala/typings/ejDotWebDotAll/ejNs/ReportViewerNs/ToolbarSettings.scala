package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Fires when user click on toolbar item in the toolbar.
    * @Default {empty}
    */
  var click: js.UndefOr[String] = js.undefined
  /** Add the custom icon groups to the toolbar.
    * @Default {empty}
    */
  var customGroups: js.UndefOr[js.Array[_]] = js.undefined
  /** Add the custom icon item to the toolbar.
    * @Default {empty}
    */
  var customItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the toolbar items.
    * @Default {ej.ReportViewer.ToolbarItems.All}
    */
  var items: js.UndefOr[ToolbarItems | String] = js.undefined
  /** Shows or hides the toolbar.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[Boolean] = js.undefined
  /** Shows or hides the tooltip of toolbar items.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies the toolbar template ID.
    * @Default {empty}
    */
  var templateId: js.UndefOr[String] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    click: String = null,
    customGroups: js.Array[_] = null,
    customItems: js.Array[_] = null,
    items: ToolbarItems | String = null,
    showToolbar: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    templateId: String = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (customGroups != null) __obj.updateDynamic("customGroups")(customGroups)
    if (customItems != null) __obj.updateDynamic("customItems")(customItems)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    __obj.asInstanceOf[ToolbarSettings]
  }
}

