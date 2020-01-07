package typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1beta1", "cloudresourcemanager_v1beta1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudresourcemanager.projects.create
    * @desc Creates a Project resource.  Initially, the Project resource is
    * owned by its creator exclusively. The creator can later grant permission
    * to others to read or update the Project.  Several APIs are activated
    * automatically for the Project, including Google Cloud Storage. The parent
    * is identified by a specified ResourceId, which must include both an ID
    * and a type, such as project, folder, or organization.  This method does
    * not associate the new project with a billing account. You can set or
    * update the billing account associated with a project using the
    * [`projects.updateBillingInfo`]
    * (/billing/reference/rest/v1/projects/updateBillingInfo) method.
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.create(request, function(err, response) {
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
    * @alias cloudresourcemanager.projects.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.useLegacyStack A safety hatch to opt out of the new reliable project creation process.
    * @param {().Project} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Project] = js.native
  def create(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarCreate): GaxiosPromise[Schema$Project] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCreate,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCreate,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.delete
    * @desc Marks the Project identified by the specified `project_id` (for
    * example, `my-project-123`) for deletion. This method will only affect the
    * Project if it has a lifecycle state of ACTIVE.  This method changes the
    * Project's lifecycle state from ACTIVE to DELETE_REQUESTED. The deletion
    * starts at an unspecified time, at which point the project is no longer
    * accessible.  Until the deletion completes, you can check the lifecycle
    * state checked by retrieving the Project with GetProject, and the Project
    * remains visible to ListProjects. However, you cannot update the project.
    * After the deletion completes, the Project is not retrievable by the
    * GetProject and ListProjects methods.  The caller must have modify
    * permissions for this Project.
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
    *     // The Project ID (for example, `foo-bar-123`).
    *     // Required.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.delete(request, function(err) {
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
    * @alias cloudresourcemanager.projects.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The Project ID (for example, `foo-bar-123`).  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.get
    * @desc Retrieves the Project identified by the specified `project_id` (for
    * example, `my-project-123`).  The caller must have read permissions for
    * this Project.
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
    *     // The Project ID (for example, `my-project-123`).
    *     // Required.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.get(request, function(err, response) {
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
    * @alias cloudresourcemanager.projects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The Project ID (for example, `my-project-123`).  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Project] = js.native
  def get(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.getAncestry
    * @desc Gets a list of ancestors in the resource hierarchy for the Project
    * identified by the specified `project_id` (for example, `my-project-123`).
    * The caller must have read permissions for this Project.
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
    *     // The Project ID (for example, `my-project-123`).
    *     // Required.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.getAncestry(request, function(err,
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
    * @alias cloudresourcemanager.projects.getAncestry
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The Project ID (for example, `my-project-123`).  Required.
    * @param {().GetAncestryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAncestry(): GaxiosPromise[Schema$GetAncestryResponse] = js.native
  def getAncestry(callback: BodyResponseCallback[Schema$GetAncestryResponse]): Unit = js.native
  def getAncestry(params: ParamsDollarResourceDollarProjectsDollarGetancestry): GaxiosPromise[Schema$GetAncestryResponse] = js.native
  def getAncestry(
    params: ParamsDollarResourceDollarProjectsDollarGetancestry,
    callback: BodyResponseCallback[Schema$GetAncestryResponse]
  ): Unit = js.native
  def getAncestry(
    params: ParamsDollarResourceDollarProjectsDollarGetancestry,
    options: BodyResponseCallback[Schema$GetAncestryResponse],
    callback: BodyResponseCallback[Schema$GetAncestryResponse]
  ): Unit = js.native
  def getAncestry(params: ParamsDollarResourceDollarProjectsDollarGetancestry, options: MethodOptions): GaxiosPromise[Schema$GetAncestryResponse] = js.native
  def getAncestry(
    params: ParamsDollarResourceDollarProjectsDollarGetancestry,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetAncestryResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.getIamPolicy
    * @desc Returns the IAM access control policy for the specified Project.
    * Permission is denied if the policy or the resource does not exist.  For
    * additional information about resource structure and identification, see
    * [Resource Names](/apis/design/resource_names).
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
    * field. resource_: 'my-resource',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.getIamPolicy(request, function(err,
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
    * @alias cloudresourcemanager.projects.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.list
    * @desc Lists Projects that are visible to the user and satisfy the
    * specified filter. This method returns Projects in an unspecified order.
    * This method is eventually consistent with project mutations; this means
    * that a newly created project may not appear in the results or recent
    * updates to an existing project may not be reflected in the results. To
    * retrieve the latest state of a project, use the GetProjectmethod.
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
    *     var projectsPage = response['projects'];
    *     if (!projectsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < projectsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `projectsPage`: console.log(JSON.stringify(projectsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudResourceManager.projects.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.projects.list(request, handlePage);
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
    * @alias cloudresourcemanager.projects.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An expression for filtering the results of the request.  Filter rules are case insensitive. The fields eligible for filtering are:  + `name` + `id` + <code>labels.<em>key</em></code> where *key* is the name of a label  Some examples of using labels as filters:  |Filter|Description| |------|-----------| |name:how*|The project's name starts with "how".| |name:Howl|The project's name is `Howl` or `howl`.| |name:HOWL|Equivalent to above.| |NAME:howl|Equivalent to above.| |labels.color:*|The project has the label `color`.| |labels.color:red|The project's label `color` has the value `red`.| |labels.color:red&nbsp;labels.size:big|The project's label `color` has the value `red` and its label `size` has the value `big`.  If you specify a filter that has both `parent.type` and `parent.id`, then the `resourcemanager.projects.list` permission is checked on the parent. If the user has this permission, all projects under the parent will be returned after remaining filters have been applied. If the user lacks this permission, then all projects for which the user has the `resourcemanager.projects.get` permission will be returned after remaining filters have been applied. If no filter is specified, the call will return projects for which the user has `resourcemanager.projects.get` permissions.  Optional.
    * @param {integer=} params.pageSize The maximum number of Projects to return in the response. The server can return fewer Projects than requested. If unspecified, server picks an appropriate default.  Optional.
    * @param {string=} params.pageToken A pagination token returned from a previous call to ListProjects that indicates from where listing should continue.  Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListProjectsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListProjectsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarList): GaxiosPromise[Schema$ListProjectsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    callback: BodyResponseCallback[Schema$ListProjectsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    options: BodyResponseCallback[Schema$ListProjectsResponse],
    callback: BodyResponseCallback[Schema$ListProjectsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListProjectsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListProjectsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.setIamPolicy
    * @desc Sets the IAM access control policy for the specified Project.
    * Overwrites any existing policy.  The following constraints apply when
    * using `setIamPolicy()`:  + Project does not support `allUsers` and
    * `allAuthenticatedUsers` as `members` in a `Binding` of a `Policy`.  + The
    * owner role can be granted only to `user` and `serviceAccount`.  + Service
    * accounts can be made owners of a project directly without any
    * restrictions. However, to be added as an owner, a user must be invited
    * via Cloud Platform console and must accept the invitation.  + A user
    * cannot be granted the owner role using `setIamPolicy()`. The user must be
    * granted the owner role using the Cloud Platform Console and must
    * explicitly accept the invitation.  + Invitations to grant the owner role
    * cannot be sent using `setIamPolicy()`; they must be sent only using the
    * Cloud Platform Console.  + Membership changes that leave the project
    * without any owners that have accepted the Terms of Service (ToS) will be
    * rejected.  + If the project is not part of an organization, there must be
    * at least one owner who has accepted the Terms of Service (ToS) agreement
    * in the policy. Calling `setIamPolicy()` to remove the last ToS-accepted
    * owner from the policy will fail. This restriction also applies to legacy
    * projects that no longer have owners who have accepted the ToS. Edits to
    * IAM policies will be rejected until the lack of a ToS-accepting owner is
    * rectified.  + This method will replace the existing policy, and cannot be
    * used to append additional IAM settings.  Note: Removing service accounts
    * from policies or changing their roles can render services completely
    * inoperable. It is important to understand how the service account is
    * being used before removing or updating its roles.
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
    * field. resource_: 'my-resource',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.setIamPolicy(request, function(err,
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
    * @alias cloudresourcemanager.projects.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.testIamPermissions
    * @desc Returns permissions that a caller has on the specified Project.
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
    * field. resource_: 'my-resource',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.testIamPermissions(request, function(err,
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
    * @alias cloudresourcemanager.projects.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.undelete
    * @desc Restores the Project identified by the specified `project_id` (for
    * example, `my-project-123`). You can only use this method for a Project
    * that has a lifecycle state of DELETE_REQUESTED. After deletion starts,
    * the Project cannot be restored.  The caller must have modify permissions
    * for this Project.
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
    *     // The project ID (for example, `foo-bar-123`).
    *     // Required.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.projects.undelete(request, function(err) {
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
    * @alias cloudresourcemanager.projects.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The project ID (for example, `foo-bar-123`).  Required.
    * @param {().UndeleteProjectRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$Empty] = js.native
  def undelete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarProjectsDollarUndelete): GaxiosPromise[Schema$Empty] = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarUndelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarUndelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarProjectsDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def undelete(
    params: ParamsDollarResourceDollarProjectsDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudresourcemanager.projects.update
    * @desc Updates the attributes of the Project identified by the specified
    * `project_id` (for example, `my-project-123`).  The caller must have
    * modify permissions for this Project.
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
    *     // The project ID (for example, `my-project-123`).
    *     // Required.
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
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
    *   cloudResourceManager.projects.update(request, function(err, response) {
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
    * @alias cloudresourcemanager.projects.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The project ID (for example, `my-project-123`).  Required.
    * @param {().Project} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Project] = js.native
  def update(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarUpdate): GaxiosPromise[Schema$Project] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarUpdate,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarUpdate,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
}

