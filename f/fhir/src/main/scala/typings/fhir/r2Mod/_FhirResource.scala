package typings.fhir.r2Mod

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
  
  inline def Account(): typings.fhir.r2Mod.Account = {
    val __obj = js.Dynamic.literal(resourceType = "Account")
    __obj.asInstanceOf[typings.fhir.r2Mod.Account]
  }
  
  inline def AllergyIntolerance(patient: Reference, substance: CodeableConcept): typings.fhir.r2Mod.AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "AllergyIntolerance", substance = substance.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.AllergyIntolerance]
  }
  
  inline def Appointment(
    participant: js.Array[AppointmentParticipant],
    status: proposed | pending | booked | arrived | fulfilled | cancelled | noshow
  ): typings.fhir.r2Mod.Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], resourceType = "Appointment", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Appointment]
  }
  
  inline def AppointmentResponse(
    appointment: Reference,
    participantStatus: accepted | declined | tentative | `in-process` | completed | `needs-action`
  ): typings.fhir.r2Mod.AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any], resourceType = "AppointmentResponse")
    __obj.asInstanceOf[typings.fhir.r2Mod.AppointmentResponse]
  }
  
  inline def AuditEvent(event: AuditEventEvent, participant: js.Array[AuditEventParticipant], source: AuditEventSource): typings.fhir.r2Mod.AuditEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], resourceType = "AuditEvent", source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.AuditEvent]
  }
  
  inline def Basic(code: CodeableConcept): typings.fhir.r2Mod.Basic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Basic")
    __obj.asInstanceOf[typings.fhir.r2Mod.Basic]
  }
  
  inline def Binary(content: String, contentType: String): typings.fhir.r2Mod.Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], resourceType = "Binary")
    __obj.asInstanceOf[typings.fhir.r2Mod.Binary]
  }
  
  inline def BodySite(patient: Reference): typings.fhir.r2Mod.BodySite = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "BodySite")
    __obj.asInstanceOf[typings.fhir.r2Mod.BodySite]
  }
  
  inline def CarePlan(status: proposed | draft | active | completed | cancelled): typings.fhir.r2Mod.CarePlan = {
    val __obj = js.Dynamic.literal(resourceType = "CarePlan", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.CarePlan]
  }
  
  inline def Claim(patient: Reference, `type`: institutional | oral | pharmacy | professional | vision): typings.fhir.r2Mod.Claim = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "Claim")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Claim]
  }
  
  inline def ClaimResponse(): typings.fhir.r2Mod.ClaimResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ClaimResponse")
    __obj.asInstanceOf[typings.fhir.r2Mod.ClaimResponse]
  }
  
  inline def ClinicalImpression(patient: Reference, status: `in-progress` | completed | `entered-in-error`): typings.fhir.r2Mod.ClinicalImpression = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ClinicalImpression", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ClinicalImpression]
  }
  
  inline def Communication(): typings.fhir.r2Mod.Communication = {
    val __obj = js.Dynamic.literal(resourceType = "Communication")
    __obj.asInstanceOf[typings.fhir.r2Mod.Communication]
  }
  
  inline def CommunicationRequest(): typings.fhir.r2Mod.CommunicationRequest = {
    val __obj = js.Dynamic.literal(resourceType = "CommunicationRequest")
    __obj.asInstanceOf[typings.fhir.r2Mod.CommunicationRequest]
  }
  
  inline def Composition(
    author: js.Array[Reference],
    date: String,
    status: preliminary | `final` | amended | `entered-in-error`,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): typings.fhir.r2Mod.Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = "Composition", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Composition]
  }
  
  inline def ConceptMap(status: draft | active | retired): typings.fhir.r2Mod.ConceptMap = {
    val __obj = js.Dynamic.literal(resourceType = "ConceptMap", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ConceptMap]
  }
  
  inline def Condition(
    code: CodeableConcept,
    patient: Reference,
    verificationStatus: provisional | differential | confirmed | refuted | `entered-in-error` | unknown
  ): typings.fhir.r2Mod.Condition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "Condition", verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Condition]
  }
  
  inline def Conformance(
    acceptUnknown: no | extensions | elements | both,
    date: String,
    fhirVersion: String,
    format: js.Array[String],
    kind: instance | capability | requirements
  ): typings.fhir.r2Mod.Conformance = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceType = "Conformance")
    __obj.asInstanceOf[typings.fhir.r2Mod.Conformance]
  }
  
  inline def Contract(): typings.fhir.r2Mod.Contract = {
    val __obj = js.Dynamic.literal(resourceType = "Contract")
    __obj.asInstanceOf[typings.fhir.r2Mod.Contract]
  }
  
  inline def Coverage(): typings.fhir.r2Mod.Coverage = {
    val __obj = js.Dynamic.literal(resourceType = "Coverage")
    __obj.asInstanceOf[typings.fhir.r2Mod.Coverage]
  }
  
  inline def DataElement(element: js.Array[ElementDefinition], status: draft | active | retired): typings.fhir.r2Mod.DataElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], resourceType = "DataElement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DataElement]
  }
  
  inline def DetectedIssue(): typings.fhir.r2Mod.DetectedIssue = {
    val __obj = js.Dynamic.literal(resourceType = "DetectedIssue")
    __obj.asInstanceOf[typings.fhir.r2Mod.DetectedIssue]
  }
  
  inline def Device(`type`: CodeableConcept): typings.fhir.r2Mod.Device = {
    val __obj = js.Dynamic.literal(resourceType = "Device")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Device]
  }
  
  inline def DeviceComponent(identifier: Identifier, lastSystemChange: String, `type`: CodeableConcept): typings.fhir.r2Mod.DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], lastSystemChange = lastSystemChange.asInstanceOf[js.Any], resourceType = "DeviceComponent")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DeviceComponent]
  }
  
  inline def DeviceMetric(
    category: measurement | setting | calculation | unspecified,
    identifier: Identifier,
    `type`: CodeableConcept
  ): typings.fhir.r2Mod.DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], resourceType = "DeviceMetric")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DeviceMetric]
  }
  
  inline def DeviceUseRequest(device: Reference, subject: Reference): typings.fhir.r2Mod.DeviceUseRequest = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DeviceUseRequest]
  }
  
  inline def DeviceUseStatement(device: Reference, subject: Reference): typings.fhir.r2Mod.DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseStatement", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DeviceUseStatement]
  }
  
  inline def DiagnosticOrder(subject: Reference): typings.fhir.r2Mod.DiagnosticOrder = {
    val __obj = js.Dynamic.literal(resourceType = "DiagnosticOrder", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DiagnosticOrder]
  }
  
  inline def DiagnosticReport(
    code: CodeableConcept,
    issued: String,
    performer: Reference,
    status: registered | partial | `final` | corrected | appended | cancelled | `entered-in-error`,
    subject: Reference
  ): typings.fhir.r2Mod.DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], performer = performer.asInstanceOf[js.Any], resourceType = "DiagnosticReport", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DiagnosticReport]
  }
  
  inline def DocumentManifest(content: js.Array[DocumentManifestContent], status: current | superseded | `entered-in-error`): typings.fhir.r2Mod.DocumentManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "DocumentManifest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DocumentManifest]
  }
  
  inline def DocumentReference(
    content: js.Array[DocumentReferenceContent],
    indexed: String,
    status: current | superseded | `entered-in-error`,
    `type`: CodeableConcept
  ): typings.fhir.r2Mod.DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], resourceType = "DocumentReference", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.DocumentReference]
  }
  
  inline def EligibilityRequest(): typings.fhir.r2Mod.EligibilityRequest = {
    val __obj = js.Dynamic.literal(resourceType = "EligibilityRequest")
    __obj.asInstanceOf[typings.fhir.r2Mod.EligibilityRequest]
  }
  
  inline def EligibilityResponse(): typings.fhir.r2Mod.EligibilityResponse = {
    val __obj = js.Dynamic.literal(resourceType = "EligibilityResponse")
    __obj.asInstanceOf[typings.fhir.r2Mod.EligibilityResponse]
  }
  
  inline def Encounter(status: planned | arrived | `in-progress` | onleave | finished | cancelled): typings.fhir.r2Mod.Encounter = {
    val __obj = js.Dynamic.literal(resourceType = "Encounter", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Encounter]
  }
  
  inline def EnrollmentRequest(coverage: Reference, relationship: Coding, subject: Reference): typings.fhir.r2Mod.EnrollmentRequest = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceType = "EnrollmentRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.EnrollmentRequest]
  }
  
  inline def EnrollmentResponse(): typings.fhir.r2Mod.EnrollmentResponse = {
    val __obj = js.Dynamic.literal(resourceType = "EnrollmentResponse")
    __obj.asInstanceOf[typings.fhir.r2Mod.EnrollmentResponse]
  }
  
  inline def EpisodeOfCare(patient: Reference, status: planned | waitlist | active | onhold | finished | cancelled): typings.fhir.r2Mod.EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "EpisodeOfCare", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.EpisodeOfCare]
  }
  
  inline def ExplanationOfBenefit(): typings.fhir.r2Mod.ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal(resourceType = "ExplanationOfBenefit")
    __obj.asInstanceOf[typings.fhir.r2Mod.ExplanationOfBenefit]
  }
  
  inline def FamilyMemberHistory(
    patient: Reference,
    relationship: CodeableConcept,
    status: partial | completed | `entered-in-error` | `health-unknown`
  ): typings.fhir.r2Mod.FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceType = "FamilyMemberHistory", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.FamilyMemberHistory]
  }
  
  inline def Flag(code: CodeableConcept, status: active | inactive | `entered-in-error`, subject: Reference): typings.fhir.r2Mod.Flag = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Flag", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Flag]
  }
  
  inline def Goal(
    description: String,
    status: proposed | planned | accepted | rejected | `in-progress` | achieved | sustaining | `on-hold` | cancelled
  ): typings.fhir.r2Mod.Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], resourceType = "Goal", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Goal]
  }
  
  inline def Group(actual: Boolean, `type`: person_ | animal | practitioner_ | device_ | medication_ | substance_): typings.fhir.r2Mod.Group = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], resourceType = "Group")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Group]
  }
  
  inline def HealthcareService(location: Reference): typings.fhir.r2Mod.HealthcareService = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], resourceType = "HealthcareService")
    __obj.asInstanceOf[typings.fhir.r2Mod.HealthcareService]
  }
  
  inline def ImagingObjectSelection(
    patient: Reference,
    study: js.Array[ImagingObjectSelectionStudy],
    title: CodeableConcept,
    uid: String
  ): typings.fhir.r2Mod.ImagingObjectSelection = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ImagingObjectSelection", study = study.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ImagingObjectSelection]
  }
  
  inline def ImagingStudy(numberOfInstances: Double, numberOfSeries: Double, patient: Reference, uid: String): typings.fhir.r2Mod.ImagingStudy = {
    val __obj = js.Dynamic.literal(numberOfInstances = numberOfInstances.asInstanceOf[js.Any], numberOfSeries = numberOfSeries.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "ImagingStudy", uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ImagingStudy]
  }
  
  inline def Immunization(
    patient: Reference,
    reported: Boolean,
    status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped,
    vaccineCode: CodeableConcept,
    wasNotGiven: Boolean
  ): typings.fhir.r2Mod.Immunization = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], reported = reported.asInstanceOf[js.Any], resourceType = "Immunization", status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any], wasNotGiven = wasNotGiven.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Immunization]
  }
  
  inline def ImmunizationRecommendation(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): typings.fhir.r2Mod.ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], resourceType = "ImmunizationRecommendation")
    __obj.asInstanceOf[typings.fhir.r2Mod.ImmunizationRecommendation]
  }
  
  inline def ImplementationGuide(
    _package: js.Array[ImplementationGuidePackage],
    name: String,
    page: ImplementationGuidePage,
    status: draft | active | retired,
    url: String
  ): typings.fhir.r2Mod.ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], resourceType = "ImplementationGuide", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ImplementationGuide]
  }
  
  inline def List(mode: working | snapshot | changes, status: current | retired | `entered-in-error`): typings.fhir.r2Mod.List = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], resourceType = "List", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.List]
  }
  
  inline def Location(): typings.fhir.r2Mod.Location = {
    val __obj = js.Dynamic.literal(resourceType = "Location")
    __obj.asInstanceOf[typings.fhir.r2Mod.Location]
  }
  
  inline def Media(content: Attachment, `type`: photo | video | audio): typings.fhir.r2Mod.Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "Media")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Media]
  }
  
  inline def Medication(): typings.fhir.r2Mod.Medication = {
    val __obj = js.Dynamic.literal(resourceType = "Medication")
    __obj.asInstanceOf[typings.fhir.r2Mod.Medication]
  }
  
  inline def MedicationAdministration(patient: Reference, status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped): typings.fhir.r2Mod.MedicationAdministration = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "MedicationAdministration", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.MedicationAdministration]
  }
  
  inline def MedicationDispense(): typings.fhir.r2Mod.MedicationDispense = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationDispense")
    __obj.asInstanceOf[typings.fhir.r2Mod.MedicationDispense]
  }
  
  inline def MedicationOrder(): typings.fhir.r2Mod.MedicationOrder = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationOrder")
    __obj.asInstanceOf[typings.fhir.r2Mod.MedicationOrder]
  }
  
  inline def MedicationStatement(patient: Reference, status: active | completed | `entered-in-error` | intended): typings.fhir.r2Mod.MedicationStatement = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "MedicationStatement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.MedicationStatement]
  }
  
  inline def MessageHeader(event: Coding, source: MessageHeaderSource, timestamp: String): typings.fhir.r2Mod.MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceType = "MessageHeader", source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.MessageHeader]
  }
  
  inline def NamingSystem(
    date: String,
    kind: codesystem_ | identifier | root,
    name: String,
    status: draft | active | retired,
    uniqueId: js.Array[NamingSystemUniqueId]
  ): typings.fhir.r2Mod.NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "NamingSystem", status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.NamingSystem]
  }
  
  inline def NutritionOrder(dateTime: String, patient: Reference): typings.fhir.r2Mod.NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "NutritionOrder")
    __obj.asInstanceOf[typings.fhir.r2Mod.NutritionOrder]
  }
  
  inline def Observation(
    code: CodeableConcept,
    status: registered | preliminary | `final` | amended | cancelled | `entered-in-error` | unknown
  ): typings.fhir.r2Mod.Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Observation", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Observation]
  }
  
  inline def OperationDefinition(
    code: String,
    instance: Boolean,
    kind: operation | query,
    name: String,
    status: draft | active | retired,
    system: Boolean
  ): typings.fhir.r2Mod.OperationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "OperationDefinition", status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.OperationDefinition]
  }
  
  inline def OperationOutcome(issue: js.Array[OperationOutcomeIssue]): typings.fhir.r2Mod.OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any], resourceType = "OperationOutcome")
    __obj.asInstanceOf[typings.fhir.r2Mod.OperationOutcome]
  }
  
  inline def Order(detail: js.Array[Reference]): typings.fhir.r2Mod.Order = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], resourceType = "Order")
    __obj.asInstanceOf[typings.fhir.r2Mod.Order]
  }
  
  inline def OrderResponse(
    orderStatus: pending | review | rejected | error | accepted | cancelled | replaced | aborted | completed,
    request: Reference
  ): typings.fhir.r2Mod.OrderResponse = {
    val __obj = js.Dynamic.literal(orderStatus = orderStatus.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resourceType = "OrderResponse")
    __obj.asInstanceOf[typings.fhir.r2Mod.OrderResponse]
  }
  
  inline def Organization(): typings.fhir.r2Mod.Organization = {
    val __obj = js.Dynamic.literal(resourceType = "Organization")
    __obj.asInstanceOf[typings.fhir.r2Mod.Organization]
  }
  
  inline def Parameters(): typings.fhir.r2Mod.Parameters = {
    val __obj = js.Dynamic.literal(resourceType = "Parameters")
    __obj.asInstanceOf[typings.fhir.r2Mod.Parameters]
  }
  
  inline def Patient(): typings.fhir.r2Mod.Patient = {
    val __obj = js.Dynamic.literal(resourceType = "Patient")
    __obj.asInstanceOf[typings.fhir.r2Mod.Patient]
  }
  
  inline def PaymentNotice(paymentStatus: Coding): typings.fhir.r2Mod.PaymentNotice = {
    val __obj = js.Dynamic.literal(paymentStatus = paymentStatus.asInstanceOf[js.Any], resourceType = "PaymentNotice")
    __obj.asInstanceOf[typings.fhir.r2Mod.PaymentNotice]
  }
  
  inline def PaymentReconciliation(total: Quantity): typings.fhir.r2Mod.PaymentReconciliation = {
    val __obj = js.Dynamic.literal(resourceType = "PaymentReconciliation", total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.PaymentReconciliation]
  }
  
  inline def Person(): typings.fhir.r2Mod.Person = {
    val __obj = js.Dynamic.literal(resourceType = "Person")
    __obj.asInstanceOf[typings.fhir.r2Mod.Person]
  }
  
  inline def Practitioner(): typings.fhir.r2Mod.Practitioner = {
    val __obj = js.Dynamic.literal(resourceType = "Practitioner")
    __obj.asInstanceOf[typings.fhir.r2Mod.Practitioner]
  }
  
  inline def Procedure(
    code: CodeableConcept,
    status: `in-progress` | aborted | completed | `entered-in-error`,
    subject: Reference
  ): typings.fhir.r2Mod.Procedure = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Procedure", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Procedure]
  }
  
  inline def ProcedureRequest(code: CodeableConcept, subject: Reference): typings.fhir.r2Mod.ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ProcedureRequest", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ProcedureRequest]
  }
  
  inline def ProcessRequest(action: cancel | poll | reprocess | status): typings.fhir.r2Mod.ProcessRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], resourceType = "ProcessRequest")
    __obj.asInstanceOf[typings.fhir.r2Mod.ProcessRequest]
  }
  
  inline def ProcessResponse(): typings.fhir.r2Mod.ProcessResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ProcessResponse")
    __obj.asInstanceOf[typings.fhir.r2Mod.ProcessResponse]
  }
  
  inline def Provenance(recorded: String, target: js.Array[Reference]): typings.fhir.r2Mod.Provenance = {
    val __obj = js.Dynamic.literal(recorded = recorded.asInstanceOf[js.Any], resourceType = "Provenance", target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Provenance]
  }
  
  inline def Questionnaire(group: QuestionnaireGroup, status: draft | published | retired): typings.fhir.r2Mod.Questionnaire = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], resourceType = "Questionnaire", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Questionnaire]
  }
  
  inline def QuestionnaireResponse(status: `in-progress` | completed | amended): typings.fhir.r2Mod.QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(resourceType = "QuestionnaireResponse", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.QuestionnaireResponse]
  }
  
  inline def ReferralRequest(status: draft | requested | active | cancelled | accepted | rejected | completed): typings.fhir.r2Mod.ReferralRequest = {
    val __obj = js.Dynamic.literal(resourceType = "ReferralRequest", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ReferralRequest]
  }
  
  inline def RelatedPerson(patient: Reference): typings.fhir.r2Mod.RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "RelatedPerson")
    __obj.asInstanceOf[typings.fhir.r2Mod.RelatedPerson]
  }
  
  inline def RiskAssessment(): typings.fhir.r2Mod.RiskAssessment = {
    val __obj = js.Dynamic.literal(resourceType = "RiskAssessment")
    __obj.asInstanceOf[typings.fhir.r2Mod.RiskAssessment]
  }
  
  inline def Schedule(actor: Reference): typings.fhir.r2Mod.Schedule = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], resourceType = "Schedule")
    __obj.asInstanceOf[typings.fhir.r2Mod.Schedule]
  }
  
  inline def SearchParameter(
    base: String,
    code: String,
    description: String,
    name: String,
    `type`: number | date | string | token | reference | composite | quantity_ | uri,
    url: String
  ): typings.fhir.r2Mod.SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "SearchParameter", url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.SearchParameter]
  }
  
  inline def Slot(
    end: String,
    freeBusyType: busy | free | `busy-unavailable` | `busy-tentative`,
    schedule: Reference,
    start: String
  ): typings.fhir.r2Mod.Slot = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], freeBusyType = freeBusyType.asInstanceOf[js.Any], resourceType = "Slot", schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Slot]
  }
  
  inline def Specimen(subject: Reference): typings.fhir.r2Mod.Specimen = {
    val __obj = js.Dynamic.literal(resourceType = "Specimen", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Specimen]
  }
  
  inline def StructureDefinition(
    `abstract`: Boolean,
    kind: datatype | resource | logical,
    name: String,
    status: draft | active | retired,
    url: String
  ): typings.fhir.r2Mod.StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "StructureDefinition", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.StructureDefinition]
  }
  
  inline def Subscription(
    channel: SubscriptionChannel,
    criteria: String,
    reason: String,
    status: requested | active | error | off
  ): typings.fhir.r2Mod.Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resourceType = "Subscription", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.Subscription]
  }
  
  inline def Substance(code: CodeableConcept): typings.fhir.r2Mod.Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Substance")
    __obj.asInstanceOf[typings.fhir.r2Mod.Substance]
  }
  
  inline def SupplyDelivery(): typings.fhir.r2Mod.SupplyDelivery = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyDelivery")
    __obj.asInstanceOf[typings.fhir.r2Mod.SupplyDelivery]
  }
  
  inline def SupplyRequest(): typings.fhir.r2Mod.SupplyRequest = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyRequest")
    __obj.asInstanceOf[typings.fhir.r2Mod.SupplyRequest]
  }
  
  inline def TestScript(name: String, status: draft | active | retired, url: String): typings.fhir.r2Mod.TestScript = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = "TestScript", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.TestScript]
  }
  
  inline def ValueSet(status: draft | active | retired): typings.fhir.r2Mod.ValueSet = {
    val __obj = js.Dynamic.literal(resourceType = "ValueSet", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.r2Mod.ValueSet]
  }
  
  inline def VisionPrescription(): typings.fhir.r2Mod.VisionPrescription = {
    val __obj = js.Dynamic.literal(resourceType = "VisionPrescription")
    __obj.asInstanceOf[typings.fhir.r2Mod.VisionPrescription]
  }
}
