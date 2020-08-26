package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.AggregationalignmentPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSeriesResource extends js.Object {
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
    * written, a corresponding failure message is included in the error response.
    */
  def create(request: Accesstoken): Request[js.Object] = js.native
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: AggregationalignmentPeriod): Request[ListTimeSeriesResponse] = js.native
}

object TimeSeriesResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[js.Object],
    list: AggregationalignmentPeriod => Request[ListTimeSeriesResponse]
  ): TimeSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TimeSeriesResource]
  }
  @scala.inline
  implicit class TimeSeriesResourceOps[Self <: TimeSeriesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[js.Object]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AggregationalignmentPeriod => Request[ListTimeSeriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

