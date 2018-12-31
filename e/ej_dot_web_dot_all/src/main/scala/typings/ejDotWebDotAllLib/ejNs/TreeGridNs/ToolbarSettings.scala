package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  var showToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the list of toolbar items to be rendered in TreeGrid toolbar
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolbarItems | java.lang.String]] = js.undefined
}

