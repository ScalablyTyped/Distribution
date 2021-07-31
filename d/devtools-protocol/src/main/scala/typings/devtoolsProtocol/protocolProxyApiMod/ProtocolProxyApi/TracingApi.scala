package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.bufferUsage
import typings.devtoolsProtocol.devtoolsProtocolStrings.dataCollected
import typings.devtoolsProtocol.devtoolsProtocolStrings.tracingComplete
import typings.devtoolsProtocol.mod.Protocol.Tracing.BufferUsageEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.DataCollectedEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.GetCategoriesResponse
import typings.devtoolsProtocol.mod.Protocol.Tracing.RecordClockSyncMarkerRequest
import typings.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpRequest
import typings.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpResponse
import typings.devtoolsProtocol.mod.Protocol.Tracing.StartRequest
import typings.devtoolsProtocol.mod.Protocol.Tracing.TracingCompleteEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracingApi extends StObject {
  
  /**
    * Stop trace events collection.
    */
  def end(): js.Promise[Unit] = js.native
  
  /**
    * Gets supported tracing categories.
    */
  def getCategories(): js.Promise[GetCategoriesResponse] = js.native
  
  @JSName("on")
  def on_bufferUsage(event: bufferUsage, listener: js.Function1[/* params */ BufferUsageEvent, Unit]): Unit = js.native
  /**
    * Contains an bucket of collected trace events. When tracing is stopped collected events will be
    * send as a sequence of dataCollected events followed by tracingComplete event.
    */
  @JSName("on")
  def on_dataCollected(event: dataCollected, listener: js.Function1[/* params */ DataCollectedEvent, Unit]): Unit = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("on")
  def on_tracingComplete(event: tracingComplete, listener: js.Function1[/* params */ TracingCompleteEvent, Unit]): Unit = js.native
  
  /**
    * Record a clock sync marker in the trace.
    */
  def recordClockSyncMarker(params: RecordClockSyncMarkerRequest): js.Promise[Unit] = js.native
  
  /**
    * Request a global memory dump.
    */
  def requestMemoryDump(params: RequestMemoryDumpRequest): js.Promise[RequestMemoryDumpResponse] = js.native
  
  /**
    * Start trace events collection.
    */
  def start(params: StartRequest): js.Promise[Unit] = js.native
}
