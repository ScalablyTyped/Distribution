package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Allows the user to insert custom toolbar items.
    */
  var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.undefined
  /** Shows/hides the toolbar.
    * @Default {false}
    */
  var showToolbar: js.UndefOr[Boolean] = js.undefined
  /** Specifies the list of toolbar items to be rendered in TreeGrid toolbar
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolbarItems | String]] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    customToolbarItems: js.Array[ToolbarSettingsCustomToolbarItem] = null,
    showToolbar: js.UndefOr[Boolean] = js.undefined,
    toolbarItems: js.Array[ToolbarItems | String] = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (customToolbarItems != null) __obj.updateDynamic("customToolbarItems")(customToolbarItems)
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (toolbarItems != null) __obj.updateDynamic("toolbarItems")(toolbarItems)
    __obj.asInstanceOf[ToolbarSettings]
  }
}

