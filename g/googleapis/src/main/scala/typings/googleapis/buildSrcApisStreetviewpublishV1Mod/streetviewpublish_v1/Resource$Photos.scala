package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/streetviewpublish/v1", "streetviewpublish_v1.Resource$Photos")
@js.native
class Resource$Photos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * streetviewpublish.photos.batchDelete
    * @desc Deletes a list of Photos and their metadata.  Note that if
    * BatchDeletePhotos fails, either critical fields are missing or there is
    * an authentication error. Even if BatchDeletePhotos succeeds, individual
    * photos in the batch may have failures. These failures are specified in
    * each PhotoResponse.status in BatchDeletePhotosResponse.results. See
    * DeletePhoto for specific failures that can occur per photo.
    * @alias streetviewpublish.photos.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BatchDeletePhotosRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Schema$BatchDeletePhotosResponse] = js.native
  def batchDelete(callback: BodyResponseCallback[Schema$BatchDeletePhotosResponse]): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarPhotosDollarBatchdelete): GaxiosPromise[Schema$BatchDeletePhotosResponse] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarPhotosDollarBatchdelete,
    callback: BodyResponseCallback[Schema$BatchDeletePhotosResponse]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarPhotosDollarBatchdelete,
    options: BodyResponseCallback[Schema$BatchDeletePhotosResponse],
    callback: BodyResponseCallback[Schema$BatchDeletePhotosResponse]
  ): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarPhotosDollarBatchdelete, options: MethodOptions): GaxiosPromise[Schema$BatchDeletePhotosResponse] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarPhotosDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchDeletePhotosResponse]
  ): Unit = js.native
  /**
    * streetviewpublish.photos.batchGet
    * @desc Gets the metadata of the specified Photo batch.  Note that if
    * BatchGetPhotos fails, either critical fields are missing or there is an
    * authentication error. Even if BatchGetPhotos succeeds, individual photos
    * in the batch may have failures. These failures are specified in each
    * PhotoResponse.status in BatchGetPhotosResponse.results. See GetPhoto for
    * specific failures that can occur per photo.
    * @alias streetviewpublish.photos.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If language_code is unspecified, the user's language preference for Google services is used.
    * @param {string=} params.photoIds Required. IDs of the Photos. For HTTP GET requests, the URL query parameter should be `photoIds=<id1>&photoIds=<id2>&...`.
    * @param {string=} params.view Specifies if a download URL for the photo bytes should be returned in the Photo response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[Schema$BatchGetPhotosResponse] = js.native
  def batchGet(callback: BodyResponseCallback[Schema$BatchGetPhotosResponse]): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarPhotosDollarBatchget): GaxiosPromise[Schema$BatchGetPhotosResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarPhotosDollarBatchget,
    callback: BodyResponseCallback[Schema$BatchGetPhotosResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarPhotosDollarBatchget,
    options: BodyResponseCallback[Schema$BatchGetPhotosResponse],
    callback: BodyResponseCallback[Schema$BatchGetPhotosResponse]
  ): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarPhotosDollarBatchget, options: MethodOptions): GaxiosPromise[Schema$BatchGetPhotosResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarPhotosDollarBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetPhotosResponse]
  ): Unit = js.native
  /**
    * streetviewpublish.photos.batchUpdate
    * @desc Updates the metadata of Photos, such as pose, place association,
    * connections, etc. Changing the pixels of photos is not supported.  Note
    * that if BatchUpdatePhotos fails, either critical fields are missing or
    * there is an authentication error. Even if BatchUpdatePhotos succeeds,
    * individual photos in the batch may have failures. These failures are
    * specified in each PhotoResponse.status in
    * BatchUpdatePhotosResponse.results. See UpdatePhoto for specific failures
    * that can occur per photo.  Only the fields specified in updateMask field
    * are used. If `updateMask` is not present, the update applies to all
    * fields.  The number of UpdatePhotoRequest messages in a
    * BatchUpdatePhotosRequest must not exceed 20.  <aside
    * class="note"><b>Note:</b> To update Pose.altitude, Pose.latLngPair has to
    * be filled as well. Otherwise, the request will fail.</aside>
    * @alias streetviewpublish.photos.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BatchUpdatePhotosRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[Schema$BatchUpdatePhotosResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[Schema$BatchUpdatePhotosResponse]): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarPhotosDollarBatchupdate): GaxiosPromise[Schema$BatchUpdatePhotosResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarPhotosDollarBatchupdate,
    callback: BodyResponseCallback[Schema$BatchUpdatePhotosResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarPhotosDollarBatchupdate,
    options: BodyResponseCallback[Schema$BatchUpdatePhotosResponse],
    callback: BodyResponseCallback[Schema$BatchUpdatePhotosResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarPhotosDollarBatchupdate, options: MethodOptions): GaxiosPromise[Schema$BatchUpdatePhotosResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarPhotosDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchUpdatePhotosResponse]
  ): Unit = js.native
  /**
    * streetviewpublish.photos.list
    * @desc Lists all the Photos that belong to the user.  <aside
    * class="note"><b>Note:</b> Recently created photos that are still being
    * indexed are not returned in the response.</aside>
    * @alias streetviewpublish.photos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression. For example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.  The only filter supported at the moment is `placeId`.
    * @param {string=} params.languageCode The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If language_code is unspecified, the user's language preference for Google services is used.
    * @param {integer=} params.pageSize The maximum number of photos to return. `pageSize` must be non-negative. If `pageSize` is zero or is not provided, the default page size of 100 is used. The number of photos returned in the response may be less than `pageSize` if the number of photos that belong to the user is less than `pageSize`.
    * @param {string=} params.pageToken The nextPageToken value returned from a previous ListPhotos request, if any.
    * @param {string=} params.view Specifies if a download URL for the photos bytes should be returned in the Photos response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListPhotosResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListPhotosResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPhotosDollarList): GaxiosPromise[Schema$ListPhotosResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPhotosDollarList,
    callback: BodyResponseCallback[Schema$ListPhotosResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPhotosDollarList,
    options: BodyResponseCallback[Schema$ListPhotosResponse],
    callback: BodyResponseCallback[Schema$ListPhotosResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPhotosDollarList, options: MethodOptions): GaxiosPromise[Schema$ListPhotosResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPhotosDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListPhotosResponse]
  ): Unit = js.native
}

