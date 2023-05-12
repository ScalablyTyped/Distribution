package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskEvidenceSynthesisCertaintyCertaintySubcomponent
  extends StObject
     with BackboneElement {
  
  /**
    * A human-readable string to clarify or explain concepts about the resource.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A rating of a subcomponent of rating certainty.
    */
  var rating: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Type of subcomponent of certainty rating.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object RiskEvidenceSynthesisCertaintyCertaintySubcomponent {
  
  inline def apply(): RiskEvidenceSynthesisCertaintyCertaintySubcomponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskEvidenceSynthesisCertaintyCertaintySubcomponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskEvidenceSynthesisCertaintyCertaintySubcomponent] (val x: Self) extends AnyVal {
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setRating(value: js.Array[CodeableConcept]): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setRatingVarargs(value: CodeableConcept*): Self = StObject.set(x, "rating", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
