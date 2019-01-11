package typings
package firefoxDashWebextDashBrowserLib.browserNs.themeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.theme")
@js.native
object ^ extends js.Object {
  /* theme events */
  /**
    * Fired when a new theme has been applied
    * @param updateInfo Details of the theme update
    */
  val onUpdated: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[
      /* updateInfo */ firefoxDashWebextDashBrowserLib.browserNs.themeNs.ThemeUpdateInfo, 
      scala.Unit
    ]
  ] = js.native
  /* theme functions */
  /**
    * Returns the current theme for the specified window or the last focused window.
    * @param [windowId] The window for which we want the theme.
    */
  def getCurrent(): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ThemeType] = js.native
  def getCurrent(windowId: scala.Double): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ThemeType] = js.native
  /**
    * Removes the updates made to the theme.
    * @param [windowId] The id of the window to reset. No id resets all windows.
    */
  def reset(): scala.Unit = js.native
  def reset(windowId: scala.Double): scala.Unit = js.native
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param details The properties of the theme to update.
    */
  def update(details: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ThemeType): scala.Unit = js.native
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param windowId The id of the window to update. No id updates all windows.
    * @param details The properties of the theme to update.
    */
  def update(
    windowId: scala.Double,
    details: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ThemeType
  ): scala.Unit = js.native
}

