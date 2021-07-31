package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.metrics
import typings.devtoolsProtocol.mod.Protocol.Performance.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.Performance.GetMetricsResponse
import typings.devtoolsProtocol.mod.Protocol.Performance.MetricsEvent
import typings.devtoolsProtocol.mod.Protocol.Performance.SetTimeDomainRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceApi extends StObject {
  
  /**
    * Disable collecting and reporting metrics.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enable collecting and reporting metrics.
    */
  def enable(params: EnableRequest): js.Promise[Unit]
  
  /**
    * Retrieve current values of run-time metrics.
    */
  def getMetrics(): js.Promise[GetMetricsResponse]
  
  /**
    * Current values of the metrics.
    */
  @JSName("on")
  def on_metrics(event: metrics, listener: js.Function1[/* params */ MetricsEvent, Unit]): Unit
  
  /**
    * Sets time domain to use for collecting and reporting duration metrics.
    * Note that this must be called before enabling metrics collection. Calling
    * this method while metrics collection is enabled returns an error.
    */
  def setTimeDomain(params: SetTimeDomainRequest): js.Promise[Unit]
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
  implicit class PerformanceApiMutableBuilder[Self <: PerformanceApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: EnableRequest => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMetrics(value: () => js.Promise[GetMetricsResponse]): Self = StObject.set(x, "getMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (metrics, js.Function1[/* params */ MetricsEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTimeDomain(value: SetTimeDomainRequest => js.Promise[Unit]): Self = StObject.set(x, "setTimeDomain", js.Any.fromFunction1(value))
  }
}
