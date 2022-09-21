package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFormAction extends StObject {
  
  /**
    * The method name is used to identify which part of the form triggered the form submission. This information is echoed back to the Chat app as part of the card click event. The same method name can be used for several elements that trigger a common behavior if desired.
    */
  var actionMethodName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of action parameters.
    */
  var parameters: js.UndefOr[js.Array[SchemaActionParameter]] = js.undefined
}
object SchemaFormAction {
  
  inline def apply(): SchemaFormAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormAction]
  }
  
  extension [Self <: SchemaFormAction](x: Self) {
    
    inline def setActionMethodName(value: String): Self = StObject.set(x, "actionMethodName", value.asInstanceOf[js.Any])
    
    inline def setActionMethodNameNull: Self = StObject.set(x, "actionMethodName", null)
    
    inline def setActionMethodNameUndefined: Self = StObject.set(x, "actionMethodName", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaActionParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
