package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatlists")
@js.native
class Resource$Threatlists protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.threatLists.list
    * @desc Lists the Safe Browsing threat lists available for download.
    * @alias safebrowsing.threatLists.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListThreatListsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListThreatListsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarThreatlistsDollarList): GaxiosPromise[Schema$ListThreatListsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarThreatlistsDollarList,
    callback: BodyResponseCallback[Schema$ListThreatListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarThreatlistsDollarList,
    options: BodyResponseCallback[Schema$ListThreatListsResponse],
    callback: BodyResponseCallback[Schema$ListThreatListsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarThreatlistsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListThreatListsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarThreatlistsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListThreatListsResponse]
  ): Unit = js.native
}

