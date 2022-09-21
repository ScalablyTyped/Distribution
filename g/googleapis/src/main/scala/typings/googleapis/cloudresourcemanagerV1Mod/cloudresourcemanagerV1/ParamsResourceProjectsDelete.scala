package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The Project ID (for example, `foo-bar-123`). Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDelete {
  
  inline def apply(): ParamsResourceProjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDelete](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
