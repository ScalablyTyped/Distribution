package typings.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.management.getSelf")
@js.native
object getSelf extends js.Object {
  /**
    * Returns information about the calling extension. Note: This function can be used without requesting the
    * 'management' permission in the manifest.
    */
  def apply(): js.Promise[ExtensionInfo] = js.native
}

