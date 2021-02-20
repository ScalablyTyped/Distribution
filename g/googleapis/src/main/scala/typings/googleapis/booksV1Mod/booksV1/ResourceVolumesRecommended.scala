package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes$Recommended")
@js.native
class ResourceVolumesRecommended protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * books.volumes.recommended.list
    * @desc Return a list of recommended books for the current user.
    * @alias books.volumes.recommended.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    * @param {string=} params.maxAllowedMaturityRating The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesRecommendedList): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesRecommendedList, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(
    params: ParamsResourceVolumesRecommendedList,
    options: BodyResponseCallback[SchemaVolumes],
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceVolumesRecommendedList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceVolumesRecommendedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  
  /**
    * books.volumes.recommended.rate
    * @desc Rate a recommended book for the current user.
    * @alias books.volumes.recommended.rate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    * @param {string} params.rating Rating to be given to the volume.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId ID of the source volume.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rate(): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]): Unit = js.native
  def rate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(params: ParamsResourceVolumesRecommendedRate): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]
  ): Unit = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    options: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse],
    callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]
  ): Unit = js.native
  def rate(params: ParamsResourceVolumesRecommendedRate, options: MethodOptions): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]
  ): Unit = js.native
}
