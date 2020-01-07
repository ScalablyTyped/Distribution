package typings.googleapis.buildSrcApisDnsV1Mod.dns_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1", "dns_v1.Resource$Changes")
@js.native
class Resource$Changes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.changes.create
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud DNS API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dns
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var dns = google.dns('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request. Can be the
    * managed zone name or id. managedZone: 'my-managed-zone',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dns.changes.create(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias dns.changes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().Change} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Change] = js.native
  def create(callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def create(params: ParamsDollarResourceDollarChangesDollarCreate): GaxiosPromise[Schema$Change] = js.native
  def create(
    params: ParamsDollarResourceDollarChangesDollarCreate,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarChangesDollarCreate,
    options: BodyResponseCallback[Schema$Change],
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarChangesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Change] = js.native
  def create(
    params: ParamsDollarResourceDollarChangesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  /**
    * dns.changes.get
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud DNS API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dns
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var dns = google.dns('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request. Can be the
    * managed zone name or id. managedZone: 'my-managed-zone',  // TODO: Update
    * placeholder value.
    *
    *     // The identifier of the requested change, from a previous
    * ResourceRecordSetsChangeResponse. changeId: 'my-change-id',  // TODO:
    * Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   dns.changes.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias dns.changes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.changeId
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Change] = js.native
  def get(callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet): GaxiosPromise[Schema$Change] = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet, callback: BodyResponseCallback[Schema$Change]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarChangesDollarGet,
    options: BodyResponseCallback[Schema$Change],
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarChangesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Change] = js.native
  def get(
    params: ParamsDollarResourceDollarChangesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Change]
  ): Unit = js.native
  /**
    * dns.changes.list
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud DNS API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dns
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var dns = google.dns('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request. Can be the
    * managed zone name or id. managedZone: 'my-managed-zone',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var changesPage = response['changes'];
    *     if (!changesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < changesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `changesPage`: console.log(JSON.stringify(changesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       dns.changes.list(request, handlePage);
    *     }
    *   };
    *
    *   dns.changes.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias dns.changes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {string=} params.sortOrder
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ChangesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ChangesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarChangesDollarList): GaxiosPromise[Schema$ChangesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    callback: BodyResponseCallback[Schema$ChangesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    options: BodyResponseCallback[Schema$ChangesListResponse],
    callback: BodyResponseCallback[Schema$ChangesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarChangesDollarList, options: MethodOptions): GaxiosPromise[Schema$ChangesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarChangesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChangesListResponse]
  ): Unit = js.native
}

