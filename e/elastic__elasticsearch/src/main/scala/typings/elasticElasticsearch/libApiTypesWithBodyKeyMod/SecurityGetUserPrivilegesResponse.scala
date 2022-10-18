package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserPrivilegesResponse extends StObject {
  
  var applications: js.Array[SecurityApplicationPrivileges]
  
  var cluster: js.Array[String]
  
  var global: js.Array[SecurityGlobalPrivilege]
  
  var indices: js.Array[SecurityIndicesPrivileges]
  
  var run_as: js.Array[String]
}
object SecurityGetUserPrivilegesResponse {
  
  inline def apply(
    applications: js.Array[SecurityApplicationPrivileges],
    cluster: js.Array[String],
    global: js.Array[SecurityGlobalPrivilege],
    indices: js.Array[SecurityIndicesPrivileges],
    run_as: js.Array[String]
  ): SecurityGetUserPrivilegesResponse = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], cluster = cluster.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], run_as = run_as.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetUserPrivilegesResponse]
  }
  
  extension [Self <: SecurityGetUserPrivilegesResponse](x: Self) {
    
    inline def setApplications(value: js.Array[SecurityApplicationPrivileges]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsVarargs(value: SecurityApplicationPrivileges*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setCluster(value: js.Array[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterVarargs(value: String*): Self = StObject.set(x, "cluster", js.Array(value*))
    
    inline def setGlobal(value: js.Array[SecurityGlobalPrivilege]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: SecurityGlobalPrivilege*): Self = StObject.set(x, "global", js.Array(value*))
    
    inline def setIndices(value: js.Array[SecurityIndicesPrivileges]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: SecurityIndicesPrivileges*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setRun_as(value: js.Array[String]): Self = StObject.set(x, "run_as", value.asInstanceOf[js.Any])
    
    inline def setRun_asVarargs(value: String*): Self = StObject.set(x, "run_as", js.Array(value*))
  }
}
