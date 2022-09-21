package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsUpdatebillinginfo
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the project associated with the billing information that you want to update. For example, `projects/tokyo-rain-123`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProjectBillingInfo] = js.undefined
}
object ParamsResourceProjectsUpdatebillinginfo {
  
  inline def apply(): ParamsResourceProjectsUpdatebillinginfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsUpdatebillinginfo]
  }
  
  extension [Self <: ParamsResourceProjectsUpdatebillinginfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaProjectBillingInfo): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
