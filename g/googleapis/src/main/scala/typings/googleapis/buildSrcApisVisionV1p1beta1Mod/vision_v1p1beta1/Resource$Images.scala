package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1p1beta1", "vision_v1p1beta1.Resource$Images")
@js.native
class Resource$Images protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vision.images.annotate
    * @desc Run image detection and annotation for a batch of images.
    * @alias vision.images.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(callback: BodyResponseCallback[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]): Unit = js.native
  def annotate(params: ParamsDollarResourceDollarImagesDollarAnnotate): GaxiosPromise[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsDollarResourceDollarImagesDollarAnnotate,
    callback: BodyResponseCallback[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsDollarResourceDollarImagesDollarAnnotate,
    options: BodyResponseCallback[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(params: ParamsDollarResourceDollarImagesDollarAnnotate, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsDollarResourceDollarImagesDollarAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
}

