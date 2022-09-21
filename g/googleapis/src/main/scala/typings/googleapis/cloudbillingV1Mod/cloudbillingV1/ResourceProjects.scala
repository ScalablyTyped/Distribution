package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getBillingInfo(): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(callback: BodyResponseCallback[SchemaProjectBillingInfo]): Unit = js.native
  def getBillingInfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(params: ParamsResourceProjectsGetbillinginfo): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    options: BodyResponseCallback[Readable | SchemaProjectBillingInfo],
    callback: BodyResponseCallback[Readable | SchemaProjectBillingInfo]
  ): Unit = js.native
  def getBillingInfo(params: ParamsResourceProjectsGetbillinginfo, options: MethodOptions): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  /**
    * Gets the billing information for a project. The current authenticated user must have the `resourcemanager.projects.get` permission for the project, which can be granted by assigning the [Project Viewer](https://cloud.google.com/iam/docs/understanding-roles#predefined_roles) role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbilling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbilling = google.cloudbilling('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-billing.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbilling.projects.getBillingInfo({
    *     // Required. The resource name of the project for which billing information is retrieved. For example, `projects/tokyo-rain-123`.
    *     name: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingAccountName": "my_billingAccountName",
    *   //   "billingEnabled": false,
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId"
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
  def getBillingInfo(params: ParamsResourceProjectsGetbillinginfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getBillingInfo(
    params: ParamsResourceProjectsGetbillinginfo,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateBillingInfo(): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(callback: BodyResponseCallback[SchemaProjectBillingInfo]): Unit = js.native
  def updateBillingInfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(params: ParamsResourceProjectsUpdatebillinginfo): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    options: BodyResponseCallback[Readable | SchemaProjectBillingInfo],
    callback: BodyResponseCallback[Readable | SchemaProjectBillingInfo]
  ): Unit = js.native
  def updateBillingInfo(params: ParamsResourceProjectsUpdatebillinginfo, options: MethodOptions): GaxiosPromise[SchemaProjectBillingInfo] = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectBillingInfo]
  ): Unit = js.native
  /**
    * Sets or updates the billing account associated with a project. You specify the new billing account by setting the `billing_account_name` in the `ProjectBillingInfo` resource to the resource name of a billing account. Associating a project with an open billing account enables billing on the project and allows charges for resource usage. If the project already had a billing account, this method changes the billing account used for resource usage charges. *Note:* Incurred charges that have not yet been reported in the transaction history of the Google Cloud Console might be billed to the new billing account, even if the charge occurred before the new billing account was assigned to the project. The current authenticated user must have ownership privileges for both the [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo ) and the [billing account](https://cloud.google.com/billing/docs/how-to/billing-access). You can disable billing on the project by setting the `billing_account_name` field to empty. This action disassociates the current billing account from the project. Any billable activity of your in-use services will stop, and your application could stop functioning as expected. Any unbilled charges to date will be billed to the previously associated account. The current authenticated user must be either an owner of the project or an owner of the billing account for the project. Note that associating a project with a *closed* billing account will have much the same effect as disabling billing on the project: any paid resources used by the project will be shut down. Thus, unless you wish to disable billing, you should always call this method with the name of an *open* billing account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbilling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbilling = google.cloudbilling('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbilling.projects.updateBillingInfo({
    *     // Required. The resource name of the project associated with the billing information that you want to update. For example, `projects/tokyo-rain-123`.
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingAccountName": "my_billingAccountName",
    *       //   "billingEnabled": false,
    *       //   "name": "my_name",
    *       //   "projectId": "my_projectId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingAccountName": "my_billingAccountName",
    *   //   "billingEnabled": false,
    *   //   "name": "my_name",
    *   //   "projectId": "my_projectId"
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
  def updateBillingInfo(params: ParamsResourceProjectsUpdatebillinginfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateBillingInfo(
    params: ParamsResourceProjectsUpdatebillinginfo,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
