package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a sub-type of ResourceBase. This is needed for stricter object literal typing introduced in TypeScript 1.6.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fhir.fhir.DomainResource
  - typings.fhir.fhir.Account
  - typings.fhir.fhir.ActivityDefinition
  - typings.fhir.fhir.AdverseEvent
  - typings.fhir.fhir.AllergyIntolerance
  - typings.fhir.fhir.Appointment
  - typings.fhir.fhir.AppointmentResponse
  - typings.fhir.fhir.AuditEvent
  - typings.fhir.fhir.Basic
  - typings.fhir.fhir.BodySite
  - typings.fhir.fhir.CapabilityStatement
  - typings.fhir.fhir.CarePlan
  - typings.fhir.fhir.CareTeam
  - typings.fhir.fhir.ChargeItem
  - typings.fhir.fhir.Claim
  - typings.fhir.fhir.ClaimResponse
  - typings.fhir.fhir.ClinicalImpression
  - typings.fhir.fhir.CodeSystem
  - typings.fhir.fhir.Communication
  - typings.fhir.fhir.CommunicationRequest
  - typings.fhir.fhir.CompartmentDefinition
  - typings.fhir.fhir.Composition
  - typings.fhir.fhir.ConceptMap
  - typings.fhir.fhir.Condition
  - typings.fhir.fhir.Consent
  - typings.fhir.fhir.Contract
  - typings.fhir.fhir.Coverage
  - typings.fhir.fhir.DataElement
  - typings.fhir.fhir.DetectedIssue
  - typings.fhir.fhir.Device
  - typings.fhir.fhir.DeviceComponent
  - typings.fhir.fhir.DeviceMetric
  - typings.fhir.fhir.DeviceRequest
  - typings.fhir.fhir.DeviceUseStatement
  - typings.fhir.fhir.DiagnosticReport
  - typings.fhir.fhir.DocumentManifest
  - typings.fhir.fhir.DocumentReference
  - typings.fhir.fhir.EligibilityRequest
  - typings.fhir.fhir.EligibilityResponse
  - typings.fhir.fhir.Encounter
  - typings.fhir.fhir.Endpoint
  - typings.fhir.fhir.EnrollmentRequest
  - typings.fhir.fhir.EnrollmentResponse
  - typings.fhir.fhir.EpisodeOfCare
  - typings.fhir.fhir.ExpansionProfile
  - typings.fhir.fhir.ExplanationOfBenefit
  - typings.fhir.fhir.FamilyMemberHistory
  - typings.fhir.fhir.Flag
  - typings.fhir.fhir.Goal
  - typings.fhir.fhir.GraphDefinition
  - typings.fhir.fhir.Group
  - typings.fhir.fhir.GuidanceResponse
  - typings.fhir.fhir.HealthcareService
  - typings.fhir.fhir.ImagingManifest
  - typings.fhir.fhir.ImagingStudy
  - typings.fhir.fhir.Immunization
  - typings.fhir.fhir.ImmunizationRecommendation
  - typings.fhir.fhir.ImplementationGuide
  - typings.fhir.fhir.Library
  - typings.fhir.fhir.Linkage
  - typings.fhir.fhir.List
  - typings.fhir.fhir.Location
  - typings.fhir.fhir.Measure
  - typings.fhir.fhir.MeasureReport
  - typings.fhir.fhir.Media
  - typings.fhir.fhir.Medication
  - typings.fhir.fhir.MedicationAdministration
  - typings.fhir.fhir.MedicationDispense
  - typings.fhir.fhir.MedicationRequest
  - typings.fhir.fhir.MedicationStatement
  - typings.fhir.fhir.MessageDefinition
  - typings.fhir.fhir.MessageHeader
  - typings.fhir.fhir.NamingSystem
  - typings.fhir.fhir.NutritionOrder
  - typings.fhir.fhir.Observation
  - typings.fhir.fhir.OperationDefinition
  - typings.fhir.fhir.OperationOutcome
  - typings.fhir.fhir.Organization
  - typings.fhir.fhir.Patient
  - typings.fhir.fhir.PaymentNotice
  - typings.fhir.fhir.PaymentReconciliation
  - typings.fhir.fhir.Person
  - typings.fhir.fhir.PlanDefinition
  - typings.fhir.fhir.Practitioner
  - typings.fhir.fhir.PractitionerRole
  - typings.fhir.fhir.Procedure
  - typings.fhir.fhir.ProcedureRequest
  - typings.fhir.fhir.ProcessRequest
  - typings.fhir.fhir.ProcessResponse
  - typings.fhir.fhir.Provenance
  - typings.fhir.fhir.Questionnaire
  - typings.fhir.fhir.QuestionnaireResponse
  - typings.fhir.fhir.ReferralRequest
  - typings.fhir.fhir.RelatedPerson
  - typings.fhir.fhir.RequestGroup
  - typings.fhir.fhir.ResearchStudy
  - typings.fhir.fhir.ResearchSubject
  - typings.fhir.fhir.RiskAssessment
  - typings.fhir.fhir.Schedule
  - typings.fhir.fhir.SearchParameter
  - typings.fhir.fhir.Sequence
  - typings.fhir.fhir.ServiceDefinition
  - typings.fhir.fhir.Slot
  - typings.fhir.fhir.Specimen
  - typings.fhir.fhir.StructureDefinition
  - typings.fhir.fhir.StructureMap
  - typings.fhir.fhir.Subscription
  - typings.fhir.fhir.Substance
  - typings.fhir.fhir.SupplyDelivery
  - typings.fhir.fhir.SupplyRequest
  - typings.fhir.fhir.Task
  - typings.fhir.fhir.TestReport
  - typings.fhir.fhir.TestScript
  - typings.fhir.fhir.ValueSet
  - typings.fhir.fhir.VisionPrescription
  - typings.fhir.fhir.Binary
  - typings.fhir.fhir.Bundle
  - typings.fhir.fhir.Parameters
*/
trait Resource extends js.Object

