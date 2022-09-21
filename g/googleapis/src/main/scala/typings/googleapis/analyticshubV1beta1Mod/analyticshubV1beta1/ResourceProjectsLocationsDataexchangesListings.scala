package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticshub/v1beta1", "analyticshub_v1beta1.Resource$Projects$Locations$Dataexchanges$Listings")
@js.native
open class ResourceProjectsLocationsDataexchangesListings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaListing] = js.native
  def create(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def create(params: ParamsResourceProjectsLocationsDataexchangesListingsCreate): GaxiosPromise[SchemaListing] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDataexchangesListingsCreate,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDataexchangesListingsCreate,
    options: BodyResponseCallback[Readable | SchemaListing],
    callback: BodyResponseCallback[Readable | SchemaListing]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDataexchangesListingsCreate, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDataexchangesListingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  /**
    * Creates a new listing.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.create({
    *       // Required. The ID of the listing to create. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
    *       listingId: 'placeholder-value',
    *       // Required. The parent resource path of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123`.
    *       parent:
    *         'projects/my-project/locations/my-location/dataExchanges/my-dataExchange',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "bigqueryDataset": {},
    *         //   "categories": [],
    *         //   "dataProvider": {},
    *         //   "description": "my_description",
    *         //   "displayName": "my_displayName",
    *         //   "documentation": "my_documentation",
    *         //   "icon": "my_icon",
    *         //   "name": "my_name",
    *         //   "primaryContact": "my_primaryContact",
    *         //   "publisher": {},
    *         //   "requestAccess": "my_requestAccess",
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDataset": {},
    *   //   "categories": [],
    *   //   "dataProvider": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "documentation": "my_documentation",
    *   //   "icon": "my_icon",
    *   //   "name": "my_name",
    *   //   "primaryContact": "my_primaryContact",
    *   //   "publisher": {},
    *   //   "requestAccess": "my_requestAccess",
    *   //   "state": "my_state"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceProjectsLocationsDataexchangesListingsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDataexchangesListingsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDataexchangesListingsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDataexchangesListingsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDataexchangesListingsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDataexchangesListingsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDataexchangesListingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a listing.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.delete({
    *       // Required. Resource name of the listing to delete. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
    *       name: 'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceProjectsLocationsDataexchangesListingsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDataexchangesListingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaListing] = js.native
  def get(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def get(params: ParamsResourceProjectsLocationsDataexchangesListingsGet): GaxiosPromise[SchemaListing] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGet,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGet,
    options: BodyResponseCallback[Readable | SchemaListing],
    callback: BodyResponseCallback[Readable | SchemaListing]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDataexchangesListingsGet, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  /**
    * Gets the details of a listing.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticshub.projects.locations.dataExchanges.listings.get({
    *     // Required. The resource name of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
    *     name: 'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDataset": {},
    *   //   "categories": [],
    *   //   "dataProvider": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "documentation": "my_documentation",
    *   //   "icon": "my_icon",
    *   //   "name": "my_name",
    *   //   "primaryContact": "my_primaryContact",
    *   //   "publisher": {},
    *   //   "requestAccess": "my_requestAccess",
    *   //   "state": "my_state"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProjectsLocationsDataexchangesListingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the IAM policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.getIamPolicy({
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "options": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListListingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListListingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListListingsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDataexchangesListingsList): GaxiosPromise[SchemaListListingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDataexchangesListingsList,
    callback: BodyResponseCallback[SchemaListListingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDataexchangesListingsList,
    options: BodyResponseCallback[Readable | SchemaListListingsResponse],
    callback: BodyResponseCallback[Readable | SchemaListListingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDataexchangesListingsList, options: MethodOptions): GaxiosPromise[SchemaListListingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDataexchangesListingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListListingsResponse]
  ): Unit = js.native
  /**
    * Lists all listings in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticshub.projects.locations.dataExchanges.listings.list(
    *     {
    *       // The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    *       pageSize: 'placeholder-value',
    *       // Page token, returned by a previous call, to request the next page of results.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent resource path of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123`.
    *       parent:
    *         'projects/my-project/locations/my-location/dataExchanges/my-dataExchange',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "listings": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsLocationsDataexchangesListingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDataexchangesListingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaListing] = js.native
  def patch(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def patch(params: ParamsResourceProjectsLocationsDataexchangesListingsPatch): GaxiosPromise[SchemaListing] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDataexchangesListingsPatch,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDataexchangesListingsPatch,
    options: BodyResponseCallback[Readable | SchemaListing],
    callback: BodyResponseCallback[Readable | SchemaListing]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDataexchangesListingsPatch, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDataexchangesListingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  /**
    * Updates an existing listing.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.patch({
    *       // Output only. The resource name of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`
    *       name: 'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *       // Required. Field mask specifies the fields to update in the listing resource. The fields specified in the `updateMask` are relative to the resource and are not a full request.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "bigqueryDataset": {},
    *         //   "categories": [],
    *         //   "dataProvider": {},
    *         //   "description": "my_description",
    *         //   "displayName": "my_displayName",
    *         //   "documentation": "my_documentation",
    *         //   "icon": "my_icon",
    *         //   "name": "my_name",
    *         //   "primaryContact": "my_primaryContact",
    *         //   "publisher": {},
    *         //   "requestAccess": "my_requestAccess",
    *         //   "state": "my_state"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDataset": {},
    *   //   "categories": [],
    *   //   "dataProvider": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "documentation": "my_documentation",
    *   //   "icon": "my_icon",
    *   //   "name": "my_name",
    *   //   "primaryContact": "my_primaryContact",
    *   //   "publisher": {},
    *   //   "requestAccess": "my_requestAccess",
    *   //   "state": "my_state"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceProjectsLocationsDataexchangesListingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDataexchangesListingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the IAM policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def subscribe(): GaxiosPromise[SchemaSubscribeListingResponse] = js.native
  def subscribe(callback: BodyResponseCallback[SchemaSubscribeListingResponse]): Unit = js.native
  def subscribe(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscribeListingResponse] = js.native
  def subscribe(params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe): GaxiosPromise[SchemaSubscribeListingResponse] = js.native
  def subscribe(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe,
    callback: BodyResponseCallback[SchemaSubscribeListingResponse]
  ): Unit = js.native
  def subscribe(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe,
    options: BodyResponseCallback[Readable | SchemaSubscribeListingResponse],
    callback: BodyResponseCallback[Readable | SchemaSubscribeListingResponse]
  ): Unit = js.native
  def subscribe(params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe, options: MethodOptions): GaxiosPromise[SchemaSubscribeListingResponse] = js.native
  def subscribe(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscribeListingResponse]
  ): Unit = js.native
  /**
    * Subscribes to a listing. Currently, with Analytics Hub, you can create listings that reference only BigQuery datasets. Upon subscription to a listing for a BigQuery dataset, Analytics Hub creates a linked dataset in the subscriber's project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.subscribe({
    *       // Required. Resource name of the listing that you want to subscribe to. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`.
    *       name: 'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "destinationDataset": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def subscribe(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def subscribe(
    params: ParamsResourceProjectsLocationsDataexchangesListingsSubscribe,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns the permissions that a caller has.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticshub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticshub = google.analyticshub('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await analyticshub.projects.locations.dataExchanges.listings.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/dataExchanges/my-dataExchange/listings/my-listing',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDataexchangesListingsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
