package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Urlcrawlerrorscounts")
@js.native
class Resource$Urlcrawlerrorscounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webmasters.urlcrawlerrorscounts.query
    * @desc Retrieves a time series of the number of URL crawl errors per error
    * category and platform.
    * @alias webmasters.urlcrawlerrorscounts.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.category The crawl error category. For example: serverError. If not specified, returns results for all categories.
    * @param {boolean=} params.latestCountsOnly If true, returns only the latest crawl error counts.
    * @param {string=} params.platform The user agent type (platform) that made the request. For example: web. If not specified, returns results for all platforms.
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[Schema$UrlCrawlErrorsCountsQueryResponse] = js.native
  def query(callback: BodyResponseCallback[Schema$UrlCrawlErrorsCountsQueryResponse]): Unit = js.native
  def query(params: ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery): GaxiosPromise[Schema$UrlCrawlErrorsCountsQueryResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery,
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsCountsQueryResponse]
  ): Unit = js.native
  def query(
    params: ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery,
    options: BodyResponseCallback[Schema$UrlCrawlErrorsCountsQueryResponse],
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsCountsQueryResponse]
  ): Unit = js.native
  def query(params: ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery, options: MethodOptions): GaxiosPromise[Schema$UrlCrawlErrorsCountsQueryResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarUrlcrawlerrorscountsDollarQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsCountsQueryResponse]
  ): Unit = js.native
}

