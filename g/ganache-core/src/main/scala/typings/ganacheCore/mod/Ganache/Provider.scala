package typings.ganacheCore.mod.Ganache

import typings.ganacheCore.mod.JsonRpcPayload
import typings.ganacheCore.mod.JsonRpcResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  def close(callback: js.Function): Unit = js.native
  
  def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def removeAllListeners(`type`: String): Unit = js.native
  
  def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
  
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
}
object Provider {
  
  @scala.inline
  def apply(
    close: js.Function => Unit,
    on: (String, js.Function0[Unit]) => Unit,
    once: (String, js.Function0[Unit]) => Unit,
    removeAllListeners: String => Unit,
    removeListener: (String, js.Function0[Unit]) => Unit,
    send: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
  ): Provider = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setClose(value: js.Function => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (String, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnce(value: (String, js.Function0[Unit]) => Unit): Self = this.set("once", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAllListeners(value: String => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: (String, js.Function0[Unit]) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(
      value: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = this.set("send", js.Any.fromFunction2(value))
  }
}
