package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsWorkerpoolsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `WorkerPool` to delete. Format: projects/{project\}/workerPools/{workerPool\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsWorkerpoolsDelete {
  
  inline def apply(): ParamsResourceProjectsWorkerpoolsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsWorkerpoolsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsWorkerpoolsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
