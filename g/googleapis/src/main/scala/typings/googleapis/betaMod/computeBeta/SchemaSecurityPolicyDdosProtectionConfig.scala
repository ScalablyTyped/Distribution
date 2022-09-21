package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyDdosProtectionConfig extends StObject {
  
  var ddosProtection: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyDdosProtectionConfig {
  
  inline def apply(): SchemaSecurityPolicyDdosProtectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyDdosProtectionConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyDdosProtectionConfig](x: Self) {
    
    inline def setDdosProtection(value: String): Self = StObject.set(x, "ddosProtection", value.asInstanceOf[js.Any])
    
    inline def setDdosProtectionNull: Self = StObject.set(x, "ddosProtection", null)
    
    inline def setDdosProtectionUndefined: Self = StObject.set(x, "ddosProtection", js.undefined)
  }
}
