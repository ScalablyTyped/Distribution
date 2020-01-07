package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Grouplicenses")
@js.native
class Resource$Grouplicenses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.grouplicenses.get
    * @desc Retrieves details of an enterprise's group license for a product.
    * @alias androidenterprise.grouplicenses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.groupLicenseId The ID of the product the group license is for, e.g. "app:com.google.android.gm".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GroupLicense] = js.native
  def get(callback: BodyResponseCallback[Schema$GroupLicense]): Unit = js.native
  def get(params: ParamsDollarResourceDollarGrouplicensesDollarGet): GaxiosPromise[Schema$GroupLicense] = js.native
  def get(
    params: ParamsDollarResourceDollarGrouplicensesDollarGet,
    callback: BodyResponseCallback[Schema$GroupLicense]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarGrouplicensesDollarGet,
    options: BodyResponseCallback[Schema$GroupLicense],
    callback: BodyResponseCallback[Schema$GroupLicense]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarGrouplicensesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GroupLicense] = js.native
  def get(
    params: ParamsDollarResourceDollarGrouplicensesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GroupLicense]
  ): Unit = js.native
  /**
    * androidenterprise.grouplicenses.list
    * @desc Retrieves IDs of all products for which the enterprise has a group
    * license.
    * @alias androidenterprise.grouplicenses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GroupLicensesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GroupLicensesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGrouplicensesDollarList): GaxiosPromise[Schema$GroupLicensesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGrouplicensesDollarList,
    callback: BodyResponseCallback[Schema$GroupLicensesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGrouplicensesDollarList,
    options: BodyResponseCallback[Schema$GroupLicensesListResponse],
    callback: BodyResponseCallback[Schema$GroupLicensesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGrouplicensesDollarList, options: MethodOptions): GaxiosPromise[Schema$GroupLicensesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGrouplicensesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GroupLicensesListResponse]
  ): Unit = js.native
}

