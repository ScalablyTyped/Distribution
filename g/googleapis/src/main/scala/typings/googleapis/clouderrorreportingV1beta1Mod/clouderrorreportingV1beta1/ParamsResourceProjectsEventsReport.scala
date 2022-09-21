package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsEventsReport
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Google Cloud Platform project. Written as `projects/{projectId\}`, where `{projectId\}` is the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: // `projects/my-project-123`.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReportedErrorEvent] = js.undefined
}
object ParamsResourceProjectsEventsReport {
  
  inline def apply(): ParamsResourceProjectsEventsReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsEventsReport]
  }
  
  extension [Self <: ParamsResourceProjectsEventsReport](x: Self) {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setRequestBody(value: SchemaReportedErrorEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
