package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.CustomMetricId
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import typings.gapiClientAnalytics.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: CustomMetricId): Request[CustomMetric] = js.native
  /** Create a new custom metric. */
  def insert(request: QuotaUser): Request[CustomMetric] = js.native
  /** Lists custom metrics to which the user has access. */
  def list(request: PrettyPrint): Request[CustomMetrics] = js.native
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: UserIp): Request[CustomMetric] = js.native
  /** Updates an existing custom metric. */
  def update(request: UserIp): Request[CustomMetric] = js.native
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: CustomMetricId => Request[CustomMetric],
    insert: QuotaUser => Request[CustomMetric],
    list: PrettyPrint => Request[CustomMetrics],
    patch: UserIp => Request[CustomMetric],
    update: UserIp => Request[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomMetricsResource]
  }
  @scala.inline
  implicit class CustomMetricsResourceOps[Self <: CustomMetricsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: CustomMetricId => Request[CustomMetric]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[CustomMetric]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PrettyPrint => Request[CustomMetrics]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: UserIp => Request[CustomMetric]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: UserIp => Request[CustomMetric]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

