package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskEvidenceSynthesisSampleSize
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Human-readable summary of sample size.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Number of participants included in this evidence synthesis.
    */
  var numberOfParticipants: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of studies included in this evidence synthesis.
    */
  var numberOfStudies: js.UndefOr[Double] = js.undefined
}
object RiskEvidenceSynthesisSampleSize {
  
  inline def apply(): RiskEvidenceSynthesisSampleSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskEvidenceSynthesisSampleSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskEvidenceSynthesisSampleSize] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNumberOfParticipants(value: Double): Self = StObject.set(x, "numberOfParticipants", value.asInstanceOf[js.Any])
    
    inline def setNumberOfParticipantsUndefined: Self = StObject.set(x, "numberOfParticipants", js.undefined)
    
    inline def setNumberOfStudies(value: Double): Self = StObject.set(x, "numberOfStudies", value.asInstanceOf[js.Any])
    
    inline def setNumberOfStudiesUndefined: Self = StObject.set(x, "numberOfStudies", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
