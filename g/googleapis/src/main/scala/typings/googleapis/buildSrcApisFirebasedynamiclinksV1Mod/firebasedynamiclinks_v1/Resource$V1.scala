package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$V1")
@js.native
class Resource$V1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasedynamiclinks.getLinkStats
    * @desc Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs, app
    * first opens, and app reopens.
    * @alias firebasedynamiclinks.getLinkStats
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.durationDays The span of time requested in days.
    * @param {string} params.dynamicLink Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    * @param {string=} params.sdkVersion Google SDK version. Version takes the form "$major.$minor.$patch"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getLinkStats(): GaxiosPromise[Schema$DynamicLinkStats] = js.native
  def getLinkStats(callback: BodyResponseCallback[Schema$DynamicLinkStats]): Unit = js.native
  def getLinkStats(params: ParamsDollarResourceDollarV1DollarGetlinkstats): GaxiosPromise[Schema$DynamicLinkStats] = js.native
  def getLinkStats(
    params: ParamsDollarResourceDollarV1DollarGetlinkstats,
    callback: BodyResponseCallback[Schema$DynamicLinkStats]
  ): Unit = js.native
  def getLinkStats(
    params: ParamsDollarResourceDollarV1DollarGetlinkstats,
    options: BodyResponseCallback[Schema$DynamicLinkStats],
    callback: BodyResponseCallback[Schema$DynamicLinkStats]
  ): Unit = js.native
  def getLinkStats(params: ParamsDollarResourceDollarV1DollarGetlinkstats, options: MethodOptions): GaxiosPromise[Schema$DynamicLinkStats] = js.native
  def getLinkStats(
    params: ParamsDollarResourceDollarV1DollarGetlinkstats,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DynamicLinkStats]
  ): Unit = js.native
  /**
    * firebasedynamiclinks.installAttribution
    * @desc Get iOS strong/weak-match info for post-install attribution.
    * @alias firebasedynamiclinks.installAttribution
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetIosPostInstallAttributionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def installAttribution(): GaxiosPromise[Schema$GetIosPostInstallAttributionResponse] = js.native
  def installAttribution(callback: BodyResponseCallback[Schema$GetIosPostInstallAttributionResponse]): Unit = js.native
  def installAttribution(params: ParamsDollarResourceDollarV1DollarInstallattribution): GaxiosPromise[Schema$GetIosPostInstallAttributionResponse] = js.native
  def installAttribution(
    params: ParamsDollarResourceDollarV1DollarInstallattribution,
    callback: BodyResponseCallback[Schema$GetIosPostInstallAttributionResponse]
  ): Unit = js.native
  def installAttribution(
    params: ParamsDollarResourceDollarV1DollarInstallattribution,
    options: BodyResponseCallback[Schema$GetIosPostInstallAttributionResponse],
    callback: BodyResponseCallback[Schema$GetIosPostInstallAttributionResponse]
  ): Unit = js.native
  def installAttribution(params: ParamsDollarResourceDollarV1DollarInstallattribution, options: MethodOptions): GaxiosPromise[Schema$GetIosPostInstallAttributionResponse] = js.native
  def installAttribution(
    params: ParamsDollarResourceDollarV1DollarInstallattribution,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetIosPostInstallAttributionResponse]
  ): Unit = js.native
  /**
    * firebasedynamiclinks.reopenAttribution
    * @desc Get iOS reopen attribution for app universal link open deeplinking.
    * @alias firebasedynamiclinks.reopenAttribution
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetIosReopenAttributionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reopenAttribution(): GaxiosPromise[Schema$GetIosReopenAttributionResponse] = js.native
  def reopenAttribution(callback: BodyResponseCallback[Schema$GetIosReopenAttributionResponse]): Unit = js.native
  def reopenAttribution(params: ParamsDollarResourceDollarV1DollarReopenattribution): GaxiosPromise[Schema$GetIosReopenAttributionResponse] = js.native
  def reopenAttribution(
    params: ParamsDollarResourceDollarV1DollarReopenattribution,
    callback: BodyResponseCallback[Schema$GetIosReopenAttributionResponse]
  ): Unit = js.native
  def reopenAttribution(
    params: ParamsDollarResourceDollarV1DollarReopenattribution,
    options: BodyResponseCallback[Schema$GetIosReopenAttributionResponse],
    callback: BodyResponseCallback[Schema$GetIosReopenAttributionResponse]
  ): Unit = js.native
  def reopenAttribution(params: ParamsDollarResourceDollarV1DollarReopenattribution, options: MethodOptions): GaxiosPromise[Schema$GetIosReopenAttributionResponse] = js.native
  def reopenAttribution(
    params: ParamsDollarResourceDollarV1DollarReopenattribution,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetIosReopenAttributionResponse]
  ): Unit = js.native
}

