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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.tabs")
@js.native
object tabs extends js.Object {
  
  /* tabs properties */
  /** An ID which represents the absence of a browser tab. */
  val TAB_ID_NONE: Double = js.native
  
  /** Captures an area of a specified tab. You must have <all_urls> permission to use this method. */
  def captureTab(): js.Promise[String] = js.native
  /** Captures an area of a specified tab. You must have <all_urls> permission to use this method. */
  def captureTab(options: ImageDetails): js.Promise[String] = js.native
  /**
    * Captures an area of a specified tab. You must have <all_urls> permission to use this method.
    * @param tabId The tab to capture. Defaults to the active tab of the current window.
    */
  def captureTab(tabId: Double): js.Promise[String] = js.native
  def captureTab(tabId: Double, options: ImageDetails): js.Promise[String] = js.native
  
  /**
    * Captures an area of the currently active tab in the specified window. You must have <all_urls> permission to use this method.
    */
  def captureVisibleTab(): js.Promise[String] = js.native
  /**
    * Captures an area of the currently active tab in the specified window. You must have <all_urls> permission to use this method.
    */
  def captureVisibleTab(options: ImageDetails): js.Promise[String] = js.native
  /**
    * Captures an area of the currently active tab in the specified window. You must have <all_urls> permission to use this method.
    * @param windowId The target window. Defaults to the current window.
    */
  def captureVisibleTab(windowId: Double): js.Promise[String] = js.native
  def captureVisibleTab(windowId: Double, options: ImageDetails): js.Promise[String] = js.native
  
  /**
    * Connects to the content script(s) in the specified tab. The `runtime.onConnect` event is fired in each content script running in the specified tab for the current extension. For more details, see Content Script Messaging.
    * @returns A port that can be used to communicate with the content scripts running in the specified tab. The port's `runtime.Port` event is fired if the tab closes or does not exist.
    */
  def connect(tabId: Double): Port = js.native
  def connect(tabId: Double, connectInfo: ConnectConnectInfo): Port = js.native
  
  /** Creates a new tab. */
  def create(createProperties: CreateCreateProperties): js.Promise[Tab] = js.native
  
  /**
    * Detects the primary language of the content in a tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  def detectLanguage(): js.Promise[String] = js.native
  def detectLanguage(tabId: Double): js.Promise[String] = js.native
  
  def discard(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * discards one or more tabs.
    * @param tabIds The tab or list of tabs to discard.
    */
  def discard(tabIds: Double): js.Promise[Unit] = js.native
  
  /**
    * Duplicates a tab.
    * @param tabId The ID of the tab which is to be duplicated.
    */
  def duplicate(tabId: Double): js.Promise[Tab] = js.native
  def duplicate(tabId: Double, duplicateProperties: DuplicateDuplicateProperties): js.Promise[Tab] = js.native
  
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the script to run.
    */
  def executeScript(details: InjectDetails): js.Promise[js.Array[_]] = js.native
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab in which to run the script; defaults to the active tab of the current window.
    * @param details Details of the script to run.
    */
  def executeScript(tabId: Double, details: InjectDetails): js.Promise[js.Array[_]] = js.native
  
  /* tabs functions */
  /** Retrieves details about the specified tab. */
  def get(tabId: Double): js.Promise[Tab] = js.native
  
  /**
    * Gets details about all tabs in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{windowId: windowId}`.
    */
  def getAllInWindow(): js.Promise[js.Array[Tab]] = js.native
  def getAllInWindow(windowId: Double): js.Promise[js.Array[Tab]] = js.native
  
  /**
    * Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for example: a background page or popup view).
    */
  def getCurrent(): js.Promise[Tab] = js.native
  
  /**
    * Gets the tab that is selected in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{active: true}`.
    */
  def getSelected(): js.Promise[Tab] = js.native
  def getSelected(windowId: Double): js.Promise[Tab] = js.native
  
  /**
    * Gets the current zoom factor of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom factor from; defaults to the active tab of the current window.
    */
  def getZoom(): js.Promise[Double] = js.native
  def getZoom(tabId: Double): js.Promise[Double] = js.native
  
  /**
    * Gets the current zoom settings of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom settings from; defaults to the active tab of the current window.
    */
  def getZoomSettings(): js.Promise[ZoomSettings] = js.native
  def getZoomSettings(tabId: Double): js.Promise[ZoomSettings] = js.native
  
  /**
    * Navigate to previous page in tab's history, if available.
    * @param [tabId] The ID of the tab to navigate backward.
    */
  def goBack(): js.Promise[Unit] = js.native
  def goBack(tabId: Double): js.Promise[Unit] = js.native
  
