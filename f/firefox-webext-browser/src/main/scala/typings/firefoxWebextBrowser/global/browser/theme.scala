package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.manifest.ThemeType
import typings.firefoxWebextBrowser.browser.theme.ThemeUpdateInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The theme API allows customizing of visual elements of the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object theme {
  
  @JSGlobal("browser.theme")
  @js.native
  val ^ : js.Any = js.native
  
  /* theme functions */
  /**
    * Returns the current theme for the specified window or the last focused window.
    * @param [windowId] The window for which we want the theme.
    */
  @scala.inline
  def getCurrent(): js.Promise[ThemeType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[ThemeType]]
  @scala.inline
  def getCurrent(windowId: Double): js.Promise[ThemeType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ThemeType]]
  
  /* theme events */
  /**
    * Fired when a new theme has been applied
    * @param updateInfo Details of the theme update
    */
  @JSGlobal("browser.theme.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function1[/* updateInfo */ ThemeUpdateInfo, Unit]] = js.native
  
  /**
    * Removes the updates made to the theme.
    * @param [windowId] The id of the window to reset. No id resets all windows.
    */
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  @scala.inline
  def reset(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param details The properties of the theme to update.
    */
  @scala.inline
  def update(details: ThemeType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param windowId The id of the window to update. No id updates all windows.
    * @param details The properties of the theme to update.
    */
  @scala.inline
  def update(windowId: Double, details: ThemeType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
