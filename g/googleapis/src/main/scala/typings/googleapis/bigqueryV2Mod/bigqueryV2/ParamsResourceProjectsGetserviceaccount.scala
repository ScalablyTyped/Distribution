package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetserviceaccount
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for which the service account is requested.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetserviceaccount {
  
  inline def apply(): ParamsResourceProjectsGetserviceaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetserviceaccount]
  }
  
  extension [Self <: ParamsResourceProjectsGetserviceaccount](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
