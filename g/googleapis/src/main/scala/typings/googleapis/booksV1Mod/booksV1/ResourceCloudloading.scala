package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Cloudloading")
@js.native
class ResourceCloudloading protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
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
  def addBook(): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(callback: BodyResponseCallback[SchemaBooksCloudloadingResource]): Unit = js.native
  def addBook(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(params: ParamsResourceCloudloadingAddbook): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    options: BodyResponseCallback[SchemaBooksCloudloadingResource],
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def addBook(params: ParamsResourceCloudloadingAddbook, options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
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
  def deleteBook(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteBook(params: ParamsResourceCloudloadingDeletebook): GaxiosPromise[Unit] = js.native
  def deleteBook(params: ParamsResourceCloudloadingDeletebook, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteBook(
    params: ParamsResourceCloudloadingDeletebook,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deleteBook(params: ParamsResourceCloudloadingDeletebook, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteBook(
    params: ParamsResourceCloudloadingDeletebook,
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
  def updateBook(): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(callback: BodyResponseCallback[SchemaBooksCloudloadingResource]): Unit = js.native
  def updateBook(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(params: ParamsResourceCloudloadingUpdatebook): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    options: BodyResponseCallback[SchemaBooksCloudloadingResource],
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def updateBook(params: ParamsResourceCloudloadingUpdatebook, options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
}
