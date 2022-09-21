package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerPool extends StObject {
  
  /**
    * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Time at which the request to create the `WorkerPool` was received.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the request to delete the `WorkerPool` was received.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the `WorkerPool`, with format `projects/{project\}/locations/{location\}/workerPools/{worker_pool\}`. The value of `{worker_pool\}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location\}` is determined by the endpoint accessed.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network configuration for the `WorkerPool`.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * Output only. `WorkerPool` state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A unique identifier for the `WorkerPool`.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWorkerConfig(value: SchemaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
