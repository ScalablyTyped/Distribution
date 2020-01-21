package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexperiencereport/v1", "adexperiencereport_v1.Resource$Sites")
@js.native
class ResourceSites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexperiencereport.sites.get
    * @desc Gets a summary of the ad experience rating of a site.
    * @alias adexperiencereport.sites.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The required site name. It should be the site property whose ad experiences may have been reviewed, and it should be URL-encoded. For example, sites/https%3A%2F%2Fwww.google.com. The server will return an error of BAD_REQUEST if this field is not filled in. Note that if the site property is not yet verified in Search Console, the reportUrl field returned by the API will lead to the verification page, prompting the user to go through that process before they can gain access to the Ad Experience Report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaSiteSummaryResponse]): Unit = js.native
  def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
  def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaSiteSummaryResponse]): Unit = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: BodyResponseCallback[SchemaSiteSummaryResponse],
    callback: BodyResponseCallback[SchemaSiteSummaryResponse]
  ): Unit = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaSiteSummaryResponse] = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteSummaryResponse]
  ): Unit = js.native
}

