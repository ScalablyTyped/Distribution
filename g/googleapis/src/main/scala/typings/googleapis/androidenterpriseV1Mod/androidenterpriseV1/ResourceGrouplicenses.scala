package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Grouplicenses")
@js.native
class ResourceGrouplicenses protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(callback: BodyResponseCallback[SchemaGroupLicense]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(params: ParamsResourceGrouplicensesGet): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(params: ParamsResourceGrouplicensesGet, callback: BodyResponseCallback[SchemaGroupLicense]): Unit = js.native
  def get(
    params: ParamsResourceGrouplicensesGet,
    options: BodyResponseCallback[SchemaGroupLicense],
    callback: BodyResponseCallback[SchemaGroupLicense]
  ): Unit = js.native
  def get(params: ParamsResourceGrouplicensesGet, options: MethodOptions): GaxiosPromise[SchemaGroupLicense] = js.native
  def get(
    params: ParamsResourceGrouplicensesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupLicense]
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
  def list(): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGroupLicensesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(params: ParamsResourceGrouplicensesList): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    callback: BodyResponseCallback[SchemaGroupLicensesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    options: BodyResponseCallback[SchemaGroupLicensesListResponse],
    callback: BodyResponseCallback[SchemaGroupLicensesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGrouplicensesList, options: MethodOptions): GaxiosPromise[SchemaGroupLicensesListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicensesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupLicensesListResponse]
  ): Unit = js.native
}
