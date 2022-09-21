package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGeneraterandombytes
  extends StObject
     with StandardParameters {
  
  /**
    * The project-specific location in which to generate random bytes. For example, "projects/my-project/locations/us-central1".
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateRandomBytesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGeneraterandombytes {
  
  inline def apply(): ParamsResourceProjectsLocationsGeneraterandombytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGeneraterandombytes]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGeneraterandombytes](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateRandomBytesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
