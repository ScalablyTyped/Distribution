package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Billingaccounts")
@js.native
class Resource$Billingaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceDollarBillingaccountsDollarProjects = js.native
  /**
    * cloudbilling.billingAccounts.create
    * @desc Creates a billing account. This method can only be used to create
    * [billing subaccounts](https://cloud.google.com/billing/docs/concepts) by
    * GCP resellers. When creating a subaccount, the current authenticated user
    * must have the `billing.accounts.update` IAM permission on the master
    * account, which is typically given to billing account
    * [administrators](https://cloud.google.com/billing/docs/how-to/billing-access).
    * This method will return an error if the master account has not been
    * provisioned as a reseller account.
    * @alias cloudbilling.billingAccounts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BillingAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$BillingAccount] = js.native
  def create(callback: BodyResponseCallback[Schema$BillingAccount]): Unit = js.native
  def create(params: ParamsDollarResourceDollarBillingaccountsDollarCreate): GaxiosPromise[Schema$BillingAccount] = js.native
  def create(
    params: ParamsDollarResourceDollarBillingaccountsDollarCreate,
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarBillingaccountsDollarCreate,
    options: BodyResponseCallback[Schema$BillingAccount],
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarBillingaccountsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$BillingAccount] = js.native
  def create(
    params: ParamsDollarResourceDollarBillingaccountsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  /**
    * cloudbilling.billingAccounts.get
    * @desc Gets information about a billing account. The current authenticated
    * user must be a [viewer of the billing
    * account](https://cloud.google.com/billing/docs/how-to/billing-access).
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
    *     // The resource name of the billing account to retrieve. For example,
    *     // `billingAccounts/012345-567890-ABCDEF`.
    *     name: 'billingAccounts/my-billing-account',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudbilling.billingAccounts.get(request, function(err, response) {
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
    * @alias cloudbilling.billingAccounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the billing account to retrieve. For example, `billingAccounts/012345-567890-ABCDEF`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BillingAccount] = js.native
  def get(callback: BodyResponseCallback[Schema$BillingAccount]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBillingaccountsDollarGet): GaxiosPromise[Schema$BillingAccount] = js.native
  def get(
    params: ParamsDollarResourceDollarBillingaccountsDollarGet,
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBillingaccountsDollarGet,
    options: BodyResponseCallback[Schema$BillingAccount],
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBillingaccountsDollarGet, options: MethodOptions): GaxiosPromise[Schema$BillingAccount] = js.native
  def get(
    params: ParamsDollarResourceDollarBillingaccountsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  /**
    * cloudbilling.billingAccounts.getIamPolicy
    * @desc Gets the access control policy for a billing account. The caller
    * must have the `billing.accounts.getIamPolicy` permission on the account,
    * which is often given to billing account
    * [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
    * @alias cloudbilling.billingAccounts.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarBillingaccountsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarBillingaccountsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarBillingaccountsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarBillingaccountsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarBillingaccountsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudbilling.billingAccounts.list
    * @desc Lists the billing accounts that the current authenticated user has
    * permission to
    * [view](https://cloud.google.com/billing/docs/how-to/billing-access).
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
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var billingAccountsPage = response['billingAccounts'];
    *     if (!billingAccountsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < billingAccountsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `billingAccountsPage`: console.log(JSON.stringify(billingAccountsPage[i],
    * null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudbilling.billingAccounts.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudbilling.billingAccounts.list(request, handlePage);
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
    * @alias cloudbilling.billingAccounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Options for how to filter the returned billing accounts. Currently this only supports filtering for [subaccounts](https://cloud.google.com/billing/docs/concepts) under a single provided reseller billing account. (e.g. "master_billing_account=billingAccounts/012345-678901-ABCDEF"). Boolean algebra and other fields are not currently supported.
    * @param {integer=} params.pageSize Requested page size. The maximum page size is 100; this is also the default.
    * @param {string=} params.pageToken A token identifying a page of results to return. This should be a `next_page_token` value returned from a previous `ListBillingAccounts` call. If unspecified, the first page of results is returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListBillingAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListBillingAccountsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBillingaccountsDollarList): GaxiosPromise[Schema$ListBillingAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBillingaccountsDollarList,
    callback: BodyResponseCallback[Schema$ListBillingAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBillingaccountsDollarList,
    options: BodyResponseCallback[Schema$ListBillingAccountsResponse],
    callback: BodyResponseCallback[Schema$ListBillingAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBillingaccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListBillingAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBillingaccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListBillingAccountsResponse]
  ): Unit = js.native
  /**
    * cloudbilling.billingAccounts.patch
    * @desc Updates a billing account's fields. Currently the only field that
    * can be edited is `display_name`. The current authenticated user must have
    * the `billing.accounts.update` IAM permission, which is typically given to
    * the
    * [administrator](https://cloud.google.com/billing/docs/how-to/billing-access)
    * of the billing account.
    * @alias cloudbilling.billingAccounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the billing account resource to be updated.
    * @param {string=} params.updateMask The update mask applied to the resource. Only "display_name" is currently supported.
    * @param {().BillingAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$BillingAccount] = js.native
  def patch(callback: BodyResponseCallback[Schema$BillingAccount]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBillingaccountsDollarPatch): GaxiosPromise[Schema$BillingAccount] = js.native
  def patch(
    params: ParamsDollarResourceDollarBillingaccountsDollarPatch,
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarBillingaccountsDollarPatch,
    options: BodyResponseCallback[Schema$BillingAccount],
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBillingaccountsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$BillingAccount] = js.native
  def patch(
    params: ParamsDollarResourceDollarBillingaccountsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BillingAccount]
  ): Unit = js.native
  /**
    * cloudbilling.billingAccounts.setIamPolicy
    * @desc Sets the access control policy for a billing account. Replaces any
    * existing policy. The caller must have the `billing.accounts.setIamPolicy`
    * permission on the account, which is often given to billing account
    * [administrators](https://cloud.google.com/billing/docs/how-to/billing-access).
    * @alias cloudbilling.billingAccounts.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarBillingaccountsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarBillingaccountsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarBillingaccountsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarBillingaccountsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarBillingaccountsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudbilling.billingAccounts.testIamPermissions
    * @desc Tests the access control policy for a billing account. This method
    * takes the resource and a set of permissions as input and returns the
    * subset of the input permissions that the caller is allowed for that
    * resource.
    * @alias cloudbilling.billingAccounts.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarBillingaccountsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarBillingaccountsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarBillingaccountsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarBillingaccountsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarBillingaccountsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

