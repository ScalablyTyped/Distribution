package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Billingaccounts")
@js.native
class ResourceBillingaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def create(): GaxiosPromise[SchemaBillingAccount] = js.native
  def create(callback: BodyResponseCallback[SchemaBillingAccount]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBillingAccount] = js.native
  def create(params: ParamsResourceBillingaccountsCreate): GaxiosPromise[SchemaBillingAccount] = js.native
  def create(params: ParamsResourceBillingaccountsCreate, callback: BodyResponseCallback[SchemaBillingAccount]): Unit = js.native
  def create(
    params: ParamsResourceBillingaccountsCreate,
    options: BodyResponseCallback[SchemaBillingAccount],
    callback: BodyResponseCallback[SchemaBillingAccount]
  ): Unit = js.native
  def create(params: ParamsResourceBillingaccountsCreate, options: MethodOptions): GaxiosPromise[SchemaBillingAccount] = js.native
  def create(
    params: ParamsResourceBillingaccountsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingAccount]
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
  def get(): GaxiosPromise[SchemaBillingAccount] = js.native
  def get(callback: BodyResponseCallback[SchemaBillingAccount]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBillingAccount] = js.native
  def get(params: ParamsResourceBillingaccountsGet): GaxiosPromise[SchemaBillingAccount] = js.native
  def get(params: ParamsResourceBillingaccountsGet, callback: BodyResponseCallback[SchemaBillingAccount]): Unit = js.native
  def get(
    params: ParamsResourceBillingaccountsGet,
    options: BodyResponseCallback[SchemaBillingAccount],
    callback: BodyResponseCallback[SchemaBillingAccount]
  ): Unit = js.native
  def get(params: ParamsResourceBillingaccountsGet, options: MethodOptions): GaxiosPromise[SchemaBillingAccount] = js.native
  def get(
    params: ParamsResourceBillingaccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingAccount]
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
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBillingaccountsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBillingaccountsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceBillingaccountsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceBillingaccountsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceBillingaccountsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def list(): GaxiosPromise[SchemaListBillingAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBillingAccountsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListBillingAccountsResponse] = js.native
  def list(params: ParamsResourceBillingaccountsList): GaxiosPromise[SchemaListBillingAccountsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsList,
    callback: BodyResponseCallback[SchemaListBillingAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingaccountsList,
    options: BodyResponseCallback[SchemaListBillingAccountsResponse],
    callback: BodyResponseCallback[SchemaListBillingAccountsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingaccountsList, options: MethodOptions): GaxiosPromise[SchemaListBillingAccountsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBillingAccountsResponse]
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
  def patch(): GaxiosPromise[SchemaBillingAccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaBillingAccount]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBillingAccount] = js.native
  def patch(params: ParamsResourceBillingaccountsPatch): GaxiosPromise[SchemaBillingAccount] = js.native
  def patch(params: ParamsResourceBillingaccountsPatch, callback: BodyResponseCallback[SchemaBillingAccount]): Unit = js.native
  def patch(
    params: ParamsResourceBillingaccountsPatch,
    options: BodyResponseCallback[SchemaBillingAccount],
    callback: BodyResponseCallback[SchemaBillingAccount]
  ): Unit = js.native
  def patch(params: ParamsResourceBillingaccountsPatch, options: MethodOptions): GaxiosPromise[SchemaBillingAccount] = js.native
  def patch(
    params: ParamsResourceBillingaccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingAccount]
  ): Unit = js.native
  
  var projects: ResourceBillingaccountsProjects = js.native
  
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
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBillingaccountsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBillingaccountsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceBillingaccountsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceBillingaccountsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceBillingaccountsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceBillingaccountsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBillingaccountsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceBillingaccountsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceBillingaccountsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBillingaccountsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
