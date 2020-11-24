package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RpcRequest extends js.Object {
  
  /**
    * Executes the request and runs the supplied callback with the response.
    * @param callback The callback function which executes when the request succeeds or fails.
    */
  def callback(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit]): Unit = js.native
}
object RpcRequest {
  
  @scala.inline
  def apply(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit] => Unit): RpcRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
    __obj.asInstanceOf[RpcRequest]
  }
  
  @scala.inline
  implicit class RpcRequestOps[Self <: RpcRequest] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit] => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
  }
}
