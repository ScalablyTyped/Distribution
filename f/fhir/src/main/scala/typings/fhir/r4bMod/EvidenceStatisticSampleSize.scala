package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceStatisticSampleSize
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Human-readable summary of population sample size.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Number of participants with known results for measured variables.
    */
  var knownDataCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Footnote or explanatory note about the sample size.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the sample size.
    */
  var numberOfParticipants: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of participants in the population.
    */
  var numberOfStudies: js.UndefOr[Double] = js.undefined
}
object EvidenceStatisticSampleSize {
  
  inline def apply(): EvidenceStatisticSampleSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceStatisticSampleSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceStatisticSampleSize] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKnownDataCount(value: Double): Self = StObject.set(x, "knownDataCount", value.asInstanceOf[js.Any])
    
    inline def setKnownDataCountUndefined: Self = StObject.set(x, "knownDataCount", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setNumberOfParticipants(value: Double): Self = StObject.set(x, "numberOfParticipants", value.asInstanceOf[js.Any])
    
    inline def setNumberOfParticipantsUndefined: Self = StObject.set(x, "numberOfParticipants", js.undefined)
    
    inline def setNumberOfStudies(value: Double): Self = StObject.set(x, "numberOfStudies", value.asInstanceOf[js.Any])
    
    inline def setNumberOfStudiesUndefined: Self = StObject.set(x, "numberOfStudies", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
