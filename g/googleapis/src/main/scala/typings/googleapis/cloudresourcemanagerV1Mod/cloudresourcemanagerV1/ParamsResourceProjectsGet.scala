package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Project ID (for example, `my-project-123`).
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGet {
  
  inline def apply(): ParamsResourceProjectsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGet]
  }
  
  extension [Self <: ParamsResourceProjectsGet](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
