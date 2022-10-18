package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityRoleMappingRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var rules: js.UndefOr[SecurityRoleMappingRule] = js.undefined
  
  var run_as: js.UndefOr[js.Array[String]] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMetadata(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
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
