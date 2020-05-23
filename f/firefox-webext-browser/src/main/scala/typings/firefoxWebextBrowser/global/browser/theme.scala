package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.manifest.ThemeType
import typings.firefoxWebextBrowser.browser.theme.ThemeUpdateInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The theme API allows customizing of visual elements of the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.theme")
@js.native
object theme extends js.Object {
  /* theme events */
  /**
    * Fired when a new theme has been applied
    * @param updateInfo Details of the theme update
    */
  val onUpdated: WebExtEvent[js.Function1[/* updateInfo */ ThemeUpdateInfo, Unit]] = js.native
  /* theme functions */
  /**
    * Returns the current theme for the specified window or the last focused window.
    * @param [windowId] The window for which we want the theme.
    */
  def getCurrent(): js.Promise[ThemeType] = js.native
  def getCurrent(windowId: Double): js.Promise[ThemeType] = js.native
  /**
    * Removes the updates made to the theme.
    * @param [windowId] The id of the window to reset. No id resets all windows.
    */
  def reset(): Unit = js.native
  def reset(windowId: Double): Unit = js.native
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param details The properties of the theme to update.
    */
  def update(details: ThemeType): Unit = js.native
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param windowId The id of the window to update. No id updates all windows.
    * @param details The properties of the theme to update.
    */
  def update(windowId: Double, details: ThemeType): Unit = js.native
}

