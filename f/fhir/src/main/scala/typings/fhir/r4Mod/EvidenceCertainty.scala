package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceCertainty
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _rater: js.UndefOr[Element] = js.undefined
  
  /**
    * Textual description of certainty.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Footnotes and/or explanatory notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Individual or group who did the rating.
    */
  var rater: js.UndefOr[String] = js.undefined
  
  /**
    * Assessment or judgement of the aspect.
    */
  var rating: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A domain or subdomain of certainty.
    */
  var subcomponent: js.UndefOr[js.Array[EvidenceCertainty]] = js.undefined
  
  /**
    * Aspect of certainty being rated.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object EvidenceCertainty {
  
  inline def apply(): EvidenceCertainty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceCertainty]
  }
  
  extension [Self <: EvidenceCertainty](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setRater(value: String): Self = StObject.set(x, "rater", value.asInstanceOf[js.Any])
    
    inline def setRaterUndefined: Self = StObject.set(x, "rater", js.undefined)
    
    inline def setRating(value: CodeableConcept): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setSubcomponent(value: js.Array[EvidenceCertainty]): Self = StObject.set(x, "subcomponent", value.asInstanceOf[js.Any])
    
    inline def setSubcomponentUndefined: Self = StObject.set(x, "subcomponent", js.undefined)
    
    inline def setSubcomponentVarargs(value: EvidenceCertainty*): Self = StObject.set(x, "subcomponent", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_rater(value: Element): Self = StObject.set(x, "_rater", value.asInstanceOf[js.Any])
    
    inline def set_raterUndefined: Self = StObject.set(x, "_rater", js.undefined)
  }
}
