package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/texttospeech/v1", "texttospeech_v1.Resource$Text")
@js.native
class Resource$Text protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * texttospeech.text.synthesize
    * @desc Synthesizes speech synchronously: receive results after all text
    * input has been processed.
    * @alias texttospeech.text.synthesize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SynthesizeSpeechRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def synthesize(): GaxiosPromise[Schema$SynthesizeSpeechResponse] = js.native
  def synthesize(callback: BodyResponseCallback[Schema$SynthesizeSpeechResponse]): Unit = js.native
  def synthesize(params: ParamsDollarResourceDollarTextDollarSynthesize): GaxiosPromise[Schema$SynthesizeSpeechResponse] = js.native
  def synthesize(
    params: ParamsDollarResourceDollarTextDollarSynthesize,
    callback: BodyResponseCallback[Schema$SynthesizeSpeechResponse]
  ): Unit = js.native
  def synthesize(
    params: ParamsDollarResourceDollarTextDollarSynthesize,
    options: BodyResponseCallback[Schema$SynthesizeSpeechResponse],
    callback: BodyResponseCallback[Schema$SynthesizeSpeechResponse]
  ): Unit = js.native
  def synthesize(params: ParamsDollarResourceDollarTextDollarSynthesize, options: MethodOptions): GaxiosPromise[Schema$SynthesizeSpeechResponse] = js.native
  def synthesize(
    params: ParamsDollarResourceDollarTextDollarSynthesize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SynthesizeSpeechResponse]
  ): Unit = js.native
}

