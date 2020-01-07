package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes$Associated")
@js.native
class ResourceDollarVolumesDollarAssociated protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.volumes.associated.list
    * @desc Return a list of associated books.
    * @alias books.volumes.associated.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.association Association type.
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    * @param {string=} params.maxAllowedMaturityRating The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId ID of the source volume.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Volumes] = js.native
  def list(callback: BodyResponseCallback[Schema$Volumes]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVolumesDollarAssociatedDollarList): GaxiosPromise[Schema$Volumes] = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarAssociatedDollarList,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarAssociatedDollarList,
    options: BodyResponseCallback[Schema$Volumes],
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVolumesDollarAssociatedDollarList, options: MethodOptions): GaxiosPromise[Schema$Volumes] = js.native
  def list(
    params: ParamsDollarResourceDollarVolumesDollarAssociatedDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
}

