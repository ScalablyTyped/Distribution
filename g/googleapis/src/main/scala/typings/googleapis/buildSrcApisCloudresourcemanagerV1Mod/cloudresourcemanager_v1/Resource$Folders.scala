package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1", "cloudresourcemanager_v1.Resource$Folders")
@js.native
class Resource$Folders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudresourcemanager.folders.clearOrgPolicy
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
    *     resource_: 'folders/my-folder',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.folders.clearOrgPolicy(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
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
    * @alias cloudresourcemanager.folders.clearOrgPolicy
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
  def clearOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarClearorgpolicy): GaxiosPromise[Schema$Empty] = js.native
  def clearOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarClearorgpolicy,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def clearOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarClearorgpolicy,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def clearOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarClearorgpolicy, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def clearOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarClearorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.getEffectiveOrgPolicy
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
    * `Policy`. resource_: 'folders/my-folder',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.folders.getEffectiveOrgPolicy(request,
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
    * @alias cloudresourcemanager.folders.getEffectiveOrgPolicy
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
  def getEffectiveOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarGeteffectiveorgpolicy): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGeteffectiveorgpolicy,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGeteffectiveorgpolicy,
    options: BodyResponseCallback[Schema$OrgPolicy],
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarGeteffectiveorgpolicy, options: MethodOptions): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGeteffectiveorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.getOrgPolicy
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
    *     resource_: 'folders/my-folder',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.folders.getOrgPolicy(request, function(err,
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
    * @alias cloudresourcemanager.folders.getOrgPolicy
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
  def getOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarGetorgpolicy): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGetorgpolicy,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGetorgpolicy,
    options: BodyResponseCallback[Schema$OrgPolicy],
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def getOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarGetorgpolicy, options: MethodOptions): GaxiosPromise[Schema$OrgPolicy] = js.native
  def getOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarGetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.listAvailableOrgPolicyConstraints
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
    *     resource_: 'folders/my-folder',  // TODO: Update placeholder value.
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
    *       cloudResourceManager.folders.listAvailableOrgPolicyConstraints(request,
    * handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.folders.listAvailableOrgPolicyConstraints(request,
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
    * @alias cloudresourcemanager.folders.listAvailableOrgPolicyConstraints
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
  def listAvailableOrgPolicyConstraints(params: ParamsDollarResourceDollarFoldersDollarListavailableorgpolicyconstraints): GaxiosPromise[Schema$ListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarFoldersDollarListavailableorgpolicyconstraints,
    callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarFoldersDollarListavailableorgpolicyconstraints,
    options: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse],
    callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarFoldersDollarListavailableorgpolicyconstraints,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsDollarResourceDollarFoldersDollarListavailableorgpolicyconstraints,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.listOrgPolicies
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
    *     resource_: 'folders/my-folder',  // TODO: Update placeholder value.
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
    *       cloudResourceManager.folders.listOrgPolicies(request, handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.folders.listOrgPolicies(request, handlePage);
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
    * @alias cloudresourcemanager.folders.listOrgPolicies
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
  def listOrgPolicies(params: ParamsDollarResourceDollarFoldersDollarListorgpolicies): GaxiosPromise[Schema$ListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsDollarResourceDollarFoldersDollarListorgpolicies,
    callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(
    params: ParamsDollarResourceDollarFoldersDollarListorgpolicies,
    options: BodyResponseCallback[Schema$ListOrgPoliciesResponse],
    callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(params: ParamsDollarResourceDollarFoldersDollarListorgpolicies, options: MethodOptions): GaxiosPromise[Schema$ListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsDollarResourceDollarFoldersDollarListorgpolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOrgPoliciesResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.folders.setOrgPolicy
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
    *     resource_: 'folders/my-folder',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.folders.setOrgPolicy(request, function(err,
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
    * @alias cloudresourcemanager.folders.setOrgPolicy
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
  def setOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarSetorgpolicy): GaxiosPromise[Schema$OrgPolicy] = js.native
  def setOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarSetorgpolicy,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def setOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarSetorgpolicy,
    options: BodyResponseCallback[Schema$OrgPolicy],
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
  def setOrgPolicy(params: ParamsDollarResourceDollarFoldersDollarSetorgpolicy, options: MethodOptions): GaxiosPromise[Schema$OrgPolicy] = js.native
  def setOrgPolicy(
    params: ParamsDollarResourceDollarFoldersDollarSetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgPolicy]
  ): Unit = js.native
}

