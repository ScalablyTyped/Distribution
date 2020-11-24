package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomCallback event.
  */
@js.native
trait ASPxClientCustomDataCallbackEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing, related to the CustomCallback event.
    */
  var result: String = js.native
}
object ASPxClientCustomDataCallbackEventArgs {
  
  @scala.inline
  def apply(result: String): ASPxClientCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomDataCallbackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCustomDataCallbackEventArgsOps[Self <: ASPxClientCustomDataCallbackEventArgs] (val x: Self) extends AnyVal {
    
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
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
