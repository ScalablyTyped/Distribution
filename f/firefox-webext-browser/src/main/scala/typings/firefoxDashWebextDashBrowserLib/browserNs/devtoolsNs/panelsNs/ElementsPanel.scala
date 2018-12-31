package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.panels types */
/** Represents the Elements panel. */
@js.native
trait ElementsPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]] = js.native
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @param [callback] A callback invoked when the sidebar is created.
    */
  def createSidebarPane(title: java.lang.String): scala.Unit = js.native
  def createSidebarPane(title: java.lang.String, callback: js.Function1[/* result */ ExtensionSidebarPane, scala.Unit]): scala.Unit = js.native
}

