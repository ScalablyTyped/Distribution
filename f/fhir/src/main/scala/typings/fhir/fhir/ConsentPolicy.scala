package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Policies covered by this consent
  */
trait ConsentPolicy
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'authority'.
    */
  var _authority: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * Enforcement source for policy
    */
  var authority: js.UndefOr[uri] = js.undefined
  
  /**
    * Specific policy covered by this consent
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.undefined
}
object ConsentPolicy {
  
  inline def apply(): ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentPolicy]
  }
  
  extension [Self <: ConsentPolicy](x: Self) {
    
    inline def setAuthority(value: uri): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setUri(value: uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def set_authority(value: Element): Self = StObject.set(x, "_authority", value.asInstanceOf[js.Any])
    
    inline def set_authorityUndefined: Self = StObject.set(x, "_authority", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
