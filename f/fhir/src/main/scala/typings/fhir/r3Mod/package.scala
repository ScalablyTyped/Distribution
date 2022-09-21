package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Age = Quantity

type Count = Quantity

type Distance = Quantity

type Duration = Quantity

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
