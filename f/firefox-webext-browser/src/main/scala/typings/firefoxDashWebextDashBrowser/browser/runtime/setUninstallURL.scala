package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.setUninstallURL")
@js.native
object setUninstallURL extends js.Object {
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and
    * implement surveys. Maximum 255 characters.
    * @param [url] URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme.
    *     Set an empty string to not open a new tab upon uninstallation.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(url: String): js.Promise[Unit] = js.native
}

