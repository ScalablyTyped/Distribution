package typings.ethersprojectProviders.websocketProviderMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InflightRequest extends js.Object {
  
  def callback(error: Error, result: js.Any): Unit = js.native
  
  var payload: String = js.native
}
object InflightRequest {
  
  @scala.inline
  def apply(callback: (Error, js.Any) => Unit, payload: String): InflightRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflightRequest]
  }
  
  @scala.inline
  implicit class InflightRequestOps[Self <: InflightRequest] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (Error, js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
