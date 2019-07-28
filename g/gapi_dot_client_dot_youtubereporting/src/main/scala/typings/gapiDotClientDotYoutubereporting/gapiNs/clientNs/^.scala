package typings.gapiDotClientDotYoutubereporting.gapiNs.clientNs

import typings.gapiDotClientDotYoutubereporting.gapiDotClientDotYoutubereportingStrings.v1
import typings.gapiDotClientDotYoutubereporting.gapiDotClientDotYoutubereportingStrings.youtubereporting
import typings.gapiDotClientDotYoutubereporting.gapiNs.clientNs.youtubereportingNs.JobsResource
import typings.gapiDotClientDotYoutubereporting.gapiNs.clientNs.youtubereportingNs.MediaResource
import typings.gapiDotClientDotYoutubereporting.gapiNs.clientNs.youtubereportingNs.ReportTypesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val jobs: JobsResource = js.native
  val media: MediaResource = js.native
  val reportTypes: ReportTypesResource = js.native
  /** Load YouTube Reporting API v1 */
  def load(name: youtubereporting, version: v1): js.Thenable[Unit] = js.native
  def load(name: youtubereporting, version: v1, callback: js.Function0[_]): Unit = js.native
}

