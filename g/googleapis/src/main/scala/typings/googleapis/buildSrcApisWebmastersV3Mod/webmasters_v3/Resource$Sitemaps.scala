package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Sitemaps")
@js.native
class Resource$Sitemaps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webmasters.sitemaps.delete
    * @desc Deletes a sitemap from this site.
    * @alias webmasters.sitemaps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.feedpath The URL of the actual sitemap. For example: http://www.example.com/sitemap.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitemapsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarSitemapsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSitemapsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSitemapsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarSitemapsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * webmasters.sitemaps.get
    * @desc Retrieves information about a specific sitemap.
    * @alias webmasters.sitemaps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.feedpath The URL of the actual sitemap. For example: http://www.example.com/sitemap.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$WmxSitemap] = js.native
  def get(callback: BodyResponseCallback[Schema$WmxSitemap]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitemapsDollarGet): GaxiosPromise[Schema$WmxSitemap] = js.native
  def get(
    params: ParamsDollarResourceDollarSitemapsDollarGet,
    callback: BodyResponseCallback[Schema$WmxSitemap]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSitemapsDollarGet,
    options: BodyResponseCallback[Schema$WmxSitemap],
    callback: BodyResponseCallback[Schema$WmxSitemap]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitemapsDollarGet, options: MethodOptions): GaxiosPromise[Schema$WmxSitemap] = js.native
  def get(
    params: ParamsDollarResourceDollarSitemapsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WmxSitemap]
  ): Unit = js.native
  /**
    * webmasters.sitemaps.list
    * @desc Lists the sitemaps-entries submitted for this site, or included in
    * the sitemap index file (if sitemapIndex is specified in the request).
    * @alias webmasters.sitemaps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.sitemapIndex A URL of a site's sitemap index. For example: http://www.example.com/sitemapindex.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SitemapsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SitemapsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitemapsDollarList): GaxiosPromise[Schema$SitemapsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitemapsDollarList,
    callback: BodyResponseCallback[Schema$SitemapsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSitemapsDollarList,
    options: BodyResponseCallback[Schema$SitemapsListResponse],
    callback: BodyResponseCallback[Schema$SitemapsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSitemapsDollarList, options: MethodOptions): GaxiosPromise[Schema$SitemapsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSitemapsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SitemapsListResponse]
  ): Unit = js.native
  /**
    * webmasters.sitemaps.submit
    * @desc Submits a sitemap for a site.
    * @alias webmasters.sitemaps.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.feedpath The URL of the sitemap to add. For example: http://www.example.com/sitemap.xml
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[Unit] = js.native
  def submit(callback: BodyResponseCallback[Unit]): Unit = js.native
  def submit(params: ParamsDollarResourceDollarSitemapsDollarSubmit): GaxiosPromise[Unit] = js.native
  def submit(params: ParamsDollarResourceDollarSitemapsDollarSubmit, callback: BodyResponseCallback[Unit]): Unit = js.native
  def submit(
    params: ParamsDollarResourceDollarSitemapsDollarSubmit,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def submit(params: ParamsDollarResourceDollarSitemapsDollarSubmit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def submit(
    params: ParamsDollarResourceDollarSitemapsDollarSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

