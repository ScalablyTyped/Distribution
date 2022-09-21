package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallPolicyRuleSecureTag extends StObject {
  
  /**
    * Name of the secure tag, created with TagManager's TagValue API.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaFirewallPolicyRuleSecureTag {
  
  inline def apply(): SchemaFirewallPolicyRuleSecureTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallPolicyRuleSecureTag]
  }
  
  extension [Self <: SchemaFirewallPolicyRuleSecureTag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
