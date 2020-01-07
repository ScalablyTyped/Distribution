package typings.googleapis.buildSrcApisAcceleratedmobilepageurlV1Mod.acceleratedmobilepageurl_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/acceleratedmobilepageurl/v1", "acceleratedmobilepageurl_v1.Resource$Ampurls")
@js.native
class Resource$Ampurls protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * acceleratedmobilepageurl.ampUrls.batchGet
    * @desc Returns AMP URL(s) and equivalent [AMP Cache
    * URL(s)](/amp/cache/overview#amp-cache-url-format).
    * @alias acceleratedmobilepageurl.ampUrls.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BatchGetAmpUrlsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[Schema$BatchGetAmpUrlsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[Schema$BatchGetAmpUrlsResponse]): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarAmpurlsDollarBatchget): GaxiosPromise[Schema$BatchGetAmpUrlsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarAmpurlsDollarBatchget,
    callback: BodyResponseCallback[Schema$BatchGetAmpUrlsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarAmpurlsDollarBatchget,
    options: BodyResponseCallback[Schema$BatchGetAmpUrlsResponse],
    callback: BodyResponseCallback[Schema$BatchGetAmpUrlsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarAmpurlsDollarBatchget, options: MethodOptions): GaxiosPromise[Schema$BatchGetAmpUrlsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarAmpurlsDollarBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetAmpUrlsResponse]
  ): Unit = js.native
}

