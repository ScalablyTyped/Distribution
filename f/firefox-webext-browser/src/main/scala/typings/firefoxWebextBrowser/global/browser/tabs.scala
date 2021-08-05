package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.extensionTypes.ImageDetails
import typings.firefoxWebextBrowser.browser.extensionTypes.InjectDetails
import typings.firefoxWebextBrowser.browser.runtime.Port
import typings.firefoxWebextBrowser.browser.tabs.ConnectConnectInfo
import typings.firefoxWebextBrowser.browser.tabs.CreateCreateProperties
import typings.firefoxWebextBrowser.browser.tabs.DuplicateDuplicateProperties
import typings.firefoxWebextBrowser.browser.tabs.HighlightHighlightInfo
import typings.firefoxWebextBrowser.browser.tabs.MoveInSuccessionOptions
import typings.firefoxWebextBrowser.browser.tabs.MoveMoveProperties
import typings.firefoxWebextBrowser.browser.tabs.OnActivatedActiveInfo
import typings.firefoxWebextBrowser.browser.tabs.OnActiveChangedSelectInfo
import typings.firefoxWebextBrowser.browser.tabs.OnAttachedAttachInfo
import typings.firefoxWebextBrowser.browser.tabs.OnDetachedDetachInfo
import typings.firefoxWebextBrowser.browser.tabs.OnHighlightChangedSelectInfo
import typings.firefoxWebextBrowser.browser.tabs.OnHighlightedHighlightInfo
import typings.firefoxWebextBrowser.browser.tabs.OnMovedMoveInfo
import typings.firefoxWebextBrowser.browser.tabs.OnRemovedRemoveInfo
import typings.firefoxWebextBrowser.browser.tabs.OnSelectionChangedSelectInfo
import typings.firefoxWebextBrowser.browser.tabs.OnUpdatedChangeInfo
import typings.firefoxWebextBrowser.browser.tabs.OnZoomChangeZoomChangeInfo
import typings.firefoxWebextBrowser.browser.tabs.PageSettings
import typings.firefoxWebextBrowser.browser.tabs.QueryQueryInfo
import typings.firefoxWebextBrowser.browser.tabs.ReloadReloadProperties
import typings.firefoxWebextBrowser.browser.tabs.SendMessageOptions
import typings.firefoxWebextBrowser.browser.tabs.Tab
import typings.firefoxWebextBrowser.browser.tabs.TabsOnUpdatedEvent
import typings.firefoxWebextBrowser.browser.tabs.UpdateUpdateProperties
import typings.firefoxWebextBrowser.browser.tabs.ZoomSettings
import typings.firefoxWebextBrowser.browser.windows.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object tabs {
  
  @JSGlobal("browser.tabs")
  @js.native
  val ^ : js.Any = js.native
  
  /* tabs properties */
  /** An ID which represents the absence of a browser tab. */
  @JSGlobal("browser.tabs.TAB_ID_NONE")
  @js.native
  val TAB_ID_NONE: Double = js.native
  
  /** Captures an area of a specified tab. You must have <all_urls> permission to use this method. */
  inline def captureTab(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureTab")().asInstanceOf[js.Promise[String]]
  /** Captures an area of a specified tab. You must have <all_urls> permission to use this method. */
  inline def captureTab(options: ImageDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureTab")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  /**
    * Captures an area of a specified tab. You must have <all_urls> permission to use this method.
    * @param tabId The tab to capture. Defaults to the active tab of the current window.
    */
  inline def captureTab(tabId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureTab")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def captureTab(tabId: Double, options: ImageDetails): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureTab")(tabId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Captures an area of the currently active tab in the specified window. You must have <all_urls> permission to use this method.
    */
  inline def captureVisibleTab(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")().asInstanceOf[js.Promise[String]]
  /**
    * Captures an area of the currently active tab in the specified window. You must have <all_urls> permission to use this method.
    */
  inline def captureVisibleTab(options: ImageDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  /**
    * Captures an area of the currently active tab in the specified window. You must have <all_urls> permission to use this method.
    * @param windowId The target window. Defaults to the current window.
    */
  inline def captureVisibleTab(windowId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def captureVisibleTab(windowId: Double, options: ImageDetails): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(windowId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Connects to the content script(s) in the specified tab. The `runtime.onConnect` event is fired in each content script running in the specified tab for the current extension. For more details, see Content Script Messaging.
    * @returns A port that can be used to communicate with the content scripts running in the specified tab. The port's `runtime.Port` event is fired if the tab closes or does not exist.
    */
  inline def connect(tabId: Double): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(tabId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(tabId: Double, connectInfo: ConnectConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(tabId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  /** Creates a new tab. */
  inline def create(createProperties: CreateCreateProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  /**
    * Detects the primary language of the content in a tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  inline def detectLanguage(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")().asInstanceOf[js.Promise[String]]
  inline def detectLanguage(tabId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def discard(tabIds: js.Array[Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("discard")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * discards one or more tabs.
    * @param tabIds The tab or list of tabs to discard.
    */
  inline def discard(tabIds: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("discard")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Duplicates a tab.
    * @param tabId The ID of the tab which is to be duplicated.
    */
  inline def duplicate(tabId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def duplicate(tabId: Double, duplicateProperties: DuplicateDuplicateProperties): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(tabId.asInstanceOf[js.Any], duplicateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the script to run.
    */
  inline def executeScript(details: InjectDetails): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab in which to run the script; defaults to the active tab of the current window.
    * @param details Details of the script to run.
    */
  inline def executeScript(tabId: Double, details: InjectDetails): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  /* tabs functions */
  /** Retrieves details about the specified tab. */
  inline def get(tabId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  /**
    * Gets details about all tabs in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{windowId: windowId}`.
    */
  inline def getAllInWindow(): js.Promise[js.Array[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInWindow")().asInstanceOf[js.Promise[js.Array[Tab]]]
  inline def getAllInWindow(windowId: Double): js.Promise[js.Array[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInWindow")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Tab]]]
  
  /**
    * Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for example: a background page or popup view).
    */
  inline def getCurrent(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[Tab]]
  
  /**
    * Gets the tab that is selected in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{active: true}`.
    */
  inline def getSelected(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelected")().asInstanceOf[js.Promise[Tab]]
  inline def getSelected(windowId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelected")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  /**
    * Gets the current zoom factor of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom factor from; defaults to the active tab of the current window.
    */
  inline def getZoom(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoom")().asInstanceOf[js.Promise[Double]]
  inline def getZoom(tabId: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoom")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  /**
    * Gets the current zoom settings of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom settings from; defaults to the active tab of the current window.
    */
  inline def getZoomSettings(): js.Promise[ZoomSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoomSettings")().asInstanceOf[js.Promise[ZoomSettings]]
  inline def getZoomSettings(tabId: Double): js.Promise[ZoomSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoomSettings")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ZoomSettings]]
  
  /**
    * Navigate to previous page in tab's history, if available.
    * @param [tabId] The ID of the tab to navigate backward.
    */
  inline def goBack(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[js.Promise[Unit]]
  inline def goBack(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Navigate to next page in tab's history, if available
    * @param [tabId] The ID of the tab to navigate forward.
    */
  inline def goForward(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[js.Promise[Unit]]
  inline def goForward(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def hide(tabIds: js.Array[Double]): js.Promise[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double]]]
  /**
    * Hides one or more tabs. The `"tabHide"` permission is required to hide tabs. Not all tabs are hidable. Returns an array of hidden tabs.
    * @param tabIds The TAB ID or list of TAB IDs to hide.
    */
  inline def hide(tabIds: Double): js.Promise[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double]]]
  
  /** Highlights the given tabs. */
  inline def highlight(highlightInfo: HighlightHighlightInfo): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(highlightInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to insert.
    */
  inline def insertCSS(details: InjectDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab in which to insert the CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to insert.
    */
  inline def insertCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def move(tabIds: js.Array[Double], moveProperties: MoveMoveProperties): js.Promise[Tab | js.Array[Tab]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabIds.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab | js.Array[Tab]]]
  /**
    * Moves one or more tabs to a new position within its window, or to a new window. Note that tabs can only be moved to and from normal (window.type === "normal") windows.
    * @param tabIds The tab or list of tabs to move.
    */
  inline def move(tabIds: Double, moveProperties: MoveMoveProperties): js.Promise[Tab | js.Array[Tab]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabIds.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab | js.Array[Tab]]]
  
  /**
    * Removes an array of tabs from their lines of succession and prepends or appends them in a chain to another tab.
    * @param tabIds An array of tab IDs to move in the line of succession. For each tab in the array, the tab's current predecessors will have their successor set to the tab's current successor, and each tab will then be set to be the successor of the previous tab in the array. Any tabs not in the same window as the tab indicated by the second argument (or the first tab in the array, if no second argument) will be skipped.
    * @param [tabId] The ID of a tab to set as the successor of the last tab in the array, or `tabs.TAB_ID_NONE` to leave the last tab without a successor. If options.append is true, then this tab is made the predecessor of the first tab in the array instead.
    */
  inline def moveInSuccession(tabIds: js.Array[Double]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveInSuccession")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def moveInSuccession(tabIds: js.Array[Double], tabId: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveInSuccession")(tabIds.asInstanceOf[js.Any], tabId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def moveInSuccession(tabIds: js.Array[Double], tabId: Double, options: MoveInSuccessionOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveInSuccession")(tabIds.asInstanceOf[js.Any], tabId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def moveInSuccession(tabIds: js.Array[Double], tabId: Unit, options: MoveInSuccessionOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveInSuccession")(tabIds.asInstanceOf[js.Any], tabId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events to be notified when a URL is set.
    */
  @JSGlobal("browser.tabs.onActivated")
  @js.native
  val onActivated: WebExtEvent[js.Function1[/* activeInfo */ OnActivatedActiveInfo, Unit]] = js.native
  
  /**
    * Fires when the selected tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to `tabs.onUpdated` events to be notified when a URL is set.
    * @param tabId The ID of the tab that has become active.
    * @deprecated Please use `tabs.onActivated`.
    */
  @JSGlobal("browser.tabs.onActiveChanged")
  @js.native
  val onActiveChanged: js.UndefOr[
    WebExtEvent[
      js.Function2[/* tabId */ Double, /* selectInfo */ OnActiveChangedSelectInfo, Unit]
    ]
  ] = js.native
  
  /** Fired when a tab is attached to a window, for example because it was moved between windows. */
  @JSGlobal("browser.tabs.onAttached")
  @js.native
  val onAttached: WebExtEvent[js.Function2[/* tabId */ Double, /* attachInfo */ OnAttachedAttachInfo, Unit]] = js.native
  
  /* tabs events */
  /**
    * Fired when a tab is created. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events to be notified when a URL is set.
    * @param tab Details of the tab that was created.
    */
  @JSGlobal("browser.tabs.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* tab */ Tab, Unit]] = js.native
  
  /** Fired when a tab is detached from a window, for example because it is being moved between windows. */
  @JSGlobal("browser.tabs.onDetached")
  @js.native
  val onDetached: WebExtEvent[js.Function2[/* tabId */ Double, /* detachInfo */ OnDetachedDetachInfo, Unit]] = js.native
  
  /**
    * Fired when the highlighted or selected tabs in a window changes.
    * @deprecated Please use `tabs.onHighlighted`.
    */
  @JSGlobal("browser.tabs.onHighlightChanged")
  @js.native
  val onHighlightChanged: js.UndefOr[WebExtEvent[js.Function1[/* selectInfo */ OnHighlightChangedSelectInfo, Unit]]] = js.native
  
  /** Fired when the highlighted or selected tabs in a window changes. */
  @JSGlobal("browser.tabs.onHighlighted")
  @js.native
  val onHighlighted: WebExtEvent[js.Function1[/* highlightInfo */ OnHighlightedHighlightInfo, Unit]] = js.native
  
  /**
    * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the user directly moved. Move events are not fired for the other tabs that must move in response. This event is not fired when a tab is moved between windows. For that, see `tabs.onDetached`.
    */
  @JSGlobal("browser.tabs.onMoved")
  @js.native
  val onMoved: WebExtEvent[js.Function2[/* tabId */ Double, /* moveInfo */ OnMovedMoveInfo, Unit]] = js.native
  
  /** Fired when a tab is closed. */
  @JSGlobal("browser.tabs.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function2[/* tabId */ Double, /* removeInfo */ OnRemovedRemoveInfo, Unit]] = js.native
  
  /** Fired when a tab is replaced with another tab due to prerendering or instant. */
  @JSGlobal("browser.tabs.onReplaced")
  @js.native
  val onReplaced: WebExtEvent[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]] = js.native
  
  /**
    * Fires when the selected tab in a window changes.
    * @param tabId The ID of the tab that has become active.
    * @deprecated Please use `tabs.onActivated`.
    */
  @JSGlobal("browser.tabs.onSelectionChanged")
  @js.native
  val onSelectionChanged: js.UndefOr[
    WebExtEvent[
      js.Function2[/* tabId */ Double, /* selectInfo */ OnSelectionChangedSelectInfo, Unit]
    ]
  ] = js.native
  
  /**
    * Fired when a tab is updated.
    * @param changeInfo Lists the changes to the state of the tab that was updated.
    * @param tab Gives the state of the tab that was updated.
    */
  @JSGlobal("browser.tabs.onUpdated")
  @js.native
  val onUpdated: TabsOnUpdatedEvent[
    js.Function3[/* tabId */ Double, /* changeInfo */ OnUpdatedChangeInfo, /* tab */ Tab, Unit]
  ] = js.native
  
  /** Fired when a tab is zoomed. */
  @JSGlobal("browser.tabs.onZoomChange")
  @js.native
  val onZoomChange: WebExtEvent[js.Function1[/* ZoomChangeInfo */ OnZoomChangeZoomChangeInfo, Unit]] = js.native
  
  /** Prints page in active tab. */
  inline def print(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")().asInstanceOf[Unit]
  
  /** Shows print preview for page in active tab. */
  inline def printPreview(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("printPreview")().asInstanceOf[js.Promise[Unit]]
  
  /** Gets all tabs that have the specified properties, or all tabs if no properties are specified. */
  inline def query(queryInfo: QueryQueryInfo): js.Promise[js.Array[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Tab]]]
  
  /** Reload a tab. */
  inline def reload(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[js.Promise[Unit]]
  /** Reload a tab. */
  inline def reload(reloadProperties: ReloadReloadProperties): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(reloadProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Reload a tab.
    * @param tabId The ID of the tab to reload; defaults to the selected tab of the current window.
    */
  inline def reload(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def reload(tabId: Double, reloadProperties: ReloadReloadProperties): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any], reloadProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def remove(tabIds: js.Array[Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Closes one or more tabs.
    * @param tabIds The tab or list of tabs to close.
    */
  inline def remove(tabIds: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to remove.
    */
  inline def removeCSS(details: InjectDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab from which to remove the injected CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to remove.
    */
  inline def removeCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Saves page in active tab as a PDF file.
    * @param pageSettings The page settings used to save the PDF file.
    */
  inline def saveAsPDF(pageSettings: PageSettings): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAsPDF")(pageSettings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
    * Sends a single message to the content script(s) in the specified tab, with an optional callback to run when a response is sent back. The `runtime.onMessage` event is fired in each content script running in the specified tab for the current extension.
    */
  inline def sendMessage(tabId: Double, message: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def sendMessage(tabId: Double, message: js.Any, options: SendMessageOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Sends a single request to the content script(s) in the specified tab, with an optional callback to run when a response is sent back. The `extension.onRequest` event is fired in each content script running in the specified tab for the current extension.
    * @deprecated Please use `runtime.sendMessage`.
    */
  inline def sendRequest(tabId: Double, request: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(tabId.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendRequest(tabId: Double, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(tabId.asInstanceOf[js.Any], request.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Zooms a specified tab.
    * @param tabId The ID of the tab to zoom; defaults to the active tab of the current window.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor. Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  inline def setZoom(tabId: Double, zoomFactor: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoom")(tabId.asInstanceOf[js.Any], zoomFactor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Zooms a specified tab.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor. Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  inline def setZoom(zoomFactor: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setZoom")(zoomFactor.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset to defaults upon navigating the tab.
    * @param tabId The ID of the tab to change the zoom settings for; defaults to the active tab of the current window.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  inline def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoomSettings")(tabId.asInstanceOf[js.Any], zoomSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset to defaults upon navigating the tab.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  inline def setZoomSettings(zoomSettings: ZoomSettings): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setZoomSettings")(zoomSettings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def show(tabIds: js.Array[Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Shows one or more tabs.
    * @param tabIds The TAB ID or list of TAB IDs to show.
    */
  inline def show(tabIds: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Toggles reader mode for the document in the tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  inline def toggleReaderMode(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleReaderMode")().asInstanceOf[js.Promise[Unit]]
  inline def toggleReaderMode(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleReaderMode")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    * @param tabId Defaults to the selected tab of the current window.
    */
  inline def update(tabId: Double, updateProperties: UpdateUpdateProperties): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(tabId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    */
  inline def update(updateProperties: UpdateUpdateProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(updateProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  /**
    * Warm up a tab
    * @param tabId The ID of the tab to warm up.
    */
  inline def warmup(tabId: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("warmup")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
