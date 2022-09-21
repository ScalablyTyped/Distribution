package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationRecommendation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * A unique identifier assigned to this particular recommendation record.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The patient the recommendations are for.
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
  
  inline def apply(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], resourceType = "ImmunizationRecommendation")
    __obj.asInstanceOf[ImmunizationRecommendation]
  }
  
  extension [Self <: ImmunizationRecommendation](x: Self) {
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setRecommendation(value: js.Array[ImmunizationRecommendationRecommendation]): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationVarargs(value: ImmunizationRecommendationRecommendation*): Self = StObject.set(x, "recommendation", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImmunizationRecommendation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
