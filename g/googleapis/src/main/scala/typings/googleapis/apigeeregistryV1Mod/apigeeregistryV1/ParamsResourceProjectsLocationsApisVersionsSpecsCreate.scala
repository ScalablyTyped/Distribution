package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsSpecsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for the spec, which will become the final component of the spec's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    */
  var apiSpecId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent, which owns this collection of specs. Format: projects/x/locations/x/apis/x/versions/x
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApiSpec] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsSpecsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsSpecsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsSpecsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsSpecsCreate](x: Self) {
    
    inline def setApiSpecId(value: String): Self = StObject.set(x, "apiSpecId", value.asInstanceOf[js.Any])
    
    inline def setApiSpecIdUndefined: Self = StObject.set(x, "apiSpecId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaApiSpec): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
