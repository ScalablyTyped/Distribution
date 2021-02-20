package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Series")
@js.native
class ResourceSeries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * books.series.get
    * @desc Returns Series metadata for the given series ids.
    * @alias books.series.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.series_id String that identifies the series
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSeries] = js.native
  def get(callback: BodyResponseCallback[SchemaSeries]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSeries] = js.native
  def get(params: ParamsResourceSeriesGet): GaxiosPromise[SchemaSeries] = js.native
  def get(params: ParamsResourceSeriesGet, callback: BodyResponseCallback[SchemaSeries]): Unit = js.native
  def get(
    params: ParamsResourceSeriesGet,
    options: BodyResponseCallback[SchemaSeries],
    callback: BodyResponseCallback[SchemaSeries]
  ): Unit = js.native
  def get(params: ParamsResourceSeriesGet, options: MethodOptions): GaxiosPromise[SchemaSeries] = js.native
  def get(
    params: ParamsResourceSeriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSeries]
  ): Unit = js.native
  
  var membership: ResourceSeriesMembership = js.native
}
