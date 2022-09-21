package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.timelineEventAdded
import typings.devtoolsProtocol.mod.Protocol.PerformanceTimeline.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.PerformanceTimeline.TimelineEventAddedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceTimelineApi extends StObject {
  
  /**
    * Previously buffered events would be reported before method returns.
    * See also: timelineEventAdded
    */
  def enable(params: EnableRequest): js.Promise[Unit]
  
  /**
    * Sent when a performance timeline event is added. See reportPerformanceTimeline method.
    */
  @JSName("on")
  def on_timelineEventAdded(event: timelineEventAdded, listener: js.Function1[/* params */ TimelineEventAddedEvent, Unit]): Unit
}
object PerformanceTimelineApi {
  
  inline def apply(
    enable: EnableRequest => js.Promise[Unit],
    on: (timelineEventAdded, js.Function1[/* params */ TimelineEventAddedEvent, Unit]) => Unit
  ): PerformanceTimelineApi = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction1(enable), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[PerformanceTimelineApi]
  }
  
  extension [Self <: PerformanceTimelineApi](x: Self) {
    
    inline def setEnable(value: EnableRequest => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    inline def setOn(value: (timelineEventAdded, js.Function1[/* params */ TimelineEventAddedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
