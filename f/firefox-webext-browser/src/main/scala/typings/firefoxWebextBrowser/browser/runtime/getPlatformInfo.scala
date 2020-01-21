package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.getPlatformInfo")
@js.native
object getPlatformInfo extends js.Object {
  /** Returns information about the current platform. */
  def apply(): js.Promise[PlatformInfo] = js.native
}

