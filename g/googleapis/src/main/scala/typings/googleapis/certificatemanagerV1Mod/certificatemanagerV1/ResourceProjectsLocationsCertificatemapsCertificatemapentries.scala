package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/certificatemanager/v1", "certificatemanager_v1.Resource$Projects$Locations$Certificatemaps$Certificatemapentries")
@js.native
open class ResourceProjectsLocationsCertificatemapsCertificatemapentries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new CertificateMapEntry in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/certificatemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const certificatemanager = google.certificatemanager('v1');
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
    *   const res =
    *     await certificatemanager.projects.locations.certificateMaps.certificateMapEntries.create(
    *       {
    *         // Required. A user-provided name of the certificate map entry.
    *         certificateMapEntryId: 'placeholder-value',
    *         // Required. The parent resource of the certificate map entry. Must be in the format `projects/x/locations/x/certificateMaps/x`.
    *         parent:
    *           'projects/my-project/locations/my-location/certificateMaps/my-certificateMap',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "certificates": [],
    *           //   "createTime": "my_createTime",
    *           //   "description": "my_description",
    *           //   "hostname": "my_hostname",
    *           //   "labels": {},
    *           //   "matcher": "my_matcher",
    *           //   "name": "my_name",
    *           //   "state": "my_state",
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
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
  def create(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single CertificateMapEntry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/certificatemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const certificatemanager = google.certificatemanager('v1');
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
    *   const res =
    *     await certificatemanager.projects.locations.certificateMaps.certificateMapEntries.delete(
    *       {
    *         // Required. A name of the certificate map entry to delete. Must be in the format `projects/x/locations/x/certificateMaps/x/certificateMapEntries/x`.
    *         name: 'projects/my-project/locations/my-location/certificateMaps/my-certificateMap/certificateMapEntries/my-certificateMapEntrie',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCertificateMapEntry] = js.native
  def get(callback: BodyResponseCallback[SchemaCertificateMapEntry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCertificateMapEntry] = js.native
  def get(params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet): GaxiosPromise[SchemaCertificateMapEntry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet,
    callback: BodyResponseCallback[SchemaCertificateMapEntry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet,
    options: BodyResponseCallback[Readable | SchemaCertificateMapEntry],
    callback: BodyResponseCallback[Readable | SchemaCertificateMapEntry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaCertificateMapEntry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCertificateMapEntry]
  ): Unit = js.native
  /**
    * Gets details of a single CertificateMapEntry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/certificatemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const certificatemanager = google.certificatemanager('v1');
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
    *   const res =
    *     await certificatemanager.projects.locations.certificateMaps.certificateMapEntries.get(
    *       {
    *         // Required. A name of the certificate map entry to describe. Must be in the format `projects/x/locations/x/certificateMaps/x/certificateMapEntries/x`.
    *         name: 'projects/my-project/locations/my-location/certificateMaps/my-certificateMap/certificateMapEntries/my-certificateMapEntrie',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificates": [],
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "hostname": "my_hostname",
    *   //   "labels": {},
    *   //   "matcher": "my_matcher",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def get(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCertificateMapEntriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCertificateMapEntriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCertificateMapEntriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList): GaxiosPromise[SchemaListCertificateMapEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList,
    callback: BodyResponseCallback[SchemaListCertificateMapEntriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList,
    options: BodyResponseCallback[Readable | SchemaListCertificateMapEntriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCertificateMapEntriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListCertificateMapEntriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCertificateMapEntriesResponse]
  ): Unit = js.native
  /**
    * Lists CertificateMapEntries in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/certificatemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const certificatemanager = google.certificatemanager('v1');
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
    *   const res =
    *     await certificatemanager.projects.locations.certificateMaps.certificateMapEntries.list(
    *       {
    *         // Filter expression to restrict the returned Certificate Map Entries.
    *         filter: 'placeholder-value',
    *         // A list of Certificate Map Entry field names used to specify the order of the returned results. The default sorting order is ascending. To specify descending order for a field, add a suffix " desc".
    *         orderBy: 'placeholder-value',
    *         // Maximum number of certificate map entries to return. The service may return fewer than this value. If unspecified, at most 50 certificate map entries will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *         pageSize: 'placeholder-value',
    *         // The value returned by the last `ListCertificateMapEntriesResponse`. Indicates that this is a continuation of a prior `ListCertificateMapEntries` call, and that the system should return the next page of data.
    *         pageToken: 'placeholder-value',
    *         // Required. The project, location and certificate map from which the certificate map entries should be listed, specified in the format `projects/x/locations/x/certificateMaps/x`.
    *         parent:
    *           'projects/my-project/locations/my-location/certificateMaps/my-certificateMap',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificateMapEntries": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a CertificateMapEntry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/certificatemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const certificatemanager = google.certificatemanager('v1');
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
    *   const res =
    *     await certificatemanager.projects.locations.certificateMaps.certificateMapEntries.patch(
    *       {
    *         // A user-defined name of the Certificate Map Entry. Certificate Map Entry names must be unique globally and match pattern `projects/x/locations/x/certificateMaps/x/certificateMapEntries/x`.
    *         name: 'projects/my-project/locations/my-location/certificateMaps/my-certificateMap/certificateMapEntries/my-certificateMapEntrie',
    *         // Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "certificates": [],
    *           //   "createTime": "my_createTime",
    *           //   "description": "my_description",
    *           //   "hostname": "my_hostname",
    *           //   "labels": {},
    *           //   "matcher": "my_matcher",
    *           //   "name": "my_name",
    *           //   "state": "my_state",
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
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
  def patch(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsCertificatemapsCertificatemapentriesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
