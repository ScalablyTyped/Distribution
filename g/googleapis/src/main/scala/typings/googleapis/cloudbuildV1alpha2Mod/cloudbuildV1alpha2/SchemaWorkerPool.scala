package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

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
    * Output only. The resource name of the `WorkerPool`. Format of the name is `projects/{project_id\}/workerPools/{worker_pool_id\}`, where the value of {worker_pool_id\} is provided in the CreateWorkerPool request.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network configuration for the `WorkerPool`.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * Required. Immutable. The region where the `WorkerPool` runs. Only "us-central1" is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. WorkerPool state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the request to update the `WorkerPool` was received.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Worker configuration for the `WorkerPool`.
    */
  var workerConfig: js.UndefOr[SchemaWorkerConfig] = js.undefined
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
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWorkerConfig(value: SchemaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
