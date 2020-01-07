package typings.googleapis.buildSrcApisWebfontsV1Mod.webfonts_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webfonts/v1", "webfonts_v1.Resource$Webfonts")
@js.native
class Resource$Webfonts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webfonts.webfonts.list
    * @desc Retrieves the list of fonts currently served by the Google Fonts
    * Developer API
    * @alias webfonts.webfonts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.sort Enables sorting of the list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$WebfontList] = js.native
  def list(callback: BodyResponseCallback[Schema$WebfontList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarWebfontsDollarList): GaxiosPromise[Schema$WebfontList] = js.native
  def list(
    params: ParamsDollarResourceDollarWebfontsDollarList,
    callback: BodyResponseCallback[Schema$WebfontList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarWebfontsDollarList,
    options: BodyResponseCallback[Schema$WebfontList],
    callback: BodyResponseCallback[Schema$WebfontList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarWebfontsDollarList, options: MethodOptions): GaxiosPromise[Schema$WebfontList] = js.native
  def list(
    params: ParamsDollarResourceDollarWebfontsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebfontList]
  ): Unit = js.native
}

