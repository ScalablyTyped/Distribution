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

