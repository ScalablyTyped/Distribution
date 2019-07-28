package typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotMonitoring.Anon_Accesstoken
import typings.gapiDotClientDotMonitoring.Anon_AccesstokenAggregationalignmentPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSeriesResource extends js.Object {
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
    * written, a corresponding failure message is included in the error response.
    */
  def create(request: Anon_Accesstoken): Request[js.Object]
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: Anon_AccesstokenAggregationalignmentPeriod): Request[ListTimeSeriesResponse]
}

object TimeSeriesResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[js.Object],
    list: Anon_AccesstokenAggregationalignmentPeriod => Request[ListTimeSeriesResponse]
  ): TimeSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TimeSeriesResource]
  }
}

