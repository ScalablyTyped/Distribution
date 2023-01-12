package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeRegulatorySubstitution
  extends StObject
     with BackboneElement {
  
  var _allowed: js.UndefOr[Element] = js.undefined
  
  /**
    * Specifies if regulation allows for changes in the medication when dispensing.
    */
  var allowed: Boolean
  
  /**
    * Specifies the type of substitution allowed.
    */
  var `type`: CodeableConcept
}
object MedicationKnowledgeRegulatorySubstitution {
  
  inline def apply(allowed: Boolean, `type`: CodeableConcept): MedicationKnowledgeRegulatorySubstitution = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeRegulatorySubstitution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeRegulatorySubstitution] (val x: Self) extends AnyVal {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_allowed(value: Element): Self = StObject.set(x, "_allowed", value.asInstanceOf[js.Any])
    
    inline def set_allowedUndefined: Self = StObject.set(x, "_allowed", js.undefined)
  }
}
