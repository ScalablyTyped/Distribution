package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCareReason
  extends StObject
     with BackboneElement {
  
  /**
    * What the reason value should be used as e.g. Chief Complaint, Health Concern, Health Maintenance (including screening).
    */
  var use: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The medical reason that is expected to be addressed during the episode of care, expressed as a text, code or a reference to another resource.
    */
  var value: js.UndefOr[js.Array[CodeableReference]] = js.undefined
}
object EpisodeOfCareReason {
  
  inline def apply(): EpisodeOfCareReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EpisodeOfCareReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpisodeOfCareReason] (val x: Self) extends AnyVal {
    
    inline def setUse(value: CodeableConcept): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setValue(value: js.Array[CodeableReference]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: CodeableReference*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
