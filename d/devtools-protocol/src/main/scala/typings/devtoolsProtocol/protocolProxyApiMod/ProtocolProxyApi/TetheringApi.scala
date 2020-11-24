package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.accepted
import typings.devtoolsProtocol.mod.Protocol.Tethering.AcceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Tethering.BindRequest
import typings.devtoolsProtocol.mod.Protocol.Tethering.UnbindRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TetheringApi extends js.Object {
  
  /**
    * Request browser port binding.
    */
  def bind(params: BindRequest): js.Promise[Unit] = js.native
  
  /**
    * Informs that port was successfully bound and got a specified connection id.
    */
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function1[/* params */ AcceptedEvent, Unit]): Unit = js.native
  
  /**
    * Request browser port unbinding.
    */
  def unbind(params: UnbindRequest): js.Promise[Unit] = js.native
}
object TetheringApi {
  
  @scala.inline
  def apply(
    bind: BindRequest => js.Promise[Unit],
    on: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Unit,
    unbind: UnbindRequest => js.Promise[Unit]
  ): TetheringApi = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), on = js.Any.fromFunction2(on), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[TetheringApi]
  }
  
  @scala.inline
  implicit class TetheringApiOps[Self <: TetheringApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBind(value: BindRequest => js.Promise[Unit]): Self = this.set("bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (accepted, js.Function1[/* params */ AcceptedEvent, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnbind(value: UnbindRequest => js.Promise[Unit]): Self = this.set("unbind", js.Any.fromFunction1(value))
  }
}
