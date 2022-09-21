package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object windows {
  
  trait CreateCreateData extends StObject {
    
    /** Allow scripts to close the window. */
    var allowScriptsToClose: js.UndefOr[Boolean] = js.undefined
    
    /** The CookieStoreId to use for all tabs that were created when the window is opened. */
    var cookieStoreId: js.UndefOr[String] = js.undefined
    
    /** If true, opens an active window. If false, opens an inactive window. */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Whether the new window should be an incognito window. */
    var incognito: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of pixels to position the new window from the left edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      */
    var state: js.UndefOr[WindowState] = js.undefined
    
    /** The id of the tab for which you want to adopt to the new window. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** A string to add to the beginning of the window title. */
    var titlePreface: js.UndefOr[String] = js.undefined
    
    /**
      * The number of pixels to position the new window from the top edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
      */
    var `type`: js.UndefOr[CreateType] = js.undefined
    
    /**
      * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
      */
    var url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CreateCreateData {
    
    inline def apply(): CreateCreateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCreateData]
    }
    
    extension [Self <: CreateCreateData](x: Self) {
      
      inline def setAllowScriptsToClose(value: Boolean): Self = StObject.set(x, "allowScriptsToClose", value.asInstanceOf[js.Any])
      
      inline def setAllowScriptsToCloseUndefined: Self = StObject.set(x, "allowScriptsToClose", js.undefined)
      
      inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
      
      inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTitlePreface(value: String): Self = StObject.set(x, "titlePreface", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefaceUndefined: Self = StObject.set(x, "titlePreface", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: CreateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel
  */
  trait CreateType extends StObject
  object CreateType {
    
    inline def detached_panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel = "detached_panel".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel]
    
    inline def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    inline def panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
    
    inline def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
  }
  
  /**
    * Specifies properties used to filter the `windows.Window` returned and to determine whether they should contain a list of the `tabs.Tab` objects.
    */
  trait GetAllGetInfo extends StObject {
    
    /**
      * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab` objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's manifest file includes the `"tabs"` permission.
      */
    var populate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's own windows.
      * @deprecated If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's own windows.
      */
    var windowTypes: js.UndefOr[js.Array[WindowType]] = js.undefined
  }
  object GetAllGetInfo {
    
    inline def apply(): GetAllGetInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAllGetInfo]
    }
    
    extension [Self <: GetAllGetInfo](x: Self) {
      
      inline def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setWindowTypes(value: js.Array[WindowType]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      inline def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      inline def setWindowTypesVarargs(value: WindowType*): Self = StObject.set(x, "windowTypes", js.Array(value*))
    }
  }
  
  /** Specifies whether the `windows.Window` returned should contain a list of the `tabs.Tab` objects. */
  trait GetInfo extends StObject {
    
    /**
      * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab` objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's manifest file includes the `"tabs"` permission.
      */
    var populate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `windowTypes` is deprecated and ignored on Firefox.
      * @deprecated `windowTypes` is deprecated and ignored on Firefox.
      */
    var windowTypes: js.UndefOr[js.Array[WindowType]] = js.undefined
  }
  object GetInfo {
    
    inline def apply(): GetInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInfo]
    }
    
    extension [Self <: GetInfo](x: Self) {
      
      inline def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setWindowTypes(value: js.Array[WindowType]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      inline def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      inline def setWindowTypesVarargs(value: WindowType*): Self = StObject.set(x, "windowTypes", js.Array(value*))
    }
  }
  
  trait UpdateUpdateInfo extends StObject {
    
    /**
      * If true, causes the window to be displayed in a manner that draws the user's attention to the window, without changing the focused window. The effect lasts until the user changes focus to the window. This option has no effect if the window already has focus. Set to false to cancel a previous draw attention request.
      */
    var drawAttention: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** The height to resize the window to in pixels. This value is ignored for panels. */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      */
    var state: js.UndefOr[WindowState] = js.undefined
    
    /** A string to add to the beginning of the window title. */
    var titlePreface: js.UndefOr[String] = js.undefined
    
    /**
      * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /** The width to resize the window to in pixels. This value is ignored for panels. */
    var width: js.UndefOr[Double] = js.undefined
  }
  object UpdateUpdateInfo {
    
    inline def apply(): UpdateUpdateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateInfo]
    }
    
    extension [Self <: UpdateUpdateInfo](x: Self) {
      
      inline def setDrawAttention(value: Boolean): Self = StObject.set(x, "drawAttention", value.asInstanceOf[js.Any])
      
      inline def setDrawAttentionUndefined: Self = StObject.set(x, "drawAttention", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTitlePreface(value: String): Self = StObject.set(x, "titlePreface", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefaceUndefined: Self = StObject.set(x, "titlePreface", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Window extends StObject {
    
    /** Whether the window is set to be always on top. */
    var alwaysOnTop: Boolean
    
    /** Whether the window is currently the focused window. */
    var focused: Boolean
    
    /**
      * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the `sessions` API.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the `sessions` API, in which case a session ID may be present.
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /** Whether the window is incognito. */
    var incognito: Boolean
    
    /**
      * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the `sessions` API.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** The session ID used to uniquely identify a Window obtained from the `sessions` API. */
    var sessionId: js.UndefOr[String] = js.undefined
    
    /** The state of this browser window. */
    var state: js.UndefOr[WindowState] = js.undefined
    
    /** Array of `tabs.Tab` objects representing the current tabs in the window. */
    var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
    
    /** The title of the window. Read-only. */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the `sessions` API.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /** The type of browser window this is. */
    var `type`: js.UndefOr[WindowType] = js.undefined
    
    /**
      * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the `sessions` API.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Window {
    
    inline def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
      val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: WindowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * The state of this browser window. Under some circumstances a Window may not be assigned state property, for example when querying closed windows from the `sessions` API.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked
  */
  trait WindowState extends StObject
  object WindowState {
    
    inline def docked: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = "docked".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked]
    
    inline def fullscreen: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = "fullscreen".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen]
    
    inline def maximized: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = "maximized".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized]
    
    inline def minimized: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = "minimized".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized]
    
    inline def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
  }
  
  /* windows types */
  /**
    * The type of browser window this is. Under some circumstances a Window may not be assigned type property, for example when querying closed windows from the `sessions` API.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools
  */
  trait WindowType extends StObject
  object WindowType {
    
    inline def app: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = "app".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.app]
    
    inline def devtools: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = "devtools".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools]
    
    inline def normal: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    inline def panel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
    
    inline def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
  }
}
