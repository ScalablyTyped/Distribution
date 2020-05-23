package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.AggregationalignmentPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSeriesResource extends js.Object {
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
    * written, a corresponding failure message is included in the error response.
    */
  def create(request: Accesstoken): Request[js.Object]
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: AggregationalignmentPeriod): Request[ListTimeSeriesResponse]
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
}

