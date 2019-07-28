package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.sessionsNs.Device
import typings.firefoxDashWebextDashBrowser.browserNs.sessionsNs.Filter
import typings.firefoxDashWebextDashBrowser.browserNs.sessionsNs.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsessions extends js.Object {
  /* sessions properties */
  /** The maximum number of `sessions.Session` that will be included in a requested list. */
  val MAX_SESSION_RESULTS: Double = js.native
  /* sessions events */
  /**
    * Fired when recently closed tabs and/or windows are changed. This event does not monitor synced sessions changes.
    */
  val onChanged: WebExtEvent[js.Function0[Unit]] = js.native
  /* sessions functions */
  /**
    * Forget a recently closed tab.
    * @param windowId The windowId of the window to which the recently closed tab to be forgotten belongs.
    * @param sessionId The sessionId (closedId) of the recently closed tab to be forgotten.
    */
  def forgetClosedTab(windowId: Double, sessionId: String): js.Promise[Unit] = js.native
  /**
    * Forget a recently closed window.
    * @param sessionId The sessionId (closedId) of the recently closed window to be forgotten.
    */
  def forgetClosedWindow(sessionId: String): js.Promise[Unit] = js.native
  /**
    * Retrieves all devices with synced sessions.
    * @deprecated Unsupported on Firefox at this time.
    */
  def getDevices(): js.Promise[js.Array[Device]] = js.native
  def getDevices(filter: Filter): js.Promise[js.Array[Device]] = js.native
  /** Gets the list of recently closed tabs and/or windows. */
  def getRecentlyClosed(callback: js.Function1[/* sessions */ js.Array[Session], Unit]): js.Promise[js.Array[Session]] = js.native
  /** Gets the list of recently closed tabs and/or windows. */
  def getRecentlyClosed(filter: Filter, callback: js.Function1[/* sessions */ js.Array[Session], Unit]): js.Promise[js.Array[Session]] = js.native
  /**
    * Retrieve a value that was set for a given key on a given tab.
    * @param tabId The id of the tab whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  def getTabValue(tabId: Double, key: String): js.Promise[js.UndefOr[String | js.Object]] = js.native
  /**
    * Retrieve a value that was set for a given key on a given window.
    * @param windowId The id of the window whose value is being retrieved from.
    * @param key The key which corresponds to the value.
    */
  def getWindowValue(windowId: Double, key: String): js.Promise[js.UndefOr[String | js.Object]] = js.native
  /**
    * Remove a key/value pair that was set on a given tab.
    * @param tabId The id of the tab whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  def removeTabValue(tabId: Double, key: String): js.Promise[Unit] = js.native
  /**
    * Remove a key/value pair that was set on a given window.
    * @param windowId The id of the window whose key/value pair is being removed.
    * @param key The key which corresponds to the value.
    */
  def removeWindowValue(windowId: Double, key: String): js.Promise[Unit] = js.native
  /**
    * Reopens a `windows.Window` or `tabs.Tab`, with an optional callback to run when the entry has been restored.
    * @param [sessionId] The `windows.Window.sessionId`, or `tabs.Tab.sessionId` to restore. If this parameter is not
    *     specified, the most recently closed session is restored.
    */
  def restore(): js.Promise[Session] = js.native
  def restore(sessionId: String): js.Promise[Session] = js.native
  def restore(sessionId: String, callback: js.Function1[/* restoredSession */ Session, Unit]): js.Promise[Session] = js.native
  /**
    * Set a key/value pair on a given tab.
    * @param tabId The id of the tab that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  def setTabValue(tabId: Double, key: String, value: js.Any): js.Promise[Unit] = js.native
  /**
    * Set a key/value pair on a given window.
    * @param windowId The id of the window that the key/value pair is being set on.
    * @param key The key which corresponds to the value being set.
    * @param value The value being set.
    */
  def setWindowValue(windowId: Double, key: String, value: js.Any): js.Promise[Unit] = js.native
}

