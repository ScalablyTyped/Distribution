package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDeleteevents
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Google Cloud Platform project. Written as `projects/{projectID\}`, where `{projectID\}` is the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`.
    */
  var projectName: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDeleteevents {
  
  inline def apply(): ParamsResourceProjectsDeleteevents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDeleteevents]
  }
  
  extension [Self <: ParamsResourceProjectsDeleteevents](x: Self) {
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
  }
}
