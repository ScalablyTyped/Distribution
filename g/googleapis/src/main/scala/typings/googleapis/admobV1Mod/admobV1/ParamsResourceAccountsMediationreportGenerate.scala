package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsMediationreportGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name of the account to generate the report for. Example: accounts/pub-9876543210987654
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateMediationReportRequest] = js.undefined
}
object ParamsResourceAccountsMediationreportGenerate {
  
  inline def apply(): ParamsResourceAccountsMediationreportGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsMediationreportGenerate]
  }
  
  extension [Self <: ParamsResourceAccountsMediationreportGenerate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateMediationReportRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
