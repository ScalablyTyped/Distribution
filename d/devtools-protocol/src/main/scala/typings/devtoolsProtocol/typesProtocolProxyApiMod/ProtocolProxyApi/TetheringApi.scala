package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.accepted
import typings.devtoolsProtocol.mod.Protocol.Tethering.AcceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import typings.devtoolsProtocol.mod.Protocol.Tethering.UnbindRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TetheringApi extends StObject {
  
  /**
    * Request browser port binding.
    */
  def bind(params: BindRequest): js.Promise[Unit]
  
  /**
    * Informs that port was successfully bound and got a specified connection id.
    */
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function1[/* params */ AcceptedEvent, Unit]): Unit
  
  /**
    * Request browser port unbinding.
    */
  def unbind(params: UnbindRequest): js.Promise[Unit]
}
object TetheringApi {
  
  inline def apply(
    bind: BindRequest => js.Promise[Unit],
    on: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Unit,
    unbind: UnbindRequest => js.Promise[Unit]
  ): TetheringApi = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), on = js.Any.fromFunction2(on), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[TetheringApi]
  }
  
  extension [Self <: TetheringApi](x: Self) {
    
    inline def setBind(value: BindRequest => js.Promise[Unit]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setOn(value: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setUnbind(value: UnbindRequest => js.Promise[Unit]): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
