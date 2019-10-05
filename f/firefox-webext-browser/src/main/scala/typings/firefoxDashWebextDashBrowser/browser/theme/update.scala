package typings.firefoxDashWebextDashBrowser.browser.theme

import typings.firefoxDashWebextDashBrowser.browser._manifest.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.theme.update")
@js.native
object update extends js.Object {
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param details The properties of the theme to update.
    */
  def apply(details: ThemeType): Unit = js.native
  /**
    * Make complete updates to the theme. Resolves when the update has completed.
    * @param windowId The id of the window to update. No id updates all windows.
    * @param details The properties of the theme to update.
    */
  def apply(windowId: Double, details: ThemeType): Unit = js.native
}

