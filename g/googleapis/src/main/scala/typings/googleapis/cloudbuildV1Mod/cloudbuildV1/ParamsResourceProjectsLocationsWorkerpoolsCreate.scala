package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkerpoolsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource where this worker pool will be created. Format: `projects/{project\}/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkerPool] = js.undefined
  
  /**
    * If set, validate the request and preview the response, but do not actually post it.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
    */
  var workerPoolId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkerpoolsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkerpoolsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkerpoolsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkerpoolsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaWorkerPool): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    
    inline def setWorkerPoolId(value: String): Self = StObject.set(x, "workerPoolId", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolIdUndefined: Self = StObject.set(x, "workerPoolId", js.undefined)
  }
}
