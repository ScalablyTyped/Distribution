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

