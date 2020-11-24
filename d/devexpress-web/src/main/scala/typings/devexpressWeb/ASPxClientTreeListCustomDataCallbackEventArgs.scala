package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.CustomDataCallback event.
  */
@js.native
trait ASPxClientTreeListCustomDataCallbackEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the information that has been collected on the client-side and sent to the  server-side ASPxClientTreeList.CustomDataCallback event.
    */
  var arg: String = js.native
  
  /**
    * Gets the information passed from the server-side ASPxTreeList.CustomDataCallback event.
    */
  var result: js.Any = js.native
}
object ASPxClientTreeListCustomDataCallbackEventArgs {
  
  @scala.inline
  def apply(arg: String, result: js.Any): ASPxClientTreeListCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomDataCallbackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListCustomDataCallbackEventArgsOps[Self <: ASPxClientTreeListCustomDataCallbackEventArgs] (val x: Self) extends AnyVal {
    
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
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
