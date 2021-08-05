package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A form action describes the behavior when the form is submitted. For
  * example, an Apps Script can be invoked to handle the form.
  */
trait SchemaFormAction extends StObject {
  
  /**
    * Apps Script function to invoke when the containing element is
    * clicked/activated.
    */
  var actionMethodName: js.UndefOr[String] = js.undefined
  
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
    
    inline def setActionMethodNameUndefined: Self = StObject.set(x, "actionMethodName", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaActionParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
