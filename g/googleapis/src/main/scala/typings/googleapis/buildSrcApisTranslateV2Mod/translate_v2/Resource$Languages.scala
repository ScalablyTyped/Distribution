package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Languages")
@js.native
class Resource$Languages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * language.languages.list
    * @desc Returns a list of supported languages for translation.
    * @alias language.languages.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.model The model type for which supported languages should be returned.
    * @param {string=} params.target The language to use to return localized, human readable names of supported languages.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LanguagesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LanguagesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLanguagesDollarList): GaxiosPromise[Schema$LanguagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLanguagesDollarList,
    callback: BodyResponseCallback[Schema$LanguagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLanguagesDollarList,
    options: BodyResponseCallback[Schema$LanguagesListResponse],
    callback: BodyResponseCallback[Schema$LanguagesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLanguagesDollarList, options: MethodOptions): GaxiosPromise[Schema$LanguagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLanguagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LanguagesListResponse]
  ): Unit = js.native
}

