package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Bookshelves")
@js.native
class ResourceMylibraryBookshelves protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
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
  def addVolume(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume): GaxiosPromise[Unit] = js.native
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume, callback: BodyResponseCallback[Unit]): Unit = js.native
  def addVolume(
    params: ParamsResourceMylibraryBookshelvesAddvolume,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def addVolume(
    params: ParamsResourceMylibraryBookshelvesAddvolume,
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
  def clearVolumes(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clearVolumes(params: ParamsResourceMylibraryBookshelvesClearvolumes): GaxiosPromise[Unit] = js.native
  def clearVolumes(params: ParamsResourceMylibraryBookshelvesClearvolumes, callback: BodyResponseCallback[Unit]): Unit = js.native
  def clearVolumes(
    params: ParamsResourceMylibraryBookshelvesClearvolumes,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def clearVolumes(params: ParamsResourceMylibraryBookshelvesClearvolumes, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clearVolumes(
    params: ParamsResourceMylibraryBookshelvesClearvolumes,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def get(): GaxiosPromise[SchemaBookshelf] = js.native
  def get(callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceMylibraryBookshelvesGet): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceMylibraryBookshelvesGet, callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(
    params: ParamsResourceMylibraryBookshelvesGet,
    options: BodyResponseCallback[SchemaBookshelf],
    callback: BodyResponseCallback[SchemaBookshelf]
  ): Unit = js.native
  def get(params: ParamsResourceMylibraryBookshelvesGet, options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(
    params: ParamsResourceMylibraryBookshelvesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelf]
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
  def list(): GaxiosPromise[SchemaBookshelves] = js.native
  def list(callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceMylibraryBookshelvesList): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceMylibraryBookshelvesList, callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesList,
    options: BodyResponseCallback[SchemaBookshelves],
    callback: BodyResponseCallback[SchemaBookshelves]
  ): Unit = js.native
  def list(params: ParamsResourceMylibraryBookshelvesList, options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelves]
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
  def moveVolume(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume): GaxiosPromise[Unit] = js.native
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume, callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveVolume(
    params: ParamsResourceMylibraryBookshelvesMovevolume,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveVolume(
    params: ParamsResourceMylibraryBookshelvesMovevolume,
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
  def removeVolume(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def removeVolume(params: ParamsResourceMylibraryBookshelvesRemovevolume): GaxiosPromise[Unit] = js.native
  def removeVolume(params: ParamsResourceMylibraryBookshelvesRemovevolume, callback: BodyResponseCallback[Unit]): Unit = js.native
  def removeVolume(
    params: ParamsResourceMylibraryBookshelvesRemovevolume,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def removeVolume(params: ParamsResourceMylibraryBookshelvesRemovevolume, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def removeVolume(
    params: ParamsResourceMylibraryBookshelvesRemovevolume,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var volumes: ResourceMylibraryBookshelvesVolumes = js.native
}
