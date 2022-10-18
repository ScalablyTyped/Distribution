package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeOperatingSystemInfo extends StObject {
  
  var allocated_processors: js.UndefOr[integer] = js.undefined
  
  var arch: String
  
  var available_processors: integer
  
  var cpu: js.UndefOr[NodesInfoNodeInfoOSCPU] = js.undefined
  
  var mem: js.UndefOr[NodesInfoNodeInfoMemory] = js.undefined
  
  var name: Name
  
  var pretty_name: Name
  
  var refresh_interval_in_millis: DurationValue[UnitMillis]
  
  var swap: js.UndefOr[NodesInfoNodeInfoMemory] = js.undefined
  
  var version: VersionString
}
object NodesInfoNodeOperatingSystemInfo {
  
  inline def apply(
    arch: String,
    available_processors: integer,
    name: Name,
    pretty_name: Name,
    refresh_interval_in_millis: DurationValue[UnitMillis],
    version: VersionString
  ): NodesInfoNodeOperatingSystemInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], available_processors = available_processors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pretty_name = pretty_name.asInstanceOf[js.Any], refresh_interval_in_millis = refresh_interval_in_millis.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeOperatingSystemInfo]
  }
  
  extension [Self <: NodesInfoNodeOperatingSystemInfo](x: Self) {
    
    inline def setAllocated_processors(value: integer): Self = StObject.set(x, "allocated_processors", value.asInstanceOf[js.Any])
    
    inline def setAllocated_processorsUndefined: Self = StObject.set(x, "allocated_processors", js.undefined)
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setAvailable_processors(value: integer): Self = StObject.set(x, "available_processors", value.asInstanceOf[js.Any])
    
    inline def setCpu(value: NodesInfoNodeInfoOSCPU): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMem(value: NodesInfoNodeInfoMemory): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPretty_name(value: Name): Self = StObject.set(x, "pretty_name", value.asInstanceOf[js.Any])
    
    inline def setRefresh_interval_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "refresh_interval_in_millis", value.asInstanceOf[js.Any])
    
    inline def setSwap(value: NodesInfoNodeInfoMemory): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
    
    inline def setSwapUndefined: Self = StObject.set(x, "swap", js.undefined)
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
