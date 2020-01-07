package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/deploymentmanager/alpha", "deploymentmanager_alpha.Resource$Deployments")
@js.native
class Resource$Deployments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * deploymentmanager.deployments.cancelPreview
    * @desc Cancels and removes the preview currently associated with the
    * deployment.
    * @alias deploymentmanager.deployments.cancelPreview
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string} params.project The project ID for this request.
    * @param {().DeploymentsCancelPreviewRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancelPreview(): GaxiosPromise[Schema$Operation] = js.native
  def cancelPreview(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def cancelPreview(params: ParamsDollarResourceDollarDeploymentsDollarCancelpreview): GaxiosPromise[Schema$Operation] = js.native
  def cancelPreview(
    params: ParamsDollarResourceDollarDeploymentsDollarCancelpreview,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def cancelPreview(
    params: ParamsDollarResourceDollarDeploymentsDollarCancelpreview,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def cancelPreview(params: ParamsDollarResourceDollarDeploymentsDollarCancelpreview, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def cancelPreview(
    params: ParamsDollarResourceDollarDeploymentsDollarCancelpreview,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.delete
    * @desc Deletes a deployment and all of the resources in the deployment.
    * @alias deploymentmanager.deployments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.deletePolicy Sets the policy to use for deleting resources.
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDeploymentsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarDeploymentsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDeploymentsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDeploymentsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarDeploymentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.get
    * @desc Gets information about a specific deployment.
    * @alias deploymentmanager.deployments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Deployment] = js.native
  def get(callback: BodyResponseCallback[Schema$Deployment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDeploymentsDollarGet): GaxiosPromise[Schema$Deployment] = js.native
  def get(
    params: ParamsDollarResourceDollarDeploymentsDollarGet,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDeploymentsDollarGet,
    options: BodyResponseCallback[Schema$Deployment],
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDeploymentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Deployment] = js.native
  def get(
    params: ParamsDollarResourceDollarDeploymentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias deploymentmanager.deployments.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarDeploymentsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarDeploymentsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarDeploymentsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarDeploymentsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarDeploymentsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.insert
    * @desc Creates a deployment and all of the resources described by the
    * deployment manifest.
    * @alias deploymentmanager.deployments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.createPolicy Sets the policy to use for creating new resources.
    * @param {boolean=} params.preview If set to true, creates a deployment and creates "shell" resources but does not actually instantiate these resources. This allows you to preview what your deployment looks like. After previewing a deployment, you can deploy your resources by making a request with the update() method or you can use the cancelPreview() method to cancel the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
    * @param {string} params.project The project ID for this request.
    * @param {().Deployment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDeploymentsDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarDeploymentsDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDeploymentsDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDeploymentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarDeploymentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.list
    * @desc Lists all deployments for a given project.
    * @alias deploymentmanager.deployments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DeploymentsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DeploymentsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDeploymentsDollarList): GaxiosPromise[Schema$DeploymentsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDeploymentsDollarList,
    callback: BodyResponseCallback[Schema$DeploymentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDeploymentsDollarList,
    options: BodyResponseCallback[Schema$DeploymentsListResponse],
    callback: BodyResponseCallback[Schema$DeploymentsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDeploymentsDollarList, options: MethodOptions): GaxiosPromise[Schema$DeploymentsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDeploymentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeploymentsListResponse]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.patch
    * @desc Updates a deployment and all of the resources described by the
    * deployment manifest. This method supports patch semantics.
    * @alias deploymentmanager.deployments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.createPolicy Sets the policy to use for creating new resources.
    * @param {string=} params.deletePolicy Sets the policy to use for deleting resources.
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {boolean=} params.preview If set to true, updates the deployment and creates and updates the "shell" resources but does not actually alter or instantiate these resources. This allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must provide a target.config with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request with the update() or you can cancelPreview() to remove the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
    * @param {string} params.project The project ID for this request.
    * @param {().Deployment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDeploymentsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarDeploymentsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarDeploymentsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDeploymentsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarDeploymentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias deploymentmanager.deployments.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().GlobalSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarDeploymentsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarDeploymentsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarDeploymentsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarDeploymentsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarDeploymentsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.stop
    * @desc Stops an ongoing operation. This does not roll back any work that
    * has already been completed, but prevents any new work from being started.
    * @alias deploymentmanager.deployments.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string} params.project The project ID for this request.
    * @param {().DeploymentsStopRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Schema$Operation] = js.native
  def stop(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarDeploymentsDollarStop): GaxiosPromise[Schema$Operation] = js.native
  def stop(
    params: ParamsDollarResourceDollarDeploymentsDollarStop,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarDeploymentsDollarStop,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stop(params: ParamsDollarResourceDollarDeploymentsDollarStop, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def stop(
    params: ParamsDollarResourceDollarDeploymentsDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias deploymentmanager.deployments.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarDeploymentsDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarDeploymentsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarDeploymentsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarDeploymentsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarDeploymentsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  /**
    * deploymentmanager.deployments.update
    * @desc Updates a deployment and all of the resources described by the
    * deployment manifest.
    * @alias deploymentmanager.deployments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.createPolicy Sets the policy to use for creating new resources.
    * @param {string=} params.deletePolicy Sets the policy to use for deleting resources.
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {boolean=} params.preview If set to true, updates the deployment and creates and updates the "shell" resources but does not actually alter or instantiate these resources. This allows you to preview what your deployment will look like. You can use this intent to preview how an update would affect your deployment. You must provide a target.config with a configuration if this is set to true. After previewing a deployment, you can deploy your resources by making a request with the update() or you can cancelPreview() to remove the preview altogether. Note that the deployment will still exist after you cancel the preview and you must separately delete this deployment if you want to remove it.
    * @param {string} params.project The project ID for this request.
    * @param {().Deployment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarDeploymentsDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarDeploymentsDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarDeploymentsDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarDeploymentsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarDeploymentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

