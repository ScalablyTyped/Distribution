package typings.fhirKitClient

import org.scalablytyped.runtime.StringDictionary
import typings.fhirKitClient.anon.BaseUrl
import typings.fhirKitClient.anon.Body
import typings.fhirKitClient.anon.BodyHeaders
import typings.fhirKitClient.anon.Bundle
import typings.fhirKitClient.anon.CompartmentHeaders
import typings.fhirKitClient.anon.Context
import typings.fhirKitClient.anon.Headers
import typings.fhirKitClient.anon.HeadersId
import typings.fhirKitClient.anon.HeadersOptions
import typings.fhirKitClient.anon.Id
import typings.fhirKitClient.anon.JSONPatch
import typings.fhirKitClient.anon.Options
import typings.fhirKitClient.anon.OptionsResourceType
import typings.fhirKitClient.anon.OptionsSearchParams
import typings.fhirKitClient.anon.TypeT
import typings.fhirKitClient.anon.`0`
import typings.fhirKitClient.anon.`2`
import typings.fhirKitClient.anon.`3`
import typings.fhirKitClient.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fhir-kit-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Client {
    /**
      * Create a FHIR client.
      *
      * @param {Object} config Client configuration
      * @param {String} config.baseUrl ISS for FHIR server
      * @param {Object} [config.customHeaders] Optional custom headers to send with
      *   each request
      * @throws An error will be thrown unless baseUrl is a non-empty string.
      */
    def this(config: BaseUrl) = this()
  }
  
  @js.native
  trait Client extends StObject {
    
    var baseUrl: String = js.native
    
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
    def batch(params: BodyHeaders): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `0`)
      ] = js.native
    
    var bearerToken: js.UndefOr[String] = js.native
    
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
    def capabilityStatement(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any
      ] = js.native
    def capabilityStatement(params: Headers): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any
      ] = js.native
    
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
    def compartmentSearch(params: CompartmentHeaders): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `3`)
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
    def create[T /* <: FhirResource */](params: Body[T]): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | T
      ] = js.native
    
    var customHeaders: typings.request.mod.Headers = js.native
    
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
    def delete(params: Id): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any
      ] = js.native
    
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
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `4`)
      ] = js.native
    def history(params: HeadersId): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `4`)
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
    def nextPage[T /* <: String */](params: Bundle[T]): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & TypeT[T])
      ] = js.native
    def nextPage[T /* <: String */](params: Bundle[T], headers: typings.request.mod.Headers): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & TypeT[T])
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
    def patch(params: JSONPatch): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | FhirResource
      ] = js.native
    
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
    def prevPage[T /* <: String */](params: Bundle[T]): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & TypeT[T])
      ] = js.native
    def prevPage[T /* <: String */](params: Bundle[T], headers: typings.request.mod.Headers): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & TypeT[T])
      ] = js.native
    
    /**
      * Get a resource by id.
      *
      * @example
      *
      * // Using promises
      * fhirClient.read({
      *   resourceType: 'Patient',
      *   id: '12345',
      * }).then(data => console.log(data));
      *
      * // Using async
      * let response = await fhirClient.read({
      *   resourceType: 'Patient',
      *   id: '12345',
      * });
      * console.log(response);
      *
      * @param {Object} params - The request parameters.
      * @param {String} params.resourceType - The resource type (e.g. "Patient",
      *   "Observation").
      * @param {String} params.id - The FHIR id for the resource.
      * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
      *   add to the request
      * @param {Object} [params.options] - Optional options object
      * @param {Object} [params.options.headers] - Optional headers to add to the
      *   request
      *
      * @return {Promise<Object>} FHIR resource
      */
    def read(params: Id): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | FhirResource
      ] = js.native
    
    def resolve(params: Context): js.Promise[FhirResource] = js.native
    
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
    def resourceHistory(params: Id): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `4`)
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
    def resourceSearch(params: typings.fhirKitClient.anon.SearchParams): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `3`)
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
    def search(params: typings.fhirKitClient.anon.Compartment): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `3`)
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
    def smartAuthMetadata(params: Headers): js.Promise[SmartAuthMetadata] = js.native
    
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
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `4`)
      ] = js.native
    def systemHistory(params: Headers): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `4`)
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
    def systemSearch(params: OptionsSearchParams): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `3`)
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
    def transaction(params: HeadersOptions): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `2`)
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
    def typeHistory(params: OptionsResourceType): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & `4`)
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
    def update[T /* <: FhirResource */](params: typings.fhirKitClient.anon.ResourceType[T]): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | T
      ] = js.native
    
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
    def vread(params: Options): js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.OperationOutcome */ Any) | FhirResource
      ] = js.native
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
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Resource * / any */ trait CustomResource
    extends StObject
       with /* key */ StringDictionary[Any]
  object CustomResource {
    
    inline def apply(): CustomResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomResource]
    }
  }
  
  type FhirResource = CustomResource | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.FhirResource */ Any)
  
  type ResourceType = String
  
  type SearchParams = StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])]
  
  trait SmartAuthMetadata extends StObject {
    
    var authorizeUrl: js.UndefOr[String] = js.undefined
    
    var manageUrl: js.UndefOr[String] = js.undefined
    
    var registerUrl: js.UndefOr[String] = js.undefined
    
    var tokenUrl: js.UndefOr[String] = js.undefined
  }
  object SmartAuthMetadata {
    
    inline def apply(): SmartAuthMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartAuthMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmartAuthMetadata] (val x: Self) extends AnyVal {
      
      inline def setAuthorizeUrl(value: String): Self = StObject.set(x, "authorizeUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeUrlUndefined: Self = StObject.set(x, "authorizeUrl", js.undefined)
      
      inline def setManageUrl(value: String): Self = StObject.set(x, "manageUrl", value.asInstanceOf[js.Any])
      
      inline def setManageUrlUndefined: Self = StObject.set(x, "manageUrl", js.undefined)
      
      inline def setRegisterUrl(value: String): Self = StObject.set(x, "registerUrl", value.asInstanceOf[js.Any])
      
      inline def setRegisterUrlUndefined: Self = StObject.set(x, "registerUrl", js.undefined)
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
      
      inline def setTokenUrlUndefined: Self = StObject.set(x, "tokenUrl", js.undefined)
    }
  }
}
