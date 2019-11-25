package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.panels types */
/** Represents the Elements panel. */
trait ElementsPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: WebExtEvent[js.Function0[Unit]]
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    */
  def createSidebarPane(title: String): js.Promise[ExtensionSidebarPane]
}

object ElementsPanel {
  @scala.inline
  def apply(
    createSidebarPane: String => js.Promise[ExtensionSidebarPane],
    onSelectionChanged: WebExtEvent[js.Function0[Unit]]
  ): ElementsPanel = {
    val __obj = js.Dynamic.literal(createSidebarPane = js.Any.fromFunction1(createSidebarPane), onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementsPanel]
  }
}

