package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectdTimeSeriesResource extends js.Object {
  /**
    * Stackdriver Monitoring Agent only: Creates a new time series.<aside class="caution">This method is only for use by the Stackdriver Monitoring Agent.
    * Use projects.timeSeries.create instead.</aside>
    */
  def create(request: Accesstoken): Request[CreateCollectdTimeSeriesResponse] = js.native
}

object CollectdTimeSeriesResource {
  @scala.inline
  def apply(create: Accesstoken => Request[CreateCollectdTimeSeriesResponse]): CollectdTimeSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[CollectdTimeSeriesResource]
  }
  @scala.inline
  implicit class CollectdTimeSeriesResourceOps[Self <: CollectdTimeSeriesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[CreateCollectdTimeSeriesResponse]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

