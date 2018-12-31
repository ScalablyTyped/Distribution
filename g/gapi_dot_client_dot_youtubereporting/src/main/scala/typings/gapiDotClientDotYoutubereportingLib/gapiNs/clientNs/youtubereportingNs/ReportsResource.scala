package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Gets the metadata of a specific report. */
  def get(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenReportId): gapiDotClientLib.gapiNs.clientNs.Request[Report]
  /**
    * Lists reports created by a specific job.
    * Returns NOT_FOUND if the job does not exist.
    */
  def list(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListReportsResponse]
}

