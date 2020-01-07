package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Instancetemplates")
@js.native
class Resource$Instancetemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.instanceTemplates.delete
    * @desc Deletes the specified instance template. Deleting an instance
    * template is permanent and cannot be undone. It is not possible to delete
    * templates that are already in use by a managed instance group.
    * @alias compute.instanceTemplates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceTemplate The name of the instance template to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstancetemplatesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancetemplatesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancetemplatesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstancetemplatesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancetemplatesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instanceTemplates.get
    * @desc Returns the specified instance template. Gets a list of available
    * instance templates by making a list() request.
    * @alias compute.instanceTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceTemplate The name of the instance template.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$InstanceTemplate] = js.native
  def get(callback: BodyResponseCallback[Schema$InstanceTemplate]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstancetemplatesDollarGet): GaxiosPromise[Schema$InstanceTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarInstancetemplatesDollarGet,
    callback: BodyResponseCallback[Schema$InstanceTemplate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInstancetemplatesDollarGet,
    options: BodyResponseCallback[Schema$InstanceTemplate],
    callback: BodyResponseCallback[Schema$InstanceTemplate]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstancetemplatesDollarGet, options: MethodOptions): GaxiosPromise[Schema$InstanceTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarInstancetemplatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceTemplate]
  ): Unit = js.native
  /**
    * compute.instanceTemplates.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.instanceTemplates.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarInstancetemplatesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInstancetemplatesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInstancetemplatesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarInstancetemplatesDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInstancetemplatesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.instanceTemplates.insert
    * @desc Creates an instance template in the specified project using the
    * data that is included in the request. If you are creating a new template
    * to update an existing instance group, your new instance template must use
    * the same network or, if applicable, the same subnetwork as the original
    * template.
    * @alias compute.instanceTemplates.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceTemplate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInstancetemplatesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancetemplatesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancetemplatesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInstancetemplatesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancetemplatesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.instanceTemplates.list
    * @desc Retrieves a list of instance templates that are contained within
    * the specified project.
    * @alias compute.instanceTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$InstanceTemplateList] = js.native
  def list(callback: BodyResponseCallback[Schema$InstanceTemplateList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstancetemplatesDollarList): GaxiosPromise[Schema$InstanceTemplateList] = js.native
  def list(
    params: ParamsDollarResourceDollarInstancetemplatesDollarList,
    callback: BodyResponseCallback[Schema$InstanceTemplateList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInstancetemplatesDollarList,
    options: BodyResponseCallback[Schema$InstanceTemplateList],
    callback: BodyResponseCallback[Schema$InstanceTemplateList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstancetemplatesDollarList, options: MethodOptions): GaxiosPromise[Schema$InstanceTemplateList] = js.native
  def list(
    params: ParamsDollarResourceDollarInstancetemplatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceTemplateList]
  ): Unit = js.native
  /**
    * compute.instanceTemplates.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.instanceTemplates.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarInstancetemplatesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInstancetemplatesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInstancetemplatesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarInstancetemplatesDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInstancetemplatesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.instanceTemplates.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.instanceTemplates.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarInstancetemplatesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancetemplatesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancetemplatesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancetemplatesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInstancetemplatesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

