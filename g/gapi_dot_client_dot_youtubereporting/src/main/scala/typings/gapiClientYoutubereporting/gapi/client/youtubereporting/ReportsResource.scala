package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubereporting.anon.Accesstoken
import typings.gapiClientYoutubereporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Gets the metadata of a specific report. */
  def get(request: Accesstoken): Request[Report]
  /**
    * Lists reports created by a specific job.
    * Returns NOT_FOUND if the job does not exist.
    */
  def list(request: Alt): Request[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Report], list: Alt => Request[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ReportsResource]
  }
}

