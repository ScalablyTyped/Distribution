package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductAuthorization
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateOfFirstAuthorization: js.UndefOr[Element] = js.undefined
  
  var _internationalBirthDate: js.UndefOr[Element] = js.undefined
  
  var _restoreDate: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The country in which the marketing authorization has been granted.
    */
  var country: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A period of time after authorization before generic product applicatiosn can be submitted.
    */
  var dataExclusivityPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The date when the first authorization was granted by a Medicines Regulatory Agency.
    */
  var dateOfFirstAuthorization: js.UndefOr[String] = js.undefined
  
  /**
    * Marketing Authorization Holder.
    */
  var holder: js.UndefOr[Reference] = js.undefined
  
  /**
    * Business identifier for the marketing authorization, as assigned by a regulator.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Date of first marketing authorization for a company's new medicinal product in any country in the World.
    */
  var internationalBirthDate: js.UndefOr[String] = js.undefined
  
  /**
    * Jurisdiction within a country.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Authorization in areas within a country.
    */
  var jurisdictionalAuthorization: js.UndefOr[js.Array[MedicinalProductAuthorizationJurisdictionalAuthorization]] = js.undefined
  
  /**
    * The legal framework against which this authorization is granted.
    */
  var legalBasis: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The regulatory procedure for granting or amending a marketing authorization.
    */
  var procedure: js.UndefOr[MedicinalProductAuthorizationProcedure] = js.undefined
  
  /**
    * Medicines Regulatory Agency.
    */
  var regulator: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductAuthorization: typings.fhir.fhirStrings.MedicinalProductAuthorization
  
  /**
    * The date when a suspended the marketing or the marketing authorization of the product is anticipated to be restored.
    */
  var restoreDate: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the marketing authorization.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date at which the given status has become applicable.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * The medicinal product that is being authorized.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The beginning of the time period in which the marketing authorization is in the specific status shall be specified A complete date consisting of day, month and year shall be specified using the ISO 8601 date format.
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}
object MedicinalProductAuthorization {
  
  inline def apply(): MedicinalProductAuthorization = {
    val __obj = js.Dynamic.literal(resourceType = "MedicinalProductAuthorization")
    __obj.asInstanceOf[MedicinalProductAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductAuthorization] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: js.Array[CodeableConcept]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: CodeableConcept*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setDataExclusivityPeriod(value: Period): Self = StObject.set(x, "dataExclusivityPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataExclusivityPeriodUndefined: Self = StObject.set(x, "dataExclusivityPeriod", js.undefined)
    
    inline def setDateOfFirstAuthorization(value: String): Self = StObject.set(x, "dateOfFirstAuthorization", value.asInstanceOf[js.Any])
    
    inline def setDateOfFirstAuthorizationUndefined: Self = StObject.set(x, "dateOfFirstAuthorization", js.undefined)
    
    inline def setHolder(value: Reference): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    inline def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInternationalBirthDate(value: String): Self = StObject.set(x, "internationalBirthDate", value.asInstanceOf[js.Any])
    
    inline def setInternationalBirthDateUndefined: Self = StObject.set(x, "internationalBirthDate", js.undefined)
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setJurisdictionalAuthorization(value: js.Array[MedicinalProductAuthorizationJurisdictionalAuthorization]): Self = StObject.set(x, "jurisdictionalAuthorization", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionalAuthorizationUndefined: Self = StObject.set(x, "jurisdictionalAuthorization", js.undefined)
    
    inline def setJurisdictionalAuthorizationVarargs(value: MedicinalProductAuthorizationJurisdictionalAuthorization*): Self = StObject.set(x, "jurisdictionalAuthorization", js.Array(value*))
    
    inline def setLegalBasis(value: CodeableConcept): Self = StObject.set(x, "legalBasis", value.asInstanceOf[js.Any])
    
    inline def setLegalBasisUndefined: Self = StObject.set(x, "legalBasis", js.undefined)
    
    inline def setProcedure(value: MedicinalProductAuthorizationProcedure): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setRegulator(value: Reference): Self = StObject.set(x, "regulator", value.asInstanceOf[js.Any])
    
    inline def setRegulatorUndefined: Self = StObject.set(x, "regulator", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductAuthorization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRestoreDate(value: String): Self = StObject.set(x, "restoreDate", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateUndefined: Self = StObject.set(x, "restoreDate", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
    
    inline def set_dateOfFirstAuthorization(value: Element): Self = StObject.set(x, "_dateOfFirstAuthorization", value.asInstanceOf[js.Any])
    
    inline def set_dateOfFirstAuthorizationUndefined: Self = StObject.set(x, "_dateOfFirstAuthorization", js.undefined)
    
    inline def set_internationalBirthDate(value: Element): Self = StObject.set(x, "_internationalBirthDate", value.asInstanceOf[js.Any])
    
    inline def set_internationalBirthDateUndefined: Self = StObject.set(x, "_internationalBirthDate", js.undefined)
    
    inline def set_restoreDate(value: Element): Self = StObject.set(x, "_restoreDate", value.asInstanceOf[js.Any])
    
    inline def set_restoreDateUndefined: Self = StObject.set(x, "_restoreDate", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
  }
}
