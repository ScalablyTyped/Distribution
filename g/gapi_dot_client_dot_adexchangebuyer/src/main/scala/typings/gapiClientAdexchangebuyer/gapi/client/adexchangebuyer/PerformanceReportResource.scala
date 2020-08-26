package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.EndDateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceReportResource extends js.Object {
  /** Retrieves the authenticated user's list of performance metrics. */
  def list(request: EndDateTime): Request[PerformanceReportList] = js.native
}

object PerformanceReportResource {
  @scala.inline
  def apply(list: EndDateTime => Request[PerformanceReportList]): PerformanceReportResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PerformanceReportResource]
  }
  @scala.inline
  implicit class PerformanceReportResourceOps[Self <: PerformanceReportResource] (val x: Self) extends AnyVal {
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
    def setList(value: EndDateTime => Request[PerformanceReportList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

