package typings.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCreateData extends js.Object {
  
  /** Allow scripts to close the window. */
  var allowScriptsToClose: js.UndefOr[Boolean] = js.native
  
  /** The CookieStoreId to use for all tabs that were created when the window is opened. */
  var cookieStoreId: js.UndefOr[String] = js.native
  
  /**
    * If true, opens an active window. If false, opens an inactive window.
    * @deprecated Unsupported on Firefox at this time.
    */
  var focused: js.UndefOr[Boolean] = js.native
  
  /**
    * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Whether the new window should be an incognito window. */
  var incognito: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of pixels to position the new window from the left edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[WindowState] = js.native
  
  /** The id of the tab for which you want to adopt to the new window. */
  var tabId: js.UndefOr[Double] = js.native
  
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[String] = js.native
  
  /**
    * The number of pixels to position the new window from the top edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
    */
  var `type`: js.UndefOr[CreateType] = js.native
  
  /**
    * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
    */
  var width: js.UndefOr[Double] = js.native
}
object CreateCreateData {
  
  @scala.inline
  def apply(): CreateCreateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCreateData]
  }
  
  @scala.inline
  implicit class CreateCreateDataOps[Self <: CreateCreateData] (val x: Self) extends AnyVal {
    
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
    def setAllowScriptsToClose(value: Boolean): Self = this.set("allowScriptsToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowScriptsToClose: Self = this.set("allowScriptsToClose", js.undefined)
    
    @scala.inline
    def setCookieStoreId(value: String): Self = this.set("cookieStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieStoreId: Self = this.set("cookieStoreId", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setState(value: WindowState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    
    @scala.inline
    def setTitlePreface(value: String): Self = this.set("titlePreface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePreface: Self = this.set("titlePreface", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setType(value: CreateType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: String*): Self = this.set("url", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
