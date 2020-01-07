package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Managedzoneoperations")
@js.native
class Resource$Managedzoneoperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.managedZoneOperations.get
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
    * var dns = google.dns('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request.
    *     managedZone: 'my-managed-zone',  // TODO: Update placeholder value.
    *
    *     // Identifies the operation addressed by this request.
    *     operation: 'my-operation',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   dns.managedZoneOperations.get(request, function(err, response) {
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
    * @alias dns.managedZoneOperations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.operation
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dns.managedZoneOperations.list
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
    * var dns = google.dns('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request.
    *     managedZone: 'my-managed-zone',  // TODO: Update placeholder value.
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
    *     var operationsPage = response['operations'];
    *     if (!operationsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < operationsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `operationsPage`: console.log(JSON.stringify(operationsPage[i], null,
    * 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       dns.managedZoneOperations.list(request, handlePage);
    *     }
    *   };
    *
    *   dns.managedZoneOperations.list(request, handlePage);
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
    * @alias dns.managedZoneOperations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ManagedZoneOperationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedzoneoperationsDollarList): GaxiosPromise[Schema$ManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarList,
    callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarList,
    options: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse],
    callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedzoneoperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedzoneoperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedZoneOperationsListResponse]
  ): Unit = js.native
}

