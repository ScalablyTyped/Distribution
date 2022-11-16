package typings.fhir.r2Mod

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
type FhirResource = fhir.fhir/r2.Account | fhir.fhir/r2.AllergyIntolerance | fhir.fhir/r2.Appointment | fhir.fhir/r2.AppointmentResponse | fhir.fhir/r2.AuditEvent | fhir.fhir/r2.Basic | fhir.fhir/r2.Binary | fhir.fhir/r2.BodySite | fhir.fhir/r2.Bundle<fhir.fhir/r2.FhirResource> | fhir.fhir/r2.CarePlan | fhir.fhir/r2.Claim | fhir.fhir/r2.ClaimResponse | fhir.fhir/r2.ClinicalImpression | fhir.fhir/r2.Communication | fhir.fhir/r2.CommunicationRequest | fhir.fhir/r2.Composition | fhir.fhir/r2.ConceptMap | fhir.fhir/r2.Condition | fhir.fhir/r2.Conformance | fhir.fhir/r2.Contract | fhir.fhir/r2.Coverage | fhir.fhir/r2.DataElement | fhir.fhir/r2.DetectedIssue | fhir.fhir/r2.Device | fhir.fhir/r2.DeviceComponent | fhir.fhir/r2.DeviceMetric | fhir.fhir/r2.DeviceUseRequest | fhir.fhir/r2.DeviceUseStatement | fhir.fhir/r2.DiagnosticOrder | fhir.fhir/r2.DiagnosticReport | fhir.fhir/r2.DocumentManifest | fhir.fhir/r2.DocumentReference | fhir.fhir/r2.EligibilityRequest | fhir.fhir/r2.EligibilityResponse | fhir.fhir/r2.Encounter | fhir.fhir/r2.EnrollmentRequest | fhir.fhir/r2.EnrollmentResponse | fhir.fhir/r2.EpisodeOfCare | fhir.fhir/r2.ExplanationOfBenefit | fhir.fhir/r2.FamilyMemberHistory | fhir.fhir/r2.Flag | fhir.fhir/r2.Goal | fhir.fhir/r2.Group | fhir.fhir/r2.HealthcareService | fhir.fhir/r2.ImagingObjectSelection | fhir.fhir/r2.ImagingStudy | fhir.fhir/r2.Immunization | fhir.fhir/r2.ImmunizationRecommendation | fhir.fhir/r2.ImplementationGuide | fhir.fhir/r2.List | fhir.fhir/r2.Location | fhir.fhir/r2.Media | fhir.fhir/r2.Medication | fhir.fhir/r2.MedicationAdministration | fhir.fhir/r2.MedicationDispense | fhir.fhir/r2.MedicationOrder | fhir.fhir/r2.MedicationStatement | fhir.fhir/r2.MessageHeader | fhir.fhir/r2.NamingSystem | fhir.fhir/r2.NutritionOrder | fhir.fhir/r2.Observation | fhir.fhir/r2.OperationDefinition | fhir.fhir/r2.OperationOutcome | fhir.fhir/r2.Order | fhir.fhir/r2.OrderResponse | fhir.fhir/r2.Organization | fhir.fhir/r2.Parameters | fhir.fhir/r2.Patient | fhir.fhir/r2.PaymentNotice | fhir.fhir/r2.PaymentReconciliation | fhir.fhir/r2.Person | fhir.fhir/r2.Practitioner | fhir.fhir/r2.Procedure | fhir.fhir/r2.ProcedureRequest | fhir.fhir/r2.ProcessRequest | fhir.fhir/r2.ProcessResponse | fhir.fhir/r2.Provenance | fhir.fhir/r2.Questionnaire | fhir.fhir/r2.QuestionnaireResponse | fhir.fhir/r2.ReferralRequest | fhir.fhir/r2.RelatedPerson | fhir.fhir/r2.RiskAssessment | fhir.fhir/r2.Schedule | fhir.fhir/r2.SearchParameter | fhir.fhir/r2.Slot | fhir.fhir/r2.Specimen | fhir.fhir/r2.StructureDefinition | fhir.fhir/r2.Subscription | fhir.fhir/r2.Substance | fhir.fhir/r2.SupplyDelivery | fhir.fhir/r2.SupplyRequest | fhir.fhir/r2.TestScript | fhir.fhir/r2.ValueSet | fhir.fhir/r2.VisionPrescription
}}}
to avoid circular code involving: 
- fhir.fhir/r2.FhirResource
*/
/* Rewritten from type alias, can be one of: 
  - typings.fhir.r2Mod.Account
  - typings.fhir.r2Mod.AllergyIntolerance
  - typings.fhir.r2Mod.Appointment
  - typings.fhir.r2Mod.AppointmentResponse
  - typings.fhir.r2Mod.AuditEvent
  - typings.fhir.r2Mod.Basic
  - typings.fhir.r2Mod.Binary
  - typings.fhir.r2Mod.BodySite
  - typings.fhir.r2Mod.Bundle[scala.Any]
  - typings.fhir.r2Mod.CarePlan
  - typings.fhir.r2Mod.Claim
  - typings.fhir.r2Mod.ClaimResponse
  - typings.fhir.r2Mod.ClinicalImpression
  - typings.fhir.r2Mod.Communication
  - typings.fhir.r2Mod.CommunicationRequest
  - typings.fhir.r2Mod.Composition
  - typings.fhir.r2Mod.ConceptMap
  - typings.fhir.r2Mod.Condition
  - typings.fhir.r2Mod.Conformance
  - typings.fhir.r2Mod.Contract
  - typings.fhir.r2Mod.Coverage
  - typings.fhir.r2Mod.DataElement
  - typings.fhir.r2Mod.DetectedIssue
  - typings.fhir.r2Mod.Device
  - typings.fhir.r2Mod.DeviceComponent
  - typings.fhir.r2Mod.DeviceMetric
  - typings.fhir.r2Mod.DeviceUseRequest
  - typings.fhir.r2Mod.DeviceUseStatement
  - typings.fhir.r2Mod.DiagnosticOrder
  - typings.fhir.r2Mod.DiagnosticReport
  - typings.fhir.r2Mod.DocumentManifest
  - typings.fhir.r2Mod.DocumentReference
  - typings.fhir.r2Mod.EligibilityRequest
  - typings.fhir.r2Mod.EligibilityResponse
  - typings.fhir.r2Mod.Encounter
  - typings.fhir.r2Mod.EnrollmentRequest
  - typings.fhir.r2Mod.EnrollmentResponse
  - typings.fhir.r2Mod.EpisodeOfCare
  - typings.fhir.r2Mod.ExplanationOfBenefit
  - typings.fhir.r2Mod.FamilyMemberHistory
  - typings.fhir.r2Mod.Flag
  - typings.fhir.r2Mod.Goal
  - typings.fhir.r2Mod.Group
  - typings.fhir.r2Mod.HealthcareService
  - typings.fhir.r2Mod.ImagingObjectSelection
  - typings.fhir.r2Mod.ImagingStudy
  - typings.fhir.r2Mod.Immunization
  - typings.fhir.r2Mod.ImmunizationRecommendation
  - typings.fhir.r2Mod.ImplementationGuide
  - typings.fhir.r2Mod.List
  - typings.fhir.r2Mod.Location
  - typings.fhir.r2Mod.Media
  - typings.fhir.r2Mod.Medication
  - typings.fhir.r2Mod.MedicationAdministration
  - typings.fhir.r2Mod.MedicationDispense
  - typings.fhir.r2Mod.MedicationOrder
  - typings.fhir.r2Mod.MedicationStatement
  - typings.fhir.r2Mod.MessageHeader
  - typings.fhir.r2Mod.NamingSystem
  - typings.fhir.r2Mod.NutritionOrder
  - typings.fhir.r2Mod.Observation
  - typings.fhir.r2Mod.OperationDefinition
  - typings.fhir.r2Mod.OperationOutcome
  - typings.fhir.r2Mod.Order
  - typings.fhir.r2Mod.OrderResponse
  - typings.fhir.r2Mod.Organization
  - typings.fhir.r2Mod.Parameters
  - typings.fhir.r2Mod.Patient
  - typings.fhir.r2Mod.PaymentNotice
  - typings.fhir.r2Mod.PaymentReconciliation
  - typings.fhir.r2Mod.Person
  - typings.fhir.r2Mod.Practitioner
  - typings.fhir.r2Mod.Procedure
  - typings.fhir.r2Mod.ProcedureRequest
  - typings.fhir.r2Mod.ProcessRequest
  - typings.fhir.r2Mod.ProcessResponse
  - typings.fhir.r2Mod.Provenance
  - typings.fhir.r2Mod.Questionnaire
  - typings.fhir.r2Mod.QuestionnaireResponse
  - typings.fhir.r2Mod.ReferralRequest
  - typings.fhir.r2Mod.RelatedPerson
  - typings.fhir.r2Mod.RiskAssessment
  - typings.fhir.r2Mod.Schedule
  - typings.fhir.r2Mod.SearchParameter
  - typings.fhir.r2Mod.Slot
  - typings.fhir.r2Mod.Specimen
  - typings.fhir.r2Mod.StructureDefinition
  - typings.fhir.r2Mod.Subscription
  - typings.fhir.r2Mod.Substance
  - typings.fhir.r2Mod.SupplyDelivery
  - typings.fhir.r2Mod.SupplyRequest
  - typings.fhir.r2Mod.TestScript
  - typings.fhir.r2Mod.ValueSet
  - typings.fhir.r2Mod.VisionPrescription
*/
type FhirResource = _FhirResource | Bundle[Any]

type Money = Quantity

type SimpleQuantity = Quantity
