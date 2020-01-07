package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Bookshelves")
@js.native
class Resource$Bookshelves protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var volumes: ResourceDollarBookshelvesDollarVolumes = js.native
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
  def get(): GaxiosPromise[Schema$Bookshelf] = js.native
  def get(callback: BodyResponseCallback[Schema$Bookshelf]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBookshelvesDollarGet): GaxiosPromise[Schema$Bookshelf] = js.native
  def get(
    params: ParamsDollarResourceDollarBookshelvesDollarGet,
    callback: BodyResponseCallback[Schema$Bookshelf]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBookshelvesDollarGet,
    options: BodyResponseCallback[Schema$Bookshelf],
    callback: BodyResponseCallback[Schema$Bookshelf]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBookshelvesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Bookshelf] = js.native
  def get(
    params: ParamsDollarResourceDollarBookshelvesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bookshelf]
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
  def list(): GaxiosPromise[Schema$Bookshelves] = js.native
  def list(callback: BodyResponseCallback[Schema$Bookshelves]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBookshelvesDollarList): GaxiosPromise[Schema$Bookshelves] = js.native
  def list(
    params: ParamsDollarResourceDollarBookshelvesDollarList,
    callback: BodyResponseCallback[Schema$Bookshelves]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBookshelvesDollarList,
    options: BodyResponseCallback[Schema$Bookshelves],
    callback: BodyResponseCallback[Schema$Bookshelves]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBookshelvesDollarList, options: MethodOptions): GaxiosPromise[Schema$Bookshelves] = js.native
  def list(
    params: ParamsDollarResourceDollarBookshelvesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Bookshelves]
  ): Unit = js.native
}

