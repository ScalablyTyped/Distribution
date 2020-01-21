package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMonitoring.AnonAccesstoken
import typings.gapiClientMonitoring.AnonAccesstokenAggregationalignmentPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSeriesResource extends js.Object {
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
    * written, a corresponding failure message is included in the error response.
    */
  def create(request: AnonAccesstoken): Request_[js.Object]
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: AnonAccesstokenAggregationalignmentPeriod): Request_[ListTimeSeriesResponse]
}

object TimeSeriesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[js.Object],
    list: AnonAccesstokenAggregationalignmentPeriod => Request_[ListTimeSeriesResponse]
  ): TimeSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TimeSeriesResource]
  }
}

