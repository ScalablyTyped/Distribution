package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Dictionary")
@js.native
class ResourceDictionary protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.dictionary.listOfflineMetadata
    * @desc Returns a list of offline dictionary metadata available
    * @alias books.dictionary.listOfflineMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.cpksver The device/version ID from which to request the data.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listOfflineMetadata(): GaxiosPromise[SchemaMetadata] = js.native
  def listOfflineMetadata(callback: BodyResponseCallback[SchemaMetadata]): Unit = js.native
  def listOfflineMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMetadata] = js.native
  def listOfflineMetadata(params: ParamsResourceDictionaryListofflinemetadata): GaxiosPromise[SchemaMetadata] = js.native
  def listOfflineMetadata(
    params: ParamsResourceDictionaryListofflinemetadata,
    callback: BodyResponseCallback[SchemaMetadata]
  ): Unit = js.native
  def listOfflineMetadata(
    params: ParamsResourceDictionaryListofflinemetadata,
    options: BodyResponseCallback[SchemaMetadata],
    callback: BodyResponseCallback[SchemaMetadata]
  ): Unit = js.native
  def listOfflineMetadata(params: ParamsResourceDictionaryListofflinemetadata, options: MethodOptions): GaxiosPromise[SchemaMetadata] = js.native
  def listOfflineMetadata(
    params: ParamsResourceDictionaryListofflinemetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetadata]
  ): Unit = js.native
}

