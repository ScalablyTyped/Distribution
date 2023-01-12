package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetRoleRole extends StObject {
  
  var applications: js.Array[SecurityApplicationPrivileges]
  
  var cluster: js.Array[String]
  
  var global: js.UndefOr[Record[String, Record[String, Record[String, js.Array[String]]]]] = js.undefined
  
  var indices: js.Array[SecurityIndicesPrivileges]
  
  var metadata: Metadata
  
  var role_templates: js.UndefOr[js.Array[SecurityGetRoleRoleTemplate]] = js.undefined
  
  var run_as: js.Array[String]
  
  var transient_metadata: SecurityTransientMetadataConfig
}
object SecurityGetRoleRole {
  
  inline def apply(
    applications: js.Array[SecurityApplicationPrivileges],
    cluster: js.Array[String],
    indices: js.Array[SecurityIndicesPrivileges],
    metadata: Metadata,
    run_as: js.Array[String],
    transient_metadata: SecurityTransientMetadataConfig
  ): SecurityGetRoleRole = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], cluster = cluster.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], run_as = run_as.asInstanceOf[js.Any], transient_metadata = transient_metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetRoleRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetRoleRole] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: js.Array[SecurityApplicationPrivileges]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsVarargs(value: SecurityApplicationPrivileges*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setCluster(value: js.Array[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterVarargs(value: String*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setGlobal(value: Record[String, Record[String, Record[String, js.Array[String]]]]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setIndices(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: SecurityIndicesPrivileges*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRole_templates(value: js.Array[SecurityGetRoleRoleTemplate]): Self = StObject.set(x, "role_templates", value.asInstanceOf[js.Any])
    
    inline def setRole_templatesUndefined: Self = StObject.set(x, "role_templates", js.undefined)
    
    inline def setRole_templatesVarargs(value: SecurityGetRoleRoleTemplate*): Self = StObject.set(x, "role_templates", js.Array(value*))
    
    inline def setRun_as(value: js.Array[String]): Self = StObject.set(x, "run_as", value.asInstanceOf[js.Any])
    
    inline def setRun_asVarargs(value: String*): Self = StObject.set(x, "run_as", js.Array(value*))
    
    inline def setTransient_metadata(value: SecurityTransientMetadataConfig): Self = StObject.set(x, "transient_metadata", value.asInstanceOf[js.Any])
  }
}
