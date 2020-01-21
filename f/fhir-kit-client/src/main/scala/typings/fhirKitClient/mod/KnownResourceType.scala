package typings.fhirKitClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fhirKitClient.fhirKitClientStrings.Account
  - typings.fhirKitClient.fhirKitClientStrings.ActivityDefinition
  - typings.fhirKitClient.fhirKitClientStrings.AdverseEvent
  - typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance
  - typings.fhirKitClient.fhirKitClientStrings.Appointment
  - typings.fhirKitClient.fhirKitClientStrings.AppointmentResponse
  - typings.fhirKitClient.fhirKitClientStrings.AuditEvent
  - typings.fhirKitClient.fhirKitClientStrings.Basic
  - typings.fhirKitClient.fhirKitClientStrings.Binary
  - typings.fhirKitClient.fhirKitClientStrings.BodySite
  - typings.fhirKitClient.fhirKitClientStrings.Bundle
  - typings.fhirKitClient.fhirKitClientStrings.CapabilityStatement
  - typings.fhirKitClient.fhirKitClientStrings.CarePlan
  - typings.fhirKitClient.fhirKitClientStrings.CareTeam
  - typings.fhirKitClient.fhirKitClientStrings.ChargeItem
  - typings.fhirKitClient.fhirKitClientStrings.Claim
  - typings.fhirKitClient.fhirKitClientStrings.ClaimResponse
  - typings.fhirKitClient.fhirKitClientStrings.ClinicalImpression
  - typings.fhirKitClient.fhirKitClientStrings.CodeSystem
  - typings.fhirKitClient.fhirKitClientStrings.Communication
  - typings.fhirKitClient.fhirKitClientStrings.CommunicationRequest
  - typings.fhirKitClient.fhirKitClientStrings.CompartmentDefinition
  - typings.fhirKitClient.fhirKitClientStrings.Composition
  - typings.fhirKitClient.fhirKitClientStrings.ConceptMap
  - typings.fhirKitClient.fhirKitClientStrings.Condition
  - typings.fhirKitClient.fhirKitClientStrings.Consent
  - typings.fhirKitClient.fhirKitClientStrings.Contract
  - typings.fhirKitClient.fhirKitClientStrings.Coverage
  - typings.fhirKitClient.fhirKitClientStrings.DataElement
  - typings.fhirKitClient.fhirKitClientStrings.DetectedIssue
  - typings.fhirKitClient.fhirKitClientStrings.Device
  - typings.fhirKitClient.fhirKitClientStrings.DeviceComponent
  - typings.fhirKitClient.fhirKitClientStrings.DeviceMetric
  - typings.fhirKitClient.fhirKitClientStrings.DeviceRequest
  - typings.fhirKitClient.fhirKitClientStrings.DeviceUseStatement
  - typings.fhirKitClient.fhirKitClientStrings.DiagnosticReport
  - typings.fhirKitClient.fhirKitClientStrings.DocumentManifest
  - typings.fhirKitClient.fhirKitClientStrings.DocumentReference
  - typings.fhirKitClient.fhirKitClientStrings.EligibilityRequest
  - typings.fhirKitClient.fhirKitClientStrings.EligibilityResponse
  - typings.fhirKitClient.fhirKitClientStrings.Encounter
  - typings.fhirKitClient.fhirKitClientStrings.Endpoint
  - typings.fhirKitClient.fhirKitClientStrings.EnrollmentRequest
  - typings.fhirKitClient.fhirKitClientStrings.EnrollmentResponse
  - typings.fhirKitClient.fhirKitClientStrings.EpisodeOfCare
  - typings.fhirKitClient.fhirKitClientStrings.ExpansionProfile
  - typings.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit
  - typings.fhirKitClient.fhirKitClientStrings.FamilyMemberHistory
  - typings.fhirKitClient.fhirKitClientStrings.Flag
  - typings.fhirKitClient.fhirKitClientStrings.Goal
  - typings.fhirKitClient.fhirKitClientStrings.GraphDefinition
  - typings.fhirKitClient.fhirKitClientStrings.Group
  - typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse
  - typings.fhirKitClient.fhirKitClientStrings.HealthcareService
  - typings.fhirKitClient.fhirKitClientStrings.ImagingManifest
  - typings.fhirKitClient.fhirKitClientStrings.ImagingStudy
  - typings.fhirKitClient.fhirKitClientStrings.Immunization
  - typings.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation
  - typings.fhirKitClient.fhirKitClientStrings.ImplementationGuide
  - typings.fhirKitClient.fhirKitClientStrings.Library
  - typings.fhirKitClient.fhirKitClientStrings.Linkage
  - typings.fhirKitClient.fhirKitClientStrings.List
  - typings.fhirKitClient.fhirKitClientStrings.Location
  - typings.fhirKitClient.fhirKitClientStrings.Measure
  - typings.fhirKitClient.fhirKitClientStrings.MeasureReport
  - typings.fhirKitClient.fhirKitClientStrings.Media
  - typings.fhirKitClient.fhirKitClientStrings.Medication
  - typings.fhirKitClient.fhirKitClientStrings.MedicationAdministration
  - typings.fhirKitClient.fhirKitClientStrings.MedicationDispense
  - typings.fhirKitClient.fhirKitClientStrings.MedicationRequest
  - typings.fhirKitClient.fhirKitClientStrings.MedicationStatement
  - typings.fhirKitClient.fhirKitClientStrings.MessageDefinition
  - typings.fhirKitClient.fhirKitClientStrings.MessageHeader
  - typings.fhirKitClient.fhirKitClientStrings.NamingSystem
  - typings.fhirKitClient.fhirKitClientStrings.NutritionOrder
  - typings.fhirKitClient.fhirKitClientStrings.Observation
  - typings.fhirKitClient.fhirKitClientStrings.OperationDefinition
  - typings.fhirKitClient.fhirKitClientStrings.OperationOutcome
  - typings.fhirKitClient.fhirKitClientStrings.Organization
  - typings.fhirKitClient.fhirKitClientStrings.Parameters
  - typings.fhirKitClient.fhirKitClientStrings.Patient
  - typings.fhirKitClient.fhirKitClientStrings.PaymentNotice
  - typings.fhirKitClient.fhirKitClientStrings.PaymentReconciliation
  - typings.fhirKitClient.fhirKitClientStrings.Person
  - typings.fhirKitClient.fhirKitClientStrings.PlanDefinition
  - typings.fhirKitClient.fhirKitClientStrings.Practitioner
  - typings.fhirKitClient.fhirKitClientStrings.PractitionerRole
  - typings.fhirKitClient.fhirKitClientStrings.Procedure
  - typings.fhirKitClient.fhirKitClientStrings.ProcedureRequest
  - typings.fhirKitClient.fhirKitClientStrings.ProcessRequest
  - typings.fhirKitClient.fhirKitClientStrings.ProcessResponse
  - typings.fhirKitClient.fhirKitClientStrings.Provenance
  - typings.fhirKitClient.fhirKitClientStrings.Questionnaire
  - typings.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse
  - typings.fhirKitClient.fhirKitClientStrings.ReferralRequest
  - typings.fhirKitClient.fhirKitClientStrings.RelatedPerson
  - typings.fhirKitClient.fhirKitClientStrings.RequestGroup
  - typings.fhirKitClient.fhirKitClientStrings.ResearchStudy
  - typings.fhirKitClient.fhirKitClientStrings.ResearchSubject
  - typings.fhirKitClient.fhirKitClientStrings.RiskAssessment
  - typings.fhirKitClient.fhirKitClientStrings.Schedule
  - typings.fhirKitClient.fhirKitClientStrings.SearchParameter
  - typings.fhirKitClient.fhirKitClientStrings.Sequence
  - typings.fhirKitClient.fhirKitClientStrings.ServiceDefinition
  - typings.fhirKitClient.fhirKitClientStrings.Slot
  - typings.fhirKitClient.fhirKitClientStrings.Specimen
  - typings.fhirKitClient.fhirKitClientStrings.StructureDefinition
  - typings.fhirKitClient.fhirKitClientStrings.StructureMap
  - typings.fhirKitClient.fhirKitClientStrings.Subscription
  - typings.fhirKitClient.fhirKitClientStrings.Substance
  - typings.fhirKitClient.fhirKitClientStrings.SupplyDelivery
  - typings.fhirKitClient.fhirKitClientStrings.SupplyRequest
  - typings.fhirKitClient.fhirKitClientStrings.Task
  - typings.fhirKitClient.fhirKitClientStrings.TestReport
  - typings.fhirKitClient.fhirKitClientStrings.TestScript
  - typings.fhirKitClient.fhirKitClientStrings.ValueSet
  - typings.fhirKitClient.fhirKitClientStrings.VisionPrescription
