package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Consent extends DomainResource {
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'policyRule'.
    */
  var _policyRule: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Actions controlled by this consent
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who|what controlled by this consent (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentActor]] = js.native
  /**
    * Classification of the consent statement - for indexing/retrieval
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who is agreeing to the policy and exceptions
    */
  var consentingParty: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Data controlled by this consent
    */
  var data: js.UndefOr[js.Array[ConsentData]] = js.native
  /**
    * Timeframe for data controlled by this consent
    */
  var dataPeriod: js.UndefOr[Period] = js.native
  /**
    * When this Consent was created or indexed
    */
  var dateTime: js.UndefOr[typings.fhir.fhir.dateTime] = js.native
  /**
    * Additional rule -  addition or removal of permissions
    */
  var except: js.UndefOr[js.Array[ConsentExcept]] = js.native
  /**
    * Identifier for this record (external references)
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Custodian of the consent
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who the consent applies to
    */
  var patient: Reference = js.native
  /**
    * Period that this consent applies
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Policies covered by this consent
    */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.native
  /**
    * Policy that this consents to
    */
  var policyRule: js.UndefOr[uri] = js.native
  /**
    * Context of activities for which the agreement is made
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Source from which this consent is taken
    */
  var sourceAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Source from which this consent is taken
    */
  var sourceIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Source from which this consent is taken
    */
  var sourceReference: js.UndefOr[Reference] = js.native
  /**
    * draft | proposed | active | rejected | inactive | entered-in-error
    */
  var status: code = js.native
}

object Consent {
  @scala.inline
  def apply(patient: Reference, status: code): Consent = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  @scala.inline
  implicit class ConsentOps[Self <: Consent] (val x: Self) extends AnyVal {
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
    def set_dateTime(value: Element): Self = this.set("_dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_dateTime: Self = this.set("_dateTime", js.undefined)
    @scala.inline
    def set_policyRule(value: Element): Self = this.set("_policyRule", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_policyRule: Self = this.set("_policyRule", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setActionVarargs(value: CodeableConcept*): Self = this.set("action", js.Array(value :_*))
    @scala.inline
    def setAction(value: js.Array[CodeableConcept]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setActorVarargs(value: ConsentActor*): Self = this.set("actor", js.Array(value :_*))
    @scala.inline
    def setActor(value: js.Array[ConsentActor]): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setConsentingPartyVarargs(value: Reference*): Self = this.set("consentingParty", js.Array(value :_*))
    @scala.inline
    def setConsentingParty(value: js.Array[Reference]): Self = this.set("consentingParty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsentingParty: Self = this.set("consentingParty", js.undefined)
    @scala.inline
    def setDataVarargs(value: ConsentData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[ConsentData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataPeriod(value: Period): Self = this.set("dataPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataPeriod: Self = this.set("dataPeriod", js.undefined)
    @scala.inline
    def setDateTime(value: dateTime): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setExceptVarargs(value: ConsentExcept*): Self = this.set("except", js.Array(value :_*))
    @scala.inline
    def setExcept(value: js.Array[ConsentExcept]): Self = this.set("except", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcept: Self = this.set("except", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setOrganizationVarargs(value: Reference*): Self = this.set("organization", js.Array(value :_*))
    @scala.inline
    def setOrganization(value: js.Array[Reference]): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPolicyVarargs(value: ConsentPolicy*): Self = this.set("policy", js.Array(value :_*))
    @scala.inline
    def setPolicy(value: js.Array[ConsentPolicy]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setPolicyRule(value: uri): Self = this.set("policyRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyRule: Self = this.set("policyRule", js.undefined)
    @scala.inline
    def setPurposeVarargs(value: Coding*): Self = this.set("purpose", js.Array(value :_*))
    @scala.inline
    def setPurpose(value: js.Array[Coding]): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = this.set("securityLabel", js.Array(value :_*))
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = this.set("securityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityLabel: Self = this.set("securityLabel", js.undefined)
    @scala.inline
    def setSourceAttachment(value: Attachment): Self = this.set("sourceAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAttachment: Self = this.set("sourceAttachment", js.undefined)
    @scala.inline
    def setSourceIdentifier(value: Identifier): Self = this.set("sourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIdentifier: Self = this.set("sourceIdentifier", js.undefined)
    @scala.inline
    def setSourceReference(value: Reference): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
  }
  
}

