package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait EpisodeOfCare extends DomainResource {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The set of accounts that may be used for billing for this EpisodeOfCare
    */
  var account: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Care manager/care co-ordinator for the patient
    */
  var careManager: js.UndefOr[Reference] = js.native
  /**
    * The list of diagnosis relevant to this episode of care
    */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.native
  /**
    * Business Identifier(s) relevant for this EpisodeOfCare
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Organization that assumes care
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  /**
    * The patient who is the focus of this episode of care
    */
  var patient: Reference = js.native
  /**
    * Interval during responsibility is assumed
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Originating Referral Request(s)
    */
  var referralRequest: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
    */
  var status: code = js.native
  /**
    * Past list of status codes (the current status may be included to cover the start date of the status)
    */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.native
  /**
    * Other practitioners facilitating this episode of care
    */
  var team: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type/class  - e.g. specialist referral, disease management
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object EpisodeOfCare {
  @scala.inline
  def apply(patient: Reference, status: code): EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCare]
  }
  @scala.inline
  implicit class EpisodeOfCareOps[Self <: EpisodeOfCare] (val x: Self) extends AnyVal {
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
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAccountVarargs(value: Reference*): Self = this.set("account", js.Array(value :_*))
    @scala.inline
    def setAccount(value: js.Array[Reference]): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setCareManager(value: Reference): Self = this.set("careManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCareManager: Self = this.set("careManager", js.undefined)
    @scala.inline
    def setDiagnosisVarargs(value: EpisodeOfCareDiagnosis*): Self = this.set("diagnosis", js.Array(value :_*))
    @scala.inline
    def setDiagnosis(value: js.Array[EpisodeOfCareDiagnosis]): Self = this.set("diagnosis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosis: Self = this.set("diagnosis", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setManagingOrganization(value: Reference): Self = this.set("managingOrganization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagingOrganization: Self = this.set("managingOrganization", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setReferralRequestVarargs(value: Reference*): Self = this.set("referralRequest", js.Array(value :_*))
    @scala.inline
    def setReferralRequest(value: js.Array[Reference]): Self = this.set("referralRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferralRequest: Self = this.set("referralRequest", js.undefined)
    @scala.inline
    def setStatusHistoryVarargs(value: EpisodeOfCareStatusHistory*): Self = this.set("statusHistory", js.Array(value :_*))
    @scala.inline
    def setStatusHistory(value: js.Array[EpisodeOfCareStatusHistory]): Self = this.set("statusHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusHistory: Self = this.set("statusHistory", js.undefined)
    @scala.inline
    def setTeamVarargs(value: Reference*): Self = this.set("team", js.Array(value :_*))
    @scala.inline
    def setTeam(value: js.Array[Reference]): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

