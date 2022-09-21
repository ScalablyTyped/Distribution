package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecuritySettings extends StObject {
  
  /**
    * The Member Restriction value
    */
  var memberRestriction: js.UndefOr[SchemaMemberRestriction] = js.undefined
  
  /**
    * Output only. The resource name of the security settings. Shall be of the form `groups/{group_id\}/securitySettings`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecuritySettings {
  
  inline def apply(): SchemaSecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecuritySettings]
  }
  
  extension [Self <: SchemaSecuritySettings](x: Self) {
    
    inline def setMemberRestriction(value: SchemaMemberRestriction): Self = StObject.set(x, "memberRestriction", value.asInstanceOf[js.Any])
    
    inline def setMemberRestrictionUndefined: Self = StObject.set(x, "memberRestriction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
