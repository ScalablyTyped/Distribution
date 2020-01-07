package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Browsers")
@js.native
class Resource$Browsers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.browsers.list
    * @desc Retrieves a list of browsers.
    * @alias dfareporting.browsers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$BrowsersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$BrowsersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBrowsersDollarList): GaxiosPromise[Schema$BrowsersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBrowsersDollarList,
    callback: BodyResponseCallback[Schema$BrowsersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBrowsersDollarList,
    options: BodyResponseCallback[Schema$BrowsersListResponse],
    callback: BodyResponseCallback[Schema$BrowsersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBrowsersDollarList, options: MethodOptions): GaxiosPromise[Schema$BrowsersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBrowsersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BrowsersListResponse]
  ): Unit = js.native
}

