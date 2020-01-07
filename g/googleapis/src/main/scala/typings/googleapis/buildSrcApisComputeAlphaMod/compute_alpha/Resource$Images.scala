package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Images")
@js.native
class Resource$Images protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.images.delete
    * @desc Deletes the specified image.
    * @alias compute.images.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.image Name of the image resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarImagesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarImagesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarImagesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarImagesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarImagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.images.deprecate
    * @desc Sets the deprecation status of an image.  If an empty request body
    * is given, clears the deprecation status instead.
    * @alias compute.images.deprecate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.image Image name.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().DeprecationStatus} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deprecate(): GaxiosPromise[Schema$Operation] = js.native
  def deprecate(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deprecate(params: ParamsDollarResourceDollarImagesDollarDeprecate): GaxiosPromise[Schema$Operation] = js.native
  def deprecate(
    params: ParamsDollarResourceDollarImagesDollarDeprecate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deprecate(
    params: ParamsDollarResourceDollarImagesDollarDeprecate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deprecate(params: ParamsDollarResourceDollarImagesDollarDeprecate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def deprecate(
    params: ParamsDollarResourceDollarImagesDollarDeprecate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.images.get
    * @desc Returns the specified image. Gets a list of available images by
    * making a list() request.
    * @alias compute.images.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.image Name of the image resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Image] = js.native
  def get(callback: BodyResponseCallback[Schema$Image]): Unit = js.native
  def get(params: ParamsDollarResourceDollarImagesDollarGet): GaxiosPromise[Schema$Image] = js.native
  def get(params: ParamsDollarResourceDollarImagesDollarGet, callback: BodyResponseCallback[Schema$Image]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarImagesDollarGet,
    options: BodyResponseCallback[Schema$Image],
    callback: BodyResponseCallback[Schema$Image]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarImagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Image] = js.native
  def get(
    params: ParamsDollarResourceDollarImagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Image]
  ): Unit = js.native
  /**
    * compute.images.getFromFamily
    * @desc Returns the latest image that is part of an image family and is not
    * deprecated.
    * @alias compute.images.getFromFamily
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.family Name of the image family to search for.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getFromFamily(): GaxiosPromise[Schema$Image] = js.native
  def getFromFamily(callback: BodyResponseCallback[Schema$Image]): Unit = js.native
  def getFromFamily(params: ParamsDollarResourceDollarImagesDollarGetfromfamily): GaxiosPromise[Schema$Image] = js.native
  def getFromFamily(
    params: ParamsDollarResourceDollarImagesDollarGetfromfamily,
    callback: BodyResponseCallback[Schema$Image]
  ): Unit = js.native
  def getFromFamily(
    params: ParamsDollarResourceDollarImagesDollarGetfromfamily,
    options: BodyResponseCallback[Schema$Image],
    callback: BodyResponseCallback[Schema$Image]
  ): Unit = js.native
  def getFromFamily(params: ParamsDollarResourceDollarImagesDollarGetfromfamily, options: MethodOptions): GaxiosPromise[Schema$Image] = js.native
  def getFromFamily(
    params: ParamsDollarResourceDollarImagesDollarGetfromfamily,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Image]
  ): Unit = js.native
  /**
    * compute.images.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.images.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarImagesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarImagesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarImagesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarImagesDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarImagesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.images.insert
    * @desc Creates an image in the specified project using the data included
    * in the request.
    * @alias compute.images.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.forceCreate Force image creation if true.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Image} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarImagesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarImagesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarImagesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarImagesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarImagesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.images.list
    * @desc Retrieves the list of custom images available to the specified
    * project. Custom images are images you create that belong to your project.
    * This method does not get any images that belong to other projects,
    * including publicly-available images, like Debian 8. If you want to get a
    * list of publicly-available images, use this method to make a request to
    * the respective image project, such as debian-cloud or windows-cloud.
    * @alias compute.images.list
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
  def list(): GaxiosPromise[Schema$ImageList] = js.native
  def list(callback: BodyResponseCallback[Schema$ImageList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarImagesDollarList): GaxiosPromise[Schema$ImageList] = js.native
  def list(
    params: ParamsDollarResourceDollarImagesDollarList,
    callback: BodyResponseCallback[Schema$ImageList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarImagesDollarList,
    options: BodyResponseCallback[Schema$ImageList],
    callback: BodyResponseCallback[Schema$ImageList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarImagesDollarList, options: MethodOptions): GaxiosPromise[Schema$ImageList] = js.native
  def list(
    params: ParamsDollarResourceDollarImagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImageList]
  ): Unit = js.native
  /**
    * compute.images.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.images.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarImagesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarImagesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarImagesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarImagesDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarImagesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.images.setLabels
    * @desc Sets the labels on an image. To learn more about labels, read the
    * Labeling Resources documentation.
    * @alias compute.images.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().GlobalSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarImagesDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarImagesDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarImagesDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarImagesDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarImagesDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.images.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.images.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarImagesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarImagesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarImagesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarImagesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarImagesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