*/
trait KnownResourceType extends js.Object

object KnownResourceType {
  @scala.inline
  def Account: typings.fhirKitClient.fhirKitClientStrings.Account = this.cast("Account")
  @scala.inline
  def ActivityDefinition: typings.fhirKitClient.fhirKitClientStrings.ActivityDefinition = this.cast("ActivityDefinition")
  @scala.inline
  def AdverseEvent: typings.fhirKitClient.fhirKitClientStrings.AdverseEvent = this.cast("AdverseEvent")
  @scala.inline
  def AllergyIntolerance: typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance = this.cast("AllergyIntolerance")
  @scala.inline
  def Appointment: typings.fhirKitClient.fhirKitClientStrings.Appointment = this.cast("Appointment")
  @scala.inline
  def AppointmentResponse: typings.fhirKitClient.fhirKitClientStrings.AppointmentResponse = this.cast("AppointmentResponse")
  @scala.inline
  def AuditEvent: typings.fhirKitClient.fhirKitClientStrings.AuditEvent = this.cast("AuditEvent")
  @scala.inline
  def Basic: typings.fhirKitClient.fhirKitClientStrings.Basic = this.cast("Basic")
  @scala.inline
  def Binary: typings.fhirKitClient.fhirKitClientStrings.Binary = this.cast("Binary")
  @scala.inline
  def BodySite: typings.fhirKitClient.fhirKitClientStrings.BodySite = this.cast("BodySite")
  @scala.inline
  def Bundle: typings.fhirKitClient.fhirKitClientStrings.Bundle = this.cast("Bundle")
  @scala.inline
  def CapabilityStatement: typings.fhirKitClient.fhirKitClientStrings.CapabilityStatement = this.cast("CapabilityStatement")
  @scala.inline
  def CarePlan: typings.fhirKitClient.fhirKitClientStrings.CarePlan = this.cast("CarePlan")
  @scala.inline
  def CareTeam: typings.fhirKitClient.fhirKitClientStrings.CareTeam = this.cast("CareTeam")
  @scala.inline
  def ChargeItem: typings.fhirKitClient.fhirKitClientStrings.ChargeItem = this.cast("ChargeItem")
  @scala.inline
  def Claim: typings.fhirKitClient.fhirKitClientStrings.Claim = this.cast("Claim")
  @scala.inline
  def ClaimResponse: typings.fhirKitClient.fhirKitClientStrings.ClaimResponse = this.cast("ClaimResponse")
  @scala.inline
  def ClinicalImpression: typings.fhirKitClient.fhirKitClientStrings.ClinicalImpression = this.cast("ClinicalImpression")
  @scala.inline
  def CodeSystem: typings.fhirKitClient.fhirKitClientStrings.CodeSystem = this.cast("CodeSystem")
  @scala.inline
  def Communication: typings.fhirKitClient.fhirKitClientStrings.Communication = this.cast("Communication")
  @scala.inline
  def CommunicationRequest: typings.fhirKitClient.fhirKitClientStrings.CommunicationRequest = this.cast("CommunicationRequest")
  @scala.inline
  def CompartmentDefinition: typings.fhirKitClient.fhirKitClientStrings.CompartmentDefinition = this.cast("CompartmentDefinition")
  @scala.inline
  def Composition: typings.fhirKitClient.fhirKitClientStrings.Composition = this.cast("Composition")
  @scala.inline
  def ConceptMap: typings.fhirKitClient.fhirKitClientStrings.ConceptMap = this.cast("ConceptMap")
  @scala.inline
  def Condition: typings.fhirKitClient.fhirKitClientStrings.Condition = this.cast("Condition")
  @scala.inline
  def Consent: typings.fhirKitClient.fhirKitClientStrings.Consent = this.cast("Consent")
  @scala.inline
  def Contract: typings.fhirKitClient.fhirKitClientStrings.Contract = this.cast("Contract")
  @scala.inline
  def Coverage: typings.fhirKitClient.fhirKitClientStrings.Coverage = this.cast("Coverage")
  @scala.inline
  def DataElement: typings.fhirKitClient.fhirKitClientStrings.DataElement = this.cast("DataElement")
  @scala.inline
  def DetectedIssue: typings.fhirKitClient.fhirKitClientStrings.DetectedIssue = this.cast("DetectedIssue")
  @scala.inline
  def Device: typings.fhirKitClient.fhirKitClientStrings.Device = this.cast("Device")
  @scala.inline
  def DeviceComponent: typings.fhirKitClient.fhirKitClientStrings.DeviceComponent = this.cast("DeviceComponent")
  @scala.inline
  def DeviceMetric: typings.fhirKitClient.fhirKitClientStrings.DeviceMetric = this.cast("DeviceMetric")
  @scala.inline
  def DeviceRequest: typings.fhirKitClient.fhirKitClientStrings.DeviceRequest = this.cast("DeviceRequest")
  @scala.inline
  def DeviceUseStatement: typings.fhirKitClient.fhirKitClientStrings.DeviceUseStatement = this.cast("DeviceUseStatement")
  @scala.inline
  def DiagnosticReport: typings.fhirKitClient.fhirKitClientStrings.DiagnosticReport = this.cast("DiagnosticReport")
  @scala.inline
  def DocumentManifest: typings.fhirKitClient.fhirKitClientStrings.DocumentManifest = this.cast("DocumentManifest")
  @scala.inline
  def DocumentReference: typings.fhirKitClient.fhirKitClientStrings.DocumentReference = this.cast("DocumentReference")
  @scala.inline
  def EligibilityRequest: typings.fhirKitClient.fhirKitClientStrings.EligibilityRequest = this.cast("EligibilityRequest")
  @scala.inline
  def EligibilityResponse: typings.fhirKitClient.fhirKitClientStrings.EligibilityResponse = this.cast("EligibilityResponse")
  @scala.inline
  def Encounter: typings.fhirKitClient.fhirKitClientStrings.Encounter = this.cast("Encounter")
  @scala.inline
  def Endpoint: typings.fhirKitClient.fhirKitClientStrings.Endpoint = this.cast("Endpoint")
  @scala.inline
  def EnrollmentRequest: typings.fhirKitClient.fhirKitClientStrings.EnrollmentRequest = this.cast("EnrollmentRequest")
  @scala.inline
  def EnrollmentResponse: typings.fhirKitClient.fhirKitClientStrings.EnrollmentResponse = this.cast("EnrollmentResponse")
  @scala.inline
  def EpisodeOfCare: typings.fhirKitClient.fhirKitClientStrings.EpisodeOfCare = this.cast("EpisodeOfCare")
  @scala.inline
  def ExpansionProfile: typings.fhirKitClient.fhirKitClientStrings.ExpansionProfile = this.cast("ExpansionProfile")
  @scala.inline
  def ExplanationOfBenefit: typings.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit = this.cast("ExplanationOfBenefit")
  @scala.inline
  def FamilyMemberHistory: typings.fhirKitClient.fhirKitClientStrings.FamilyMemberHistory = this.cast("FamilyMemberHistory")
  @scala.inline
  def Flag: typings.fhirKitClient.fhirKitClientStrings.Flag = this.cast("Flag")
  @scala.inline
  def Goal: typings.fhirKitClient.fhirKitClientStrings.Goal = this.cast("Goal")
  @scala.inline
  def GraphDefinition: typings.fhirKitClient.fhirKitClientStrings.GraphDefinition = this.cast("GraphDefinition")
  @scala.inline
  def Group: typings.fhirKitClient.fhirKitClientStrings.Group = this.cast("Group")
  @scala.inline
  def GuidanceResponse: typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse = this.cast("GuidanceResponse")
  @scala.inline
  def HealthcareService: typings.fhirKitClient.fhirKitClientStrings.HealthcareService = this.cast("HealthcareService")
  @scala.inline
  def ImagingManifest: typings.fhirKitClient.fhirKitClientStrings.ImagingManifest = this.cast("ImagingManifest")
  @scala.inline
  def ImagingStudy: typings.fhirKitClient.fhirKitClientStrings.ImagingStudy = this.cast("ImagingStudy")
  @scala.inline
  def Immunization: typings.fhirKitClient.fhirKitClientStrings.Immunization = this.cast("Immunization")
  @scala.inline
  def ImmunizationRecommendation: typings.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation = this.cast("ImmunizationRecommendation")
  @scala.inline
  def ImplementationGuide: typings.fhirKitClient.fhirKitClientStrings.ImplementationGuide = this.cast("ImplementationGuide")
  @scala.inline
  def Library: typings.fhirKitClient.fhirKitClientStrings.Library = this.cast("Library")
  @scala.inline
  def Linkage: typings.fhirKitClient.fhirKitClientStrings.Linkage = this.cast("Linkage")
  @scala.inline
  def List: typings.fhirKitClient.fhirKitClientStrings.List = this.cast("List")
  @scala.inline
  def Location: typings.fhirKitClient.fhirKitClientStrings.Location = this.cast("Location")
  @scala.inline
  def Measure: typings.fhirKitClient.fhirKitClientStrings.Measure = this.cast("Measure")
  @scala.inline
  def MeasureReport: typings.fhirKitClient.fhirKitClientStrings.MeasureReport = this.cast("MeasureReport")
  @scala.inline
  def Media: typings.fhirKitClient.fhirKitClientStrings.Media = this.cast("Media")
  @scala.inline
  def Medication: typings.fhirKitClient.fhirKitClientStrings.Medication = this.cast("Medication")
  @scala.inline
  def MedicationAdministration: typings.fhirKitClient.fhirKitClientStrings.MedicationAdministration = this.cast("MedicationAdministration")
  @scala.inline
  def MedicationDispense: typings.fhirKitClient.fhirKitClientStrings.MedicationDispense = this.cast("MedicationDispense")
  @scala.inline
  def MedicationRequest: typings.fhirKitClient.fhirKitClientStrings.MedicationRequest = this.cast("MedicationRequest")
  @scala.inline
  def MedicationStatement: typings.fhirKitClient.fhirKitClientStrings.MedicationStatement = this.cast("MedicationStatement")
  @scala.inline
  def MessageDefinition: typings.fhirKitClient.fhirKitClientStrings.MessageDefinition = this.cast("MessageDefinition")
  @scala.inline
  def MessageHeader: typings.fhirKitClient.fhirKitClientStrings.MessageHeader = this.cast("MessageHeader")
  @scala.inline
  def NamingSystem: typings.fhirKitClient.fhirKitClientStrings.NamingSystem = this.cast("NamingSystem")
  @scala.inline
  def NutritionOrder: typings.fhirKitClient.fhirKitClientStrings.NutritionOrder = this.cast("NutritionOrder")
  @scala.inline
  def Observation: typings.fhirKitClient.fhirKitClientStrings.Observation = this.cast("Observation")
  @scala.inline
  def OperationDefinition: typings.fhirKitClient.fhirKitClientStrings.OperationDefinition = this.cast("OperationDefinition")
  @scala.inline
  def OperationOutcome: typings.fhirKitClient.fhirKitClientStrings.OperationOutcome = this.cast("OperationOutcome")
  @scala.inline
  def Organization: typings.fhirKitClient.fhirKitClientStrings.Organization = this.cast("Organization")
  @scala.inline
  def Parameters: typings.fhirKitClient.fhirKitClientStrings.Parameters = this.cast("Parameters")
  @scala.inline
  def Patient: typings.fhirKitClient.fhirKitClientStrings.Patient = this.cast("Patient")
  @scala.inline
  def PaymentNotice: typings.fhirKitClient.fhirKitClientStrings.PaymentNotice = this.cast("PaymentNotice")
  @scala.inline
  def PaymentReconciliation: typings.fhirKitClient.fhirKitClientStrings.PaymentReconciliation = this.cast("PaymentReconciliation")
  @scala.inline
  def Person: typings.fhirKitClient.fhirKitClientStrings.Person = this.cast("Person")
  @scala.inline
  def PlanDefinition: typings.fhirKitClient.fhirKitClientStrings.PlanDefinition = this.cast("PlanDefinition")
  @scala.inline
  def Practitioner: typings.fhirKitClient.fhirKitClientStrings.Practitioner = this.cast("Practitioner")
  @scala.inline
  def PractitionerRole: typings.fhirKitClient.fhirKitClientStrings.PractitionerRole = this.cast("PractitionerRole")
  @scala.inline
  def Procedure: typings.fhirKitClient.fhirKitClientStrings.Procedure = this.cast("Procedure")
  @scala.inline
  def ProcedureRequest: typings.fhirKitClient.fhirKitClientStrings.ProcedureRequest = this.cast("ProcedureRequest")
  @scala.inline
  def ProcessRequest: typings.fhirKitClient.fhirKitClientStrings.ProcessRequest = this.cast("ProcessRequest")
  @scala.inline
  def ProcessResponse: typings.fhirKitClient.fhirKitClientStrings.ProcessResponse = this.cast("ProcessResponse")
  @scala.inline
  def Provenance: typings.fhirKitClient.fhirKitClientStrings.Provenance = this.cast("Provenance")
  @scala.inline
  def Questionnaire: typings.fhirKitClient.fhirKitClientStrings.Questionnaire = this.cast("Questionnaire")
  @scala.inline
  def QuestionnaireResponse: typings.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse = this.cast("QuestionnaireResponse")
  @scala.inline
  def ReferralRequest: typings.fhirKitClient.fhirKitClientStrings.ReferralRequest = this.cast("ReferralRequest")
  @scala.inline
  def RelatedPerson: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson = this.cast("RelatedPerson")
  @scala.inline
  def RequestGroup: typings.fhirKitClient.fhirKitClientStrings.RequestGroup = this.cast("RequestGroup")
  @scala.inline
  def ResearchStudy: typings.fhirKitClient.fhirKitClientStrings.ResearchStudy = this.cast("ResearchStudy")
  @scala.inline
  def ResearchSubject: typings.fhirKitClient.fhirKitClientStrings.ResearchSubject = this.cast("ResearchSubject")
  @scala.inline
  def RiskAssessment: typings.fhirKitClient.fhirKitClientStrings.RiskAssessment = this.cast("RiskAssessment")
  @scala.inline
  def Schedule: typings.fhirKitClient.fhirKitClientStrings.Schedule = this.cast("Schedule")
  @scala.inline
  def SearchParameter: typings.fhirKitClient.fhirKitClientStrings.SearchParameter = this.cast("SearchParameter")
  @scala.inline
  def Sequence: typings.fhirKitClient.fhirKitClientStrings.Sequence = this.cast("Sequence")
  @scala.inline
  def ServiceDefinition: typings.fhirKitClient.fhirKitClientStrings.ServiceDefinition = this.cast("ServiceDefinition")
  @scala.inline
  def Slot: typings.fhirKitClient.fhirKitClientStrings.Slot = this.cast("Slot")
  @scala.inline
  def Specimen: typings.fhirKitClient.fhirKitClientStrings.Specimen = this.cast("Specimen")
  @scala.inline
  def StructureDefinition: typings.fhirKitClient.fhirKitClientStrings.StructureDefinition = this.cast("StructureDefinition")
  @scala.inline
  def StructureMap: typings.fhirKitClient.fhirKitClientStrings.StructureMap = this.cast("StructureMap")
  @scala.inline
  def Subscription: typings.fhirKitClient.fhirKitClientStrings.Subscription = this.cast("Subscription")
  @scala.inline
  def Substance: typings.fhirKitClient.fhirKitClientStrings.Substance = this.cast("Substance")
  @scala.inline
  def SupplyDelivery: typings.fhirKitClient.fhirKitClientStrings.SupplyDelivery = this.cast("SupplyDelivery")
  @scala.inline
  def SupplyRequest: typings.fhirKitClient.fhirKitClientStrings.SupplyRequest = this.cast("SupplyRequest")
  @scala.inline
  def Task: typings.fhirKitClient.fhirKitClientStrings.Task = this.cast("Task")
  @scala.inline
  def TestReport: typings.fhirKitClient.fhirKitClientStrings.TestReport = this.cast("TestReport")
  @scala.inline
  def TestScript: typings.fhirKitClient.fhirKitClientStrings.TestScript = this.cast("TestScript")
  @scala.inline
  def ValueSet: typings.fhirKitClient.fhirKitClientStrings.ValueSet = this.cast("ValueSet")
  @scala.inline
  def VisionPrescription: typings.fhirKitClient.fhirKitClientStrings.VisionPrescription = this.cast("VisionPrescription")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

