package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentPolicy
  extends StObject
     with BackboneElement {
  
  var _authority: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * Entity or Organization having regulatory jurisdiction or accountability for  enforcing policies pertaining to Consent Directives.
    */
  var authority: js.UndefOr[String] = js.undefined
  
  /**
    * This element is for discoverability / documentation and does not modify or qualify the policy rules.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ConsentPolicy {
  
  inline def apply(): ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentPolicy] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def set_authority(value: Element): Self = StObject.set(x, "_authority", value.asInstanceOf[js.Any])
    
    inline def set_authorityUndefined: Self = StObject.set(x, "_authority", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
