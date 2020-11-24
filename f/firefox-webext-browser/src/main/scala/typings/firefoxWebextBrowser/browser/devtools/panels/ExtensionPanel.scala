package typings.firefoxWebextBrowser.browser.devtools.panels

import typings.firefoxWebextBrowser.WebExtEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a panel created by extension. */
@js.native
trait ExtensionPanel extends js.Object {
  
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    * @deprecated Unsupported on Firefox at this time.
    */
  var createStatusBarButton: js.UndefOr[
    js.Function3[/* iconPath */ String, /* tooltipText */ String, /* disabled */ Boolean, Button]
  ] = js.native
  
  /** Fired when the user switches away from the panel. */
  var onHidden: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * Fired upon a search action (start of a new search, search result navigation, or search being canceled).
    * @param action Type of search action being performed.
    * @param [queryString] Query string (only for 'performSearch').
    * @deprecated Unsupported on Firefox at this time.
    */
  var onSearch: WebExtEvent[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]] = js.native
  
  /**
    * Fired when the user switches to the panel.
    * @param window The JavaScript `window` object of panel's page.
    */
  var onShown: WebExtEvent[js.Function1[/* window */ Window, Unit]] = js.native
}
object ExtensionPanel {
  
  @scala.inline
  def apply(
    onHidden: WebExtEvent[js.Function0[Unit]],
    onSearch: WebExtEvent[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]],
    onShown: WebExtEvent[js.Function1[/* window */ Window, Unit]]
  ): ExtensionPanel = {
    val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPanel]
  }
  
  @scala.inline
  implicit class ExtensionPanelOps[Self <: ExtensionPanel] (val x: Self) extends AnyVal {
    
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
    def setOnHidden(value: WebExtEvent[js.Function0[Unit]]): Self = this.set("onHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearch(value: WebExtEvent[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]]): Self = this.set("onSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShown(value: WebExtEvent[js.Function1[/* window */ Window, Unit]]): Self = this.set("onShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateStatusBarButton(value: (/* iconPath */ String, /* tooltipText */ String, /* disabled */ Boolean) => Button): Self = this.set("createStatusBarButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCreateStatusBarButton: Self = this.set("createStatusBarButton", js.undefined)
  }
}
