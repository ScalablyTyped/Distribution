package typings.googleapis.cloudfunctionsV2Mod.cloudfunctionsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFunctionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID to use for the function, which will become the final component of the function's resource name. This value should be 4-63 characters, and valid characters are /a-z-/.
    */
  var functionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project and location in which the function should be created, specified in the format `projects/x/locations/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFunction] = js.undefined
}
object ParamsResourceProjectsLocationsFunctionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsFunctionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFunctionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFunctionsCreate](x: Self) {
    
    inline def setFunctionId(value: String): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
    
    inline def setFunctionIdUndefined: Self = StObject.set(x, "functionId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaFunction): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
