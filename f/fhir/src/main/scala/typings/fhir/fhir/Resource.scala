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
  def ProcedureRequest(code: CodeableConcept, intent: code, status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Practitioner(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Device(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Procedure(status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Person(): Resource = {
    val __obj = js.Dynamic.literal()
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
    url: uri
  ): Resource = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ProcessResponse(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Schedule(actor: js.Array[Reference]): Resource = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DiagnosticReport(code: CodeableConcept, status: code): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EligibilityResponse(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Parameters(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImmunizationRecommendation(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Provenance(agent: js.Array[ProvenanceAgent], recorded: instant, target: js.Array[Reference]): Resource = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def VisionPrescription(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Group(actual: Boolean, `type`: code): Resource = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CareTeam(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Contract(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Sequence(coordinateSystem: integer): Resource = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Composition(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept
  ): Resource = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def OperationOutcome(issue: js.Array[OperationOutcomeIssue]): Resource = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Patient(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def NamingSystem(date: dateTime, kind: code, name: String, status: code, uniqueId: js.Array[NamingSystemUniqueId]): Resource = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DomainResource(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def BodySite(patient: Reference): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Specimen(subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceComponent(identifier: Identifier, `type`: CodeableConcept): Resource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CommunicationRequest(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CompartmentDefinition(code: code, name: String, search: Boolean, status: code, url: uri): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EnrollmentResponse(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def RiskAssessment(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Subscription(channel: SubscriptionChannel, criteria: String, reason: String, status: code): Resource = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationRequest(intent: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ReferralRequest(intent: code, status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Substance(code: CodeableConcept): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ResearchSubject(individual: Reference, status: code, study: Reference): Resource = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ActivityDefinition(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def StructureDefinition(`abstract`: Boolean, kind: code, name: String, status: code, `type`: code, url: uri): Resource = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Basic(code: CodeableConcept): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def RelatedPerson(patient: Reference): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Claim(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ClaimResponse(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ConceptMap(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def QuestionnaireResponse(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ProcessRequest(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def StructureMap(group: js.Array[StructureMapGroup], name: String, status: code, url: uri): Resource = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImplementationGuide(name: String, status: code, url: uri): Resource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EpisodeOfCare(patient: Reference, status: code): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationAdministration(status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MessageHeader(event: Coding, source: MessageHeaderSource, timestamp: instant): Resource = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AdverseEvent(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def FamilyMemberHistory(patient: Reference, relationship: CodeableConcept, status: code): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PaymentNotice(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def List(mode: code, status: code): Resource = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ExplanationOfBenefit(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ResearchStudy(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Slot(end: instant, schedule: Reference, start: instant, status: code): Resource = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CodeSystem(content: code, status: code): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Flag(code: CodeableConcept, status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceRequest(intent: CodeableConcept, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
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
    `type`: Boolean
  ): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def HealthcareService(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ClinicalImpression(status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def TestScript(name: String, status: code, url: uri): Resource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Immunization(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept
  ): Resource = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ServiceDefinition(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DataElement(element: js.Array[ElementDefinition], status: code): Resource = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationStatement(status: code, subject: Reference, taken: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Task(intent: code, status: code): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ValueSet(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Appointment(participant: js.Array[AppointmentParticipant], status: code): Resource = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EnrollmentRequest(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PractitionerRole(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Linkage(item: js.Array[LinkageItem]): Resource = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MessageDefinition(date: dateTime, event: Coding, status: code): Resource = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Endpoint(address: uri, connectionType: Coding, payloadType: js.Array[CodeableConcept], status: code): Resource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ExpansionProfile(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PlanDefinition(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AuditEvent(agent: js.Array[AuditEventAgent], recorded: instant, source: AuditEventSource, `type`: Coding): Resource = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Encounter(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DocumentReference(
    content: js.Array[DocumentReferenceContent],
    indexed: instant,
    status: code,
    `type`: CodeableConcept
  ): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CapabilityStatement(
    acceptUnknown: code,
    date: dateTime,
    fhirVersion: id,
    format: js.Array[code],
    kind: code,
    status: code
  ): Resource = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AllergyIntolerance(patient: Reference, verificationStatus: code): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def CarePlan(intent: code, status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def NutritionOrder(dateTime: dateTime, patient: Reference): Resource = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImagingStudy(patient: Reference, uid: oid): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ChargeItem(code: CodeableConcept, status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Binary(content: base64Binary, contentType: code): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def TestReport(result: code, status: code, testScript: Reference): Resource = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testScript = testScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def GraphDefinition(name: String, start: code, status: code): Resource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Measure(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Condition(subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MedicationDispense(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Media(content: Attachment, `type`: code): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Communication(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def PaymentReconciliation(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Organization(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def MeasureReport(measure: Reference, period: Period, status: code, `type`: code): Resource = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Consent(patient: Reference, status: code): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Questionnaire(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def RequestGroup(intent: code, status: code): Resource = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def AppointmentResponse(appointment: Reference, participantStatus: code): Resource = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], participantStatus = participantStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DocumentManifest(content: js.Array[DocumentManifestContent], status: code): Resource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Bundle(`type`: code): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DetectedIssue(status: code): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceMetric(category: code, identifier: Identifier, `type`: CodeableConcept): Resource = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def SupplyRequest(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Observation(code: CodeableConcept, status: code): Resource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Medication(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Coverage(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Account(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Library(status: code, `type`: CodeableConcept): Resource = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def GuidanceResponse(module: Reference, status: code): Resource = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def SupplyDelivery(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def EligibilityRequest(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def DeviceUseStatement(device: Reference, status: code, subject: Reference): Resource = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Location(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def ImagingManifest(patient: Reference, study: js.Array[ImagingManifestStudy]): Resource = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  def Goal(description: CodeableConcept, status: code): Resource = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

