package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionCrossReference
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to another product, e.g. for linking authorised to investigational product.
    */
  var product: CodeableReference
  
  /**
    * The type of relationship, for instance branded to generic, product to development product (investigational), parallel import version.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductDefinitionCrossReference {
  
  inline def apply(product: CodeableReference): MedicinalProductDefinitionCrossReference = {
    val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionCrossReference]
  }
  
  extension [Self <: MedicinalProductDefinitionCrossReference](x: Self) {
    
    inline def setProduct(value: CodeableReference): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
