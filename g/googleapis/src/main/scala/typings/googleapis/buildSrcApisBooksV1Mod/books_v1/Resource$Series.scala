package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Series")
@js.native
class Resource$Series protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var membership: ResourceDollarSeriesDollarMembership = js.native
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
  def get(): GaxiosPromise[Schema$Series] = js.native
  def get(callback: BodyResponseCallback[Schema$Series]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSeriesDollarGet): GaxiosPromise[Schema$Series] = js.native
  def get(params: ParamsDollarResourceDollarSeriesDollarGet, callback: BodyResponseCallback[Schema$Series]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSeriesDollarGet,
    options: BodyResponseCallback[Schema$Series],
    callback: BodyResponseCallback[Schema$Series]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSeriesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Series] = js.native
  def get(
    params: ParamsDollarResourceDollarSeriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Series]
  ): Unit = js.native
}

