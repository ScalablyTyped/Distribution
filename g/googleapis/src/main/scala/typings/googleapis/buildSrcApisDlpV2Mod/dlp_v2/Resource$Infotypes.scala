package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Infotypes")
@js.native
class Resource$Infotypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.infoTypes.list
    * @desc Returns a list of the sensitive information types that the DLP API
    * supports. See https://cloud.google.com/dlp/docs/infotypes-reference to
    * learn more.
    * @alias dlp.infoTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional filter to only return infoTypes supported by certain parts of the API. Defaults to supported_by=INSPECT.
    * @param {string=} params.languageCode Optional BCP-47 language code for localized infoType friendly names. If omitted, or if localized strings are not available, en-US strings will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInfoTypesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInfotypesDollarList): GaxiosPromise[Schema$GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInfotypesDollarList,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInfotypesDollarList,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInfoTypesResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInfotypesDollarList, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInfotypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
}

