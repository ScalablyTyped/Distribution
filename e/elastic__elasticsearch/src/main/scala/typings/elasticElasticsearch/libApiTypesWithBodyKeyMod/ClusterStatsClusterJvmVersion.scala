package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterJvmVersion extends StObject {
  
  var bundled_jdk: Boolean
  
  var count: integer
  
  var using_bundled_jdk: Boolean
  
  var version: VersionString
  
  var vm_name: String
  
  var vm_vendor: String
  
  var vm_version: VersionString
}
object ClusterStatsClusterJvmVersion {
  
  inline def apply(
    bundled_jdk: Boolean,
    count: integer,
    using_bundled_jdk: Boolean,
    version: VersionString,
    vm_name: String,
    vm_vendor: String,
    vm_version: VersionString
  ): ClusterStatsClusterJvmVersion = {
    val __obj = js.Dynamic.literal(bundled_jdk = bundled_jdk.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], using_bundled_jdk = using_bundled_jdk.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vm_name = vm_name.asInstanceOf[js.Any], vm_vendor = vm_vendor.asInstanceOf[js.Any], vm_version = vm_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterJvmVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterJvmVersion] (val x: Self) extends AnyVal {
    
    inline def setBundled_jdk(value: Boolean): Self = StObject.set(x, "bundled_jdk", value.asInstanceOf[js.Any])
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setUsing_bundled_jdk(value: Boolean): Self = StObject.set(x, "using_bundled_jdk", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVm_name(value: String): Self = StObject.set(x, "vm_name", value.asInstanceOf[js.Any])
    
    inline def setVm_vendor(value: String): Self = StObject.set(x, "vm_vendor", value.asInstanceOf[js.Any])
    
    inline def setVm_version(value: VersionString): Self = StObject.set(x, "vm_version", value.asInstanceOf[js.Any])
  }
}
