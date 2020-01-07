package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
@js.native
class ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurls protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.crawledUrls.list
    * @desc List CrawledUrls under a given ScanRun.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.crawledUrls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of CrawledUrls to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCrawledUrlsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCrawledUrlsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurlsDollarList
  ): GaxiosPromise[Schema$ListCrawledUrlsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurlsDollarList,
    callback: BodyResponseCallback[Schema$ListCrawledUrlsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurlsDollarList,
    options: BodyResponseCallback[Schema$ListCrawledUrlsResponse],
    callback: BodyResponseCallback[Schema$ListCrawledUrlsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurlsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListCrawledUrlsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurlsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCrawledUrlsResponse]
  ): Unit = js.native
}

