package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.consoleProfileFinished
import typings.devtoolsProtocol.devtoolsProtocolStrings.consoleProfileStarted
import typings.devtoolsProtocol.devtoolsProtocolStrings.preciseCoverageDeltaUpdate
import typings.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileStartedEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.GetBestEffortCoverageResponse
import typings.devtoolsProtocol.mod.Protocol.Profiler.GetCountersResponse
import typings.devtoolsProtocol.mod.Protocol.Profiler.GetRuntimeCallStatsResponse
import typings.devtoolsProtocol.mod.Protocol.Profiler.PreciseCoverageDeltaUpdateEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.SetSamplingIntervalRequest
import typings.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageRequest
import typings.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageResponse
import typings.devtoolsProtocol.mod.Protocol.Profiler.StopResponse
import typings.devtoolsProtocol.mod.Protocol.Profiler.TakePreciseCoverageResponse
import typings.devtoolsProtocol.mod.Protocol.Profiler.TakeTypeProfileResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerApi extends js.Object {
  
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Disable counters collection.
    */
  def disableCounters(): js.Promise[Unit] = js.native
  
  /**
    * Disable run time call stats collection.
    */
  def disableRuntimeCallStats(): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Enable counters collection.
    */
  def enableCounters(): js.Promise[Unit] = js.native
  
  /**
    * Enable run time call stats collection.
    */
  def enableRuntimeCallStats(): js.Promise[Unit] = js.native
  
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to
    * garbage collection.
    */
  def getBestEffortCoverage(): js.Promise[GetBestEffortCoverageResponse] = js.native
  
  /**
    * Retrieve counters.
    */
  def getCounters(): js.Promise[GetCountersResponse] = js.native
  
  /**
    * Retrieve run time call stats.
    */
  def getRuntimeCallStats(): js.Promise[GetRuntimeCallStatsResponse] = js.native
  
  @JSName("on")
  def on_consoleProfileFinished(
    event: consoleProfileFinished,
    listener: js.Function1[/* params */ ConsoleProfileFinishedEvent, Unit]
  ): Unit = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  def on_consoleProfileStarted(
    event: consoleProfileStarted,
    listener: js.Function1[/* params */ ConsoleProfileStartedEvent, Unit]
  ): Unit = js.native
  /**
    * Reports coverage delta since the last poll (either from an event like this, or from
    * `takePreciseCoverage` for the current isolate. May only be sent if precise code
    * coverage has been started. This event can be trigged by the embedder to, for example,
    * trigger collection of coverage data immediatelly at a certain point in time.
    */
  @JSName("on")
  def on_preciseCoverageDeltaUpdate(
    event: preciseCoverageDeltaUpdate,
    listener: js.Function1[/* params */ PreciseCoverageDeltaUpdateEvent, Unit]
  ): Unit = js.native
  
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  def setSamplingInterval(params: SetSamplingIntervalRequest): js.Promise[Unit] = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code
    * coverage may be incomplete. Enabling prevents running optimized code and resets execution
    * counters.
    */
  def startPreciseCoverage(params: StartPreciseCoverageRequest): js.Promise[StartPreciseCoverageResponse] = js.native
  
  /**
    * Enable type profile.
    */
  def startTypeProfile(): js.Promise[Unit] = js.native
  
  def stop(): js.Promise[StopResponse] = js.native
  
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
    * executing optimized code.
    */
  def stopPreciseCoverage(): js.Promise[Unit] = js.native
  
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    */
  def stopTypeProfile(): js.Promise[Unit] = js.native
  
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code
    * coverage needs to have started.
    */
  def takePreciseCoverage(): js.Promise[TakePreciseCoverageResponse] = js.native
  
  /**
    * Collect type profile.
    */
  def takeTypeProfile(): js.Promise[TakeTypeProfileResponse] = js.native
}
