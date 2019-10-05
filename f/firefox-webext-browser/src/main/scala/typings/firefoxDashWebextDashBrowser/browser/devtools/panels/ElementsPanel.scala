package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.panels types */
/** Represents the Elements panel. */
@js.native
trait ElementsPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: WebExtEvent[js.Function0[Unit]] = js.native
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @param [callback] A callback invoked when the sidebar is created.
    */
  def createSidebarPane(title: String): Unit = js.native
  def createSidebarPane(title: String, callback: js.Function1[/* result */ ExtensionSidebarPane, Unit]): Unit = js.native
}

