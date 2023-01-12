package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityRoleDescriptor extends StObject {
  
  var applications: js.UndefOr[js.Array[SecurityApplicationPrivileges]] = js.undefined
  
  var cluster: js.UndefOr[js.Array[String]] = js.undefined
  
  var global: js.UndefOr[js.Array[SecurityGlobalPrivilege] | SecurityGlobalPrivilege] = js.undefined
  
  var index: js.UndefOr[js.Array[SecurityIndicesPrivileges]] = js.undefined
  
  var indices: js.UndefOr[js.Array[SecurityIndicesPrivileges]] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var run_as: js.UndefOr[js.Array[String]] = js.undefined
  
  var transient_metadata: js.UndefOr[SecurityTransientMetadataConfig] = js.undefined
}
object SecurityRoleDescriptor {
  
  inline def apply(): SecurityRoleDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityRoleDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityRoleDescriptor] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: js.Array[SecurityApplicationPrivileges]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: SecurityApplicationPrivileges*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setCluster(value: js.Array[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setClusterVarargs(value: String*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setGlobal(value: js.Array[SecurityGlobalPrivilege] | SecurityGlobalPrivilege): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setGlobalVarargs(value: SecurityGlobalPrivilege*): Self = StObject.set(x, "global", js.Array(value*))
    
    inline def setIndex(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: SecurityIndicesPrivileges*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setIndices(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
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
