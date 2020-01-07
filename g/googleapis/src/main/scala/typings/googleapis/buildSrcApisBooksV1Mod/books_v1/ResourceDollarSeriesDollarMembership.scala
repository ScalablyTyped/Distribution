package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Series$Membership")
@js.native
class ResourceDollarSeriesDollarMembership protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.series.membership.get
    * @desc Returns Series membership data given the series id.
    * @alias books.series.membership.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.page_size Number of maximum results per page to be included in the response.
    * @param {string=} params.page_token The value of the nextToken from the previous page.
    * @param {string} params.series_id String that identifies the series
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Seriesmembership] = js.native
  def get(callback: BodyResponseCallback[Schema$Seriesmembership]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSeriesDollarMembershipDollarGet): GaxiosPromise[Schema$Seriesmembership] = js.native
  def get(
    params: ParamsDollarResourceDollarSeriesDollarMembershipDollarGet,
    callback: BodyResponseCallback[Schema$Seriesmembership]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSeriesDollarMembershipDollarGet,
    options: BodyResponseCallback[Schema$Seriesmembership],
    callback: BodyResponseCallback[Schema$Seriesmembership]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSeriesDollarMembershipDollarGet, options: MethodOptions): GaxiosPromise[Schema$Seriesmembership] = js.native
  def get(
    params: ParamsDollarResourceDollarSeriesDollarMembershipDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Seriesmembership]
  ): Unit = js.native
}