object Resource {
  @scala.inline
  def ProcedureRequest(
    code: CodeableConcept,
    intent: code,
    status: code,
    subject: Reference,
    _asNeededBoolean: Element = null,
    _authoredOn: Element = null,
    _doNotPerform: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    asNeededBoolean: js.UndefOr[Boolean] = js.undefined,
    asNeededCodeableConcept: CodeableConcept = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    bodySite: js.Array[CodeableConcept] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    doNotPerform: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    performer: Reference = null,
    performerType: CodeableConcept = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    relevantHistory: js.Array[Reference] = null,
    replaces: js.Array[Reference] = null,
    requester: ProcedureRequestRequester = null,
    requisition: Identifier = null,
    resourceType: code = null,
    specimen: js.Array[Reference] = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_asNeededBoolean != null) __obj.updateDynamic("_asNeededBoolean")(_asNeededBoolean.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_doNotPerform != null) __obj.updateDynamic("_doNotPerform")(_doNotPerform.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (!js.isUndefined(asNeededBoolean)) __obj.updateDynamic("asNeededBoolean")(asNeededBoolean.get.asInstanceOf[js.Any])
    if (asNeededCodeableConcept != null) __obj.updateDynamic("asNeededCodeableConcept")(asNeededCodeableConcept.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotPerform)) __obj.updateDynamic("doNotPerform")(doNotPerform.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (performerType != null) __obj.updateDynamic("performerType")(performerType.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (requisition != null) __obj.updateDynamic("requisition")(requisition.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Practitioner(
    _active: Element = null,
    _birthDate: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    birthDate: date = null,
    communication: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: js.Array[HumanName] = null,
    photo: js.Array[Attachment] = null,
    qualification: js.Array[PractitionerQualification] = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_birthDate != null) __obj.updateDynamic("_birthDate")(_birthDate.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (communication != null) __obj.updateDynamic("communication")(communication.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (qualification != null) __obj.updateDynamic("qualification")(qualification.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Device(
    _expirationDate: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lotNumber: Element = null,
    _manufactureDate: Element = null,
    _manufacturer: Element = null,
    _model: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactPoint] = null,
    contained: js.Array[Resource] = null,
    expirationDate: dateTime = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    lotNumber: String = null,
    manufactureDate: dateTime = null,
    manufacturer: String = null,
    meta: Meta = null,
    model: String = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    owner: Reference = null,
    patient: Reference = null,
    resourceType: code = null,
    safety: js.Array[CodeableConcept] = null,
    status: code = null,
    text: Narrative = null,
    `type`: CodeableConcept = null,
    udi: DeviceUdi = null,
    url: uri = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_expirationDate != null) __obj.updateDynamic("_expirationDate")(_expirationDate.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lotNumber != null) __obj.updateDynamic("_lotNumber")(_lotNumber.asInstanceOf[js.Any])
    if (_manufactureDate != null) __obj.updateDynamic("_manufactureDate")(_manufactureDate.asInstanceOf[js.Any])
    if (_manufacturer != null) __obj.updateDynamic("_manufacturer")(_manufacturer.asInstanceOf[js.Any])
    if (_model != null) __obj.updateDynamic("_model")(_model.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (lotNumber != null) __obj.updateDynamic("lotNumber")(lotNumber.asInstanceOf[js.Any])
    if (manufactureDate != null) __obj.updateDynamic("manufactureDate")(manufactureDate.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (safety != null) __obj.updateDynamic("safety")(safety.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (udi != null) __obj.updateDynamic("udi")(udi.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Procedure(
    status: code,
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notDone: Element = null,
    _performedDateTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    bodySite: js.Array[CodeableConcept] = null,
    category: CodeableConcept = null,
    code: CodeableConcept = null,
    complication: js.Array[CodeableConcept] = null,
    complicationDetail: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    focalDevice: js.Array[ProcedureFocalDevice] = null,
    followUp: js.Array[CodeableConcept] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReason: CodeableConcept = null,
    note: js.Array[Annotation] = null,
    outcome: CodeableConcept = null,
    partOf: js.Array[Reference] = null,
    performedDateTime: dateTime = null,
    performedPeriod: Period = null,
    performer: js.Array[ProcedurePerformer] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    report: js.Array[Reference] = null,
    resourceType: code = null,
    text: Narrative = null,
    usedCode: js.Array[CodeableConcept] = null,
    usedReference: js.Array[Reference] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone.asInstanceOf[js.Any])
    if (_performedDateTime != null) __obj.updateDynamic("_performedDateTime")(_performedDateTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (complication != null) __obj.updateDynamic("complication")(complication.asInstanceOf[js.Any])
    if (complicationDetail != null) __obj.updateDynamic("complicationDetail")(complicationDetail.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focalDevice != null) __obj.updateDynamic("focalDevice")(focalDevice.asInstanceOf[js.Any])
    if (followUp != null) __obj.updateDynamic("followUp")(followUp.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone.get.asInstanceOf[js.Any])
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performedDateTime != null) __obj.updateDynamic("performedDateTime")(performedDateTime.asInstanceOf[js.Any])
    if (performedPeriod != null) __obj.updateDynamic("performedPeriod")(performedPeriod.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (report != null) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (usedCode != null) __obj.updateDynamic("usedCode")(usedCode.asInstanceOf[js.Any])
    if (usedReference != null) __obj.updateDynamic("usedReference")(usedReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Person(
    _active: Element = null,
    _birthDate: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    birthDate: date = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    link: js.Array[PersonLink] = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: js.Array[HumanName] = null,
    photo: Attachment = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_birthDate != null) __obj.updateDynamic("_birthDate")(_birthDate.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def SearchParameter(
    base: js.Array[code],
    code: code,
    description: markdown,
    name: String,
    status: code,
    `type`: code,
    url: uri,
    _base: js.Array[Element] = null,
    _chain: js.Array[Element] = null,
    _code: Element = null,
    _comparator: js.Array[Element] = null,
    _date: Element = null,
    _derivedFrom: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _expression: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _modifier: js.Array[Element] = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _target: js.Array[Element] = null,
    _type: Element = null,
    _url: Element = null,
    _version: Element = null,
    _xpath: Element = null,
    _xpathUsage: Element = null,
    chain: js.Array[String] = null,
    comparator: js.Array[code] = null,
    component: js.Array[SearchParameterComponent] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    derivedFrom: uri = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    expression: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifier: js.Array[code] = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    target: js.Array[code] = null,
    text: Narrative = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null,
    xpath: String = null,
    xpathUsage: code = null
  ): Resource = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_base != null) __obj.updateDynamic("_base")(_base.asInstanceOf[js.Any])
    if (_chain != null) __obj.updateDynamic("_chain")(_chain.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_comparator != null) __obj.updateDynamic("_comparator")(_comparator.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_derivedFrom != null) __obj.updateDynamic("_derivedFrom")(_derivedFrom.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_expression != null) __obj.updateDynamic("_expression")(_expression.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_modifier != null) __obj.updateDynamic("_modifier")(_modifier.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_target != null) __obj.updateDynamic("_target")(_target.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (_xpath != null) __obj.updateDynamic("_xpath")(_xpath.asInstanceOf[js.Any])
    if (_xpathUsage != null) __obj.updateDynamic("_xpathUsage")(_xpathUsage.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (derivedFrom != null) __obj.updateDynamic("derivedFrom")(derivedFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (xpath != null) __obj.updateDynamic("xpath")(xpath.asInstanceOf[js.Any])
    if (xpathUsage != null) __obj.updateDynamic("xpathUsage")(xpathUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ProcessResponse(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    communicationRequest: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    error: js.Array[CodeableConcept] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    outcome: CodeableConcept = null,
    processNote: js.Array[ProcessResponseProcessNote] = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (communicationRequest != null) __obj.updateDynamic("communicationRequest")(communicationRequest.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (processNote != null) __obj.updateDynamic("processNote")(processNote.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Schedule(
    actor: js.Array[Reference],
    _active: Element = null,
    _comment: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    planningHorizon: Period = null,
    resourceType: code = null,
    serviceCategory: CodeableConcept = null,
    serviceType: js.Array[CodeableConcept] = null,
    specialty: js.Array[CodeableConcept] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (planningHorizon != null) __obj.updateDynamic("planningHorizon")(planningHorizon.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceCategory != null) __obj.updateDynamic("serviceCategory")(serviceCategory.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DiagnosticReport(
    code: CodeableConcept,
    status: code,
    _conclusion: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    category: CodeableConcept = null,
    codedDiagnosis: js.Array[CodeableConcept] = null,
    conclusion: String = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    image: js.Array[DiagnosticReportImage] = null,
    imagingStudy: js.Array[Reference] = null,
    implicitRules: uri = null,
    issued: instant = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    performer: js.Array[DiagnosticReportPerformer] = null,
    presentedForm: js.Array[Attachment] = null,
    resourceType: code = null,
    result: js.Array[Reference] = null,
    specimen: js.Array[Reference] = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_conclusion != null) __obj.updateDynamic("_conclusion")(_conclusion.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (codedDiagnosis != null) __obj.updateDynamic("codedDiagnosis")(codedDiagnosis.asInstanceOf[js.Any])
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imagingStudy != null) __obj.updateDynamic("imagingStudy")(imagingStudy.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (presentedForm != null) __obj.updateDynamic("presentedForm")(presentedForm.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EligibilityResponse(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _inforce: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    error: js.Array[EligibilityResponseError] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    inforce: js.UndefOr[Boolean] = js.undefined,
    insurance: js.Array[EligibilityResponseInsurance] = null,
    insurer: Reference = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: CodeableConcept = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_inforce != null) __obj.updateDynamic("_inforce")(_inforce.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (!js.isUndefined(inforce)) __obj.updateDynamic("inforce")(inforce.get.asInstanceOf[js.Any])
    if (insurance != null) __obj.updateDynamic("insurance")(insurance.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Parameters(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    parameter: js.Array[ParametersParameter] = null,
    resourceType: code = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImmunizationRecommendation(
    patient: Reference,
    recommendation: js.Array[ImmunizationRecommendationRecommendation],
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Provenance(
    agent: js.Array[ProvenanceAgent],
    recorded: instant,
    target: js.Array[Reference],
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _policy: js.Array[Element] = null,
    _recorded: Element = null,
    _resourceType: Element = null,
    activity: Coding = null,
    contained: js.Array[Resource] = null,
    entity: js.Array[ProvenanceEntity] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    policy: js.Array[uri] = null,
    reason: js.Array[Coding] = null,
    resourceType: code = null,
    signature: js.Array[Signature] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_policy != null) __obj.updateDynamic("_policy")(_policy.asInstanceOf[js.Any])
    if (_recorded != null) __obj.updateDynamic("_recorded")(_recorded.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def VisionPrescription(
    _dateWritten: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    dateWritten: dateTime = null,
    dispense: js.Array[VisionPrescriptionDispense] = null,
    encounter: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    patient: Reference = null,
    prescriber: Reference = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_dateWritten != null) __obj.updateDynamic("_dateWritten")(_dateWritten.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (dateWritten != null) __obj.updateDynamic("dateWritten")(dateWritten.asInstanceOf[js.Any])
    if (dispense != null) __obj.updateDynamic("dispense")(dispense.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (prescriber != null) __obj.updateDynamic("prescriber")(prescriber.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Group(
    actual: Boolean,
    `type`: code,
    _active: Element = null,
    _actual: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _quantity: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    characteristic: js.Array[GroupCharacteristic] = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    member: js.Array[GroupMember] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    quantity: js.UndefOr[unsignedInt] = js.undefined,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_actual != null) __obj.updateDynamic("_actual")(_actual.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_quantity != null) __obj.updateDynamic("_quantity")(_quantity.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CareTeam(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    note: js.Array[Annotation] = null,
    participant: js.Array[CareTeamParticipant] = null,
    period: Period = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Contract(
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: js.Array[CodeableConcept] = null,
    actionReason: js.Array[CodeableConcept] = null,
    agent: js.Array[ContractAgent] = null,
    applies: Period = null,
    authority: js.Array[Reference] = null,
    bindingAttachment: Attachment = null,
    bindingReference: Reference = null,
    contained: js.Array[Resource] = null,
    contentDerivative: CodeableConcept = null,
    decisionType: CodeableConcept = null,
    domain: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    friendly: js.Array[ContractFriendly] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    issued: dateTime = null,
    language: code = null,
    legal: js.Array[ContractLegal] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    rule: js.Array[ContractRule] = null,
    securityLabel: js.Array[Coding] = null,
    signer: js.Array[ContractSigner] = null,
    status: code = null,
    subType: js.Array[CodeableConcept] = null,
    subject: js.Array[Reference] = null,
    term: js.Array[ContractTerm] = null,
    text: Narrative = null,
    topic: js.Array[Reference] = null,
    `type`: CodeableConcept = null,
    valuedItem: js.Array[ContractValuedItem] = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionReason != null) __obj.updateDynamic("actionReason")(actionReason.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (applies != null) __obj.updateDynamic("applies")(applies.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (bindingAttachment != null) __obj.updateDynamic("bindingAttachment")(bindingAttachment.asInstanceOf[js.Any])
    if (bindingReference != null) __obj.updateDynamic("bindingReference")(bindingReference.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contentDerivative != null) __obj.updateDynamic("contentDerivative")(contentDerivative.asInstanceOf[js.Any])
    if (decisionType != null) __obj.updateDynamic("decisionType")(decisionType.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (friendly != null) __obj.updateDynamic("friendly")(friendly.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (legal != null) __obj.updateDynamic("legal")(legal.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valuedItem != null) __obj.updateDynamic("valuedItem")(valuedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Sequence(
    coordinateSystem: integer,
    _coordinateSystem: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _observedSeq: Element = null,
    _readCoverage: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    contained: js.Array[Resource] = null,
    device: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    observedSeq: String = null,
    patient: Reference = null,
    performer: Reference = null,
    pointer: js.Array[Reference] = null,
    quality: js.Array[SequenceQuality] = null,
    quantity: Quantity = null,
    readCoverage: js.UndefOr[integer] = js.undefined,
    referenceSeq: SequenceReferenceSeq = null,
    repository: js.Array[SequenceRepository] = null,
    resourceType: code = null,
    specimen: Reference = null,
    text: Narrative = null,
    `type`: code = null,
    variant: js.Array[SequenceVariant] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    if (_coordinateSystem != null) __obj.updateDynamic("_coordinateSystem")(_coordinateSystem.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_observedSeq != null) __obj.updateDynamic("_observedSeq")(_observedSeq.asInstanceOf[js.Any])
    if (_readCoverage != null) __obj.updateDynamic("_readCoverage")(_readCoverage.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (observedSeq != null) __obj.updateDynamic("observedSeq")(observedSeq.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (!js.isUndefined(readCoverage)) __obj.updateDynamic("readCoverage")(readCoverage.get.asInstanceOf[js.Any])
    if (referenceSeq != null) __obj.updateDynamic("referenceSeq")(referenceSeq.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Composition(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept,
    _confidentiality: Element = null,
    _date: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    attester: js.Array[CompositionAttester] = null,
    `class`: CodeableConcept = null,
    confidentiality: code = null,
    contained: js.Array[Resource] = null,
    custodian: Reference = null,
    encounter: Reference = null,
    event: js.Array[CompositionEvent] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    relatesTo: js.Array[CompositionRelatesTo] = null,
    resourceType: code = null,
    section: js.Array[CompositionSection] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_confidentiality != null) __obj.updateDynamic("_confidentiality")(_confidentiality.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (attester != null) __obj.updateDynamic("attester")(attester.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (confidentiality != null) __obj.updateDynamic("confidentiality")(confidentiality.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (custodian != null) __obj.updateDynamic("custodian")(custodian.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (relatesTo != null) __obj.updateDynamic("relatesTo")(relatesTo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def OperationOutcome(
    issue: js.Array[OperationOutcomeIssue],
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Patient(
    _active: Element = null,
    _birthDate: Element = null,
    _deceasedBoolean: Element = null,
    _deceasedDateTime: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _multipleBirthBoolean: Element = null,
    _multipleBirthInteger: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    animal: PatientAnimal = null,
    birthDate: date = null,
    communication: js.Array[PatientCommunication] = null,
    contact: js.Array[PatientContact] = null,
    contained: js.Array[Resource] = null,
    deceasedBoolean: js.UndefOr[Boolean] = js.undefined,
    deceasedDateTime: dateTime = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    generalPractitioner: js.Array[Reference] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    link: js.Array[PatientLink] = null,
    managingOrganization: Reference = null,
    maritalStatus: CodeableConcept = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    multipleBirthBoolean: js.UndefOr[Boolean] = js.undefined,
    multipleBirthInteger: js.UndefOr[integer] = js.undefined,
    name: js.Array[HumanName] = null,
    photo: js.Array[Attachment] = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_birthDate != null) __obj.updateDynamic("_birthDate")(_birthDate.asInstanceOf[js.Any])
    if (_deceasedBoolean != null) __obj.updateDynamic("_deceasedBoolean")(_deceasedBoolean.asInstanceOf[js.Any])
    if (_deceasedDateTime != null) __obj.updateDynamic("_deceasedDateTime")(_deceasedDateTime.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_multipleBirthBoolean != null) __obj.updateDynamic("_multipleBirthBoolean")(_multipleBirthBoolean.asInstanceOf[js.Any])
    if (_multipleBirthInteger != null) __obj.updateDynamic("_multipleBirthInteger")(_multipleBirthInteger.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (animal != null) __obj.updateDynamic("animal")(animal.asInstanceOf[js.Any])
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (communication != null) __obj.updateDynamic("communication")(communication.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (!js.isUndefined(deceasedBoolean)) __obj.updateDynamic("deceasedBoolean")(deceasedBoolean.get.asInstanceOf[js.Any])
    if (deceasedDateTime != null) __obj.updateDynamic("deceasedDateTime")(deceasedDateTime.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (generalPractitioner != null) __obj.updateDynamic("generalPractitioner")(generalPractitioner.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (maritalStatus != null) __obj.updateDynamic("maritalStatus")(maritalStatus.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleBirthBoolean)) __obj.updateDynamic("multipleBirthBoolean")(multipleBirthBoolean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleBirthInteger)) __obj.updateDynamic("multipleBirthInteger")(multipleBirthInteger.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def NamingSystem(
    date: dateTime,
    kind: code,
    name: String,
    status: code,
    uniqueId: js.Array[NamingSystemUniqueId],
    _date: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _responsible: Element = null,
    _status: Element = null,
    _usage: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    description: markdown = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    replacedBy: Reference = null,
    resourceType: code = null,
    responsible: String = null,
    text: Narrative = null,
    `type`: CodeableConcept = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_responsible != null) __obj.updateDynamic("_responsible")(_responsible.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (replacedBy != null) __obj.updateDynamic("replacedBy")(replacedBy.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (responsible != null) __obj.updateDynamic("responsible")(responsible.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DomainResource(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def BodySite(
    patient: Reference,
    _active: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    image: js.Array[Attachment] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    qualifier: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Specimen(
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _receivedTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    accessionIdentifier: Identifier = null,
    collection: SpecimenCollection = null,
    contained: js.Array[Resource] = null,
    container: js.Array[SpecimenContainer] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    parent: js.Array[Reference] = null,
    processing: js.Array[SpecimenProcessing] = null,
    receivedTime: dateTime = null,
    request: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_receivedTime != null) __obj.updateDynamic("_receivedTime")(_receivedTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (accessionIdentifier != null) __obj.updateDynamic("accessionIdentifier")(accessionIdentifier.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(processing.asInstanceOf[js.Any])
    if (receivedTime != null) __obj.updateDynamic("receivedTime")(receivedTime.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceComponent(
    identifier: Identifier,
    `type`: CodeableConcept,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastSystemChange: Element = null,
    _measurementPrinciple: Element = null,
    _resourceType: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    languageCode: CodeableConcept = null,
    lastSystemChange: instant = null,
    measurementPrinciple: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    operationalStatus: js.Array[CodeableConcept] = null,
    parameterGroup: CodeableConcept = null,
    parent: Reference = null,
    productionSpecification: js.Array[DeviceComponentProductionSpecification] = null,
    resourceType: code = null,
    source: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastSystemChange != null) __obj.updateDynamic("_lastSystemChange")(_lastSystemChange.asInstanceOf[js.Any])
    if (_measurementPrinciple != null) __obj.updateDynamic("_measurementPrinciple")(_measurementPrinciple.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (lastSystemChange != null) __obj.updateDynamic("lastSystemChange")(lastSystemChange.asInstanceOf[js.Any])
    if (measurementPrinciple != null) __obj.updateDynamic("measurementPrinciple")(measurementPrinciple.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (parameterGroup != null) __obj.updateDynamic("parameterGroup")(parameterGroup.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (productionSpecification != null) __obj.updateDynamic("productionSpecification")(productionSpecification.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CommunicationRequest(
    status: code,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medium: js.Array[CodeableConcept] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    payload: js.Array[CommunicationRequestPayload] = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    recipient: js.Array[Reference] = null,
    replaces: js.Array[Reference] = null,
    requester: CommunicationRequestRequester = null,
    resourceType: code = null,
    sender: Reference = null,
    subject: Reference = null,
    text: Narrative = null,
    topic: js.Array[Reference] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CompartmentDefinition(
    code: code,
    name: String,
    search: Boolean,
    status: code,
    url: uri,
    _code: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _search: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    purpose: markdown = null,
    resource: js.Array[CompartmentDefinitionResource] = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    useContext: js.Array[UsageContext] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_search != null) __obj.updateDynamic("_search")(_search.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EnrollmentResponse(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    outcome: CodeableConcept = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def RiskAssessment(
    status: code,
    _comment: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _mitigation: Element = null,
    _occurrenceDateTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: Reference = null,
    basis: js.Array[Reference] = null,
    code: CodeableConcept = null,
    comment: String = null,
    condition: Reference = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    method: CodeableConcept = null,
    mitigation: String = null,
    modifierExtension: js.Array[Extension] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    parent: Reference = null,
    performer: Reference = null,
    prediction: js.Array[RiskAssessmentPrediction] = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    resourceType: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_mitigation != null) __obj.updateDynamic("_mitigation")(_mitigation.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mitigation != null) __obj.updateDynamic("mitigation")(mitigation.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (prediction != null) __obj.updateDynamic("prediction")(prediction.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Subscription(
    channel: SubscriptionChannel,
    criteria: String,
    reason: String,
    status: code,
    _criteria: Element = null,
    _end: Element = null,
    _error: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _reason: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contact: js.Array[ContactPoint] = null,
    contained: js.Array[Resource] = null,
    end: instant = null,
    error: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    tag: js.Array[Coding] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_reason != null) __obj.updateDynamic("_reason")(_reason.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationRequest(
    intent: code,
    subject: Reference,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    detectedIssue: js.Array[Reference] = null,
    dispenseRequest: MedicationRequestDispenseRequest = null,
    dosageInstruction: js.Array[Dosage] = null,
    eventHistory: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    priorPrescription: Reference = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    recorder: Reference = null,
    requester: MedicationRequestRequester = null,
    resourceType: code = null,
    status: code = null,
    substitution: MedicationRequestSubstitution = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (detectedIssue != null) __obj.updateDynamic("detectedIssue")(detectedIssue.asInstanceOf[js.Any])
    if (dispenseRequest != null) __obj.updateDynamic("dispenseRequest")(dispenseRequest.asInstanceOf[js.Any])
    if (dosageInstruction != null) __obj.updateDynamic("dosageInstruction")(dosageInstruction.asInstanceOf[js.Any])
    if (eventHistory != null) __obj.updateDynamic("eventHistory")(eventHistory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept.asInstanceOf[js.Any])
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (priorPrescription != null) __obj.updateDynamic("priorPrescription")(priorPrescription.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (recorder != null) __obj.updateDynamic("recorder")(recorder.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (substitution != null) __obj.updateDynamic("substitution")(substitution.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ReferralRequest(
    intent: code,
    status: code,
    subject: Reference,
    _authoredOn: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    recipient: js.Array[Reference] = null,
    relevantHistory: js.Array[Reference] = null,
    replaces: js.Array[Reference] = null,
    requester: ReferralRequestRequester = null,
    resourceType: code = null,
    serviceRequested: js.Array[CodeableConcept] = null,
    specialty: CodeableConcept = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceRequested != null) __obj.updateDynamic("serviceRequested")(serviceRequested.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Substance(
    code: CodeableConcept,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    ingredient: js.Array[SubstanceIngredient] = null,
    instance: js.Array[SubstanceInstance] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (ingredient != null) __obj.updateDynamic("ingredient")(ingredient.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ResearchSubject(
    individual: Reference,
    status: code,
    study: Reference,
    _actualArm: Element = null,
    _assignedArm: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    actualArm: String = null,
    assignedArm: String = null,
    consent: Reference = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    if (_actualArm != null) __obj.updateDynamic("_actualArm")(_actualArm.asInstanceOf[js.Any])
    if (_assignedArm != null) __obj.updateDynamic("_assignedArm")(_assignedArm.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (actualArm != null) __obj.updateDynamic("actualArm")(actualArm.asInstanceOf[js.Any])
    if (assignedArm != null) __obj.updateDynamic("assignedArm")(assignedArm.asInstanceOf[js.Any])
    if (consent != null) __obj.updateDynamic("consent")(consent.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ActivityDefinition(
    status: code,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _timingDateTime: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    bodySite: js.Array[CodeableConcept] = null,
    code: CodeableConcept = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    dosage: js.Array[Dosage] = null,
    dynamicValue: js.Array[ActivityDefinitionDynamicValue] = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    kind: code = null,
    language: code = null,
    lastReviewDate: date = null,
    library: js.Array[Reference] = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    participant: js.Array[ActivityDefinitionParticipant] = null,
    productCodeableConcept: CodeableConcept = null,
    productReference: Reference = null,
    publisher: String = null,
    purpose: markdown = null,
    quantity: Quantity = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    text: Narrative = null,
    timingDateTime: dateTime = null,
    timingPeriod: Period = null,
    timingRange: Range = null,
    timingTiming: Timing = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    transform: Reference = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_timingDateTime != null) __obj.updateDynamic("_timingDateTime")(_timingDateTime.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contributor != null) __obj.updateDynamic("contributor")(contributor.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dosage != null) __obj.updateDynamic("dosage")(dosage.asInstanceOf[js.Any])
    if (dynamicValue != null) __obj.updateDynamic("dynamicValue")(dynamicValue.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (productCodeableConcept != null) __obj.updateDynamic("productCodeableConcept")(productCodeableConcept.asInstanceOf[js.Any])
    if (productReference != null) __obj.updateDynamic("productReference")(productReference.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timingDateTime != null) __obj.updateDynamic("timingDateTime")(timingDateTime.asInstanceOf[js.Any])
    if (timingPeriod != null) __obj.updateDynamic("timingPeriod")(timingPeriod.asInstanceOf[js.Any])
    if (timingRange != null) __obj.updateDynamic("timingRange")(timingRange.asInstanceOf[js.Any])
    if (timingTiming != null) __obj.updateDynamic("timingTiming")(timingTiming.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def StructureDefinition(
    `abstract`: Boolean,
    kind: code,
    name: String,
    status: code,
    `type`: code,
    url: uri,
    _abstract: Element = null,
    _baseDefinition: Element = null,
    _context: js.Array[Element] = null,
    _contextInvariant: js.Array[Element] = null,
    _contextType: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _derivation: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _fhirVersion: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _type: Element = null,
    _url: Element = null,
    _version: Element = null,
    baseDefinition: uri = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    context: js.Array[String] = null,
    contextInvariant: js.Array[String] = null,
    contextType: code = null,
    copyright: markdown = null,
    date: dateTime = null,
    derivation: code = null,
    description: markdown = null,
    differential: StructureDefinitionDifferential = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhirVersion: id = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    keyword: js.Array[Coding] = null,
    language: code = null,
    mapping: js.Array[StructureDefinitionMapping] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    snapshot: StructureDefinitionSnapshot = null,
    text: Narrative = null,
    title: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_abstract != null) __obj.updateDynamic("_abstract")(_abstract.asInstanceOf[js.Any])
    if (_baseDefinition != null) __obj.updateDynamic("_baseDefinition")(_baseDefinition.asInstanceOf[js.Any])
    if (_context != null) __obj.updateDynamic("_context")(_context.asInstanceOf[js.Any])
    if (_contextInvariant != null) __obj.updateDynamic("_contextInvariant")(_contextInvariant.asInstanceOf[js.Any])
    if (_contextType != null) __obj.updateDynamic("_contextType")(_contextType.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_derivation != null) __obj.updateDynamic("_derivation")(_derivation.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_fhirVersion != null) __obj.updateDynamic("_fhirVersion")(_fhirVersion.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (baseDefinition != null) __obj.updateDynamic("baseDefinition")(baseDefinition.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (contextInvariant != null) __obj.updateDynamic("contextInvariant")(contextInvariant.asInstanceOf[js.Any])
    if (contextType != null) __obj.updateDynamic("contextType")(contextType.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (derivation != null) __obj.updateDynamic("derivation")(derivation.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (differential != null) __obj.updateDynamic("differential")(differential.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhirVersion != null) __obj.updateDynamic("fhirVersion")(fhirVersion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Basic(
    code: CodeableConcept,
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    author: Reference = null,
    contained: js.Array[Resource] = null,
    created: date = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def RelatedPerson(
    patient: Reference,
    _active: Element = null,
    _birthDate: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    birthDate: date = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: js.Array[HumanName] = null,
    period: Period = null,
    photo: js.Array[Attachment] = null,
    relationship: CodeableConcept = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_birthDate != null) __obj.updateDynamic("_birthDate")(_birthDate.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Claim(
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _use: Element = null,
    accident: ClaimAccident = null,
    billablePeriod: Period = null,
    careTeam: js.Array[ClaimCareTeam] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    diagnosis: js.Array[ClaimDiagnosis] = null,
    employmentImpacted: Period = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    facility: Reference = null,
    fundsReserve: CodeableConcept = null,
    hospitalization: Period = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    information: js.Array[ClaimInformation] = null,
    insurance: js.Array[ClaimInsurance] = null,
    insurer: Reference = null,
    item: js.Array[ClaimItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    originalPrescription: Reference = null,
    patient: Reference = null,
    payee: ClaimPayee = null,
    prescription: Reference = null,
    priority: CodeableConcept = null,
    procedure: js.Array[ClaimProcedure] = null,
    provider: Reference = null,
    referral: Reference = null,
    related: js.Array[ClaimRelated] = null,
    resourceType: code = null,
    status: code = null,
    subType: js.Array[CodeableConcept] = null,
    text: Narrative = null,
    total: Money = null,
    `type`: CodeableConcept = null,
    use: code = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_use != null) __obj.updateDynamic("_use")(_use.asInstanceOf[js.Any])
    if (accident != null) __obj.updateDynamic("accident")(accident.asInstanceOf[js.Any])
    if (billablePeriod != null) __obj.updateDynamic("billablePeriod")(billablePeriod.asInstanceOf[js.Any])
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis.asInstanceOf[js.Any])
    if (employmentImpacted != null) __obj.updateDynamic("employmentImpacted")(employmentImpacted.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (fundsReserve != null) __obj.updateDynamic("fundsReserve")(fundsReserve.asInstanceOf[js.Any])
    if (hospitalization != null) __obj.updateDynamic("hospitalization")(hospitalization.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (information != null) __obj.updateDynamic("information")(information.asInstanceOf[js.Any])
    if (insurance != null) __obj.updateDynamic("insurance")(insurance.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (originalPrescription != null) __obj.updateDynamic("originalPrescription")(originalPrescription.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (payee != null) __obj.updateDynamic("payee")(payee.asInstanceOf[js.Any])
    if (prescription != null) __obj.updateDynamic("prescription")(prescription.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (procedure != null) __obj.updateDynamic("procedure")(procedure.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (referral != null) __obj.updateDynamic("referral")(referral.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ClaimResponse(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    addItem: js.Array[ClaimResponseAddItem] = null,
    communicationRequest: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    error: js.Array[ClaimResponseError] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    insurance: js.Array[ClaimResponseInsurance] = null,
    insurer: Reference = null,
    item: js.Array[ClaimResponseItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: CodeableConcept = null,
    patient: Reference = null,
    payeeType: CodeableConcept = null,
    payment: ClaimResponsePayment = null,
    processNote: js.Array[ClaimResponseProcessNote] = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    reserved: Coding = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null,
    totalBenefit: Money = null,
    totalCost: Money = null,
    unallocDeductable: Money = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (addItem != null) __obj.updateDynamic("addItem")(addItem.asInstanceOf[js.Any])
    if (communicationRequest != null) __obj.updateDynamic("communicationRequest")(communicationRequest.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (insurance != null) __obj.updateDynamic("insurance")(insurance.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (payeeType != null) __obj.updateDynamic("payeeType")(payeeType.asInstanceOf[js.Any])
    if (payment != null) __obj.updateDynamic("payment")(payment.asInstanceOf[js.Any])
    if (processNote != null) __obj.updateDynamic("processNote")(processNote.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (totalBenefit != null) __obj.updateDynamic("totalBenefit")(totalBenefit.asInstanceOf[js.Any])
    if (totalCost != null) __obj.updateDynamic("totalCost")(totalCost.asInstanceOf[js.Any])
    if (unallocDeductable != null) __obj.updateDynamic("unallocDeductable")(unallocDeductable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ConceptMap(
    status: code,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _sourceUri: Element = null,
    _status: Element = null,
    _targetUri: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    group: js.Array[ConceptMapGroup] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    sourceReference: Reference = null,
    sourceUri: uri = null,
    targetReference: Reference = null,
    targetUri: uri = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_sourceUri != null) __obj.updateDynamic("_sourceUri")(_sourceUri.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_targetUri != null) __obj.updateDynamic("_targetUri")(_targetUri.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (targetReference != null) __obj.updateDynamic("targetReference")(targetReference.asInstanceOf[js.Any])
    if (targetUri != null) __obj.updateDynamic("targetUri")(targetUri.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def QuestionnaireResponse(
    status: code,
    _authored: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    author: Reference = null,
    authored: dateTime = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    item: js.Array[QuestionnaireResponseItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    parent: js.Array[Reference] = null,
    questionnaire: Reference = null,
    resourceType: code = null,
    source: Reference = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_authored != null) __obj.updateDynamic("_authored")(_authored.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (authored != null) __obj.updateDynamic("authored")(authored.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (questionnaire != null) __obj.updateDynamic("questionnaire")(questionnaire.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ProcessRequest(
    _action: Element = null,
    _created: Element = null,
    _exclude: js.Array[Element] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _include: js.Array[Element] = null,
    _language: Element = null,
    _nullify: Element = null,
    _reference: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: code = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    exclude: js.Array[String] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    include: js.Array[String] = null,
    item: js.Array[ProcessRequestItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    nullify: js.UndefOr[Boolean] = js.undefined,
    organization: Reference = null,
    period: Period = null,
    provider: Reference = null,
    reference: String = null,
    request: Reference = null,
    resourceType: code = null,
    response: Reference = null,
    status: code = null,
    target: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_action != null) __obj.updateDynamic("_action")(_action.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_exclude != null) __obj.updateDynamic("_exclude")(_exclude.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_include != null) __obj.updateDynamic("_include")(_include.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_nullify != null) __obj.updateDynamic("_nullify")(_nullify.asInstanceOf[js.Any])
    if (_reference != null) __obj.updateDynamic("_reference")(_reference.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(nullify)) __obj.updateDynamic("nullify")(nullify.get.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def StructureMap(
    group: js.Array[StructureMapGroup],
    name: String,
    status: code,
    url: uri,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _import: js.Array[Element] = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    `import`: js.Array[uri] = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    structure: js.Array[StructureMapStructure] = null,
    text: Narrative = null,
    title: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_import != null) __obj.updateDynamic("_import")(_import.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImplementationGuide(
    name: String,
    status: code,
    url: uri,
    _binary: js.Array[Element] = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _fhirVersion: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _package: js.Array[ImplementationGuidePackage] = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    binary: js.Array[uri] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    dependency: js.Array[ImplementationGuideDependency] = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhirVersion: id = null,
    global: js.Array[ImplementationGuideGlobal] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    page: ImplementationGuidePage = null,
    publisher: String = null,
    resourceType: code = null,
    text: Narrative = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (_binary != null) __obj.updateDynamic("_binary")(_binary.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_fhirVersion != null) __obj.updateDynamic("_fhirVersion")(_fhirVersion.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhirVersion != null) __obj.updateDynamic("fhirVersion")(fhirVersion.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EpisodeOfCare(
    patient: Reference,
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    account: js.Array[Reference] = null,
    careManager: Reference = null,
    contained: js.Array[Resource] = null,
    diagnosis: js.Array[EpisodeOfCareDiagnosis] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    referralRequest: js.Array[Reference] = null,
    resourceType: code = null,
    statusHistory: js.Array[EpisodeOfCareStatusHistory] = null,
    team: js.Array[Reference] = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (careManager != null) __obj.updateDynamic("careManager")(careManager.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (referralRequest != null) __obj.updateDynamic("referralRequest")(referralRequest.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationAdministration(
    status: code,
    subject: Reference,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notGiven: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    device: js.Array[Reference] = null,
    dosage: MedicationAdministrationDosage = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    eventHistory: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notGiven: js.UndefOr[Boolean] = js.undefined,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    performer: js.Array[MedicationAdministrationPerformer] = null,
    prescription: Reference = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonNotGiven: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_notGiven != null) __obj.updateDynamic("_notGiven")(_notGiven.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (dosage != null) __obj.updateDynamic("dosage")(dosage.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (eventHistory != null) __obj.updateDynamic("eventHistory")(eventHistory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept.asInstanceOf[js.Any])
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(notGiven)) __obj.updateDynamic("notGiven")(notGiven.get.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (prescription != null) __obj.updateDynamic("prescription")(prescription.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonNotGiven != null) __obj.updateDynamic("reasonNotGiven")(reasonNotGiven.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MessageHeader(
    event: Coding,
    source: MessageHeaderSource,
    timestamp: instant,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _timestamp: Element = null,
    author: Reference = null,
    contained: js.Array[Resource] = null,
    destination: js.Array[MessageHeaderDestination] = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    focus: js.Array[Reference] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    reason: CodeableConcept = null,
    receiver: Reference = null,
    resourceType: code = null,
    response: MessageHeaderResponse = null,
    responsible: Reference = null,
    sender: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_timestamp != null) __obj.updateDynamic("_timestamp")(_timestamp.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responsible != null) __obj.updateDynamic("responsible")(responsible.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AdverseEvent(
    _category: Element = null,
    _date: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    category: code = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: String = null,
    eventParticipant: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: CodeableConcept = null,
    reaction: js.Array[Reference] = null,
    recorder: Reference = null,
    referenceDocument: js.Array[Reference] = null,
    resourceType: code = null,
    seriousness: CodeableConcept = null,
    study: js.Array[Reference] = null,
    subject: Reference = null,
    subjectMedicalHistory: js.Array[Reference] = null,
    suspectEntity: js.Array[AdverseEventSuspectEntity] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_category != null) __obj.updateDynamic("_category")(_category.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (eventParticipant != null) __obj.updateDynamic("eventParticipant")(eventParticipant.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (reaction != null) __obj.updateDynamic("reaction")(reaction.asInstanceOf[js.Any])
    if (recorder != null) __obj.updateDynamic("recorder")(recorder.asInstanceOf[js.Any])
    if (referenceDocument != null) __obj.updateDynamic("referenceDocument")(referenceDocument.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (seriousness != null) __obj.updateDynamic("seriousness")(seriousness.asInstanceOf[js.Any])
    if (study != null) __obj.updateDynamic("study")(study.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (subjectMedicalHistory != null) __obj.updateDynamic("subjectMedicalHistory")(subjectMedicalHistory.asInstanceOf[js.Any])
    if (suspectEntity != null) __obj.updateDynamic("suspectEntity")(suspectEntity.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def FamilyMemberHistory(
    patient: Reference,
    relationship: CodeableConcept,
    status: code,
    _ageString: Element = null,
    _bornDate: Element = null,
    _bornString: Element = null,
    _date: Element = null,
    _deceasedBoolean: Element = null,
    _deceasedDate: Element = null,
    _deceasedString: Element = null,
    _estimatedAge: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _notDone: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    ageAge: Age = null,
    ageRange: Range = null,
    ageString: String = null,
    bornDate: date = null,
    bornPeriod: Period = null,
    bornString: String = null,
    condition: js.Array[FamilyMemberHistoryCondition] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    deceasedAge: Age = null,
    deceasedBoolean: js.UndefOr[Boolean] = js.undefined,
    deceasedDate: date = null,
    deceasedRange: Range = null,
    deceasedString: String = null,
    definition: js.Array[Reference] = null,
    estimatedAge: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReason: CodeableConcept = null,
    note: js.Array[Annotation] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_ageString != null) __obj.updateDynamic("_ageString")(_ageString.asInstanceOf[js.Any])
    if (_bornDate != null) __obj.updateDynamic("_bornDate")(_bornDate.asInstanceOf[js.Any])
    if (_bornString != null) __obj.updateDynamic("_bornString")(_bornString.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_deceasedBoolean != null) __obj.updateDynamic("_deceasedBoolean")(_deceasedBoolean.asInstanceOf[js.Any])
    if (_deceasedDate != null) __obj.updateDynamic("_deceasedDate")(_deceasedDate.asInstanceOf[js.Any])
    if (_deceasedString != null) __obj.updateDynamic("_deceasedString")(_deceasedString.asInstanceOf[js.Any])
    if (_estimatedAge != null) __obj.updateDynamic("_estimatedAge")(_estimatedAge.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (ageAge != null) __obj.updateDynamic("ageAge")(ageAge.asInstanceOf[js.Any])
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (ageString != null) __obj.updateDynamic("ageString")(ageString.asInstanceOf[js.Any])
    if (bornDate != null) __obj.updateDynamic("bornDate")(bornDate.asInstanceOf[js.Any])
    if (bornPeriod != null) __obj.updateDynamic("bornPeriod")(bornPeriod.asInstanceOf[js.Any])
    if (bornString != null) __obj.updateDynamic("bornString")(bornString.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (deceasedAge != null) __obj.updateDynamic("deceasedAge")(deceasedAge.asInstanceOf[js.Any])
    if (!js.isUndefined(deceasedBoolean)) __obj.updateDynamic("deceasedBoolean")(deceasedBoolean.get.asInstanceOf[js.Any])
    if (deceasedDate != null) __obj.updateDynamic("deceasedDate")(deceasedDate.asInstanceOf[js.Any])
    if (deceasedRange != null) __obj.updateDynamic("deceasedRange")(deceasedRange.asInstanceOf[js.Any])
    if (deceasedString != null) __obj.updateDynamic("deceasedString")(deceasedString.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedAge)) __obj.updateDynamic("estimatedAge")(estimatedAge.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone.get.asInstanceOf[js.Any])
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PaymentNotice(
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _statusDate: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    paymentStatus: CodeableConcept = null,
    provider: Reference = null,
    request: Reference = null,
    resourceType: code = null,
    response: Reference = null,
    status: code = null,
    statusDate: date = null,
    target: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_statusDate != null) __obj.updateDynamic("_statusDate")(_statusDate.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (paymentStatus != null) __obj.updateDynamic("paymentStatus")(paymentStatus.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDate != null) __obj.updateDynamic("statusDate")(statusDate.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def List(
    mode: code,
    status: code,
    _date: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _mode: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    emptyReason: CodeableConcept = null,
    encounter: Reference = null,
    entry: js.Array[ListEntry] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    orderedBy: CodeableConcept = null,
    resourceType: code = null,
    source: Reference = null,
    subject: Reference = null,
    text: Narrative = null,
    title: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_mode != null) __obj.updateDynamic("_mode")(_mode.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (emptyReason != null) __obj.updateDynamic("emptyReason")(emptyReason.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (orderedBy != null) __obj.updateDynamic("orderedBy")(orderedBy.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ExplanationOfBenefit(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _precedence: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    accident: ExplanationOfBenefitAccident = null,
    addItem: js.Array[ExplanationOfBenefitAddItem] = null,
    benefitBalance: js.Array[ExplanationOfBenefitBenefitBalance] = null,
    billablePeriod: Period = null,
    careTeam: js.Array[ExplanationOfBenefitCareTeam] = null,
    claim: Reference = null,
    claimResponse: Reference = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    diagnosis: js.Array[ExplanationOfBenefitDiagnosis] = null,
    disposition: String = null,
    employmentImpacted: Period = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    facility: Reference = null,
    form: CodeableConcept = null,
    hospitalization: Period = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    information: js.Array[ExplanationOfBenefitInformation] = null,
    insurance: ExplanationOfBenefitInsurance = null,
    insurer: Reference = null,
    item: js.Array[ExplanationOfBenefitItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    originalPrescription: Reference = null,
    outcome: CodeableConcept = null,
    patient: Reference = null,
    payee: ExplanationOfBenefitPayee = null,
    payment: ExplanationOfBenefitPayment = null,
    precedence: js.UndefOr[positiveInt] = js.undefined,
    prescription: Reference = null,
    procedure: js.Array[ExplanationOfBenefitProcedure] = null,
    processNote: js.Array[ExplanationOfBenefitProcessNote] = null,
    provider: Reference = null,
    referral: Reference = null,
    related: js.Array[ExplanationOfBenefitRelated] = null,
    resourceType: code = null,
    status: code = null,
    subType: js.Array[CodeableConcept] = null,
    text: Narrative = null,
    totalBenefit: Money = null,
    totalCost: Money = null,
    `type`: CodeableConcept = null,
    unallocDeductable: Money = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_precedence != null) __obj.updateDynamic("_precedence")(_precedence.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (accident != null) __obj.updateDynamic("accident")(accident.asInstanceOf[js.Any])
    if (addItem != null) __obj.updateDynamic("addItem")(addItem.asInstanceOf[js.Any])
    if (benefitBalance != null) __obj.updateDynamic("benefitBalance")(benefitBalance.asInstanceOf[js.Any])
    if (billablePeriod != null) __obj.updateDynamic("billablePeriod")(billablePeriod.asInstanceOf[js.Any])
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam.asInstanceOf[js.Any])
    if (claim != null) __obj.updateDynamic("claim")(claim.asInstanceOf[js.Any])
    if (claimResponse != null) __obj.updateDynamic("claimResponse")(claimResponse.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (employmentImpacted != null) __obj.updateDynamic("employmentImpacted")(employmentImpacted.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (hospitalization != null) __obj.updateDynamic("hospitalization")(hospitalization.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (information != null) __obj.updateDynamic("information")(information.asInstanceOf[js.Any])
    if (insurance != null) __obj.updateDynamic("insurance")(insurance.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (originalPrescription != null) __obj.updateDynamic("originalPrescription")(originalPrescription.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (payee != null) __obj.updateDynamic("payee")(payee.asInstanceOf[js.Any])
    if (payment != null) __obj.updateDynamic("payment")(payment.asInstanceOf[js.Any])
    if (!js.isUndefined(precedence)) __obj.updateDynamic("precedence")(precedence.get.asInstanceOf[js.Any])
    if (prescription != null) __obj.updateDynamic("prescription")(prescription.asInstanceOf[js.Any])
    if (procedure != null) __obj.updateDynamic("procedure")(procedure.asInstanceOf[js.Any])
    if (processNote != null) __obj.updateDynamic("processNote")(processNote.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (referral != null) __obj.updateDynamic("referral")(referral.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (totalBenefit != null) __obj.updateDynamic("totalBenefit")(totalBenefit.asInstanceOf[js.Any])
    if (totalCost != null) __obj.updateDynamic("totalCost")(totalCost.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unallocDeductable != null) __obj.updateDynamic("unallocDeductable")(unallocDeductable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ResearchStudy(
    status: code,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    arm: js.Array[ResearchStudyArm] = null,
    category: js.Array[CodeableConcept] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    description: markdown = null,
    enrollment: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    focus: js.Array[CodeableConcept] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    keyword: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    period: Period = null,
    principalInvestigator: Reference = null,
    protocol: js.Array[Reference] = null,
    reasonStopped: CodeableConcept = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    site: js.Array[Reference] = null,
    sponsor: Reference = null,
    text: Narrative = null,
    title: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (arm != null) __obj.updateDynamic("arm")(arm.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enrollment != null) __obj.updateDynamic("enrollment")(enrollment.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (principalInvestigator != null) __obj.updateDynamic("principalInvestigator")(principalInvestigator.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (reasonStopped != null) __obj.updateDynamic("reasonStopped")(reasonStopped.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (sponsor != null) __obj.updateDynamic("sponsor")(sponsor.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Slot(
    end: instant,
    schedule: Reference,
    start: instant,
    status: code,
    _comment: Element = null,
    _end: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _overbooked: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    _status: Element = null,
    appointmentType: CodeableConcept = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    overbooked: js.UndefOr[Boolean] = js.undefined,
    resourceType: code = null,
    serviceCategory: CodeableConcept = null,
    serviceType: js.Array[CodeableConcept] = null,
    specialty: js.Array[CodeableConcept] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_overbooked != null) __obj.updateDynamic("_overbooked")(_overbooked.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (appointmentType != null) __obj.updateDynamic("appointmentType")(appointmentType.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(overbooked)) __obj.updateDynamic("overbooked")(overbooked.get.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceCategory != null) __obj.updateDynamic("serviceCategory")(serviceCategory.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CodeSystem(
    content: code,
    status: code,
    _caseSensitive: Element = null,
    _compositional: Element = null,
    _content: Element = null,
    _copyright: Element = null,
    _count: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _hierarchyMeaning: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _valueSet: Element = null,
    _version: Element = null,
    _versionNeeded: Element = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    compositional: js.UndefOr[Boolean] = js.undefined,
    concept: js.Array[CodeSystemConcept] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    count: js.UndefOr[unsignedInt] = js.undefined,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    filter: js.Array[CodeSystemFilter] = null,
    hierarchyMeaning: code = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    property: js.Array[CodeSystemProperty] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    valueSet: uri = null,
    version: String = null,
    versionNeeded: js.UndefOr[Boolean] = js.undefined
  ): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_caseSensitive != null) __obj.updateDynamic("_caseSensitive")(_caseSensitive.asInstanceOf[js.Any])
    if (_compositional != null) __obj.updateDynamic("_compositional")(_compositional.asInstanceOf[js.Any])
    if (_content != null) __obj.updateDynamic("_content")(_content.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_count != null) __obj.updateDynamic("_count")(_count.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_hierarchyMeaning != null) __obj.updateDynamic("_hierarchyMeaning")(_hierarchyMeaning.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_valueSet != null) __obj.updateDynamic("_valueSet")(_valueSet.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (_versionNeeded != null) __obj.updateDynamic("_versionNeeded")(_versionNeeded.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compositional)) __obj.updateDynamic("compositional")(compositional.get.asInstanceOf[js.Any])
    if (concept != null) __obj.updateDynamic("concept")(concept.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (hierarchyMeaning != null) __obj.updateDynamic("hierarchyMeaning")(hierarchyMeaning.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNeeded)) __obj.updateDynamic("versionNeeded")(versionNeeded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Flag(
    code: CodeableConcept,
    status: code,
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    author: Reference = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    encounter: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceRequest(
    intent: CodeableConcept,
    subject: Reference,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    codeCodeableConcept: CodeableConcept = null,
    codeReference: Reference = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    performer: Reference = null,
    performerType: CodeableConcept = null,
    priorRequest: js.Array[Reference] = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    relevantHistory: js.Array[Reference] = null,
    requester: DeviceRequestRequester = null,
    resourceType: code = null,
    status: code = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (codeCodeableConcept != null) __obj.updateDynamic("codeCodeableConcept")(codeCodeableConcept.asInstanceOf[js.Any])
    if (codeReference != null) __obj.updateDynamic("codeReference")(codeReference.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (performerType != null) __obj.updateDynamic("performerType")(performerType.asInstanceOf[js.Any])
    if (priorRequest != null) __obj.updateDynamic("priorRequest")(priorRequest.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def OperationDefinition(
    code: code,
    instance: Boolean,
    kind: code,
    name: String,
    status: code,
    system: Boolean,
    `type`: Boolean,
    _code: Element = null,
    _comment: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _idempotent: Element = null,
    _implicitRules: Element = null,
    _instance: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resource: js.Array[Element] = null,
    _resourceType: Element = null,
    _status: Element = null,
    _system: Element = null,
    _type: Element = null,
    _url: Element = null,
    _version: Element = null,
    base: Reference = null,
    comment: String = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    idempotent: js.UndefOr[Boolean] = js.undefined,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    overload: js.Array[OperationDefinitionOverload] = null,
    parameter: js.Array[OperationDefinitionParameter] = null,
    publisher: String = null,
    purpose: markdown = null,
    resource: js.Array[code] = null,
    resourceType: code = null,
    text: Narrative = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_idempotent != null) __obj.updateDynamic("_idempotent")(_idempotent.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_instance != null) __obj.updateDynamic("_instance")(_instance.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resource != null) __obj.updateDynamic("_resource")(_resource.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_system != null) __obj.updateDynamic("_system")(_system.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent.get.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (overload != null) __obj.updateDynamic("overload")(overload.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def HealthcareService(
    _active: Element = null,
    _appointmentRequired: Element = null,
    _availabilityExceptions: Element = null,
    _comment: Element = null,
    _eligibilityNote: Element = null,
    _extraDetails: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _programName: js.Array[Element] = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    appointmentRequired: js.UndefOr[Boolean] = js.undefined,
    availabilityExceptions: String = null,
    availableTime: js.Array[HealthcareServiceAvailableTime] = null,
    category: CodeableConcept = null,
    characteristic: js.Array[CodeableConcept] = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    coverageArea: js.Array[Reference] = null,
    eligibility: CodeableConcept = null,
    eligibilityNote: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    extraDetails: String = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    notAvailable: js.Array[HealthcareServiceNotAvailable] = null,
    photo: Attachment = null,
    programName: js.Array[String] = null,
    providedBy: Reference = null,
    referralMethod: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    serviceProvisionCode: js.Array[CodeableConcept] = null,
    specialty: js.Array[CodeableConcept] = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_appointmentRequired != null) __obj.updateDynamic("_appointmentRequired")(_appointmentRequired.asInstanceOf[js.Any])
    if (_availabilityExceptions != null) __obj.updateDynamic("_availabilityExceptions")(_availabilityExceptions.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_eligibilityNote != null) __obj.updateDynamic("_eligibilityNote")(_eligibilityNote.asInstanceOf[js.Any])
    if (_extraDetails != null) __obj.updateDynamic("_extraDetails")(_extraDetails.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_programName != null) __obj.updateDynamic("_programName")(_programName.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appointmentRequired)) __obj.updateDynamic("appointmentRequired")(appointmentRequired.get.asInstanceOf[js.Any])
    if (availabilityExceptions != null) __obj.updateDynamic("availabilityExceptions")(availabilityExceptions.asInstanceOf[js.Any])
    if (availableTime != null) __obj.updateDynamic("availableTime")(availableTime.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (coverageArea != null) __obj.updateDynamic("coverageArea")(coverageArea.asInstanceOf[js.Any])
    if (eligibility != null) __obj.updateDynamic("eligibility")(eligibility.asInstanceOf[js.Any])
    if (eligibilityNote != null) __obj.updateDynamic("eligibilityNote")(eligibilityNote.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (extraDetails != null) __obj.updateDynamic("extraDetails")(extraDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notAvailable != null) __obj.updateDynamic("notAvailable")(notAvailable.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (programName != null) __obj.updateDynamic("programName")(programName.asInstanceOf[js.Any])
    if (providedBy != null) __obj.updateDynamic("providedBy")(providedBy.asInstanceOf[js.Any])
    if (referralMethod != null) __obj.updateDynamic("referralMethod")(referralMethod.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceProvisionCode != null) __obj.updateDynamic("serviceProvisionCode")(serviceProvisionCode.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ClinicalImpression(
    status: code,
    subject: Reference,
    _date: Element = null,
    _description: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _protocol: js.Array[Element] = null,
    _resourceType: Element = null,
    _status: Element = null,
    _summary: Element = null,
    action: js.Array[Reference] = null,
    assessor: Reference = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    date: dateTime = null,
    description: String = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    finding: js.Array[ClinicalImpressionFinding] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    investigation: js.Array[ClinicalImpressionInvestigation] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    previous: Reference = null,
    problem: js.Array[Reference] = null,
    prognosisCodeableConcept: js.Array[CodeableConcept] = null,
    prognosisReference: js.Array[Reference] = null,
    protocol: js.Array[uri] = null,
    resourceType: code = null,
    summary: String = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_protocol != null) __obj.updateDynamic("_protocol")(_protocol.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_summary != null) __obj.updateDynamic("_summary")(_summary.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (assessor != null) __obj.updateDynamic("assessor")(assessor.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (investigation != null) __obj.updateDynamic("investigation")(investigation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (problem != null) __obj.updateDynamic("problem")(problem.asInstanceOf[js.Any])
    if (prognosisCodeableConcept != null) __obj.updateDynamic("prognosisCodeableConcept")(prognosisCodeableConcept.asInstanceOf[js.Any])
    if (prognosisReference != null) __obj.updateDynamic("prognosisReference")(prognosisReference.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def TestScript(
    name: String,
    status: code,
    url: uri,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    destination: js.Array[TestScriptDestination] = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fixture: js.Array[TestScriptFixture] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    metadata: TestScriptMetadata = null,
    modifierExtension: js.Array[Extension] = null,
    origin: js.Array[TestScriptOrigin] = null,
    profile: js.Array[Reference] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    rule: js.Array[TestScriptRule] = null,
    ruleset: js.Array[TestScriptRuleset] = null,
    setup: TestScriptSetup = null,
    teardown: TestScriptTeardown = null,
    test: js.Array[TestScriptTest] = null,
    text: Narrative = null,
    title: String = null,
    useContext: js.Array[UsageContext] = null,
    variable: js.Array[TestScriptVariable] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fixture != null) __obj.updateDynamic("fixture")(fixture.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (ruleset != null) __obj.updateDynamic("ruleset")(ruleset.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (teardown != null) __obj.updateDynamic("teardown")(teardown.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Immunization(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept,
    _date: Element = null,
    _expirationDate: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lotNumber: Element = null,
    _notGiven: Element = null,
    _primarySource: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    doseQuantity: Quantity = null,
    encounter: Reference = null,
    expirationDate: date = null,
    explanation: ImmunizationExplanation = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    lotNumber: String = null,
    manufacturer: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    practitioner: js.Array[ImmunizationPractitioner] = null,
    reaction: js.Array[ImmunizationReaction] = null,
    reportOrigin: CodeableConcept = null,
    resourceType: code = null,
    route: CodeableConcept = null,
    site: CodeableConcept = null,
    text: Narrative = null,
    vaccinationProtocol: js.Array[ImmunizationVaccinationProtocol] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_expirationDate != null) __obj.updateDynamic("_expirationDate")(_expirationDate.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lotNumber != null) __obj.updateDynamic("_lotNumber")(_lotNumber.asInstanceOf[js.Any])
    if (_notGiven != null) __obj.updateDynamic("_notGiven")(_notGiven.asInstanceOf[js.Any])
    if (_primarySource != null) __obj.updateDynamic("_primarySource")(_primarySource.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (doseQuantity != null) __obj.updateDynamic("doseQuantity")(doseQuantity.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (lotNumber != null) __obj.updateDynamic("lotNumber")(lotNumber.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (practitioner != null) __obj.updateDynamic("practitioner")(practitioner.asInstanceOf[js.Any])
    if (reaction != null) __obj.updateDynamic("reaction")(reaction.asInstanceOf[js.Any])
    if (reportOrigin != null) __obj.updateDynamic("reportOrigin")(reportOrigin.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (vaccinationProtocol != null) __obj.updateDynamic("vaccinationProtocol")(vaccinationProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ServiceDefinition(
    status: code,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    dataRequirement: js.Array[DataRequirement] = null,
    date: dateTime = null,
    description: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    operationDefinition: Reference = null,
    publisher: String = null,
    purpose: markdown = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    trigger: js.Array[TriggerDefinition] = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contributor != null) __obj.updateDynamic("contributor")(contributor.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (dataRequirement != null) __obj.updateDynamic("dataRequirement")(dataRequirement.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationDefinition != null) __obj.updateDynamic("operationDefinition")(operationDefinition.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DataElement(
    element: js.Array[ElementDefinition],
    status: code,
    _copyright: Element = null,
    _date: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _stringency: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    mapping: js.Array[DataElementMapping] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    resourceType: code = null,
    stringency: code = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_stringency != null) __obj.updateDynamic("_stringency")(_stringency.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (stringency != null) __obj.updateDynamic("stringency")(stringency.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationStatement(
    status: code,
    subject: Reference,
    taken: code,
    _dateAsserted: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _taken: Element = null,
    basedOn: js.Array[Reference] = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    dateAsserted: dateTime = null,
    derivedFrom: js.Array[Reference] = null,
    dosage: js.Array[Dosage] = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    informationSource: Reference = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonNotTaken: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    if (_dateAsserted != null) __obj.updateDynamic("_dateAsserted")(_dateAsserted.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_taken != null) __obj.updateDynamic("_taken")(_taken.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dateAsserted != null) __obj.updateDynamic("dateAsserted")(dateAsserted.asInstanceOf[js.Any])
    if (derivedFrom != null) __obj.updateDynamic("derivedFrom")(derivedFrom.asInstanceOf[js.Any])
    if (dosage != null) __obj.updateDynamic("dosage")(dosage.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (informationSource != null) __obj.updateDynamic("informationSource")(informationSource.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept.asInstanceOf[js.Any])
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonNotTaken != null) __obj.updateDynamic("reasonNotTaken")(reasonNotTaken.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Task(
    intent: code,
    status: code,
    _authoredOn: Element = null,
    _definitionUri: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _lastModified: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    businessStatus: CodeableConcept = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definitionReference: Reference = null,
    definitionUri: uri = null,
    description: String = null,
    executionPeriod: Period = null,
    extension: js.Array[Extension] = null,
    focus: Reference = null,
    `for`: Reference = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    input: js.Array[TaskInput] = null,
    language: code = null,
    lastModified: dateTime = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    output: js.Array[TaskOutput] = null,
    owner: Reference = null,
    partOf: js.Array[Reference] = null,
    performerType: js.Array[CodeableConcept] = null,
    priority: code = null,
    reason: CodeableConcept = null,
    relevantHistory: js.Array[Reference] = null,
    requester: TaskRequester = null,
    resourceType: code = null,
    restriction: TaskRestriction = null,
    statusReason: CodeableConcept = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_definitionUri != null) __obj.updateDynamic("_definitionUri")(_definitionUri.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastModified != null) __obj.updateDynamic("_lastModified")(_lastModified.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (businessStatus != null) __obj.updateDynamic("businessStatus")(businessStatus.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definitionReference != null) __obj.updateDynamic("definitionReference")(definitionReference.asInstanceOf[js.Any])
    if (definitionUri != null) __obj.updateDynamic("definitionUri")(definitionUri.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionPeriod != null) __obj.updateDynamic("executionPeriod")(executionPeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performerType != null) __obj.updateDynamic("performerType")(performerType.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (restriction != null) __obj.updateDynamic("restriction")(restriction.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ValueSet(
    status: code,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _extensible: Element = null,
    _id: Element = null,
    _immutable: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    compose: ValueSetCompose = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    expansion: ValueSetExpansion = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extensible: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    immutable: js.UndefOr[Boolean] = js.undefined,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_extensible != null) __obj.updateDynamic("_extensible")(_extensible.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_immutable != null) __obj.updateDynamic("_immutable")(_immutable.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (compose != null) __obj.updateDynamic("compose")(compose.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expansion != null) __obj.updateDynamic("expansion")(expansion.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extensible)) __obj.updateDynamic("extensible")(extensible.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.get.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Appointment(
    participant: js.Array[AppointmentParticipant],
    status: code,
    _comment: Element = null,
    _created: Element = null,
    _description: Element = null,
    _end: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _minutesDuration: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    _status: Element = null,
    appointmentType: CodeableConcept = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    description: String = null,
    end: instant = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    incomingReferral: js.Array[Reference] = null,
    indication: js.Array[Reference] = null,
    language: code = null,
    meta: Meta = null,
    minutesDuration: js.UndefOr[positiveInt] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    priority: js.UndefOr[unsignedInt] = js.undefined,
    reason: js.Array[CodeableConcept] = null,
    requestedPeriod: js.Array[Period] = null,
    resourceType: code = null,
    serviceCategory: CodeableConcept = null,
    serviceType: js.Array[CodeableConcept] = null,
    slot: js.Array[Reference] = null,
    specialty: js.Array[CodeableConcept] = null,
    start: instant = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_minutesDuration != null) __obj.updateDynamic("_minutesDuration")(_minutesDuration.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (appointmentType != null) __obj.updateDynamic("appointmentType")(appointmentType.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (incomingReferral != null) __obj.updateDynamic("incomingReferral")(incomingReferral.asInstanceOf[js.Any])
    if (indication != null) __obj.updateDynamic("indication")(indication.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(minutesDuration)) __obj.updateDynamic("minutesDuration")(minutesDuration.get.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (requestedPeriod != null) __obj.updateDynamic("requestedPeriod")(requestedPeriod.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceCategory != null) __obj.updateDynamic("serviceCategory")(serviceCategory.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EnrollmentRequest(
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    coverage: Reference = null,
    created: dateTime = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    insurer: Reference = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    provider: Reference = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PractitionerRole(
    _active: Element = null,
    _availabilityExceptions: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    availabilityExceptions: String = null,
    availableTime: js.Array[PractitionerRoleAvailableTime] = null,
    code: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    healthcareService: js.Array[Reference] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notAvailable: js.Array[PractitionerRoleNotAvailable] = null,
    organization: Reference = null,
    period: Period = null,
    practitioner: Reference = null,
    resourceType: code = null,
    specialty: js.Array[CodeableConcept] = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_availabilityExceptions != null) __obj.updateDynamic("_availabilityExceptions")(_availabilityExceptions.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (availabilityExceptions != null) __obj.updateDynamic("availabilityExceptions")(availabilityExceptions.asInstanceOf[js.Any])
    if (availableTime != null) __obj.updateDynamic("availableTime")(availableTime.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (healthcareService != null) __obj.updateDynamic("healthcareService")(healthcareService.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (notAvailable != null) __obj.updateDynamic("notAvailable")(notAvailable.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (practitioner != null) __obj.updateDynamic("practitioner")(practitioner.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Linkage(
    item: js.Array[LinkageItem],
    _active: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    author: Reference = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MessageDefinition(
    date: dateTime,
    event: Coding,
    status: code,
    _category: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _responseRequired: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    allowedResponse: js.Array[MessageDefinitionAllowedResponse] = null,
    base: Reference = null,
    category: code = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    focus: js.Array[MessageDefinitionFocus] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    parent: js.Array[Reference] = null,
    publisher: String = null,
    purpose: markdown = null,
    replaces: js.Array[Reference] = null,
    resourceType: code = null,
    responseRequired: js.UndefOr[Boolean] = js.undefined,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_category != null) __obj.updateDynamic("_category")(_category.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_responseRequired != null) __obj.updateDynamic("_responseRequired")(_responseRequired.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (allowedResponse != null) __obj.updateDynamic("allowedResponse")(allowedResponse.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(responseRequired)) __obj.updateDynamic("responseRequired")(responseRequired.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Endpoint(
    address: uri,
    connectionType: Coding,
    payloadType: js.Array[CodeableConcept],
    status: code,
    _address: Element = null,
    _header: js.Array[Element] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _payloadMimeType: js.Array[Element] = null,
    _resourceType: Element = null,
    _status: Element = null,
    contact: js.Array[ContactPoint] = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    header: js.Array[String] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    payloadMimeType: js.Array[code] = null,
    period: Period = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_address != null) __obj.updateDynamic("_address")(_address.asInstanceOf[js.Any])
    if (_header != null) __obj.updateDynamic("_header")(_header.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_payloadMimeType != null) __obj.updateDynamic("_payloadMimeType")(_payloadMimeType.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payloadMimeType != null) __obj.updateDynamic("payloadMimeType")(payloadMimeType.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ExpansionProfile(
    status: code,
    _activeOnly: Element = null,
    _date: Element = null,
    _description: Element = null,
    _displayLanguage: Element = null,
    _excludeNested: Element = null,
    _excludeNotForUI: Element = null,
    _excludePostCoordinated: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _includeDefinition: Element = null,
    _includeDesignations: Element = null,
    _language: Element = null,
    _limitedExpansion: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    activeOnly: js.UndefOr[Boolean] = js.undefined,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    designation: ExpansionProfileDesignation = null,
    displayLanguage: code = null,
    excludeNested: js.UndefOr[Boolean] = js.undefined,
    excludeNotForUI: js.UndefOr[Boolean] = js.undefined,
    excludePostCoordinated: js.UndefOr[Boolean] = js.undefined,
    excludedSystem: ExpansionProfileExcludedSystem = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fixedVersion: js.Array[ExpansionProfileFixedVersion] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    includeDefinition: js.UndefOr[Boolean] = js.undefined,
    includeDesignations: js.UndefOr[Boolean] = js.undefined,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    limitedExpansion: js.UndefOr[Boolean] = js.undefined,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    resourceType: code = null,
    text: Narrative = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_activeOnly != null) __obj.updateDynamic("_activeOnly")(_activeOnly.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_displayLanguage != null) __obj.updateDynamic("_displayLanguage")(_displayLanguage.asInstanceOf[js.Any])
    if (_excludeNested != null) __obj.updateDynamic("_excludeNested")(_excludeNested.asInstanceOf[js.Any])
    if (_excludeNotForUI != null) __obj.updateDynamic("_excludeNotForUI")(_excludeNotForUI.asInstanceOf[js.Any])
    if (_excludePostCoordinated != null) __obj.updateDynamic("_excludePostCoordinated")(_excludePostCoordinated.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_includeDefinition != null) __obj.updateDynamic("_includeDefinition")(_includeDefinition.asInstanceOf[js.Any])
    if (_includeDesignations != null) __obj.updateDynamic("_includeDesignations")(_includeDesignations.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_limitedExpansion != null) __obj.updateDynamic("_limitedExpansion")(_limitedExpansion.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (!js.isUndefined(activeOnly)) __obj.updateDynamic("activeOnly")(activeOnly.get.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (designation != null) __obj.updateDynamic("designation")(designation.asInstanceOf[js.Any])
    if (displayLanguage != null) __obj.updateDynamic("displayLanguage")(displayLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeNested)) __obj.updateDynamic("excludeNested")(excludeNested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeNotForUI)) __obj.updateDynamic("excludeNotForUI")(excludeNotForUI.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excludePostCoordinated)) __obj.updateDynamic("excludePostCoordinated")(excludePostCoordinated.get.asInstanceOf[js.Any])
    if (excludedSystem != null) __obj.updateDynamic("excludedSystem")(excludedSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fixedVersion != null) __obj.updateDynamic("fixedVersion")(fixedVersion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDefinition)) __obj.updateDynamic("includeDefinition")(includeDefinition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDesignations)) __obj.updateDynamic("includeDesignations")(includeDesignations.get.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(limitedExpansion)) __obj.updateDynamic("limitedExpansion")(limitedExpansion.get.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PlanDefinition(
    status: code,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    action: js.Array[PlanDefinitionAction] = null,
    approvalDate: date = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    goal: js.Array[PlanDefinitionGoal] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    library: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    `type`: CodeableConcept = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contributor != null) __obj.updateDynamic("contributor")(contributor.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (goal != null) __obj.updateDynamic("goal")(goal.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AuditEvent(
    agent: js.Array[AuditEventAgent],
    recorded: instant,
    source: AuditEventSource,
    `type`: Coding,
    _action: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _outcome: Element = null,
    _outcomeDesc: Element = null,
    _recorded: Element = null,
    _resourceType: Element = null,
    action: code = null,
    contained: js.Array[Resource] = null,
    entity: js.Array[AuditEventEntity] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: code = null,
    outcomeDesc: String = null,
    purposeOfEvent: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    subtype: js.Array[Coding] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_action != null) __obj.updateDynamic("_action")(_action.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_outcome != null) __obj.updateDynamic("_outcome")(_outcome.asInstanceOf[js.Any])
    if (_outcomeDesc != null) __obj.updateDynamic("_outcomeDesc")(_outcomeDesc.asInstanceOf[js.Any])
    if (_recorded != null) __obj.updateDynamic("_recorded")(_recorded.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (outcomeDesc != null) __obj.updateDynamic("outcomeDesc")(outcomeDesc.asInstanceOf[js.Any])
    if (purposeOfEvent != null) __obj.updateDynamic("purposeOfEvent")(purposeOfEvent.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Encounter(
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    account: js.Array[Reference] = null,
    appointment: Reference = null,
    `class`: Coding = null,
    classHistory: js.Array[EncounterClassHistory] = null,
    contained: js.Array[Resource] = null,
    diagnosis: js.Array[EncounterDiagnosis] = null,
    episodeOfCare: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    hospitalization: EncounterHospitalization = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    incomingReferral: js.Array[Reference] = null,
    language: code = null,
    length: Duration = null,
    location: js.Array[EncounterLocation] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    partOf: Reference = null,
    participant: js.Array[EncounterParticipant] = null,
    period: Period = null,
    priority: CodeableConcept = null,
    reason: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    serviceProvider: Reference = null,
    statusHistory: js.Array[EncounterStatusHistory] = null,
    subject: Reference = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (classHistory != null) __obj.updateDynamic("classHistory")(classHistory.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (diagnosis != null) __obj.updateDynamic("diagnosis")(diagnosis.asInstanceOf[js.Any])
    if (episodeOfCare != null) __obj.updateDynamic("episodeOfCare")(episodeOfCare.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (hospitalization != null) __obj.updateDynamic("hospitalization")(hospitalization.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (incomingReferral != null) __obj.updateDynamic("incomingReferral")(incomingReferral.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceProvider != null) __obj.updateDynamic("serviceProvider")(serviceProvider.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DocumentReference(
    content: js.Array[DocumentReferenceContent],
    indexed: instant,
    status: code,
    `type`: CodeableConcept,
    _created: Element = null,
    _description: Element = null,
    _docStatus: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _indexed: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authenticator: Reference = null,
    author: js.Array[Reference] = null,
    `class`: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: DocumentReferenceContext = null,
    created: dateTime = null,
    custodian: Reference = null,
    description: String = null,
    docStatus: code = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    masterIdentifier: Identifier = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    relatesTo: js.Array[DocumentReferenceRelatesTo] = null,
    resourceType: code = null,
    securityLabel: js.Array[CodeableConcept] = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_docStatus != null) __obj.updateDynamic("_docStatus")(_docStatus.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_indexed != null) __obj.updateDynamic("_indexed")(_indexed.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (custodian != null) __obj.updateDynamic("custodian")(custodian.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (docStatus != null) __obj.updateDynamic("docStatus")(docStatus.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (masterIdentifier != null) __obj.updateDynamic("masterIdentifier")(masterIdentifier.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (relatesTo != null) __obj.updateDynamic("relatesTo")(relatesTo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CapabilityStatement(
    acceptUnknown: code,
    date: dateTime,
    fhirVersion: id,
    format: js.Array[code],
    kind: code,
    status: code,
    _acceptUnknown: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _fhirVersion: Element = null,
    _format: js.Array[Element] = null,
    _id: Element = null,
    _implementationGuide: js.Array[Element] = null,
    _implicitRules: Element = null,
    _instantiates: js.Array[Element] = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _patchFormat: js.Array[Element] = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    description: markdown = null,
    document: js.Array[CapabilityStatementDocument] = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    implementation: CapabilityStatementImplementation = null,
    implementationGuide: js.Array[uri] = null,
    implicitRules: uri = null,
    instantiates: js.Array[uri] = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    messaging: js.Array[CapabilityStatementMessaging] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    patchFormat: js.Array[code] = null,
    profile: js.Array[Reference] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    rest: js.Array[CapabilityStatementRest] = null,
    software: CapabilityStatementSoftware = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_acceptUnknown != null) __obj.updateDynamic("_acceptUnknown")(_acceptUnknown.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_fhirVersion != null) __obj.updateDynamic("_fhirVersion")(_fhirVersion.asInstanceOf[js.Any])
    if (_format != null) __obj.updateDynamic("_format")(_format.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implementationGuide != null) __obj.updateDynamic("_implementationGuide")(_implementationGuide.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_instantiates != null) __obj.updateDynamic("_instantiates")(_instantiates.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_patchFormat != null) __obj.updateDynamic("_patchFormat")(_patchFormat.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (implementationGuide != null) __obj.updateDynamic("implementationGuide")(implementationGuide.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (instantiates != null) __obj.updateDynamic("instantiates")(instantiates.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (messaging != null) __obj.updateDynamic("messaging")(messaging.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (patchFormat != null) __obj.updateDynamic("patchFormat")(patchFormat.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    if (software != null) __obj.updateDynamic("software")(software.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AllergyIntolerance(
    patient: Reference,
    verificationStatus: code,
    _assertedDate: Element = null,
    _category: js.Array[Element] = null,
    _clinicalStatus: Element = null,
    _criticality: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastOccurrence: Element = null,
    _onsetDateTime: Element = null,
    _onsetString: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    _verificationStatus: Element = null,
    assertedDate: dateTime = null,
    asserter: Reference = null,
    category: js.Array[code] = null,
    clinicalStatus: code = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    criticality: code = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    lastOccurrence: dateTime = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    onsetAge: Age = null,
    onsetDateTime: dateTime = null,
    onsetPeriod: Period = null,
    onsetRange: Range = null,
    onsetString: String = null,
    reaction: js.Array[AllergyIntoleranceReaction] = null,
    recorder: Reference = null,
    resourceType: code = null,
    text: Narrative = null,
    `type`: code = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], verificationStatus = verificationStatus.asInstanceOf[js.Any])
    if (_assertedDate != null) __obj.updateDynamic("_assertedDate")(_assertedDate.asInstanceOf[js.Any])
    if (_category != null) __obj.updateDynamic("_category")(_category.asInstanceOf[js.Any])
    if (_clinicalStatus != null) __obj.updateDynamic("_clinicalStatus")(_clinicalStatus.asInstanceOf[js.Any])
    if (_criticality != null) __obj.updateDynamic("_criticality")(_criticality.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastOccurrence != null) __obj.updateDynamic("_lastOccurrence")(_lastOccurrence.asInstanceOf[js.Any])
    if (_onsetDateTime != null) __obj.updateDynamic("_onsetDateTime")(_onsetDateTime.asInstanceOf[js.Any])
    if (_onsetString != null) __obj.updateDynamic("_onsetString")(_onsetString.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_verificationStatus != null) __obj.updateDynamic("_verificationStatus")(_verificationStatus.asInstanceOf[js.Any])
    if (assertedDate != null) __obj.updateDynamic("assertedDate")(assertedDate.asInstanceOf[js.Any])
    if (asserter != null) __obj.updateDynamic("asserter")(asserter.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (clinicalStatus != null) __obj.updateDynamic("clinicalStatus")(clinicalStatus.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (criticality != null) __obj.updateDynamic("criticality")(criticality.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastOccurrence != null) __obj.updateDynamic("lastOccurrence")(lastOccurrence.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (onsetAge != null) __obj.updateDynamic("onsetAge")(onsetAge.asInstanceOf[js.Any])
    if (onsetDateTime != null) __obj.updateDynamic("onsetDateTime")(onsetDateTime.asInstanceOf[js.Any])
    if (onsetPeriod != null) __obj.updateDynamic("onsetPeriod")(onsetPeriod.asInstanceOf[js.Any])
    if (onsetRange != null) __obj.updateDynamic("onsetRange")(onsetRange.asInstanceOf[js.Any])
    if (onsetString != null) __obj.updateDynamic("onsetString")(onsetString.asInstanceOf[js.Any])
    if (reaction != null) __obj.updateDynamic("reaction")(reaction.asInstanceOf[js.Any])
    if (recorder != null) __obj.updateDynamic("recorder")(recorder.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CarePlan(
    intent: code,
    status: code,
    subject: Reference,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    activity: js.Array[CarePlanActivity] = null,
    addresses: js.Array[Reference] = null,
    author: js.Array[Reference] = null,
    basedOn: js.Array[Reference] = null,
    careTeam: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    goal: js.Array[Reference] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    period: Period = null,
    replaces: js.Array[Reference] = null,
    resourceType: code = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null,
    title: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (careTeam != null) __obj.updateDynamic("careTeam")(careTeam.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (goal != null) __obj.updateDynamic("goal")(goal.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def NutritionOrder(
    dateTime: dateTime,
    patient: Reference,
    _dateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    allergyIntolerance: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    encounter: Reference = null,
    enteralFormula: NutritionOrderEnteralFormula = null,
    excludeFoodModifier: js.Array[CodeableConcept] = null,
    extension: js.Array[Extension] = null,
    foodPreferenceModifier: js.Array[CodeableConcept] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    oralDiet: NutritionOrderOralDiet = null,
    orderer: Reference = null,
    resourceType: code = null,
    status: code = null,
    supplement: js.Array[NutritionOrderSupplement] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any])
    if (_dateTime != null) __obj.updateDynamic("_dateTime")(_dateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (allergyIntolerance != null) __obj.updateDynamic("allergyIntolerance")(allergyIntolerance.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (enteralFormula != null) __obj.updateDynamic("enteralFormula")(enteralFormula.asInstanceOf[js.Any])
    if (excludeFoodModifier != null) __obj.updateDynamic("excludeFoodModifier")(excludeFoodModifier.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (foodPreferenceModifier != null) __obj.updateDynamic("foodPreferenceModifier")(foodPreferenceModifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (oralDiet != null) __obj.updateDynamic("oralDiet")(oralDiet.asInstanceOf[js.Any])
    if (orderer != null) __obj.updateDynamic("orderer")(orderer.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supplement != null) __obj.updateDynamic("supplement")(supplement.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImagingStudy(
    patient: Reference,
    uid: oid,
    _availability: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _numberOfInstances: Element = null,
    _numberOfSeries: Element = null,
    _resourceType: Element = null,
    _started: Element = null,
    _uid: Element = null,
    accession: Identifier = null,
    availability: code = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    description: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    interpreter: js.Array[Reference] = null,
    language: code = null,
    meta: Meta = null,
    modalityList: js.Array[Coding] = null,
    modifierExtension: js.Array[Extension] = null,
    numberOfInstances: js.UndefOr[unsignedInt] = js.undefined,
    numberOfSeries: js.UndefOr[unsignedInt] = js.undefined,
    procedureCode: js.Array[CodeableConcept] = null,
    procedureReference: js.Array[Reference] = null,
    reason: CodeableConcept = null,
    referrer: Reference = null,
    resourceType: code = null,
    series: js.Array[ImagingStudySeries] = null,
    started: dateTime = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (_availability != null) __obj.updateDynamic("_availability")(_availability.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_numberOfInstances != null) __obj.updateDynamic("_numberOfInstances")(_numberOfInstances.asInstanceOf[js.Any])
    if (_numberOfSeries != null) __obj.updateDynamic("_numberOfSeries")(_numberOfSeries.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_started != null) __obj.updateDynamic("_started")(_started.asInstanceOf[js.Any])
    if (_uid != null) __obj.updateDynamic("_uid")(_uid.asInstanceOf[js.Any])
    if (accession != null) __obj.updateDynamic("accession")(accession.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modalityList != null) __obj.updateDynamic("modalityList")(modalityList.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfInstances)) __obj.updateDynamic("numberOfInstances")(numberOfInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfSeries)) __obj.updateDynamic("numberOfSeries")(numberOfSeries.get.asInstanceOf[js.Any])
    if (procedureCode != null) __obj.updateDynamic("procedureCode")(procedureCode.asInstanceOf[js.Any])
    if (procedureReference != null) __obj.updateDynamic("procedureReference")(procedureReference.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ChargeItem(
    code: CodeableConcept,
    status: code,
    subject: Reference,
    _definition: js.Array[Element] = null,
    _enteredDate: Element = null,
    _factorOverride: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _overrideReason: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    account: js.Array[Reference] = null,
    bodysite: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[uri] = null,
    enteredDate: dateTime = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    factorOverride: js.UndefOr[decimal] = js.undefined,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    overrideReason: String = null,
    partOf: js.Array[Reference] = null,
    participant: js.Array[ChargeItemParticipant] = null,
    performingOrganization: Reference = null,
    priceOverride: Money = null,
    quantity: Quantity = null,
    reason: js.Array[CodeableConcept] = null,
    requestingOrganization: Reference = null,
    resourceType: code = null,
    service: js.Array[Reference] = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_definition != null) __obj.updateDynamic("_definition")(_definition.asInstanceOf[js.Any])
    if (_enteredDate != null) __obj.updateDynamic("_enteredDate")(_enteredDate.asInstanceOf[js.Any])
    if (_factorOverride != null) __obj.updateDynamic("_factorOverride")(_factorOverride.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_overrideReason != null) __obj.updateDynamic("_overrideReason")(_overrideReason.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (bodysite != null) __obj.updateDynamic("bodysite")(bodysite.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (enteredDate != null) __obj.updateDynamic("enteredDate")(enteredDate.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(factorOverride)) __obj.updateDynamic("factorOverride")(factorOverride.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (overrideReason != null) __obj.updateDynamic("overrideReason")(overrideReason.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (performingOrganization != null) __obj.updateDynamic("performingOrganization")(performingOrganization.asInstanceOf[js.Any])
    if (priceOverride != null) __obj.updateDynamic("priceOverride")(priceOverride.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (requestingOrganization != null) __obj.updateDynamic("requestingOrganization")(requestingOrganization.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Binary(
    content: base64Binary,
    contentType: code,
    _content: Element = null,
    _contentType: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    resourceType: code = null,
    securityContext: Reference = null
  ): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    if (_content != null) __obj.updateDynamic("_content")(_content.asInstanceOf[js.Any])
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def TestReport(
    result: code,
    status: code,
    testScript: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _result: Element = null,
    _score: Element = null,
    _status: Element = null,
    _tester: Element = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    issued: dateTime = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    participant: js.Array[TestReportParticipant] = null,
    resourceType: code = null,
    score: js.UndefOr[decimal] = js.undefined,
    setup: TestReportSetup = null,
    teardown: TestReportTeardown = null,
    test: js.Array[TestReportTest] = null,
    tester: String = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testScript = testScript.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_result != null) __obj.updateDynamic("_result")(_result.asInstanceOf[js.Any])
    if (_score != null) __obj.updateDynamic("_score")(_score.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_tester != null) __obj.updateDynamic("_tester")(_tester.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (participant != null) __obj.updateDynamic("participant")(participant.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (teardown != null) __obj.updateDynamic("teardown")(teardown.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (tester != null) __obj.updateDynamic("tester")(tester.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def GraphDefinition(
    name: String,
    start: code,
    status: code,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _profile: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    link: js.Array[GraphDefinitionLink] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    profile: uri = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    text: Narrative = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_profile != null) __obj.updateDynamic("_profile")(_profile.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Measure(
    status: code,
    _approvalDate: Element = null,
    _clinicalRecommendationStatement: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _definition: js.Array[Element] = null,
    _description: Element = null,
    _disclaimer: Element = null,
    _experimental: Element = null,
    _guidance: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _improvementNotation: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _rateAggregation: Element = null,
    _rationale: Element = null,
    _resourceType: Element = null,
    _riskAdjustment: Element = null,
    _set: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    clinicalRecommendationStatement: markdown = null,
    compositeScoring: CodeableConcept = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    date: dateTime = null,
    definition: js.Array[markdown] = null,
    description: markdown = null,
    disclaimer: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    group: js.Array[MeasureGroup] = null,
    guidance: markdown = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    improvementNotation: String = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    library: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    rateAggregation: String = null,
    rationale: markdown = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    riskAdjustment: String = null,
    scoring: CodeableConcept = null,
    set: String = null,
    supplementalData: js.Array[MeasureSupplementalData] = null,
    text: Narrative = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    `type`: js.Array[CodeableConcept] = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_clinicalRecommendationStatement != null) __obj.updateDynamic("_clinicalRecommendationStatement")(_clinicalRecommendationStatement.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_definition != null) __obj.updateDynamic("_definition")(_definition.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_disclaimer != null) __obj.updateDynamic("_disclaimer")(_disclaimer.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_guidance != null) __obj.updateDynamic("_guidance")(_guidance.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_improvementNotation != null) __obj.updateDynamic("_improvementNotation")(_improvementNotation.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_rateAggregation != null) __obj.updateDynamic("_rateAggregation")(_rateAggregation.asInstanceOf[js.Any])
    if (_rationale != null) __obj.updateDynamic("_rationale")(_rationale.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_riskAdjustment != null) __obj.updateDynamic("_riskAdjustment")(_riskAdjustment.asInstanceOf[js.Any])
    if (_set != null) __obj.updateDynamic("_set")(_set.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (clinicalRecommendationStatement != null) __obj.updateDynamic("clinicalRecommendationStatement")(clinicalRecommendationStatement.asInstanceOf[js.Any])
    if (compositeScoring != null) __obj.updateDynamic("compositeScoring")(compositeScoring.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contributor != null) __obj.updateDynamic("contributor")(contributor.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disclaimer != null) __obj.updateDynamic("disclaimer")(disclaimer.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (guidance != null) __obj.updateDynamic("guidance")(guidance.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (improvementNotation != null) __obj.updateDynamic("improvementNotation")(improvementNotation.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (rateAggregation != null) __obj.updateDynamic("rateAggregation")(rateAggregation.asInstanceOf[js.Any])
    if (rationale != null) __obj.updateDynamic("rationale")(rationale.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (riskAdjustment != null) __obj.updateDynamic("riskAdjustment")(riskAdjustment.asInstanceOf[js.Any])
    if (scoring != null) __obj.updateDynamic("scoring")(scoring.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (supplementalData != null) __obj.updateDynamic("supplementalData")(supplementalData.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Condition(
    subject: Reference,
    _abatementBoolean: Element = null,
    _abatementDateTime: Element = null,
    _abatementString: Element = null,
    _assertedDate: Element = null,
    _clinicalStatus: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _onsetDateTime: Element = null,
    _onsetString: Element = null,
    _resourceType: Element = null,
    _verificationStatus: Element = null,
    abatementAge: Age = null,
    abatementBoolean: js.UndefOr[Boolean] = js.undefined,
    abatementDateTime: dateTime = null,
    abatementPeriod: Period = null,
    abatementRange: Range = null,
    abatementString: String = null,
    assertedDate: dateTime = null,
    asserter: Reference = null,
    bodySite: js.Array[CodeableConcept] = null,
    category: js.Array[CodeableConcept] = null,
    clinicalStatus: code = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    evidence: js.Array[ConditionEvidence] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    onsetAge: Age = null,
    onsetDateTime: dateTime = null,
    onsetPeriod: Period = null,
    onsetRange: Range = null,
    onsetString: String = null,
    resourceType: code = null,
    severity: CodeableConcept = null,
    stage: ConditionStage = null,
    text: Narrative = null,
    verificationStatus: code = null
  ): Resource = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    if (_abatementBoolean != null) __obj.updateDynamic("_abatementBoolean")(_abatementBoolean.asInstanceOf[js.Any])
    if (_abatementDateTime != null) __obj.updateDynamic("_abatementDateTime")(_abatementDateTime.asInstanceOf[js.Any])
    if (_abatementString != null) __obj.updateDynamic("_abatementString")(_abatementString.asInstanceOf[js.Any])
    if (_assertedDate != null) __obj.updateDynamic("_assertedDate")(_assertedDate.asInstanceOf[js.Any])
    if (_clinicalStatus != null) __obj.updateDynamic("_clinicalStatus")(_clinicalStatus.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_onsetDateTime != null) __obj.updateDynamic("_onsetDateTime")(_onsetDateTime.asInstanceOf[js.Any])
    if (_onsetString != null) __obj.updateDynamic("_onsetString")(_onsetString.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_verificationStatus != null) __obj.updateDynamic("_verificationStatus")(_verificationStatus.asInstanceOf[js.Any])
    if (abatementAge != null) __obj.updateDynamic("abatementAge")(abatementAge.asInstanceOf[js.Any])
    if (!js.isUndefined(abatementBoolean)) __obj.updateDynamic("abatementBoolean")(abatementBoolean.get.asInstanceOf[js.Any])
    if (abatementDateTime != null) __obj.updateDynamic("abatementDateTime")(abatementDateTime.asInstanceOf[js.Any])
    if (abatementPeriod != null) __obj.updateDynamic("abatementPeriod")(abatementPeriod.asInstanceOf[js.Any])
    if (abatementRange != null) __obj.updateDynamic("abatementRange")(abatementRange.asInstanceOf[js.Any])
    if (abatementString != null) __obj.updateDynamic("abatementString")(abatementString.asInstanceOf[js.Any])
    if (assertedDate != null) __obj.updateDynamic("assertedDate")(assertedDate.asInstanceOf[js.Any])
    if (asserter != null) __obj.updateDynamic("asserter")(asserter.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (clinicalStatus != null) __obj.updateDynamic("clinicalStatus")(clinicalStatus.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (evidence != null) __obj.updateDynamic("evidence")(evidence.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (onsetAge != null) __obj.updateDynamic("onsetAge")(onsetAge.asInstanceOf[js.Any])
    if (onsetDateTime != null) __obj.updateDynamic("onsetDateTime")(onsetDateTime.asInstanceOf[js.Any])
    if (onsetPeriod != null) __obj.updateDynamic("onsetPeriod")(onsetPeriod.asInstanceOf[js.Any])
    if (onsetRange != null) __obj.updateDynamic("onsetRange")(onsetRange.asInstanceOf[js.Any])
    if (onsetString != null) __obj.updateDynamic("onsetString")(onsetString.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationDispense(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notDone: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _whenHandedOver: Element = null,
    _whenPrepared: Element = null,
    authorizingPrescription: js.Array[Reference] = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    daysSupply: Quantity = null,
    destination: Reference = null,
    detectedIssue: js.Array[Reference] = null,
    dosageInstruction: js.Array[Dosage] = null,
    eventHistory: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReasonCodeableConcept: CodeableConcept = null,
    notDoneReasonReference: Reference = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    performer: js.Array[MedicationDispensePerformer] = null,
    quantity: Quantity = null,
    receiver: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    substitution: MedicationDispenseSubstitution = null,
    supportingInformation: js.Array[Reference] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null,
    whenHandedOver: dateTime = null,
    whenPrepared: dateTime = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_whenHandedOver != null) __obj.updateDynamic("_whenHandedOver")(_whenHandedOver.asInstanceOf[js.Any])
    if (_whenPrepared != null) __obj.updateDynamic("_whenPrepared")(_whenPrepared.asInstanceOf[js.Any])
    if (authorizingPrescription != null) __obj.updateDynamic("authorizingPrescription")(authorizingPrescription.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (daysSupply != null) __obj.updateDynamic("daysSupply")(daysSupply.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detectedIssue != null) __obj.updateDynamic("detectedIssue")(detectedIssue.asInstanceOf[js.Any])
    if (dosageInstruction != null) __obj.updateDynamic("dosageInstruction")(dosageInstruction.asInstanceOf[js.Any])
    if (eventHistory != null) __obj.updateDynamic("eventHistory")(eventHistory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept.asInstanceOf[js.Any])
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone.get.asInstanceOf[js.Any])
    if (notDoneReasonCodeableConcept != null) __obj.updateDynamic("notDoneReasonCodeableConcept")(notDoneReasonCodeableConcept.asInstanceOf[js.Any])
    if (notDoneReasonReference != null) __obj.updateDynamic("notDoneReasonReference")(notDoneReasonReference.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (substitution != null) __obj.updateDynamic("substitution")(substitution.asInstanceOf[js.Any])
    if (supportingInformation != null) __obj.updateDynamic("supportingInformation")(supportingInformation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (whenHandedOver != null) __obj.updateDynamic("whenHandedOver")(whenHandedOver.asInstanceOf[js.Any])
    if (whenPrepared != null) __obj.updateDynamic("whenPrepared")(whenPrepared.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Media(
    content: Attachment,
    `type`: code,
    _duration: Element = null,
    _frames: Element = null,
    _height: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    _width: Element = null,
    basedOn: js.Array[Reference] = null,
    bodySite: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    device: Reference = null,
    duration: js.UndefOr[unsignedInt] = js.undefined,
    extension: js.Array[Extension] = null,
    frames: js.UndefOr[positiveInt] = js.undefined,
    height: js.UndefOr[positiveInt] = js.undefined,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    operator: Reference = null,
    reasonCode: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    subject: Reference = null,
    subtype: CodeableConcept = null,
    text: Narrative = null,
    view: CodeableConcept = null,
    width: js.UndefOr[positiveInt] = js.undefined
  ): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_duration != null) __obj.updateDynamic("_duration")(_duration.asInstanceOf[js.Any])
    if (_frames != null) __obj.updateDynamic("_frames")(_frames.asInstanceOf[js.Any])
    if (_height != null) __obj.updateDynamic("_height")(_height.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_width != null) __obj.updateDynamic("_width")(_width.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(frames)) __obj.updateDynamic("frames")(frames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Communication(
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notDone: Element = null,
    _received: Element = null,
    _resourceType: Element = null,
    _sent: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    medium: js.Array[CodeableConcept] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReason: CodeableConcept = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    payload: js.Array[CommunicationPayload] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    received: dateTime = null,
    recipient: js.Array[Reference] = null,
    resourceType: code = null,
    sender: Reference = null,
    sent: dateTime = null,
    subject: Reference = null,
    text: Narrative = null,
    topic: js.Array[Reference] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone.asInstanceOf[js.Any])
    if (_received != null) __obj.updateDynamic("_received")(_received.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_sent != null) __obj.updateDynamic("_sent")(_sent.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone.get.asInstanceOf[js.Any])
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (received != null) __obj.updateDynamic("received")(received.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (sent != null) __obj.updateDynamic("sent")(sent.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PaymentReconciliation(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    detail: js.Array[PaymentReconciliationDetail] = null,
    disposition: String = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    outcome: CodeableConcept = null,
    period: Period = null,
    processNote: js.Array[PaymentReconciliationProcessNote] = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null,
    total: Money = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (processNote != null) __obj.updateDynamic("processNote")(processNote.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Organization(
    _active: Element = null,
    _alias: js.Array[Element] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    alias: js.Array[String] = null,
    contact: js.Array[OrganizationContact] = null,
    contained: js.Array[Resource] = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    partOf: Reference = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_alias != null) __obj.updateDynamic("_alias")(_alias.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MeasureReport(
    measure: Reference,
    period: Period,
    status: code,
    `type`: code,
    _date: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _type: Element = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    evaluatedResources: Reference = null,
    extension: js.Array[Extension] = null,
    group: js.Array[MeasureReportGroup] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    patient: Reference = null,
    reportingOrganization: Reference = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (evaluatedResources != null) __obj.updateDynamic("evaluatedResources")(evaluatedResources.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (reportingOrganization != null) __obj.updateDynamic("reportingOrganization")(reportingOrganization.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Consent(
    patient: Reference,
    status: code,
    _dateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _policyRule: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: js.Array[CodeableConcept] = null,
    actor: js.Array[ConsentActor] = null,
    category: js.Array[CodeableConcept] = null,
    consentingParty: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    data: js.Array[ConsentData] = null,
    dataPeriod: Period = null,
    dateTime: dateTime = null,
    except: js.Array[ConsentExcept] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: js.Array[Reference] = null,
    period: Period = null,
    policy: js.Array[ConsentPolicy] = null,
    policyRule: uri = null,
    purpose: js.Array[Coding] = null,
    resourceType: code = null,
    securityLabel: js.Array[Coding] = null,
    sourceAttachment: Attachment = null,
    sourceIdentifier: Identifier = null,
    sourceReference: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_dateTime != null) __obj.updateDynamic("_dateTime")(_dateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_policyRule != null) __obj.updateDynamic("_policyRule")(_policyRule.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (consentingParty != null) __obj.updateDynamic("consentingParty")(consentingParty.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataPeriod != null) __obj.updateDynamic("dataPeriod")(dataPeriod.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (except != null) __obj.updateDynamic("except")(except.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (policyRule != null) __obj.updateDynamic("policyRule")(policyRule.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (sourceAttachment != null) __obj.updateDynamic("sourceAttachment")(sourceAttachment.asInstanceOf[js.Any])
    if (sourceIdentifier != null) __obj.updateDynamic("sourceIdentifier")(sourceIdentifier.asInstanceOf[js.Any])
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Questionnaire(
    status: code,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _subjectType: js.Array[Element] = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    code: js.Array[Coding] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    item: js.Array[QuestionnaireItem] = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    subjectType: js.Array[code] = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_subjectType != null) __obj.updateDynamic("_subjectType")(_subjectType.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subjectType != null) __obj.updateDynamic("subjectType")(subjectType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def RequestGroup(
    intent: code,
    status: code,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: js.Array[RequestGroupAction] = null,
    author: Reference = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    priority: code = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    replaces: js.Array[Reference] = null,
    resourceType: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AppointmentResponse(
    appointment: Reference,
    participantStatus: code,
    _comment: Element = null,
    _end: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _participantStatus: Element = null,
    _resourceType: Element = null,
    _start: Element = null,
    actor: Reference = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    end: instant = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    participantType: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    start: instant = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_participantStatus != null) __obj.updateDynamic("_participantStatus")(_participantStatus.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (participantType != null) __obj.updateDynamic("participantType")(participantType.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DocumentManifest(
    content: js.Array[DocumentManifestContent],
    status: code,
    _created: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _source: Element = null,
    _status: Element = null,
    author: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    masterIdentifier: Identifier = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    recipient: js.Array[Reference] = null,
    related: js.Array[DocumentManifestRelated] = null,
    resourceType: code = null,
    source: uri = null,
    subject: Reference = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (masterIdentifier != null) __obj.updateDynamic("masterIdentifier")(masterIdentifier.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Bundle(
    `type`: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _total: Element = null,
    _type: Element = null,
    entry: js.Array[BundleEntry] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    link: js.Array[BundleLink] = null,
    meta: Meta = null,
    resourceType: code = null,
    signature: Signature = null,
    total: js.UndefOr[unsignedInt] = js.undefined
  ): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_total != null) __obj.updateDynamic("_total")(_total.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DetectedIssue(
    status: code,
    _date: Element = null,
    _detail: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _reference: Element = null,
    _resourceType: Element = null,
    _severity: Element = null,
    _status: Element = null,
    author: Reference = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    detail: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicated: js.Array[Reference] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    mitigation: js.Array[DetectedIssueMitigation] = null,
    modifierExtension: js.Array[Extension] = null,
    patient: Reference = null,
    reference: uri = null,
    resourceType: code = null,
    severity: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_detail != null) __obj.updateDynamic("_detail")(_detail.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_reference != null) __obj.updateDynamic("_reference")(_reference.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_severity != null) __obj.updateDynamic("_severity")(_severity.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicated != null) __obj.updateDynamic("implicated")(implicated.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mitigation != null) __obj.updateDynamic("mitigation")(mitigation.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceMetric(
    category: code,
    identifier: Identifier,
    `type`: CodeableConcept,
    _category: Element = null,
    _color: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _operationalStatus: Element = null,
    _resourceType: Element = null,
    calibration: js.Array[DeviceMetricCalibration] = null,
    color: code = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    measurementPeriod: Timing = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    operationalStatus: code = null,
    parent: Reference = null,
    resourceType: code = null,
    source: Reference = null,
    text: Narrative = null,
    unit: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_category != null) __obj.updateDynamic("_category")(_category.asInstanceOf[js.Any])
    if (_color != null) __obj.updateDynamic("_color")(_color.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_operationalStatus != null) __obj.updateDynamic("_operationalStatus")(_operationalStatus.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (calibration != null) __obj.updateDynamic("calibration")(calibration.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (measurementPeriod != null) __obj.updateDynamic("measurementPeriod")(measurementPeriod.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def SupplyRequest(
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    deliverFrom: Reference = null,
    deliverTo: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    orderedItem: SupplyRequestOrderedItem = null,
    priority: code = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    requester: SupplyRequestRequester = null,
    resourceType: code = null,
    status: code = null,
    supplier: js.Array[Reference] = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (deliverFrom != null) __obj.updateDynamic("deliverFrom")(deliverFrom.asInstanceOf[js.Any])
    if (deliverTo != null) __obj.updateDynamic("deliverTo")(deliverTo.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (orderedItem != null) __obj.updateDynamic("orderedItem")(orderedItem.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (supplier != null) __obj.updateDynamic("supplier")(supplier.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Observation(
    code: CodeableConcept,
    status: code,
    _comment: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _valueBoolean: Element = null,
    _valueDateTime: Element = null,
    _valueString: Element = null,
    _valueTime: Element = null,
    basedOn: js.Array[Reference] = null,
    bodySite: CodeableConcept = null,
    category: js.Array[CodeableConcept] = null,
    comment: String = null,
    component: js.Array[ObservationComponent] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    dataAbsentReason: CodeableConcept = null,
    device: Reference = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    interpretation: CodeableConcept = null,
    issued: instant = null,
    language: code = null,
    meta: Meta = null,
    method: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    performer: js.Array[Reference] = null,
    referenceRange: js.Array[ObservationReferenceRange] = null,
    related: js.Array[ObservationRelated] = null,
    resourceType: code = null,
    specimen: Reference = null,
    subject: Reference = null,
    text: Narrative = null,
    valueAttachment: Attachment = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueCodeableConcept: CodeableConcept = null,
    valueDateTime: dateTime = null,
    valuePeriod: Period = null,
    valueQuantity: Quantity = null,
    valueRange: Range = null,
    valueRatio: Ratio = null,
    valueSampledData: SampledData = null,
    valueString: String = null,
    valueTime: time = null
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean.asInstanceOf[js.Any])
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime.asInstanceOf[js.Any])
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString.asInstanceOf[js.Any])
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataAbsentReason != null) __obj.updateDynamic("dataAbsentReason")(dataAbsentReason.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (interpretation != null) __obj.updateDynamic("interpretation")(interpretation.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (referenceRange != null) __obj.updateDynamic("referenceRange")(referenceRange.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean.get.asInstanceOf[js.Any])
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept.asInstanceOf[js.Any])
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime.asInstanceOf[js.Any])
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod.asInstanceOf[js.Any])
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    if (valueRatio != null) __obj.updateDynamic("valueRatio")(valueRatio.asInstanceOf[js.Any])
    if (valueSampledData != null) __obj.updateDynamic("valueSampledData")(valueSampledData.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Medication(
    _id: Element = null,
    _implicitRules: Element = null,
    _isBrand: Element = null,
    _isOverTheCounter: Element = null,
    _language: Element = null,
    _package: MedicationPackage = null,
    _resourceType: Element = null,
    _status: Element = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    image: js.Array[Attachment] = null,
    implicitRules: uri = null,
    ingredient: js.Array[MedicationIngredient] = null,
    isBrand: js.UndefOr[Boolean] = js.undefined,
    isOverTheCounter: js.UndefOr[Boolean] = js.undefined,
    language: code = null,
    manufacturer: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_isBrand != null) __obj.updateDynamic("_isBrand")(_isBrand.asInstanceOf[js.Any])
    if (_isOverTheCounter != null) __obj.updateDynamic("_isOverTheCounter")(_isOverTheCounter.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (ingredient != null) __obj.updateDynamic("ingredient")(ingredient.asInstanceOf[js.Any])
    if (!js.isUndefined(isBrand)) __obj.updateDynamic("isBrand")(isBrand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOverTheCounter)) __obj.updateDynamic("isOverTheCounter")(isOverTheCounter.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Coverage(
    _dependent: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _network: Element = null,
    _order: Element = null,
    _resourceType: Element = null,
    _sequence: Element = null,
    _status: Element = null,
    _subscriberId: Element = null,
    beneficiary: Reference = null,
    contained: js.Array[Resource] = null,
    contract: js.Array[Reference] = null,
    dependent: String = null,
    extension: js.Array[Extension] = null,
    grouping: CoverageGrouping = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    network: String = null,
    order: js.UndefOr[positiveInt] = js.undefined,
    payor: js.Array[Reference] = null,
    period: Period = null,
    policyHolder: Reference = null,
    relationship: CodeableConcept = null,
    resourceType: code = null,
    sequence: String = null,
    status: code = null,
    subscriber: Reference = null,
    subscriberId: String = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_dependent != null) __obj.updateDynamic("_dependent")(_dependent.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_network != null) __obj.updateDynamic("_network")(_network.asInstanceOf[js.Any])
    if (_order != null) __obj.updateDynamic("_order")(_order.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_subscriberId != null) __obj.updateDynamic("_subscriberId")(_subscriberId.asInstanceOf[js.Any])
    if (beneficiary != null) __obj.updateDynamic("beneficiary")(beneficiary.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contract != null) __obj.updateDynamic("contract")(contract.asInstanceOf[js.Any])
    if (dependent != null) __obj.updateDynamic("dependent")(dependent.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (payor != null) __obj.updateDynamic("payor")(payor.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (policyHolder != null) __obj.updateDynamic("policyHolder")(policyHolder.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subscriber != null) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (subscriberId != null) __obj.updateDynamic("subscriberId")(subscriberId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Account(
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    active: Period = null,
    balance: Money = null,
    contained: js.Array[Resource] = null,
    coverage: js.Array[AccountCoverage] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    guarantor: js.Array[AccountGuarantor] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    owner: Reference = null,
    period: Period = null,
    resourceType: code = null,
    status: code = null,
    subject: Reference = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (balance != null) __obj.updateDynamic("balance")(balance.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (guarantor != null) __obj.updateDynamic("guarantor")(guarantor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Library(
    status: code,
    `type`: CodeableConcept,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    content: js.Array[Attachment] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    dataRequirement: js.Array[DataRequirement] = null,
    date: dateTime = null,
    description: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    parameter: js.Array[ParameterDefinition] = null,
    publisher: String = null,
    purpose: markdown = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contributor != null) __obj.updateDynamic("contributor")(contributor.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (dataRequirement != null) __obj.updateDynamic("dataRequirement")(dataRequirement.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def GuidanceResponse(
    module: Reference,
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _requestId: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    dataRequirement: js.Array[DataRequirement] = null,
    evaluationMessage: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    outputParameters: Reference = null,
    performer: Reference = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    requestId: id = null,
    resourceType: code = null,
    result: Reference = null,
    subject: Reference = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_requestId != null) __obj.updateDynamic("_requestId")(_requestId.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataRequirement != null) __obj.updateDynamic("dataRequirement")(dataRequirement.asInstanceOf[js.Any])
    if (evaluationMessage != null) __obj.updateDynamic("evaluationMessage")(evaluationMessage.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (outputParameters != null) __obj.updateDynamic("outputParameters")(outputParameters.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def SupplyDelivery(
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    destination: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    partOf: js.Array[Reference] = null,
    patient: Reference = null,
    receiver: js.Array[Reference] = null,
    resourceType: code = null,
    status: code = null,
    suppliedItem: SupplyDeliverySuppliedItem = null,
    supplier: Reference = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (suppliedItem != null) __obj.updateDynamic("suppliedItem")(suppliedItem.asInstanceOf[js.Any])
    if (supplier != null) __obj.updateDynamic("supplier")(supplier.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EligibilityRequest(
    _businessArrangement: Element = null,
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _servicedDate: Element = null,
    _status: Element = null,
    benefitCategory: CodeableConcept = null,
    benefitSubCategory: CodeableConcept = null,
    businessArrangement: String = null,
    contained: js.Array[Resource] = null,
    coverage: Reference = null,
    created: dateTime = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    facility: Reference = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    insurer: Reference = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    patient: Reference = null,
    priority: CodeableConcept = null,
    provider: Reference = null,
    resourceType: code = null,
    servicedDate: date = null,
    servicedPeriod: Period = null,
    status: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_businessArrangement != null) __obj.updateDynamic("_businessArrangement")(_businessArrangement.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_servicedDate != null) __obj.updateDynamic("_servicedDate")(_servicedDate.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (benefitCategory != null) __obj.updateDynamic("benefitCategory")(benefitCategory.asInstanceOf[js.Any])
    if (benefitSubCategory != null) __obj.updateDynamic("benefitSubCategory")(benefitSubCategory.asInstanceOf[js.Any])
    if (businessArrangement != null) __obj.updateDynamic("businessArrangement")(businessArrangement.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (servicedDate != null) __obj.updateDynamic("servicedDate")(servicedDate.asInstanceOf[js.Any])
    if (servicedPeriod != null) __obj.updateDynamic("servicedPeriod")(servicedPeriod.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceUseStatement(
    device: Reference,
    status: code,
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _recordedOn: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _timingDateTime: Element = null,
    bodySite: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    indication: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    recordedOn: dateTime = null,
    resourceType: code = null,
    source: Reference = null,
    text: Narrative = null,
    timingDateTime: dateTime = null,
    timingPeriod: Period = null,
    timingTiming: Timing = null,
    whenUsed: Period = null
  ): Resource = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_recordedOn != null) __obj.updateDynamic("_recordedOn")(_recordedOn.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_timingDateTime != null) __obj.updateDynamic("_timingDateTime")(_timingDateTime.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (indication != null) __obj.updateDynamic("indication")(indication.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (recordedOn != null) __obj.updateDynamic("recordedOn")(recordedOn.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timingDateTime != null) __obj.updateDynamic("timingDateTime")(timingDateTime.asInstanceOf[js.Any])
    if (timingPeriod != null) __obj.updateDynamic("timingPeriod")(timingPeriod.asInstanceOf[js.Any])
    if (timingTiming != null) __obj.updateDynamic("timingTiming")(timingTiming.asInstanceOf[js.Any])
    if (whenUsed != null) __obj.updateDynamic("whenUsed")(whenUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Location(
    _alias: js.Array[Element] = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _mode: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    address: Address = null,
    alias: js.Array[String] = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    mode: code = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    operationalStatus: Coding = null,
    partOf: Reference = null,
    physicalType: CodeableConcept = null,
    position: LocationPosition = null,
    resourceType: code = null,
    status: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (_alias != null) __obj.updateDynamic("_alias")(_alias.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_mode != null) __obj.updateDynamic("_mode")(_mode.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (physicalType != null) __obj.updateDynamic("physicalType")(physicalType.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImagingManifest(
    patient: Reference,
    study: js.Array[ImagingManifestStudy],
    _authoringTime: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    author: Reference = null,
    authoringTime: dateTime = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    if (_authoringTime != null) __obj.updateDynamic("_authoringTime")(_authoringTime.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (authoringTime != null) __obj.updateDynamic("authoringTime")(authoringTime.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Goal(
    description: CodeableConcept,
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _startDate: Element = null,
    _status: Element = null,
    _statusDate: Element = null,
    _statusReason: Element = null,
    addresses: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    expressedBy: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    outcomeCode: js.Array[CodeableConcept] = null,
    outcomeReference: js.Array[Reference] = null,
    priority: CodeableConcept = null,
    resourceType: code = null,
    startCodeableConcept: CodeableConcept = null,
    startDate: date = null,
    statusDate: date = null,
    statusReason: String = null,
    subject: Reference = null,
    target: GoalTarget = null,
    text: Narrative = null
  ): Resource = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_startDate != null) __obj.updateDynamic("_startDate")(_startDate.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_statusDate != null) __obj.updateDynamic("_statusDate")(_statusDate.asInstanceOf[js.Any])
    if (_statusReason != null) __obj.updateDynamic("_statusReason")(_statusReason.asInstanceOf[js.Any])
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (expressedBy != null) __obj.updateDynamic("expressedBy")(expressedBy.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (outcomeCode != null) __obj.updateDynamic("outcomeCode")(outcomeCode.asInstanceOf[js.Any])
    if (outcomeReference != null) __obj.updateDynamic("outcomeReference")(outcomeReference.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (startCodeableConcept != null) __obj.updateDynamic("startCodeableConcept")(startCodeableConcept.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (statusDate != null) __obj.updateDynamic("statusDate")(statusDate.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

