package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSecurityPolicyStatus extends StObject {
  
  var effectiveDirectives: String
  
  var isEnforced: Boolean
  
  var source: ContentSecurityPolicySource
}
object ContentSecurityPolicyStatus {
  
  inline def apply(effectiveDirectives: String, isEnforced: Boolean, source: ContentSecurityPolicySource): ContentSecurityPolicyStatus = {
    val __obj = js.Dynamic.literal(effectiveDirectives = effectiveDirectives.asInstanceOf[js.Any], isEnforced = isEnforced.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSecurityPolicyStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSecurityPolicyStatus] (val x: Self) extends AnyVal {
    
    inline def setEffectiveDirectives(value: String): Self = StObject.set(x, "effectiveDirectives", value.asInstanceOf[js.Any])
    
    inline def setIsEnforced(value: Boolean): Self = StObject.set(x, "isEnforced", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ContentSecurityPolicySource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
