package typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pagespeedonline/v5", "pagespeedonline_v5.Resource$Pagespeedapi")
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
    * @param {string=} params.category A Lighthouse category to run; if none are given, only Performance category will be run
    * @param {string=} params.locale The locale used to localize formatted results
    * @param {string=} params.strategy The analysis strategy (desktop or mobile) to use, and desktop is the default
    * @param {string} params.url The URL to fetch and analyze
    * @param {string=} params.utm_campaign Campaign name for analytics.
    * @param {string=} params.utm_source Campaign source for analytics.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runpagespeed(): GaxiosPromise[Schema$PagespeedApiPagespeedResponseV5] = js.native
  def runpagespeed(callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV5]): Unit = js.native
  def runpagespeed(params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed): GaxiosPromise[Schema$PagespeedApiPagespeedResponseV5] = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV5]
  ): Unit = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    options: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV5],
    callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV5]
  ): Unit = js.native
  def runpagespeed(params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed, options: MethodOptions): GaxiosPromise[Schema$PagespeedApiPagespeedResponseV5] = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PagespeedApiPagespeedResponseV5]
  ): Unit = js.native
}

