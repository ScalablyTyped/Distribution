package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalyticsreporting.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Returns the Analytics data. */
  def batchGet(request: Accesstoken): Request[GetReportsResponse] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(batchGet: Accesstoken => Request[GetReportsResponse]): ReportsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
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
    def setBatchGet(value: Accesstoken => Request[GetReportsResponse]): Self = this.set("batchGet", js.Any.fromFunction1(value))
  }
  
}

