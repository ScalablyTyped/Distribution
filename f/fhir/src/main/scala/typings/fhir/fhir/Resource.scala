package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Resource extends StObject
object Resource {
  
  inline def Account(): typings.fhir.fhir.Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Account]
  }
  
  inline def ActivityDefinition(status: code): typings.fhir.fhir.ActivityDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ActivityDefinition]
  }
  
  inline def AdverseEvent(): typings.fhir.fhir.AdverseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.AdverseEvent]
  }
  
  inline def AllergyIntolerance(patient: Reference, verificationStatus: code): typings.fhir.fhir.AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.AllergyIntolerance]
  }
  
  inline def Appointment(participant: js.Array[AppointmentParticipant], status: code): typings.fhir.fhir.Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Appointment]
  }
  
  inline def AppointmentResponse(appointment: Reference, participantStatus: code): typings.fhir.fhir.AppointmentResponse = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.AppointmentResponse]
  }
  
  inline def AuditEvent(agent: js.Array[AuditEventAgent], recorded: instant, source: AuditEventSource, `type`: Coding): typings.fhir.fhir.AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.AuditEvent]
  }
  
  inline def Basic(code: CodeableConcept): typings.fhir.fhir.Basic = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Basic]
  }
  
  inline def Binary(content: base64Binary, contentType: code): typings.fhir.fhir.Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Binary]
  }
  
  inline def BodySite(patient: Reference): typings.fhir.fhir.BodySite = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.BodySite]
  }
  
  inline def Bundle(`type`: code): typings.fhir.fhir.Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Bundle]
  }
  
  inline def CapabilityStatement(
    acceptUnknown: code,
    date: dateTime,
    fhirVersion: id,
    format: js.Array[code],
    kind: code,
    status: code
  ): typings.fhir.fhir.CapabilityStatement = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.CapabilityStatement]
  }
  
  inline def CarePlan(intent: code, status: code, subject: Reference): typings.fhir.fhir.CarePlan = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.CarePlan]
  }
  
  inline def CareTeam(): typings.fhir.fhir.CareTeam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.CareTeam]
  }
  
  inline def ChargeItem(code: CodeableConcept, status: code, subject: Reference): typings.fhir.fhir.ChargeItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ChargeItem]
  }
  
  inline def Claim(): typings.fhir.fhir.Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Claim]
  }
  
  inline def ClaimResponse(): typings.fhir.fhir.ClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.ClaimResponse]
  }
  
  inline def ClinicalImpression(status: code, subject: Reference): typings.fhir.fhir.ClinicalImpression = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ClinicalImpression]
  }
  
  inline def CodeSystem(content: code, status: code): typings.fhir.fhir.CodeSystem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.CodeSystem]
  }
  
  inline def Communication(status: code): typings.fhir.fhir.Communication = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Communication]
  }
  
  inline def CommunicationRequest(status: code): typings.fhir.fhir.CommunicationRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.CommunicationRequest]
  }
  
  inline def CompartmentDefinition(code: code, name: String, search: Boolean, status: code, url: uri): typings.fhir.fhir.CompartmentDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.CompartmentDefinition]
  }
  
  inline def Composition(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): typings.fhir.fhir.Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Composition]
  }
  
  inline def ConceptMap(status: code): typings.fhir.fhir.ConceptMap = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ConceptMap]
  }
  
  inline def Condition(subject: Reference): typings.fhir.fhir.Condition = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Condition]
  }
  
  inline def Consent(patient: Reference, status: code): typings.fhir.fhir.Consent = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Consent]
  }
  
  inline def Contract(): typings.fhir.fhir.Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Contract]
  }
  
  inline def Coverage(): typings.fhir.fhir.Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Coverage]
  }
  
  inline def DataElement(element: js.Array[ElementDefinition], status: code): typings.fhir.fhir.DataElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DataElement]
  }
  
  inline def DetectedIssue(status: code): typings.fhir.fhir.DetectedIssue = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DetectedIssue]
  }
  
  inline def Device(): typings.fhir.fhir.Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Device]
  }
  
  inline def DeviceComponent(identifier: Identifier, `type`: CodeableConcept): typings.fhir.fhir.DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DeviceComponent]
  }
  
  inline def DeviceMetric(category: code, identifier: Identifier, `type`: CodeableConcept): typings.fhir.fhir.DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DeviceMetric]
  }
  
  inline def DeviceRequest(intent: CodeableConcept, subject: Reference): typings.fhir.fhir.DeviceRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DeviceRequest]
  }
  
  inline def DeviceUseStatement(device: Reference, status: code, subject: Reference): typings.fhir.fhir.DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DeviceUseStatement]
  }
  
  inline def DiagnosticReport(code: CodeableConcept, status: code): typings.fhir.fhir.DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DiagnosticReport]
  }
  
  inline def DocumentManifest(content: js.Array[DocumentManifestContent], status: code): typings.fhir.fhir.DocumentManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DocumentManifest]
  }
  
  inline def DocumentReference(
    content: js.Array[DocumentReferenceContent],
    indexed: instant,
    status: code,
    `type`: CodeableConcept
  ): typings.fhir.fhir.DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.DocumentReference]
  }
  
  inline def DomainResource(): typings.fhir.fhir.DomainResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.DomainResource]
  }
  
  inline def EligibilityRequest(): typings.fhir.fhir.EligibilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.EligibilityRequest]
  }
  
  inline def EligibilityResponse(): typings.fhir.fhir.EligibilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.EligibilityResponse]
  }
  
  inline def Encounter(status: code): typings.fhir.fhir.Encounter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Encounter]
  }
  
  inline def Endpoint(address: uri, connectionType: Coding, payloadType: js.Array[CodeableConcept], status: code): typings.fhir.fhir.Endpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Endpoint]
  }
  
  inline def EnrollmentRequest(): typings.fhir.fhir.EnrollmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.EnrollmentRequest]
  }
  
  inline def EnrollmentResponse(): typings.fhir.fhir.EnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.EnrollmentResponse]
  }
  
  inline def EpisodeOfCare(patient: Reference, status: code): typings.fhir.fhir.EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.EpisodeOfCare]
  }
  
  inline def ExpansionProfile(status: code): typings.fhir.fhir.ExpansionProfile = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ExpansionProfile]
  }
  
  inline def ExplanationOfBenefit(): typings.fhir.fhir.ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.ExplanationOfBenefit]
  }
  
  inline def FamilyMemberHistory(patient: Reference, relationship: CodeableConcept, status: code): typings.fhir.fhir.FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.FamilyMemberHistory]
  }
  
  inline def Flag(code: CodeableConcept, status: code, subject: Reference): typings.fhir.fhir.Flag = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Flag]
  }
  
  inline def Goal(description: CodeableConcept, status: code): typings.fhir.fhir.Goal = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Goal]
  }
  
  inline def GraphDefinition(name: String, start: code, status: code): typings.fhir.fhir.GraphDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.GraphDefinition]
  }
  
  inline def Group(actual: Boolean, `type`: code): typings.fhir.fhir.Group = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Group]
  }
  
  inline def GuidanceResponse(module: Reference, status: code): typings.fhir.fhir.GuidanceResponse = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.GuidanceResponse]
  }
  
  inline def HealthcareService(): typings.fhir.fhir.HealthcareService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.HealthcareService]
  }
  
  inline def ImagingManifest(patient: Reference, study: js.Array[ImagingManifestStudy]): typings.fhir.fhir.ImagingManifest = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ImagingManifest]
  }
  
  inline def ImagingStudy(patient: Reference, uid: oid): typings.fhir.fhir.ImagingStudy = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ImagingStudy]
  }
  
  inline def Immunization(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept
  ): typings.fhir.fhir.Immunization = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Immunization]
  }
  
  inline def ImmunizationRecommendation(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): typings.fhir.fhir.ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ImmunizationRecommendation]
  }
  
  inline def ImplementationGuide(name: String, status: code, url: uri): typings.fhir.fhir.ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ImplementationGuide]
  }
  
  inline def Library(status: code, `type`: CodeableConcept): typings.fhir.fhir.Library = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Library]
  }
  
  inline def Linkage(item: js.Array[LinkageItem]): typings.fhir.fhir.Linkage = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Linkage]
  }
  
  inline def List(mode: code, status: code): typings.fhir.fhir.List = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.List]
  }
  
  inline def Location(): typings.fhir.fhir.Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Location]
  }
  
  inline def Measure(status: code): typings.fhir.fhir.Measure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Measure]
  }
  
  inline def MeasureReport(measure: Reference, period: Period, status: code, `type`: code): typings.fhir.fhir.MeasureReport = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.MeasureReport]
  }
  
  inline def Media(content: Attachment, `type`: code): typings.fhir.fhir.Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Media]
  }
  
  inline def Medication(): typings.fhir.fhir.Medication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Medication]
  }
  
  inline def MedicationAdministration(status: code, subject: Reference): typings.fhir.fhir.MedicationAdministration = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.MedicationAdministration]
  }
  
  inline def MedicationDispense(): typings.fhir.fhir.MedicationDispense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.MedicationDispense]
  }
  
  inline def MedicationRequest(intent: code, subject: Reference): typings.fhir.fhir.MedicationRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.MedicationRequest]
  }
  
  inline def MedicationStatement(status: code, subject: Reference, taken: code): typings.fhir.fhir.MedicationStatement = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.MedicationStatement]
  }
  
  inline def MessageDefinition(date: dateTime, event: Coding, status: code): typings.fhir.fhir.MessageDefinition = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.MessageDefinition]
  }
  
  inline def MessageHeader(event: Coding, source: MessageHeaderSource, timestamp: instant): typings.fhir.fhir.MessageHeader = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.MessageHeader]
  }
  
  inline def NamingSystem(date: dateTime, kind: code, name: String, status: code, uniqueId: js.Array[NamingSystemUniqueId]): typings.fhir.fhir.NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.NamingSystem]
  }
  
  inline def NutritionOrder(dateTime: dateTime, patient: Reference): typings.fhir.fhir.NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.NutritionOrder]
  }
  
  inline def Observation(code: CodeableConcept, status: code): typings.fhir.fhir.Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Observation]
  }
  
  inline def OperationDefinition(
    code: code,
    instance: Boolean,
    kind: code,
    name: String,
    status: code,
    system: Boolean,
    `type`: Boolean
  ): typings.fhir.fhir.OperationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.OperationDefinition]
  }
  
  inline def OperationOutcome(issue: js.Array[OperationOutcomeIssue]): typings.fhir.fhir.OperationOutcome = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.OperationOutcome]
  }
  
  inline def Organization(): typings.fhir.fhir.Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Organization]
  }
  
  inline def Parameters(): typings.fhir.fhir.Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Parameters]
  }
  
  inline def Patient(): typings.fhir.fhir.Patient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Patient]
  }
  
  inline def PaymentNotice(): typings.fhir.fhir.PaymentNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.PaymentNotice]
  }
  
  inline def PaymentReconciliation(): typings.fhir.fhir.PaymentReconciliation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.PaymentReconciliation]
  }
  
  inline def Person(): typings.fhir.fhir.Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Person]
  }
  
  inline def PlanDefinition(status: code): typings.fhir.fhir.PlanDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.PlanDefinition]
  }
  
  inline def Practitioner(): typings.fhir.fhir.Practitioner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.Practitioner]
  }
  
  inline def PractitionerRole(): typings.fhir.fhir.PractitionerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.PractitionerRole]
  }
  
  inline def Procedure(status: code, subject: Reference): typings.fhir.fhir.Procedure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Procedure]
  }
  
  inline def ProcedureRequest(code: CodeableConcept, intent: code, status: code, subject: Reference): typings.fhir.fhir.ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ProcedureRequest]
  }
  
  inline def ProcessRequest(): typings.fhir.fhir.ProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.ProcessRequest]
  }
  
  inline def ProcessResponse(): typings.fhir.fhir.ProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.ProcessResponse]
  }
  
  inline def Provenance(agent: js.Array[ProvenanceAgent], recorded: instant, target: js.Array[Reference]): typings.fhir.fhir.Provenance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Provenance]
  }
  
  inline def Questionnaire(status: code): typings.fhir.fhir.Questionnaire = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Questionnaire]
  }
  
  inline def QuestionnaireResponse(status: code): typings.fhir.fhir.QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.QuestionnaireResponse]
  }
  
  inline def ReferralRequest(intent: code, status: code, subject: Reference): typings.fhir.fhir.ReferralRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ReferralRequest]
  }
  
  inline def RelatedPerson(patient: Reference): typings.fhir.fhir.RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.RelatedPerson]
  }
  
  inline def RequestGroup(intent: code, status: code): typings.fhir.fhir.RequestGroup = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.RequestGroup]
  }
  
  inline def ResearchStudy(status: code): typings.fhir.fhir.ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ResearchStudy]
  }
  
  inline def ResearchSubject(individual: Reference, status: code, study: Reference): typings.fhir.fhir.ResearchSubject = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ResearchSubject]
  }
  
  inline def RiskAssessment(status: code): typings.fhir.fhir.RiskAssessment = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.RiskAssessment]
  }
  
  inline def Schedule(actor: js.Array[Reference]): typings.fhir.fhir.Schedule = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Schedule]
  }
  
  inline def SearchParameter(
    base: js.Array[code],
    code: code,
    description: markdown,
    name: String,
    status: code,
    `type`: code,
    url: uri
  ): typings.fhir.fhir.SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.SearchParameter]
  }
  
  inline def Sequence(coordinateSystem: integer): typings.fhir.fhir.Sequence = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Sequence]
  }
  
  inline def ServiceDefinition(status: code): typings.fhir.fhir.ServiceDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ServiceDefinition]
  }
  
  inline def Slot(end: instant, schedule: Reference, start: instant, status: code): typings.fhir.fhir.Slot = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Slot]
  }
  
  inline def Specimen(subject: Reference): typings.fhir.fhir.Specimen = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Specimen]
  }
  
  inline def StructureDefinition(`abstract`: Boolean, kind: code, name: String, status: code, `type`: code, url: uri): typings.fhir.fhir.StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.StructureDefinition]
  }
  
  inline def StructureMap(group: js.Array[StructureMapGroup], name: String, status: code, url: uri): typings.fhir.fhir.StructureMap = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.StructureMap]
  }
  
  inline def Subscription(channel: SubscriptionChannel, criteria: String, reason: String, status: code): typings.fhir.fhir.Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Subscription]
  }
  
  inline def Substance(code: CodeableConcept): typings.fhir.fhir.Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Substance]
  }
  
  inline def SupplyDelivery(): typings.fhir.fhir.SupplyDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.SupplyDelivery]
  }
  
  inline def SupplyRequest(): typings.fhir.fhir.SupplyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.SupplyRequest]
  }
  
  inline def Task(intent: code, status: code): typings.fhir.fhir.Task = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.Task]
  }
  
  inline def TestReport(result: code, status: code, testScript: Reference): typings.fhir.fhir.TestReport = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testScript = testScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.TestReport]
  }
  
  inline def TestScript(name: String, status: code, url: uri): typings.fhir.fhir.TestScript = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.TestScript]
  }
  
  inline def ValueSet(status: code): typings.fhir.fhir.ValueSet = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fhir.fhir.ValueSet]
  }
  
  inline def VisionPrescription(): typings.fhir.fhir.VisionPrescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fhir.fhir.VisionPrescription]
  }
}
