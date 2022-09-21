package typings.googleapis.appengineV1Mod.appengineV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps")
@js.native
open class ResourceApps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var authorizedCertificates: ResourceAppsAuthorizedcertificates = js.native
  
  var authorizedDomains: ResourceAppsAuthorizeddomains = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceAppsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAppsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAppsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates an App Engine application for a Google Cloud Platform project. Required fields: id - The ID of the target Cloud Platform project. location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/standard/python/console/).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appengine.apps.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authDomain": "my_authDomain",
    *       //   "codeBucket": "my_codeBucket",
    *       //   "databaseType": "my_databaseType",
    *       //   "defaultBucket": "my_defaultBucket",
    *       //   "defaultCookieExpiration": "my_defaultCookieExpiration",
    *       //   "defaultHostname": "my_defaultHostname",
    *       //   "dispatchRules": [],
    *       //   "featureSettings": {},
    *       //   "gcrDomain": "my_gcrDomain",
    *       //   "iap": {},
    *       //   "id": "my_id",
    *       //   "locationId": "my_locationId",
    *       //   "name": "my_name",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "servingStatus": "my_servingStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceAppsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAppsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var domainMappings: ResourceAppsDomainmappings = js.native
  
  var firewall: ResourceAppsFirewall = js.native
  
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceAppsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceAppsGet, callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: BodyResponseCallback[Readable | SchemaApplication],
    callback: BodyResponseCallback[Readable | SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceAppsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  /**
    * Gets information about an application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/appengine.admin',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appengine.apps.get({
    *     // Part of `name`. Name of the Application resource to get. Example: apps/myapp.
    *     appsId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authDomain": "my_authDomain",
    *   //   "codeBucket": "my_codeBucket",
    *   //   "databaseType": "my_databaseType",
    *   //   "defaultBucket": "my_defaultBucket",
    *   //   "defaultCookieExpiration": "my_defaultCookieExpiration",
    *   //   "defaultHostname": "my_defaultHostname",
    *   //   "dispatchRules": [],
    *   //   "featureSettings": {},
    *   //   "gcrDomain": "my_gcrDomain",
    *   //   "iap": {},
    *   //   "id": "my_id",
    *   //   "locationId": "my_locationId",
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "servingStatus": "my_servingStatus"
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
  def get(params: ParamsResourceAppsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceAppsLocations = js.native
  
  var operations: ResourceAppsOperations = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAppsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAppsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the specified Application resource. You can update the following fields: auth_domain - Google authentication domain for controlling user access to the application. default_cookie_expiration - Cookie expiration policy for the application. iap - Identity-Aware Proxy properties for the application.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appengine.apps.patch({
    *     // Part of `name`. Name of the Application resource to update. Example: apps/myapp.
    *     appsId: 'placeholder-value',
    *     // Required. Standard field mask for the set of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authDomain": "my_authDomain",
    *       //   "codeBucket": "my_codeBucket",
    *       //   "databaseType": "my_databaseType",
    *       //   "defaultBucket": "my_defaultBucket",
    *       //   "defaultCookieExpiration": "my_defaultCookieExpiration",
    *       //   "defaultHostname": "my_defaultHostname",
    *       //   "dispatchRules": [],
    *       //   "featureSettings": {},
    *       //   "gcrDomain": "my_gcrDomain",
    *       //   "iap": {},
    *       //   "id": "my_id",
    *       //   "locationId": "my_locationId",
    *       //   "name": "my_name",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "servingStatus": "my_servingStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceAppsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAppsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def repair(): GaxiosPromise[SchemaOperation] = js.native
  def repair(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def repair(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def repair(params: ParamsResourceAppsRepair): GaxiosPromise[SchemaOperation] = js.native
  def repair(params: ParamsResourceAppsRepair, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def repair(
    params: ParamsResourceAppsRepair,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def repair(params: ParamsResourceAppsRepair, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def repair(
    params: ParamsResourceAppsRepair,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account. Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account. If you have deleted your App Engine service account, this will not be able to recreate it. Instead, you should attempt to use the IAM undelete API if possible at https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts/undelete?apix_params=%7B"name"%3A"projects%2F-%2FserviceAccounts%2Funique_id"%2C"resource"%3A%7B%7D%7D . If the deletion was recent, the numeric ID can be found in the Cloud Console Activity Log.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appengine.apps.repair({
    *     // Part of `name`. Name of the application to repair. Example: apps/myapp
    *     appsId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def repair(params: ParamsResourceAppsRepair, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def repair(
    params: ParamsResourceAppsRepair,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var services: ResourceAppsServices = js.native
}
