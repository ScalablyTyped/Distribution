package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes$Mybooks")
@js.native
class ResourceDollarVolumesDollarMybooks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.volumes.mybooks.list
    * @desc Return a list of books in My Library.
    * @alias books.volumes.mybooks.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.acquireMethod How the book was acquired
    * @param {string=} params.country ISO-3166-1 code to override the IP-based location.
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex:'en_US'. Used for generating recommendations.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.processingState The processing state of the user uploaded volumes to be returned. Applicable only if the UPLOADED is specified in the acquireMethod.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {integer=} params.startIndex Index of the first result to return (starts at 0)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Volumes] = js.native
  def list(callback: BodyResponseCallback[Schema$Volumes]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVolumesDollarMybooksDollarList): GaxiosPromise[Schema$Volumes] = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarMybooksDollarList,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarMybooksDollarList,
    options: BodyResponseCallback[Schema$Volumes],
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVolumesDollarMybooksDollarList, options: MethodOptions): GaxiosPromise[Schema$Volumes] = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarMybooksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
}

