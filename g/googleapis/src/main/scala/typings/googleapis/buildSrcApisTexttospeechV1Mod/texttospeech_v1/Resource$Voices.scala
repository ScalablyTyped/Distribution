package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/texttospeech/v1", "texttospeech_v1.Resource$Voices")
@js.native
class Resource$Voices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * texttospeech.voices.list
    * @desc Returns a list of Voice supported for synthesis.
    * @alias texttospeech.voices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional (but recommended) [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. E.g. when specifying "en-NZ", you will get supported "en-*" voices; when specifying "no", you will get supported "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh" will also get supported "cmn-*" voices; specifying "zh-hk" will also get supported "yue-*" voices.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListVoicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListVoicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVoicesDollarList): GaxiosPromise[Schema$ListVoicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVoicesDollarList,
    callback: BodyResponseCallback[Schema$ListVoicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVoicesDollarList,
    options: BodyResponseCallback[Schema$ListVoicesResponse],
    callback: BodyResponseCallback[Schema$ListVoicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVoicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListVoicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVoicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListVoicesResponse]
  ): Unit = js.native
}

