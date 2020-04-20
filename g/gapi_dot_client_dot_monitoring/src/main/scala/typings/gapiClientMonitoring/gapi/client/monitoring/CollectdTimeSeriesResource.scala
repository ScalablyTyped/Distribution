package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMonitoring.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectdTimeSeriesResource extends js.Object {
  /**
    * Stackdriver Monitoring Agent only: Creates a new time series.<aside class="caution">This method is only for use by the Stackdriver Monitoring Agent.
    * Use projects.timeSeries.create instead.</aside>
    */
  def create(request: AnonAccesstoken): Request_[CreateCollectdTimeSeriesResponse]
}

object CollectdTimeSeriesResource {
  @scala.inline
  def apply(create: AnonAccesstoken => Request_[CreateCollectdTimeSeriesResponse]): CollectdTimeSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[CollectdTimeSeriesResource]
  }
}

