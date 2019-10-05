package typings.firefoxDashWebextDashBrowser.browser.runtime

import typings.firefoxDashWebextDashBrowser.browser._manifest.WebExtensionManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.getManifest")
@js.native
object getManifest extends js.Object {
  /**
    * Returns details about the app or extension from the manifest. The object returned is a serialization of the full
    * manifest file.
    */
  def apply(): WebExtensionManifest = js.native
}

