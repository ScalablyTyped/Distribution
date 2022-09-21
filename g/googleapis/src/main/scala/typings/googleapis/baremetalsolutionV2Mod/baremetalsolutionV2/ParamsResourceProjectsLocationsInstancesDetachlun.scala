package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesDetachlun
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the instance.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDetachLunRequest] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesDetachlun {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesDetachlun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesDetachlun]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesDetachlun](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setRequestBody(value: SchemaDetachLunRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
