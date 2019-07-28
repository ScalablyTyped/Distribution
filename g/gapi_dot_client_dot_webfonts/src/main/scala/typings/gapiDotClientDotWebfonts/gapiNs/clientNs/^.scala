package typings.gapiDotClientDotWebfonts.gapiNs.clientNs

import typings.gapiDotClientDotWebfonts.gapiDotClientDotWebfontsStrings.v1
import typings.gapiDotClientDotWebfonts.gapiNs.clientNs.webfontsNs.WebfontsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val webfonts: WebfontsResource = js.native
  /** Load Google Fonts Developer API v1 */
  def load(name: typings.gapiDotClientDotWebfonts.gapiDotClientDotWebfontsStrings.webfonts, version: v1): js.Thenable[Unit] = js.native
  def load(
    name: typings.gapiDotClientDotWebfonts.gapiDotClientDotWebfontsStrings.webfonts,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

