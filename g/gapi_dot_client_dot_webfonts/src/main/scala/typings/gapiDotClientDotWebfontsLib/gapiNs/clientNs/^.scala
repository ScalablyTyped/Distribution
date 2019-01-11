package typings
package gapiDotClientDotWebfontsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val webfonts: gapiDotClientDotWebfontsLib.gapiNs.clientNs.webfontsNs.WebfontsResource = js.native
  /** Load Google Fonts Developer API v1 */
  def load(
    name: gapiDotClientDotWebfontsLib.gapiDotClientDotWebfontsLibStrings.webfonts,
    version: gapiDotClientDotWebfontsLib.gapiDotClientDotWebfontsLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotWebfontsLib.gapiDotClientDotWebfontsLibStrings.webfonts,
    version: gapiDotClientDotWebfontsLib.gapiDotClientDotWebfontsLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

