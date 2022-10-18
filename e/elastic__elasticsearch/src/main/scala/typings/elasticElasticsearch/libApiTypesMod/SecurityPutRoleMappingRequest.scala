package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPutRoleMappingRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var name: Name
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var rules: js.UndefOr[SecurityRoleMappingRule] = js.undefined
  
  var run_as: js.UndefOr[js.Array[String]] = js.undefined
}
object SecurityPutRoleMappingRequest {
  
  inline def apply(name: Name): SecurityPutRoleMappingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutRoleMappingRequest]
  }
  
  extension [Self <: SecurityPutRoleMappingRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setRules(value: SecurityRoleMappingRule): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRun_as(value: js.Array[String]): Self = StObject.set(x, "run_as", value.asInstanceOf[js.Any])
    
    inline def setRun_asUndefined: Self = StObject.set(x, "run_as", js.undefined)
    
    inline def setRun_asVarargs(value: String*): Self = StObject.set(x, "run_as", js.Array(value*))
  }
}
