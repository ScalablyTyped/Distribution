package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubereporting.anon.Bearertoken
import typings.gapiClientYoutubereporting.anon.Callback
import typings.gapiClientYoutubereporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  var reports: ReportsResource
  /** Creates a job and returns it. */
  def create(request: Bearertoken): Request[Job]
  /** Deletes a job. */
  def delete(request: Callback): Request[js.Object]
  /** Gets a job. */
  def get(request: Callback): Request[Job]
  /** Lists jobs. */
  def list(request: Fields): Request[ListJobsResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Job],
    delete: Callback => Request[js.Object],
    get: Callback => Request[Job],
    list: Fields => Request[ListJobsResponse],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobsResource]
  }
}

