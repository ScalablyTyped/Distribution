package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsWorkerpoolsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `WorkerPool` to retrieve. Format: projects/{project\}/workerPools/{workerPool\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsWorkerpoolsGet {
  
  inline def apply(): ParamsResourceProjectsWorkerpoolsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsWorkerpoolsGet]
  }
  
  extension [Self <: ParamsResourceProjectsWorkerpoolsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
