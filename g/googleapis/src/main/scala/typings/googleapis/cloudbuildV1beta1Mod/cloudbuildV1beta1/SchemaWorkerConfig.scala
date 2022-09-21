package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerConfig extends StObject {
  
  /**
    * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
    */
  var diskSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Machine type of a worker, such as `n1-standard-1`. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, workers are created without any public address, which prevents network egress to public IPs.
    */
  var noExternalIp: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaWorkerConfig {
  
  inline def apply(): SchemaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerConfig]
  }
  
  extension [Self <: SchemaWorkerConfig](x: Self) {
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setNoExternalIp(value: Boolean): Self = StObject.set(x, "noExternalIp", value.asInstanceOf[js.Any])
    
    inline def setNoExternalIpNull: Self = StObject.set(x, "noExternalIp", null)
    
    inline def setNoExternalIpUndefined: Self = StObject.set(x, "noExternalIp", js.undefined)
  }
}
