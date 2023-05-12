package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationRecommendation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the authority who published the protocol (e.g. ACIP).
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date the immunization recommendation(s) were created.
    */
  var date: String
  
  /**
    * A unique identifier assigned to this particular recommendation record.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The patient the recommendation(s) are for.
    */
  var patient: Reference
  
  /**
    * Vaccine administration recommendations.
    */
  var recommendation: js.Array[ImmunizationRecommendationRecommendation]
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImmunizationRecommendation: typings.fhir.fhirStrings.ImmunizationRecommendation
}
object ImmunizationRecommendation {
  
  inline def apply(
    date: String,
    patient: Reference,
    recommendation: js.Array[ImmunizationRecommendationRecommendation]
  ): ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], resourceType = "ImmunizationRecommendation")
    __obj.asInstanceOf[ImmunizationRecommendation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationRecommendation] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setRecommendation(value: js.Array[ImmunizationRecommendationRecommendation]): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationVarargs(value: ImmunizationRecommendationRecommendation*): Self = StObject.set(x, "recommendation", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImmunizationRecommendation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
