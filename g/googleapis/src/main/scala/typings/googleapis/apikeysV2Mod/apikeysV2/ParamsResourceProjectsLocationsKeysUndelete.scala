package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKeysUndelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the API key to be undeleted.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaV2UndeleteKeyRequest] = js.undefined
}
object ParamsResourceProjectsLocationsKeysUndelete {
  
  inline def apply(): ParamsResourceProjectsLocationsKeysUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKeysUndelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKeysUndelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaV2UndeleteKeyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
