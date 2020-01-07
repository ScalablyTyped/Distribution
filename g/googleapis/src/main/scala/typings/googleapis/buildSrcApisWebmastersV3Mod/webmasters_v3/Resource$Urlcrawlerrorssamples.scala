package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Urlcrawlerrorssamples")
@js.native
class Resource$Urlcrawlerrorssamples protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webmasters.urlcrawlerrorssamples.get
    * @desc Retrieves details about crawl errors for a site's sample URL.
    * @alias webmasters.urlcrawlerrorssamples.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.category The crawl error category. For example: authPermissions
    * @param {string} params.platform The user agent type (platform) that made the request. For example: web
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {string} params.url The relative path (without the site) of the sample URL. It must be one of the URLs returned by list(). For example, for the URL https://www.example.com/pagename on the site https://www.example.com/, the url value is pagename
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UrlCrawlErrorsSample] = js.native
  def get(callback: BodyResponseCallback[Schema$UrlCrawlErrorsSample]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarGet): GaxiosPromise[Schema$UrlCrawlErrorsSample] = js.native
  def get(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarGet,
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsSample]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarGet,
    options: BodyResponseCallback[Schema$UrlCrawlErrorsSample],
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsSample]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarGet, options: MethodOptions): GaxiosPromise[Schema$UrlCrawlErrorsSample] = js.native
  def get(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsSample]
  ): Unit = js.native
  /**
    * webmasters.urlcrawlerrorssamples.list
    * @desc Lists a site's sample URLs for the specified crawl error category
    * and platform.
    * @alias webmasters.urlcrawlerrorssamples.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.category The crawl error category. For example: authPermissions
    * @param {string} params.platform The user agent type (platform) that made the request. For example: web
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UrlCrawlErrorsSamplesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$UrlCrawlErrorsSamplesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarList): GaxiosPromise[Schema$UrlCrawlErrorsSamplesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarList,
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsSamplesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarList,
    options: BodyResponseCallback[Schema$UrlCrawlErrorsSamplesListResponse],
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsSamplesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarList, options: MethodOptions): GaxiosPromise[Schema$UrlCrawlErrorsSamplesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlCrawlErrorsSamplesListResponse]
  ): Unit = js.native
  /**
    * webmasters.urlcrawlerrorssamples.markAsFixed
    * @desc Marks the provided site's sample URL as fixed, and removes it from
    * the samples list.
    * @alias webmasters.urlcrawlerrorssamples.markAsFixed
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.category The crawl error category. For example: authPermissions
    * @param {string} params.platform The user agent type (platform) that made the request. For example: web
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {string} params.url The relative path (without the site) of the sample URL. It must be one of the URLs returned by list(). For example, for the URL https://www.example.com/pagename on the site https://www.example.com/, the url value is pagename
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def markAsFixed(): GaxiosPromise[Unit] = js.native
  def markAsFixed(callback: BodyResponseCallback[Unit]): Unit = js.native
  def markAsFixed(params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarMarkasfixed): GaxiosPromise[Unit] = js.native
  def markAsFixed(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarMarkasfixed,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def markAsFixed(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarMarkasfixed,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def markAsFixed(params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarMarkasfixed, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def markAsFixed(
    params: ParamsDollarResourceDollarUrlcrawlerrorssamplesDollarMarkasfixed,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

