package typings.fhir.mod

import typings.fhir.fhirStrings.`busy-tentative`
import typings.fhir.fhirStrings.`busy-unavailable`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.`health-unknown`
import typings.fhir.fhirStrings.`in-process`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`needs-action`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.achieved
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.animal
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.arrived
import typings.fhir.fhirStrings.audio
import typings.fhir.fhirStrings.booked
import typings.fhir.fhirStrings.both
import typings.fhir.fhirStrings.busy
import typings.fhir.fhirStrings.calculation
import typings.fhir.fhirStrings.cancel
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.capability
import typings.fhir.fhirStrings.changes
import typings.fhir.fhirStrings.codesystem_
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.composite
import typings.fhir.fhirStrings.confirmed
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.current
import typings.fhir.fhirStrings.datatype
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.declined
import typings.fhir.fhirStrings.device_
import typings.fhir.fhirStrings.differential
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.elements
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.extensions
import typings.fhir.fhirStrings.finished
import typings.fhir.fhirStrings.free
import typings.fhir.fhirStrings.fulfilled
import typings.fhir.fhirStrings.identifier
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.instance
import typings.fhir.fhirStrings.institutional
import typings.fhir.fhirStrings.intended
import typings.fhir.fhirStrings.logical
import typings.fhir.fhirStrings.measurement
import typings.fhir.fhirStrings.medication_
import typings.fhir.fhirStrings.no
import typings.fhir.fhirStrings.noshow
import typings.fhir.fhirStrings.number
import typings.fhir.fhirStrings.off
import typings.fhir.fhirStrings.onhold
import typings.fhir.fhirStrings.onleave
import typings.fhir.fhirStrings.operation
import typings.fhir.fhirStrings.oral
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.person_
import typings.fhir.fhirStrings.pharmacy
import typings.fhir.fhirStrings.photo
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.poll
import typings.fhir.fhirStrings.practitioner_
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.professional
import typings.fhir.fhirStrings.proposed
import typings.fhir.fhirStrings.provisional
import typings.fhir.fhirStrings.published
import typings.fhir.fhirStrings.quantity_
import typings.fhir.fhirStrings.query
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.refuted
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.replaced
import typings.fhir.fhirStrings.reprocess
import typings.fhir.fhirStrings.requested
import typings.fhir.fhirStrings.requirements
import typings.fhir.fhirStrings.resource
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.review
import typings.fhir.fhirStrings.root
import typings.fhir.fhirStrings.setting
import typings.fhir.fhirStrings.snapshot
import typings.fhir.fhirStrings.status
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.substance_
import typings.fhir.fhirStrings.superseded
import typings.fhir.fhirStrings.sustaining
import typings.fhir.fhirStrings.tentative
import typings.fhir.fhirStrings.token
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.unspecified
import typings.fhir.fhirStrings.uri
import typings.fhir.fhirStrings.video
import typings.fhir.fhirStrings.vision
import typings.fhir.fhirStrings.waitlist
import typings.fhir.fhirStrings.working
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _FhirResource extends StObject
object _FhirResource {
  
  inline def Account(): typings.fhir.mod.Account = {
    val __obj = js.Dynamic.literal(resourceType = "Account")
    __obj.asInstanceOf[typings.fhir.mod.Account]
  }
  
