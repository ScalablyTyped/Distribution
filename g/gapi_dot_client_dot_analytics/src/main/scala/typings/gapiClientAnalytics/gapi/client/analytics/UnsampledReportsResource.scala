package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import typings.gapiClientAnalytics.anon.UnsampledReportId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsampledReportsResource extends js.Object {
  /** Deletes an unsampled report. */
  def delete(request: UnsampledReportId): Request[Unit] = js.native
  /** Returns a single unsampled report. */
  def get(request: UnsampledReportId): Request[UnsampledReport] = js.native
  /** Create a new unsampled report. */
  def insert(request: ProfileId): Request[UnsampledReport] = js.native
  /** Lists unsampled reports to which the user has access. */
  def list(request: Startindex): Request[UnsampledReports] = js.native
}

object UnsampledReportsResource {
  @scala.inline
  def apply(
    delete: UnsampledReportId => Request[Unit],
    get: UnsampledReportId => Request[UnsampledReport],
    insert: ProfileId => Request[UnsampledReport],
    list: Startindex => Request[UnsampledReports]
  ): UnsampledReportsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UnsampledReportsResource]
  }
  @scala.inline
  implicit class UnsampledReportsResourceOps[Self <: UnsampledReportsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: UnsampledReportId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: UnsampledReportId => Request[UnsampledReport]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ProfileId => Request[UnsampledReport]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Startindex => Request[UnsampledReports]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

