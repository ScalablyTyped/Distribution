package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Age = Quantity

type Count = Quantity

type DataType = Element

type Distance = Quantity

type Duration = Quantity

/* Rewritten from type alias, can be one of: 
  - typings.fhir.r4Mod.Account
  - typings.fhir.r4Mod.ActivityDefinition
  - typings.fhir.r4Mod.AdministrableProductDefinition
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
  - typings.fhir.r4Mod.Citation
  - typings.fhir.r4Mod.Claim
  - typings.fhir.r4Mod.ClaimResponse
  - typings.fhir.r4Mod.ClinicalImpression
  - typings.fhir.r4Mod.ClinicalUseDefinition
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
  - typings.fhir.r4Mod.Encounter
  - typings.fhir.r4Mod.Endpoint
  - typings.fhir.r4Mod.EnrollmentRequest
  - typings.fhir.r4Mod.EnrollmentResponse
  - typings.fhir.r4Mod.EpisodeOfCare
  - typings.fhir.r4Mod.EventDefinition
  - typings.fhir.r4Mod.Evidence
  - typings.fhir.r4Mod.EvidenceReport
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
  - typings.fhir.r4Mod.Ingredient
  - typings.fhir.r4Mod.InsurancePlan
  - typings.fhir.r4Mod.Invoice
  - typings.fhir.r4Mod.Library
  - typings.fhir.r4Mod.Linkage
  - typings.fhir.r4Mod.List
  - typings.fhir.r4Mod.Location
  - typings.fhir.r4Mod.ManufacturedItemDefinition
  - typings.fhir.r4Mod.Measure
  - typings.fhir.r4Mod.MeasureReport
  - typings.fhir.r4Mod.Media
  - typings.fhir.r4Mod.Medication
  - typings.fhir.r4Mod.MedicationAdministration
  - typings.fhir.r4Mod.MedicationDispense
  - typings.fhir.r4Mod.MedicationKnowledge
  - typings.fhir.r4Mod.MedicationRequest
  - typings.fhir.r4Mod.MedicationStatement
  - typings.fhir.r4Mod.MedicinalProductDefinition
  - typings.fhir.r4Mod.MessageDefinition
  - typings.fhir.r4Mod.MessageHeader
  - typings.fhir.r4Mod.MolecularSequence
  - typings.fhir.r4Mod.NamingSystem
  - typings.fhir.r4Mod.NutritionOrder
  - typings.fhir.r4Mod.NutritionProduct
  - typings.fhir.r4Mod.Observation
  - typings.fhir.r4Mod.ObservationDefinition
  - typings.fhir.r4Mod.OperationDefinition
  - typings.fhir.r4Mod.OperationOutcome
  - typings.fhir.r4Mod.Organization
  - typings.fhir.r4Mod.OrganizationAffiliation
  - typings.fhir.r4Mod.PackagedProductDefinition
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
  - typings.fhir.r4Mod.RegulatedAuthorization
  - typings.fhir.r4Mod.RelatedPerson
  - typings.fhir.r4Mod.RequestGroup
  - typings.fhir.r4Mod.ResearchDefinition
  - typings.fhir.r4Mod.ResearchElementDefinition
  - typings.fhir.r4Mod.ResearchStudy
  - typings.fhir.r4Mod.ResearchSubject
  - typings.fhir.r4Mod.RiskAssessment
  - typings.fhir.r4Mod.Schedule
  - typings.fhir.r4Mod.SearchParameter
  - typings.fhir.r4Mod.ServiceRequest
  - typings.fhir.r4Mod.Slot
  - typings.fhir.r4Mod.Specimen
  - typings.fhir.r4Mod.SpecimenDefinition
  - typings.fhir.r4Mod.StructureDefinition
  - typings.fhir.r4Mod.StructureMap
  - typings.fhir.r4Mod.Subscription
  - typings.fhir.r4Mod.SubscriptionStatus
  - typings.fhir.r4Mod.SubscriptionTopic
  - typings.fhir.r4Mod.Substance
  - typings.fhir.r4Mod.SubstanceDefinition
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
