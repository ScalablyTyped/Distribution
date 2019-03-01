package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettings extends js.Object {
  /** When set to true, enables the context menu options available for the Schedule cells and appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains all the default context menu options that are applicable for both Schedule cells and appointments. It also supports adding custom menu items to cells or appointment
    * collection.
    */
  var menuItems: js.UndefOr[ContextMenuSettingsMenuItems] = js.undefined
}

object ContextMenuSettings {
  @scala.inline
  def apply(enable: js.UndefOr[scala.Boolean] = js.undefined, menuItems: ContextMenuSettingsMenuItems = null): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    __obj.asInstanceOf[ContextMenuSettings]
  }
}

