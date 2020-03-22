package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubereporting.AnonAccesstoken
import typings.gapiClientYoutubereporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Gets the metadata of a specific report. */
  def get(request: AnonAccesstoken): Request_[Report]
  /**
    * Lists reports created by a specific job.
    * Returns NOT_FOUND if the job does not exist.
    */
  def list(request: AnonAlt): Request_[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[Report], list: AnonAlt => Request_[ListReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

