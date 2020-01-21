package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubereporting.AnonAccesstokenAltBearertoken
import typings.gapiClientYoutubereporting.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientYoutubereporting.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: AnonAccesstokenAltBearertoken): Request_[Job]
  /** Deletes a job. */
  def delete(request: AnonAccesstokenAltBearertokenCallback): Request_[js.Object]
  /** Gets a job. */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[Job]
  /** Lists jobs. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ListJobsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[Job],
    delete: AnonAccesstokenAltBearertokenCallback => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallback => Request_[Job],
    list: AnonAccesstokenAltBearertokenCallbackFields => Request_[ListJobsResponse],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobsResource]
  }
}

