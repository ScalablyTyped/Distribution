package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.workerErrorReported
import typings.devtoolsProtocol.devtoolsProtocolStrings.workerRegistrationUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.workerVersionUpdated
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DeliverPushMessageRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchPeriodicSyncEventRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchSyncEventRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.InspectWorkerRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.SetForceUpdateOnPageLoadRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.SkipWaitingRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.StartWorkerRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.StopWorkerRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.UnregisterRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.UpdateRegistrationRequest
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerErrorReportedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerRegistrationUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerVersionUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerApi extends StObject {
  
  def deliverPushMessage(params: DeliverPushMessageRequest): js.Promise[Unit] = js.native
  
  def disable(): js.Promise[Unit] = js.native
  
  def dispatchPeriodicSyncEvent(params: DispatchPeriodicSyncEventRequest): js.Promise[Unit] = js.native
  
  def dispatchSyncEvent(params: DispatchSyncEventRequest): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  
  def inspectWorker(params: InspectWorkerRequest): js.Promise[Unit] = js.native
  
  @JSName("on")
  def on_workerErrorReported(event: workerErrorReported, listener: js.Function1[/* params */ WorkerErrorReportedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_workerRegistrationUpdated(
    event: workerRegistrationUpdated,
    listener: js.Function1[/* params */ WorkerRegistrationUpdatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_workerVersionUpdated(event: workerVersionUpdated, listener: js.Function1[/* params */ WorkerVersionUpdatedEvent, Unit]): Unit = js.native
  
  def setForceUpdateOnPageLoad(params: SetForceUpdateOnPageLoadRequest): js.Promise[Unit] = js.native
  
  def skipWaiting(params: SkipWaitingRequest): js.Promise[Unit] = js.native
  
  def startWorker(params: StartWorkerRequest): js.Promise[Unit] = js.native
  
  def stopAllWorkers(): js.Promise[Unit] = js.native
  
  def stopWorker(params: StopWorkerRequest): js.Promise[Unit] = js.native
  
  def unregister(params: UnregisterRequest): js.Promise[Unit] = js.native
  
  def updateRegistration(params: UpdateRegistrationRequest): js.Promise[Unit] = js.native
}
