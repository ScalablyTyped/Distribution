package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ReportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsResource extends js.Object {
  /** Lists all columns for a report type */
  def list(request: ReportType): Request[Columns] = js.native
}

object ColumnsResource {
  @scala.inline
  def apply(list: ReportType => Request[Columns]): ColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ColumnsResource]
  }
  @scala.inline
  implicit class ColumnsResourceOps[Self <: ColumnsResource] (val x: Self) extends AnyVal {
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
    def setList(value: ReportType => Request[Columns]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

