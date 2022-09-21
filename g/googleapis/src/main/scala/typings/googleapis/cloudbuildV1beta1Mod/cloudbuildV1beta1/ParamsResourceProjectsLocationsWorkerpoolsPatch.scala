package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkerpoolsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. The resource name of the `WorkerPool`, with format `projects/{project\}/locations/{location\}/workerPools/{worker_pool\}`. The value of `{worker_pool\}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location\}` is determined by the endpoint accessed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkerPool] = js.undefined
  
  /**
    * A mask specifying which fields in `WorkerPool` to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkerpoolsPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkerpoolsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkerpoolsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkerpoolsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaWorkerPool): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
