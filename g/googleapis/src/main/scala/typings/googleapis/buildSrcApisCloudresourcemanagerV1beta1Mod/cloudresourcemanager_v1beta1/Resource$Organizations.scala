package typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1beta1", "cloudresourcemanager_v1beta1.Resource$Organizations")
@js.native
class Resource$Organizations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudresourcemanager.organizations.get
    * @desc Fetches an Organization resource identified by the specified
    * resource name.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
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
    * var cloudResourceManager = google.cloudresourcemanager('v1beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The resource name of the Organization to fetch, e.g.
    * "organizations/1234". name: 'organizations/my-organization',  // TODO:
    * Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.get(request, function(err, response)
    * { if (err) { console.error(err); return;
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
    * @alias cloudresourcemanager.organizations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Organization to fetch. This is the organization's relative path in the API, formatted as "organizations/[organizationId]". For example, "organizations/1234".
    * @param {string=} params.organizationId The id of the Organization resource to fetch. This field is deprecated and will be removed in v1. Use name instead.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Organization] = js.native
  def get(callback: BodyResponseCallback[Schema$Organization]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarGet): GaxiosPromise[Schema$Organization] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarGet,
    callback: BodyResponseCallback[Schema$Organization]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarGet,
    options: BodyResponseCallback[Schema$Organization],
    callback: BodyResponseCallback[Schema$Organization]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Organization] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Organization]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.getIamPolicy
    * @desc Gets the access control policy for an Organization resource. May be
    * empty if no such policy or resource exists. The `resource` field should
    * be the organization's resource name, e.g. "organizations/123".
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
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
    * var cloudResourceManager = google.cloudresourcemanager('v1beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy is being requested.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.getIamPolicy(request, function(err,
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
    * @alias cloudresourcemanager.organizations.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarOrganizationsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarOrganizationsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.list
    * @desc Lists Organization resources that are visible to the user and
    * satisfy the specified filter. This method returns Organizations in an
    * unspecified order. New Organizations do not necessarily appear at the end
    * of the list.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
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
    * var cloudResourceManager = google.cloudresourcemanager('v1beta1');
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
    *     var organizationsPage = response['organizations'];
    *     if (!organizationsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < organizationsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `organizationsPage`: console.log(JSON.stringify(organizationsPage[i],
    * null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudResourceManager.organizations.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.organizations.list(request, handlePage);
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
    * @alias cloudresourcemanager.organizations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An optional query string used to filter the Organizations to return in the response. Filter rules are case-insensitive.   Organizations may be filtered by `owner.directoryCustomerId` or by `domain`, where the domain is a G Suite domain, for example:  |Filter|Description| |------|-----------| |owner.directorycustomerid:123456789|Organizations with `owner.directory_customer_id` equal to `123456789`.| |domain:google.com|Organizations corresponding to the domain `google.com`.|  This field is optional.
    * @param {integer=} params.pageSize The maximum number of Organizations to return in the response. This field is optional.
    * @param {string=} params.pageToken A pagination token returned from a previous call to `ListOrganizations` that indicates from where listing should continue. This field is optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListOrganizationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListOrganizationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarList): GaxiosPromise[Schema$ListOrganizationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarList,
    callback: BodyResponseCallback[Schema$ListOrganizationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarList,
    options: BodyResponseCallback[Schema$ListOrganizationsResponse],
    callback: BodyResponseCallback[Schema$ListOrganizationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListOrganizationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOrganizationsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.setIamPolicy
    * @desc Sets the access control policy on an Organization resource.
    * Replaces any existing policy. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
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
    * var cloudResourceManager = google.cloudresourcemanager('v1beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy is being specified.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.setIamPolicy(request, function(err,
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
    * @alias cloudresourcemanager.organizations.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarOrganizationsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarOrganizationsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.testIamPermissions
    * @desc Returns permissions that a caller has on the specified
    * Organization. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
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
    * var cloudResourceManager = google.cloudresourcemanager('v1beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy detail is being
    * requested.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.testIamPermissions(request,
    * function(err, response) { if (err) { console.error(err); return;
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
    * @alias cloudresourcemanager.organizations.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarOrganizationsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarOrganizationsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarOrganizationsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.update
    * @desc Updates an Organization resource identified by the specified
    * resource name.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
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
    * var cloudResourceManager = google.cloudresourcemanager('v1beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Output Only. The resource name of the organization. This is the
    *     // organization's relative path in the API. Its format is
    *     // "organizations/[organization_id]". For example,
    * "organizations/1234". name: 'organizations/my-organization',  // TODO:
    * Update placeholder value.
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
    *   cloudResourceManager.organizations.update(request, function(err,
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
    * @alias cloudresourcemanager.organizations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output Only. The resource name of the organization. This is the organization's relative path in the API. Its format is "organizations/[organization_id]". For example, "organizations/1234".
    * @param {().Organization} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Organization] = js.native
  def update(callback: BodyResponseCallback[Schema$Organization]): Unit = js.native
  def update(params: ParamsDollarResourceDollarOrganizationsDollarUpdate): GaxiosPromise[Schema$Organization] = js.native
  def update(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdate,
    callback: BodyResponseCallback[Schema$Organization]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdate,
    options: BodyResponseCallback[Schema$Organization],
    callback: BodyResponseCallback[Schema$Organization]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarOrganizationsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Organization] = js.native
  def update(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Organization]
  ): Unit = js.native
}

