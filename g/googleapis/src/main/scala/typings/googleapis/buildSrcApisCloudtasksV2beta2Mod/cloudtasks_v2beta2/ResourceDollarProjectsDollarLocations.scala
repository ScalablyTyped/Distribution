package typings.googleapis.buildSrcApisCloudtasksV2beta2Mod.cloudtasks_v2beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtasks/v2beta2", "cloudtasks_v2beta2.Resource$Projects$Locations")
@js.native
class ResourceDollarProjectsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var queues: ResourceDollarProjectsDollarLocationsDollarQueues = js.native
  /**
    * cloudtasks.projects.locations.get
    * @desc Gets information about a location.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
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
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Resource name for the location.
    *     name: 'projects/my-project/locations/my-location',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudTasks.projects.locations.get(request, function(err, response) {
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
    * @alias cloudtasks.projects.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Location] = js.native
  def get(callback: BodyResponseCallback[Schema$Location]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: BodyResponseCallback[Schema$Location],
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  /**
    * cloudtasks.projects.locations.list
    * @desc Lists information about the supported locations for this service.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Tasks API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudtasks
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
    * var cloudTasks = google.cloudtasks('v2beta2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource that owns the locations collection, if applicable.
    *     name: 'projects/my-project',  // TODO: Update placeholder value.
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
    *     var locationsPage = response['locations'];
    *     if (!locationsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < locationsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `locationsPage`: console.log(JSON.stringify(locationsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudTasks.projects.locations.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudTasks.projects.locations.list(request, handlePage);
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
    * @alias cloudtasks.projects.locations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string} params.name The resource that owns the locations collection, if applicable.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLocationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    options: BodyResponseCallback[Schema$ListLocationsResponse],
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
}

