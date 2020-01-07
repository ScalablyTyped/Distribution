package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1", "cloudresourcemanager_v1.Resource$Organizations")
@js.native
class Resource$Organizations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudresourcemanager.organizations.clearOrgPolicy
    * @desc Clears a `Policy` from a resource.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the resource for the `Policy` to clear.
    *     resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.clearOrgPolicy(request,
    * function(err) { if (err) { console.error(err); return;
    *     }
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
    * @alias cloudresourcemanager.organizations.clearOrgPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ Name of the resource for the `Policy` to clear.
    * @param {().ClearOrgPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def clearOrgPolicy(): GaxiosPromise[Schema$Empty] = js.native
  def clearOrgPolicy(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def clearOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarClearorgpolicy): GaxiosPromise[Schema$Empty] = js.native
  def clearOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarClearorgpolicy,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def clearOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarClearorgpolicy,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def clearOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarClearorgpolicy, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def clearOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarClearorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
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
    * cloudresourcemanager.organizations.getEffectiveOrgPolicy
    * @desc Gets the effective `Policy` on a resource. This is the result of
    * merging `Policies` in the resource hierarchy. The returned `Policy` will
    * not have an `etag`set because it is a computed `Policy` across multiple
    * resources. Subtrees of Resource Manager resource hierarchy with 'under:'
    * prefix will not be expanded.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of the resource to start computing the effective
    * `Policy`. resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.getEffectiveOrgPolicy(request,
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
    * @alias cloudresourcemanager.organizations.getEffectiveOrgPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ The name of the resource to start computing the effective `Policy`.
    * @param {().GetEffectiveOrgPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getEffectiveOrgPolicy(): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getEffectiveOrgPolicy(callback: BodyResponseCallback[Schema$OrgPolicy]): Unit = js.native
  def getEffectiveOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarGeteffectiveorgpolicy): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGeteffectiveorgpolicy,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGeteffectiveorgpolicy,
    options: BodyResponseCallback[Schema$OrgPolicy],
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarGeteffectiveorgpolicy, options: MethodOptions): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGeteffectiveorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.getIamPolicy
    * @desc Gets the access control policy for an Organization resource. May be
    * empty if no such policy or resource exists. The `resource` field should
    * be the organization's resource name, e.g. "organizations/123".
    * Authorization requires the Google IAM permission
    * `resourcemanager.organizations.getIamPolicy` on the specified
    * organization
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
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
    * cloudresourcemanager.organizations.getOrgPolicy
    * @desc Gets a `Policy` on a resource.  If no `Policy` is set on the
    * resource, a `Policy` is returned with default values including
    * `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The `etag` value can
    * be used with `SetOrgPolicy()` to create or update a `Policy` during
    * read-modify-write.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the resource the `Policy` is set on.
    *     resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.getOrgPolicy(request, function(err,
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
    * @alias cloudresourcemanager.organizations.getOrgPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ Name of the resource the `Policy` is set on.
    * @param {().GetOrgPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOrgPolicy(): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getOrgPolicy(callback: BodyResponseCallback[Schema$OrgPolicy]): Unit = js.native
  def getOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarGetorgpolicy): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorgpolicy,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorgpolicy,
    options: BodyResponseCallback[Schema$OrgPolicy],
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarGetorgpolicy, options: MethodOptions): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.listAvailableOrgPolicyConstraints
    * @desc Lists `Constraints` that could be applied on the specified
    * resource.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the resource to list `Constraints` for.
    *     resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
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
    *     var constraintsPage = response['constraints'];
    *     if (!constraintsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < constraintsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `constraintsPage`: console.log(JSON.stringify(constraintsPage[i], null,
    * 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.resource.pageToken = response.nextPageToken;
    *       cloudResourceManager.organizations.listAvailableOrgPolicyConstraints(request,
    * handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.organizations.listAvailableOrgPolicyConstraints(request,
    * handlePage);
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
    * @alias
    * cloudresourcemanager.organizations.listAvailableOrgPolicyConstraints
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ Name of the resource to list `Constraints` for.
    * @param {().ListAvailableOrgPolicyConstraintsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listAvailableOrgPolicyConstraints(): GaxiosPromise[Schema$ListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]): Unit = js.native
  def listAvailableOrgPolicyConstraints(params: ParamsDollarResourceDollarOrganizationsDollarListavailableorgpolicyconstraints): GaxiosPromise[Schema$ListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarOrganizationsDollarListavailableorgpolicyconstraints,
    callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarOrganizationsDollarListavailableorgpolicyconstraints,
    options: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse],
    callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarOrganizationsDollarListavailableorgpolicyconstraints,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarOrganizationsDollarListavailableorgpolicyconstraints,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.listOrgPolicies
    * @desc Lists all the `Policies` set for a particular resource.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the resource to list Policies for.
    *     resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
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
    *     var policiesPage = response['policies'];
    *     if (!policiesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < policiesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `policiesPage`: console.log(JSON.stringify(policiesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.resource.pageToken = response.nextPageToken;
    *       cloudResourceManager.organizations.listOrgPolicies(request,
    * handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.organizations.listOrgPolicies(request,
    * handlePage);
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
    * @alias cloudresourcemanager.organizations.listOrgPolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ Name of the resource to list Policies for.
    * @param {().ListOrgPoliciesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listOrgPolicies(): GaxiosPromise[Schema$ListOrgPoliciesResponse] = js.native
  def listOrgPolicies(callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]): Unit = js.native
  def listOrgPolicies(params: ParamsDollarResourceDollarOrganizationsDollarListorgpolicies): GaxiosPromise[Schema$ListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsDollarResourceDollarOrganizationsDollarListorgpolicies,
    callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(
    params: ParamsDollarResourceDollarOrganizationsDollarListorgpolicies,
    options: BodyResponseCallback[Schema$ListOrgPoliciesResponse],
    callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(params: ParamsDollarResourceDollarOrganizationsDollarListorgpolicies, options: MethodOptions): GaxiosPromise[Schema$ListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsDollarResourceDollarOrganizationsDollarListorgpolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.search
    * @desc Searches Organization resources that are visible to the user and
    * satisfy the specified filter. This method returns Organizations in an
    * unspecified order. New Organizations do not necessarily appear at the end
    * of the results.  Search will only return organizations on which the user
    * has the permission `resourcemanager.organizations.get`
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
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
    *       request.resource.pageToken = response.nextPageToken;
    *       cloudResourceManager.organizations.search(request, handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.organizations.search(request, handlePage);
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
    * @alias cloudresourcemanager.organizations.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchOrganizationsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchOrganizationsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchOrganizationsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarOrganizationsDollarSearch): GaxiosPromise[Schema$SearchOrganizationsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarOrganizationsDollarSearch,
    callback: BodyResponseCallback[Schema$SearchOrganizationsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarOrganizationsDollarSearch,
    options: BodyResponseCallback[Schema$SearchOrganizationsResponse],
    callback: BodyResponseCallback[Schema$SearchOrganizationsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarOrganizationsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchOrganizationsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarOrganizationsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchOrganizationsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.setIamPolicy
    * @desc Sets the access control policy on an Organization resource.
    * Replaces any existing policy. The `resource` field should be the
    * organization's resource name, e.g. "organizations/123".  Authorization
    * requires the Google IAM permission
    * `resourcemanager.organizations.setIamPolicy` on the specified
    * organization
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
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
    * cloudresourcemanager.organizations.setOrgPolicy
    * @desc Updates the specified `Policy` on the resource. Creates a new
    * `Policy` for that `Constraint` on the resource if one does not exist. Not
    * supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Resource name of the resource to attach the `Policy`.
    *     resource_: 'organizations/my-organization',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.organizations.setOrgPolicy(request, function(err,
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
    * @alias cloudresourcemanager.organizations.setOrgPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ Resource name of the resource to attach the `Policy`.
    * @param {().SetOrgPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setOrgPolicy(): GaxiosPromise[Schema$OrgPolicy] = js.native
  def setOrgPolicy(callback: BodyResponseCallback[Schema$OrgPolicy]): Unit = js.native
  def setOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarSetorgpolicy): GaxiosPromise[Schema$OrgPolicy] = js.native
  def setOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSetorgpolicy,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def setOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSetorgpolicy,
    options: BodyResponseCallback[Schema$OrgPolicy],
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def setOrgPolicy(params: ParamsDollarResourceDollarOrganizationsDollarSetorgpolicy, options: MethodOptions): GaxiosPromise[Schema$OrgPolicy] = js.native
  def setOrgPolicy(
    params: ParamsDollarResourceDollarOrganizationsDollarSetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.organizations.testIamPermissions
    * @desc Returns permissions that a caller has on the specified
    * Organization. The `resource` field should be the organization's resource
    * name, e.g. "organizations/123".  There are no permissions required for
    * making this API call.
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
    * var cloudResourceManager = google.cloudresourcemanager('v1');
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
}

