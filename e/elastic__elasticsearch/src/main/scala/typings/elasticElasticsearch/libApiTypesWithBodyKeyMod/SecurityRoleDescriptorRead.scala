package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityRoleDescriptorRead extends StObject {
  
  var applications: js.UndefOr[js.Array[SecurityApplicationPrivileges]] = js.undefined
  
  var cluster: js.Array[String]
  
  var global: js.UndefOr[js.Array[SecurityGlobalPrivilege] | SecurityGlobalPrivilege] = js.undefined
  
  var index: js.Array[SecurityIndicesPrivileges]
  
  var indices: js.Array[SecurityIndicesPrivileges]
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var run_as: js.UndefOr[js.Array[String]] = js.undefined
  
  var transient_metadata: js.UndefOr[SecurityTransientMetadataConfig] = js.undefined
}
object SecurityRoleDescriptorRead {
  
  inline def apply(
    cluster: js.Array[String],
    index: js.Array[SecurityIndicesPrivileges],
    indices: js.Array[SecurityIndicesPrivileges]
  ): SecurityRoleDescriptorRead = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityRoleDescriptorRead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityRoleDescriptorRead] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: js.Array[SecurityApplicationPrivileges]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: SecurityApplicationPrivileges*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setCluster(value: js.Array[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterVarargs(value: String*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setGlobal(value: js.Array[SecurityGlobalPrivilege] | SecurityGlobalPrivilege): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setGlobalVarargs(value: SecurityGlobalPrivilege*): Self = StObject.set(x, "global", js.Array(value*))
    
    inline def setIndex(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: SecurityIndicesPrivileges*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setIndices(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: SecurityIndicesPrivileges*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRun_as(value: js.Array[String]): Self = StObject.set(x, "run_as", value.asInstanceOf[js.Any])
    
    inline def setRun_asUndefined: Self = StObject.set(x, "run_as", js.undefined)
    
    inline def setRun_asVarargs(value: String*): Self = StObject.set(x, "run_as", js.Array(value*))
    
    inline def setTransient_metadata(value: SecurityTransientMetadataConfig): Self = StObject.set(x, "transient_metadata", value.asInstanceOf[js.Any])
    
    inline def setTransient_metadataUndefined: Self = StObject.set(x, "transient_metadata", js.undefined)
  }
}
