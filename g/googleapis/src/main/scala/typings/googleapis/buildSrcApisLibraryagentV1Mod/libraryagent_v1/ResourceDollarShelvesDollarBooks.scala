package typings.googleapis.buildSrcApisLibraryagentV1Mod.libraryagent_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves$Books")
@js.native
class ResourceDollarShelvesDollarBooks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * libraryagent.shelves.books.borrow
    * @desc Borrow a book from the library. Returns the book if it is borrowed
    * successfully. Returns NOT_FOUND if the book does not exist in the
    * library. Returns quota exceeded error if the amount of books borrowed
    * exceeds allocation quota in any dimensions.
    * @alias libraryagent.shelves.books.borrow
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the book to borrow.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def borrow(): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def borrow(callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]): Unit = js.native
  def borrow(params: ParamsDollarResourceDollarShelvesDollarBooksDollarBorrow): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def borrow(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarBorrow,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def borrow(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarBorrow,
    options: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book],
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def borrow(params: ParamsDollarResourceDollarShelvesDollarBooksDollarBorrow, options: MethodOptions): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def borrow(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarBorrow,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  /**
    * libraryagent.shelves.books.get
    * @desc Gets a book. Returns NOT_FOUND if the book does not exist.
    * @alias libraryagent.shelves.books.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the book to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]): Unit = js.native
  def get(params: ParamsDollarResourceDollarShelvesDollarBooksDollarGet): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def get(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarGet,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarGet,
    options: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book],
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarShelvesDollarBooksDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def get(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  /**
    * libraryagent.shelves.books.list
    * @desc Lists books in a shelf. The order is unspecified but deterministic.
    * Newly created books will not necessarily be added to the end of this
    * list. Returns NOT_FOUND if the shelf does not exist.
    * @alias libraryagent.shelves.books.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. Server may return fewer books than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListBooksResponse.next_page_token. returned from the previous call to `ListBooks` method.
    * @param {string} params.parent The name of the shelf whose books we'd like to list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListBooksResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarShelvesDollarBooksDollarList): GaxiosPromise[Schema$GoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarList,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListBooksResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarList,
    options: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListBooksResponse],
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListBooksResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarShelvesDollarBooksDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListBooksResponse]
  ): Unit = js.native
  /**
    * libraryagent.shelves.books.return
    * @desc Return a book to the library. Returns the book if it is returned to
    * the library successfully. Returns error if the book does not belong to
    * the library or the users didn't borrow before.
    * @alias libraryagent.shelves.books.return
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the book to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `return`(): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def `return`(callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]): Unit = js.native
  def `return`(params: ParamsDollarResourceDollarShelvesDollarBooksDollarReturn): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def `return`(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarReturn,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def `return`(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarReturn,
    options: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book],
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def `return`(params: ParamsDollarResourceDollarShelvesDollarBooksDollarReturn, options: MethodOptions): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Book] = js.native
  def `return`(
    params: ParamsDollarResourceDollarShelvesDollarBooksDollarReturn,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Book]
  ): Unit = js.native
}

