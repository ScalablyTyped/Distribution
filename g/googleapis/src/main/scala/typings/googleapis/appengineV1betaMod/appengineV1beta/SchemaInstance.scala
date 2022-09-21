package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstance extends StObject {
  
  /**
    * Output only. App Engine release this instance is running on.
    */
  var appEngineRelease: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Availability of the instance.
    */
  var availability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Average latency (ms) over the last minute.
    */
  var averageLatency: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Number of errors since this instance was started.
    */
  var errors: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Relative name of the instance within the version. Example: instance-1.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Total memory in use (bytes).
    */
  var memoryUsage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Average queries per second (QPS) over the last minute.
    */
  var qps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Number of requests since this instance was started.
    */
  var requests: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Time that this instance was started.@OutputOnly
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment.
    */
  var vmDebugEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment.
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The IP address of this instance. Only applicable for instances in App Engine flexible environment.
    */
  var vmIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The liveness health check of this instance. Only applicable for instances in App Engine flexible environment.
    */
  var vmLiveness: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.
    */
  var vmName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.
    */
  var vmStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment.
    */
  var vmZoneName: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstance {
  
  inline def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  extension [Self <: SchemaInstance](x: Self) {
    
    inline def setAppEngineRelease(value: String): Self = StObject.set(x, "appEngineRelease", value.asInstanceOf[js.Any])
    
    inline def setAppEngineReleaseNull: Self = StObject.set(x, "appEngineRelease", null)
    
    inline def setAppEngineReleaseUndefined: Self = StObject.set(x, "appEngineRelease", js.undefined)
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setAverageLatency(value: Double): Self = StObject.set(x, "averageLatency", value.asInstanceOf[js.Any])
    
    inline def setAverageLatencyNull: Self = StObject.set(x, "averageLatency", null)
    
    inline def setAverageLatencyUndefined: Self = StObject.set(x, "averageLatency", js.undefined)
    
    inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMemoryUsage(value: String): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsageNull: Self = StObject.set(x, "memoryUsage", null)
    
    inline def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQps(value: Double): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
    
    inline def setQpsNull: Self = StObject.set(x, "qps", null)
    
    inline def setQpsUndefined: Self = StObject.set(x, "qps", js.undefined)
    
    inline def setRequests(value: Double): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsNull: Self = StObject.set(x, "requests", null)
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setVmDebugEnabled(value: Boolean): Self = StObject.set(x, "vmDebugEnabled", value.asInstanceOf[js.Any])
    
    inline def setVmDebugEnabledNull: Self = StObject.set(x, "vmDebugEnabled", null)
    
    inline def setVmDebugEnabledUndefined: Self = StObject.set(x, "vmDebugEnabled", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    inline def setVmIp(value: String): Self = StObject.set(x, "vmIp", value.asInstanceOf[js.Any])
    
    inline def setVmIpNull: Self = StObject.set(x, "vmIp", null)
    
    inline def setVmIpUndefined: Self = StObject.set(x, "vmIp", js.undefined)
    
    inline def setVmLiveness(value: String): Self = StObject.set(x, "vmLiveness", value.asInstanceOf[js.Any])
    
    inline def setVmLivenessNull: Self = StObject.set(x, "vmLiveness", null)
    
    inline def setVmLivenessUndefined: Self = StObject.set(x, "vmLiveness", js.undefined)
    
    inline def setVmName(value: String): Self = StObject.set(x, "vmName", value.asInstanceOf[js.Any])
    
    inline def setVmNameNull: Self = StObject.set(x, "vmName", null)
    
    inline def setVmNameUndefined: Self = StObject.set(x, "vmName", js.undefined)
    
    inline def setVmStatus(value: String): Self = StObject.set(x, "vmStatus", value.asInstanceOf[js.Any])
    
    inline def setVmStatusNull: Self = StObject.set(x, "vmStatus", null)
    
    inline def setVmStatusUndefined: Self = StObject.set(x, "vmStatus", js.undefined)
    
    inline def setVmZoneName(value: String): Self = StObject.set(x, "vmZoneName", value.asInstanceOf[js.Any])
    
    inline def setVmZoneNameNull: Self = StObject.set(x, "vmZoneName", null)
    
    inline def setVmZoneNameUndefined: Self = StObject.set(x, "vmZoneName", js.undefined)
  }
}
