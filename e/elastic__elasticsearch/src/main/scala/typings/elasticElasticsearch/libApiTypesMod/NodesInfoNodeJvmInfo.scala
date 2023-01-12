package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeJvmInfo extends StObject {
  
  var bundled_jdk: Boolean
  
  var gc_collectors: js.Array[String]
  
  var input_arguments: js.Array[String]
  
  var mem: NodesInfoNodeInfoJvmMemory
  
  var memory_pools: js.Array[String]
  
  var pid: integer
  
  var start_time_in_millis: EpochTime[UnitMillis]
  
  var using_bundled_jdk: Boolean
  
  var using_compressed_ordinary_object_pointers: js.UndefOr[Boolean | String] = js.undefined
  
  var version: VersionString
  
  var vm_name: Name
  
  var vm_vendor: String
  
  var vm_version: VersionString
}
object NodesInfoNodeJvmInfo {
  
  inline def apply(
    bundled_jdk: Boolean,
    gc_collectors: js.Array[String],
    input_arguments: js.Array[String],
    mem: NodesInfoNodeInfoJvmMemory,
    memory_pools: js.Array[String],
    pid: integer,
    start_time_in_millis: EpochTime[UnitMillis],
    using_bundled_jdk: Boolean,
    version: VersionString,
    vm_name: Name,
    vm_vendor: String,
    vm_version: VersionString
  ): NodesInfoNodeJvmInfo = {
    val __obj = js.Dynamic.literal(bundled_jdk = bundled_jdk.asInstanceOf[js.Any], gc_collectors = gc_collectors.asInstanceOf[js.Any], input_arguments = input_arguments.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], memory_pools = memory_pools.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any], using_bundled_jdk = using_bundled_jdk.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vm_name = vm_name.asInstanceOf[js.Any], vm_vendor = vm_vendor.asInstanceOf[js.Any], vm_version = vm_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeJvmInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeJvmInfo] (val x: Self) extends AnyVal {
    
    inline def setBundled_jdk(value: Boolean): Self = StObject.set(x, "bundled_jdk", value.asInstanceOf[js.Any])
    
    inline def setGc_collectors(value: js.Array[String]): Self = StObject.set(x, "gc_collectors", value.asInstanceOf[js.Any])
    
    inline def setGc_collectorsVarargs(value: String*): Self = StObject.set(x, "gc_collectors", js.Array(value*))
    
    inline def setInput_arguments(value: js.Array[String]): Self = StObject.set(x, "input_arguments", value.asInstanceOf[js.Any])
    
    inline def setInput_argumentsVarargs(value: String*): Self = StObject.set(x, "input_arguments", js.Array(value*))
    
    inline def setMem(value: NodesInfoNodeInfoJvmMemory): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemory_pools(value: js.Array[String]): Self = StObject.set(x, "memory_pools", value.asInstanceOf[js.Any])
    
    inline def setMemory_poolsVarargs(value: String*): Self = StObject.set(x, "memory_pools", js.Array(value*))
    
    inline def setPid(value: integer): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setUsing_bundled_jdk(value: Boolean): Self = StObject.set(x, "using_bundled_jdk", value.asInstanceOf[js.Any])
    
    inline def setUsing_compressed_ordinary_object_pointers(value: Boolean | String): Self = StObject.set(x, "using_compressed_ordinary_object_pointers", value.asInstanceOf[js.Any])
    
    inline def setUsing_compressed_ordinary_object_pointersUndefined: Self = StObject.set(x, "using_compressed_ordinary_object_pointers", js.undefined)
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVm_name(value: Name): Self = StObject.set(x, "vm_name", value.asInstanceOf[js.Any])
    
    inline def setVm_vendor(value: String): Self = StObject.set(x, "vm_vendor", value.asInstanceOf[js.Any])
    
    inline def setVm_version(value: VersionString): Self = StObject.set(x, "vm_version", value.asInstanceOf[js.Any])
  }
}
