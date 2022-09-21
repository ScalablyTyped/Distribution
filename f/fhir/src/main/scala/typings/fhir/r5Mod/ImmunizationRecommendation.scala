package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationRecommendation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
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
    * The URL pointing to a FHIR-defined protocol, guideline or other definition that is adhered to in whole or in part by this ImmunizationRecommendation.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The patient the recommendation(s) are for.
    */
  var patient: Reference
  
  /**
    * A given instance of the .recommendation backbone element should correspond to a single recommended administration.
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
  
  extension [Self <: ImmunizationRecommendation](x: Self) {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setRecommendation(value: js.Array[ImmunizationRecommendationRecommendation]): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationVarargs(value: ImmunizationRecommendationRecommendation*): Self = StObject.set(x, "recommendation", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImmunizationRecommendation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
  }
}
