package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.issueUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.sinksUpdated
import typings.devtoolsProtocol.mod.Protocol.Cast.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.Cast.IssueUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Cast.SetSinkToUseRequest
import typings.devtoolsProtocol.mod.Protocol.Cast.SinksUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Cast.StartDesktopMirroringRequest
import typings.devtoolsProtocol.mod.Protocol.Cast.StartTabMirroringRequest
import typings.devtoolsProtocol.mod.Protocol.Cast.StopCastingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastApi extends StObject {
  
  /**
    * Stops observing for sinks and issues.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Starts observing for sinks that can be used for tab mirroring, and if set,
    * sinks compatible with |presentationUrl| as well. When sinks are found, a
    * |sinksUpdated| event is fired.
    * Also starts observing for issue messages. When an issue is added or removed,
    * an |issueUpdated| event is fired.
    */
  def enable(params: EnableRequest): js.Promise[Unit] = js.native
  
  /**
    * This is fired whenever the outstanding issue/error message changes.
    * |issueMessage| is empty if there is no issue.
    */
  @JSName("on")
  def on_issueUpdated(event: issueUpdated, listener: js.Function1[/* params */ IssueUpdatedEvent, Unit]): Unit = js.native
  /**
    * This is fired whenever the list of available sinks changes. A sink is a
    * device or a software surface that you can cast to.
    */
  @JSName("on")
  def on_sinksUpdated(event: sinksUpdated, listener: js.Function1[/* params */ SinksUpdatedEvent, Unit]): Unit = js.native
  
  /**
    * Sets a sink to be used when the web page requests the browser to choose a
    * sink via Presentation API, Remote Playback API, or Cast SDK.
    */
  def setSinkToUse(params: SetSinkToUseRequest): js.Promise[Unit] = js.native
  
  /**
    * Starts mirroring the desktop to the sink.
    */
  def startDesktopMirroring(params: StartDesktopMirroringRequest): js.Promise[Unit] = js.native
  
  /**
    * Starts mirroring the tab to the sink.
    */
  def startTabMirroring(params: StartTabMirroringRequest): js.Promise[Unit] = js.native
  
  /**
    * Stops the active Cast session on the sink.
    */
  def stopCasting(params: StopCastingRequest): js.Promise[Unit] = js.native
}
