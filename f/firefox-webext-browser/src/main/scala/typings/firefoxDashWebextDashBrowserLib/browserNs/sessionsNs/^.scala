package typings
package firefoxDashWebextDashBrowserLib.browserNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.sessions")
@js.native
object ^ extends js.Object {
  /* sessions properties */
  /** The maximum number of `sessions.Session` that will be included in a requested list. */
  val MAX_SESSION_RESULTS: scala.Double = js.native
  /* sessions events */
  /**
    * Fired when recently closed tabs and/or windows are changed. This event does not monitor synced sessions changes.
    */
  val onChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]] = js.native
  /* sessions functions */
  /**
    * Forget a recently closed tab.
    * @param windowId The windowId of the window to which the recently closed tab to be forgotten belongs.
    * @param sessionId The sessionId (closedId) of the recently closed tab to be forgotten.
    */
  def forgetClosedTab(windowId: scala.Double, sessionId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Forget a recently closed window.
    * @param sessionId The sessionId (closedId) of the recently closed window to be forgotten.
    */
  def forgetClosedWindow(sessionId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Retrieves all devices with synced sessions.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getDevices(): js.Promise[js.Array[Device]] = js.native
  def getDevices(filter: Filter): js.Promise[js.Array[Device]] = js.native
  /** Gets the list of recently closed tabs and/or windows. */
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], scala.Unit]): js.Promise[js.Array[Session]] = js.native
  /** Gets the list of recently closed tabs and/or windows. */
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], scala.Unit]): js.Promise[js.Array[Session]] = js.native
  /**
    * Retrieve a value that was set for a given key on a given tab.
    * @param tabId The id of the tab whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  def getTabValue(tabId: scala.Double, key: java.lang.String): js.Promise[js.UndefOr[java.lang.String | js.Object]] = js.native
  /**
    * Retrieve a value that was set for a given key on a given window.
    * @param windowId The id of the window whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  def getWindowValue(windowId: scala.Double, key: java.lang.String): js.Promise[js.UndefOr[java.lang.String | js.Object]] = js.native
  /**
    * Remove a key/value pair that was set on a given tab.
    * @param tabId The id of the tab whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  def removeTabValue(tabId: scala.Double, key: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Remove a key/value pair that was set on a given window.
    * @param windowId The id of the window whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  def removeWindowValue(windowId: scala.Double, key: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Reopens a `windows.Window` or `tabs.Tab`, with an optional callback to run when the entry has been restored.
    * @param [sessionId] The `windows.Window.sessionId`, or `tabs.Tab.sessionId` to restore. If this parameter is not
    *     specified, the most recently closed session is restored.
    */
  def restore(): js.Promise[Session] = js.native
  def restore(sessionId: java.lang.String): js.Promise[Session] = js.native
  def restore(sessionId: java.lang.String, callback: js.Function1[/* restoredSession */ Session, scala.Unit]): js.Promise[Session] = js.native
  /**
    * Set a key/value pair on a given tab.
    * @param tabId The id of the tab that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  def setTabValue(tabId: scala.Double, key: java.lang.String, value: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Set a key/value pair on a given window.
    * @param windowId The id of the window that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  def setWindowValue(windowId: scala.Double, key: java.lang.String, value: js.Any): js.Promise[scala.Unit] = js.native
}

