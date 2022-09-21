package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAction extends StObject {
  
  /**
    * Apps Script function to invoke when the containing element is clicked/activated.
    */
  var function: js.UndefOr[String | Null] = js.undefined
  
  var interaction: js.UndefOr[String | Null] = js.undefined
  
  var loadIndicator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of action parameters.
    */
  var parameters: js.UndefOr[js.Array[SchemaAppsDynamiteSharedActionActionParameter]] = js.undefined
}
object SchemaAppsDynamiteSharedAction {
  
  inline def apply(): SchemaAppsDynamiteSharedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAction]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAction](x: Self) {
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setInteraction(value: String): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionNull: Self = StObject.set(x, "interaction", null)
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setLoadIndicator(value: String): Self = StObject.set(x, "loadIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadIndicatorNull: Self = StObject.set(x, "loadIndicator", null)
    
    inline def setLoadIndicatorUndefined: Self = StObject.set(x, "loadIndicator", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaAppsDynamiteSharedActionActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaAppsDynamiteSharedActionActionParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
