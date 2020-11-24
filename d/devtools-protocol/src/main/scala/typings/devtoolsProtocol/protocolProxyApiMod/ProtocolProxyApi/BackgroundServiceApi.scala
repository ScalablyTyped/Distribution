package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.backgroundServiceEventReceived
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordingStateChanged
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.BackgroundServiceEventReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.ClearEventsRequest
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.RecordingStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.SetRecordingRequest
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.StartObservingRequest
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.StopObservingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundServiceApi extends js.Object {
  
  /**
    * Clears all stored data for the service.
    */
  def clearEvents(params: ClearEventsRequest): js.Promise[Unit] = js.native
  
  /**
    * Called with all existing backgroundServiceEvents when enabled, and all new
    * events afterwards if enabled and recording.
    */
  @JSName("on")
  def on_backgroundServiceEventReceived(
    event: backgroundServiceEventReceived,
    listener: js.Function1[/* params */ BackgroundServiceEventReceivedEvent, Unit]
  ): Unit = js.native
  /**
    * Called when the recording state for the service has been updated.
    */
  @JSName("on")
  def on_recordingStateChanged(
    event: recordingStateChanged,
    listener: js.Function1[/* params */ RecordingStateChangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Set the recording state for the service.
    */
  def setRecording(params: SetRecordingRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables event updates for the service.
    */
  def startObserving(params: StartObservingRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables event updates for the service.
    */
  def stopObserving(params: StopObservingRequest): js.Promise[Unit] = js.native
}
