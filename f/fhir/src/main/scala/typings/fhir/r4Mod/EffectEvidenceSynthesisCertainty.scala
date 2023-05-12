package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectEvidenceSynthesisCertainty
  extends StObject
     with BackboneElement {
  
  /**
    * A description of a component of the overall certainty.
    */
  var certaintySubcomponent: js.UndefOr[js.Array[EffectEvidenceSynthesisCertaintyCertaintySubcomponent]] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the resource.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A rating of the certainty of the effect estimate.
    */
  var rating: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EffectEvidenceSynthesisCertainty {
  
  inline def apply(): EffectEvidenceSynthesisCertainty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectEvidenceSynthesisCertainty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectEvidenceSynthesisCertainty] (val x: Self) extends AnyVal {
    
    inline def setCertaintySubcomponent(value: js.Array[EffectEvidenceSynthesisCertaintyCertaintySubcomponent]): Self = StObject.set(x, "certaintySubcomponent", value.asInstanceOf[js.Any])
    
    inline def setCertaintySubcomponentUndefined: Self = StObject.set(x, "certaintySubcomponent", js.undefined)
    
    inline def setCertaintySubcomponentVarargs(value: EffectEvidenceSynthesisCertaintyCertaintySubcomponent*): Self = StObject.set(x, "certaintySubcomponent", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setRating(value: js.Array[CodeableConcept]): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setRatingVarargs(value: CodeableConcept*): Self = StObject.set(x, "rating", js.Array(value*))
  }
}
