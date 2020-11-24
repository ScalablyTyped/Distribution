package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Globalorganizationoperations")
@js.native
class ResourceGlobalorganizationoperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.globalOrganizationOperations.delete
    * @desc Deletes the specified Operations resource.
    * @alias compute.globalOrganizationOperations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.operation Name of the Operations resource to delete.
    * @param {string=} params.parentId Parent ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGlobalorganizationoperationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGlobalorganizationoperationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGlobalorganizationoperationsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGlobalorganizationoperationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceGlobalorganizationoperationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * compute.globalOrganizationOperations.get
    * @desc Retrieves the specified Operations resource. Gets a list of
    * operations by making a list() request.
    * @alias compute.globalOrganizationOperations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.operation Name of the Operations resource to return.
    * @param {string=} params.parentId Parent ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceGlobalorganizationoperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceGlobalorganizationoperationsGet,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(
    params: ParamsResourceGlobalorganizationoperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceGlobalorganizationoperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceGlobalorganizationoperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.globalOrganizationOperations.list
    * @desc Retrieves a list of Operation resources contained within the
    * specified organization.
    * @alias compute.globalOrganizationOperations.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string=} params.parentId Parent ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOperationList] = js.native
  def list(callback: BodyResponseCallback[SchemaOperationList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperationList] = js.native
  def list(params: ParamsResourceGlobalorganizationoperationsList): GaxiosPromise[SchemaOperationList] = js.native
  def list(
    params: ParamsResourceGlobalorganizationoperationsList,
    callback: BodyResponseCallback[SchemaOperationList]
  ): Unit = js.native
  def list(
    params: ParamsResourceGlobalorganizationoperationsList,
    options: BodyResponseCallback[SchemaOperationList],
    callback: BodyResponseCallback[SchemaOperationList]
  ): Unit = js.native
  def list(params: ParamsResourceGlobalorganizationoperationsList, options: MethodOptions): GaxiosPromise[SchemaOperationList] = js.native
  def list(
    params: ParamsResourceGlobalorganizationoperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperationList]
  ): Unit = js.native
  
  def wait(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def wait(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def wait(params: ParamsResourceGlobalorganizationoperationsWait): GaxiosPromise[SchemaOperation] = js.native
  def wait(
    params: ParamsResourceGlobalorganizationoperationsWait,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def wait(
    params: ParamsResourceGlobalorganizationoperationsWait,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def wait(params: ParamsResourceGlobalorganizationoperationsWait, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def wait(
    params: ParamsResourceGlobalorganizationoperationsWait,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
