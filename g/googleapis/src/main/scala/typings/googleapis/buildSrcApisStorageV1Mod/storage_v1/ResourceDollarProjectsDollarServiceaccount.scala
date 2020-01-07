package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Projects$Serviceaccount")
@js.native
class ResourceDollarProjectsDollarServiceaccount protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.projects.serviceAccount.get
    * @desc Get the email address of this project's Google Cloud Storage
    * service account.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.projects.serviceAccount.get(request, function(err, response) {
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
    * @alias storage.projects.serviceAccount.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID
    * @param {string=} params.userProject The project to be billed for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ServiceAccount] = js.native
  def get(callback: BodyResponseCallback[Schema$ServiceAccount]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarServiceaccountDollarGet): GaxiosPromise[Schema$ServiceAccount] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountDollarGet,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountDollarGet,
    options: BodyResponseCallback[Schema$ServiceAccount],
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarServiceaccountDollarGet, options: MethodOptions): GaxiosPromise[Schema$ServiceAccount] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarServiceaccountDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ServiceAccount]
  ): Unit = js.native
}

