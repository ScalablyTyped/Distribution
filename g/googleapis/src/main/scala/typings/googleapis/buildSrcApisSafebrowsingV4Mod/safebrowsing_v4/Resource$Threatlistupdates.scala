package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatlistupdates")
@js.native
class Resource$Threatlistupdates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.threatListUpdates.fetch
    * @desc Fetches the most recent threat list updates. A client can request
    * updates for multiple lists at once.
    * @alias safebrowsing.threatListUpdates.fetch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FetchThreatListUpdatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def fetch(): GaxiosPromise[Schema$FetchThreatListUpdatesResponse] = js.native
  def fetch(callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]): Unit = js.native
  def fetch(params: ParamsDollarResourceDollarThreatlistupdatesDollarFetch): GaxiosPromise[Schema$FetchThreatListUpdatesResponse] = js.native
  def fetch(
    params: ParamsDollarResourceDollarThreatlistupdatesDollarFetch,
    callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def fetch(
    params: ParamsDollarResourceDollarThreatlistupdatesDollarFetch,
    options: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse],
    callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def fetch(params: ParamsDollarResourceDollarThreatlistupdatesDollarFetch, options: MethodOptions): GaxiosPromise[Schema$FetchThreatListUpdatesResponse] = js.native
  def fetch(
    params: ParamsDollarResourceDollarThreatlistupdatesDollarFetch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]
  ): Unit = js.native
}

