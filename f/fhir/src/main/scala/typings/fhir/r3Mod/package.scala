package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Age = Quantity

type Count = Quantity

type Distance = Quantity

type Duration = Quantity

/** 
NOTE: Rewritten from type alias:
{{{
type FhirResource = fhir.fhir/r3.Account | fhir.fhir/r3.ActivityDefinition | fhir.fhir/r3.AdverseEvent | fhir.fhir/r3.AllergyIntolerance | fhir.fhir/r3.Appointment | fhir.fhir/r3.AppointmentResponse | fhir.fhir/r3.AuditEvent | fhir.fhir/r3.Basic | fhir.fhir/r3.Binary | fhir.fhir/r3.BodySite | fhir.fhir/r3.Bundle<fhir.fhir/r3.FhirResource> | fhir.fhir/r3.CapabilityStatement | fhir.fhir/r3.CarePlan | fhir.fhir/r3.CareTeam | fhir.fhir/r3.ChargeItem | fhir.fhir/r3.Claim | fhir.fhir/r3.ClaimResponse | fhir.fhir/r3.ClinicalImpression | fhir.fhir/r3.CodeSystem | fhir.fhir/r3.Communication | fhir.fhir/r3.CommunicationRequest | fhir.fhir/r3.CompartmentDefinition | fhir.fhir/r3.Composition | fhir.fhir/r3.ConceptMap | fhir.fhir/r3.Condition | fhir.fhir/r3.Consent | fhir.fhir/r3.Contract | fhir.fhir/r3.Coverage | fhir.fhir/r3.DataElement | fhir.fhir/r3.DetectedIssue | fhir.fhir/r3.Device | fhir.fhir/r3.DeviceComponent | fhir.fhir/r3.DeviceMetric | fhir.fhir/r3.DeviceRequest | fhir.fhir/r3.DeviceUseStatement | fhir.fhir/r3.DiagnosticReport | fhir.fhir/r3.DocumentManifest | fhir.fhir/r3.DocumentReference | fhir.fhir/r3.EligibilityRequest | fhir.fhir/r3.EligibilityResponse | fhir.fhir/r3.Encounter | fhir.fhir/r3.Endpoint | fhir.fhir/r3.EnrollmentRequest | fhir.fhir/r3.EnrollmentResponse | fhir.fhir/r3.EpisodeOfCare | fhir.fhir/r3.ExpansionProfile | fhir.fhir/r3.ExplanationOfBenefit | fhir.fhir/r3.FamilyMemberHistory | fhir.fhir/r3.Flag | fhir.fhir/r3.Goal | fhir.fhir/r3.GraphDefinition | fhir.fhir/r3.Group | fhir.fhir/r3.GuidanceResponse | fhir.fhir/r3.HealthcareService | fhir.fhir/r3.ImagingManifest | fhir.fhir/r3.ImagingStudy | fhir.fhir/r3.Immunization | fhir.fhir/r3.ImmunizationRecommendation | fhir.fhir/r3.ImplementationGuide | fhir.fhir/r3.Library | fhir.fhir/r3.Linkage | fhir.fhir/r3.List | fhir.fhir/r3.Location | fhir.fhir/r3.Measure | fhir.fhir/r3.MeasureReport | fhir.fhir/r3.Media | fhir.fhir/r3.Medication | fhir.fhir/r3.MedicationAdministration | fhir.fhir/r3.MedicationDispense | fhir.fhir/r3.MedicationRequest | fhir.fhir/r3.MedicationStatement | fhir.fhir/r3.MessageDefinition | fhir.fhir/r3.MessageHeader | fhir.fhir/r3.NamingSystem | fhir.fhir/r3.NutritionOrder | fhir.fhir/r3.Observation | fhir.fhir/r3.OperationDefinition | fhir.fhir/r3.OperationOutcome | fhir.fhir/r3.Organization | fhir.fhir/r3.Parameters | fhir.fhir/r3.Patient | fhir.fhir/r3.PaymentNotice | fhir.fhir/r3.PaymentReconciliation | fhir.fhir/r3.Person | fhir.fhir/r3.PlanDefinition | fhir.fhir/r3.Practitioner | fhir.fhir/r3.PractitionerRole | fhir.fhir/r3.Procedure | fhir.fhir/r3.ProcedureRequest | fhir.fhir/r3.ProcessRequest | fhir.fhir/r3.ProcessResponse | fhir.fhir/r3.Provenance | fhir.fhir/r3.Questionnaire | fhir.fhir/r3.QuestionnaireResponse | fhir.fhir/r3.ReferralRequest | fhir.fhir/r3.RelatedPerson | fhir.fhir/r3.RequestGroup | fhir.fhir/r3.ResearchStudy | fhir.fhir/r3.ResearchSubject | fhir.fhir/r3.RiskAssessment | fhir.fhir/r3.Schedule | fhir.fhir/r3.SearchParameter | fhir.fhir/r3.Sequence | fhir.fhir/r3.ServiceDefinition | fhir.fhir/r3.Slot | fhir.fhir/r3.Specimen | fhir.fhir/r3.StructureDefinition | fhir.fhir/r3.StructureMap | fhir.fhir/r3.Subscription | fhir.fhir/r3.Substance | fhir.fhir/r3.SupplyDelivery | fhir.fhir/r3.SupplyRequest | fhir.fhir/r3.Task | fhir.fhir/r3.TestReport | fhir.fhir/r3.TestScript | fhir.fhir/r3.ValueSet | fhir.fhir/r3.VisionPrescription
}}}
to avoid circular code involving: 
- fhir.fhir/r3.FhirResource
*/
/* Rewritten from type alias, can be one of: 
  - typings.fhir.r3Mod.Account
  - typings.fhir.r3Mod.ActivityDefinition
  - typings.fhir.r3Mod.AdverseEvent
  - typings.fhir.r3Mod.AllergyIntolerance
  - typings.fhir.r3Mod.Appointment
  - typings.fhir.r3Mod.AppointmentResponse
  - typings.fhir.r3Mod.AuditEvent
  - typings.fhir.r3Mod.Basic
  - typings.fhir.r3Mod.Binary
  - typings.fhir.r3Mod.BodySite
  - typings.fhir.r3Mod.Bundle[scala.Any]
  - typings.fhir.r3Mod.CapabilityStatement
  - typings.fhir.r3Mod.CarePlan
  - typings.fhir.r3Mod.CareTeam
  - typings.fhir.r3Mod.ChargeItem
  - typings.fhir.r3Mod.Claim
  - typings.fhir.r3Mod.ClaimResponse
  - typings.fhir.r3Mod.ClinicalImpression
  - typings.fhir.r3Mod.CodeSystem
  - typings.fhir.r3Mod.Communication
  - typings.fhir.r3Mod.CommunicationRequest
  - typings.fhir.r3Mod.CompartmentDefinition
  - typings.fhir.r3Mod.Composition
  - typings.fhir.r3Mod.ConceptMap
  - typings.fhir.r3Mod.Condition
  - typings.fhir.r3Mod.Consent
  - typings.fhir.r3Mod.Contract
  - typings.fhir.r3Mod.Coverage
  - typings.fhir.r3Mod.DataElement
  - typings.fhir.r3Mod.DetectedIssue
  - typings.fhir.r3Mod.Device
  - typings.fhir.r3Mod.DeviceComponent
  - typings.fhir.r3Mod.DeviceMetric
  - typings.fhir.r3Mod.DeviceRequest
  - typings.fhir.r3Mod.DeviceUseStatement
  - typings.fhir.r3Mod.DiagnosticReport
  - typings.fhir.r3Mod.DocumentManifest
  - typings.fhir.r3Mod.DocumentReference
  - typings.fhir.r3Mod.EligibilityRequest
  - typings.fhir.r3Mod.EligibilityResponse
  - typings.fhir.r3Mod.Encounter
  - typings.fhir.r3Mod.Endpoint
  - typings.fhir.r3Mod.EnrollmentRequest
  - typings.fhir.r3Mod.EnrollmentResponse
  - typings.fhir.r3Mod.EpisodeOfCare
  - typings.fhir.r3Mod.ExpansionProfile
  - typings.fhir.r3Mod.ExplanationOfBenefit
  - typings.fhir.r3Mod.FamilyMemberHistory
  - typings.fhir.r3Mod.Flag
  - typings.fhir.r3Mod.Goal
  - typings.fhir.r3Mod.GraphDefinition
  - typings.fhir.r3Mod.Group
  - typings.fhir.r3Mod.GuidanceResponse
  - typings.fhir.r3Mod.HealthcareService
  - typings.fhir.r3Mod.ImagingManifest
  - typings.fhir.r3Mod.ImagingStudy
  - typings.fhir.r3Mod.Immunization
  - typings.fhir.r3Mod.ImmunizationRecommendation
  - typings.fhir.r3Mod.ImplementationGuide
  - typings.fhir.r3Mod.Library
  - typings.fhir.r3Mod.Linkage
  - typings.fhir.r3Mod.List
  - typings.fhir.r3Mod.Location
  - typings.fhir.r3Mod.Measure
  - typings.fhir.r3Mod.MeasureReport
  - typings.fhir.r3Mod.Media
  - typings.fhir.r3Mod.Medication
  - typings.fhir.r3Mod.MedicationAdministration
  - typings.fhir.r3Mod.MedicationDispense
  - typings.fhir.r3Mod.MedicationRequest
  - typings.fhir.r3Mod.MedicationStatement
  - typings.fhir.r3Mod.MessageDefinition
  - typings.fhir.r3Mod.MessageHeader
  - typings.fhir.r3Mod.NamingSystem
  - typings.fhir.r3Mod.NutritionOrder
  - typings.fhir.r3Mod.Observation
  - typings.fhir.r3Mod.OperationDefinition
  - typings.fhir.r3Mod.OperationOutcome
  - typings.fhir.r3Mod.Organization
  - typings.fhir.r3Mod.Parameters
  - typings.fhir.r3Mod.Patient
  - typings.fhir.r3Mod.PaymentNotice
  - typings.fhir.r3Mod.PaymentReconciliation
  - typings.fhir.r3Mod.Person
  - typings.fhir.r3Mod.PlanDefinition
  - typings.fhir.r3Mod.Practitioner
  - typings.fhir.r3Mod.PractitionerRole
  - typings.fhir.r3Mod.Procedure
  - typings.fhir.r3Mod.ProcedureRequest
  - typings.fhir.r3Mod.ProcessRequest
  - typings.fhir.r3Mod.ProcessResponse
  - typings.fhir.r3Mod.Provenance
  - typings.fhir.r3Mod.Questionnaire
  - typings.fhir.r3Mod.QuestionnaireResponse
  - typings.fhir.r3Mod.ReferralRequest
  - typings.fhir.r3Mod.RelatedPerson
  - typings.fhir.r3Mod.RequestGroup
  - typings.fhir.r3Mod.ResearchStudy
  - typings.fhir.r3Mod.ResearchSubject
  - typings.fhir.r3Mod.RiskAssessment
  - typings.fhir.r3Mod.Schedule
  - typings.fhir.r3Mod.SearchParameter
  - typings.fhir.r3Mod.Sequence
  - typings.fhir.r3Mod.ServiceDefinition
  - typings.fhir.r3Mod.Slot
  - typings.fhir.r3Mod.Specimen
  - typings.fhir.r3Mod.StructureDefinition
  - typings.fhir.r3Mod.StructureMap
  - typings.fhir.r3Mod.Subscription
  - typings.fhir.r3Mod.Substance
  - typings.fhir.r3Mod.SupplyDelivery
  - typings.fhir.r3Mod.SupplyRequest
  - typings.fhir.r3Mod.Task
  - typings.fhir.r3Mod.TestReport
  - typings.fhir.r3Mod.TestScript
  - typings.fhir.r3Mod.ValueSet
  - typings.fhir.r3Mod.VisionPrescription
*/
type FhirResource = _FhirResource | Bundle[Any]

type Money = Quantity
