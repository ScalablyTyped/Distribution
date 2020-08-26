package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Claim, Pre-determination or Pre-authorization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Claim extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * Details about an accident
    */
  var accident: js.UndefOr[ClaimAccident] = js.native
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.native
  /**
    * Members of the care team
    */
  var careTeam: js.UndefOr[js.Array[ClaimCareTeam]] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ClaimDiagnosis]] = js.native
  /**
    * Period unable to work
    */
  var employmentImpacted: js.UndefOr[Period] = js.native
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.native
  /**
    * Funds requested to be reserved
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.native
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.native
  /**
    * Claim number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ClaimInformation]] = js.native
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimInsurance]] = js.native
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.native
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ClaimItem]] = js.native
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.native
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ClaimPayee] = js.native
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.native
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ClaimProcedure]] = js.native
  /**
    * Responsible provider
    */
  var provider: js.UndefOr[Reference] = js.native
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.native
  /**
    * Related Claims which may be revelant to processing this claimn
    */
  var related: js.UndefOr[js.Array[ClaimRelated]] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Total claim cost
    */
  var total: js.UndefOr[Money] = js.native
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * complete | proposed | exploratory | other
    */
  var use: js.UndefOr[code] = js.native
}

object Claim {
  @scala.inline
  def apply(): Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Claim]
  }
  @scala.inline
  implicit class ClaimOps[Self <: Claim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    @scala.inline
    def setAccident(value: ClaimAccident): Self = this.set("accident", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccident: Self = this.set("accident", js.undefined)
    @scala.inline
    def setBillablePeriod(value: Period): Self = this.set("billablePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillablePeriod: Self = this.set("billablePeriod", js.undefined)
    @scala.inline
    def setCareTeamVarargs(value: ClaimCareTeam*): Self = this.set("careTeam", js.Array(value :_*))
    @scala.inline
    def setCareTeam(value: js.Array[ClaimCareTeam]): Self = this.set("careTeam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCareTeam: Self = this.set("careTeam", js.undefined)
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDiagnosisVarargs(value: ClaimDiagnosis*): Self = this.set("diagnosis", js.Array(value :_*))
    @scala.inline
    def setDiagnosis(value: js.Array[ClaimDiagnosis]): Self = this.set("diagnosis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosis: Self = this.set("diagnosis", js.undefined)
    @scala.inline
    def setEmploymentImpacted(value: Period): Self = this.set("employmentImpacted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmploymentImpacted: Self = this.set("employmentImpacted", js.undefined)
    @scala.inline
    def setEnterer(value: Reference): Self = this.set("enterer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterer: Self = this.set("enterer", js.undefined)
    @scala.inline
    def setFacility(value: Reference): Self = this.set("facility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    @scala.inline
    def setFundsReserve(value: CodeableConcept): Self = this.set("fundsReserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFundsReserve: Self = this.set("fundsReserve", js.undefined)
    @scala.inline
    def setHospitalization(value: Period): Self = this.set("hospitalization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHospitalization: Self = this.set("hospitalization", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setInformationVarargs(value: ClaimInformation*): Self = this.set("information", js.Array(value :_*))
    @scala.inline
    def setInformation(value: js.Array[ClaimInformation]): Self = this.set("information", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInformation: Self = this.set("information", js.undefined)
    @scala.inline
    def setInsuranceVarargs(value: ClaimInsurance*): Self = this.set("insurance", js.Array(value :_*))
    @scala.inline
    def setInsurance(value: js.Array[ClaimInsurance]): Self = this.set("insurance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsurance: Self = this.set("insurance", js.undefined)
    @scala.inline
    def setInsurer(value: Reference): Self = this.set("insurer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsurer: Self = this.set("insurer", js.undefined)
    @scala.inline
    def setItemVarargs(value: ClaimItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[ClaimItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setOriginalPrescription(value: Reference): Self = this.set("originalPrescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPrescription: Self = this.set("originalPrescription", js.undefined)
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    @scala.inline
    def setPayee(value: ClaimPayee): Self = this.set("payee", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayee: Self = this.set("payee", js.undefined)
    @scala.inline
    def setPrescription(value: Reference): Self = this.set("prescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrescription: Self = this.set("prescription", js.undefined)
    @scala.inline
    def setPriority(value: CodeableConcept): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setProcedureVarargs(value: ClaimProcedure*): Self = this.set("procedure", js.Array(value :_*))
    @scala.inline
    def setProcedure(value: js.Array[ClaimProcedure]): Self = this.set("procedure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcedure: Self = this.set("procedure", js.undefined)
    @scala.inline
    def setProvider(value: Reference): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setReferral(value: Reference): Self = this.set("referral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferral: Self = this.set("referral", js.undefined)
    @scala.inline
    def setRelatedVarargs(value: ClaimRelated*): Self = this.set("related", js.Array(value :_*))
    @scala.inline
    def setRelated(value: js.Array[ClaimRelated]): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubTypeVarargs(value: CodeableConcept*): Self = this.set("subType", js.Array(value :_*))
    @scala.inline
    def setSubType(value: js.Array[CodeableConcept]): Self = this.set("subType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    @scala.inline
    def setTotal(value: Money): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

