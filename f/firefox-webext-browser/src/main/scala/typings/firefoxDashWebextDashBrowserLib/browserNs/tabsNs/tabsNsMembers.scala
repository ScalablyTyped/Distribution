package typings
package firefoxDashWebextDashBrowserLib.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs")
@js.native
object tabsNsMembers extends js.Object {
  /* tabs properties */
  /** An ID which represents the absence of a browser tab. */
  val TAB_ID_NONE: scala.Double = js.native
  /**
    * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event
    * fired, but you can listen to onUpdated events to be notified when a URL is set.
    */
  val onActivated: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* activeInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdTabIdNumber, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fires when the selected tab in a window changes. Note that the tab's URL may not be set at the time this event
    * fired, but you can listen to `tabs.onUpdated` events to be notified when a URL is set.
    * @param tabId The ID of the tab that has become active.
    * @deprecated Please use `tabs.onActivated`.
    */
  val onActiveChanged: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function2[
        /* tabId */ scala.Double, 
        /* selectInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdNumber_1120275497, 
        scala.Unit
      ]
    ]
  ] = js.native
  /** Fired when a tab is attached to a window, for example because it was moved between windows. */
  val onAttached: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* tabId */ scala.Double, 
      /* attachInfo */ firefoxDashWebextDashBrowserLib.Anon_NewWindowId, 
      scala.Unit
    ]
  ] = js.native
  /* tabs events */
  /**
    * Fired when a tab is created. Note that the tab's URL may not be set at the time this event fired, but you can
    * listen to onUpdated events to be notified when a URL is set.
    * @param tab Details of the tab that was created.
    */
  val onCreated: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* tab */ Tab, scala.Unit]] = js.native
  /** Fired when a tab is detached from a window, for example because it is being moved between windows. */
  val onDetached: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* tabId */ scala.Double, 
      /* detachInfo */ firefoxDashWebextDashBrowserLib.Anon_OldWindowId, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when the highlighted or selected tabs in a window changes.
    * @deprecated Please use `tabs.onHighlighted`.
    */
  val onHighlightChanged: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function1[/* selectInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdTabIds, scala.Unit]
    ]
  ] = js.native
  /** Fired when the highlighted or selected tabs in a window changes. */
  val onHighlighted: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* highlightInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdTabIds, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the user directly
    * moved. Move events are not fired for the other tabs that must move in response. This event is not fired when a
    * tab is moved between windows. For that, see `tabs.onDetached`.
    */
  val onMoved: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* tabId */ scala.Double, 
      /* moveInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdToIndex, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when a tab is closed. */
  val onRemoved: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[
      /* tabId */ scala.Double, 
      /* removeInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdIsWindowClosing, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when a tab is replaced with another tab due to prerendering or instant. */
  val onReplaced: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function2[/* addedTabId */ scala.Double, /* removedTabId */ scala.Double, scala.Unit]
  ] = js.native
  /**
    * Fires when the selected tab in a window changes.
    * @param tabId The ID of the tab that has become active.
    * @deprecated Please use `tabs.onActivated`.
    */
  val onSelectionChanged: js.UndefOr[
    firefoxDashWebextDashBrowserLib.WebExtEvent[
      js.Function2[
        /* tabId */ scala.Double, 
        /* selectInfo */ firefoxDashWebextDashBrowserLib.Anon_WindowIdNumber_1120275497, 
        scala.Unit
      ]
    ]
  ] = js.native
  /**
    * Fired when a tab is updated.
    * @param changeInfo Lists the changes to the state of the tab that was updated.
    * @param tab Gives the state of the tab that was updated.
    */
  val onUpdated: _TabsOnUpdatedEvent[
    js.Function3[
      /* tabId */ scala.Double, 
      /* changeInfo */ firefoxDashWebextDashBrowserLib.Anon_IsArticle, 
      /* tab */ Tab, 
      scala.Unit
    ]
  ] = js.native
  /** Fired when a tab is zoomed. */
  val onZoomChange: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* ZoomChangeInfo */ firefoxDashWebextDashBrowserLib.Anon_OldZoomFactor, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Captures the visible area of a specified tab. You must have <all_urls> permission to use this method.
    * @param [tabId] The tab to capture. Defaults to the active tab of the current window.
    */
  def captureTab(): js.Promise[java.lang.String] = js.native
  def captureTab(tabId: scala.Double): js.Promise[java.lang.String] = js.native
  def captureTab(
    tabId: scala.Double,
    options: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ImageDetails
  ): js.Promise[java.lang.String] = js.native
  /**
    * Captures the visible area of the currently active tab in the specified window. You must have <all_urls>
    * permission to use this method.
    * @param [windowId] The target window. Defaults to the current window.
    */
  def captureVisibleTab(): js.Promise[java.lang.String] = js.native
  def captureVisibleTab(windowId: scala.Double): js.Promise[java.lang.String] = js.native
  def captureVisibleTab(
    windowId: scala.Double,
    options: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.ImageDetails
  ): js.Promise[java.lang.String] = js.native
  /**
    * Connects to the content script(s) in the specified tab. The `runtime.onConnect` event is fired in each content
    * script running in the specified tab for the current extension. For more details, see Content Script Messaging.
    * @returns A port that can be used to communicate with the content scripts running in the specified tab. The
    *     port's `runtime.Port` event is fired if the tab closes or does not exist.
    */
  def connect(tabId: scala.Double): firefoxDashWebextDashBrowserLib.browserNs.runtimeNs.Port = js.native
  def connect(tabId: scala.Double, connectInfo: firefoxDashWebextDashBrowserLib.Anon_FrameIdName): firefoxDashWebextDashBrowserLib.browserNs.runtimeNs.Port = js.native
  /** Creates a new tab. */
  def create(createProperties: firefoxDashWebextDashBrowserLib.Anon_Discarded): js.Promise[js.UndefOr[Tab]] = js.native
  /**
    * Detects the primary language of the content in a tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  def detectLanguage(): js.Promise[java.lang.String] = js.native
  def detectLanguage(tabId: scala.Double): js.Promise[java.lang.String] = js.native
  def discard(tabIds: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  /**
    * discards one or more tabs.
    * @param tabIds The tab or list of tabs to discard.
    */
  def discard(tabIds: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Duplicates a tab.
    * @param tabId The ID of the tab which is to be duplicated.
    */
  def duplicate(tabId: scala.Double): js.Promise[js.UndefOr[Tab]] = js.native
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts
    * doc.
    * @param details Details of the script to run.
    */
  def executeScript(details: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.InjectDetails): js.Promise[js.UndefOr[js.Array[_]]] = js.native
  /**
    * Injects JavaScript code into a page. For details, see the programmatic injection section of the content scripts
    * doc.
    * @param tabId The ID of the tab in which to run the script; defaults to the active tab of the current window.
    * @param details Details of the script to run.
    */
  def executeScript(
    tabId: scala.Double,
    details: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.InjectDetails
  ): js.Promise[js.UndefOr[js.Array[_]]] = js.native
  /* tabs functions */
  /** Retrieves details about the specified tab. */
  def get(tabId: scala.Double): js.Promise[Tab] = js.native
  /**
    * Gets details about all tabs in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{windowId: windowId}`.
    */
  def getAllInWindow(): js.Promise[js.Array[Tab]] = js.native
  def getAllInWindow(windowId: scala.Double): js.Promise[js.Array[Tab]] = js.native
  /**
    * Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for
    * example: a background page or popup view).
    */
  def getCurrent(): js.Promise[Tab] = js.native
  /**
    * Gets the tab that is selected in the specified window.
    * @param [windowId] Defaults to the current window.
    * @deprecated Please use `tabs.query` `{active: true}`.
    */
  def getSelected(): js.Promise[Tab] = js.native
  def getSelected(windowId: scala.Double): js.Promise[Tab] = js.native
  /**
    * Gets the current zoom factor of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom factor from; defaults to the active tab of the current
    *     window.
    */
  def getZoom(): js.Promise[scala.Double] = js.native
  def getZoom(tabId: scala.Double): js.Promise[scala.Double] = js.native
  /**
    * Gets the current zoom settings of a specified tab.
    * @param [tabId] The ID of the tab to get the current zoom settings from; defaults to the active tab of the
    *     current window.
    */
  def getZoomSettings(): js.Promise[ZoomSettings] = js.native
  def getZoomSettings(tabId: scala.Double): js.Promise[ZoomSettings] = js.native
  def hide(tabIds: js.Array[scala.Double]): js.Promise[js.Array[scala.Double]] = js.native
  /**
    * Hides one or more tabs. The `"tabHide"` permission is required to hide tabs. Not all tabs are hidable. Returns
    * an array of hidden tabs.
    * @param tabIds The TAB ID or list of TAB IDs to hide.
    */
  def hide(tabIds: scala.Double): js.Promise[js.Array[scala.Double]] = js.native
  /** Highlights the given tabs. */
  def highlight(highlightInfo: firefoxDashWebextDashBrowserLib.Anon_WindowIdPopulate): js.Promise[js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.windowsNs.Window]] = js.native
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to insert.
    */
  def insertCSS(details: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.InjectDetails): js.Promise[scala.Unit] = js.native
  /**
    * Injects CSS into a page. For details, see the programmatic injection section of the content scripts doc.
    * @param tabId The ID of the tab in which to insert the CSS; defaults to the active tab of the current window.
    * @param details Details of the CSS text to insert.
    */
  def insertCSS(
    tabId: scala.Double,
    details: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.InjectDetails
  ): js.Promise[scala.Unit] = js.native
  def move(tabIds: js.Array[scala.Double], moveProperties: firefoxDashWebextDashBrowserLib.Anon_WindowIdIndex): js.Promise[js.UndefOr[Tab | js.Array[Tab]]] = js.native
  /**
    * Moves one or more tabs to a new position within its window, or to a new window. Note that tabs can only be moved
    * to and from normal (window.type === "normal") windows.
    * @param tabIds The tab or list of tabs to move.
    */
  def move(tabIds: scala.Double, moveProperties: firefoxDashWebextDashBrowserLib.Anon_WindowIdIndex): js.Promise[js.UndefOr[Tab | js.Array[Tab]]] = js.native
  /** Prints page in active tab. */
  def print(): scala.Unit = js.native
  /** Shows print preview for page in active tab. */
  def printPreview(): js.Promise[scala.Unit] = js.native
  /** Gets all tabs that have the specified properties, or all tabs if no properties are specified. */
  def query(queryInfo: firefoxDashWebextDashBrowserLib.Anon_DiscardedCurrentWindow): js.Promise[js.Array[Tab]] = js.native
  /**
    * Reload a tab.
    * @param [tabId] The ID of the tab to reload; defaults to the selected tab of the current window.
    */
  def reload(): js.Promise[scala.Unit] = js.native
  def reload(tabId: scala.Double): js.Promise[scala.Unit] = js.native
  def reload(tabId: scala.Double, reloadProperties: firefoxDashWebextDashBrowserLib.Anon_BypassCache): js.Promise[scala.Unit] = js.native
  def remove(tabIds: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  /**
    * Closes one or more tabs.
    * @param tabIds The tab or list of tabs to close.
    */
  def remove(tabIds: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts doc.
    * @param details Details of the CSS text to remove.
    */
  def removeCSS(details: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.InjectDetails): js.Promise[scala.Unit] = js.native
  /**
    * Removes injected CSS from a page. For details, see the programmatic injection section of the content scripts
    * doc.
    * @param tabId The ID of the tab from which to remove the injected CSS; defaults to the active tab of the current
    *     window.
    * @param details Details of the CSS text to remove.
    */
  def removeCSS(
    tabId: scala.Double,
    details: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.InjectDetails
  ): js.Promise[scala.Unit] = js.native
  /**
    * Saves page in active tab as a PDF file.
    * @param pageSettings The page settings used to save the PDF file.
    */
  def saveAsPDF(pageSettings: PageSettings): js.Promise[js.UndefOr[java.lang.String]] = js.native
  /**
    * Sends a single message to the content script(s) in the specified tab, with an optional callback to run when a
    * response is sent back. The `runtime.onMessage` event is fired in each content script running in the specified
    * tab for the current extension.
    */
  def sendMessage(tabId: scala.Double, message: js.Any): js.Promise[_] = js.native
  def sendMessage(tabId: scala.Double, message: js.Any, options: firefoxDashWebextDashBrowserLib.Anon_FrameId): js.Promise[_] = js.native
  /**
    * Sends a single request to the content script(s) in the specified tab, with an optional callback to run when a
    * response is sent back. The `extension.onRequest` event is fired in each content script running in the specified
    * tab for the current extension.
    * @deprecated Please use `runtime.sendMessage`.
    */
  def sendRequest(tabId: scala.Double, request: js.Any): scala.Unit = js.native
  def sendRequest(
    tabId: scala.Double,
    request: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Zooms a specified tab.
    * @param tabId The ID of the tab to zoom; defaults to the active tab of the current window.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor.
    *     Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  def setZoom(tabId: scala.Double, zoomFactor: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Zooms a specified tab.
    * @param zoomFactor The new zoom factor. Use a value of 0 here to set the tab to its current default zoom factor.
    *     Values greater than zero specify a (possibly non-default) zoom factor for the tab.
    */
  def setZoom(zoomFactor: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset
    * to defaults upon navigating the tab.
    * @param tabId The ID of the tab to change the zoom settings for; defaults to the active tab of the current
    *     window.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  def setZoomSettings(tabId: scala.Double, zoomSettings: ZoomSettings): js.Promise[scala.Unit] = js.native
  /**
    * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These settings are reset
    * to defaults upon navigating the tab.
    * @param zoomSettings Defines how zoom changes are handled and at what scope.
    */
  def setZoomSettings(zoomSettings: ZoomSettings): js.Promise[scala.Unit] = js.native
  def show(tabIds: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  /**
    * Shows one or more tabs.
    * @param tabIds The TAB ID or list of TAB IDs to show.
    */
  def show(tabIds: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Toggles reader mode for the document in the tab.
    * @param [tabId] Defaults to the active tab of the current window.
    */
  def toggleReaderMode(): js.Promise[scala.Unit] = js.native
  def toggleReaderMode(tabId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    * @param tabId Defaults to the selected tab of the current window.
    */
  def update(tabId: scala.Double, updateProperties: firefoxDashWebextDashBrowserLib.Anon_UrlSelected): js.Promise[js.UndefOr[Tab]] = js.native
  /**
    * Modifies the properties of a tab. Properties that are not specified in `updateProperties` are not modified.
    */
  def update(updateProperties: firefoxDashWebextDashBrowserLib.Anon_UrlSelected): js.Promise[js.UndefOr[Tab]] = js.native
}

