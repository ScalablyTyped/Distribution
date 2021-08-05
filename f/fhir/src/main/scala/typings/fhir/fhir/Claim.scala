package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Claim, Pre-determination or Pre-authorization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Claim
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Details about an accident
    */
  var accident: js.UndefOr[ClaimAccident] = js.undefined
  
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Members of the care team
    */
  var careTeam: js.UndefOr[js.Array[ClaimCareTeam]] = js.undefined
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ClaimDiagnosis]] = js.undefined
  
  /**
    * Period unable to work
    */
  var employmentImpacted: js.UndefOr[Period] = js.undefined
  
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.undefined
  
  /**
    * Funds requested to be reserved
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.undefined
  
  /**
    * Claim number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ClaimInformation]] = js.undefined
  
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimInsurance]] = js.undefined
  
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ClaimItem]] = js.undefined
  
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ClaimPayee] = js.undefined
  
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ClaimProcedure]] = js.undefined
  
  /**
    * Responsible provider
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.undefined
  
  /**
    * Related Claims which may be revelant to processing this claimn
    */
  var related: js.UndefOr[js.Array[ClaimRelated]] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Total claim cost
    */
  var total: js.UndefOr[Money] = js.undefined
  
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * complete | proposed | exploratory | other
    */
  var use: js.UndefOr[code] = js.undefined
}
object Claim {
  
  inline def apply(): Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Claim]
  }
  
  extension [Self <: Claim](x: Self) {
    
    inline def setAccident(value: ClaimAccident): Self = StObject.set(x, "accident", value.asInstanceOf[js.Any])
    
    inline def setAccidentUndefined: Self = StObject.set(x, "accident", js.undefined)
    
    inline def setBillablePeriod(value: Period): Self = StObject.set(x, "billablePeriod", value.asInstanceOf[js.Any])
    
    inline def setBillablePeriodUndefined: Self = StObject.set(x, "billablePeriod", js.undefined)
    
    inline def setCareTeam(value: js.Array[ClaimCareTeam]): Self = StObject.set(x, "careTeam", value.asInstanceOf[js.Any])
    
    inline def setCareTeamUndefined: Self = StObject.set(x, "careTeam", js.undefined)
    
    inline def setCareTeamVarargs(value: ClaimCareTeam*): Self = StObject.set(x, "careTeam", js.Array(value :_*))
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDiagnosis(value: js.Array[ClaimDiagnosis]): Self = StObject.set(x, "diagnosis", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisUndefined: Self = StObject.set(x, "diagnosis", js.undefined)
    
    inline def setDiagnosisVarargs(value: ClaimDiagnosis*): Self = StObject.set(x, "diagnosis", js.Array(value :_*))
    
    inline def setEmploymentImpacted(value: Period): Self = StObject.set(x, "employmentImpacted", value.asInstanceOf[js.Any])
    
    inline def setEmploymentImpactedUndefined: Self = StObject.set(x, "employmentImpacted", js.undefined)
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setFacility(value: Reference): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setFundsReserve(value: CodeableConcept): Self = StObject.set(x, "fundsReserve", value.asInstanceOf[js.Any])
    
    inline def setFundsReserveUndefined: Self = StObject.set(x, "fundsReserve", js.undefined)
    
    inline def setHospitalization(value: Period): Self = StObject.set(x, "hospitalization", value.asInstanceOf[js.Any])
    
    inline def setHospitalizationUndefined: Self = StObject.set(x, "hospitalization", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInformation(value: js.Array[ClaimInformation]): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
    
    inline def setInformationVarargs(value: ClaimInformation*): Self = StObject.set(x, "information", js.Array(value :_*))
    
    inline def setInsurance(value: js.Array[ClaimInsurance]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: ClaimInsurance*): Self = StObject.set(x, "insurance", js.Array(value :_*))
    
    inline def setInsurer(value: Reference): Self = StObject.set(x, "insurer", value.asInstanceOf[js.Any])
    
    inline def setInsurerUndefined: Self = StObject.set(x, "insurer", js.undefined)
    
    inline def setItem(value: js.Array[ClaimItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: ClaimItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOriginalPrescription(value: Reference): Self = StObject.set(x, "originalPrescription", value.asInstanceOf[js.Any])
    
    inline def setOriginalPrescriptionUndefined: Self = StObject.set(x, "originalPrescription", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPayee(value: ClaimPayee): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setPriority(value: CodeableConcept): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProcedure(value: js.Array[ClaimProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: ClaimProcedure*): Self = StObject.set(x, "procedure", js.Array(value :_*))
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setReferral(value: Reference): Self = StObject.set(x, "referral", value.asInstanceOf[js.Any])
    
    inline def setReferralUndefined: Self = StObject.set(x, "referral", js.undefined)
    
    inline def setRelated(value: js.Array[ClaimRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: ClaimRelated*): Self = StObject.set(x, "related", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setSubTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subType", js.Array(value :_*))
    
    inline def setTotal(value: Money): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
