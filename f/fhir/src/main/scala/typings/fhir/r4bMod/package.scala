package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Age = Quantity

type Count = Quantity

type DataType = Element

type Distance = Quantity

type Duration = Quantity

/** 
NOTE: Rewritten from type alias:
{{{
type FhirResource = fhir.fhir/r4b.Account | fhir.fhir/r4b.ActivityDefinition | fhir.fhir/r4b.AdministrableProductDefinition | fhir.fhir/r4b.AdverseEvent | fhir.fhir/r4b.AllergyIntolerance | fhir.fhir/r4b.Appointment | fhir.fhir/r4b.AppointmentResponse | fhir.fhir/r4b.AuditEvent | fhir.fhir/r4b.Basic | fhir.fhir/r4b.Binary | fhir.fhir/r4b.BiologicallyDerivedProduct | fhir.fhir/r4b.BodyStructure | fhir.fhir/r4b.Bundle<fhir.fhir/r4b.FhirResource> | fhir.fhir/r4b.CapabilityStatement | fhir.fhir/r4b.CarePlan | fhir.fhir/r4b.CareTeam | fhir.fhir/r4b.CatalogEntry | fhir.fhir/r4b.ChargeItem | fhir.fhir/r4b.ChargeItemDefinition | fhir.fhir/r4b.Citation | fhir.fhir/r4b.Claim | fhir.fhir/r4b.ClaimResponse | fhir.fhir/r4b.ClinicalImpression | fhir.fhir/r4b.ClinicalUseDefinition | fhir.fhir/r4b.CodeSystem | fhir.fhir/r4b.Communication | fhir.fhir/r4b.CommunicationRequest | fhir.fhir/r4b.CompartmentDefinition | fhir.fhir/r4b.Composition | fhir.fhir/r4b.ConceptMap | fhir.fhir/r4b.Condition | fhir.fhir/r4b.Consent | fhir.fhir/r4b.Contract | fhir.fhir/r4b.Coverage | fhir.fhir/r4b.CoverageEligibilityRequest | fhir.fhir/r4b.CoverageEligibilityResponse | fhir.fhir/r4b.DetectedIssue | fhir.fhir/r4b.Device | fhir.fhir/r4b.DeviceDefinition | fhir.fhir/r4b.DeviceMetric | fhir.fhir/r4b.DeviceRequest | fhir.fhir/r4b.DeviceUseStatement | fhir.fhir/r4b.DiagnosticReport | fhir.fhir/r4b.DocumentManifest | fhir.fhir/r4b.DocumentReference | fhir.fhir/r4b.Encounter | fhir.fhir/r4b.Endpoint | fhir.fhir/r4b.EnrollmentRequest | fhir.fhir/r4b.EnrollmentResponse | fhir.fhir/r4b.EpisodeOfCare | fhir.fhir/r4b.EventDefinition | fhir.fhir/r4b.Evidence | fhir.fhir/r4b.EvidenceReport | fhir.fhir/r4b.EvidenceVariable | fhir.fhir/r4b.ExampleScenario | fhir.fhir/r4b.ExplanationOfBenefit | fhir.fhir/r4b.FamilyMemberHistory | fhir.fhir/r4b.Flag | fhir.fhir/r4b.Goal | fhir.fhir/r4b.GraphDefinition | fhir.fhir/r4b.Group | fhir.fhir/r4b.GuidanceResponse | fhir.fhir/r4b.HealthcareService | fhir.fhir/r4b.ImagingStudy | fhir.fhir/r4b.Immunization | fhir.fhir/r4b.ImmunizationEvaluation | fhir.fhir/r4b.ImmunizationRecommendation | fhir.fhir/r4b.ImplementationGuide | fhir.fhir/r4b.Ingredient | fhir.fhir/r4b.InsurancePlan | fhir.fhir/r4b.Invoice | fhir.fhir/r4b.Library | fhir.fhir/r4b.Linkage | fhir.fhir/r4b.List | fhir.fhir/r4b.Location | fhir.fhir/r4b.ManufacturedItemDefinition | fhir.fhir/r4b.Measure | fhir.fhir/r4b.MeasureReport | fhir.fhir/r4b.Media | fhir.fhir/r4b.Medication | fhir.fhir/r4b.MedicationAdministration | fhir.fhir/r4b.MedicationDispense | fhir.fhir/r4b.MedicationKnowledge | fhir.fhir/r4b.MedicationRequest | fhir.fhir/r4b.MedicationStatement | fhir.fhir/r4b.MedicinalProductDefinition | fhir.fhir/r4b.MessageDefinition | fhir.fhir/r4b.MessageHeader | fhir.fhir/r4b.MolecularSequence | fhir.fhir/r4b.NamingSystem | fhir.fhir/r4b.NutritionOrder | fhir.fhir/r4b.NutritionProduct | fhir.fhir/r4b.Observation | fhir.fhir/r4b.ObservationDefinition | fhir.fhir/r4b.OperationDefinition | fhir.fhir/r4b.OperationOutcome | fhir.fhir/r4b.Organization | fhir.fhir/r4b.OrganizationAffiliation | fhir.fhir/r4b.PackagedProductDefinition | fhir.fhir/r4b.Parameters | fhir.fhir/r4b.Patient | fhir.fhir/r4b.PaymentNotice | fhir.fhir/r4b.PaymentReconciliation | fhir.fhir/r4b.Person | fhir.fhir/r4b.PlanDefinition | fhir.fhir/r4b.Practitioner | fhir.fhir/r4b.PractitionerRole | fhir.fhir/r4b.Procedure | fhir.fhir/r4b.Provenance | fhir.fhir/r4b.Questionnaire | fhir.fhir/r4b.QuestionnaireResponse | fhir.fhir/r4b.RegulatedAuthorization | fhir.fhir/r4b.RelatedPerson | fhir.fhir/r4b.RequestGroup | fhir.fhir/r4b.ResearchDefinition | fhir.fhir/r4b.ResearchElementDefinition | fhir.fhir/r4b.ResearchStudy | fhir.fhir/r4b.ResearchSubject | fhir.fhir/r4b.RiskAssessment | fhir.fhir/r4b.Schedule | fhir.fhir/r4b.SearchParameter | fhir.fhir/r4b.ServiceRequest | fhir.fhir/r4b.Slot | fhir.fhir/r4b.Specimen | fhir.fhir/r4b.SpecimenDefinition | fhir.fhir/r4b.StructureDefinition | fhir.fhir/r4b.StructureMap | fhir.fhir/r4b.Subscription | fhir.fhir/r4b.SubscriptionStatus | fhir.fhir/r4b.SubscriptionTopic | fhir.fhir/r4b.Substance | fhir.fhir/r4b.SubstanceDefinition | fhir.fhir/r4b.SupplyDelivery | fhir.fhir/r4b.SupplyRequest | fhir.fhir/r4b.Task | fhir.fhir/r4b.TerminologyCapabilities | fhir.fhir/r4b.TestReport | fhir.fhir/r4b.TestScript | fhir.fhir/r4b.ValueSet | fhir.fhir/r4b.VerificationResult | fhir.fhir/r4b.VisionPrescription
}}}
to avoid circular code involving: 
- fhir.fhir/r4b.FhirResource
*/
/* Rewritten from type alias, can be one of: 
  - typings.fhir.r4bMod.Account
  - typings.fhir.r4bMod.ActivityDefinition
  - typings.fhir.r4bMod.AdministrableProductDefinition
  - typings.fhir.r4bMod.AdverseEvent
  - typings.fhir.r4bMod.AllergyIntolerance
  - typings.fhir.r4bMod.Appointment
  - typings.fhir.r4bMod.AppointmentResponse
  - typings.fhir.r4bMod.AuditEvent
  - typings.fhir.r4bMod.Basic
  - typings.fhir.r4bMod.Binary
  - typings.fhir.r4bMod.BiologicallyDerivedProduct
  - typings.fhir.r4bMod.BodyStructure
  - typings.fhir.r4bMod.Bundle[scala.Any]
  - typings.fhir.r4bMod.CapabilityStatement
  - typings.fhir.r4bMod.CarePlan
  - typings.fhir.r4bMod.CareTeam
  - typings.fhir.r4bMod.CatalogEntry
  - typings.fhir.r4bMod.ChargeItem
  - typings.fhir.r4bMod.ChargeItemDefinition
  - typings.fhir.r4bMod.Citation
  - typings.fhir.r4bMod.Claim
  - typings.fhir.r4bMod.ClaimResponse
  - typings.fhir.r4bMod.ClinicalImpression
  - typings.fhir.r4bMod.ClinicalUseDefinition
  - typings.fhir.r4bMod.CodeSystem
  - typings.fhir.r4bMod.Communication
  - typings.fhir.r4bMod.CommunicationRequest
  - typings.fhir.r4bMod.CompartmentDefinition
  - typings.fhir.r4bMod.Composition
  - typings.fhir.r4bMod.ConceptMap
  - typings.fhir.r4bMod.Condition
  - typings.fhir.r4bMod.Consent
  - typings.fhir.r4bMod.Contract
  - typings.fhir.r4bMod.Coverage
  - typings.fhir.r4bMod.CoverageEligibilityRequest
  - typings.fhir.r4bMod.CoverageEligibilityResponse
  - typings.fhir.r4bMod.DetectedIssue
  - typings.fhir.r4bMod.Device
  - typings.fhir.r4bMod.DeviceDefinition
  - typings.fhir.r4bMod.DeviceMetric
  - typings.fhir.r4bMod.DeviceRequest
  - typings.fhir.r4bMod.DeviceUseStatement
  - typings.fhir.r4bMod.DiagnosticReport
  - typings.fhir.r4bMod.DocumentManifest
  - typings.fhir.r4bMod.DocumentReference
  - typings.fhir.r4bMod.Encounter
  - typings.fhir.r4bMod.Endpoint
  - typings.fhir.r4bMod.EnrollmentRequest
  - typings.fhir.r4bMod.EnrollmentResponse
  - typings.fhir.r4bMod.EpisodeOfCare
  - typings.fhir.r4bMod.EventDefinition
  - typings.fhir.r4bMod.Evidence
  - typings.fhir.r4bMod.EvidenceReport
  - typings.fhir.r4bMod.EvidenceVariable
  - typings.fhir.r4bMod.ExampleScenario
  - typings.fhir.r4bMod.ExplanationOfBenefit
  - typings.fhir.r4bMod.FamilyMemberHistory
  - typings.fhir.r4bMod.Flag
  - typings.fhir.r4bMod.Goal
  - typings.fhir.r4bMod.GraphDefinition
  - typings.fhir.r4bMod.Group
  - typings.fhir.r4bMod.GuidanceResponse
  - typings.fhir.r4bMod.HealthcareService
  - typings.fhir.r4bMod.ImagingStudy
  - typings.fhir.r4bMod.Immunization
  - typings.fhir.r4bMod.ImmunizationEvaluation
  - typings.fhir.r4bMod.ImmunizationRecommendation
  - typings.fhir.r4bMod.ImplementationGuide
  - typings.fhir.r4bMod.Ingredient
  - typings.fhir.r4bMod.InsurancePlan
  - typings.fhir.r4bMod.Invoice
  - typings.fhir.r4bMod.Library
  - typings.fhir.r4bMod.Linkage
  - typings.fhir.r4bMod.List
  - typings.fhir.r4bMod.Location
  - typings.fhir.r4bMod.ManufacturedItemDefinition
  - typings.fhir.r4bMod.Measure
  - typings.fhir.r4bMod.MeasureReport
  - typings.fhir.r4bMod.Media
  - typings.fhir.r4bMod.Medication
  - typings.fhir.r4bMod.MedicationAdministration
  - typings.fhir.r4bMod.MedicationDispense
  - typings.fhir.r4bMod.MedicationKnowledge
  - typings.fhir.r4bMod.MedicationRequest
  - typings.fhir.r4bMod.MedicationStatement
  - typings.fhir.r4bMod.MedicinalProductDefinition
  - typings.fhir.r4bMod.MessageDefinition
  - typings.fhir.r4bMod.MessageHeader
  - typings.fhir.r4bMod.MolecularSequence
  - typings.fhir.r4bMod.NamingSystem
  - typings.fhir.r4bMod.NutritionOrder
  - typings.fhir.r4bMod.NutritionProduct
  - typings.fhir.r4bMod.Observation
  - typings.fhir.r4bMod.ObservationDefinition
  - typings.fhir.r4bMod.OperationDefinition
  - typings.fhir.r4bMod.OperationOutcome
  - typings.fhir.r4bMod.Organization
  - typings.fhir.r4bMod.OrganizationAffiliation
  - typings.fhir.r4bMod.PackagedProductDefinition
  - typings.fhir.r4bMod.Parameters
  - typings.fhir.r4bMod.Patient
  - typings.fhir.r4bMod.PaymentNotice
  - typings.fhir.r4bMod.PaymentReconciliation
  - typings.fhir.r4bMod.Person
  - typings.fhir.r4bMod.PlanDefinition
  - typings.fhir.r4bMod.Practitioner
  - typings.fhir.r4bMod.PractitionerRole
  - typings.fhir.r4bMod.Procedure
  - typings.fhir.r4bMod.Provenance
  - typings.fhir.r4bMod.Questionnaire
  - typings.fhir.r4bMod.QuestionnaireResponse
  - typings.fhir.r4bMod.RegulatedAuthorization
  - typings.fhir.r4bMod.RelatedPerson
  - typings.fhir.r4bMod.RequestGroup
  - typings.fhir.r4bMod.ResearchDefinition
  - typings.fhir.r4bMod.ResearchElementDefinition
  - typings.fhir.r4bMod.ResearchStudy
  - typings.fhir.r4bMod.ResearchSubject
  - typings.fhir.r4bMod.RiskAssessment
  - typings.fhir.r4bMod.Schedule
  - typings.fhir.r4bMod.SearchParameter
  - typings.fhir.r4bMod.ServiceRequest
  - typings.fhir.r4bMod.Slot
  - typings.fhir.r4bMod.Specimen
  - typings.fhir.r4bMod.SpecimenDefinition
  - typings.fhir.r4bMod.StructureDefinition
  - typings.fhir.r4bMod.StructureMap
  - typings.fhir.r4bMod.Subscription
  - typings.fhir.r4bMod.SubscriptionStatus
  - typings.fhir.r4bMod.SubscriptionTopic
  - typings.fhir.r4bMod.Substance
  - typings.fhir.r4bMod.SubstanceDefinition
  - typings.fhir.r4bMod.SupplyDelivery
  - typings.fhir.r4bMod.SupplyRequest
  - typings.fhir.r4bMod.Task
  - typings.fhir.r4bMod.TerminologyCapabilities
  - typings.fhir.r4bMod.TestReport
  - typings.fhir.r4bMod.TestScript
  - typings.fhir.r4bMod.ValueSet
  - typings.fhir.r4bMod.VerificationResult
  - typings.fhir.r4bMod.VisionPrescription
*/
type FhirResource = _FhirResource | Bundle[Any]
