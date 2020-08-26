package typings.firefoxWebextBrowser.browser.devtools.panels

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Sources panel. */
@js.native
trait SourcesPanel extends js.Object {
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @deprecated Unsupported on Firefox at this time.
    */
  var createSidebarPane: js.UndefOr[js.Function1[/* title */ String, js.Promise[ExtensionSidebarPane]]] = js.native
  /**
    * Fired when an object is selected in the panel.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onSelectionChanged: WebExtEvent[js.Function0[Unit]] = js.native
}

object SourcesPanel {
  @scala.inline
  def apply(onSelectionChanged: WebExtEvent[js.Function0[Unit]]): SourcesPanel = {
    val __obj = js.Dynamic.literal(onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesPanel]
  }
  @scala.inline
  implicit class SourcesPanelOps[Self <: SourcesPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnSelectionChanged(value: WebExtEvent[js.Function0[Unit]]): Self = this.set("onSelectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateSidebarPane(value: /* title */ String => js.Promise[ExtensionSidebarPane]): Self = this.set("createSidebarPane", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateSidebarPane: Self = this.set("createSidebarPane", js.undefined)
  }
  
}

