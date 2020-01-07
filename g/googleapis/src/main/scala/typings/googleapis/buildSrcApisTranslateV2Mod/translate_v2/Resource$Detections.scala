package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/translate/v2", "translate_v2.Resource$Detections")
@js.native
class Resource$Detections protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * language.detections.detect
    * @desc Detects the language of text within a request.
    * @alias language.detections.detect
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DetectLanguageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detect(): GaxiosPromise[Schema$DetectionsListResponse] = js.native
  def detect(callback: BodyResponseCallback[Schema$DetectionsListResponse]): Unit = js.native
  def detect(params: ParamsDollarResourceDollarDetectionsDollarDetect): GaxiosPromise[Schema$DetectionsListResponse] = js.native
  def detect(
    params: ParamsDollarResourceDollarDetectionsDollarDetect,
    callback: BodyResponseCallback[Schema$DetectionsListResponse]
  ): Unit = js.native
  def detect(
    params: ParamsDollarResourceDollarDetectionsDollarDetect,
    options: BodyResponseCallback[Schema$DetectionsListResponse],
    callback: BodyResponseCallback[Schema$DetectionsListResponse]
  ): Unit = js.native
  def detect(params: ParamsDollarResourceDollarDetectionsDollarDetect, options: MethodOptions): GaxiosPromise[Schema$DetectionsListResponse] = js.native
  def detect(
    params: ParamsDollarResourceDollarDetectionsDollarDetect,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DetectionsListResponse]
  ): Unit = js.native
  /**
    * language.detections.list
    * @desc Detects the language of text within a request.
    * @alias language.detections.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.q The input text upon which to perform language detection. Repeat this parameter to perform language detection on multiple text inputs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DetectionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DetectionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDetectionsDollarList): GaxiosPromise[Schema$DetectionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDetectionsDollarList,
    callback: BodyResponseCallback[Schema$DetectionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDetectionsDollarList,
    options: BodyResponseCallback[Schema$DetectionsListResponse],
    callback: BodyResponseCallback[Schema$DetectionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDetectionsDollarList, options: MethodOptions): GaxiosPromise[Schema$DetectionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDetectionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DetectionsListResponse]
  ): Unit = js.native
}

