package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Sources panel. */
trait SourcesPanel extends js.Object {
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @deprecated Unsupported on Firefox at this time.
    */
  var createSidebarPane: js.UndefOr[js.Function1[/* title */ String, js.Promise[ExtensionSidebarPane]]] = js.undefined
  /**
    * Fired when an object is selected in the panel.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onSelectionChanged: WebExtEvent[js.Function0[Unit]]
}

object SourcesPanel {
  @scala.inline
  def apply(
    onSelectionChanged: WebExtEvent[js.Function0[Unit]],
    createSidebarPane: /* title */ String => js.Promise[ExtensionSidebarPane] = null
  ): SourcesPanel = {
    val __obj = js.Dynamic.literal(onSelectionChanged = onSelectionChanged)
    if (createSidebarPane != null) __obj.updateDynamic("createSidebarPane")(js.Any.fromFunction1(createSidebarPane))
    __obj.asInstanceOf[SourcesPanel]
  }
}

