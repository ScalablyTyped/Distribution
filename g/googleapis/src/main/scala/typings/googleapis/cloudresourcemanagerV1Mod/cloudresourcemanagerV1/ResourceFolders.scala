package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1", "cloudresourcemanager_v1.Resource$Folders")
@js.native
class ResourceFolders protected () extends js.Object {
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
  def clearOrgPolicy(): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def clearOrgPolicy(
    params: ParamsResourceFoldersClearorgpolicy,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def clearOrgPolicy(params: ParamsResourceFoldersClearorgpolicy, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearOrgPolicy(
    params: ParamsResourceFoldersClearorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def getEffectiveOrgPolicy(): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def getEffectiveOrgPolicy(params: ParamsResourceFoldersGeteffectiveorgpolicy): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    options: BodyResponseCallback[SchemaOrgPolicy],
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  def getEffectiveOrgPolicy(params: ParamsResourceFoldersGeteffectiveorgpolicy, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getEffectiveOrgPolicy(
    params: ParamsResourceFoldersGeteffectiveorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgPolicy]
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
  def getOrgPolicy(): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy, callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def getOrgPolicy(
    params: ParamsResourceFoldersGetorgpolicy,
    options: BodyResponseCallback[SchemaOrgPolicy],
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  def getOrgPolicy(params: ParamsResourceFoldersGetorgpolicy, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def getOrgPolicy(
    params: ParamsResourceFoldersGetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgPolicy]
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
  def listAvailableOrgPolicyConstraints(): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]): Unit = js.native
  def listAvailableOrgPolicyConstraints(params: ParamsResourceFoldersListavailableorgpolicyconstraints): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    options: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse],
    callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]
  ): Unit = js.native
  def listAvailableOrgPolicyConstraints(params: ParamsResourceFoldersListavailableorgpolicyconstraints, options: MethodOptions): GaxiosPromise[SchemaListAvailableOrgPolicyConstraintsResponse] = js.native
  def listAvailableOrgPolicyConstraints(
    params: ParamsResourceFoldersListavailableorgpolicyconstraints,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAvailableOrgPolicyConstraintsResponse]
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
  def listOrgPolicies(): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]): Unit = js.native
  def listOrgPolicies(params: ParamsResourceFoldersListorgpolicies): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    options: BodyResponseCallback[SchemaListOrgPoliciesResponse],
    callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]
  ): Unit = js.native
  def listOrgPolicies(params: ParamsResourceFoldersListorgpolicies, options: MethodOptions): GaxiosPromise[SchemaListOrgPoliciesResponse] = js.native
  def listOrgPolicies(
    params: ParamsResourceFoldersListorgpolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOrgPoliciesResponse]
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
  def setOrgPolicy(): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy, callback: BodyResponseCallback[SchemaOrgPolicy]): Unit = js.native
  def setOrgPolicy(
    params: ParamsResourceFoldersSetorgpolicy,
    options: BodyResponseCallback[SchemaOrgPolicy],
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
  def setOrgPolicy(params: ParamsResourceFoldersSetorgpolicy, options: MethodOptions): GaxiosPromise[SchemaOrgPolicy] = js.native
  def setOrgPolicy(
    params: ParamsResourceFoldersSetorgpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgPolicy]
  ): Unit = js.native
}

