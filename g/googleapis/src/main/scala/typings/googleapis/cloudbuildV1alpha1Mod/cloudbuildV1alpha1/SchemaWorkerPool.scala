package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerPool extends StObject {
  
  /**
    * Output only. Time at which the request to create the `WorkerPool` was received.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the request to delete the `WorkerPool` was received.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-defined name of the `WorkerPool`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID of the GCP project for which the `WorkerPool` is created.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of regions to create the `WorkerPool`. Regions can't be empty. If Cloud Build adds a new GCP region in the future, the existing `WorkerPool` will not be enabled in the new region automatically; you must add the new region to the `regions` field to enable the `WorkerPool` in that region.
    */
  var regions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The service account used to manage the `WorkerPool`. The service account must have the Compute Instance Admin (Beta) permission at the project level.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. WorkerPool Status.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the request to update the `WorkerPool` was received.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration to be used for a creating workers in the `WorkerPool`.
    */
  var workerConfig: js.UndefOr[SchemaWorkerConfig] = js.undefined
  
  /**
    * Total number of workers to be created across all requested regions.
    */
  var workerCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerPool {
  
  inline def apply(): SchemaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerPool]
  }
  
  extension [Self <: SchemaWorkerPool](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsNull: Self = StObject.set(x, "regions", null)
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWorkerConfig(value: SchemaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
    
    inline def setWorkerCount(value: String): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerCountNull: Self = StObject.set(x, "workerCount", null)
    
    inline def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
  }
}
