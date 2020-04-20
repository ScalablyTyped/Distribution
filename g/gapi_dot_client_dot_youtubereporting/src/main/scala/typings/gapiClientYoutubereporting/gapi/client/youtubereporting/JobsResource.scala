package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubereporting.AnonBearertoken
import typings.gapiClientYoutubereporting.AnonCallback
import typings.gapiClientYoutubereporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: AnonBearertoken): Request_[Job]
  /** Deletes a job. */
  def delete(request: AnonCallback): Request_[js.Object]
  /** Gets a job. */
  def get(request: AnonCallback): Request_[Job]
  /** Lists jobs. */
  def list(request: AnonFields): Request_[ListJobsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Job],
    delete: AnonCallback => Request_[js.Object],
    get: AnonCallback => Request_[Job],
    list: AnonFields => Request_[ListJobsResponse],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobsResource]
  }
}

