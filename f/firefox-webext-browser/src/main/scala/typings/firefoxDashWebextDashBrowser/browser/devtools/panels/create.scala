package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import typings.firefoxDashWebextDashBrowser.browser._manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.panels.create")
@js.native
object create extends js.Object {
  /* devtools.panels functions */
  /**
    * Creates an extension panel.
    * @param title Title that is displayed next to the extension icon in the Developer Tools toolbar.
    * @param iconPath Path of the panel's icon relative to the extension directory, or an empty string to use the
    *     default extension icon as the panel icon.
    * @param pagePath Path of the panel's HTML page relative to the extension directory.
    */
  def apply(title: String, iconPath: ExtensionURL, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
  def apply(title: String, iconPath: _Create, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
}