  inline def AllergyIntolerance(patient: Reference, substance: CodeableConcept): typings.fhir.mod.AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "AllergyIntolerance", substance = substance.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.AllergyIntolerance]
  }
  
  inline def Appointment(
    participant: js.Array[AppointmentParticipant],
    status: proposed | pending | booked | arrived | fulfilled | cancelled | noshow
  ): typings.fhir.mod.Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], resourceType = "Appointment", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Appointment]
  }
  
  inline def AppointmentResponse(
    appointment: Reference,
    participantStatus: accepted | declined | tentative | `in-process` | completed | `needs-action`
  ): typings.fhir.mod.AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any], resourceType = "AppointmentResponse")
    __obj.asInstanceOf[typings.fhir.mod.AppointmentResponse]
  }
  
  inline def AuditEvent(event: AuditEventEvent, participant: js.Array[AuditEventParticipant], source: AuditEventSource): typings.fhir.mod.AuditEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], resourceType = "AuditEvent", source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.AuditEvent]
  }
  
  inline def Basic(code: CodeableConcept): typings.fhir.mod.Basic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Basic")
    __obj.asInstanceOf[typings.fhir.mod.Basic]
  }
  
  inline def Binary(content: String, contentType: String): typings.fhir.mod.Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], resourceType = "Binary")
    __obj.asInstanceOf[typings.fhir.mod.Binary]
  }
  
  inline def BodySite(patient: Reference): typings.fhir.mod.BodySite = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "BodySite")
    __obj.asInstanceOf[typings.fhir.mod.BodySite]
  }
  
  inline def CarePlan(status: proposed | draft | active | completed | cancelled): typings.fhir.mod.CarePlan = {
    val __obj = js.Dynamic.literal(resourceType = "CarePlan", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.CarePlan]
  }
  
  inline def Claim(patient: Reference, `type`: institutional | oral | pharmacy | professional | vision): typings.fhir.mod.Claim = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "Claim")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Claim]
  }
  
  inline def ClaimResponse(): typings.fhir.mod.ClaimResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ClaimResponse")
    __obj.asInstanceOf[typings.fhir.mod.ClaimResponse]
  }
  
  inline def ClinicalImpression(patient: Reference, status: `in-progress` | completed | `entered-in-error`): typings.fhir.mod.ClinicalImpression = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ClinicalImpression", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ClinicalImpression]
  }
  
  inline def Communication(): typings.fhir.mod.Communication = {
    val __obj = js.Dynamic.literal(resourceType = "Communication")
    __obj.asInstanceOf[typings.fhir.mod.Communication]
  }
  
  inline def CommunicationRequest(): typings.fhir.mod.CommunicationRequest = {
    val __obj = js.Dynamic.literal(resourceType = "CommunicationRequest")
    __obj.asInstanceOf[typings.fhir.mod.CommunicationRequest]
  }
  
  inline def Composition(
    author: js.Array[Reference],
    date: String,
    status: preliminary | `final` | amended | `entered-in-error`,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): typings.fhir.mod.Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = "Composition", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Composition]
  }
  
  inline def ConceptMap(status: draft | active | retired): typings.fhir.mod.ConceptMap = {
    val __obj = js.Dynamic.literal(resourceType = "ConceptMap", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ConceptMap]
  }
  
  inline def Condition(
    code: CodeableConcept,
    patient: Reference,
    verificationStatus: provisional | differential | confirmed | refuted | `entered-in-error` | unknown
  ): typings.fhir.mod.Condition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "Condition", verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Condition]
  }
  
  inline def Conformance(
    acceptUnknown: no | extensions | elements | both,
    date: String,
    fhirVersion: String,
    format: js.Array[String],
    kind: instance | capability | requirements
  ): typings.fhir.mod.Conformance = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceType = "Conformance")
    __obj.asInstanceOf[typings.fhir.mod.Conformance]
  }
  
  inline def Contract(): typings.fhir.mod.Contract = {
    val __obj = js.Dynamic.literal(resourceType = "Contract")
    __obj.asInstanceOf[typings.fhir.mod.Contract]
  }
  
  inline def Coverage(): typings.fhir.mod.Coverage = {
    val __obj = js.Dynamic.literal(resourceType = "Coverage")
    __obj.asInstanceOf[typings.fhir.mod.Coverage]
  }
  
  inline def DataElement(element: js.Array[ElementDefinition], status: draft | active | retired): typings.fhir.mod.DataElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], resourceType = "DataElement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DataElement]
  }
  
  inline def DetectedIssue(): typings.fhir.mod.DetectedIssue = {
    val __obj = js.Dynamic.literal(resourceType = "DetectedIssue")
    __obj.asInstanceOf[typings.fhir.mod.DetectedIssue]
  }
  
  inline def Device(`type`: CodeableConcept): typings.fhir.mod.Device = {
    val __obj = js.Dynamic.literal(resourceType = "Device")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Device]
  }
  
  inline def DeviceComponent(identifier: Identifier, lastSystemChange: String, `type`: CodeableConcept): typings.fhir.mod.DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], lastSystemChange = lastSystemChange.asInstanceOf[js.Any], resourceType = "DeviceComponent")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DeviceComponent]
  }
  
  inline def DeviceMetric(
    category: measurement | setting | calculation | unspecified,
    identifier: Identifier,
    `type`: CodeableConcept
  ): typings.fhir.mod.DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], resourceType = "DeviceMetric")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DeviceMetric]
  }
  
  inline def DeviceUseRequest(device: Reference, subject: Reference): typings.fhir.mod.DeviceUseRequest = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DeviceUseRequest]
  }
  
  inline def DeviceUseStatement(device: Reference, subject: Reference): typings.fhir.mod.DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseStatement", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DeviceUseStatement]
  }
  
  inline def DiagnosticOrder(subject: Reference): typings.fhir.mod.DiagnosticOrder = {
    val __obj = js.Dynamic.literal(resourceType = "DiagnosticOrder", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DiagnosticOrder]
  }
  
  inline def DiagnosticReport(
    code: CodeableConcept,
    issued: String,
    performer: Reference,
    status: registered | partial | `final` | corrected | appended | cancelled | `entered-in-error`,
    subject: Reference
  ): typings.fhir.mod.DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], performer = performer.asInstanceOf[js.Any], resourceType = "DiagnosticReport", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DiagnosticReport]
  }
  
  inline def DocumentManifest(content: js.Array[DocumentManifestContent], status: current | superseded | `entered-in-error`): typings.fhir.mod.DocumentManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "DocumentManifest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DocumentManifest]
  }
  
  inline def DocumentReference(
    content: js.Array[DocumentReferenceContent],
    indexed: String,
    status: current | superseded | `entered-in-error`,
    `type`: CodeableConcept
  ): typings.fhir.mod.DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], resourceType = "DocumentReference", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.DocumentReference]
  }
  
  inline def EligibilityRequest(): typings.fhir.mod.EligibilityRequest = {
    val __obj = js.Dynamic.literal(resourceType = "EligibilityRequest")
    __obj.asInstanceOf[typings.fhir.mod.EligibilityRequest]
  }
  
  inline def EligibilityResponse(): typings.fhir.mod.EligibilityResponse = {
    val __obj = js.Dynamic.literal(resourceType = "EligibilityResponse")
    __obj.asInstanceOf[typings.fhir.mod.EligibilityResponse]
  }
  
  inline def Encounter(status: planned | arrived | `in-progress` | onleave | finished | cancelled): typings.fhir.mod.Encounter = {
    val __obj = js.Dynamic.literal(resourceType = "Encounter", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Encounter]
  }
  
  inline def EnrollmentRequest(coverage: Reference, relationship: Coding, subject: Reference): typings.fhir.mod.EnrollmentRequest = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceType = "EnrollmentRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.EnrollmentRequest]
  }
  
  inline def EnrollmentResponse(): typings.fhir.mod.EnrollmentResponse = {
    val __obj = js.Dynamic.literal(resourceType = "EnrollmentResponse")
    __obj.asInstanceOf[typings.fhir.mod.EnrollmentResponse]
  }
  
  inline def EpisodeOfCare(patient: Reference, status: planned | waitlist | active | onhold | finished | cancelled): typings.fhir.mod.EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "EpisodeOfCare", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.EpisodeOfCare]
  }
  
  inline def ExplanationOfBenefit(): typings.fhir.mod.ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal(resourceType = "ExplanationOfBenefit")
    __obj.asInstanceOf[typings.fhir.mod.ExplanationOfBenefit]
  }
  
  inline def FamilyMemberHistory(
    patient: Reference,
    relationship: CodeableConcept,
    status: partial | completed | `entered-in-error` | `health-unknown`
  ): typings.fhir.mod.FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceType = "FamilyMemberHistory", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.FamilyMemberHistory]
  }
  
  inline def Flag(code: CodeableConcept, status: active | inactive | `entered-in-error`, subject: Reference): typings.fhir.mod.Flag = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Flag", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Flag]
  }
  
  inline def Goal(
    description: String,
    status: proposed | planned | accepted | rejected | `in-progress` | achieved | sustaining | `on-hold` | cancelled
  ): typings.fhir.mod.Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], resourceType = "Goal", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Goal]
  }
  
  inline def Group(actual: Boolean, `type`: person_ | animal | practitioner_ | device_ | medication_ | substance_): typings.fhir.mod.Group = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], resourceType = "Group")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Group]
  }
  
  inline def HealthcareService(location: Reference): typings.fhir.mod.HealthcareService = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], resourceType = "HealthcareService")
    __obj.asInstanceOf[typings.fhir.mod.HealthcareService]
  }
  
  inline def ImagingObjectSelection(
    patient: Reference,
    study: js.Array[ImagingObjectSelectionStudy],
    title: CodeableConcept,
    uid: String
  ): typings.fhir.mod.ImagingObjectSelection = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ImagingObjectSelection", study = study.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ImagingObjectSelection]
  }
  
  inline def ImagingStudy(numberOfInstances: Double, numberOfSeries: Double, patient: Reference, uid: String): typings.fhir.mod.ImagingStudy = {
    val __obj = js.Dynamic.literal(numberOfInstances = numberOfInstances.asInstanceOf[js.Any], numberOfSeries = numberOfSeries.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "ImagingStudy", uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ImagingStudy]
  }
  
  inline def Immunization(
    patient: Reference,
    reported: Boolean,
    status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped,
    vaccineCode: CodeableConcept,
    wasNotGiven: Boolean
  ): typings.fhir.mod.Immunization = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], reported = reported.asInstanceOf[js.Any], resourceType = "Immunization", status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any], wasNotGiven = wasNotGiven.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Immunization]
  }
  
  inline def ImmunizationRecommendation(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): typings.fhir.mod.ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], resourceType = "ImmunizationRecommendation")
    __obj.asInstanceOf[typings.fhir.mod.ImmunizationRecommendation]
  }
  
  inline def ImplementationGuide(
    _package: js.Array[ImplementationGuidePackage],
    name: String,
    page: ImplementationGuidePage,
    status: draft | active | retired,
    url: String
  ): typings.fhir.mod.ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], resourceType = "ImplementationGuide", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ImplementationGuide]
  }
  
  inline def List(mode: working | snapshot | changes, status: current | retired | `entered-in-error`): typings.fhir.mod.List = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], resourceType = "List", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.List]
  }
  
  inline def Location(): typings.fhir.mod.Location = {
    val __obj = js.Dynamic.literal(resourceType = "Location")
    __obj.asInstanceOf[typings.fhir.mod.Location]
  }
  
  inline def Media(content: Attachment, `type`: photo | video | audio): typings.fhir.mod.Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "Media")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Media]
  }
  
  inline def Medication(): typings.fhir.mod.Medication = {
    val __obj = js.Dynamic.literal(resourceType = "Medication")
    __obj.asInstanceOf[typings.fhir.mod.Medication]
  }
  
  inline def MedicationAdministration(patient: Reference, status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped): typings.fhir.mod.MedicationAdministration = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "MedicationAdministration", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.MedicationAdministration]
  }
  
  inline def MedicationDispense(): typings.fhir.mod.MedicationDispense = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationDispense")
    __obj.asInstanceOf[typings.fhir.mod.MedicationDispense]
  }
  
  inline def MedicationOrder(): typings.fhir.mod.MedicationOrder = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationOrder")
    __obj.asInstanceOf[typings.fhir.mod.MedicationOrder]
  }
  
  inline def MedicationStatement(patient: Reference, status: active | completed | `entered-in-error` | intended): typings.fhir.mod.MedicationStatement = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "MedicationStatement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.MedicationStatement]
  }
  
  inline def MessageHeader(event: Coding, source: MessageHeaderSource, timestamp: String): typings.fhir.mod.MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceType = "MessageHeader", source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.MessageHeader]
  }
  
  inline def NamingSystem(
    date: String,
    kind: codesystem_ | identifier | root,
    name: String,
    status: draft | active | retired,
    uniqueId: js.Array[NamingSystemUniqueId]
  ): typings.fhir.mod.NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "NamingSystem", status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.NamingSystem]
  }
  
  inline def NutritionOrder(dateTime: String, patient: Reference): typings.fhir.mod.NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "NutritionOrder")
    __obj.asInstanceOf[typings.fhir.mod.NutritionOrder]
  }
  
  inline def Observation(
    code: CodeableConcept,
    status: registered | preliminary | `final` | amended | cancelled | `entered-in-error` | unknown
  ): typings.fhir.mod.Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Observation", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Observation]
  }
  
  inline def OperationDefinition(
    code: String,
    instance: Boolean,
    kind: operation | query,
    name: String,
    status: draft | active | retired,
    system: Boolean
  ): typings.fhir.mod.OperationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "OperationDefinition", status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.OperationDefinition]
  }
  
  inline def OperationOutcome(issue: js.Array[OperationOutcomeIssue]): typings.fhir.mod.OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], resourceType = "OperationOutcome")
    __obj.asInstanceOf[typings.fhir.mod.OperationOutcome]
  }
  
  inline def Order(detail: js.Array[Reference]): typings.fhir.mod.Order = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], resourceType = "Order")
    __obj.asInstanceOf[typings.fhir.mod.Order]
  }
  
  inline def OrderResponse(
    orderStatus: pending | review | rejected | error | accepted | cancelled | replaced | aborted | completed,
    request: Reference
  ): typings.fhir.mod.OrderResponse = {
    val __obj = js.Dynamic.literal(orderStatus = orderStatus.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resourceType = "OrderResponse")
    __obj.asInstanceOf[typings.fhir.mod.OrderResponse]
  }
  
  inline def Organization(): typings.fhir.mod.Organization = {
    val __obj = js.Dynamic.literal(resourceType = "Organization")
    __obj.asInstanceOf[typings.fhir.mod.Organization]
  }
  
  inline def Parameters(): typings.fhir.mod.Parameters = {
    val __obj = js.Dynamic.literal(resourceType = "Parameters")
    __obj.asInstanceOf[typings.fhir.mod.Parameters]
  }
  
  inline def Patient(): typings.fhir.mod.Patient = {
    val __obj = js.Dynamic.literal(resourceType = "Patient")
    __obj.asInstanceOf[typings.fhir.mod.Patient]
  }
  
  inline def PaymentNotice(paymentStatus: Coding): typings.fhir.mod.PaymentNotice = {
    val __obj = js.Dynamic.literal(paymentStatus = paymentStatus.asInstanceOf[js.Any], resourceType = "PaymentNotice")
    __obj.asInstanceOf[typings.fhir.mod.PaymentNotice]
  }
  
  inline def PaymentReconciliation(total: Quantity): typings.fhir.mod.PaymentReconciliation = {
    val __obj = js.Dynamic.literal(resourceType = "PaymentReconciliation", total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.PaymentReconciliation]
  }
  
  inline def Person(): typings.fhir.mod.Person = {
    val __obj = js.Dynamic.literal(resourceType = "Person")
    __obj.asInstanceOf[typings.fhir.mod.Person]
  }
  
  inline def Practitioner(): typings.fhir.mod.Practitioner = {
    val __obj = js.Dynamic.literal(resourceType = "Practitioner")
    __obj.asInstanceOf[typings.fhir.mod.Practitioner]
  }
  
  inline def Procedure(
    code: CodeableConcept,
    status: `in-progress` | aborted | completed | `entered-in-error`,
    subject: Reference
  ): typings.fhir.mod.Procedure = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Procedure", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Procedure]
  }
  
  inline def ProcedureRequest(code: CodeableConcept, subject: Reference): typings.fhir.mod.ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ProcedureRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ProcedureRequest]
  }
  
  inline def ProcessRequest(action: cancel | poll | reprocess | status): typings.fhir.mod.ProcessRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], resourceType = "ProcessRequest")
    __obj.asInstanceOf[typings.fhir.mod.ProcessRequest]
  }
  
  inline def ProcessResponse(): typings.fhir.mod.ProcessResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ProcessResponse")
    __obj.asInstanceOf[typings.fhir.mod.ProcessResponse]
  }
  
  inline def Provenance(recorded: String, target: js.Array[Reference]): typings.fhir.mod.Provenance = {
    val __obj = js.Dynamic.literal(recorded = recorded.asInstanceOf[js.Any], resourceType = "Provenance", target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Provenance]
  }
  
  inline def Questionnaire(group: QuestionnaireGroup, status: draft | published | retired): typings.fhir.mod.Questionnaire = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], resourceType = "Questionnaire", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Questionnaire]
  }
  
  inline def QuestionnaireResponse(status: `in-progress` | completed | amended): typings.fhir.mod.QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(resourceType = "QuestionnaireResponse", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.QuestionnaireResponse]
  }
  
  inline def ReferralRequest(status: draft | requested | active | cancelled | accepted | rejected | completed): typings.fhir.mod.ReferralRequest = {
    val __obj = js.Dynamic.literal(resourceType = "ReferralRequest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ReferralRequest]
  }
  
  inline def RelatedPerson(patient: Reference): typings.fhir.mod.RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "RelatedPerson")
    __obj.asInstanceOf[typings.fhir.mod.RelatedPerson]
  }
  
  inline def RiskAssessment(): typings.fhir.mod.RiskAssessment = {
    val __obj = js.Dynamic.literal(resourceType = "RiskAssessment")
    __obj.asInstanceOf[typings.fhir.mod.RiskAssessment]
  }
  
  inline def Schedule(actor: Reference): typings.fhir.mod.Schedule = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], resourceType = "Schedule")
    __obj.asInstanceOf[typings.fhir.mod.Schedule]
  }
  
  inline def SearchParameter(
    base: String,
    code: String,
    description: String,
    name: String,
    `type`: number | date | string | token | reference | composite | quantity_ | uri,
    url: String
  ): typings.fhir.mod.SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "SearchParameter", url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.SearchParameter]
  }
  
  inline def Slot(
    end: String,
    freeBusyType: busy | free | `busy-unavailable` | `busy-tentative`,
    schedule: Reference,
    start: String
  ): typings.fhir.mod.Slot = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], freeBusyType = freeBusyType.asInstanceOf[js.Any], resourceType = "Slot", schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Slot]
  }
  
  inline def Specimen(subject: Reference): typings.fhir.mod.Specimen = {
    val __obj = js.Dynamic.literal(resourceType = "Specimen", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Specimen]
  }
  
  inline def StructureDefinition(
    `abstract`: Boolean,
    kind: datatype | resource | logical,
    name: String,
    status: draft | active | retired,
    url: String
  ): typings.fhir.mod.StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "StructureDefinition", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.StructureDefinition]
  }
  
  inline def Subscription(
    channel: SubscriptionChannel,
    criteria: String,
    reason: String,
    status: requested | active | error | off
  ): typings.fhir.mod.Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resourceType = "Subscription", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.Subscription]
  }
  
  inline def Substance(code: CodeableConcept): typings.fhir.mod.Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Substance")
    __obj.asInstanceOf[typings.fhir.mod.Substance]
  }
  
  inline def SupplyDelivery(): typings.fhir.mod.SupplyDelivery = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyDelivery")
    __obj.asInstanceOf[typings.fhir.mod.SupplyDelivery]
  }
  
  inline def SupplyRequest(): typings.fhir.mod.SupplyRequest = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyRequest")
    __obj.asInstanceOf[typings.fhir.mod.SupplyRequest]
  }
  
  inline def TestScript(name: String, status: draft | active | retired, url: String): typings.fhir.mod.TestScript = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = "TestScript", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.TestScript]
  }
  
  inline def ValueSet(status: draft | active | retired): typings.fhir.mod.ValueSet = {
    val __obj = js.Dynamic.literal(resourceType = "ValueSet", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.mod.ValueSet]
  }
  
  inline def VisionPrescription(): typings.fhir.mod.VisionPrescription = {
    val __obj = js.Dynamic.literal(resourceType = "VisionPrescription")
    __obj.asInstanceOf[typings.fhir.mod.VisionPrescription]
  }
}
