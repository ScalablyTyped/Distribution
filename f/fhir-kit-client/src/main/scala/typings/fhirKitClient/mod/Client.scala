package typings.fhirKitClient.mod

import typings.fhir.fhir.Account
import typings.fhir.fhir.ActivityDefinition
import typings.fhir.fhir.AdverseEvent
import typings.fhir.fhir.AllergyIntolerance
import typings.fhir.fhir.Appointment
import typings.fhir.fhir.AppointmentResponse
import typings.fhir.fhir.AuditEvent
import typings.fhir.fhir.Basic
import typings.fhir.fhir.Binary
import typings.fhir.fhir.BodySite
import typings.fhir.fhir.Bundle
import typings.fhir.fhir.CapabilityStatement
import typings.fhir.fhir.CarePlan
import typings.fhir.fhir.CareTeam
import typings.fhir.fhir.ChargeItem
import typings.fhir.fhir.Claim
import typings.fhir.fhir.ClaimResponse
import typings.fhir.fhir.ClinicalImpression
import typings.fhir.fhir.CodeSystem
import typings.fhir.fhir.Communication
import typings.fhir.fhir.CommunicationRequest
import typings.fhir.fhir.CompartmentDefinition
import typings.fhir.fhir.Composition
import typings.fhir.fhir.ConceptMap
import typings.fhir.fhir.Condition
import typings.fhir.fhir.Consent
import typings.fhir.fhir.Contract
import typings.fhir.fhir.Coverage
import typings.fhir.fhir.DataElement
import typings.fhir.fhir.DetectedIssue
import typings.fhir.fhir.Device
import typings.fhir.fhir.DeviceComponent
import typings.fhir.fhir.DeviceMetric
import typings.fhir.fhir.DeviceRequest
import typings.fhir.fhir.DeviceUseStatement
import typings.fhir.fhir.DiagnosticReport
import typings.fhir.fhir.DocumentManifest
import typings.fhir.fhir.DocumentReference
import typings.fhir.fhir.DomainResource
import typings.fhir.fhir.EligibilityRequest
import typings.fhir.fhir.EligibilityResponse
import typings.fhir.fhir.Encounter
import typings.fhir.fhir.Endpoint
import typings.fhir.fhir.EnrollmentRequest
import typings.fhir.fhir.EnrollmentResponse
import typings.fhir.fhir.EpisodeOfCare
import typings.fhir.fhir.ExpansionProfile
import typings.fhir.fhir.ExplanationOfBenefit
import typings.fhir.fhir.FamilyMemberHistory
import typings.fhir.fhir.Flag
import typings.fhir.fhir.Goal
import typings.fhir.fhir.GraphDefinition
import typings.fhir.fhir.Group
import typings.fhir.fhir.GuidanceResponse
import typings.fhir.fhir.HealthcareService
import typings.fhir.fhir.ImagingManifest
import typings.fhir.fhir.ImagingStudy
import typings.fhir.fhir.Immunization
import typings.fhir.fhir.ImmunizationRecommendation
import typings.fhir.fhir.ImplementationGuide
import typings.fhir.fhir.Library
import typings.fhir.fhir.Linkage
import typings.fhir.fhir.List
import typings.fhir.fhir.Location
import typings.fhir.fhir.Measure
import typings.fhir.fhir.MeasureReport
import typings.fhir.fhir.Media
import typings.fhir.fhir.Medication
import typings.fhir.fhir.MedicationAdministration
import typings.fhir.fhir.MedicationDispense
import typings.fhir.fhir.MedicationRequest
import typings.fhir.fhir.MedicationStatement
import typings.fhir.fhir.MessageDefinition
import typings.fhir.fhir.MessageHeader
import typings.fhir.fhir.NamingSystem
import typings.fhir.fhir.NutritionOrder
import typings.fhir.fhir.Observation
import typings.fhir.fhir.OperationDefinition
import typings.fhir.fhir.OperationOutcome
import typings.fhir.fhir.Organization
import typings.fhir.fhir.Parameters
import typings.fhir.fhir.Patient
import typings.fhir.fhir.PaymentNotice
import typings.fhir.fhir.PaymentReconciliation
import typings.fhir.fhir.Person
import typings.fhir.fhir.PlanDefinition
import typings.fhir.fhir.Practitioner
import typings.fhir.fhir.PractitionerRole
import typings.fhir.fhir.Procedure
import typings.fhir.fhir.ProcedureRequest
import typings.fhir.fhir.ProcessRequest
import typings.fhir.fhir.ProcessResponse
import typings.fhir.fhir.Provenance
import typings.fhir.fhir.Questionnaire
import typings.fhir.fhir.QuestionnaireResponse
import typings.fhir.fhir.ReferralRequest
import typings.fhir.fhir.RelatedPerson
import typings.fhir.fhir.RequestGroup
import typings.fhir.fhir.ResearchStudy
import typings.fhir.fhir.ResearchSubject
import typings.fhir.fhir.RiskAssessment
import typings.fhir.fhir.Schedule
import typings.fhir.fhir.SearchParameter
import typings.fhir.fhir.Sequence
import typings.fhir.fhir.ServiceDefinition
import typings.fhir.fhir.Slot
import typings.fhir.fhir.Specimen
import typings.fhir.fhir.StructureDefinition
import typings.fhir.fhir.StructureMap
import typings.fhir.fhir.Subscription
import typings.fhir.fhir.Substance
import typings.fhir.fhir.SupplyDelivery
import typings.fhir.fhir.SupplyRequest
import typings.fhir.fhir.Task
import typings.fhir.fhir.TestReport
import typings.fhir.fhir.TestScript
import typings.fhir.fhir.ValueSet
import typings.fhir.fhir.VisionPrescription
import typings.fhirKitClient.AnonAccount
import typings.fhirKitClient.AnonAccountBody
import typings.fhirKitClient.AnonAccountBodyHeaders
import typings.fhirKitClient.AnonAccountHeaders
import typings.fhirKitClient.AnonActivityDefinition
import typings.fhirKitClient.AnonActivityDefinitionBody
import typings.fhirKitClient.AnonActivityDefinitionBodyHeaders
import typings.fhirKitClient.AnonActivityDefinitionHeaders
import typings.fhirKitClient.AnonAdverseEvent
import typings.fhirKitClient.AnonAdverseEventBody
import typings.fhirKitClient.AnonAdverseEventBodyHeaders
import typings.fhirKitClient.AnonAdverseEventHeaders
import typings.fhirKitClient.AnonAllergyIntolerance
import typings.fhirKitClient.AnonAllergyIntoleranceBody
import typings.fhirKitClient.AnonAllergyIntoleranceBodyHeaders
import typings.fhirKitClient.AnonAllergyIntoleranceHeaders
import typings.fhirKitClient.AnonAppointment
import typings.fhirKitClient.AnonAppointmentBody
import typings.fhirKitClient.AnonAppointmentBodyHeaders
import typings.fhirKitClient.AnonAppointmentHeaders
import typings.fhirKitClient.AnonAppointmentResponse
import typings.fhirKitClient.AnonAppointmentResponseBody
import typings.fhirKitClient.AnonAppointmentResponseBodyHeaders
import typings.fhirKitClient.AnonAppointmentResponseHeaders
import typings.fhirKitClient.AnonAuditEvent
import typings.fhirKitClient.AnonAuditEventBody
import typings.fhirKitClient.AnonAuditEventBodyHeaders
import typings.fhirKitClient.AnonAuditEventHeaders
import typings.fhirKitClient.AnonBasic
import typings.fhirKitClient.AnonBasicBody
import typings.fhirKitClient.AnonBasicBodyHeaders
import typings.fhirKitClient.AnonBasicHeaders
import typings.fhirKitClient.AnonBatchresponse
import typings.fhirKitClient.AnonBinary
import typings.fhirKitClient.AnonBinaryBody
import typings.fhirKitClient.AnonBinaryBodyHeaders
import typings.fhirKitClient.AnonBinaryHeaders
import typings.fhirKitClient.AnonBody
import typings.fhirKitClient.AnonBodyBodySite
import typings.fhirKitClient.AnonBodyBundle
import typings.fhirKitClient.AnonBodyBundleHeaders
import typings.fhirKitClient.AnonBodyCapabilityStatement
import typings.fhirKitClient.AnonBodyCapabilityStatementHeaders
import typings.fhirKitClient.AnonBodyCarePlan
import typings.fhirKitClient.AnonBodyCarePlanHeaders
import typings.fhirKitClient.AnonBodyCareTeam
import typings.fhirKitClient.AnonBodyCareTeamHeaders
import typings.fhirKitClient.AnonBodyChargeItem
import typings.fhirKitClient.AnonBodyChargeItemHeaders
import typings.fhirKitClient.AnonBodyClaim
import typings.fhirKitClient.AnonBodyClaimHeaders
import typings.fhirKitClient.AnonBodyClaimResponse
import typings.fhirKitClient.AnonBodyClaimResponseHeaders
import typings.fhirKitClient.AnonBodyClinicalImpression
import typings.fhirKitClient.AnonBodyClinicalImpressionHeaders
import typings.fhirKitClient.AnonBodyCodeSystem
import typings.fhirKitClient.AnonBodyCodeSystemHeaders
import typings.fhirKitClient.AnonBodyCommunication
import typings.fhirKitClient.AnonBodyCommunicationHeaders
import typings.fhirKitClient.AnonBodyCommunicationRequest
import typings.fhirKitClient.AnonBodyCommunicationRequestHeaders
import typings.fhirKitClient.AnonBodyCompartmentDefinition
import typings.fhirKitClient.AnonBodyCompartmentDefinitionHeaders
import typings.fhirKitClient.AnonBodyComposition
import typings.fhirKitClient.AnonBodyCompositionHeaders
import typings.fhirKitClient.AnonBodyConceptMap
import typings.fhirKitClient.AnonBodyConceptMapHeaders
import typings.fhirKitClient.AnonBodyCondition
import typings.fhirKitClient.AnonBodyConditionHeaders
import typings.fhirKitClient.AnonBodyConsent
import typings.fhirKitClient.AnonBodyConsentHeaders
import typings.fhirKitClient.AnonBodyContract
import typings.fhirKitClient.AnonBodyContractHeaders
import typings.fhirKitClient.AnonBodyCoverage
import typings.fhirKitClient.AnonBodyCoverageHeaders
import typings.fhirKitClient.AnonBodyDataElement
import typings.fhirKitClient.AnonBodyDataElementHeaders
import typings.fhirKitClient.AnonBodyDetectedIssue
import typings.fhirKitClient.AnonBodyDetectedIssueHeaders
import typings.fhirKitClient.AnonBodyDevice
import typings.fhirKitClient.AnonBodyDeviceComponent
import typings.fhirKitClient.AnonBodyDeviceComponentHeaders
import typings.fhirKitClient.AnonBodyDeviceHeaders
import typings.fhirKitClient.AnonBodyDeviceMetric
import typings.fhirKitClient.AnonBodyDeviceMetricHeaders
import typings.fhirKitClient.AnonBodyDeviceRequest
import typings.fhirKitClient.AnonBodyDeviceRequestHeaders
import typings.fhirKitClient.AnonBodyDeviceUseStatement
import typings.fhirKitClient.AnonBodyDeviceUseStatementHeaders
import typings.fhirKitClient.AnonBodyDiagnosticReport
import typings.fhirKitClient.AnonBodyDiagnosticReportHeaders
import typings.fhirKitClient.AnonBodyDocumentManifest
import typings.fhirKitClient.AnonBodyDocumentManifestHeaders
import typings.fhirKitClient.AnonBodyDocumentReference
import typings.fhirKitClient.AnonBodyDocumentReferenceHeaders
import typings.fhirKitClient.AnonBodyDomainResource
import typings.fhirKitClient.AnonBodyDomainResourceHeaders
import typings.fhirKitClient.AnonBodyEligibilityRequest
import typings.fhirKitClient.AnonBodyEligibilityRequestHeaders
import typings.fhirKitClient.AnonBodyEligibilityResponse
import typings.fhirKitClient.AnonBodyEligibilityResponseHeaders
import typings.fhirKitClient.AnonBodyEncounter
import typings.fhirKitClient.AnonBodyEncounterHeaders
import typings.fhirKitClient.AnonBodyEndpoint
import typings.fhirKitClient.AnonBodyEndpointHeaders
import typings.fhirKitClient.AnonBodyEnrollmentRequest
import typings.fhirKitClient.AnonBodyEnrollmentRequestHeaders
import typings.fhirKitClient.AnonBodyEnrollmentResponse
import typings.fhirKitClient.AnonBodyEnrollmentResponseHeaders
import typings.fhirKitClient.AnonBodyEpisodeOfCare
import typings.fhirKitClient.AnonBodyEpisodeOfCareHeaders
import typings.fhirKitClient.AnonBodyExpansionProfile
import typings.fhirKitClient.AnonBodyExpansionProfileHeaders
import typings.fhirKitClient.AnonBodyExplanationOfBenefit
import typings.fhirKitClient.AnonBodyExplanationOfBenefitHeaders
import typings.fhirKitClient.AnonBodyFamilyMemberHistory
import typings.fhirKitClient.AnonBodyFamilyMemberHistoryHeaders
import typings.fhirKitClient.AnonBodyFlag
import typings.fhirKitClient.AnonBodyFlagHeaders
import typings.fhirKitClient.AnonBodyGoal
import typings.fhirKitClient.AnonBodyGoalHeaders
import typings.fhirKitClient.AnonBodyGraphDefinition
import typings.fhirKitClient.AnonBodyGraphDefinitionHeaders
import typings.fhirKitClient.AnonBodyGroup
import typings.fhirKitClient.AnonBodyGroupHeaders
import typings.fhirKitClient.AnonBodyGuidanceResponse
import typings.fhirKitClient.AnonBodyGuidanceResponseHeaders
import typings.fhirKitClient.AnonBodyHeaders
import typings.fhirKitClient.AnonBodyHeadersHealthcareService
import typings.fhirKitClient.AnonBodyHeadersId
import typings.fhirKitClient.AnonBodyHeadersIdImagingStudy
import typings.fhirKitClient.AnonBodyHeadersIdImmunization
import typings.fhirKitClient.AnonBodyHeadersIdImmunizationRecommendation
import typings.fhirKitClient.AnonBodyHeadersIdImplementationGuide
import typings.fhirKitClient.AnonBodyHeadersIdLibrary
import typings.fhirKitClient.AnonBodyHeadersIdLinkage
import typings.fhirKitClient.AnonBodyHeadersIdList
import typings.fhirKitClient.AnonBodyHeadersIdLocation
import typings.fhirKitClient.AnonBodyHeadersIdMeasure
import typings.fhirKitClient.AnonBodyHeadersIdMeasureReport
import typings.fhirKitClient.AnonBodyHeadersIdMedia
import typings.fhirKitClient.AnonBodyHeadersIdMedication
import typings.fhirKitClient.AnonBodyHeadersIdMedicationAdministration
import typings.fhirKitClient.AnonBodyHeadersIdMedicationDispense
import typings.fhirKitClient.AnonBodyHeadersIdMedicationRequest
import typings.fhirKitClient.AnonBodyHeadersIdMedicationStatement
import typings.fhirKitClient.AnonBodyHeadersIdMessageDefinition
import typings.fhirKitClient.AnonBodyHeadersIdMessageHeader
import typings.fhirKitClient.AnonBodyHeadersIdNamingSystem
import typings.fhirKitClient.AnonBodyHeadersIdNutritionOrder
import typings.fhirKitClient.AnonBodyHeadersIdObservation
import typings.fhirKitClient.AnonBodyHeadersIdOperationDefinition
import typings.fhirKitClient.AnonBodyHeadersIdOperationOutcome
import typings.fhirKitClient.AnonBodyHeadersIdOptions
import typings.fhirKitClient.AnonBodyHeadersIdOptionsParameters
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPatient
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPaymentNotice
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPaymentReconciliation
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPerson
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPlanDefinition
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPractitioner
import typings.fhirKitClient.AnonBodyHeadersIdOptionsPractitionerRole
import typings.fhirKitClient.AnonBodyHeadersIdOptionsProcedure
import typings.fhirKitClient.AnonBodyHeadersIdOptionsProcedureRequest
import typings.fhirKitClient.AnonBodyHeadersIdOptionsProcessRequest
import typings.fhirKitClient.AnonBodyHeadersIdOptionsProcessResponse
import typings.fhirKitClient.AnonBodyHeadersIdOptionsProvenance
import typings.fhirKitClient.AnonBodyHeadersIdOptionsQuestionnaire
import typings.fhirKitClient.AnonBodyHeadersIdOptionsQuestionnaireResponse
import typings.fhirKitClient.AnonBodyHeadersIdOptionsReferralRequest
import typings.fhirKitClient.AnonBodyHeadersIdOptionsRelatedPerson
import typings.fhirKitClient.AnonBodyHeadersIdOptionsRequestGroup
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResearchStudy
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResearchSubject
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceType
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeCustomResourceType
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSchedule
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSearchParameter
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSequence
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeServiceDefinition
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSlot
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSpecimen
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeStructureDefinition
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeStructureMap
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSubscription
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSubstance
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSupplyDelivery
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeSupplyRequest
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeTask
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeTestReport
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeTestScript
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeValueSet
import typings.fhirKitClient.AnonBodyHeadersIdOptionsResourceTypeVisionPrescription
import typings.fhirKitClient.AnonBodyHeadersImagingManifest
import typings.fhirKitClient.AnonBodyHeadersImagingStudy
import typings.fhirKitClient.AnonBodyHeadersImmunization
import typings.fhirKitClient.AnonBodyHeadersImmunizationRecommendation
import typings.fhirKitClient.AnonBodyHeadersImplementationGuide
import typings.fhirKitClient.AnonBodyHeadersLibrary
import typings.fhirKitClient.AnonBodyHeadersLinkage
import typings.fhirKitClient.AnonBodyHeadersList
import typings.fhirKitClient.AnonBodyHeadersLocation
import typings.fhirKitClient.AnonBodyHeadersMeasure
import typings.fhirKitClient.AnonBodyHeadersMeasureReport
import typings.fhirKitClient.AnonBodyHeadersMedia
import typings.fhirKitClient.AnonBodyHeadersMedication
import typings.fhirKitClient.AnonBodyHeadersMedicationAdministration
import typings.fhirKitClient.AnonBodyHeadersMedicationDispense
import typings.fhirKitClient.AnonBodyHeadersMedicationRequest
import typings.fhirKitClient.AnonBodyHeadersMedicationStatement
import typings.fhirKitClient.AnonBodyHeadersMessageDefinition
import typings.fhirKitClient.AnonBodyHeadersMessageHeader
import typings.fhirKitClient.AnonBodyHeadersNamingSystem
import typings.fhirKitClient.AnonBodyHeadersNutritionOrder
import typings.fhirKitClient.AnonBodyHeadersObservation
import typings.fhirKitClient.AnonBodyHeadersOperationDefinition
import typings.fhirKitClient.AnonBodyHeadersOperationOutcome
import typings.fhirKitClient.AnonBodyHeadersOptions
import typings.fhirKitClient.AnonBodyHeadersOptionsAnonBatch
import typings.fhirKitClient.AnonBodyHeadersOptionsAnonTransaction
import typings.fhirKitClient.AnonBodyHeadersOptionsParameters
import typings.fhirKitClient.AnonBodyHeadersOptionsPatient
import typings.fhirKitClient.AnonBodyHeadersOptionsPaymentNotice
import typings.fhirKitClient.AnonBodyHeadersOptionsPaymentReconciliation
import typings.fhirKitClient.AnonBodyHeadersOptionsPerson
import typings.fhirKitClient.AnonBodyHeadersOptionsPlanDefinition
import typings.fhirKitClient.AnonBodyHeadersOptionsPractitioner
import typings.fhirKitClient.AnonBodyHeadersOptionsPractitionerRole
import typings.fhirKitClient.AnonBodyHeadersOptionsProcedure
import typings.fhirKitClient.AnonBodyHeadersOptionsProcedureRequest
import typings.fhirKitClient.AnonBodyHeadersOptionsProcessRequest
import typings.fhirKitClient.AnonBodyHeadersOptionsProcessResponse
import typings.fhirKitClient.AnonBodyHeadersOptionsProvenance
import typings.fhirKitClient.AnonBodyHeadersOptionsQuestionnaire
import typings.fhirKitClient.AnonBodyHeadersOptionsQuestionnaireResponse
import typings.fhirKitClient.AnonBodyHeadersOptionsReferralRequest
import typings.fhirKitClient.AnonBodyHeadersOptionsRelatedPerson
import typings.fhirKitClient.AnonBodyHeadersOptionsRequestGroup
import typings.fhirKitClient.AnonBodyHeadersOptionsResearchStudy
import typings.fhirKitClient.AnonBodyHeadersOptionsResearchSubject
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceType
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeCustomResourceType
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSchedule
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSearchParameter
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSequence
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeServiceDefinition
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSlot
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSpecimen
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeStructureDefinition
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeStructureMap
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSubscription
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSubstance
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSupplyDelivery
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeSupplyRequest
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeTask
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeTestReport
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeTestScript
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeValueSet
import typings.fhirKitClient.AnonBodyHeadersOptionsResourceTypeVisionPrescription
import typings.fhirKitClient.AnonBodySite
import typings.fhirKitClient.AnonBodySiteHeaders
import typings.fhirKitClient.AnonBundle
import typings.fhirKitClient.AnonBundleHeaders
import typings.fhirKitClient.AnonBundleOptions
import typings.fhirKitClient.AnonCapabilityStatement
import typings.fhirKitClient.AnonCapabilityStatementHeaders
import typings.fhirKitClient.AnonCarePlan
import typings.fhirKitClient.AnonCarePlanHeaders
import typings.fhirKitClient.AnonCareTeam
import typings.fhirKitClient.AnonCareTeamHeaders
import typings.fhirKitClient.AnonChargeItem
import typings.fhirKitClient.AnonChargeItemHeaders
import typings.fhirKitClient.AnonClaim
import typings.fhirKitClient.AnonClaimHeaders
import typings.fhirKitClient.AnonClaimResponse
import typings.fhirKitClient.AnonClaimResponseHeaders
import typings.fhirKitClient.AnonClinicalImpression
import typings.fhirKitClient.AnonClinicalImpressionHeaders
import typings.fhirKitClient.AnonCodeSystem
import typings.fhirKitClient.AnonCodeSystemHeaders
import typings.fhirKitClient.AnonCommunication
import typings.fhirKitClient.AnonCommunicationHeaders
import typings.fhirKitClient.AnonCommunicationRequest
import typings.fhirKitClient.AnonCommunicationRequestHeaders
import typings.fhirKitClient.AnonCompartment
import typings.fhirKitClient.AnonCompartmentDefinition
import typings.fhirKitClient.AnonCompartmentDefinitionHeaders
import typings.fhirKitClient.AnonCompartmentHeaders
import typings.fhirKitClient.AnonComposition
import typings.fhirKitClient.AnonCompositionHeaders
import typings.fhirKitClient.AnonConceptMap
import typings.fhirKitClient.AnonConceptMapHeaders
import typings.fhirKitClient.AnonCondition
import typings.fhirKitClient.AnonConditionHeaders
import typings.fhirKitClient.AnonConsent
import typings.fhirKitClient.AnonConsentHeaders
import typings.fhirKitClient.AnonContext
import typings.fhirKitClient.AnonContract
import typings.fhirKitClient.AnonContractHeaders
import typings.fhirKitClient.AnonCoverage
import typings.fhirKitClient.AnonCoverageHeaders
import typings.fhirKitClient.AnonDataElement
import typings.fhirKitClient.AnonDataElementHeaders
import typings.fhirKitClient.AnonDetectedIssue
import typings.fhirKitClient.AnonDetectedIssueHeaders
import typings.fhirKitClient.AnonDevice
import typings.fhirKitClient.AnonDeviceComponent
import typings.fhirKitClient.AnonDeviceComponentHeaders
import typings.fhirKitClient.AnonDeviceHeaders
import typings.fhirKitClient.AnonDeviceMetric
import typings.fhirKitClient.AnonDeviceMetricHeaders
import typings.fhirKitClient.AnonDeviceRequest
import typings.fhirKitClient.AnonDeviceRequestHeaders
import typings.fhirKitClient.AnonDeviceUseStatement
import typings.fhirKitClient.AnonDeviceUseStatementHeaders
import typings.fhirKitClient.AnonDiagnosticReport
import typings.fhirKitClient.AnonDiagnosticReportHeaders
import typings.fhirKitClient.AnonDocumentManifest
import typings.fhirKitClient.AnonDocumentManifestHeaders
import typings.fhirKitClient.AnonDocumentReference
import typings.fhirKitClient.AnonDocumentReferenceHeaders
import typings.fhirKitClient.AnonDomainResource
import typings.fhirKitClient.AnonDomainResourceHeaders
import typings.fhirKitClient.AnonEligibilityRequest
import typings.fhirKitClient.AnonEligibilityRequestHeaders
import typings.fhirKitClient.AnonEligibilityResponse
import typings.fhirKitClient.AnonEligibilityResponseHeaders
import typings.fhirKitClient.AnonEncounter
import typings.fhirKitClient.AnonEncounterHeaders
import typings.fhirKitClient.AnonEndpoint
import typings.fhirKitClient.AnonEndpointHeaders
import typings.fhirKitClient.AnonEnrollmentRequest
import typings.fhirKitClient.AnonEnrollmentRequestHeaders
import typings.fhirKitClient.AnonEnrollmentResponse
import typings.fhirKitClient.AnonEnrollmentResponseHeaders
import typings.fhirKitClient.AnonEpisodeOfCare
import typings.fhirKitClient.AnonEpisodeOfCareHeaders
import typings.fhirKitClient.AnonExpansionProfile
import typings.fhirKitClient.AnonExpansionProfileHeaders
import typings.fhirKitClient.AnonExplanationOfBenefit
import typings.fhirKitClient.AnonExplanationOfBenefitHeaders
import typings.fhirKitClient.AnonFamilyMemberHistory
import typings.fhirKitClient.AnonFamilyMemberHistoryHeaders
import typings.fhirKitClient.AnonFlag
import typings.fhirKitClient.AnonFlagHeaders
import typings.fhirKitClient.AnonGoal
import typings.fhirKitClient.AnonGoalHeaders
import typings.fhirKitClient.AnonGraphDefinition
import typings.fhirKitClient.AnonGraphDefinitionHeaders
import typings.fhirKitClient.AnonGroup
import typings.fhirKitClient.AnonGroupHeaders
import typings.fhirKitClient.AnonGuidanceResponse
import typings.fhirKitClient.AnonGuidanceResponseHeaders
import typings.fhirKitClient.AnonHeaders
import typings.fhirKitClient.AnonHeadersHealthcareService
import typings.fhirKitClient.AnonHeadersHealthcareServiceId
import typings.fhirKitClient.AnonHeadersId
import typings.fhirKitClient.AnonHeadersIdImagingManifest
import typings.fhirKitClient.AnonHeadersIdImagingStudy
import typings.fhirKitClient.AnonHeadersIdImagingStudyJSONPatch
import typings.fhirKitClient.AnonHeadersIdImmunization
import typings.fhirKitClient.AnonHeadersIdImmunizationJSONPatch
import typings.fhirKitClient.AnonHeadersIdImmunizationRecommendation
import typings.fhirKitClient.AnonHeadersIdImmunizationRecommendationJSONPatch
import typings.fhirKitClient.AnonHeadersIdImplementationGuide
import typings.fhirKitClient.AnonHeadersIdImplementationGuideJSONPatch
import typings.fhirKitClient.AnonHeadersIdJSONPatch
import typings.fhirKitClient.AnonHeadersIdJSONPatchLinkage
import typings.fhirKitClient.AnonHeadersIdJSONPatchList
import typings.fhirKitClient.AnonHeadersIdJSONPatchLocation
import typings.fhirKitClient.AnonHeadersIdJSONPatchMeasure
import typings.fhirKitClient.AnonHeadersIdJSONPatchMeasureReport
import typings.fhirKitClient.AnonHeadersIdJSONPatchMedia
import typings.fhirKitClient.AnonHeadersIdJSONPatchMedication
import typings.fhirKitClient.AnonHeadersIdJSONPatchMedicationAdministration
import typings.fhirKitClient.AnonHeadersIdJSONPatchMedicationDispense
import typings.fhirKitClient.AnonHeadersIdJSONPatchMedicationRequest
import typings.fhirKitClient.AnonHeadersIdJSONPatchMedicationStatement
import typings.fhirKitClient.AnonHeadersIdJSONPatchMessageDefinition
import typings.fhirKitClient.AnonHeadersIdJSONPatchMessageHeader
import typings.fhirKitClient.AnonHeadersIdJSONPatchNamingSystem
import typings.fhirKitClient.AnonHeadersIdJSONPatchNutritionOrder
import typings.fhirKitClient.AnonHeadersIdJSONPatchObservation
import typings.fhirKitClient.AnonHeadersIdJSONPatchOperationDefinition
import typings.fhirKitClient.AnonHeadersIdJSONPatchOperationOutcome
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptions
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsParameters
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPatient
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPaymentNotice
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPaymentReconciliation
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPerson
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPlanDefinition
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPractitioner
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsPractitionerRole
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsProcedure
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsProcedureRequest
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsProcessRequest
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsProcessResponse
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsProvenance
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsQuestionnaire
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsQuestionnaireResponse
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsReferralRequest
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsRelatedPerson
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsRequestGroup
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResearchStudy
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResearchSubject
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceType
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeArray
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSchedule
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSearchParameter
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSequence
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeServiceDefinition
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSlot
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSpecimen
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeStructureDefinition
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeStructureMap
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSubscription
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSubstance
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSupplyDelivery
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeSupplyRequest
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeTask
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeTestReport
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeTestScript
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeValueSet
import typings.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceTypeVisionPrescription
import typings.fhirKitClient.AnonHeadersIdLibrary
import typings.fhirKitClient.AnonHeadersIdLinkage
import typings.fhirKitClient.AnonHeadersIdList
import typings.fhirKitClient.AnonHeadersIdLocation
import typings.fhirKitClient.AnonHeadersIdMeasure
import typings.fhirKitClient.AnonHeadersIdMeasureReport
import typings.fhirKitClient.AnonHeadersIdMedia
import typings.fhirKitClient.AnonHeadersIdMedication
import typings.fhirKitClient.AnonHeadersIdMedicationAdministration
import typings.fhirKitClient.AnonHeadersIdMedicationDispense
import typings.fhirKitClient.AnonHeadersIdMedicationRequest
import typings.fhirKitClient.AnonHeadersIdMedicationStatement
import typings.fhirKitClient.AnonHeadersIdMessageDefinition
import typings.fhirKitClient.AnonHeadersIdMessageHeader
import typings.fhirKitClient.AnonHeadersIdNamingSystem
import typings.fhirKitClient.AnonHeadersIdNutritionOrder
import typings.fhirKitClient.AnonHeadersIdObservation
import typings.fhirKitClient.AnonHeadersIdOperationDefinition
import typings.fhirKitClient.AnonHeadersIdOperationOutcome
import typings.fhirKitClient.AnonHeadersIdOptions
import typings.fhirKitClient.AnonHeadersIdOptionsParameters
import typings.fhirKitClient.AnonHeadersIdOptionsPatient
import typings.fhirKitClient.AnonHeadersIdOptionsPaymentNotice
import typings.fhirKitClient.AnonHeadersIdOptionsPaymentReconciliation
import typings.fhirKitClient.AnonHeadersIdOptionsPerson
import typings.fhirKitClient.AnonHeadersIdOptionsPlanDefinition
import typings.fhirKitClient.AnonHeadersIdOptionsPractitioner
import typings.fhirKitClient.AnonHeadersIdOptionsPractitionerRole
import typings.fhirKitClient.AnonHeadersIdOptionsProcedure
import typings.fhirKitClient.AnonHeadersIdOptionsProcedureRequest
import typings.fhirKitClient.AnonHeadersIdOptionsProcessRequest
import typings.fhirKitClient.AnonHeadersIdOptionsProcessResponse
import typings.fhirKitClient.AnonHeadersIdOptionsProvenance
import typings.fhirKitClient.AnonHeadersIdOptionsQuestionnaire
import typings.fhirKitClient.AnonHeadersIdOptionsQuestionnaireResponse
import typings.fhirKitClient.AnonHeadersIdOptionsReferralRequest
import typings.fhirKitClient.AnonHeadersIdOptionsRelatedPerson
import typings.fhirKitClient.AnonHeadersIdOptionsRequestGroup
import typings.fhirKitClient.AnonHeadersIdOptionsResearchStudy
import typings.fhirKitClient.AnonHeadersIdOptionsResearchSubject
import typings.fhirKitClient.AnonHeadersIdOptionsResourceType
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSchedule
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSearchParameter
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSequence
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeServiceDefinition
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSlot
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSpecimen
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeString
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeStringOptional
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeStructureDefinition
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeStructureMap
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSubscription
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSubstance
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSupplyDelivery
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeSupplyRequest
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeTask
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeTestReport
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeTestScript
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeValueSet
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeVersion
import typings.fhirKitClient.AnonHeadersIdOptionsResourceTypeVersionCustomResourceType
import typings.fhirKitClient.AnonHeadersOptions
import typings.fhirKitClient.AnonHeadersOptionsResourceType
import typings.fhirKitClient.AnonHeadersOptionsSearchParams
import typings.fhirKitClient.AnonHistory
import typings.fhirKitClient.AnonSearchset
import typings.fhirKitClient.AnonTransactionresponse
import typings.fhirKitClient.AnonType
import typings.request.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var baseUrl: String = js.native
  var bearerToken: js.UndefOr[String] = js.native
  var customHeaders: Headers = js.native
  /**
    * Submit a set of actions to perform independently as a batch.
    *
    * Update, create or delete a set of resources in a single interaction.
    * There should be no interdependencies between entries in the bundle.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'batch',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.batch({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.batch({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.body - The request body with a type of 'batch'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def batch(params: AnonBodyHeadersOptionsAnonBatch): js.Promise[OperationOutcome | (Bundle with AnonBatchresponse)] = js.native
  /**
    * Get the default capability statement.
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.capabilityStatement().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.capabilityStatement();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} capability statement FHIR resource.
    */
  def capabilityStatement(): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def capabilityStatement(params: AnonHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  /**
    * Search for FHIR resources within a compartment.
    * The resourceType and id must be specified.
    *
    * @example
    *
    * // Using promises
    * fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.compartment - The search compartment.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def compartmentSearch(params: AnonCompartmentHeaders): js.Promise[OperationOutcome | (Bundle with AnonSearchset)] = js.native
  /**
    * Create a resource.
    *
    * @example
    * const newPatient = {
    *   resourceType: 'Patient',
    *   active: true,
    *   name: [{ use: 'official', family: ['Coleman'], given: ['Lisa', 'P.'] }],
    *   gender: 'female',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * })
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The FHIR resource type.
    * @param {Response} params.body - The new resource data to create.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def create(params: AnonAccountBody): js.Promise[OperationOutcome | Account] = js.native
  def create(params: AnonActivityDefinitionBody): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def create(params: AnonAdverseEventBody): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def create(params: AnonAllergyIntoleranceBody): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def create(params: AnonAppointmentBody): js.Promise[OperationOutcome | Appointment] = js.native
  def create(params: AnonAppointmentResponseBody): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def create(params: AnonAuditEventBody): js.Promise[OperationOutcome | AuditEvent] = js.native
  def create(params: AnonBasicBody): js.Promise[OperationOutcome | Basic] = js.native
  def create(params: AnonBinaryBody): js.Promise[OperationOutcome | Binary] = js.native
  def create(params: AnonBody): js.Promise[OperationOutcome | BodySite] = js.native
  def create(params: AnonBodyBundle): js.Promise[OperationOutcome | Bundle] = js.native
  def create(params: AnonBodyCapabilityStatement): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def create(params: AnonBodyCarePlan): js.Promise[OperationOutcome | CarePlan] = js.native
  def create(params: AnonBodyCareTeam): js.Promise[OperationOutcome | CareTeam] = js.native
  def create(params: AnonBodyChargeItem): js.Promise[OperationOutcome | ChargeItem] = js.native
  def create(params: AnonBodyClaim): js.Promise[OperationOutcome | Claim] = js.native
  def create(params: AnonBodyClaimResponse): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def create(params: AnonBodyClinicalImpression): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def create(params: AnonBodyCodeSystem): js.Promise[OperationOutcome | CodeSystem] = js.native
  def create(params: AnonBodyCommunication): js.Promise[OperationOutcome | Communication] = js.native
  def create(params: AnonBodyCommunicationRequest): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def create(params: AnonBodyCompartmentDefinition): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def create(params: AnonBodyComposition): js.Promise[OperationOutcome | Composition] = js.native
  def create(params: AnonBodyConceptMap): js.Promise[OperationOutcome | ConceptMap] = js.native
  def create(params: AnonBodyCondition): js.Promise[OperationOutcome | Condition] = js.native
  def create(params: AnonBodyConsent): js.Promise[OperationOutcome | Consent] = js.native
  def create(params: AnonBodyContract): js.Promise[OperationOutcome | Contract] = js.native
  def create(params: AnonBodyCoverage): js.Promise[OperationOutcome | Coverage] = js.native
  def create(params: AnonBodyDataElement): js.Promise[OperationOutcome | DataElement] = js.native
  def create(params: AnonBodyDetectedIssue): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def create(params: AnonBodyDevice): js.Promise[OperationOutcome | Device] = js.native
  def create(params: AnonBodyDeviceComponent): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def create(params: AnonBodyDeviceMetric): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def create(params: AnonBodyDeviceRequest): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def create(params: AnonBodyDeviceUseStatement): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def create(params: AnonBodyDiagnosticReport): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def create(params: AnonBodyDocumentManifest): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def create(params: AnonBodyDocumentReference): js.Promise[OperationOutcome | DocumentReference] = js.native
  def create(params: AnonBodyDomainResource): js.Promise[OperationOutcome | DomainResource] = js.native
  def create(params: AnonBodyEligibilityRequest): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def create(params: AnonBodyEligibilityResponse): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def create(params: AnonBodyEncounter): js.Promise[OperationOutcome | Encounter] = js.native
  def create(params: AnonBodyEndpoint): js.Promise[OperationOutcome | Endpoint] = js.native
  def create(params: AnonBodyEnrollmentRequest): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def create(params: AnonBodyEnrollmentResponse): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def create(params: AnonBodyEpisodeOfCare): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def create(params: AnonBodyExpansionProfile): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def create(params: AnonBodyExplanationOfBenefit): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def create(params: AnonBodyFamilyMemberHistory): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def create(params: AnonBodyFlag): js.Promise[OperationOutcome | Flag] = js.native
  def create(params: AnonBodyGoal): js.Promise[OperationOutcome | Goal] = js.native
  def create(params: AnonBodyGraphDefinition): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def create(params: AnonBodyGroup): js.Promise[OperationOutcome | Group] = js.native
  def create(params: AnonBodyGuidanceResponse): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def create(params: AnonBodyHeaders): js.Promise[OperationOutcome | HealthcareService] = js.native
  def create(params: AnonBodyHeadersImagingManifest): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def create(params: AnonBodyHeadersImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def create(params: AnonBodyHeadersImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def create(params: AnonBodyHeadersImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def create(params: AnonBodyHeadersImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def create(params: AnonBodyHeadersLibrary): js.Promise[OperationOutcome | Library] = js.native
  def create(params: AnonBodyHeadersLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def create(params: AnonBodyHeadersList): js.Promise[OperationOutcome | List] = js.native
  def create(params: AnonBodyHeadersLocation): js.Promise[OperationOutcome | Location] = js.native
  def create(params: AnonBodyHeadersMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def create(params: AnonBodyHeadersMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def create(params: AnonBodyHeadersMedia): js.Promise[OperationOutcome | Media] = js.native
  def create(params: AnonBodyHeadersMedication): js.Promise[OperationOutcome | Medication] = js.native
  def create(params: AnonBodyHeadersMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def create(params: AnonBodyHeadersMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def create(params: AnonBodyHeadersMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def create(params: AnonBodyHeadersMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def create(params: AnonBodyHeadersMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def create(params: AnonBodyHeadersMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def create(params: AnonBodyHeadersNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def create(params: AnonBodyHeadersNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def create(params: AnonBodyHeadersObservation): js.Promise[OperationOutcome | Observation] = js.native
  def create(params: AnonBodyHeadersOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def create(params: AnonBodyHeadersOperationOutcome): js.Promise[OperationOutcome] = js.native
  def create(params: AnonBodyHeadersOptions): js.Promise[OperationOutcome | Organization] = js.native
  def create(params: AnonBodyHeadersOptionsParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def create(params: AnonBodyHeadersOptionsPatient): js.Promise[OperationOutcome | Patient] = js.native
  def create(params: AnonBodyHeadersOptionsPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def create(params: AnonBodyHeadersOptionsPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def create(params: AnonBodyHeadersOptionsPerson): js.Promise[OperationOutcome | Person] = js.native
  def create(params: AnonBodyHeadersOptionsPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def create(params: AnonBodyHeadersOptionsPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def create(params: AnonBodyHeadersOptionsPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def create(params: AnonBodyHeadersOptionsProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def create(params: AnonBodyHeadersOptionsProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def create(params: AnonBodyHeadersOptionsProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def create(params: AnonBodyHeadersOptionsProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def create(params: AnonBodyHeadersOptionsProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def create(params: AnonBodyHeadersOptionsQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def create(params: AnonBodyHeadersOptionsQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def create(params: AnonBodyHeadersOptionsReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def create(params: AnonBodyHeadersOptionsRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def create(params: AnonBodyHeadersOptionsRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def create(params: AnonBodyHeadersOptionsResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def create(params: AnonBodyHeadersOptionsResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def create(params: AnonBodyHeadersOptionsResourceType): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSequence): js.Promise[OperationOutcome | Sequence] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSlot): js.Promise[OperationOutcome | Slot] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSubstance): js.Promise[OperationOutcome | Substance] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeSupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeTask): js.Promise[OperationOutcome | Task] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def create(params: AnonBodyHeadersOptionsResourceTypeVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def create[T /* <: CustomResource */](params: AnonBodyHeadersOptionsResourceTypeCustomResourceType[T]): js.Promise[OperationOutcome | T] = js.native
  /**
    * Delete a resource by FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.delete({
    *   resourceType: 'Patient',
    *   id: 12345,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.delete({ resourceType: 'Patient', id: 12345 });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient", "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} Operation Outcome FHIR resource
    */
  def delete(params: AnonHeadersIdOptionsResourceTypeString): js.Promise[OperationOutcome] = js.native
  /**
    * Retrieve the change history for a FHIR resource id, a resource type or the
    * entire system
    *
    * @example
    *
    * // Using promises
    * fhirClient.history({ resourceType: 'Patient', id: '12345' });
    *   .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.history({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {string} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {string} [params.id] - The FHIR id for the resource, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def history(): js.Promise[OperationOutcome | (Bundle with AnonHistory)] = js.native
  def history(params: AnonHeadersIdOptionsResourceTypeStringOptional): js.Promise[OperationOutcome | (Bundle with AnonHistory)] = js.native
  /**
    * Return the next page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def nextPage[T /* <: String */](params: AnonBundleOptions[T]): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def nextPage[T /* <: String */](params: AnonBundleOptions[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  /**
    * Patch a resource by FHIR id.
    *
    * From http://hl7.org/fhir/STU3/http.html#patch:
    * Content-Type is 'application/json-patch+json'
    * Expects a JSON Patch document format, see http://jsonpatch.com/
    *
    * @example
    *
    * // JSON Patch document format from http://jsonpatch.com/
    * const JSONPatch = [{ op: 'replace', path: '/gender', value: 'male' }];
    *
    * // Using promises
    * fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Array} params.JSONPatch - A JSON Patch document containing an array
    *   of patch operations, formatted according to http://jsonpatch.com/.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def patch(params: AnonAccountHeaders): js.Promise[OperationOutcome | Account] = js.native
  def patch(params: AnonActivityDefinitionHeaders): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def patch(params: AnonAdverseEventHeaders): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def patch(params: AnonAllergyIntoleranceHeaders): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def patch(params: AnonAppointmentHeaders): js.Promise[OperationOutcome | Appointment] = js.native
  def patch(params: AnonAppointmentResponseHeaders): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def patch(params: AnonAuditEventHeaders): js.Promise[OperationOutcome | AuditEvent] = js.native
  def patch(params: AnonBasicHeaders): js.Promise[OperationOutcome | Basic] = js.native
  def patch(params: AnonBinaryHeaders): js.Promise[OperationOutcome | Binary] = js.native
  def patch(params: AnonBodySiteHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def patch(params: AnonBundleHeaders): js.Promise[OperationOutcome | Bundle] = js.native
  def patch(params: AnonCapabilityStatementHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def patch(params: AnonCarePlanHeaders): js.Promise[OperationOutcome | CarePlan] = js.native
  def patch(params: AnonCareTeamHeaders): js.Promise[OperationOutcome | CareTeam] = js.native
  def patch(params: AnonChargeItemHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def patch(params: AnonClaimHeaders): js.Promise[OperationOutcome | Claim] = js.native
  def patch(params: AnonClaimResponseHeaders): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def patch(params: AnonClinicalImpressionHeaders): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def patch(params: AnonCodeSystemHeaders): js.Promise[OperationOutcome | CodeSystem] = js.native
  def patch(params: AnonCommunicationHeaders): js.Promise[OperationOutcome | Communication] = js.native
  def patch(params: AnonCommunicationRequestHeaders): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def patch(params: AnonCompartmentDefinitionHeaders): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def patch(params: AnonCompositionHeaders): js.Promise[OperationOutcome | Composition] = js.native
  def patch(params: AnonConceptMapHeaders): js.Promise[OperationOutcome | ConceptMap] = js.native
  def patch(params: AnonConditionHeaders): js.Promise[OperationOutcome | Condition] = js.native
  def patch(params: AnonConsentHeaders): js.Promise[OperationOutcome | Consent] = js.native
  def patch(params: AnonContractHeaders): js.Promise[OperationOutcome | Contract] = js.native
  def patch(params: AnonCoverageHeaders): js.Promise[OperationOutcome | Coverage] = js.native
  def patch(params: AnonDataElementHeaders): js.Promise[OperationOutcome | DataElement] = js.native
  def patch(params: AnonDetectedIssueHeaders): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def patch(params: AnonDeviceComponentHeaders): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def patch(params: AnonDeviceHeaders): js.Promise[OperationOutcome | Device] = js.native
  def patch(params: AnonDeviceMetricHeaders): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def patch(params: AnonDeviceRequestHeaders): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def patch(params: AnonDeviceUseStatementHeaders): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def patch(params: AnonDiagnosticReportHeaders): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def patch(params: AnonDocumentManifestHeaders): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def patch(params: AnonDocumentReferenceHeaders): js.Promise[OperationOutcome | DocumentReference] = js.native
  def patch(params: AnonDomainResourceHeaders): js.Promise[OperationOutcome | DomainResource] = js.native
  def patch(params: AnonEligibilityRequestHeaders): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def patch(params: AnonEligibilityResponseHeaders): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def patch(params: AnonEncounterHeaders): js.Promise[OperationOutcome | Encounter] = js.native
  def patch(params: AnonEndpointHeaders): js.Promise[OperationOutcome | Endpoint] = js.native
  def patch(params: AnonEnrollmentRequestHeaders): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def patch(params: AnonEnrollmentResponseHeaders): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def patch(params: AnonEpisodeOfCareHeaders): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def patch(params: AnonExpansionProfileHeaders): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def patch(params: AnonExplanationOfBenefitHeaders): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def patch(params: AnonFamilyMemberHistoryHeaders): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def patch(params: AnonFlagHeaders): js.Promise[OperationOutcome | Flag] = js.native
  def patch(params: AnonGoalHeaders): js.Promise[OperationOutcome | Goal] = js.native
  def patch(params: AnonGraphDefinitionHeaders): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def patch(params: AnonGroupHeaders): js.Promise[OperationOutcome | Group] = js.native
  def patch(params: AnonGuidanceResponseHeaders): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def patch(params: AnonHeadersHealthcareServiceId): js.Promise[OperationOutcome | HealthcareService] = js.native
  def patch(params: AnonHeadersIdImagingManifest): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def patch(params: AnonHeadersIdImagingStudyJSONPatch): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def patch(params: AnonHeadersIdImmunizationJSONPatch): js.Promise[OperationOutcome | Immunization] = js.native
  def patch(params: AnonHeadersIdImmunizationRecommendationJSONPatch): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def patch(params: AnonHeadersIdImplementationGuideJSONPatch): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def patch(params: AnonHeadersIdJSONPatch): js.Promise[OperationOutcome | Library] = js.native
  def patch(params: AnonHeadersIdJSONPatchLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def patch(params: AnonHeadersIdJSONPatchList): js.Promise[OperationOutcome | List] = js.native
  def patch(params: AnonHeadersIdJSONPatchLocation): js.Promise[OperationOutcome | Location] = js.native
  def patch(params: AnonHeadersIdJSONPatchMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def patch(params: AnonHeadersIdJSONPatchMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def patch(params: AnonHeadersIdJSONPatchMedia): js.Promise[OperationOutcome | Media] = js.native
  def patch(params: AnonHeadersIdJSONPatchMedication): js.Promise[OperationOutcome | Medication] = js.native
  def patch(params: AnonHeadersIdJSONPatchMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def patch(params: AnonHeadersIdJSONPatchMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def patch(params: AnonHeadersIdJSONPatchMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def patch(params: AnonHeadersIdJSONPatchMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def patch(params: AnonHeadersIdJSONPatchMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def patch(params: AnonHeadersIdJSONPatchMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def patch(params: AnonHeadersIdJSONPatchNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def patch(params: AnonHeadersIdJSONPatchNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def patch(params: AnonHeadersIdJSONPatchObservation): js.Promise[OperationOutcome | Observation] = js.native
  def patch(params: AnonHeadersIdJSONPatchOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def patch(params: AnonHeadersIdJSONPatchOperationOutcome): js.Promise[OperationOutcome] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptions): js.Promise[OperationOutcome | Organization] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPatient): js.Promise[OperationOutcome | Patient] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPerson): js.Promise[OperationOutcome | Person] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeArray): js.Promise[OperationOutcome | CustomResource] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSequence): js.Promise[OperationOutcome | Sequence] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSlot): js.Promise[OperationOutcome | Slot] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSubstance): js.Promise[OperationOutcome | Substance] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeSupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeTask): js.Promise[OperationOutcome | Task] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceTypeVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  /**
    * Return the previous page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def prevPage[T /* <: String */](params: AnonBundleOptions[T]): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def prevPage[T /* <: String */](params: AnonBundleOptions[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  /**
    * Resolve a reference and return FHIR resource
    *
    * From: http://hl7.org/fhir/STU3/references.html, a reference can be: 1)
    * absolute URL, 2) relative URL or 3) an internal fragement. In the case of
    * (2), there are rules on resolving references that are in a FHIR bundle.
    *
    * @async
    *
    * @example
    *
    * // Always does a new http request
    * client.resolve({ reference: 'http://test.com/fhir/Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Always does a new http request, using the client.baseUrl
    * client.resolve({ reference: 'Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Try to resolve a patient in the bundle, otherwise build request
    * // at client.baseUrl
    * client.resolve({ reference: 'Patient/1', context: bundle }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Resolve a patient contained in someResource (see:
    * // http://hl7.org/fhir/STU3/references.html#contained)
    * client.resolve({ reference: '#patient-1', context: someResource }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.reference - FHIR reference
    * @param {Object} [params.context] - Optional bundle with 'entry' array or FHIR resource with 'contained' array (if 'params.reference' starts with '#')
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def resolve(params: AnonContext): js.Promise[FhirResource] = js.native
  /**
    * Retrieve the change history for a particular resource FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {string} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceHistory(params: AnonHeadersIdOptionsResourceTypeString): js.Promise[OperationOutcome | (Bundle with AnonHistory)] = js.native
  /**
    * Search for a FHIR resource.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceSearch(params: AnonHeadersOptions): js.Promise[OperationOutcome | (Bundle with AnonSearchset)] = js.native
  /**
    * Search for a FHIR resource, with or without compartments, or the entire
    * system
    *
    * @example
    *
    * // Using promises
    * fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {Object} [params.compartment] - The search compartment, optional.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    *
    * @throws {Error} if neither searchParams nor resourceType are supplied
    */
  def search(params: AnonCompartment): js.Promise[OperationOutcome | (Bundle with AnonSearchset)] = js.native
  /**
    * Obtain the SMART OAuth URLs from the Capability Statement
    * http://docs.smarthealthit.org/authorization/conformance-statement/
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.smartAuthMetadata().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.smartAuthMetadata();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} contains the following SMART URIs: authorizeUrl,
    *   tokenUrl, registerUrl, manageUrl
    */
  def smartAuthMetadata(): js.Promise[SmartAuthMetadata] = js.native
  def smartAuthMetadata(params: AnonHeaders): js.Promise[SmartAuthMetadata] = js.native
  /**
    * Retrieve the change history for all resources.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemHistory();
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemHistory();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemHistory(): js.Promise[OperationOutcome | (Bundle with AnonHistory)] = js.native
  def systemHistory(params: AnonHeaders): js.Promise[OperationOutcome | (Bundle with AnonHistory)] = js.native
  /**
    * Search across all FHIR resource types in the system.
    * Only the parameters defined for all resources can be used.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemSearch({
    *   searchParams: { name: 'smith' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemSearch({ searchParams: { name: 'smith' } });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemSearch(params: AnonHeadersOptionsSearchParams): js.Promise[OperationOutcome | (Bundle with AnonSearchset)] = js.native
  /**
    * Submit a set of actions to perform independently as a transaction.
    *
    * Update, create or delete a set of resources in a single interaction.
    * The entire set of changes should succeed or fail as a single entity.
    * Multiple actions on multiple resources different types may be submitted.
    * The outcome should not depend on the order of the resources loaded.
    * Order of processing actions: DELETE, POST, PUT, and GET.
    * The transaction fails if any resource overlap in DELETE, POST and PUT.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'transaction',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.transaction({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.transaction({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.body - The request body with a type of
    *   'transaction'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def transaction(params: AnonBodyHeadersOptionsAnonTransaction): js.Promise[OperationOutcome | (Bundle with AnonTransactionresponse)] = js.native
  /**
    * Retrieve the change history for a particular resource type.
    *
    * @example
    *
    * // Using promises
    * fhirClient.typeHistory({ resourceType: 'Patient' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.typeHistory({ resourceType: 'Patient' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def typeHistory(params: AnonHeadersOptionsResourceType): js.Promise[OperationOutcome | (Bundle with AnonHistory)] = js.native
  /**
    * Update a resource by FHIR id.
    *
    * @example
    *
    * const updatedPatient = {
    *   resourceType: 'Patient',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.body - The resource to be updated.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def update(params: AnonAccountBodyHeaders): js.Promise[OperationOutcome | Account] = js.native
  def update(params: AnonActivityDefinitionBodyHeaders): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def update(params: AnonAdverseEventBodyHeaders): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def update(params: AnonAllergyIntoleranceBodyHeaders): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def update(params: AnonAppointmentBodyHeaders): js.Promise[OperationOutcome | Appointment] = js.native
  def update(params: AnonAppointmentResponseBodyHeaders): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def update(params: AnonAuditEventBodyHeaders): js.Promise[OperationOutcome | AuditEvent] = js.native
  def update(params: AnonBasicBodyHeaders): js.Promise[OperationOutcome | Basic] = js.native
  def update(params: AnonBinaryBodyHeaders): js.Promise[OperationOutcome | Binary] = js.native
  def update(params: AnonBodyBodySite): js.Promise[OperationOutcome | BodySite] = js.native
  def update(params: AnonBodyBundleHeaders): js.Promise[OperationOutcome | Bundle] = js.native
  def update(params: AnonBodyCapabilityStatementHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def update(params: AnonBodyCarePlanHeaders): js.Promise[OperationOutcome | CarePlan] = js.native
  def update(params: AnonBodyCareTeamHeaders): js.Promise[OperationOutcome | CareTeam] = js.native
  def update(params: AnonBodyChargeItemHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def update(params: AnonBodyClaimHeaders): js.Promise[OperationOutcome | Claim] = js.native
  def update(params: AnonBodyClaimResponseHeaders): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def update(params: AnonBodyClinicalImpressionHeaders): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def update(params: AnonBodyCodeSystemHeaders): js.Promise[OperationOutcome | CodeSystem] = js.native
  def update(params: AnonBodyCommunicationHeaders): js.Promise[OperationOutcome | Communication] = js.native
  def update(params: AnonBodyCommunicationRequestHeaders): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def update(params: AnonBodyCompartmentDefinitionHeaders): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def update(params: AnonBodyCompositionHeaders): js.Promise[OperationOutcome | Composition] = js.native
  def update(params: AnonBodyConceptMapHeaders): js.Promise[OperationOutcome | ConceptMap] = js.native
  def update(params: AnonBodyConditionHeaders): js.Promise[OperationOutcome | Condition] = js.native
  def update(params: AnonBodyConsentHeaders): js.Promise[OperationOutcome | Consent] = js.native
  def update(params: AnonBodyContractHeaders): js.Promise[OperationOutcome | Contract] = js.native
  def update(params: AnonBodyCoverageHeaders): js.Promise[OperationOutcome | Coverage] = js.native
  def update(params: AnonBodyDataElementHeaders): js.Promise[OperationOutcome | DataElement] = js.native
  def update(params: AnonBodyDetectedIssueHeaders): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def update(params: AnonBodyDeviceComponentHeaders): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def update(params: AnonBodyDeviceHeaders): js.Promise[OperationOutcome | Device] = js.native
  def update(params: AnonBodyDeviceMetricHeaders): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def update(params: AnonBodyDeviceRequestHeaders): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def update(params: AnonBodyDeviceUseStatementHeaders): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def update(params: AnonBodyDiagnosticReportHeaders): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def update(params: AnonBodyDocumentManifestHeaders): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def update(params: AnonBodyDocumentReferenceHeaders): js.Promise[OperationOutcome | DocumentReference] = js.native
  def update(params: AnonBodyDomainResourceHeaders): js.Promise[OperationOutcome | DomainResource] = js.native
  def update(params: AnonBodyEligibilityRequestHeaders): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def update(params: AnonBodyEligibilityResponseHeaders): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def update(params: AnonBodyEncounterHeaders): js.Promise[OperationOutcome | Encounter] = js.native
  def update(params: AnonBodyEndpointHeaders): js.Promise[OperationOutcome | Endpoint] = js.native
  def update(params: AnonBodyEnrollmentRequestHeaders): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def update(params: AnonBodyEnrollmentResponseHeaders): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def update(params: AnonBodyEpisodeOfCareHeaders): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def update(params: AnonBodyExpansionProfileHeaders): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def update(params: AnonBodyExplanationOfBenefitHeaders): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def update(params: AnonBodyFamilyMemberHistoryHeaders): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def update(params: AnonBodyFlagHeaders): js.Promise[OperationOutcome | Flag] = js.native
  def update(params: AnonBodyGoalHeaders): js.Promise[OperationOutcome | Goal] = js.native
  def update(params: AnonBodyGraphDefinitionHeaders): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def update(params: AnonBodyGroupHeaders): js.Promise[OperationOutcome | Group] = js.native
  def update(params: AnonBodyGuidanceResponseHeaders): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def update(params: AnonBodyHeadersHealthcareService): js.Promise[OperationOutcome | HealthcareService] = js.native
  def update(params: AnonBodyHeadersId): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def update(params: AnonBodyHeadersIdImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def update(params: AnonBodyHeadersIdImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def update(params: AnonBodyHeadersIdImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def update(params: AnonBodyHeadersIdImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def update(params: AnonBodyHeadersIdLibrary): js.Promise[OperationOutcome | Library] = js.native
  def update(params: AnonBodyHeadersIdLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def update(params: AnonBodyHeadersIdList): js.Promise[OperationOutcome | List] = js.native
  def update(params: AnonBodyHeadersIdLocation): js.Promise[OperationOutcome | Location] = js.native
  def update(params: AnonBodyHeadersIdMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def update(params: AnonBodyHeadersIdMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def update(params: AnonBodyHeadersIdMedia): js.Promise[OperationOutcome | Media] = js.native
  def update(params: AnonBodyHeadersIdMedication): js.Promise[OperationOutcome | Medication] = js.native
  def update(params: AnonBodyHeadersIdMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def update(params: AnonBodyHeadersIdMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def update(params: AnonBodyHeadersIdMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def update(params: AnonBodyHeadersIdMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def update(params: AnonBodyHeadersIdMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def update(params: AnonBodyHeadersIdMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def update(params: AnonBodyHeadersIdNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def update(params: AnonBodyHeadersIdNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def update(params: AnonBodyHeadersIdObservation): js.Promise[OperationOutcome | Observation] = js.native
  def update(params: AnonBodyHeadersIdOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def update(params: AnonBodyHeadersIdOperationOutcome): js.Promise[OperationOutcome] = js.native
  def update(params: AnonBodyHeadersIdOptions): js.Promise[OperationOutcome | Organization] = js.native
  def update(params: AnonBodyHeadersIdOptionsParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def update(params: AnonBodyHeadersIdOptionsPatient): js.Promise[OperationOutcome | Patient] = js.native
  def update(params: AnonBodyHeadersIdOptionsPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def update(params: AnonBodyHeadersIdOptionsPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def update(params: AnonBodyHeadersIdOptionsPerson): js.Promise[OperationOutcome | Person] = js.native
  def update(params: AnonBodyHeadersIdOptionsPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def update(params: AnonBodyHeadersIdOptionsPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def update(params: AnonBodyHeadersIdOptionsPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def update(params: AnonBodyHeadersIdOptionsProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def update(params: AnonBodyHeadersIdOptionsProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def update(params: AnonBodyHeadersIdOptionsProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def update(params: AnonBodyHeadersIdOptionsProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def update(params: AnonBodyHeadersIdOptionsProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def update(params: AnonBodyHeadersIdOptionsQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def update(params: AnonBodyHeadersIdOptionsQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def update(params: AnonBodyHeadersIdOptionsReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def update(params: AnonBodyHeadersIdOptionsRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def update(params: AnonBodyHeadersIdOptionsRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def update(params: AnonBodyHeadersIdOptionsResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def update(params: AnonBodyHeadersIdOptionsResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceType): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSequence): js.Promise[OperationOutcome | Sequence] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSlot): js.Promise[OperationOutcome | Slot] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSubstance): js.Promise[OperationOutcome | Substance] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeSupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeTask): js.Promise[OperationOutcome | Task] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceTypeVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def update[T /* <: CustomResource */](params: AnonBodyHeadersIdOptionsResourceTypeCustomResourceType[T]): js.Promise[OperationOutcome | T] = js.native
  /**
    * Get a resource by id and version.
    *
    * @example
    *
    * // Using promises
    * fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * }).then(data => console.log(data));
    *
    * // Using async
    * let response = await fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.version - The version id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def vread(params: AnonAccount): js.Promise[OperationOutcome | Account] = js.native
  def vread(params: AnonActivityDefinition): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def vread(params: AnonAdverseEvent): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def vread(params: AnonAllergyIntolerance): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def vread(params: AnonAppointment): js.Promise[OperationOutcome | Appointment] = js.native
  def vread(params: AnonAppointmentResponse): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def vread(params: AnonAuditEvent): js.Promise[OperationOutcome | AuditEvent] = js.native
  def vread(params: AnonBasic): js.Promise[OperationOutcome | Basic] = js.native
  def vread(params: AnonBinary): js.Promise[OperationOutcome | Binary] = js.native
  def vread(params: AnonBodySite): js.Promise[OperationOutcome | BodySite] = js.native
  def vread(params: AnonBundle): js.Promise[OperationOutcome | Bundle] = js.native
  def vread(params: AnonCapabilityStatement): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def vread(params: AnonCarePlan): js.Promise[OperationOutcome | CarePlan] = js.native
  def vread(params: AnonCareTeam): js.Promise[OperationOutcome | CareTeam] = js.native
  def vread(params: AnonChargeItem): js.Promise[OperationOutcome | ChargeItem] = js.native
  def vread(params: AnonClaim): js.Promise[OperationOutcome | Claim] = js.native
  def vread(params: AnonClaimResponse): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def vread(params: AnonClinicalImpression): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def vread(params: AnonCodeSystem): js.Promise[OperationOutcome | CodeSystem] = js.native
  def vread(params: AnonCommunication): js.Promise[OperationOutcome | Communication] = js.native
  def vread(params: AnonCommunicationRequest): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def vread(params: AnonCompartmentDefinition): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def vread(params: AnonComposition): js.Promise[OperationOutcome | Composition] = js.native
  def vread(params: AnonConceptMap): js.Promise[OperationOutcome | ConceptMap] = js.native
  def vread(params: AnonCondition): js.Promise[OperationOutcome | Condition] = js.native
  def vread(params: AnonConsent): js.Promise[OperationOutcome | Consent] = js.native
  def vread(params: AnonContract): js.Promise[OperationOutcome | Contract] = js.native
  def vread(params: AnonCoverage): js.Promise[OperationOutcome | Coverage] = js.native
  def vread(params: AnonDataElement): js.Promise[OperationOutcome | DataElement] = js.native
  def vread(params: AnonDetectedIssue): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def vread(params: AnonDevice): js.Promise[OperationOutcome | Device] = js.native
  def vread(params: AnonDeviceComponent): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def vread(params: AnonDeviceMetric): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def vread(params: AnonDeviceRequest): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def vread(params: AnonDeviceUseStatement): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def vread(params: AnonDiagnosticReport): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def vread(params: AnonDocumentManifest): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def vread(params: AnonDocumentReference): js.Promise[OperationOutcome | DocumentReference] = js.native
  def vread(params: AnonDomainResource): js.Promise[OperationOutcome | DomainResource] = js.native
  def vread(params: AnonEligibilityRequest): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def vread(params: AnonEligibilityResponse): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def vread(params: AnonEncounter): js.Promise[OperationOutcome | Encounter] = js.native
  def vread(params: AnonEndpoint): js.Promise[OperationOutcome | Endpoint] = js.native
  def vread(params: AnonEnrollmentRequest): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def vread(params: AnonEnrollmentResponse): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def vread(params: AnonEpisodeOfCare): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def vread(params: AnonExpansionProfile): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def vread(params: AnonExplanationOfBenefit): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def vread(params: AnonFamilyMemberHistory): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def vread(params: AnonFlag): js.Promise[OperationOutcome | Flag] = js.native
  def vread(params: AnonGoal): js.Promise[OperationOutcome | Goal] = js.native
  def vread(params: AnonGraphDefinition): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def vread(params: AnonGroup): js.Promise[OperationOutcome | Group] = js.native
  def vread(params: AnonGuidanceResponse): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def vread(params: AnonHeadersHealthcareService): js.Promise[OperationOutcome | HealthcareService] = js.native
  def vread(params: AnonHeadersId): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def vread(params: AnonHeadersIdImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def vread(params: AnonHeadersIdImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def vread(params: AnonHeadersIdImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def vread(params: AnonHeadersIdImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def vread(params: AnonHeadersIdLibrary): js.Promise[OperationOutcome | Library] = js.native
  def vread(params: AnonHeadersIdLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def vread(params: AnonHeadersIdList): js.Promise[OperationOutcome | List] = js.native
  def vread(params: AnonHeadersIdLocation): js.Promise[OperationOutcome | Location] = js.native
  def vread(params: AnonHeadersIdMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def vread(params: AnonHeadersIdMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def vread(params: AnonHeadersIdMedia): js.Promise[OperationOutcome | Media] = js.native
  def vread(params: AnonHeadersIdMedication): js.Promise[OperationOutcome | Medication] = js.native
  def vread(params: AnonHeadersIdMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def vread(params: AnonHeadersIdMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def vread(params: AnonHeadersIdMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def vread(params: AnonHeadersIdMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def vread(params: AnonHeadersIdMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def vread(params: AnonHeadersIdMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def vread(params: AnonHeadersIdNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def vread(params: AnonHeadersIdNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def vread(params: AnonHeadersIdObservation): js.Promise[OperationOutcome | Observation] = js.native
  def vread(params: AnonHeadersIdOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def vread(params: AnonHeadersIdOperationOutcome): js.Promise[OperationOutcome] = js.native
  def vread(params: AnonHeadersIdOptions): js.Promise[OperationOutcome | Organization] = js.native
  def vread(params: AnonHeadersIdOptionsParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def vread(params: AnonHeadersIdOptionsPatient): js.Promise[OperationOutcome | Patient] = js.native
  def vread(params: AnonHeadersIdOptionsPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def vread(params: AnonHeadersIdOptionsPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def vread(params: AnonHeadersIdOptionsPerson): js.Promise[OperationOutcome | Person] = js.native
  def vread(params: AnonHeadersIdOptionsPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def vread(params: AnonHeadersIdOptionsPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def vread(params: AnonHeadersIdOptionsPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def vread(params: AnonHeadersIdOptionsProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def vread(params: AnonHeadersIdOptionsProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def vread(params: AnonHeadersIdOptionsProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def vread(params: AnonHeadersIdOptionsProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def vread(params: AnonHeadersIdOptionsProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def vread(params: AnonHeadersIdOptionsQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def vread(params: AnonHeadersIdOptionsQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def vread(params: AnonHeadersIdOptionsReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def vread(params: AnonHeadersIdOptionsRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def vread(params: AnonHeadersIdOptionsRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def vread(params: AnonHeadersIdOptionsResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def vread(params: AnonHeadersIdOptionsResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def vread(params: AnonHeadersIdOptionsResourceType): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSequence): js.Promise[OperationOutcome | Sequence] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSlot): js.Promise[OperationOutcome | Slot] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSubstance): js.Promise[OperationOutcome | Substance] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeSupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeTask): js.Promise[OperationOutcome | Task] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeVersionCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
}

