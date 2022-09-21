package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterialOrganismOrganismGeneral
  extends StObject
     with BackboneElement {
  
  /**
    * The class of an organism shall be specified.
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The kingdom of an organism shall be specified.
    */
  var kingdom: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The order of an organism shall be specified,.
    */
  var order: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The phylum of an organism shall be specified.
    */
  var phylum: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSourceMaterialOrganismOrganismGeneral {
  
  inline def apply(): SubstanceSourceMaterialOrganismOrganismGeneral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSourceMaterialOrganismOrganismGeneral]
  }
  
  extension [Self <: SubstanceSourceMaterialOrganismOrganismGeneral](x: Self) {
    
    inline def setClass(value: CodeableConcept): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setKingdom(value: CodeableConcept): Self = StObject.set(x, "kingdom", value.asInstanceOf[js.Any])
    
    inline def setKingdomUndefined: Self = StObject.set(x, "kingdom", js.undefined)
    
    inline def setOrder(value: CodeableConcept): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPhylum(value: CodeableConcept): Self = StObject.set(x, "phylum", value.asInstanceOf[js.Any])
    
    inline def setPhylumUndefined: Self = StObject.set(x, "phylum", js.undefined)
  }
}
