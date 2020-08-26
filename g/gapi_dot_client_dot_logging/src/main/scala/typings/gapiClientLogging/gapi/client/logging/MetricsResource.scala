package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLogging.anon.Accesstoken
import typings.gapiClientLogging.anon.Bearertoken
import typings.gapiClientLogging.anon.MetricName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: Accesstoken): Request[LogMetric] = js.native
  /** Deletes a logs-based metric. */
  def delete(request: MetricName): Request[js.Object] = js.native
  /** Gets a logs-based metric. */
  def get(request: MetricName): Request[LogMetric] = js.native
  /** Lists logs-based metrics. */
  def list(request: Bearertoken): Request[ListLogMetricsResponse] = js.native
  /** Creates or updates a logs-based metric. */
  def update(request: MetricName): Request[LogMetric] = js.native
}

object MetricsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[LogMetric],
    delete: MetricName => Request[js.Object],
    get: MetricName => Request[LogMetric],
    list: Bearertoken => Request[ListLogMetricsResponse],
    update: MetricName => Request[LogMetric]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MetricsResource]
  }
  @scala.inline
  implicit class MetricsResourceOps[Self <: MetricsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[LogMetric]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: MetricName => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: MetricName => Request[LogMetric]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListLogMetricsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: MetricName => Request[LogMetric]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

