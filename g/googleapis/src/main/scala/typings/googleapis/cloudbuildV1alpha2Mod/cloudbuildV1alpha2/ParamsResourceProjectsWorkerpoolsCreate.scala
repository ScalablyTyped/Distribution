package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsWorkerpoolsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource where this book will be created. Format: projects/{project\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkerPool] = js.undefined
  
  /**
    * Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
    */
  var workerPoolId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsWorkerpoolsCreate {
  
  inline def apply(): ParamsResourceProjectsWorkerpoolsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsWorkerpoolsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsWorkerpoolsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaWorkerPool): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWorkerPoolId(value: String): Self = StObject.set(x, "workerPoolId", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolIdUndefined: Self = StObject.set(x, "workerPoolId", js.undefined)
  }
}
