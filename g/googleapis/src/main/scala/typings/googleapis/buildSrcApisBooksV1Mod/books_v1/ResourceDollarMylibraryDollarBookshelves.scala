package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Bookshelves")
@js.native
class ResourceDollarMylibraryDollarBookshelves protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var volumes: ResourceDollarMylibraryDollarBookshelvesDollarVolumes = js.native
  /**
    * books.mylibrary.bookshelves.addVolume
    * @desc Adds a volume to a bookshelf.
    * @alias books.mylibrary.bookshelves.addVolume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.reason The reason for which the book is added to the library.
    * @param {string} params.shelf ID of bookshelf to which to add a volume.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId ID of volume to add.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addVolume(): GaxiosPromise[Unit] = js.native
  def addVolume(callback: BodyResponseCallback[Unit]): Unit = js.native
  def addVolume(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarAddvolume): GaxiosPromise[Unit] = js.native
  def addVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarAddvolume,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def addVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarAddvolume,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def addVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarAddvolume,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def addVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarAddvolume,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * books.mylibrary.bookshelves.clearVolumes
    * @desc Clears all volumes from a bookshelf.
    * @alias books.mylibrary.bookshelves.clearVolumes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.shelf ID of bookshelf from which to remove a volume.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def clearVolumes(): GaxiosPromise[Unit] = js.native
  def clearVolumes(callback: BodyResponseCallback[Unit]): Unit = js.native
  def clearVolumes(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarClearvolumes): GaxiosPromise[Unit] = js.native
  def clearVolumes(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarClearvolumes,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def clearVolumes(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarClearvolumes,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def clearVolumes(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarClearvolumes,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def clearVolumes(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarClearvolumes,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * books.mylibrary.bookshelves.get
    * @desc Retrieves metadata for a specific bookshelf belonging to the
    * authenticated user.
    * @alias books.mylibrary.bookshelves.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.shelf ID of bookshelf to retrieve.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Bookshelf] = js.native
  def get(callback: BodyResponseCallback[Schema$Bookshelf]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarGet): GaxiosPromise[Schema$Bookshelf] = js.native
  def get(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarGet,
    callback: BodyResponseCallback[Schema$Bookshelf]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarGet,
    options: BodyResponseCallback[Schema$Bookshelf],
    callback: BodyResponseCallback[Schema$Bookshelf]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Bookshelf] = js.native
  def get(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bookshelf]
  ): Unit = js.native
  /**
    * books.mylibrary.bookshelves.list
    * @desc Retrieves a list of bookshelves belonging to the authenticated
    * user.
    * @alias books.mylibrary.bookshelves.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Bookshelves] = js.native
  def list(callback: BodyResponseCallback[Schema$Bookshelves]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarList): GaxiosPromise[Schema$Bookshelves] = js.native
  def list(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarList,
    callback: BodyResponseCallback[Schema$Bookshelves]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarList,
    options: BodyResponseCallback[Schema$Bookshelves],
    callback: BodyResponseCallback[Schema$Bookshelves]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarList, options: MethodOptions): GaxiosPromise[Schema$Bookshelves] = js.native
  def list(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bookshelves]
  ): Unit = js.native
  /**
    * books.mylibrary.bookshelves.moveVolume
    * @desc Moves a volume within a bookshelf.
    * @alias books.mylibrary.bookshelves.moveVolume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.shelf ID of bookshelf with the volume.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId ID of volume to move.
    * @param {integer} params.volumePosition Position on shelf to move the item (0 puts the item before the current first item, 1 puts it between the first and the second and so on.)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def moveVolume(): GaxiosPromise[Unit] = js.native
  def moveVolume(callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveVolume(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume): GaxiosPromise[Unit] = js.native
  def moveVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def moveVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def moveVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def moveVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * books.mylibrary.bookshelves.removeVolume
    * @desc Removes a volume from a bookshelf.
    * @alias books.mylibrary.bookshelves.removeVolume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.reason The reason for which the book is removed from the library.
    * @param {string} params.shelf ID of bookshelf from which to remove a volume.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId ID of volume to remove.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeVolume(): GaxiosPromise[Unit] = js.native
  def removeVolume(callback: BodyResponseCallback[Unit]): Unit = js.native
  def removeVolume(params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarRemovevolume): GaxiosPromise[Unit] = js.native
  def removeVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarRemovevolume,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def removeVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarRemovevolume,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def removeVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarRemovevolume,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def removeVolume(
    params: ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarRemovevolume,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

