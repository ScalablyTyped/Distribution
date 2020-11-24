package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Bookshelves")
@js.native
class ResourceBookshelves protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * books.bookshelves.get
    * @desc Retrieves metadata for a specific bookshelf for the specified user.
    * @alias books.bookshelves.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.shelf ID of bookshelf to retrieve.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.userId ID of user for whom to retrieve bookshelves.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBookshelf] = js.native
  def get(callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceBookshelvesGet): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceBookshelvesGet, callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(
    params: ParamsResourceBookshelvesGet,
    options: BodyResponseCallback[SchemaBookshelf],
    callback: BodyResponseCallback[SchemaBookshelf]
  ): Unit = js.native
  def get(params: ParamsResourceBookshelvesGet, options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(
    params: ParamsResourceBookshelvesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelf]
  ): Unit = js.native
  
  /**
    * books.bookshelves.list
    * @desc Retrieves a list of public bookshelves for the specified user.
    * @alias books.bookshelves.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.userId ID of user for whom to retrieve bookshelves.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBookshelves] = js.native
  def list(callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceBookshelvesList): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceBookshelvesList, callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(
    params: ParamsResourceBookshelvesList,
    options: BodyResponseCallback[SchemaBookshelves],
    callback: BodyResponseCallback[SchemaBookshelves]
  ): Unit = js.native
  def list(params: ParamsResourceBookshelvesList, options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(
    params: ParamsResourceBookshelvesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelves]
  ): Unit = js.native
  
  var volumes: ResourceBookshelvesVolumes = js.native
}
