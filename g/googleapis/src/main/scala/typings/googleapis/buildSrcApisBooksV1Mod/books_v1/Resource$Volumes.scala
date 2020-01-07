package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes")
@js.native
class Resource$Volumes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var associated: ResourceDollarVolumesDollarAssociated = js.native
  var context: APIRequestContext = js.native
  var mybooks: ResourceDollarVolumesDollarMybooks = js.native
  var recommended: ResourceDollarVolumesDollarRecommended = js.native
  var useruploaded: ResourceDollarVolumesDollarUseruploaded = js.native
  /**
    * books.volumes.get
    * @desc Gets volume information for a single volume.
    * @alias books.volumes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.country ISO-3166-1 code to override the IP-based location.
    * @param {boolean=} params.includeNonComicsSeries Set to true to include non-comics series. Defaults to false.
    * @param {string=} params.partner Brand results for partner ID.
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {boolean=} params.user_library_consistent_read
    * @param {string} params.volumeId ID of volume to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Volume] = js.native
  def get(callback: BodyResponseCallback[Schema$Volume]): Unit = js.native
  def get(params: ParamsDollarResourceDollarVolumesDollarGet): GaxiosPromise[Schema$Volume] = js.native
  def get(params: ParamsDollarResourceDollarVolumesDollarGet, callback: BodyResponseCallback[Schema$Volume]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarVolumesDollarGet,
    options: BodyResponseCallback[Schema$Volume],
    callback: BodyResponseCallback[Schema$Volume]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarVolumesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Volume] = js.native
  def get(
    params: ParamsDollarResourceDollarVolumesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volume]
  ): Unit = js.native
  /**
    * books.volumes.list
    * @desc Performs a book search.
    * @alias books.volumes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.download Restrict to volumes by download availability.
    * @param {string=} params.filter Filter search results.
    * @param {string=} params.langRestrict Restrict results to books with this language code.
    * @param {string=} params.libraryRestrict Restrict search to this user's library.
    * @param {string=} params.maxAllowedMaturityRating The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.orderBy Sort search results.
    * @param {string=} params.partner Restrict and brand results for partner ID.
    * @param {string=} params.printType Restrict to books or magazines.
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string} params.q Full-text search query string.
    * @param {boolean=} params.showPreorders Set to true to show books available for preorder. Defaults to false.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {integer=} params.startIndex Index of the first result to return (starts at 0)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Volumes] = js.native
  def list(callback: BodyResponseCallback[Schema$Volumes]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVolumesDollarList): GaxiosPromise[Schema$Volumes] = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarList,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarList,
    options: BodyResponseCallback[Schema$Volumes],
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVolumesDollarList, options: MethodOptions): GaxiosPromise[Schema$Volumes] = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
}

