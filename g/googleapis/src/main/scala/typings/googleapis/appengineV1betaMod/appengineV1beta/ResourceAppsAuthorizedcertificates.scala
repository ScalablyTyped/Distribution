package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Authorizedcertificates")
@js.native
open class ResourceAppsAuthorizedcertificates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(callback: BodyResponseCallback[SchemaAuthorizedCertificate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(params: ParamsResourceAppsAuthorizedcertificatesCreate): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    options: BodyResponseCallback[Readable | SchemaAuthorizedCertificate],
    callback: BodyResponseCallback[Readable | SchemaAuthorizedCertificate]
  ): Unit = js.native
  def create(params: ParamsResourceAppsAuthorizedcertificatesCreate, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  /**
    * Uploads the specified SSL certificate.
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
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.authorizedCertificates.create({
    *     // Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    *     appsId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "certificateRawData": {},
    *       //   "displayName": "my_displayName",
    *       //   "domainMappingsCount": 0,
    *       //   "domainNames": [],
    *       //   "expireTime": "my_expireTime",
    *       //   "id": "my_id",
    *       //   "managedCertificate": {},
    *       //   "name": "my_name",
    *       //   "visibleDomainMappings": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateRawData": {},
    *   //   "displayName": "my_displayName",
    *   //   "domainMappingsCount": 0,
    *   //   "domainNames": [],
    *   //   "expireTime": "my_expireTime",
    *   //   "id": "my_id",
    *   //   "managedCertificate": {},
    *   //   "name": "my_name",
    *   //   "visibleDomainMappings": []
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
  def create(params: ParamsResourceAppsAuthorizedcertificatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAppsAuthorizedcertificatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAppsAuthorizedcertificatesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsAuthorizedcertificatesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified SSL certificate.
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
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.authorizedCertificates.delete({
    *     // Part of `name`. Name of the resource to delete. Example: apps/myapp/authorizedCertificates/12345.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     authorizedCertificatesId: 'placeholder-value',
    *   });
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
  def delete(params: ParamsResourceAppsAuthorizedcertificatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAppsAuthorizedcertificatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(callback: BodyResponseCallback[SchemaAuthorizedCertificate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(params: ParamsResourceAppsAuthorizedcertificatesGet): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    options: BodyResponseCallback[Readable | SchemaAuthorizedCertificate],
    callback: BodyResponseCallback[Readable | SchemaAuthorizedCertificate]
  ): Unit = js.native
  def get(params: ParamsResourceAppsAuthorizedcertificatesGet, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  /**
    * Gets the specified SSL certificate.
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
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.authorizedCertificates.get({
    *     // Part of `name`. Name of the resource requested. Example: apps/myapp/authorizedCertificates/12345.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     authorizedCertificatesId: 'placeholder-value',
    *     // Controls the set of fields returned in the GET response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateRawData": {},
    *   //   "displayName": "my_displayName",
    *   //   "domainMappingsCount": 0,
    *   //   "domainNames": [],
    *   //   "expireTime": "my_expireTime",
    *   //   "id": "my_id",
    *   //   "managedCertificate": {},
    *   //   "name": "my_name",
    *   //   "visibleDomainMappings": []
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
  def get(params: ParamsResourceAppsAuthorizedcertificatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAppsAuthorizedcertificatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(params: ParamsResourceAppsAuthorizedcertificatesList): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    options: BodyResponseCallback[Readable | SchemaListAuthorizedCertificatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAuthorizedCertificatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsAuthorizedcertificatesList, options: MethodOptions): GaxiosPromise[SchemaListAuthorizedCertificatesResponse] = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAuthorizedCertificatesResponse]
  ): Unit = js.native
  /**
    * Lists all SSL certificates the user is authorized to administer.
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
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.authorizedCertificates.list({
    *     // Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    *     appsId: 'placeholder-value',
    *     // Maximum results to return per page.
    *     pageSize: 'placeholder-value',
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Controls the set of fields returned in the LIST response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificates": [],
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
  def list(params: ParamsResourceAppsAuthorizedcertificatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAppsAuthorizedcertificatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(callback: BodyResponseCallback[SchemaAuthorizedCertificate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(params: ParamsResourceAppsAuthorizedcertificatesPatch): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    options: BodyResponseCallback[Readable | SchemaAuthorizedCertificate],
    callback: BodyResponseCallback[Readable | SchemaAuthorizedCertificate]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsAuthorizedcertificatesPatch, options: MethodOptions): GaxiosPromise[SchemaAuthorizedCertificate] = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizedCertificate]
  ): Unit = js.native
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
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
    * const appengine = google.appengine('v1beta');
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
    *   const res = await appengine.apps.authorizedCertificates.patch({
    *     // Part of `name`. Name of the resource to update. Example: apps/myapp/authorizedCertificates/12345.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     authorizedCertificatesId: 'placeholder-value',
    *     // Standard field mask for the set of fields to be updated. Updates are only supported on the certificate_raw_data and display_name fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "certificateRawData": {},
    *       //   "displayName": "my_displayName",
    *       //   "domainMappingsCount": 0,
    *       //   "domainNames": [],
    *       //   "expireTime": "my_expireTime",
    *       //   "id": "my_id",
    *       //   "managedCertificate": {},
    *       //   "name": "my_name",
    *       //   "visibleDomainMappings": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateRawData": {},
    *   //   "displayName": "my_displayName",
    *   //   "domainMappingsCount": 0,
    *   //   "domainNames": [],
    *   //   "expireTime": "my_expireTime",
    *   //   "id": "my_id",
    *   //   "managedCertificate": {},
    *   //   "name": "my_name",
    *   //   "visibleDomainMappings": []
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
  def patch(params: ParamsResourceAppsAuthorizedcertificatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAppsAuthorizedcertificatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
