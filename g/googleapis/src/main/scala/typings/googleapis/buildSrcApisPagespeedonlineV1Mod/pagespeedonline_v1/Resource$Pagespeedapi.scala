package typings.googleapis.buildSrcApisPagespeedonlineV1Mod.pagespeedonline_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pagespeedonline/v1", "pagespeedonline_v1.Resource$Pagespeedapi")
@js.native
class Resource$Pagespeedapi protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pagespeedonline.pagespeedapi.runpagespeed
    * @desc Runs PageSpeed analysis on the page at the specified URL, and
    * returns a PageSpeed score, a list of suggestions to make that page
    * faster, and other information.
    * @alias pagespeedonline.pagespeedapi.runpagespeed
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.filter_third_party_resources Indicates if third party resources should be filtered out before PageSpeed analysis.
    * @param {string=} params.locale The locale used to localize formatted results
    * @param {string=} params.rule A PageSpeed rule to run; if none are given, all rules are run
    * @param {boolean=} params.screenshot Indicates if binary data containing a screenshot should be included
    * @param {string=} params.strategy The analysis strategy to use
    * @param {string} params.url The URL to fetch and analyze
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runpagespeed(): GaxiosPromise[Schema$Result] = js.native
  def runpagespeed(callback: BodyResponseCallback[Schema$Result]): Unit = js.native
  def runpagespeed(params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed): GaxiosPromise[Schema$Result] = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    callback: BodyResponseCallback[Schema$Result]
  ): Unit = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    options: BodyResponseCallback[Schema$Result],
    callback: BodyResponseCallback[Schema$Result]
  ): Unit = js.native
  def runpagespeed(params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed, options: MethodOptions): GaxiosPromise[Schema$Result] = js.native
  def runpagespeed(
    params: ParamsDollarResourceDollarPagespeedapiDollarRunpagespeed,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Result]
  ): Unit = js.native
}

