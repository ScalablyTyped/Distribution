package typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/datatransfer_v1", "admin_datatransfer_v1.Resource$Applications")
@js.native
class Resource$Applications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * datatransfer.applications.get
    * @desc Retrieves information about an application for the given
    * application ID.
    * @alias datatransfer.applications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId ID of the application resource to be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Application] = js.native
  def get(callback: BodyResponseCallback[Schema$Application]): Unit = js.native
  def get(params: ParamsDollarResourceDollarApplicationsDollarGet): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarApplicationsDollarGet,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarApplicationsDollarGet,
    options: BodyResponseCallback[Schema$Application],
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarApplicationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarApplicationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  /**
    * datatransfer.applications.list
    * @desc Lists the applications available for data transfer for a customer.
    * @alias datatransfer.applications.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customerId Immutable ID of the Google Apps account.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100.
    * @param {string=} params.pageToken Token to specify next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ApplicationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ApplicationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarApplicationsDollarList): GaxiosPromise[Schema$ApplicationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarApplicationsDollarList,
    callback: BodyResponseCallback[Schema$ApplicationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarApplicationsDollarList,
    options: BodyResponseCallback[Schema$ApplicationsListResponse],
    callback: BodyResponseCallback[Schema$ApplicationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarApplicationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ApplicationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarApplicationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApplicationsListResponse]
  ): Unit = js.native
}

