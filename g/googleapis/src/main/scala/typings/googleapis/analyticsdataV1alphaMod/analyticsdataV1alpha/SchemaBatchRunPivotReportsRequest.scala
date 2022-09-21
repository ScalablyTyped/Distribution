package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchRunPivotReportsRequest extends StObject {
  
  /**
    * A property whose events are tracked. This entity must be specified for the batch. The entity within RunPivotReportRequest may either be unspecified or consistent with this entity.
    */
  var entity: js.UndefOr[SchemaEntity] = js.undefined
  
  /**
    * Individual requests. Each request has a separate pivot report response. Each batch request is allowed up to 5 requests.
    */
  var requests: js.UndefOr[js.Array[SchemaRunPivotReportRequest]] = js.undefined
}
object SchemaBatchRunPivotReportsRequest {
  
  inline def apply(): SchemaBatchRunPivotReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchRunPivotReportsRequest]
  }
  
  extension [Self <: SchemaBatchRunPivotReportsRequest](x: Self) {
    
    inline def setEntity(value: SchemaEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setRequests(value: js.Array[SchemaRunPivotReportRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaRunPivotReportRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
