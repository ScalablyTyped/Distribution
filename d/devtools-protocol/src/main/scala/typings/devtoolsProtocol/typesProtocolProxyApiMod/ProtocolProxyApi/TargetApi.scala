package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.attachedToTarget
import typings.devtoolsProtocol.devtoolsProtocolStrings.detachedFromTarget
import typings.devtoolsProtocol.devtoolsProtocolStrings.receivedMessageFromTarget
import typings.devtoolsProtocol.devtoolsProtocolStrings.targetCrashed
import typings.devtoolsProtocol.devtoolsProtocolStrings.targetCreated
import typings.devtoolsProtocol.devtoolsProtocolStrings.targetDestroyed
import typings.devtoolsProtocol.devtoolsProtocolStrings.targetInfoChanged
import typings.devtoolsProtocol.mod.Protocol.Target.ActivateTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.AttachToBrowserTargetResponse
import typings.devtoolsProtocol.mod.Protocol.Target.AttachToTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.AttachToTargetResponse
import typings.devtoolsProtocol.mod.Protocol.Target.AttachedToTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.AutoAttachRelatedRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetResponse
import typings.devtoolsProtocol.mod.Protocol.Target.CreateBrowserContextRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CreateBrowserContextResponse
import typings.devtoolsProtocol.mod.Protocol.Target.CreateTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CreateTargetResponse
import typings.devtoolsProtocol.mod.Protocol.Target.DetachFromTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.DetachedFromTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.DisposeBrowserContextRequest
import typings.devtoolsProtocol.mod.Protocol.Target.ExposeDevToolsProtocolRequest
import typings.devtoolsProtocol.mod.Protocol.Target.GetBrowserContextsResponse
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetInfoRequest
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetInfoResponse
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetsRequest
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetsResponse
import typings.devtoolsProtocol.mod.Protocol.Target.ReceivedMessageFromTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.SendMessageToTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.SetAutoAttachRequest
import typings.devtoolsProtocol.mod.Protocol.Target.SetDiscoverTargetsRequest
import typings.devtoolsProtocol.mod.Protocol.Target.SetRemoteLocationsRequest
import typings.devtoolsProtocol.mod.Protocol.Target.TargetCrashedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfoChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetApi extends StObject {
  
  /**
    * Activates (focuses) the target.
    */
  def activateTarget(params: ActivateTargetRequest): js.Promise[Unit] = js.native
  
  /**
    * Attaches to the browser target, only uses flat sessionId mode.
    */
  def attachToBrowserTarget(): js.Promise[AttachToBrowserTargetResponse] = js.native
  
  /**
    * Attaches to the target with given id.
    */
  def attachToTarget(params: AttachToTargetRequest): js.Promise[AttachToTargetResponse] = js.native
  
  /**
    * Adds the specified target to the list of targets that will be monitored for any related target
    * creation (such as child frames, child workers and new versions of service worker) and reported
    * through `attachedToTarget`. The specified target is also auto-attached.
    * This cancels the effect of any previous `setAutoAttach` and is also cancelled by subsequent
    * `setAutoAttach`. Only available at the Browser target.
    */
  def autoAttachRelated(params: AutoAttachRelatedRequest): js.Promise[Unit] = js.native
  
  /**
    * Closes the target. If the target is a page that gets closed too.
    */
  def closeTarget(params: CloseTargetRequest): js.Promise[CloseTargetResponse] = js.native
  
  /**
    * Creates a new empty BrowserContext. Similar to an incognito profile but you can have more than
    * one.
    */
  def createBrowserContext(params: CreateBrowserContextRequest): js.Promise[CreateBrowserContextResponse] = js.native
  
  /**
    * Creates a new page.
    */
  def createTarget(params: CreateTargetRequest): js.Promise[CreateTargetResponse] = js.native
  
  /**
    * Detaches session with given id.
    */
  def detachFromTarget(params: DetachFromTargetRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes a BrowserContext. All the belonging pages will be closed without calling their
    * beforeunload hooks.
    */
  def disposeBrowserContext(params: DisposeBrowserContextRequest): js.Promise[Unit] = js.native
  
  /**
    * Inject object to the target's main frame that provides a communication
    * channel with browser target.
    * 
    * Injected object will be available as `window[bindingName]`.
    * 
    * The object has the follwing API:
    * - `binding.send(json)` - a method to send messages over the remote debugging protocol
    * - `binding.onmessage = json => handleMessage(json)` - a callback that will be called for the protocol notifications and command responses.
    */
  def exposeDevToolsProtocol(params: ExposeDevToolsProtocolRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns all browser contexts created with `Target.createBrowserContext` method.
    */
  def getBrowserContexts(): js.Promise[GetBrowserContextsResponse] = js.native
  
  /**
    * Returns information about a target.
    */
  def getTargetInfo(params: GetTargetInfoRequest): js.Promise[GetTargetInfoResponse] = js.native
  
  /**
    * Retrieves a list of available targets.
    */
  def getTargets(params: GetTargetsRequest): js.Promise[GetTargetsResponse] = js.native
  
  /**
    * Issued when attached to target because of auto-attach or `attachToTarget` command.
    */
  @JSName("on")
  def on_attachedToTarget(event: attachedToTarget, listener: js.Function1[/* params */ AttachedToTargetEvent, Unit]): Unit = js.native
  /**
    * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
    * issued multiple times per target if multiple sessions have been attached to it.
    */
  @JSName("on")
  def on_detachedFromTarget(event: detachedFromTarget, listener: js.Function1[/* params */ DetachedFromTargetEvent, Unit]): Unit = js.native
  /**
    * Notifies about a new protocol message received from the session (as reported in
    * `attachedToTarget` event).
    */
  @JSName("on")
  def on_receivedMessageFromTarget(
    event: receivedMessageFromTarget,
    listener: js.Function1[/* params */ ReceivedMessageFromTargetEvent, Unit]
  ): Unit = js.native
  /**
    * Issued when a target has crashed.
    */
  @JSName("on")
  def on_targetCrashed(event: targetCrashed, listener: js.Function1[/* params */ TargetCrashedEvent, Unit]): Unit = js.native
  /**
    * Issued when a possible inspection target is created.
    */
  @JSName("on")
  def on_targetCreated(event: targetCreated, listener: js.Function1[/* params */ TargetCreatedEvent, Unit]): Unit = js.native
  /**
    * Issued when a target is destroyed.
    */
  @JSName("on")
  def on_targetDestroyed(event: targetDestroyed, listener: js.Function1[/* params */ TargetDestroyedEvent, Unit]): Unit = js.native
  /**
    * Issued when some information about a target has changed. This only happens between
    * `targetCreated` and `targetDestroyed`.
    */
  @JSName("on")
  def on_targetInfoChanged(event: targetInfoChanged, listener: js.Function1[/* params */ TargetInfoChangedEvent, Unit]): Unit = js.native
  
  /**
    * Sends protocol message over session with given id.
    * Consider using flat mode instead; see commands attachToTarget, setAutoAttach,
    * and crbug.com/991325.
    */
  def sendMessageToTarget(params: SendMessageToTargetRequest): js.Promise[Unit] = js.native
  
  /**
    * Controls whether to automatically attach to new targets which are considered to be related to
    * this one. When turned on, attaches to all existing related targets as well. When turned off,
    * automatically detaches from all currently attached targets.
    * This also clears all targets added by `autoAttachRelated` from the list of targets to watch
    * for creation of related targets.
    */
  def setAutoAttach(params: SetAutoAttachRequest): js.Promise[Unit] = js.native
  
  /**
    * Controls whether to discover available targets and notify via
    * `targetCreated/targetInfoChanged/targetDestroyed` events.
    */
  def setDiscoverTargets(params: SetDiscoverTargetsRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables target discovery for the specified locations, when `setDiscoverTargets` was set to
    * `true`.
    */
  def setRemoteLocations(params: SetRemoteLocationsRequest): js.Promise[Unit] = js.native
}
