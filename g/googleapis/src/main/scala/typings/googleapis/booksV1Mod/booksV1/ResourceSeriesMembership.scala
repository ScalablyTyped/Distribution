package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Series$Membership")
@js.native
class ResourceSeriesMembership protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(callback: BodyResponseCallback[SchemaSeriesmembership]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(params: ParamsResourceSeriesMembershipGet): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(params: ParamsResourceSeriesMembershipGet, callback: BodyResponseCallback[SchemaSeriesmembership]): Unit = js.native
  def get(
    params: ParamsResourceSeriesMembershipGet,
    options: BodyResponseCallback[SchemaSeriesmembership],
    callback: BodyResponseCallback[SchemaSeriesmembership]
  ): Unit = js.native
  def get(params: ParamsResourceSeriesMembershipGet, options: MethodOptions): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(
    params: ParamsResourceSeriesMembershipGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSeriesmembership]
  ): Unit = js.native
}
