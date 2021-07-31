package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers$Annotationdata")
@js.native
class ResourceLayersAnnotationdata protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * books.layers.annotationData.get
    * @desc Gets the annotation data.
    * @alias books.layers.annotationData.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.allowWebDefinitions For the dictionary layer. Whether or not to allow web definitions.
    * @param {string} params.annotationDataId The ID of the annotation data to retrieve.
    * @param {string} params.contentVersion The content version for the volume you are trying to retrieve.
    * @param {integer=} params.h The requested pixel height for any images. If height is provided width must also be provided.
    * @param {string} params.layerId The ID for the layer to get the annotations.
    * @param {string=} params.locale The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    * @param {integer=} params.scale The requested scale for the image.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId The volume to retrieve annotations for.
    * @param {integer=} params.w The requested pixel width for any images. If width is provided height must also be provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAnnotationdata] = js.native
  def get(callback: BodyResponseCallback[SchemaAnnotationdata]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotationdata] = js.native
  def get(params: ParamsResourceLayersAnnotationdataGet): GaxiosPromise[SchemaAnnotationdata] = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    callback: BodyResponseCallback[SchemaAnnotationdata]
  ): Unit = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    options: BodyResponseCallback[SchemaAnnotationdata],
    callback: BodyResponseCallback[SchemaAnnotationdata]
  ): Unit = js.native
  def get(params: ParamsResourceLayersAnnotationdataGet, options: MethodOptions): GaxiosPromise[SchemaAnnotationdata] = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationdata]
  ): Unit = js.native
  
  /**
    * books.layers.annotationData.list
    * @desc Gets the annotation data for a volume and layer.
    * @alias books.layers.annotationData.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.annotationDataId The list of Annotation Data Ids to retrieve. Pagination is ignored if this is set.
    * @param {string} params.contentVersion The content version for the requested volume.
    * @param {integer=} params.h The requested pixel height for any images. If height is provided width must also be provided.
    * @param {string} params.layerId The ID for the layer to get the annotation data.
    * @param {string=} params.locale The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken The value of the nextToken from the previous page.
    * @param {integer=} params.scale The requested scale for the image.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string=} params.updatedMax RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    * @param {string=} params.updatedMin RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    * @param {string} params.volumeId The volume to retrieve annotation data for.
    * @param {integer=} params.w The requested pixel width for any images. If width is provided height must also be provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(callback: BodyResponseCallback[SchemaAnnotationsdata]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(params: ParamsResourceLayersAnnotationdataList): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    callback: BodyResponseCallback[SchemaAnnotationsdata]
  ): Unit = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    options: BodyResponseCallback[SchemaAnnotationsdata],
    callback: BodyResponseCallback[SchemaAnnotationsdata]
  ): Unit = js.native
  def list(params: ParamsResourceLayersAnnotationdataList, options: MethodOptions): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationsdata]
  ): Unit = js.native
}
