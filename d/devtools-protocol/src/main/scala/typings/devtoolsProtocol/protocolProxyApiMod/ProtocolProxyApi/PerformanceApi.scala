package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.metrics
import typings.devtoolsProtocol.mod.Protocol.Performance.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.Performance.GetMetricsResponse
import typings.devtoolsProtocol.mod.Protocol.Performance.MetricsEvent
import typings.devtoolsProtocol.mod.Protocol.Performance.SetTimeDomainRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceApi extends js.Object {
  /**
    * Disable collecting and reporting metrics.
    */
  def disable(): js.Promise[Unit] = js.native
  /**
    * Enable collecting and reporting metrics.
    */
  def enable(params: EnableRequest): js.Promise[Unit] = js.native
  /**
    * Retrieve current values of run-time metrics.
    */
  def getMetrics(): js.Promise[GetMetricsResponse] = js.native
  /**
    * Current values of the metrics.
    */
  @JSName("on")
  def on_metrics(event: metrics, listener: js.Function1[/* params */ MetricsEvent, Unit]): Unit = js.native
  /**
    * Sets time domain to use for collecting and reporting duration metrics.
    * Note that this must be called before enabling metrics collection. Calling
    * this method while metrics collection is enabled returns an error.
    */
  def setTimeDomain(params: SetTimeDomainRequest): js.Promise[Unit] = js.native
}

object PerformanceApi {
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: EnableRequest => js.Promise[Unit],
    getMetrics: () => js.Promise[GetMetricsResponse],
    on: (metrics, js.Function1[/* params */ MetricsEvent, Unit]) => Unit,
    setTimeDomain: SetTimeDomainRequest => js.Promise[Unit]
  ): PerformanceApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction1(enable), getMetrics = js.Any.fromFunction0(getMetrics), on = js.Any.fromFunction2(on), setTimeDomain = js.Any.fromFunction1(setTimeDomain))
    __obj.asInstanceOf[PerformanceApi]
  }
  @scala.inline
  implicit class PerformanceApiOps[Self <: PerformanceApi] (val x: Self) extends AnyVal {
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
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: EnableRequest => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMetrics(value: () => js.Promise[GetMetricsResponse]): Self = this.set("getMetrics", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: (metrics, js.Function1[/* params */ MetricsEvent, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTimeDomain(value: SetTimeDomainRequest => js.Promise[Unit]): Self = this.set("setTimeDomain", js.Any.fromFunction1(value))
  }
  
}

