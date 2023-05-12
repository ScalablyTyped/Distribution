package typings.fhir.r5Mod

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
type FhirResource = fhir.fhir/r5.Account | fhir.fhir/r5.ActivityDefinition | fhir.fhir/r5.ActorDefinition | fhir.fhir/r5.AdministrableProductDefinition | fhir.fhir/r5.AdverseEvent | fhir.fhir/r5.AllergyIntolerance | fhir.fhir/r5.Appointment | fhir.fhir/r5.AppointmentResponse | fhir.fhir/r5.ArtifactAssessment | fhir.fhir/r5.AuditEvent | fhir.fhir/r5.Basic | fhir.fhir/r5.Binary | fhir.fhir/r5.BiologicallyDerivedProduct | fhir.fhir/r5.BiologicallyDerivedProductDispense | fhir.fhir/r5.BodyStructure | fhir.fhir/r5.Bundle<fhir.fhir/r5.FhirResource> | fhir.fhir/r5.CapabilityStatement | fhir.fhir/r5.CarePlan | fhir.fhir/r5.CareTeam | fhir.fhir/r5.ChargeItem | fhir.fhir/r5.ChargeItemDefinition | fhir.fhir/r5.Citation | fhir.fhir/r5.Claim | fhir.fhir/r5.ClaimResponse | fhir.fhir/r5.ClinicalImpression | fhir.fhir/r5.ClinicalUseDefinition | fhir.fhir/r5.CodeSystem | fhir.fhir/r5.Communication | fhir.fhir/r5.CommunicationRequest | fhir.fhir/r5.CompartmentDefinition | fhir.fhir/r5.Composition | fhir.fhir/r5.ConceptMap | fhir.fhir/r5.Condition | fhir.fhir/r5.ConditionDefinition | fhir.fhir/r5.Consent | fhir.fhir/r5.Contract | fhir.fhir/r5.Coverage | fhir.fhir/r5.CoverageEligibilityRequest | fhir.fhir/r5.CoverageEligibilityResponse | fhir.fhir/r5.DetectedIssue | fhir.fhir/r5.Device | fhir.fhir/r5.DeviceAssociation | fhir.fhir/r5.DeviceDefinition | fhir.fhir/r5.DeviceDispense | fhir.fhir/r5.DeviceMetric | fhir.fhir/r5.DeviceRequest | fhir.fhir/r5.DeviceUsage | fhir.fhir/r5.DiagnosticReport | fhir.fhir/r5.DocumentReference | fhir.fhir/r5.Encounter | fhir.fhir/r5.EncounterHistory | fhir.fhir/r5.Endpoint | fhir.fhir/r5.EnrollmentRequest | fhir.fhir/r5.EnrollmentResponse | fhir.fhir/r5.EpisodeOfCare | fhir.fhir/r5.EventDefinition | fhir.fhir/r5.Evidence | fhir.fhir/r5.EvidenceReport | fhir.fhir/r5.EvidenceVariable | fhir.fhir/r5.ExampleScenario | fhir.fhir/r5.ExplanationOfBenefit | fhir.fhir/r5.FamilyMemberHistory | fhir.fhir/r5.Flag | fhir.fhir/r5.FormularyItem | fhir.fhir/r5.GenomicStudy | fhir.fhir/r5.Goal | fhir.fhir/r5.GraphDefinition | fhir.fhir/r5.Group | fhir.fhir/r5.GuidanceResponse | fhir.fhir/r5.HealthcareService | fhir.fhir/r5.ImagingSelection | fhir.fhir/r5.ImagingStudy | fhir.fhir/r5.Immunization | fhir.fhir/r5.ImmunizationEvaluation | fhir.fhir/r5.ImmunizationRecommendation | fhir.fhir/r5.ImplementationGuide | fhir.fhir/r5.Ingredient | fhir.fhir/r5.InsurancePlan | fhir.fhir/r5.InventoryItem | fhir.fhir/r5.InventoryReport | fhir.fhir/r5.Invoice | fhir.fhir/r5.Library | fhir.fhir/r5.Linkage | fhir.fhir/r5.List | fhir.fhir/r5.Location | fhir.fhir/r5.ManufacturedItemDefinition | fhir.fhir/r5.Measure | fhir.fhir/r5.MeasureReport | fhir.fhir/r5.Medication | fhir.fhir/r5.MedicationAdministration | fhir.fhir/r5.MedicationDispense | fhir.fhir/r5.MedicationKnowledge | fhir.fhir/r5.MedicationRequest | fhir.fhir/r5.MedicationStatement | fhir.fhir/r5.MedicinalProductDefinition | fhir.fhir/r5.MessageDefinition | fhir.fhir/r5.MessageHeader | fhir.fhir/r5.MolecularSequence | fhir.fhir/r5.NamingSystem | fhir.fhir/r5.NutritionIntake | fhir.fhir/r5.NutritionOrder | fhir.fhir/r5.NutritionProduct | fhir.fhir/r5.Observation | fhir.fhir/r5.ObservationDefinition | fhir.fhir/r5.OperationDefinition | fhir.fhir/r5.OperationOutcome | fhir.fhir/r5.Organization | fhir.fhir/r5.OrganizationAffiliation | fhir.fhir/r5.PackagedProductDefinition | fhir.fhir/r5.Parameters | fhir.fhir/r5.Patient | fhir.fhir/r5.PaymentNotice | fhir.fhir/r5.PaymentReconciliation | fhir.fhir/r5.Permission | fhir.fhir/r5.Person | fhir.fhir/r5.PlanDefinition | fhir.fhir/r5.Practitioner | fhir.fhir/r5.PractitionerRole | fhir.fhir/r5.Procedure | fhir.fhir/r5.Provenance | fhir.fhir/r5.Questionnaire | fhir.fhir/r5.QuestionnaireResponse | fhir.fhir/r5.RegulatedAuthorization | fhir.fhir/r5.RelatedPerson | fhir.fhir/r5.RequestOrchestration | fhir.fhir/r5.Requirements | fhir.fhir/r5.ResearchStudy | fhir.fhir/r5.ResearchSubject | fhir.fhir/r5.RiskAssessment | fhir.fhir/r5.Schedule | fhir.fhir/r5.SearchParameter | fhir.fhir/r5.ServiceRequest | fhir.fhir/r5.Slot | fhir.fhir/r5.Specimen | fhir.fhir/r5.SpecimenDefinition | fhir.fhir/r5.StructureDefinition | fhir.fhir/r5.StructureMap | fhir.fhir/r5.Subscription | fhir.fhir/r5.SubscriptionStatus | fhir.fhir/r5.SubscriptionTopic | fhir.fhir/r5.Substance | fhir.fhir/r5.SubstanceDefinition | fhir.fhir/r5.SubstanceNucleicAcid | fhir.fhir/r5.SubstancePolymer | fhir.fhir/r5.SubstanceProtein | fhir.fhir/r5.SubstanceReferenceInformation | fhir.fhir/r5.SubstanceSourceMaterial | fhir.fhir/r5.SupplyDelivery | fhir.fhir/r5.SupplyRequest | fhir.fhir/r5.Task | fhir.fhir/r5.TerminologyCapabilities | fhir.fhir/r5.TestPlan | fhir.fhir/r5.TestReport | fhir.fhir/r5.TestScript | fhir.fhir/r5.Transport | fhir.fhir/r5.ValueSet | fhir.fhir/r5.VerificationResult | fhir.fhir/r5.VisionPrescription
}}}
to avoid circular code involving: 
- fhir.fhir/r5.FhirResource
*/
/* Rewritten from type alias, can be one of: 
  - typings.fhir.r5Mod.Account
  - typings.fhir.r5Mod.ActivityDefinition
  - typings.fhir.r5Mod.ActorDefinition
  - typings.fhir.r5Mod.AdministrableProductDefinition
  - typings.fhir.r5Mod.AdverseEvent
  - typings.fhir.r5Mod.AllergyIntolerance
  - typings.fhir.r5Mod.Appointment
  - typings.fhir.r5Mod.AppointmentResponse
  - typings.fhir.r5Mod.ArtifactAssessment
  - typings.fhir.r5Mod.AuditEvent
  - typings.fhir.r5Mod.Basic
  - typings.fhir.r5Mod.Binary
  - typings.fhir.r5Mod.BiologicallyDerivedProduct
  - typings.fhir.r5Mod.BiologicallyDerivedProductDispense
  - typings.fhir.r5Mod.BodyStructure
  - typings.fhir.r5Mod.Bundle[scala.Any]
  - typings.fhir.r5Mod.CapabilityStatement
  - typings.fhir.r5Mod.CarePlan
  - typings.fhir.r5Mod.CareTeam
  - typings.fhir.r5Mod.ChargeItem
  - typings.fhir.r5Mod.ChargeItemDefinition
  - typings.fhir.r5Mod.Citation
  - typings.fhir.r5Mod.Claim
  - typings.fhir.r5Mod.ClaimResponse
  - typings.fhir.r5Mod.ClinicalImpression
  - typings.fhir.r5Mod.ClinicalUseDefinition
  - typings.fhir.r5Mod.CodeSystem
  - typings.fhir.r5Mod.Communication
  - typings.fhir.r5Mod.CommunicationRequest
  - typings.fhir.r5Mod.CompartmentDefinition
  - typings.fhir.r5Mod.Composition
  - typings.fhir.r5Mod.ConceptMap
  - typings.fhir.r5Mod.Condition
  - typings.fhir.r5Mod.ConditionDefinition
  - typings.fhir.r5Mod.Consent
  - typings.fhir.r5Mod.Contract
  - typings.fhir.r5Mod.Coverage
  - typings.fhir.r5Mod.CoverageEligibilityRequest
  - typings.fhir.r5Mod.CoverageEligibilityResponse
  - typings.fhir.r5Mod.DetectedIssue
  - typings.fhir.r5Mod.Device
  - typings.fhir.r5Mod.DeviceAssociation
  - typings.fhir.r5Mod.DeviceDefinition
  - typings.fhir.r5Mod.DeviceDispense
  - typings.fhir.r5Mod.DeviceMetric
  - typings.fhir.r5Mod.DeviceRequest
  - typings.fhir.r5Mod.DeviceUsage
  - typings.fhir.r5Mod.DiagnosticReport
  - typings.fhir.r5Mod.DocumentReference
  - typings.fhir.r5Mod.Encounter
  - typings.fhir.r5Mod.EncounterHistory
  - typings.fhir.r5Mod.Endpoint
  - typings.fhir.r5Mod.EnrollmentRequest
  - typings.fhir.r5Mod.EnrollmentResponse
  - typings.fhir.r5Mod.EpisodeOfCare
  - typings.fhir.r5Mod.EventDefinition
  - typings.fhir.r5Mod.Evidence
  - typings.fhir.r5Mod.EvidenceReport
  - typings.fhir.r5Mod.EvidenceVariable
  - typings.fhir.r5Mod.ExampleScenario
  - typings.fhir.r5Mod.ExplanationOfBenefit
  - typings.fhir.r5Mod.FamilyMemberHistory
  - typings.fhir.r5Mod.Flag
  - typings.fhir.r5Mod.FormularyItem
  - typings.fhir.r5Mod.GenomicStudy
  - typings.fhir.r5Mod.Goal
  - typings.fhir.r5Mod.GraphDefinition
  - typings.fhir.r5Mod.Group
  - typings.fhir.r5Mod.GuidanceResponse
  - typings.fhir.r5Mod.HealthcareService
  - typings.fhir.r5Mod.ImagingSelection
  - typings.fhir.r5Mod.ImagingStudy
  - typings.fhir.r5Mod.Immunization
  - typings.fhir.r5Mod.ImmunizationEvaluation
  - typings.fhir.r5Mod.ImmunizationRecommendation
  - typings.fhir.r5Mod.ImplementationGuide
  - typings.fhir.r5Mod.Ingredient
  - typings.fhir.r5Mod.InsurancePlan
  - typings.fhir.r5Mod.InventoryItem
  - typings.fhir.r5Mod.InventoryReport
  - typings.fhir.r5Mod.Invoice
  - typings.fhir.r5Mod.Library
  - typings.fhir.r5Mod.Linkage
  - typings.fhir.r5Mod.List
  - typings.fhir.r5Mod.Location
  - typings.fhir.r5Mod.ManufacturedItemDefinition
  - typings.fhir.r5Mod.Measure
  - typings.fhir.r5Mod.MeasureReport
  - typings.fhir.r5Mod.Medication
  - typings.fhir.r5Mod.MedicationAdministration
  - typings.fhir.r5Mod.MedicationDispense
  - typings.fhir.r5Mod.MedicationKnowledge
  - typings.fhir.r5Mod.MedicationRequest
  - typings.fhir.r5Mod.MedicationStatement
  - typings.fhir.r5Mod.MedicinalProductDefinition
  - typings.fhir.r5Mod.MessageDefinition
  - typings.fhir.r5Mod.MessageHeader
  - typings.fhir.r5Mod.MolecularSequence
  - typings.fhir.r5Mod.NamingSystem
  - typings.fhir.r5Mod.NutritionIntake
  - typings.fhir.r5Mod.NutritionOrder
  - typings.fhir.r5Mod.NutritionProduct
  - typings.fhir.r5Mod.Observation
  - typings.fhir.r5Mod.ObservationDefinition
  - typings.fhir.r5Mod.OperationDefinition
  - typings.fhir.r5Mod.OperationOutcome
  - typings.fhir.r5Mod.Organization
  - typings.fhir.r5Mod.OrganizationAffiliation
  - typings.fhir.r5Mod.PackagedProductDefinition
  - typings.fhir.r5Mod.Parameters
  - typings.fhir.r5Mod.Patient
  - typings.fhir.r5Mod.PaymentNotice
  - typings.fhir.r5Mod.PaymentReconciliation
  - typings.fhir.r5Mod.Permission
  - typings.fhir.r5Mod.Person
  - typings.fhir.r5Mod.PlanDefinition
  - typings.fhir.r5Mod.Practitioner
  - typings.fhir.r5Mod.PractitionerRole
  - typings.fhir.r5Mod.Procedure
  - typings.fhir.r5Mod.Provenance
  - typings.fhir.r5Mod.Questionnaire
  - typings.fhir.r5Mod.QuestionnaireResponse
  - typings.fhir.r5Mod.RegulatedAuthorization
  - typings.fhir.r5Mod.RelatedPerson
  - typings.fhir.r5Mod.RequestOrchestration
  - typings.fhir.r5Mod.Requirements
  - typings.fhir.r5Mod.ResearchStudy
  - typings.fhir.r5Mod.ResearchSubject
  - typings.fhir.r5Mod.RiskAssessment
  - typings.fhir.r5Mod.Schedule
  - typings.fhir.r5Mod.SearchParameter
  - typings.fhir.r5Mod.ServiceRequest
  - typings.fhir.r5Mod.Slot
  - typings.fhir.r5Mod.Specimen
  - typings.fhir.r5Mod.SpecimenDefinition
  - typings.fhir.r5Mod.StructureDefinition
  - typings.fhir.r5Mod.StructureMap
  - typings.fhir.r5Mod.Subscription
  - typings.fhir.r5Mod.SubscriptionStatus
  - typings.fhir.r5Mod.SubscriptionTopic
  - typings.fhir.r5Mod.Substance
  - typings.fhir.r5Mod.SubstanceDefinition
  - typings.fhir.r5Mod.SubstanceNucleicAcid
  - typings.fhir.r5Mod.SubstancePolymer
  - typings.fhir.r5Mod.SubstanceProtein
  - typings.fhir.r5Mod.SubstanceReferenceInformation
  - typings.fhir.r5Mod.SubstanceSourceMaterial
  - typings.fhir.r5Mod.SupplyDelivery
  - typings.fhir.r5Mod.SupplyRequest
  - typings.fhir.r5Mod.Task
  - typings.fhir.r5Mod.TerminologyCapabilities
  - typings.fhir.r5Mod.TestPlan
  - typings.fhir.r5Mod.TestReport
  - typings.fhir.r5Mod.TestScript
  - typings.fhir.r5Mod.Transport
  - typings.fhir.r5Mod.ValueSet
  - typings.fhir.r5Mod.VerificationResult
  - typings.fhir.r5Mod.VisionPrescription
*/
type FhirResource = _FhirResource | Bundle[Any]

type PrimitiveType = DataType
