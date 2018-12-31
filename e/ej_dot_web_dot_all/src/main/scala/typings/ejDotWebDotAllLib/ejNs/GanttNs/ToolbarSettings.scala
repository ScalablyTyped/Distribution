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