  /**
    * Navigate to next page in tab's history, if available
    * @param [tabId] The ID of the tab to navigate forward.
    */
  def goForward(): js.Promise[Unit] = js.native
  def goForward(tabId: Double): js.Promise[Unit] = js.native
  
  def hide(tabIds: js.Array[Double]): js.Promise[js.Array[Double]] = js.native
  /**
    * Hides one or more tabs. The `"tabHide"` permission is required to hide tabs. Not all tabs are hidable. Returns an array of hidden tabs.
    * @param tabIds The TAB ID or list of TAB IDs to hide.
    */
  def hide(tabIds: Double): js.Promise[js.Array[Double]] = js.native
  
  /** Highlights the given tabs. */
  def highlight(highlightInfo: HighlightHighlightInfo): js.Promise[Window] = js.native
  
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to insert.
    */
  def insertCSS(details: InjectDetails): js.Promise[Unit] = js.native
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab in which to insert the CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to insert.
    */
  def insertCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
  
  def move(tabIds: js.Array[Double], moveProperties: MoveMoveProperties): js.Promise[Tab | js.Array[Tab]] = js.native
  /**
    * Moves one or more tabs to a new position within its window, or to a new window. Note that tabs can only be moved to and from normal (window.type === "normal") windows.
    * @param tabIds The tab or list of tabs to move.
    */
  def move(tabIds: Double, moveProperties: MoveMoveProperties): js.Promise[Tab | js.Array[Tab]] = js.native
  
  /**
    * Removes an array of tabs from their lines of succession and prepends or appends them in a chain to another tab.
    * @param tabIds An array of tab IDs to move in the line of succession. For each tab in the array, the tab's current predecessors will have their successor set to the tab's current successor, and each tab will then be set to be the successor of the previous tab in the array. Any tabs not in the same window as the tab indicated by the second argument (or the first tab in the array, if no second argument) will be skipped.
    * @param [tabId] The ID of a tab to set as the successor of the last tab in the array, or `tabs.TAB_ID_NONE` to leave the last tab without a successor. If options.append is true, then this tab is made the predecessor of the first tab in the array instead.
    */
  def moveInSuccession(tabIds: js.Array[Double]): js.Promise[_] = js.native
  def moveInSuccession(tabIds: js.Array[Double], tabId: js.UndefOr[scala.Nothing], options: MoveInSuccessionOptions): js.Promise[_] = js.native
  def moveInSuccession(tabIds: js.Array[Double], tabId: Double): js.Promise[_] = js.native
  def moveInSuccession(tabIds: js.Array[Double], tabId: Double, options: MoveInSuccessionOptions): js.Promise[_] = js.native
  
  /**
    * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events to be notified when a URL is set.
    */
  val onActivated: WebExtEvent[js.Function1[/* activeInfo */ OnActivatedActiveInfo, Unit]] = js.native
  
  /**
    * Fires when the selected tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to `tabs.onUpdated` events to be notified when a URL is set.
    * @param tabId The ID of the tab that has become active.
    * @deprecated Please use `tabs.onActivated`.
    */
  val onActiveChanged: js.UndefOr[
    WebExtEvent[
      js.Function2[/* tabId */ Double, /* selectInfo */ OnActiveChangedSelectInfo, Unit]
    ]
  ] = js.native
  
  /** Fired when a tab is attached to a window, for example because it was moved between windows. */
  val onAttached: WebExtEvent[js.Function2[/* tabId */ Double, /* attachInfo */ OnAttachedAttachInfo, Unit]] = js.native
  
  /* tabs events */
  /**
    * Fired when a tab is created. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events to be notified when a URL is set.
    * @param tab Details of the tab that was created.
    */
  val onCreated: WebExtEvent[js.Function1[/* tab */ Tab, Unit]] = js.native
  
  /** Fired when a tab is detached from a window, for example because it is being moved between windows. */
  val onDetached: WebExtEvent[js.Function2[/* tabId */ Double, /* detachInfo */ OnDetachedDetachInfo, Unit]] = js.native
  
  /**
    * Fired when the highlighted or selected tabs in a window changes.
    * @deprecated Please use `tabs.onHighlighted`.
    */
  val onHighlightChanged: js.UndefOr[WebExtEvent[js.Function1[/* selectInfo */ OnHighlightChangedSelectInfo, Unit]]] = js.native
  
  /** Fired when the highlighted or selected tabs in a window changes. */
  val onHighlighted: WebExtEvent[js.Function1[/* highlightInfo */ OnHighlightedHighlightInfo, Unit]] = js.native
  
  /**
    * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the user directly moved. Move events are not fired for the other tabs that must move in response. This event is not fired when a tab is moved between windows. For that, see `tabs.onDetached`.
    */
  val onMoved: WebExtEvent[js.Function2[/* tabId */ Double, /* moveInfo */ OnMovedMoveInfo, Unit]] = js.native
  
