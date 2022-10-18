package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesResponse extends StObject {
  
  var application: SecurityHasPrivilegesApplicationsPrivileges
  
  var cluster: Record[String, Boolean]
  
  var has_all_requested: Boolean
  
  var index: Record[IndexName, SecurityHasPrivilegesPrivileges]
  
  var username: Username
}
object SecurityHasPrivilegesResponse {
  
  inline def apply(
    application: SecurityHasPrivilegesApplicationsPrivileges,
    cluster: Record[String, Boolean],
    has_all_requested: Boolean,
    index: Record[IndexName, SecurityHasPrivilegesPrivileges],
    username: Username
  ): SecurityHasPrivilegesResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cluster = cluster.asInstanceOf[js.Any], has_all_requested = has_all_requested.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivilegesResponse]
  }
  
  extension [Self <: SecurityHasPrivilegesResponse](x: Self) {
    
    inline def setApplication(value: SecurityHasPrivilegesApplicationsPrivileges): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setCluster(value: Record[String, Boolean]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setHas_all_requested(value: Boolean): Self = StObject.set(x, "has_all_requested", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Record[IndexName, SecurityHasPrivilegesPrivileges]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
