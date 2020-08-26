package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Bookshelves$Volumes")
@js.native
class ResourceMylibraryBookshelvesVolumes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.mylibrary.bookshelves.volumes.list
    * @desc Gets volume information for volumes on a bookshelf.
    * @alias books.mylibrary.bookshelves.volumes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.country ISO-3166-1 code to override the IP-based location.
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string=} params.q Full-text search query string in this bookshelf.
    * @param {string} params.shelf The bookshelf ID or name retrieve volumes for.
    * @param {boolean=} params.showPreorders Set to true to show pre-ordered books. Defaults to false.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {integer=} params.startIndex Index of the first element to return (starts at 0)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceMylibraryBookshelvesVolumesList): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    options: BodyResponseCallback[SchemaVolumes],
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceMylibraryBookshelvesVolumesList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
}

