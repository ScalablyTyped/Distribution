package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events concerning the final processing of a callback.
  */
@js.native
trait ASPxClientCallbackCompleteEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  var parameter: String = js.native
  
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing.
    */
  var result: String = js.native
}
object ASPxClientCallbackCompleteEventArgs {
  
  @scala.inline
  def apply(parameter: String, result: String): ASPxClientCallbackCompleteEventArgs = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCallbackCompleteEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCallbackCompleteEventArgsOps[Self <: ASPxClientCallbackCompleteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
