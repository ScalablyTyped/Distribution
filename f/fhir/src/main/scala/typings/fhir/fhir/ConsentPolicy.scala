package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Policies covered by this consent
  */
@js.native
trait ConsentPolicy extends BackboneElement {
  
  /**
    * Contains extended information for property 'authority'.
    */
  var _authority: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  
  /**
    * Enforcement source for policy
    */
  var authority: js.UndefOr[uri] = js.native
  
  /**
    * Specific policy covered by this consent
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.native
}
object ConsentPolicy {
  
  @scala.inline
  def apply(): ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentPolicy]
  }
  
  @scala.inline
  implicit class ConsentPolicyMutableBuilder[Self <: ConsentPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthority(value: uri): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    @scala.inline
    def setUri(value: uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def set_authority(value: Element): Self = StObject.set(x, "_authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authorityUndefined: Self = StObject.set(x, "_authority", js.undefined)
    
    @scala.inline
    def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
