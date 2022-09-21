package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption extends StObject {
  
  /**
    * The name of the header to set.
    */
  var headerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value to set the named header to.
    */
  var headerValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption {
  
  inline def apply(): SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleHttpHeaderActionHttpHeaderOption](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setHeaderNameNull: Self = StObject.set(x, "headerName", null)
    
    inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    inline def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueNull: Self = StObject.set(x, "headerValue", null)
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
