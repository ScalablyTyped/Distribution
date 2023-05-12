package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitAddItemBodySite
  extends StObject
     with BackboneElement {
  
  /**
    * For example, providing a tooth code allows an insurer to identify a provider performing a filling on a tooth that was previously removed.
    */
  var site: js.Array[CodeableReference]
  
  /**
    * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
    */
  var subSite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ExplanationOfBenefitAddItemBodySite {
  
  inline def apply(site: js.Array[CodeableReference]): ExplanationOfBenefitAddItemBodySite = {
    val __obj = js.Dynamic.literal(site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitAddItemBodySite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitAddItemBodySite] (val x: Self) extends AnyVal {
    
    inline def setSite(value: js.Array[CodeableReference]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteVarargs(value: CodeableReference*): Self = StObject.set(x, "site", js.Array(value*))
    
    inline def setSubSite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subSite", value.asInstanceOf[js.Any])
    
    inline def setSubSiteUndefined: Self = StObject.set(x, "subSite", js.undefined)
    
    inline def setSubSiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "subSite", js.Array(value*))
  }
}
