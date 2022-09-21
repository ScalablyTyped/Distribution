package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Age = Quantity

type Count = Quantity

type DataType = Element

type Distance = Quantity

type Duration = Quantity

/* Rewritten from type alias, can be one of: 
  - typings.fhir.r5Mod.Account
  - typings.fhir.r5Mod.ActivityDefinition
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
  - typings.fhir.r5Mod.BodyStructure
  - typings.fhir.r5Mod.Bundle[scala.Any]
  - typings.fhir.r5Mod.CapabilityStatement
  - typings.fhir.r5Mod.CapabilityStatement2
  - typings.fhir.r5Mod.CarePlan
  - typings.fhir.r5Mod.CareTeam
  - typings.fhir.r5Mod.ChargeItem
  - typings.fhir.r5Mod.ChargeItemDefinition
  - typings.fhir.r5Mod.Citation
  - typings.fhir.r5Mod.Claim
  - typings.fhir.r5Mod.ClaimResponse
  - typings.fhir.r5Mod.ClinicalImpression
  - typings.fhir.r5Mod.ClinicalUseDefinition
  - typings.fhir.r5Mod.ClinicalUseIssue
  - typings.fhir.r5Mod.CodeSystem
  - typings.fhir.r5Mod.Communication
  - typings.fhir.r5Mod.CommunicationRequest
  - typings.fhir.r5Mod.CompartmentDefinition
  - typings.fhir.r5Mod.Composition
  - typings.fhir.r5Mod.ConceptMap
  - typings.fhir.r5Mod.ConceptMap2
  - typings.fhir.r5Mod.Condition
  - typings.fhir.r5Mod.ConditionDefinition
  - typings.fhir.r5Mod.Consent
  - typings.fhir.r5Mod.Contract
  - typings.fhir.r5Mod.Coverage
  - typings.fhir.r5Mod.CoverageEligibilityRequest
  - typings.fhir.r5Mod.CoverageEligibilityResponse
  - typings.fhir.r5Mod.DetectedIssue
  - typings.fhir.r5Mod.Device
  - typings.fhir.r5Mod.DeviceDefinition
  - typings.fhir.r5Mod.DeviceDispense
  - typings.fhir.r5Mod.DeviceMetric
  - typings.fhir.r5Mod.DeviceRequest
  - typings.fhir.r5Mod.DeviceUsage
  - typings.fhir.r5Mod.DiagnosticReport
  - typings.fhir.r5Mod.DocumentManifest
  - typings.fhir.r5Mod.DocumentReference
  - typings.fhir.r5Mod.Encounter
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
  - typings.fhir.r5Mod.MedicationUsage
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
  - typings.fhir.r5Mod.RequestGroup
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
  - typings.fhir.r5Mod.TestReport
  - typings.fhir.r5Mod.TestScript
  - typings.fhir.r5Mod.ValueSet
  - typings.fhir.r5Mod.VerificationResult
  - typings.fhir.r5Mod.VisionPrescription
*/
type FhirResource = _FhirResource | Bundle[Any]

type PrimitiveType = DataType
