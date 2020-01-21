package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudbilling.projects.getBillingInfo
    * @desc Gets the billing information for a project. The current
    * authenticated user must have [permission to view the
    * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
    * ).
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Billing API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudbilling
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
    * var cloudbilling = google.cloudbilling('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the project for which billing information is
    *     // retrieved. For example, `projects/tokyo-rain-123`.
    *     name: 'projects/my-project',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudbilling.projects.getBillingInfo(request, function(err, response) {
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
    * @alias cloudbilling.projects.getBillingInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the project for which billing information is retrieved. For example, `projects/tokyo-rain-123`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getBillingInfo(): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(callback: BodyResponseCallback[SchemaProjectBillingInfo]): Unit = js.native
  def getBillingInfo(params: ParamsResourceProjectsGetbillinginfo): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    options: BodyResponseCallback[SchemaProjectBillingInfo],
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  def getBillingInfo(params: ParamsResourceProjectsGetbillinginfo, options: MethodOptions): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  /**
    * cloudbilling.projects.updateBillingInfo
    * @desc Sets or updates the billing account associated with a project. You
    * specify the new billing account by setting the `billing_account_name` in
    * the `ProjectBillingInfo` resource to the resource name of a billing
    * account. Associating a project with an open billing account enables
    * billing on the project and allows charges for resource usage. If the
    * project already had a billing account, this method changes the billing
    * account used for resource usage charges.  *Note:* Incurred charges that
    * have not yet been reported in the transaction history of the GCP Console
    * might be billed to the new billing account, even if the charge occurred
    * before the new billing account was assigned to the project.  The current
    * authenticated user must have ownership privileges for both the
    * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
    * ) and the [billing
    * account](https://cloud.google.com/billing/docs/how-to/billing-access).
    * You can disable billing on the project by setting the
    * `billing_account_name` field to empty. This action disassociates the
    * current billing account from the project. Any billable activity of your
    * in-use services will stop, and your application could stop functioning as
    * expected. Any unbilled charges to date will be billed to the previously
    * associated account. The current authenticated user must be either an
    * owner of the project or an owner of the billing account for the project.
    * Note that associating a project with a *closed* billing account will have
    * much the same effect as disabling billing on the project: any paid
    * resources used by the project will be shut down. Thus, unless you wish to
    * disable billing, you should always call this method with the name of an
    * *open* billing account.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Billing API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudbilling
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
    * var cloudbilling = google.cloudbilling('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the project associated with the billing
    * information
    *     // that you want to update. For example, `projects/tokyo-rain-123`.
    *     name: 'projects/my-project',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudbilling.projects.updateBillingInfo(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias cloudbilling.projects.updateBillingInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the project associated with the billing information that you want to update. For example, `projects/tokyo-rain-123`.
    * @param {().ProjectBillingInfo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateBillingInfo(): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(callback: BodyResponseCallback[SchemaProjectBillingInfo]): Unit = js.native
  def updateBillingInfo(params: ParamsResourceProjectsUpdatebillinginfo): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    options: BodyResponseCallback[SchemaProjectBillingInfo],
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  def updateBillingInfo(params: ParamsResourceProjectsUpdatebillinginfo, options: MethodOptions): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
}

