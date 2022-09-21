package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTransferconfigsScheduleruns
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Transfer configuration name in the form: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaScheduleTransferRunsRequest] = js.undefined
}
object ParamsResourceProjectsTransferconfigsScheduleruns {
  
  inline def apply(): ParamsResourceProjectsTransferconfigsScheduleruns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTransferconfigsScheduleruns]
  }
  
  extension [Self <: ParamsResourceProjectsTransferconfigsScheduleruns](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaScheduleTransferRunsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