  /** Fired when a tab is closed. */
  val onRemoved: WebExtEvent[js.Function2[/* tabId */ Double, /* removeInfo */ OnRemovedRemoveInfo, Unit]] = js.native
  
  /** Fired when a tab is replaced with another tab due to prerendering or instant. */
  val onReplaced: WebExtEvent[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]] = js.native
  
  /**
    * Fires when the selected tab in a window changes.
    * @param tabId The ID of the tab that has become active.
    * @deprecated Please use `tabs.onActivated`.
    */
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
  val onUpdated: TabsOnUpdatedEvent[
    js.Function3[/* tabId */ Double, /* changeInfo */ OnUpdatedChangeInfo, /* tab */ Tab, Unit]
  ] = js.native
  
  /** Fired when a tab is zoomed. */
  val onZoomChange: WebExtEvent[js.Function1[/* ZoomChangeInfo */ OnZoomChangeZoomChangeInfo, Unit]] = js.native
  
  /** Prints page in active tab. */
  def print(): Unit = js.native
  
  /** Shows print preview for page in active tab. */
  def printPreview(): js.Promise[Unit] = js.native
  
  /** Gets all tabs that have the specified properties, or all tabs if no properties are specified. */
  def query(queryInfo: QueryQueryInfo): js.Promise[js.Array[Tab]] = js.native
  
  /** Reload a tab. */
  def reload(): js.Promise[Unit] = js.native
  /** Reload a tab. */
  def reload(reloadProperties: ReloadReloadProperties): js.Promise[Unit] = js.native
  /**
    * Reload a tab.
    * @param tabId The ID of the tab to reload; defaults to the selected tab of the current window.
    */
  def reload(tabId: Double): js.Promise[Unit] = js.native
  def reload(tabId: Double, reloadProperties: ReloadReloadProperties): js.Promise[Unit] = js.native
  
  def remove(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Closes one or more tabs.
    * @param tabIds The tab or list of tabs to close.
    */
  def remove(tabIds: Double): js.Promise[Unit] = js.native
  
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to remove.
    */
  def removeCSS(details: InjectDetails): js.Promise[Unit] = js.native
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab from which to remove the injected CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to remove.
    */
  def removeCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
  
  /**
    * Saves page in active tab as a PDF file.
    * @param pageSettings The page settings used to save the PDF file.
    */
  def saveAsPDF(pageSettings: PageSettings): js.Promise[String] = js.native
  
  /**
    * Sends a single message to the content script(s) in the specified tab, with an optional callback to run when a response is sent back. The `runtime.onMessage` event is fired in each content script running in the specified tab for the current extension.
    */
  def sendMessage(tabId: Double, message: js.Any): js.Promise[_] = js.native
  def sendMessage(tabId: Double, message: js.Any, options: SendMessageOptions): js.Promise[_] = js.native
  
  /**
    * Sends a single request to the content script(s) in the specified tab, with an optional callback to run when a response is sent back. The `extension.onRequest` event is fired in each content script running in the specified tab for the current extension.
    * @deprecated Please use `runtime.sendMessage`.
    */
  def sendRequest(tabId: Double, request: js.Any): Unit = js.native
  def sendRequest(tabId: Double, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  /**
    * Zooms a specified tab.
    * @param tabId The ID of the tab to zoom; defaults to the active tab of the current window.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor. Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  def setZoom(tabId: Double, zoomFactor: Double): js.Promise[Unit] = js.native
  /**
    * Zooms a specified tab.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor. Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  def setZoom(zoomFactor: Double): js.Promise[Unit] = js.native
  
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset to defaults upon navigating the tab.
    * @param tabId The ID of the tab to change the zoom settings for; defaults to the active tab of the current window.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset to defaults upon navigating the tab.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  def setZoomSettings(zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  
  def show(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  /**
    * Shows one or more tabs.
    * @param tabIds The TAB ID or list of TAB IDs to show.
    */
  def show(tabIds: Double): js.Promise[Unit] = js.native
  
  /**
    * Toggles reader mode for the document in the tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  def toggleReaderMode(): js.Promise[Unit] = js.native
  def toggleReaderMode(tabId: Double): js.Promise[Unit] = js.native
  
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    * @param tabId Defaults to the selected tab of the current window.
    */
  def update(tabId: Double, updateProperties: UpdateUpdateProperties): js.Promise[Tab] = js.native
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    */
  def update(updateProperties: UpdateUpdateProperties): js.Promise[Tab] = js.native
  
  /**
    * Warm up a tab
    * @param tabId The ID of the tab to warm up.
    */
  def warmup(tabId: Double): js.Promise[_] = js.native
}
