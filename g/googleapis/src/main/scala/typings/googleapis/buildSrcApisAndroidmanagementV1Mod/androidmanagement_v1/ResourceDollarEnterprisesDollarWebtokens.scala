package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Webtokens")
@js.native
class ResourceDollarEnterprisesDollarWebtokens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.webTokens.create
    * @desc Creates a web token to access an embeddable managed Google Play web
    * UI for a given enterprise.
    * @alias androidmanagement.enterprises.webTokens.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {().WebToken} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$WebToken] = js.native
  def create(callback: BodyResponseCallback[Schema$WebToken]): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarWebtokensDollarCreate): GaxiosPromise[Schema$WebToken] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarWebtokensDollarCreate,
    callback: BodyResponseCallback[Schema$WebToken]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarWebtokensDollarCreate,
    options: BodyResponseCallback[Schema$WebToken],
    callback: BodyResponseCallback[Schema$WebToken]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarWebtokensDollarCreate, options: MethodOptions): GaxiosPromise[Schema$WebToken] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarWebtokensDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebToken]
  ): Unit = js.native
}

