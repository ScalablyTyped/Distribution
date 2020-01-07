package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Cloudloading")
@js.native
class Resource$Cloudloading protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.cloudloading.addBook
    * @alias books.cloudloading.addBook
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.drive_document_id A drive document id. The upload_client_token must not be set.
    * @param {string=} params.mime_type The document MIME type. It can be set only if the drive_document_id is set.
    * @param {string=} params.name The document name. It can be set only if the drive_document_id is set.
    * @param {string=} params.upload_client_token
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addBook(): GaxiosPromise[Schema$BooksCloudloadingResource] = js.native
  def addBook(callback: BodyResponseCallback[Schema$BooksCloudloadingResource]): Unit = js.native
  def addBook(params: ParamsDollarResourceDollarCloudloadingDollarAddbook): GaxiosPromise[Schema$BooksCloudloadingResource] = js.native
  def addBook(
    params: ParamsDollarResourceDollarCloudloadingDollarAddbook,
    callback: BodyResponseCallback[Schema$BooksCloudloadingResource]
  ): Unit = js.native
  def addBook(
    params: ParamsDollarResourceDollarCloudloadingDollarAddbook,
    options: BodyResponseCallback[Schema$BooksCloudloadingResource],
    callback: BodyResponseCallback[Schema$BooksCloudloadingResource]
  ): Unit = js.native
  def addBook(params: ParamsDollarResourceDollarCloudloadingDollarAddbook, options: MethodOptions): GaxiosPromise[Schema$BooksCloudloadingResource] = js.native
  def addBook(
    params: ParamsDollarResourceDollarCloudloadingDollarAddbook,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BooksCloudloadingResource]
  ): Unit = js.native
  /**
    * books.cloudloading.deleteBook
    * @desc Remove the book and its contents
    * @alias books.cloudloading.deleteBook
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.volumeId The id of the book to be removed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteBook(): GaxiosPromise[Unit] = js.native
  def deleteBook(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteBook(params: ParamsDollarResourceDollarCloudloadingDollarDeletebook): GaxiosPromise[Unit] = js.native
  def deleteBook(
    params: ParamsDollarResourceDollarCloudloadingDollarDeletebook,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteBook(
    params: ParamsDollarResourceDollarCloudloadingDollarDeletebook,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteBook(params: ParamsDollarResourceDollarCloudloadingDollarDeletebook, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteBook(
    params: ParamsDollarResourceDollarCloudloadingDollarDeletebook,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * books.cloudloading.updateBook
    * @alias books.cloudloading.updateBook
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BooksCloudloadingResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateBook(): GaxiosPromise[Schema$BooksCloudloadingResource] = js.native
  def updateBook(callback: BodyResponseCallback[Schema$BooksCloudloadingResource]): Unit = js.native
  def updateBook(params: ParamsDollarResourceDollarCloudloadingDollarUpdatebook): GaxiosPromise[Schema$BooksCloudloadingResource] = js.native
  def updateBook(
    params: ParamsDollarResourceDollarCloudloadingDollarUpdatebook,
    callback: BodyResponseCallback[Schema$BooksCloudloadingResource]
  ): Unit = js.native
  def updateBook(
    params: ParamsDollarResourceDollarCloudloadingDollarUpdatebook,
    options: BodyResponseCallback[Schema$BooksCloudloadingResource],
    callback: BodyResponseCallback[Schema$BooksCloudloadingResource]
  ): Unit = js.native
  def updateBook(params: ParamsDollarResourceDollarCloudloadingDollarUpdatebook, options: MethodOptions): GaxiosPromise[Schema$BooksCloudloadingResource] = js.native
  def updateBook(
    params: ParamsDollarResourceDollarCloudloadingDollarUpdatebook,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BooksCloudloadingResource]
  ): Unit = js.native
}

