package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateNetworkReportRequest extends StObject {
  
  /**
    * Network report specification.
    */
  var reportSpec: js.UndefOr[SchemaNetworkReportSpec] = js.undefined
}
object SchemaGenerateNetworkReportRequest {
  
  inline def apply(): SchemaGenerateNetworkReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateNetworkReportRequest]
  }
  
  extension [Self <: SchemaGenerateNetworkReportRequest](x: Self) {
    
    inline def setReportSpec(value: SchemaNetworkReportSpec): Self = StObject.set(x, "reportSpec", value.asInstanceOf[js.Any])
    
    inline def setReportSpecUndefined: Self = StObject.set(x, "reportSpec", js.undefined)
  }
}
