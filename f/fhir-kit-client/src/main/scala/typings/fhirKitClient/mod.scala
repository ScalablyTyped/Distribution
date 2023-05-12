package typings.fhirKitClient

import org.scalablytyped.runtime.StringDictionary
import typings.fhirKitClient.anon.BaseUrl
import typings.fhirKitClient.anon.Body
import typings.fhirKitClient.anon.BodyHeaders
import typings.fhirKitClient.anon.BodyHeadersOptions
import typings.fhirKitClient.anon.Bundle
import typings.fhirKitClient.anon.CapabilityType
import typings.fhirKitClient.anon.CapabilityTypeResourceType
import typings.fhirKitClient.anon.CompartmentHeaders
import typings.fhirKitClient.anon.Context
import typings.fhirKitClient.anon.Headers
import typings.fhirKitClient.anon.HeadersId
import typings.fhirKitClient.anon.HeadersOptions
import typings.fhirKitClient.anon.HeadersOptionsResourceType
import typings.fhirKitClient.anon.Id
import typings.fhirKitClient.anon.Input
import typings.fhirKitClient.anon.JSONPatch
import typings.fhirKitClient.anon.Options
import typings.fhirKitClient.anon.OptionsResourceType
import typings.fhirKitClient.anon.OptionsSearchParams
import typings.fhirKitClient.anon.TypeT
import typings.fhirKitClient.anon.`0`
import typings.fhirKitClient.anon.`2`
import typings.fhirKitClient.anon.`3`
import typings.fhirKitClient.anon.`4`
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.Request
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fhir-kit-client", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Client {
    def this(config: BaseUrl) = this()
  }
  /* static members */
  object default {
    
    @JSImport("fhir-kit-client", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a Client response, returns the underlying HTTP request and response
      * objects.
      * @example
      * const Client = require('fhir-kit-client');
      *
      * fhirClient.read({
      *   resourceType: 'Patient',
      *   id: 12345,
      * }).then((data) => {
      *   const { response, request } = Client.httpFor(data);
      *   console.log(response.status);
      *   console.log(request.headers);
      * });
      * @param requestResponse - to one of the FHIR Kit Client requests
      * @returns object containing http request and response
      */
    inline def httpFor(fhirResource: FhirResource): RequestResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("httpFor")(fhirResource.asInstanceOf[js.Any]).asInstanceOf[RequestResponse]
  }
  
  /**
    * Access capabilities
    * @param capabilityStatement - capability statement FHIR resource
    */
  trait CapabilityTool extends StObject {
    
    /**
      * Return the contents of a specific resource capability from the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const conditionalDeleteSupport = capabilities.capabilityContents({
      *   resourceType: 'Patient',
      *   capabilityType: 'conditionalDelete'
      * });
      * console.log(conditionalDeleteSupport);
      * @param params - The capability parameters.
      * @param params.resourceType - Resource type (e.g. 'Patient', 'Observation').
      * @param params.capabilityType - Capability type (e.g. 'interaction', 'searchParam').
      * @returns The contents of a given capability as listed in the capability statement.
      */
    def capabilityContents(params: CapabilityTypeResourceType): Any
    
    /**
      * Return interactions available for a resource type based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const supportedPatientInteractions = capabilities.interactionsFor({ resourceType: 'Patient'});
      * console.log(supportedPatientInteractions);
      * @param params - The capability parameters.
      * @param params.resourceType - Resource type (e.g. 'Patient', 'Observation').
      * @returns A list of supported interactions for the given resource type.
      */
    def interactionsFor(params: typings.fhirKitClient.anon.ResourceType): js.Array[String]
    
    /**
      * Return resource-level interaction support information based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const patientReadSupport = capabilities.resourceCan('Patient', 'read');
      * console.log(patientReadSupport);
      * @param resource - The resource to check interaction support for.
      * @param interaction - The interaction to check resource-level capability for.
      * @returns Whether or not the interaction is supported for the given resource.
      */
    def resourceCan(resource: String, interaction: String): Boolean
    
    /**
      * Return all capabilities for a given resource from the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const patientCapabilities = capabilities.resourceCapabilities({ resourceType: 'Patient'});
      * console.log(patientCapabilities);
      * @param params - The capability parameters.
      * @param params.resourceType - Resource type (e.g. 'Patient', 'Observation').
      * @returns The contents of a given resource as listed in the capability statement.
      */
    def resourceCapabilities(params: typings.fhirKitClient.anon.ResourceType): Any
    
    /**
      * Return resource-level searchParam support information based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const patientGenderSearchSupport = capabilities.resourceSearch('Patient', 'gender');
      * console.log(patientGenderSearchSupport);
      * @param resource - The resource to check searchParam support for.
      * @param searchParam - The searchParam to check resource-level capability for.
      * @returns Whether or not the searchParam is supported for the given resource.
      */
    def resourceSearch(resource: String, searchParam: String): Boolean
    
    /**
      * Return searchParams available for a resource type based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const supportedPatientSearchParams = capabilities.searchParamsFor({ resourceType: 'Patient'});
      * console.log(supportedPatientSearchParams);
      * @param params - The capability parameters.
      * @param params.resourceType - Resource type (e.g. 'Patient', 'Observation').
      * @returns A list of supported searchParams for the given resource type.
      */
    def searchParamsFor(params: typings.fhirKitClient.anon.ResourceType): js.Array[String]
    
    /**
      * Return server-level interaction support information based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const serverBatchSupport = capabilities.serverCan('batch');
      * console.log(serverBatchSupport);
      * @param interaction - The interaction to check server-level capability for.
      * @returns Whether or not the interaction is supported by the server.
      */
    def serverCan(interaction: String): Boolean
    
    /**
      * Return all server-level capabilities.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const serverCapabilities = capabilities.serverCapabilities();
      * console.log(serverCapabilities);
      * @returns All REST capabilities for the mode 'server'.
      */
    def serverCapabilities(): Any
    
    /**
      * Return server-level searchParam support information based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      * const lastUpdatedSupport = capabilities.serverSearch('_lastUpdated');
      * console.log(lastUpdatedSupport);
      * @param searchParam - The searchParam to check server-level capability for.
      * @returns Whether or not the searchParam is supported by the server.
      */
    def serverSearch(searchParam: String): Boolean
    
    /**
      * Return capability support information based on the capability statement.
      * @example
      * const capabilities = new CapabilityTool(capabilityStatement);
      *
      * // Server-level capability support
      * const interactionSupport = capabilities.supportFor({
      *   capabilityType: 'interaction'
      * });
      * console.log(interactionSupport);
      *
      * // Server-level capability support for specific code
      * const interactionSupport = capabilities.supportFor({
      *   capabilityType: 'interaction',
      *   where: { code: 'history-system' }
      * });
      * console.log(interactionSupport);
      *
      * // Resource-level capability support
      * const patientConditionalCreateSupport = capabilities.supportFor({
      *   resourceType: 'Patient',
      *   capabilityType: 'conditionalCreate'
      * });
      * console.log(patientConditionalCreateSupport);
      *
      * // Capability support for specific code
      * const patientReadSupport = capabilities.supportFor({
      *   resourceType: 'Patient',
      *   capabilityType: 'interaction',
      *   where: { code: 'read' }
      * });
      * console.log(patientReadSupport);
      *
      * // Capability support for specific name
      * const patientBirthDateSearchSupport = capabilities.supportFor({
      *   resourceType: 'Patient',
      *   capabilityType: 'searchParam',
      *   where: { name: 'birthdate' }
      * });
      * console.log(patientBirthDateSearchSupport);
      * @param params - The capability parameters.
      * @param [params.resourceType] - Resource type (e.g. 'Patient', 'Observation'), optional.
      * @param params.capabilityType - Capability type (e.g. 'interaction', 'searchParam').
      * @param [params.where] - Check additional level of compatibility, optional.
      * @param [params.where.code] - Specify a code (e.g., 'read' for interaction), optional.
      * @param [params.where.name] - Specify a name (e.g., 'type' for searchParam), optional.
      * @returns If the capability, code, or name is supported for the resource.
      */
    def supportFor(params: CapabilityType): Boolean
  }
  object CapabilityTool {
    
    inline def apply(
      capabilityContents: CapabilityTypeResourceType => Any,
      interactionsFor: typings.fhirKitClient.anon.ResourceType => js.Array[String],
      resourceCan: (String, String) => Boolean,
      resourceCapabilities: typings.fhirKitClient.anon.ResourceType => Any,
      resourceSearch: (String, String) => Boolean,
      searchParamsFor: typings.fhirKitClient.anon.ResourceType => js.Array[String],
      serverCan: String => Boolean,
      serverCapabilities: () => Any,
      serverSearch: String => Boolean,
      supportFor: CapabilityType => Boolean
    ): CapabilityTool = {
      val __obj = js.Dynamic.literal(capabilityContents = js.Any.fromFunction1(capabilityContents), interactionsFor = js.Any.fromFunction1(interactionsFor), resourceCan = js.Any.fromFunction2(resourceCan), resourceCapabilities = js.Any.fromFunction1(resourceCapabilities), resourceSearch = js.Any.fromFunction2(resourceSearch), searchParamsFor = js.Any.fromFunction1(searchParamsFor), serverCan = js.Any.fromFunction1(serverCan), serverCapabilities = js.Any.fromFunction0(serverCapabilities), serverSearch = js.Any.fromFunction1(serverSearch), supportFor = js.Any.fromFunction1(supportFor))
      __obj.asInstanceOf[CapabilityTool]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapabilityTool] (val x: Self) extends AnyVal {
      
      inline def setCapabilityContents(value: CapabilityTypeResourceType => Any): Self = StObject.set(x, "capabilityContents", js.Any.fromFunction1(value))
      
      inline def setInteractionsFor(value: typings.fhirKitClient.anon.ResourceType => js.Array[String]): Self = StObject.set(x, "interactionsFor", js.Any.fromFunction1(value))
      
      inline def setResourceCan(value: (String, String) => Boolean): Self = StObject.set(x, "resourceCan", js.Any.fromFunction2(value))
      
      inline def setResourceCapabilities(value: typings.fhirKitClient.anon.ResourceType => Any): Self = StObject.set(x, "resourceCapabilities", js.Any.fromFunction1(value))
      
      inline def setResourceSearch(value: (String, String) => Boolean): Self = StObject.set(x, "resourceSearch", js.Any.fromFunction2(value))
      
      inline def setSearchParamsFor(value: typings.fhirKitClient.anon.ResourceType => js.Array[String]): Self = StObject.set(x, "searchParamsFor", js.Any.fromFunction1(value))
      
      inline def setServerCan(value: String => Boolean): Self = StObject.set(x, "serverCan", js.Any.fromFunction1(value))
      
      inline def setServerCapabilities(value: () => Any): Self = StObject.set(x, "serverCapabilities", js.Any.fromFunction0(value))
      
      inline def setServerSearch(value: String => Boolean): Self = StObject.set(x, "serverSearch", js.Any.fromFunction1(value))
      
      inline def setSupportFor(value: CapabilityType => Boolean): Self = StObject.set(x, "supportFor", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Client extends StObject {
    
    var baseUrl: String = js.native
    
    /**
      * Submit a set of actions to perform independently as a batch.
      *
      * Update, create or delete a set of resources in a single interaction.
      * There should be no interdependencies between entries in the bundle.
      * @example
      * const requestBundle = {
      *   'resourceType': 'Bundle',
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
      *   body: requestBundle
      * }).then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.batch({
      *   body: requestBundle
      * });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.body - The request body with a type of 'batch'.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def batch(params: HeadersOptions): js.Promise[FhirResource | (FhirResource & `0`)] = js.native
    
    var bearerToken: js.UndefOr[String] = js.native
    
    /**
      * Get the capability statement.
      * @example
      * // Using promises
      * fhirClient.capabilityStatement().then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.capabilityStatement();
      * console.log(response);
      * @param [params] - The request parameters.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns capability statement FHIR resource.
      */
    def capabilityStatement(): js.Promise[FhirResource] = js.native
    def capabilityStatement(params: Headers): js.Promise[FhirResource] = js.native
    
    /**
      * Search for FHIR resources within a compartment.
      * The resourceType and id must be specified.
      * @example
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
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.compartment - The search compartment.
      * @param [params.searchParams] - The search parameters, optional.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @param [params.options.postSearch] - if true, all `searchParams`
      *   will be placed in the request body rather than the url, and the search
      *   will use POST rather than GET
      * @returns FHIR resources in a Bundle
      */
    def compartmentSearch(params: CompartmentHeaders): js.Promise[FhirResource | (FhirResource & `3`)] = js.native
    
    /**
      * Create a resource.
      * @example
      * const newPatient = {
      *   resourceType: 'Patient',
      *   active: true,
      *   name: [{ use: 'official', family: 'Coleman', given: ['Lisa', 'P.'] }],
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
      * @param params - The request parameters.
      * @param params.resourceType - The FHIR resource type.
      * @param params.body - The new resource data to create.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resource
      */
    def create[T /* <: FhirResource */](params: BodyHeaders[T]): js.Promise[FhirResource | T] = js.native
    
    var customHeaders: HeadersInit = js.native
    
    /**
      * Delete a resource by FHIR id.
      * @example
      * // Using promises
      * fhirClient.delete({
      *   resourceType: 'Patient',
      *   id: 12345,
      * }).then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.delete({ resourceType: 'Patient', id: 12345 });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient", "Observation").
      * @param params.id - The FHIR id for the resource.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns Operation Outcome FHIR resource
      */
    def delete(params: Id): js.Promise[FhirResource] = js.native
    
    /**
      * Retrieve the change history for a FHIR resource id, a resource type or the
      * entire system
      * @example
      * // Using promises
      * fhirClient.history({ resourceType: 'Patient', id: '12345' });
      *   .then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.history({ resourceType: 'Patient', id: '12345' });
      * console.log(response);
      * @param params - The request parameters.
      * @param [params.resourceType] - The resource type
      *   (e.g. "Patient", "Observation"), optional.
      * @param [params.id] - The FHIR id for the resource, optional.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def history(): js.Promise[FhirResource | (FhirResource & `4`)] = js.native
    def history(params: HeadersId): js.Promise[FhirResource | (FhirResource & `4`)] = js.native
    
    /**
      * Return the next page of results.
      * @param params - The request parameters. Passing the bundle as the
      *   first parameter is DEPRECATED
      * @param params.bundle - Bundle result of a FHIR search
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @param [headers] - DEPRECATED Optional custom headers to add to
      *   the request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def nextPage[T /* <: String */](params: Bundle[T]): js.Promise[FhirResource | (FhirResource & TypeT[T])] = js.native
    
    /**
      * Run a custom FHIR operation on system, resource type or instance level.
      *
      * - To run a system-level operation, omit the resourceType and id parameters.
      * - To run a type-level operatiion, include the resourceType and omit the id parameter.
      * - To run an instance-type operation, include both the resourceType and id.
      * @example
      * client.operation({ resourceType: 'ConceptMap', name: '$apply' }).
      *   then(result => console.log(result).
      *   catch(e => console.error(e));
      *
      *
      * const input = {
      *  system: 'http://hl7.org/fhir/composition-status',
      *  code: 'preliminary',
      *  source: 'http://hl7.org/fhir/ValueSet/composition-status',
      *  target: 'http://hl7.org/fhir/ValueSet/v3-ActStatus'
      * };
      *
      * client.operation({resourceType: 'ConceptMap', name: 'translate', method: 'get', input}).
      *   then(result => console.log(result)).
      *   catch(e => console.error(e));
      * @param params - The request parameters.
      * @param params.name - The name of the operation (will get
      *    prepended with $ if missing.
      * @param [params.resourceType] - Optional The resource type (e.g. "Patient",
      *   "Observation")
      * @param [params.id] - Optional FHIR id for the resource
      * @param [params.method] - Optional The HTTP method (POST or GET, defaults to post)
      * @param [params.input] - Optional input object for the operation
      * @param [params.options] - Optional options object
      * @returns Result of opeartion (e.g. FHIR Parameter)
      */
    def operation(params: Input): js.Promise[FhirResource | Any] = js.native
    
    /**
      * Patch a resource by FHIR id.
      *
      * From http://hl7.org/fhir/STU3/http.html#patch:
      * Content-Type is 'application/json-patch+json'
      * Expects a JSON Patch document format, see http://jsonpatch.com/
      * @example
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
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.id - The FHIR id for the resource.
      * @param params.JSONPatch - A JSON Patch document containing an array
      *   of patch operations, formatted according to http://jsonpatch.com/.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resource
      */
    def patch(params: JSONPatch): js.Promise[FhirResource] = js.native
    
    /**
      * Return the previous page of results.
      * @param params - The request parameters. Passing the bundle as the
      *   first parameter is DEPRECATED
      * @param params.bundle - Bundle result of a FHIR search
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @param [headers] - DEPRECATED Optional custom headers to add to
      *   the request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def prevPage[T /* <: String */](params: Bundle[T]): js.Promise[FhirResource | (FhirResource & TypeT[T])] = js.native
    
    /**
      * Get a resource by FHIR id.
      * @example
      * // Using promises
      * fhirClient.read({
      *   resourceType: 'Patient',
      *   id: 12345,
      * }).then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.read({ resourceType: 'Patient', id: 12345 });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.id - The FHIR id for the resource.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resource
      */
    def read(params: Id): js.Promise[FhirResource] = js.native
    
    /**
      * Run a request.
      * @example
      * // Defaults to GET
      * fhirClient.request('Patient/123')
      *   .then(data => console.log(data));
      *
      * fhirClient.request('Patient/123', { method: 'DELETE'})
      *   .then(data => console.log(data));
      *
      * fhirClient.request('Patient', { method: 'POST', body: myNewPatient })
      *   .then(data => console.log(data));
      * @param requestUrl - URL, can be relative to base or absolute
      * @param params - (optional) Request params
      * @param params.method - (optional) HTTP method (defaults to GET)
      * @param params.options - (optional) additional request options (e.g. headers)
      * @param params.body - (optional) request body
      * @returns Response
      */
    def request(requestUrl: String): js.Promise[js.Object] = js.native
    def request(requestUrl: String, params: Body): js.Promise[js.Object] = js.native
    
    /**
      * Resolve a reference and return FHIR resource
      *
      * From: http://hl7.org/fhir/STU3/references.html, a reference can be: 1)
      * absolute URL, 2) relative URL or 3) an internal fragement. In the case of
      * (2), there are rules on resolving references that are in a FHIR bundle.
      * @example
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
      * @param params - The request parameters.
      * @param params.reference - FHIR reference
      * @param [params.context] - Optional bundle or FHIR resource
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resource
      */
    def resolve(params: Context): js.Promise[FhirResource] = js.native
    
    /**
      * Retrieve the change history for a particular resource FHIR id.
      * @example
      * // Using promises
      * fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
      *           .then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.id - The FHIR id for the resource.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def resourceHistory(params: Id): js.Promise[FhirResource | (FhirResource & `4`)] = js.native
    
    /**
      * Search for a FHIR resource.
      * @example
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
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.searchParams - The search parameters.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @param [params.options.postSearch] - if true, all `searchParams`
      *   will be placed in the request body rather than the url, and the search
      *   will use POST rather than GET
      * @returns FHIR resources in a Bundle
      */
    def resourceSearch(params: OptionsResourceType): js.Promise[FhirResource | (FhirResource & `3`)] = js.native
    
    /**
      * Search for a FHIR resource, with or without compartments, or the entire
      * system
      * @example
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
      * @param params - The request parameters.
      * @param [params.resourceType] - The resource type
      *   (e.g. "Patient", "Observation"), optional.
      * @param [params.compartment] - The search compartment, optional.
      * @param [params.searchParams] - The search parameters, optional.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @param [params.options.postSearch] - if true, all `searchParams`
      *   will be placed in the request body rather than the url, and the search
      *   will use POST rather than GET
      * @returns FHIR resources in a Bundle
      */
    def search(params: typings.fhirKitClient.anon.Compartment): js.Promise[FhirResource | (FhirResource & `3`)] = js.native
    
    /**
      * Obtain the SMART OAuth URLs from the Capability Statement, or
      * any of the .well-known addresses.
      *
      * See: http://docs.smarthealthit.org/authorization/conformance-statement/
      * @example
      * // Using promises
      * fhirClient.smartAuthMetadata().then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.smartAuthMetadata();
      * console.log(response);
      * @param [params] - The request parameters.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns contains the following SMART URL: authorizeUrl,
      *   tokenUrl, registerUrl, manageUrl
      */
    def smartAuthMetadata(): js.Promise[SmartAuthMetadata] = js.native
    def smartAuthMetadata(params: Headers): js.Promise[SmartAuthMetadata] = js.native
    
    /**
      * Retrieve the change history for all resources.
      * @example
      * // Using promises
      * fhirClient.systemHistory();
      *           .then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.systemHistory();
      * console.log(response);
      * @param [params] - The request parameters.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def systemHistory(): js.Promise[FhirResource | (FhirResource & `4`)] = js.native
    def systemHistory(params: Headers): js.Promise[FhirResource | (FhirResource & `4`)] = js.native
    
    /**
      * Search across all FHIR resource types in the system.
      * Only the parameters defined for all resources can be used.
      * @example
      * // Using promises
      * fhirClient.systemSearch({
      *   searchParams: { name: 'smith' }
      * }).then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.systemSearch({ searchParams: { name: 'smith' } });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.searchParams - The search parameters.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @param [params.options.postSearch] - if true, all `searchParams`
      *   will be placed in the request body rather than the url, and the search
      *   will use POST rather than GET
      * @returns FHIR resources in a Bundle
      */
    def systemSearch(params: OptionsSearchParams): js.Promise[FhirResource | (FhirResource & `3`)] = js.native
    
    /**
      * Submit a set of actions to perform independently as a transaction.
      *
      * Update, create or delete a set of resources in a single interaction.
      * The entire set of changes should succeed or fail as a single entity.
      * Multiple actions on multiple resources different types may be submitted.
      * The outcome should not depend on the order of the resources loaded.
      * Order of processing actions: DELETE, POST, PUT, and GET.
      * The transaction fails if any resource overlap in DELETE, POST and PUT.
      * @example
      * const requestBundle = {
      *   'resourceType': 'Bundle',
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
      *   body: requestBundle
      * }).then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.transaction({
      *   body: requestBundle
      * });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.body - The request body with a type of
      *   'transaction'.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def transaction(params: BodyHeadersOptions): js.Promise[FhirResource | (FhirResource & `2`)] = js.native
    
    /**
      * Retrieve the change history for a particular resource type.
      * @example
      * // Using promises
      * fhirClient.typeHistory({ resourceType: 'Patient' });
      *           .then((data) => { console.log(data); });
      *
      * // Using async
      * let response = await fhirClient.typeHistory({ resourceType: 'Patient' });
      * console.log(response);
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resources in a FHIR Bundle structure.
      */
    def typeHistory(params: HeadersOptionsResourceType): js.Promise[FhirResource | (FhirResource & `4`)] = js.native
    
    /**
      * Update a resource by FHIR id.
      * @example
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
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.id - The FHIR id for the resource.
      * @param params.searchParams - For a conditional update the searchParams are specified instead of the id, see https://www.hl7.org/fhir/http.html#cond-update
      * @param params.body - The resource to be updated.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resource
      */
    def update[T /* <: FhirResource */](params: typings.fhirKitClient.anon.SearchParams[T]): js.Promise[FhirResource | T] = js.native
    
    /**
      * Get a resource by id and version.
      * @example
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
      * @param params - The request parameters.
      * @param params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param params.id - The FHIR id for the resource.
      * @param params.version - The version id for the resource.
      * @param [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param [params.options] - Optional options object
      * @param [params.options.headers] - Optional headers to add to the
      *   request
      * @returns FHIR resource
      */
    def vread(params: Options): js.Promise[FhirResource] = js.native
  }
  
  trait Compartment extends StObject {
    
    var id: String
    
    var resourceType: String
  }
  object Compartment {
    
    inline def apply(id: String, resourceType: String): Compartment = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compartment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compartment] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait FhirResource extends StObject {
    
    var resourceType: ResourceType
  }
  object FhirResource {
    
    inline def apply(resourceType: ResourceType): FhirResource = {
      val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FhirResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FhirResource] (val x: Self) extends AnyVal {
      
      inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fhirKitClient.fhirKitClientStrings.GET
    - typings.fhirKitClient.fhirKitClientStrings.HEAD
    - typings.fhirKitClient.fhirKitClientStrings.POST
    - typings.fhirKitClient.fhirKitClientStrings.PUT
    - typings.fhirKitClient.fhirKitClientStrings.DELETE
    - typings.fhirKitClient.fhirKitClientStrings.CONNECT
    - typings.fhirKitClient.fhirKitClientStrings.OPTIONS
    - typings.fhirKitClient.fhirKitClientStrings.TRACE
    - typings.fhirKitClient.fhirKitClientStrings.PATCH
  */
  trait HttpMethods extends StObject
  object HttpMethods {
    
    inline def CONNECT: typings.fhirKitClient.fhirKitClientStrings.CONNECT = "CONNECT".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.CONNECT]
    
    inline def DELETE: typings.fhirKitClient.fhirKitClientStrings.DELETE = "DELETE".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.DELETE]
    
    inline def GET: typings.fhirKitClient.fhirKitClientStrings.GET = "GET".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.GET]
    
    inline def HEAD: typings.fhirKitClient.fhirKitClientStrings.HEAD = "HEAD".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.HEAD]
    
    inline def OPTIONS: typings.fhirKitClient.fhirKitClientStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.OPTIONS]
    
    inline def PATCH: typings.fhirKitClient.fhirKitClientStrings.PATCH = "PATCH".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.PATCH]
    
    inline def POST: typings.fhirKitClient.fhirKitClientStrings.POST = "POST".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.POST]
    
    inline def PUT: typings.fhirKitClient.fhirKitClientStrings.PUT = "PUT".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.PUT]
    
    inline def TRACE: typings.fhirKitClient.fhirKitClientStrings.TRACE = "TRACE".asInstanceOf[typings.fhirKitClient.fhirKitClientStrings.TRACE]
  }
  
  /* Inlined parent std.Omit<std.RequestInit, 'method'> */
  trait RequestInitWithoutMethod extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object RequestInitWithoutMethod {
    
    inline def apply(): RequestInitWithoutMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInitWithoutMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInitWithoutMethod] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait RequestResponse extends StObject {
    
    var request: Request
    
    var response: Response
  }
  object RequestResponse {
    
    inline def apply(request: Request, response: Response): RequestResponse = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResponse] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type ResourceType = String
  
  type SearchParams = StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])]
  
  trait SmartAuthMetadata extends StObject {
    
    var authorizeUrl: js.UndefOr[URL] = js.undefined
    
    var manageUrl: js.UndefOr[URL] = js.undefined
    
    var registerUrl: js.UndefOr[URL] = js.undefined
    
    var tokenUrl: js.UndefOr[URL] = js.undefined
  }
  object SmartAuthMetadata {
    
    inline def apply(): SmartAuthMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartAuthMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmartAuthMetadata] (val x: Self) extends AnyVal {
      
      inline def setAuthorizeUrl(value: URL): Self = StObject.set(x, "authorizeUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeUrlUndefined: Self = StObject.set(x, "authorizeUrl", js.undefined)
      
      inline def setManageUrl(value: URL): Self = StObject.set(x, "manageUrl", value.asInstanceOf[js.Any])
      
      inline def setManageUrlUndefined: Self = StObject.set(x, "manageUrl", js.undefined)
      
      inline def setRegisterUrl(value: URL): Self = StObject.set(x, "registerUrl", value.asInstanceOf[js.Any])
      
      inline def setRegisterUrlUndefined: Self = StObject.set(x, "registerUrl", js.undefined)
      
      inline def setTokenUrl(value: URL): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
      
      inline def setTokenUrlUndefined: Self = StObject.set(x, "tokenUrl", js.undefined)
    }
  }
}
