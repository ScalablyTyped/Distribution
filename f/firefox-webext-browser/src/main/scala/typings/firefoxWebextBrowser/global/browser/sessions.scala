package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.sessions.Device
import typings.firefoxWebextBrowser.browser.sessions.Filter
import typings.firefoxWebextBrowser.browser.sessions.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
  *
  * Permissions: `sessions`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object sessions {
  
  @JSGlobal("browser.sessions")
  @js.native
  val ^ : js.Any = js.native
  
  /* sessions properties */
  /** The maximum number of `sessions.Session` that will be included in a requested list. */
  @JSGlobal("browser.sessions.MAX_SESSION_RESULTS")
  @js.native
  val MAX_SESSION_RESULTS: Double = js.native
  
  /* sessions functions */
  /**
    * Forget a recently closed tab.
    * @param windowId The windowId of the window to which the recently closed tab to be forgotten belongs.
    * @param sessionId The sessionId (closedId) of the recently closed tab to be forgotten.
    */
  inline def forgetClosedTab(windowId: Double, sessionId: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forgetClosedTab")(windowId.asInstanceOf[js.Any], sessionId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Forget a recently closed window.
    * @param sessionId The sessionId (closedId) of the recently closed window to be forgotten.
    */
  inline def forgetClosedWindow(sessionId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forgetClosedWindow")(sessionId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Retrieves all devices with synced sessions.
    * @deprecated Unsupported on Firefox at this time.
    */
  inline def getDevices(): js.Promise[js.Array[Device]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Promise[js.Array[Device]]]
  inline def getDevices(filter: Filter): js.Promise[js.Array[Device]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Device]]]
  
  /** Gets the list of recently closed tabs and/or windows. */
  inline def getRecentlyClosed(): js.Promise[js.Array[Session]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")().asInstanceOf[js.Promise[js.Array[Session]]]
  inline def getRecentlyClosed(filter: Filter): js.Promise[js.Array[Session]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecentlyClosed")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Session]]]
  
  /**
    * Retrieve a value that was set for a given key on a given tab.
    * @param tabId The id of the tab whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  inline def getTabValue(tabId: Double, key: String): js.Promise[js.UndefOr[String | js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabValue")(tabId.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String | js.Object]]]
  
  /**
    * Retrieve a value that was set for a given key on a given window.
    * @param windowId The id of the window whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  inline def getWindowValue(windowId: Double, key: String): js.Promise[js.UndefOr[String | js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWindowValue")(windowId.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String | js.Object]]]
  
  /* sessions events */
  /**
    * Fired when recently closed tabs and/or windows are changed. This event does not monitor synced sessions changes.
    */
  @JSGlobal("browser.sessions.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * Remove a key/value pair that was set on a given tab.
    * @param tabId The id of the tab whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  inline def removeTabValue(tabId: Double, key: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTabValue")(tabId.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Remove a key/value pair that was set on a given window.
    * @param windowId The id of the window whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  inline def removeWindowValue(windowId: Double, key: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeWindowValue")(windowId.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Reopens a `windows.Window` or `tabs.Tab`, with an optional callback to run when the entry has been restored.
    * @param [sessionId] The `windows.Window.sessionId`, or `tabs.Tab.sessionId` to restore. If this parameter is not specified, the most recently closed session is restored.
    */
  inline def restore(): js.Promise[Session] = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[js.Promise[Session]]
  inline def restore(sessionId: String): js.Promise[Session] = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(sessionId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Session]]
  
  /**
    * Set a key/value pair on a given tab.
    * @param tabId The id of the tab that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  inline def setTabValue(tabId: Double, key: String, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTabValue")(tabId.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Set a key/value pair on a given window.
    * @param windowId The id of the window that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  inline def setWindowValue(windowId: Double, key: String, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWindowValue")(windowId.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
