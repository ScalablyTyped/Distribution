package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionConfig extends StObject {
  
  /**
    * Optional. Cloud Storage location in which to store execution outputs. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
    */
  var artifactStorage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Use default Cloud Build pool.
    */
  var defaultPool: js.UndefOr[SchemaDefaultPool] = js.undefined
  
  /**
    * Optional. Execution timeout for a Cloud Build Execution. This must be between 10m and 24h in seconds format. If unspecified, a default timeout of 1h is used.
    */
  var executionTimeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Use private Cloud Build pool.
    */
  var privatePool: js.UndefOr[SchemaPrivatePool] = js.undefined
  
  /**
    * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) is used.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Usages when this configuration should be applied.
    */
  var usages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The resource name of the `WorkerPool`, with the format `projects/{project\}/locations/{location\}/workerPools/{worker_pool\}`. If this optional field is unspecified, the default Cloud Build pool will be used.
    */
  var workerPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecutionConfig {
  
  inline def apply(): SchemaExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionConfig]
  }
  
  extension [Self <: SchemaExecutionConfig](x: Self) {
    
    inline def setArtifactStorage(value: String): Self = StObject.set(x, "artifactStorage", value.asInstanceOf[js.Any])
    
    inline def setArtifactStorageNull: Self = StObject.set(x, "artifactStorage", null)
    
    inline def setArtifactStorageUndefined: Self = StObject.set(x, "artifactStorage", js.undefined)
    
    inline def setDefaultPool(value: SchemaDefaultPool): Self = StObject.set(x, "defaultPool", value.asInstanceOf[js.Any])
    
    inline def setDefaultPoolUndefined: Self = StObject.set(x, "defaultPool", js.undefined)
    
    inline def setExecutionTimeout(value: String): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutNull: Self = StObject.set(x, "executionTimeout", null)
    
    inline def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
    
    inline def setPrivatePool(value: SchemaPrivatePool): Self = StObject.set(x, "privatePool", value.asInstanceOf[js.Any])
    
    inline def setPrivatePoolUndefined: Self = StObject.set(x, "privatePool", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUsages(value: js.Array[String]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesNull: Self = StObject.set(x, "usages", null)
    
    inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
    
    inline def setUsagesVarargs(value: String*): Self = StObject.set(x, "usages", js.Array(value*))
    
    inline def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolNull: Self = StObject.set(x, "workerPool", null)
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
