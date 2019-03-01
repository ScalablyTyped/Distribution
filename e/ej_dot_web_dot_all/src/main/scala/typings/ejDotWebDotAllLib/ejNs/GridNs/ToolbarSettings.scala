package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add custom toolbar items within the toolbar to perform any action in the grid
    * @Default {[]}
    */
  var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.undefined
  /** Gets or sets a value that indicates whether to enable toolbar in the grid.
    * @Default {false}
    */
  var showToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add the default editing actions as a toolbar items. See toolbarItems.
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolBarItems | java.lang.String]] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    customToolbarItems: js.Array[ToolbarSettingsCustomToolbarItem] = null,
    showToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarItems: js.Array[ToolBarItems | java.lang.String] = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (customToolbarItems != null) __obj.updateDynamic("customToolbarItems")(customToolbarItems)
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (toolbarItems != null) __obj.updateDynamic("toolbarItems")(toolbarItems)
    __obj.asInstanceOf[ToolbarSettings]
  }
}

