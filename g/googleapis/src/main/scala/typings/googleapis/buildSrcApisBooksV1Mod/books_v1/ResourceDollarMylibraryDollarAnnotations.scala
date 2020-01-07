package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Annotations")
@js.native
class ResourceDollarMylibraryDollarAnnotations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.mylibrary.annotations.delete
    * @desc Deletes an annotation.
    * @alias books.mylibrary.annotations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.annotationId The ID for the annotation to delete.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * books.mylibrary.annotations.insert
    * @desc Inserts a new annotation.
    * @alias books.mylibrary.annotations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.annotationId The ID for the annotation to insert.
    * @param {string=} params.country ISO-3166-1 code to override the IP-based location.
    * @param {boolean=} params.showOnlySummaryInResponse Requests that only the summary of the specified layer be provided in the response.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {().Annotation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Annotation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Annotation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarInsert): GaxiosPromise[Schema$Annotation] = js.native
  def insert(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarInsert,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarInsert,
    options: BodyResponseCallback[Schema$Annotation],
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Annotation] = js.native
  def insert(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  /**
    * books.mylibrary.annotations.list
    * @desc Retrieves a list of annotations, possibly filtered.
    * @alias books.mylibrary.annotations.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.contentVersion The content version for the requested volume.
    * @param {string=} params.layerId The layer ID to limit annotation by.
    * @param {string=} params.layerIds The layer ID(s) to limit annotation by.
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken The value of the nextToken from the previous page.
    * @param {boolean=} params.showDeleted Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string=} params.updatedMax RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    * @param {string=} params.updatedMin RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    * @param {string=} params.volumeId The volume to restrict annotations to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Annotations] = js.native
  def list(callback: BodyResponseCallback[Schema$Annotations]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarList): GaxiosPromise[Schema$Annotations] = js.native
  def list(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarList,
    callback: BodyResponseCallback[Schema$Annotations]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarList,
    options: BodyResponseCallback[Schema$Annotations],
    callback: BodyResponseCallback[Schema$Annotations]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarList, options: MethodOptions): GaxiosPromise[Schema$Annotations] = js.native
  def list(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Annotations]
  ): Unit = js.native
  /**
    * books.mylibrary.annotations.summary
    * @desc Gets the summary of specified layers.
    * @alias books.mylibrary.annotations.summary
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.layerIds Array of layer IDs to get the summary for.
    * @param {string} params.volumeId Volume id to get the summary for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def summary(): GaxiosPromise[Schema$AnnotationsSummary] = js.native
  def summary(callback: BodyResponseCallback[Schema$AnnotationsSummary]): Unit = js.native
  def summary(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarSummary): GaxiosPromise[Schema$AnnotationsSummary] = js.native
  def summary(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarSummary,
    callback: BodyResponseCallback[Schema$AnnotationsSummary]
  ): Unit = js.native
  def summary(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarSummary,
    options: BodyResponseCallback[Schema$AnnotationsSummary],
    callback: BodyResponseCallback[Schema$AnnotationsSummary]
  ): Unit = js.native
  def summary(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarSummary, options: MethodOptions): GaxiosPromise[Schema$AnnotationsSummary] = js.native
  def summary(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarSummary,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnnotationsSummary]
  ): Unit = js.native
  /**
    * books.mylibrary.annotations.update
    * @desc Updates an existing annotation.
    * @alias books.mylibrary.annotations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.annotationId The ID for the annotation to update.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {().Annotation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Annotation] = js.native
  def update(callback: BodyResponseCallback[Schema$Annotation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarUpdate): GaxiosPromise[Schema$Annotation] = js.native
  def update(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarUpdate,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarUpdate,
    options: BodyResponseCallback[Schema$Annotation],
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Annotation] = js.native
  def update(
    params: ParamsDollarResourceDollarMylibraryDollarAnnotationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
}

