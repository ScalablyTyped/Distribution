package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateMediationReportRequest extends StObject {
  
  /**
    * Network report specification.
    */
  var reportSpec: js.UndefOr[SchemaMediationReportSpec] = js.undefined
}
object SchemaGenerateMediationReportRequest {
  
  inline def apply(): SchemaGenerateMediationReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateMediationReportRequest]
  }
  
  extension [Self <: SchemaGenerateMediationReportRequest](x: Self) {
    
    inline def setReportSpec(value: SchemaMediationReportSpec): Self = StObject.set(x, "reportSpec", value.asInstanceOf[js.Any])
    
    inline def setReportSpecUndefined: Self = StObject.set(x, "reportSpec", js.undefined)
  }
}
