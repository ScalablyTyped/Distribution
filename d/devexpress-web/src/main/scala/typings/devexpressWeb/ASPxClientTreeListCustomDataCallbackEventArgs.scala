package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
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
  implicit class ASPxClientTreeListCustomDataCallbackEventArgsMutableBuilder[Self <: ASPxClientTreeListCustomDataCallbackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
