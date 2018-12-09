package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val jobs: gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs.JobsResource = js.native
  val media: gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs.MediaResource = js.native
  val reportTypes: gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs.ReportTypesResource = js.native
  /** Load YouTube Reporting API v1 */
  def load(
    name: gapiDotClientDotYoutubereportingLib.gapiDotClientDotYoutubereportingLibStrings.youtubereporting,
    version: gapiDotClientDotYoutubereportingLib.gapiDotClientDotYoutubereportingLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotYoutubereportingLib.gapiDotClientDotYoutubereportingLibStrings.youtubereporting,
    version: gapiDotClientDotYoutubereportingLib.gapiDotClientDotYoutubereportingLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

