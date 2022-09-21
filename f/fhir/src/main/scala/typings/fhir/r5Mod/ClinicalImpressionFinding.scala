package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalImpressionFinding
  extends StObject
     with BackboneElement {
  
  var _basis: js.UndefOr[Element] = js.undefined
  
  /**
    * Which investigations support finding or diagnosis.
    */
  var basis: js.UndefOr[String] = js.undefined
  
  /**
    * Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions.
    */
  var item: js.UndefOr[CodeableReference] = js.undefined
}
object ClinicalImpressionFinding {
  
  inline def apply(): ClinicalImpressionFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
  
  extension [Self <: ClinicalImpressionFinding](x: Self) {
    
    inline def setBasis(value: String): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def set_basis(value: Element): Self = StObject.set(x, "_basis", value.asInstanceOf[js.Any])
    
    inline def set_basisUndefined: Self = StObject.set(x, "_basis", js.undefined)
  }
}
