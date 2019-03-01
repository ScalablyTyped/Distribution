package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  /** Allows the user to insert custom toolbar items.
    */
  var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.undefined
  /** Specifies the state of enabling or disabling toolbar
    * @Default {true}
    */
  var showToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the list of toolbar items to be rendered in Gantt toolbar
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolbarItems | java.lang.String]] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    customToolbarItems: js.Array[ToolbarSettingsCustomToolbarItem] = null,
    showToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarItems: js.Array[ToolbarItems | java.lang.String] = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (customToolbarItems != null) __obj.updateDynamic("customToolbarItems")(customToolbarItems)
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (toolbarItems != null) __obj.updateDynamic("toolbarItems")(toolbarItems)
    __obj.asInstanceOf[ToolbarSettings]
  }
}

