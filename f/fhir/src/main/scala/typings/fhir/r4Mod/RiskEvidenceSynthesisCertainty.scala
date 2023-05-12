package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskEvidenceSynthesisCertainty
  extends StObject
     with BackboneElement {
  
  /**
    * A description of a component of the overall certainty.
    */
  var certaintySubcomponent: js.UndefOr[js.Array[RiskEvidenceSynthesisCertaintyCertaintySubcomponent]] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the resource.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A rating of the certainty of the effect estimate.
    */
  var rating: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object RiskEvidenceSynthesisCertainty {
  
  inline def apply(): RiskEvidenceSynthesisCertainty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskEvidenceSynthesisCertainty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskEvidenceSynthesisCertainty] (val x: Self) extends AnyVal {
    
    inline def setCertaintySubcomponent(value: js.Array[RiskEvidenceSynthesisCertaintyCertaintySubcomponent]): Self = StObject.set(x, "certaintySubcomponent", value.asInstanceOf[js.Any])
    
    inline def setCertaintySubcomponentUndefined: Self = StObject.set(x, "certaintySubcomponent", js.undefined)
    
    inline def setCertaintySubcomponentVarargs(value: RiskEvidenceSynthesisCertaintyCertaintySubcomponent*): Self = StObject.set(x, "certaintySubcomponent", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setRating(value: js.Array[CodeableConcept]): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setRatingVarargs(value: CodeableConcept*): Self = StObject.set(x, "rating", js.Array(value*))
  }
}
