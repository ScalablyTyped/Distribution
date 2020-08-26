package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubereporting.anon.Bearertoken
import typings.gapiClientYoutubereporting.anon.Callback
import typings.gapiClientYoutubereporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var reports: ReportsResource = js.native
  /** Creates a job and returns it. */
  def create(request: Bearertoken): Request[Job] = js.native
  /** Deletes a job. */
  def delete(request: Callback): Request[js.Object] = js.native
  /** Gets a job. */
  def get(request: Callback): Request[Job] = js.native
  /** Lists jobs. */
  def list(request: Fields): Request[ListJobsResponse] = js.native
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
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Bearertoken => Request[Job]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Callback => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Callback => Request[Job]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[ListJobsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setReports(value: ReportsResource): Self = this.set("reports", value.asInstanceOf[js.Any])
  }
  
}

