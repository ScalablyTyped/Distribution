package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Resource$Presentations$Pages")
@js.native
class ResourceDollarPresentationsDollarPages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * slides.presentations.pages.get
    * @desc Gets the latest version of the specified page in the presentation.
    * @alias slides.presentations.pages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.pageObjectId The object ID of the page to retrieve.
    * @param {string} params.presentationId The ID of the presentation to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Page] = js.native
  def get(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGet): GaxiosPromise[Schema$Page] = js.native
  def get(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGet,
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGet,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def get(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  /**
    * slides.presentations.pages.getThumbnail
    * @desc Generates a thumbnail of the latest version of the specified page
    * in the presentation and returns a URL to the thumbnail image.  This
    * request counts as an [expensive read request](/slides/limits) for quota
    * purposes.
    * @alias slides.presentations.pages.getThumbnail
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.pageObjectId The object ID of the page whose thumbnail to retrieve.
    * @param {string} params.presentationId The ID of the presentation to retrieve.
    * @param {string=} params.thumbnailProperties.mimeType The optional mime type of the thumbnail image.  If you don't specify the mime type, the default mime type will be PNG.
    * @param {string=} params.thumbnailProperties.thumbnailSize The optional thumbnail image size.  If you don't specify the size, the server chooses a default size of the image.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getThumbnail(): GaxiosPromise[Schema$Thumbnail] = js.native
  def getThumbnail(callback: BodyResponseCallback[Schema$Thumbnail]): Unit = js.native
  def getThumbnail(params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGetthumbnail): GaxiosPromise[Schema$Thumbnail] = js.native
  def getThumbnail(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGetthumbnail,
    callback: BodyResponseCallback[Schema$Thumbnail]
  ): Unit = js.native
  def getThumbnail(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGetthumbnail,
    options: BodyResponseCallback[Schema$Thumbnail],
    callback: BodyResponseCallback[Schema$Thumbnail]
  ): Unit = js.native
  def getThumbnail(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGetthumbnail,
    options: MethodOptions
  ): GaxiosPromise[Schema$Thumbnail] = js.native
  def getThumbnail(
    params: ParamsDollarResourceDollarPresentationsDollarPagesDollarGetthumbnail,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Thumbnail]
  ): Unit = js.native
}

