package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers")
@js.native
class Resource$Layers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var annotationData: ResourceDollarLayersDollarAnnotationdata = js.native
  var context: APIRequestContext = js.native
  var volumeAnnotations: ResourceDollarLayersDollarVolumeannotations = js.native
  /**
    * books.layers.get
    * @desc Gets the layer summary for a volume.
    * @alias books.layers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.contentVersion The content version for the requested volume.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.summaryId The ID for the layer to get the summary for.
    * @param {string} params.volumeId The volume to retrieve layers for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Layersummary] = js.native
  def get(callback: BodyResponseCallback[Schema$Layersummary]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLayersDollarGet): GaxiosPromise[Schema$Layersummary] = js.native
  def get(
    params: ParamsDollarResourceDollarLayersDollarGet,
    callback: BodyResponseCallback[Schema$Layersummary]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLayersDollarGet,
    options: BodyResponseCallback[Schema$Layersummary],
    callback: BodyResponseCallback[Schema$Layersummary]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLayersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Layersummary] = js.native
  def get(
    params: ParamsDollarResourceDollarLayersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Layersummary]
  ): Unit = js.native
  /**
    * books.layers.list
    * @desc List the layer summaries for a volume.
    * @alias books.layers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.contentVersion The content version for the requested volume.
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken The value of the nextToken from the previous page.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId The volume to retrieve layers for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Layersummaries] = js.native
  def list(callback: BodyResponseCallback[Schema$Layersummaries]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLayersDollarList): GaxiosPromise[Schema$Layersummaries] = js.native
  def list(
    params: ParamsDollarResourceDollarLayersDollarList,
    callback: BodyResponseCallback[Schema$Layersummaries]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLayersDollarList,
    options: BodyResponseCallback[Schema$Layersummaries],
    callback: BodyResponseCallback[Schema$Layersummaries]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLayersDollarList, options: MethodOptions): GaxiosPromise[Schema$Layersummaries] = js.native
  def list(
    params: ParamsDollarResourceDollarLayersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Layersummaries]
  ): Unit = js.native
}

