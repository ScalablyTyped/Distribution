package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes$Useruploaded")
@js.native
class ResourceVolumesUseruploaded protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.volumes.useruploaded.list
    * @desc Return a list of books uploaded by the current user.
    * @alias books.volumes.useruploaded.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.processingState The processing state of the user uploaded volumes to be returned.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {integer=} params.startIndex Index of the first result to return (starts at 0)
    * @param {string=} params.volumeId The ids of the volumes to be returned. If not specified all that match the processingState are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: ParamsResourceVolumesUseruploadedList): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesUseruploadedList, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(
    params: ParamsResourceVolumesUseruploadedList,
    options: BodyResponseCallback[SchemaVolumes],
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceVolumesUseruploadedList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceVolumesUseruploadedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
}

