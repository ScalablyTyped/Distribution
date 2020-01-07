package typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pagespeedonline/v4", "pagespeedonline_v4.Resource$Pagespeedapi")
@js.native
class Resource$Pagespeedapi protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pagespeedonline.pagespeedapi.runpagespeed
    * @desc Runs PageSpeed analysis on the page at the specified URL, and
    * returns PageSpeed scores, a list of suggestions to make that page faster,
    * and other information.
    * @alias pagespeedonline.pagespeedapi.runpagespeed
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.filter_third_party_resources Indicates if third party resources should be filtered out before PageSpeed analysis.
    * @param {string=} params.locale The locale used to localize formatted results
    * @param {string=} params.rule A PageSpeed rule to run; if none are given, all rules are run
    * @param {boolean=} params.screenshot Indicates if binary data containing a screenshot should be included
    * @param {boolean=} params.snapshots Indicates if binary data containing snapshot images should be included
    * @param {string=} params.strategy The analysis strategy (desktop or mobile) to use, and desktop is the default
    * @param {string} params.url The URL to fetch and analyze
    * @param {string=} params.utm_campaign Campaign name for analytics.
    * @param {string=} params.utm_source Campaign source for analytics.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runpagespeed(): GaxiosPromise[Schema$PagespeedApiPagespeedResponseV4] = js.native
  def runpagespeed(callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV4]): Unit = js.native
  def runpagespeed(params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed): GaxiosPromise[Schema$PagespeedApiPagespeedResponseV4] = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV4]
  ): Unit = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    options: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV4],
    callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV4]
  ): Unit = js.native
  def runpagespeed(params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed, options: MethodOptions): GaxiosPromise[Schema$PagespeedApiPagespeedResponseV4] = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV4]
  ): Unit = js.native
}

