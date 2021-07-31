package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes$Mybooks")
@js.native
class ResourceVolumesMybooks protected () extends StObject {
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
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesMybooksList): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesMybooksList, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(
    params: ParamsResourceVolumesMybooksList,
    options: BodyResponseCallback[SchemaVolumes],
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceVolumesMybooksList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceVolumesMybooksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
}
