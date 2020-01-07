package typings.googleapis.buildSrcApisLibraryagentV1Mod.libraryagent_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves")
@js.native
class Resource$Shelves protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var books: ResourceDollarShelvesDollarBooks = js.native
  var context: APIRequestContext = js.native
  /**
    * libraryagent.shelves.get
    * @desc Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
    * @alias libraryagent.shelves.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the shelf to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Shelf] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Shelf]): Unit = js.native
  def get(params: ParamsDollarResourceDollarShelvesDollarGet): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Shelf] = js.native
  def get(
    params: ParamsDollarResourceDollarShelvesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Shelf]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarShelvesDollarGet,
    options: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Shelf],
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Shelf]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarShelvesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleExampleLibraryagentV1Shelf] = js.native
  def get(
    params: ParamsDollarResourceDollarShelvesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1Shelf]
  ): Unit = js.native
  /**
    * libraryagent.shelves.list
    * @desc Lists shelves. The order is unspecified but deterministic. Newly
    * created shelves will not necessarily be added to the end of this list.
    * @alias libraryagent.shelves.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. Server may return fewer shelves than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListShelvesResponse.next_page_token returned from the previous call to `ListShelves` method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListShelvesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarShelvesDollarList): GaxiosPromise[Schema$GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarShelvesDollarList,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListShelvesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarShelvesDollarList,
    options: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListShelvesResponse],
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListShelvesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarShelvesDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarShelvesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleExampleLibraryagentV1ListShelvesResponse]
  ): Unit = js.native
}

