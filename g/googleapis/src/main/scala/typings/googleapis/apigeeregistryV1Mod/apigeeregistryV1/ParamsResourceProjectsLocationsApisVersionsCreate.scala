package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for the version, which will become the final component of the version's resource name. This value should be 1-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    */
  var apiVersionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent, which owns this collection of versions. Format: projects/x/locations/x/apis/x
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApiVersion] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsCreate](x: Self) {
    
    inline def setApiVersionId(value: String): Self = StObject.set(x, "apiVersionId", value.asInstanceOf[js.Any])
    
    inline def setApiVersionIdUndefined: Self = StObject.set(x, "apiVersionId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaApiVersion): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
