package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinitionWarning
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A coded or unformatted textual definition of this warning.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A textual definition of this warning, with formatting.
    */
  var description: js.UndefOr[String] = js.undefined
}
object ClinicalUseDefinitionWarning {
  
  inline def apply(): ClinicalUseDefinitionWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalUseDefinitionWarning]
  }
  
  extension [Self <: ClinicalUseDefinitionWarning](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
