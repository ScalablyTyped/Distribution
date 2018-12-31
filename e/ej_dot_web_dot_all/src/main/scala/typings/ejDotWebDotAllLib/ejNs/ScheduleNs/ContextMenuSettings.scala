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

