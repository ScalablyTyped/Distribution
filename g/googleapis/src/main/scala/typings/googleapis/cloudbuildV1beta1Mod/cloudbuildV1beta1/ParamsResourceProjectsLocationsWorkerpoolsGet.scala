package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkerpoolsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `WorkerPool` to retrieve. Format: `projects/{project\}/locations/{location\}/workerPools/{workerPool\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkerpoolsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkerpoolsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkerpoolsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkerpoolsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
