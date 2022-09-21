package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams extends StObject {
  
  /**
    * The match operator for the field.
    */
  var op: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the field.
    */
  var `val`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams {
  
  inline def apply(): SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams]
  }
  
  extension [Self <: SchemaSecurityPolicyRulePreconfiguredWafConfigExclusionFieldParams](x: Self) {
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpNull: Self = StObject.set(x, "op", null)
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValNull: Self = StObject.set(x, "val", null)
    
    inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
