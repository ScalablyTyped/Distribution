package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Initializecustomer
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInitializeCustomerRequest] = js.undefined
}
object ParamsResourceV1Initializecustomer {
  
  inline def apply(): ParamsResourceV1Initializecustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Initializecustomer]
  }
  
  extension [Self <: ParamsResourceV1Initializecustomer](x: Self) {
    
    inline def setRequestBody(value: SchemaInitializeCustomerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
