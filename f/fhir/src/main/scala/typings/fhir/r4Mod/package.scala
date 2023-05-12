package typings.fhir.r4Mod

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
type FhirResource = fhir.fhir/r4.Account | fhir.fhir/r4.ActivityDefinition | fhir.fhir/r4.AdverseEvent | fhir.fhir/r4.AllergyIntolerance | fhir.fhir/r4.Appointment | fhir.fhir/r4.AppointmentResponse | fhir.fhir/r4.AuditEvent | fhir.fhir/r4.Basic | fhir.fhir/r4.Binary | fhir.fhir/r4.BiologicallyDerivedProduct | fhir.fhir/r4.BodyStructure | fhir.fhir/r4.Bundle<fhir.fhir/r4.FhirResource> | fhir.fhir/r4.CapabilityStatement | fhir.fhir/r4.CarePlan | fhir.fhir/r4.CareTeam | fhir.fhir/r4.CatalogEntry | fhir.fhir/r4.ChargeItem | fhir.fhir/r4.ChargeItemDefinition | fhir.fhir/r4.Claim | fhir.fhir/r4.ClaimResponse | fhir.fhir/r4.ClinicalImpression | fhir.fhir/r4.CodeSystem | fhir.fhir/r4.Communication | fhir.fhir/r4.CommunicationRequest | fhir.fhir/r4.CompartmentDefinition | fhir.fhir/r4.Composition | fhir.fhir/r4.ConceptMap | fhir.fhir/r4.Condition | fhir.fhir/r4.Consent | fhir.fhir/r4.Contract | fhir.fhir/r4.Coverage | fhir.fhir/r4.CoverageEligibilityRequest | fhir.fhir/r4.CoverageEligibilityResponse | fhir.fhir/r4.DetectedIssue | fhir.fhir/r4.Device | fhir.fhir/r4.DeviceDefinition | fhir.fhir/r4.DeviceMetric | fhir.fhir/r4.DeviceRequest | fhir.fhir/r4.DeviceUseStatement | fhir.fhir/r4.DiagnosticReport | fhir.fhir/r4.DocumentManifest | fhir.fhir/r4.DocumentReference | fhir.fhir/r4.EffectEvidenceSynthesis | fhir.fhir/r4.Encounter | fhir.fhir/r4.Endpoint | fhir.fhir/r4.EnrollmentRequest | fhir.fhir/r4.EnrollmentResponse | fhir.fhir/r4.EpisodeOfCare | fhir.fhir/r4.EventDefinition | fhir.fhir/r4.Evidence | fhir.fhir/r4.EvidenceVariable | fhir.fhir/r4.ExampleScenario | fhir.fhir/r4.ExplanationOfBenefit | fhir.fhir/r4.FamilyMemberHistory | fhir.fhir/r4.Flag | fhir.fhir/r4.Goal | fhir.fhir/r4.GraphDefinition | fhir.fhir/r4.Group | fhir.fhir/r4.GuidanceResponse | fhir.fhir/r4.HealthcareService | fhir.fhir/r4.ImagingStudy | fhir.fhir/r4.Immunization | fhir.fhir/r4.ImmunizationEvaluation | fhir.fhir/r4.ImmunizationRecommendation | fhir.fhir/r4.ImplementationGuide | fhir.fhir/r4.InsurancePlan | fhir.fhir/r4.Invoice | fhir.fhir/r4.Library | fhir.fhir/r4.Linkage | fhir.fhir/r4.List | fhir.fhir/r4.Location | fhir.fhir/r4.Measure | fhir.fhir/r4.MeasureReport | fhir.fhir/r4.Media | fhir.fhir/r4.Medication | fhir.fhir/r4.MedicationAdministration | fhir.fhir/r4.MedicationDispense | fhir.fhir/r4.MedicationKnowledge | fhir.fhir/r4.MedicationRequest | fhir.fhir/r4.MedicationStatement | fhir.fhir/r4.MedicinalProduct | fhir.fhir/r4.MedicinalProductAuthorization | fhir.fhir/r4.MedicinalProductContraindication | fhir.fhir/r4.MedicinalProductIndication | fhir.fhir/r4.MedicinalProductIngredient | fhir.fhir/r4.MedicinalProductInteraction | fhir.fhir/r4.MedicinalProductManufactured | fhir.fhir/r4.MedicinalProductPackaged | fhir.fhir/r4.MedicinalProductPharmaceutical | fhir.fhir/r4.MedicinalProductUndesirableEffect | fhir.fhir/r4.MessageDefinition | fhir.fhir/r4.MessageHeader | fhir.fhir/r4.MolecularSequence | fhir.fhir/r4.NamingSystem | fhir.fhir/r4.NutritionOrder | fhir.fhir/r4.Observation | fhir.fhir/r4.ObservationDefinition | fhir.fhir/r4.OperationDefinition | fhir.fhir/r4.OperationOutcome | fhir.fhir/r4.Organization | fhir.fhir/r4.OrganizationAffiliation | fhir.fhir/r4.Parameters | fhir.fhir/r4.Patient | fhir.fhir/r4.PaymentNotice | fhir.fhir/r4.PaymentReconciliation | fhir.fhir/r4.Person | fhir.fhir/r4.PlanDefinition | fhir.fhir/r4.Practitioner | fhir.fhir/r4.PractitionerRole | fhir.fhir/r4.Procedure | fhir.fhir/r4.Provenance | fhir.fhir/r4.Questionnaire | fhir.fhir/r4.QuestionnaireResponse | fhir.fhir/r4.RelatedPerson | fhir.fhir/r4.RequestGroup | fhir.fhir/r4.ResearchDefinition | fhir.fhir/r4.ResearchElementDefinition | fhir.fhir/r4.ResearchStudy | fhir.fhir/r4.ResearchSubject | fhir.fhir/r4.RiskAssessment | fhir.fhir/r4.RiskEvidenceSynthesis | fhir.fhir/r4.Schedule | fhir.fhir/r4.SearchParameter | fhir.fhir/r4.ServiceRequest | fhir.fhir/r4.Slot | fhir.fhir/r4.Specimen | fhir.fhir/r4.SpecimenDefinition | fhir.fhir/r4.StructureDefinition | fhir.fhir/r4.StructureMap | fhir.fhir/r4.Subscription | fhir.fhir/r4.Substance | fhir.fhir/r4.SubstanceNucleicAcid | fhir.fhir/r4.SubstancePolymer | fhir.fhir/r4.SubstanceProtein | fhir.fhir/r4.SubstanceReferenceInformation | fhir.fhir/r4.SubstanceSourceMaterial | fhir.fhir/r4.SubstanceSpecification | fhir.fhir/r4.SupplyDelivery | fhir.fhir/r4.SupplyRequest | fhir.fhir/r4.Task | fhir.fhir/r4.TerminologyCapabilities | fhir.fhir/r4.TestReport | fhir.fhir/r4.TestScript | fhir.fhir/r4.ValueSet | fhir.fhir/r4.VerificationResult | fhir.fhir/r4.VisionPrescription
}}}
to avoid circular code involving: 
- fhir.fhir/r4.FhirResource
*/
/* Rewritten from type alias, can be one of: 
  - typings.fhir.r4Mod.Account
  - typings.fhir.r4Mod.ActivityDefinition
  - typings.fhir.r4Mod.AdverseEvent
  - typings.fhir.r4Mod.AllergyIntolerance
  - typings.fhir.r4Mod.Appointment
  - typings.fhir.r4Mod.AppointmentResponse
  - typings.fhir.r4Mod.AuditEvent
  - typings.fhir.r4Mod.Basic
  - typings.fhir.r4Mod.Binary
  - typings.fhir.r4Mod.BiologicallyDerivedProduct
  - typings.fhir.r4Mod.BodyStructure
  - typings.fhir.r4Mod.Bundle[scala.Any]
  - typings.fhir.r4Mod.CapabilityStatement
  - typings.fhir.r4Mod.CarePlan
  - typings.fhir.r4Mod.CareTeam
  - typings.fhir.r4Mod.CatalogEntry
  - typings.fhir.r4Mod.ChargeItem
  - typings.fhir.r4Mod.ChargeItemDefinition
  - typings.fhir.r4Mod.Claim
  - typings.fhir.r4Mod.ClaimResponse
  - typings.fhir.r4Mod.ClinicalImpression
  - typings.fhir.r4Mod.CodeSystem
  - typings.fhir.r4Mod.Communication
  - typings.fhir.r4Mod.CommunicationRequest
  - typings.fhir.r4Mod.CompartmentDefinition
  - typings.fhir.r4Mod.Composition
  - typings.fhir.r4Mod.ConceptMap
  - typings.fhir.r4Mod.Condition
  - typings.fhir.r4Mod.Consent
  - typings.fhir.r4Mod.Contract
  - typings.fhir.r4Mod.Coverage
  - typings.fhir.r4Mod.CoverageEligibilityRequest
  - typings.fhir.r4Mod.CoverageEligibilityResponse
  - typings.fhir.r4Mod.DetectedIssue
  - typings.fhir.r4Mod.Device
  - typings.fhir.r4Mod.DeviceDefinition
  - typings.fhir.r4Mod.DeviceMetric
  - typings.fhir.r4Mod.DeviceRequest
  - typings.fhir.r4Mod.DeviceUseStatement
  - typings.fhir.r4Mod.DiagnosticReport
  - typings.fhir.r4Mod.DocumentManifest
  - typings.fhir.r4Mod.DocumentReference
  - typings.fhir.r4Mod.EffectEvidenceSynthesis
  - typings.fhir.r4Mod.Encounter
  - typings.fhir.r4Mod.Endpoint
  - typings.fhir.r4Mod.EnrollmentRequest
  - typings.fhir.r4Mod.EnrollmentResponse
  - typings.fhir.r4Mod.EpisodeOfCare
  - typings.fhir.r4Mod.EventDefinition
  - typings.fhir.r4Mod.Evidence
  - typings.fhir.r4Mod.EvidenceVariable
  - typings.fhir.r4Mod.ExampleScenario
  - typings.fhir.r4Mod.ExplanationOfBenefit
  - typings.fhir.r4Mod.FamilyMemberHistory
  - typings.fhir.r4Mod.Flag
  - typings.fhir.r4Mod.Goal
  - typings.fhir.r4Mod.GraphDefinition
  - typings.fhir.r4Mod.Group
  - typings.fhir.r4Mod.GuidanceResponse
  - typings.fhir.r4Mod.HealthcareService
  - typings.fhir.r4Mod.ImagingStudy
  - typings.fhir.r4Mod.Immunization
  - typings.fhir.r4Mod.ImmunizationEvaluation
  - typings.fhir.r4Mod.ImmunizationRecommendation
  - typings.fhir.r4Mod.ImplementationGuide
  - typings.fhir.r4Mod.InsurancePlan
  - typings.fhir.r4Mod.Invoice
  - typings.fhir.r4Mod.Library
  - typings.fhir.r4Mod.Linkage
  - typings.fhir.r4Mod.List
  - typings.fhir.r4Mod.Location
  - typings.fhir.r4Mod.Measure
  - typings.fhir.r4Mod.MeasureReport
  - typings.fhir.r4Mod.Media
  - typings.fhir.r4Mod.Medication
  - typings.fhir.r4Mod.MedicationAdministration
  - typings.fhir.r4Mod.MedicationDispense
  - typings.fhir.r4Mod.MedicationKnowledge
  - typings.fhir.r4Mod.MedicationRequest
  - typings.fhir.r4Mod.MedicationStatement
  - typings.fhir.r4Mod.MedicinalProduct
  - typings.fhir.r4Mod.MedicinalProductAuthorization
  - typings.fhir.r4Mod.MedicinalProductContraindication
  - typings.fhir.r4Mod.MedicinalProductIndication
  - typings.fhir.r4Mod.MedicinalProductIngredient
  - typings.fhir.r4Mod.MedicinalProductInteraction
  - typings.fhir.r4Mod.MedicinalProductManufactured
  - typings.fhir.r4Mod.MedicinalProductPackaged
  - typings.fhir.r4Mod.MedicinalProductPharmaceutical
  - typings.fhir.r4Mod.MedicinalProductUndesirableEffect
  - typings.fhir.r4Mod.MessageDefinition
  - typings.fhir.r4Mod.MessageHeader
  - typings.fhir.r4Mod.MolecularSequence
  - typings.fhir.r4Mod.NamingSystem
  - typings.fhir.r4Mod.NutritionOrder
  - typings.fhir.r4Mod.Observation
  - typings.fhir.r4Mod.ObservationDefinition
  - typings.fhir.r4Mod.OperationDefinition
  - typings.fhir.r4Mod.OperationOutcome
  - typings.fhir.r4Mod.Organization
  - typings.fhir.r4Mod.OrganizationAffiliation
  - typings.fhir.r4Mod.Parameters
  - typings.fhir.r4Mod.Patient
  - typings.fhir.r4Mod.PaymentNotice
  - typings.fhir.r4Mod.PaymentReconciliation
  - typings.fhir.r4Mod.Person
  - typings.fhir.r4Mod.PlanDefinition
  - typings.fhir.r4Mod.Practitioner
  - typings.fhir.r4Mod.PractitionerRole
  - typings.fhir.r4Mod.Procedure
  - typings.fhir.r4Mod.Provenance
  - typings.fhir.r4Mod.Questionnaire
  - typings.fhir.r4Mod.QuestionnaireResponse
  - typings.fhir.r4Mod.RelatedPerson
  - typings.fhir.r4Mod.RequestGroup
  - typings.fhir.r4Mod.ResearchDefinition
  - typings.fhir.r4Mod.ResearchElementDefinition
  - typings.fhir.r4Mod.ResearchStudy
  - typings.fhir.r4Mod.ResearchSubject
  - typings.fhir.r4Mod.RiskAssessment
  - typings.fhir.r4Mod.RiskEvidenceSynthesis
  - typings.fhir.r4Mod.Schedule
  - typings.fhir.r4Mod.SearchParameter
  - typings.fhir.r4Mod.ServiceRequest
  - typings.fhir.r4Mod.Slot
  - typings.fhir.r4Mod.Specimen
  - typings.fhir.r4Mod.SpecimenDefinition
  - typings.fhir.r4Mod.StructureDefinition
  - typings.fhir.r4Mod.StructureMap
  - typings.fhir.r4Mod.Subscription
  - typings.fhir.r4Mod.Substance
  - typings.fhir.r4Mod.SubstanceNucleicAcid
  - typings.fhir.r4Mod.SubstancePolymer
  - typings.fhir.r4Mod.SubstanceProtein
  - typings.fhir.r4Mod.SubstanceReferenceInformation
  - typings.fhir.r4Mod.SubstanceSourceMaterial
  - typings.fhir.r4Mod.SubstanceSpecification
  - typings.fhir.r4Mod.SupplyDelivery
  - typings.fhir.r4Mod.SupplyRequest
  - typings.fhir.r4Mod.Task
  - typings.fhir.r4Mod.TerminologyCapabilities
  - typings.fhir.r4Mod.TestReport
  - typings.fhir.r4Mod.TestScript
  - typings.fhir.r4Mod.ValueSet
  - typings.fhir.r4Mod.VerificationResult
  - typings.fhir.r4Mod.VisionPrescription
*/
type FhirResource = _FhirResource | Bundle[Any]
