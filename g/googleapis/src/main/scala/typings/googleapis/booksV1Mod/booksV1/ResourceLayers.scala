package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers")
@js.native
class ResourceLayers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var annotationData: ResourceLayersAnnotationdata = js.native
  
  var context: APIRequestContext = js.native
  
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
  def get(): GaxiosPromise[SchemaLayersummary] = js.native
  def get(callback: BodyResponseCallback[SchemaLayersummary]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLayersummary] = js.native
  def get(params: ParamsResourceLayersGet): GaxiosPromise[SchemaLayersummary] = js.native
  def get(params: ParamsResourceLayersGet, callback: BodyResponseCallback[SchemaLayersummary]): Unit = js.native
  def get(
    params: ParamsResourceLayersGet,
    options: BodyResponseCallback[SchemaLayersummary],
    callback: BodyResponseCallback[SchemaLayersummary]
  ): Unit = js.native
  def get(params: ParamsResourceLayersGet, options: MethodOptions): GaxiosPromise[SchemaLayersummary] = js.native
  def get(
    params: ParamsResourceLayersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLayersummary]
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
  def list(): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(callback: BodyResponseCallback[SchemaLayersummaries]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(params: ParamsResourceLayersList): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(params: ParamsResourceLayersList, callback: BodyResponseCallback[SchemaLayersummaries]): Unit = js.native
  def list(
    params: ParamsResourceLayersList,
    options: BodyResponseCallback[SchemaLayersummaries],
    callback: BodyResponseCallback[SchemaLayersummaries]
  ): Unit = js.native
  def list(params: ParamsResourceLayersList, options: MethodOptions): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(
    params: ParamsResourceLayersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLayersummaries]
  ): Unit = js.native
  
  var volumeAnnotations: ResourceLayersVolumeannotations = js.native
}
