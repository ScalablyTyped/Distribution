package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsNetworkreportGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name of the account to generate the report for. Example: accounts/pub-9876543210987654
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateNetworkReportRequest] = js.undefined
}
object ParamsResourceAccountsNetworkreportGenerate {
  
  inline def apply(): ParamsResourceAccountsNetworkreportGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsNetworkreportGenerate]
  }
  
  extension [Self <: ParamsResourceAccountsNetworkreportGenerate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateNetworkReportRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
