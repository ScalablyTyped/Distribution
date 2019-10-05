package typings.gapiDotClientDotYoutubereporting.gapi.client.youtubereporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutubereporting.Anon_Accesstoken
import typings.gapiDotClientDotYoutubereporting.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Gets the metadata of a specific report. */
  def get(request: Anon_Accesstoken): Request[Report]
  /**
    * Lists reports created by a specific job.
    * Returns NOT_FOUND if the job does not exist.
    */
  def list(request: Anon_AccesstokenAlt): Request[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(
    get: Anon_Accesstoken => Request[Report],
    list: Anon_AccesstokenAlt => Request[ListReportsResponse]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

