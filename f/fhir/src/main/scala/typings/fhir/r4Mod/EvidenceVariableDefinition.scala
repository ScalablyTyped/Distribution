package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableDefinition
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A text description or summary of the variable.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Indication of quality of match between intended variable to actual variable.
    */
  var directnessMatch: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Definition of the intended variable related to the Evidence.
    */
  var intended: js.UndefOr[Reference] = js.undefined
  
  /**
    * Footnotes and/or explanatory notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Definition of the actual variable related to the statistic(s).
    */
  var observed: js.UndefOr[Reference] = js.undefined
  
  /**
    * population | subpopulation | exposure | referenceExposure | measuredVariable | confounder.
    */
  var variableRole: CodeableConcept
}
object EvidenceVariableDefinition {
  
  inline def apply(variableRole: CodeableConcept): EvidenceVariableDefinition = {
    val __obj = js.Dynamic.literal(variableRole = variableRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceVariableDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceVariableDefinition] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirectnessMatch(value: CodeableConcept): Self = StObject.set(x, "directnessMatch", value.asInstanceOf[js.Any])
    
    inline def setDirectnessMatchUndefined: Self = StObject.set(x, "directnessMatch", js.undefined)
    
    inline def setIntended(value: Reference): Self = StObject.set(x, "intended", value.asInstanceOf[js.Any])
    
    inline def setIntendedUndefined: Self = StObject.set(x, "intended", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setObserved(value: Reference): Self = StObject.set(x, "observed", value.asInstanceOf[js.Any])
    
    inline def setObservedUndefined: Self = StObject.set(x, "observed", js.undefined)
    
    inline def setVariableRole(value: CodeableConcept): Self = StObject.set(x, "variableRole", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
