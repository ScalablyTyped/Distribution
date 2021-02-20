package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.detached
import typings.devtoolsProtocol.devtoolsProtocolStrings.targetCrashed
import typings.devtoolsProtocol.devtoolsProtocolStrings.targetReloadedAfterCrash
import typings.devtoolsProtocol.mod.Protocol.Inspector.DetachedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectorApi extends StObject {
  
  /**
    * Disables inspector domain notifications.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables inspector domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Fired when remote debugging connection is about to be terminated. Contains detach reason.
    */
  @JSName("on")
  def on_detached(event: detached, listener: js.Function1[/* params */ DetachedEvent, Unit]): Unit = js.native
  /**
    * Fired when debugging target has crashed
    */
  @JSName("on")
  def on_targetCrashed(event: targetCrashed, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when debugging target has reloaded after crash
    */
  @JSName("on")
  def on_targetReloadedAfterCrash(event: targetReloadedAfterCrash, listener: js.Function0[Unit]): Unit = js.native
}
