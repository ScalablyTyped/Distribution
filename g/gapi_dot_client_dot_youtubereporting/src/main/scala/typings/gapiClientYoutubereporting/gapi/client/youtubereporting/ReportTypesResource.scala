package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubereporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTypesResource extends js.Object {
  /** Lists report types. */
  def list(request: Fields): Request[ListReportTypesResponse] = js.native
}

object ReportTypesResource {
  @scala.inline
  def apply(list: Fields => Request[ListReportTypesResponse]): ReportTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ReportTypesResource]
  }
  @scala.inline
  implicit class ReportTypesResourceOps[Self <: ReportTypesResource] (val x: Self) extends AnyVal {
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
    def setList(value: Fields => Request[ListReportTypesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

