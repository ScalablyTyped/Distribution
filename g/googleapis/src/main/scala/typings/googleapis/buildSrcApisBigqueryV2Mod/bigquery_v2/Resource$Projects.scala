package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquery.projects.getServiceAccount
    * @desc Returns the email address of the service account for your project
    * used for interactions with Google Cloud KMS.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for which the service account is requested.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.projects.getServiceAccount(request, function(err, response) {
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
    * @alias bigquery.projects.getServiceAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID for which the service account is requested.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getServiceAccount(): GaxiosPromise[Schema$GetServiceAccountResponse] = js.native
  def getServiceAccount(callback: BodyResponseCallback[Schema$GetServiceAccountResponse]): Unit = js.native
  def getServiceAccount(params: ParamsDollarResourceDollarProjectsDollarGetserviceaccount): GaxiosPromise[Schema$GetServiceAccountResponse] = js.native
  def getServiceAccount(
    params: ParamsDollarResourceDollarProjectsDollarGetserviceaccount,
    callback: BodyResponseCallback[Schema$GetServiceAccountResponse]
  ): Unit = js.native
  def getServiceAccount(
    params: ParamsDollarResourceDollarProjectsDollarGetserviceaccount,
    options: BodyResponseCallback[Schema$GetServiceAccountResponse],
    callback: BodyResponseCallback[Schema$GetServiceAccountResponse]
  ): Unit = js.native
  def getServiceAccount(params: ParamsDollarResourceDollarProjectsDollarGetserviceaccount, options: MethodOptions): GaxiosPromise[Schema$GetServiceAccountResponse] = js.native
  def getServiceAccount(
    params: ParamsDollarResourceDollarProjectsDollarGetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetServiceAccountResponse]
  ): Unit = js.native
  /**
    * bigquery.projects.list
    * @desc Lists all projects to which you have been granted any project role.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var projectsPage = response['projects'];
    *     if (!projectsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < projectsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `projectsPage`: console.log(JSON.stringify(projectsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       bigquery.projects.list(request, handlePage);
    *     }
    *   };
    *
    *   bigquery.projects.list(request, handlePage);
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
    * @alias bigquery.projects.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken Page token, returned by a previous call, to request the next page of results
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ProjectList] = js.native
  def list(callback: BodyResponseCallback[Schema$ProjectList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarList): GaxiosPromise[Schema$ProjectList] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    callback: BodyResponseCallback[Schema$ProjectList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    options: BodyResponseCallback[Schema$ProjectList],
    callback: BodyResponseCallback[Schema$ProjectList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarList, options: MethodOptions): GaxiosPromise[Schema$ProjectList] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProjectList]
  ): Unit = js.native
}

