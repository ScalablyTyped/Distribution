package typings.googleapis.buildSrcApisAbusiveexperiencereportV1Mod.abusiveexperiencereport_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Resource$Violatingsites")
@js.native
class Resource$Violatingsites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * abusiveexperiencereport.violatingSites.list
    * @desc Lists sites with Abusive Experience Report statuses of "Failing".
    * @alias abusiveexperiencereport.violatingSites.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ViolatingSitesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ViolatingSitesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarViolatingsitesDollarList): GaxiosPromise[Schema$ViolatingSitesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarViolatingsitesDollarList,
    callback: BodyResponseCallback[Schema$ViolatingSitesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarViolatingsitesDollarList,
    options: BodyResponseCallback[Schema$ViolatingSitesResponse],
    callback: BodyResponseCallback[Schema$ViolatingSitesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarViolatingsitesDollarList, options: MethodOptions): GaxiosPromise[Schema$ViolatingSitesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarViolatingsitesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ViolatingSitesResponse]
  ): Unit = js.native
}

