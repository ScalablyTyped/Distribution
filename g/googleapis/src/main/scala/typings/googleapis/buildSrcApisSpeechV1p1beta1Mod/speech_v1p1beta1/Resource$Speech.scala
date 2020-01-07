package typings.googleapis.buildSrcApisSpeechV1p1beta1Mod.speech_v1p1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/speech/v1p1beta1", "speech_v1p1beta1.Resource$Speech")
@js.native
class Resource$Speech protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * speech.speech.longrunningrecognize
    * @desc Performs asynchronous speech recognition: receive results via the
    * google.longrunning.Operations interface. Returns either an
    * `Operation.error` or an `Operation.response` which contains a
    * `LongRunningRecognizeResponse` message. For more information on
    * asynchronous speech recognition, see the
    * [how-to](https://cloud.google.com/speech-to-text/docs/async-recognize).
    * @alias speech.speech.longrunningrecognize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().LongRunningRecognizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def longrunningrecognize(): GaxiosPromise[Schema$Operation] = js.native
  def longrunningrecognize(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def longrunningrecognize(params: ParamsDollarResourceDollarSpeechDollarLongrunningrecognize): GaxiosPromise[Schema$Operation] = js.native
  def longrunningrecognize(
    params: ParamsDollarResourceDollarSpeechDollarLongrunningrecognize,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def longrunningrecognize(
    params: ParamsDollarResourceDollarSpeechDollarLongrunningrecognize,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def longrunningrecognize(params: ParamsDollarResourceDollarSpeechDollarLongrunningrecognize, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def longrunningrecognize(
    params: ParamsDollarResourceDollarSpeechDollarLongrunningrecognize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * speech.speech.recognize
    * @desc Performs synchronous speech recognition: receive results after all
    * audio has been sent and processed.
    * @alias speech.speech.recognize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RecognizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def recognize(): GaxiosPromise[Schema$RecognizeResponse] = js.native
  def recognize(callback: BodyResponseCallback[Schema$RecognizeResponse]): Unit = js.native
  def recognize(params: ParamsDollarResourceDollarSpeechDollarRecognize): GaxiosPromise[Schema$RecognizeResponse] = js.native
  def recognize(
    params: ParamsDollarResourceDollarSpeechDollarRecognize,
    callback: BodyResponseCallback[Schema$RecognizeResponse]
  ): Unit = js.native
  def recognize(
    params: ParamsDollarResourceDollarSpeechDollarRecognize,
    options: BodyResponseCallback[Schema$RecognizeResponse],
    callback: BodyResponseCallback[Schema$RecognizeResponse]
  ): Unit = js.native
  def recognize(params: ParamsDollarResourceDollarSpeechDollarRecognize, options: MethodOptions): GaxiosPromise[Schema$RecognizeResponse] = js.native
  def recognize(
    params: ParamsDollarResourceDollarSpeechDollarRecognize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RecognizeResponse]
  ): Unit = js.native
}

