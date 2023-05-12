package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentPolicyBasis
  extends StObject
     with BackboneElement {
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * While any resource may be used, Consent, PlanDefinition and Contract would be most frequent
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A URL that links to a computable version of the policy the organization will enforce for this Consent.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ConsentPolicyBasis {
  
  inline def apply(): ConsentPolicyBasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentPolicyBasis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentPolicyBasis] (val x: Self) extends AnyVal {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
