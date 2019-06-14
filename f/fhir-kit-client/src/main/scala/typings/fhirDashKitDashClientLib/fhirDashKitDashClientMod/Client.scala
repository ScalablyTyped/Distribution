package typings
package fhirDashKitDashClientLib.fhirDashKitDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var baseUrl: java.lang.String = js.native
  var bearerToken: js.UndefOr[java.lang.String] = js.native
  var customHeaders: requestLib.requestMod.Headers = js.native
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
  def batch(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsAnonBatch): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Batchresponse
  ] = js.native
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
  def capabilityStatement(): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CapabilityStatement] = js.native
  def capabilityStatement(params: fhirDashKitDashClientLib.Anon_Headers): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CapabilityStatement] = js.native
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
  def compartmentSearch(params: fhirDashKitDashClientLib.Anon_CompartmentHeaders): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Searchset
  ] = js.native
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
  def create(params: fhirDashKitDashClientLib.Anon_AccountBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Account] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_ActivityDefinitionBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ActivityDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_AdverseEventBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AdverseEvent] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_AllergyIntoleranceBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AllergyIntolerance] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_AppointmentBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Appointment] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_AppointmentResponseBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AppointmentResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_AuditEventBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AuditEvent] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BasicBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Basic] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BinaryBody): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Binary] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_Body): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.BodySite] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyBundle): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCapabilityStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CapabilityStatement] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCarePlan): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CarePlan] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCareTeam): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CareTeam] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyChargeItem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ChargeItem] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyClaim): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Claim] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyClaimResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClaimResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyClinicalImpression): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClinicalImpression] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCodeSystem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CodeSystem] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCommunication): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Communication] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCommunicationRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CommunicationRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCompartmentDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CompartmentDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyComposition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Composition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyConceptMap): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ConceptMap] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCondition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Condition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyConsent): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Consent] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyContract): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Contract] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyCoverage): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Coverage] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDataElement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DataElement] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDetectedIssue): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DetectedIssue] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDevice): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Device] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDeviceComponent): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceComponent] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDeviceMetric): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceMetric] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDeviceRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDeviceUseStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceUseStatement] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDiagnosticReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DiagnosticReport] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDocumentManifest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentManifest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDocumentReference): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentReference] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyDomainResource): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DomainResource] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEligibilityRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEligibilityResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEncounter): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Encounter] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEndpoint): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Endpoint] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEnrollmentRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEnrollmentResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyEpisodeOfCare): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EpisodeOfCare] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyExpansionProfile): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExpansionProfile] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyExplanationOfBenefit): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExplanationOfBenefit] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyFamilyMemberHistory): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.FamilyMemberHistory] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyFlag): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Flag] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyGoal): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Goal] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyGraphDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GraphDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyGroup): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Group] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyGuidanceResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GuidanceResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.HealthcareService] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersImagingManifest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingManifest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersImagingStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingStudy] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersImmunization): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Immunization] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersImmunizationRecommendation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImmunizationRecommendation] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersImplementationGuide): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImplementationGuide] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersLibrary): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Library] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersLinkage): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Linkage] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersList): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.List] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersLocation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Location] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMeasure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Measure] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMeasureReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MeasureReport] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMedia): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Media] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMedication): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Medication] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMedicationAdministration): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationAdministration] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMedicationDispense): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationDispense] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMedicationRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMedicationStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationStatement] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMessageDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersMessageHeader): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageHeader] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersNamingSystem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NamingSystem] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersNutritionOrder): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NutritionOrder] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersObservation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Observation] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOperationDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.OperationDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOperationOutcome): js.Promise[fhirLib.fhirNs.OperationOutcome] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptions): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Organization] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsParameters): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Parameters] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPatient): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Patient] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPaymentNotice): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentNotice] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPaymentReconciliation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentReconciliation] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Person] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPlanDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PlanDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPractitioner): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Practitioner] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsPractitionerRole): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PractitionerRole] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsProcedure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Procedure] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsProcedureRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcedureRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsProcessRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsProcessResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsProvenance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Provenance] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsQuestionnaire): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Questionnaire] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsQuestionnaireResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.QuestionnaireResponse] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsReferralRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ReferralRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsRelatedPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RelatedPerson] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsRequestGroup): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RequestGroup] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResearchStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchStudy] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResearchSubject): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchSubject] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceType): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RiskAssessment] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSchedule): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Schedule] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSearchParameter): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SearchParameter] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSequence): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Sequence] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeServiceDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ServiceDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSlot): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Slot] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSpecimen): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Specimen] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeStructureDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureDefinition] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeStructureMap): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureMap] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSubscription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Subscription] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSubstance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Substance] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSupplyDelivery): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyDelivery] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeSupplyRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyRequest] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeTask): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Task] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeTestReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestReport] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeTestScript): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestScript] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeValueSet): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ValueSet] = js.native
  def create(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeVisionPrescription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.VisionPrescription] = js.native
  def create[T /* <: CustomResource */](params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsResourceTypeCustomResourceType[T]): js.Promise[fhirLib.fhirNs.OperationOutcome | T] = js.native
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
  def delete(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeString): js.Promise[fhirLib.fhirNs.OperationOutcome] = js.native
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
  def history(): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_History
  ] = js.native
  def history(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeStringOptional): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_History
  ] = js.native
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
  def nextPage[T /* <: java.lang.String */](params: fhirDashKitDashClientLib.Anon_BundleOptions[T]): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Type[T]
  ] = js.native
  def nextPage[T /* <: java.lang.String */](params: fhirDashKitDashClientLib.Anon_BundleOptions[T], headers: requestLib.requestMod.Headers): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Type[T]
  ] = js.native
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
  def patch(params: fhirDashKitDashClientLib.Anon_AccountHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Account] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ActivityDefinitionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ActivityDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_AdverseEventHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AdverseEvent] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_AllergyIntoleranceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AllergyIntolerance] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_AppointmentHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Appointment] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_AppointmentResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AppointmentResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_AuditEventHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AuditEvent] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_BasicHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Basic] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_BinaryHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Binary] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_BodySiteHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.BodySite] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_BundleHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CapabilityStatementHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CapabilityStatement] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CarePlanHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CarePlan] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CareTeamHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CareTeam] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ChargeItemHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ChargeItem] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ClaimHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Claim] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ClaimResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClaimResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ClinicalImpressionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClinicalImpression] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CodeSystemHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CodeSystem] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CommunicationHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Communication] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CommunicationRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CommunicationRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CompartmentDefinitionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CompartmentDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CompositionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Composition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ConceptMapHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ConceptMap] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ConditionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Condition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ConsentHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Consent] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ContractHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Contract] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_CoverageHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Coverage] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DataElementHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DataElement] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DetectedIssueHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DetectedIssue] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DeviceComponentHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceComponent] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DeviceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Device] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DeviceMetricHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceMetric] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DeviceRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DeviceUseStatementHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceUseStatement] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DiagnosticReportHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DiagnosticReport] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DocumentManifestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentManifest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DocumentReferenceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentReference] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_DomainResourceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DomainResource] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EligibilityRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EligibilityResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EncounterHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Encounter] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EndpointHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Endpoint] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EnrollmentRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EnrollmentResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_EpisodeOfCareHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EpisodeOfCare] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ExpansionProfileHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExpansionProfile] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_ExplanationOfBenefitHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExplanationOfBenefit] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_FamilyMemberHistoryHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.FamilyMemberHistory] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_FlagHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Flag] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_GoalHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Goal] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_GraphDefinitionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GraphDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_GroupHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Group] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_GuidanceResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GuidanceResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersHealthcareServiceId): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.HealthcareService] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdImagingManifest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingManifest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdImagingStudyJSONPatch): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingStudy] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdImmunizationJSONPatch): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Immunization] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdImmunizationRecommendationJSONPatch): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImmunizationRecommendation] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdImplementationGuideJSONPatch): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImplementationGuide] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatch): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Library] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchLinkage): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Linkage] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchList): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.List] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchLocation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Location] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMeasure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Measure] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMeasureReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MeasureReport] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMedia): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Media] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMedication): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Medication] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMedicationAdministration): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationAdministration] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMedicationDispense): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationDispense] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMedicationRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMedicationStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationStatement] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMessageDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchMessageHeader): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageHeader] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchNamingSystem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NamingSystem] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchNutritionOrder): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NutritionOrder] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchObservation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Observation] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOperationDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.OperationDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOperationOutcome): js.Promise[fhirLib.fhirNs.OperationOutcome] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptions): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Organization] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsParameters): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Parameters] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPatient): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Patient] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPaymentNotice): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentNotice] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPaymentReconciliation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentReconciliation] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Person] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPlanDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PlanDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPractitioner): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Practitioner] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsPractitionerRole): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PractitionerRole] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsProcedure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Procedure] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsProcedureRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcedureRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsProcessRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsProcessResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsProvenance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Provenance] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsQuestionnaire): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Questionnaire] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsQuestionnaireResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.QuestionnaireResponse] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsReferralRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ReferralRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsRelatedPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RelatedPerson] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsRequestGroup): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RequestGroup] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResearchStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchStudy] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResearchSubject): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchSubject] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceType): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RiskAssessment] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeArray): js.Promise[fhirLib.fhirNs.OperationOutcome | CustomResource] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSchedule): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Schedule] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSearchParameter): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SearchParameter] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSequence): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Sequence] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeServiceDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ServiceDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSlot): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Slot] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSpecimen): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Specimen] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeStructureDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureDefinition] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeStructureMap): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureMap] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSubscription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Subscription] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSubstance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Substance] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSupplyDelivery): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyDelivery] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeSupplyRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyRequest] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeTask): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Task] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeTestReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestReport] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeTestScript): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestScript] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeValueSet): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ValueSet] = js.native
  def patch(params: fhirDashKitDashClientLib.Anon_HeadersIdJSONPatchOptionsResourceTypeVisionPrescription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.VisionPrescription] = js.native
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
  def prevPage[T /* <: java.lang.String */](params: fhirDashKitDashClientLib.Anon_BundleOptions[T]): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Type[T]
  ] = js.native
  def prevPage[T /* <: java.lang.String */](params: fhirDashKitDashClientLib.Anon_BundleOptions[T], headers: requestLib.requestMod.Headers): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Type[T]
  ] = js.native
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
  def resolve(params: fhirDashKitDashClientLib.Anon_Context): js.Promise[FhirResource] = js.native
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
  def resourceHistory(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeString): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_History
  ] = js.native
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
  def resourceSearch(params: fhirDashKitDashClientLib.Anon_HeadersOptions): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Searchset
  ] = js.native
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
  def search(params: fhirDashKitDashClientLib.Anon_Compartment): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Searchset
  ] = js.native
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
  def smartAuthMetadata(params: fhirDashKitDashClientLib.Anon_Headers): js.Promise[SmartAuthMetadata] = js.native
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
  def systemHistory(): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_History
  ] = js.native
  def systemHistory(params: fhirDashKitDashClientLib.Anon_Headers): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_History
  ] = js.native
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
  def systemSearch(params: fhirDashKitDashClientLib.Anon_HeadersOptionsSearchParams): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Searchset
  ] = js.native
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
  def transaction(params: fhirDashKitDashClientLib.Anon_BodyHeadersOptionsAnonTransaction): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_Transactionresponse
  ] = js.native
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
  def typeHistory(params: fhirDashKitDashClientLib.Anon_HeadersOptionsResourceType): js.Promise[
    (fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle) with fhirDashKitDashClientLib.Anon_History
  ] = js.native
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
  def update(params: fhirDashKitDashClientLib.Anon_AccountBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Account] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_ActivityDefinitionBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ActivityDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_AdverseEventBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AdverseEvent] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_AllergyIntoleranceBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AllergyIntolerance] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_AppointmentBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Appointment] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_AppointmentResponseBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AppointmentResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_AuditEventBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AuditEvent] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BasicBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Basic] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BinaryBodyHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Binary] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyBodySite): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.BodySite] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyBundleHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCapabilityStatementHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CapabilityStatement] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCarePlanHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CarePlan] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCareTeamHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CareTeam] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyChargeItemHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ChargeItem] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyClaimHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Claim] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyClaimResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClaimResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyClinicalImpressionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClinicalImpression] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCodeSystemHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CodeSystem] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCommunicationHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Communication] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCommunicationRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CommunicationRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCompartmentDefinitionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CompartmentDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCompositionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Composition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyConceptMapHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ConceptMap] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyConditionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Condition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyConsentHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Consent] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyContractHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Contract] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyCoverageHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Coverage] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDataElementHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DataElement] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDetectedIssueHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DetectedIssue] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDeviceComponentHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceComponent] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDeviceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Device] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDeviceMetricHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceMetric] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDeviceRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDeviceUseStatementHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceUseStatement] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDiagnosticReportHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DiagnosticReport] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDocumentManifestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentManifest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDocumentReferenceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentReference] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyDomainResourceHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DomainResource] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEligibilityRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEligibilityResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEncounterHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Encounter] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEndpointHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Endpoint] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEnrollmentRequestHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEnrollmentResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyEpisodeOfCareHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EpisodeOfCare] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyExpansionProfileHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExpansionProfile] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyExplanationOfBenefitHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExplanationOfBenefit] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyFamilyMemberHistoryHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.FamilyMemberHistory] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyFlagHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Flag] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyGoalHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Goal] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyGraphDefinitionHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GraphDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyGroupHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Group] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyGuidanceResponseHeaders): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GuidanceResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersHealthcareService): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.HealthcareService] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersId): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingManifest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdImagingStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingStudy] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdImmunization): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Immunization] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdImmunizationRecommendation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImmunizationRecommendation] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdImplementationGuide): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImplementationGuide] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdLibrary): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Library] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdLinkage): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Linkage] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdList): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.List] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdLocation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Location] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMeasure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Measure] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMeasureReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MeasureReport] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMedia): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Media] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMedication): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Medication] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMedicationAdministration): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationAdministration] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMedicationDispense): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationDispense] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMedicationRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMedicationStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationStatement] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMessageDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdMessageHeader): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageHeader] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdNamingSystem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NamingSystem] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdNutritionOrder): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NutritionOrder] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdObservation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Observation] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOperationDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.OperationDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOperationOutcome): js.Promise[fhirLib.fhirNs.OperationOutcome] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptions): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Organization] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsParameters): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Parameters] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPatient): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Patient] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPaymentNotice): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentNotice] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPaymentReconciliation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentReconciliation] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Person] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPlanDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PlanDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPractitioner): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Practitioner] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsPractitionerRole): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PractitionerRole] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsProcedure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Procedure] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsProcedureRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcedureRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsProcessRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsProcessResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsProvenance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Provenance] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsQuestionnaire): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Questionnaire] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsQuestionnaireResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.QuestionnaireResponse] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsReferralRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ReferralRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsRelatedPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RelatedPerson] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsRequestGroup): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RequestGroup] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResearchStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchStudy] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResearchSubject): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchSubject] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceType): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RiskAssessment] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSchedule): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Schedule] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSearchParameter): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SearchParameter] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSequence): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Sequence] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeServiceDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ServiceDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSlot): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Slot] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSpecimen): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Specimen] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeStructureDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureDefinition] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeStructureMap): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureMap] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSubscription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Subscription] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSubstance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Substance] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSupplyDelivery): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyDelivery] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeSupplyRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyRequest] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeTask): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Task] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeTestReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestReport] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeTestScript): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestScript] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeValueSet): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ValueSet] = js.native
  def update(params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeVisionPrescription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.VisionPrescription] = js.native
  def update[T /* <: CustomResource */](params: fhirDashKitDashClientLib.Anon_BodyHeadersIdOptionsResourceTypeCustomResourceType[T]): js.Promise[fhirLib.fhirNs.OperationOutcome | T] = js.native
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
  def vread(params: fhirDashKitDashClientLib.Anon_Account): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Account] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ActivityDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ActivityDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_AdverseEvent): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AdverseEvent] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_AllergyIntolerance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AllergyIntolerance] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Appointment): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Appointment] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_AppointmentResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AppointmentResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_AuditEvent): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.AuditEvent] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Basic): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Basic] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Binary): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Binary] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_BodySite): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.BodySite] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Bundle): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Bundle] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_CapabilityStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CapabilityStatement] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_CarePlan): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CarePlan] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_CareTeam): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CareTeam] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ChargeItem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ChargeItem] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Claim): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Claim] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ClaimResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClaimResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ClinicalImpression): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ClinicalImpression] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_CodeSystem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CodeSystem] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Communication): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Communication] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_CommunicationRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CommunicationRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_CompartmentDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.CompartmentDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Composition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Composition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ConceptMap): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ConceptMap] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Condition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Condition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Consent): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Consent] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Contract): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Contract] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Coverage): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Coverage] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DataElement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DataElement] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DetectedIssue): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DetectedIssue] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Device): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Device] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DeviceComponent): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceComponent] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DeviceMetric): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceMetric] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DeviceRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DeviceUseStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DeviceUseStatement] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DiagnosticReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DiagnosticReport] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DocumentManifest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentManifest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DocumentReference): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DocumentReference] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_DomainResource): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.DomainResource] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_EligibilityRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_EligibilityResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EligibilityResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Encounter): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Encounter] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Endpoint): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Endpoint] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_EnrollmentRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_EnrollmentResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EnrollmentResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_EpisodeOfCare): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.EpisodeOfCare] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ExpansionProfile): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExpansionProfile] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_ExplanationOfBenefit): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ExplanationOfBenefit] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_FamilyMemberHistory): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.FamilyMemberHistory] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Flag): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Flag] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Goal): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Goal] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_GraphDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GraphDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_Group): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Group] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_GuidanceResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.GuidanceResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersHealthcareService): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.HealthcareService] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersId): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingManifest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdImagingStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImagingStudy] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdImmunization): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Immunization] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdImmunizationRecommendation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImmunizationRecommendation] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdImplementationGuide): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ImplementationGuide] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdLibrary): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Library] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdLinkage): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Linkage] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdList): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.List] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdLocation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Location] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMeasure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Measure] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMeasureReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MeasureReport] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMedia): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Media] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMedication): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Medication] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMedicationAdministration): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationAdministration] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMedicationDispense): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationDispense] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMedicationRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMedicationStatement): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MedicationStatement] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMessageDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdMessageHeader): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.MessageHeader] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdNamingSystem): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NamingSystem] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdNutritionOrder): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.NutritionOrder] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdObservation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Observation] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOperationDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.OperationDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOperationOutcome): js.Promise[fhirLib.fhirNs.OperationOutcome] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptions): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Organization] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsParameters): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Parameters] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPatient): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Patient] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPaymentNotice): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentNotice] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPaymentReconciliation): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PaymentReconciliation] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Person] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPlanDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PlanDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPractitioner): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Practitioner] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsPractitionerRole): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.PractitionerRole] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsProcedure): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Procedure] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsProcedureRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcedureRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsProcessRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsProcessResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ProcessResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsProvenance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Provenance] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsQuestionnaire): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Questionnaire] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsQuestionnaireResponse): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.QuestionnaireResponse] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsReferralRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ReferralRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsRelatedPerson): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RelatedPerson] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsRequestGroup): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RequestGroup] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResearchStudy): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchStudy] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResearchSubject): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ResearchSubject] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceType): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.RiskAssessment] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSchedule): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Schedule] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSearchParameter): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SearchParameter] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSequence): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Sequence] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeServiceDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ServiceDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSlot): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Slot] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSpecimen): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Specimen] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeStructureDefinition): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureDefinition] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeStructureMap): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.StructureMap] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSubscription): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Subscription] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSubstance): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Substance] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSupplyDelivery): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyDelivery] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeSupplyRequest): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.SupplyRequest] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeTask): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.Task] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeTestReport): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestReport] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeTestScript): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.TestScript] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeValueSet): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.ValueSet] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeVersion): js.Promise[fhirLib.fhirNs.OperationOutcome | fhirLib.fhirNs.VisionPrescription] = js.native
  def vread(params: fhirDashKitDashClientLib.Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType): js.Promise[fhirLib.fhirNs.OperationOutcome | CustomResource] = js.native
}

