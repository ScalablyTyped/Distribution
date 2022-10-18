package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterProcess extends StObject {
  
  var cpu: ClusterStatsClusterProcessCpu
  
  var open_file_descriptors: ClusterStatsClusterProcessOpenFileDescriptors
}
object ClusterStatsClusterProcess {
  
  inline def apply(
    cpu: ClusterStatsClusterProcessCpu,
    open_file_descriptors: ClusterStatsClusterProcessOpenFileDescriptors
  ): ClusterStatsClusterProcess = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], open_file_descriptors = open_file_descriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterProcess]
  }
  
  extension [Self <: ClusterStatsClusterProcess](x: Self) {
    
    inline def setCpu(value: ClusterStatsClusterProcessCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setOpen_file_descriptors(value: ClusterStatsClusterProcessOpenFileDescriptors): Self = StObject.set(x, "open_file_descriptors", value.asInstanceOf[js.Any])
  }
}
