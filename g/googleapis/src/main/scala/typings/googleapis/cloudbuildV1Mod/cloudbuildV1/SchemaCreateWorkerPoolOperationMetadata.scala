package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateWorkerPoolOperationMetadata extends StObject {
  
  /**
    * Time the operation was completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the `WorkerPool` to create. Format: `projects/{project\}/locations/{location\}/workerPools/{worker_pool\}`.
    */
  var workerPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateWorkerPoolOperationMetadata {
  
  inline def apply(): SchemaCreateWorkerPoolOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateWorkerPoolOperationMetadata]
  }
  
  extension [Self <: SchemaCreateWorkerPoolOperationMetadata](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolNull: Self = StObject.set(x, "workerPool", null)
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
