package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.CustomDataCallback event.
  */
trait ASPxClientTreeListCustomDataCallbackEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the information that has been collected on the client-side and sent to the  server-side ASPxClientTreeList.CustomDataCallback event.
    */
  var arg: String
  
  /**
    * Gets the information passed from the server-side ASPxTreeList.CustomDataCallback event.
    */
  var result: Any
}
object ASPxClientTreeListCustomDataCallbackEventArgs {
  
  inline def apply(arg: String, result: Any): ASPxClientTreeListCustomDataCallbackEventArgs = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomDataCallbackEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListCustomDataCallbackEventArgs](x: Self) {
    
    inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
