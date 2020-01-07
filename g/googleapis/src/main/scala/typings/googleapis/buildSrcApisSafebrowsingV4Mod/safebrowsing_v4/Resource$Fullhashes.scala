package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Fullhashes")
@js.native
class Resource$Fullhashes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.fullHashes.find
    * @desc Finds the full hashes that match the requested hash prefixes.
    * @alias safebrowsing.fullHashes.find
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FindFullHashesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def find(): GaxiosPromise[Schema$FindFullHashesResponse] = js.native
  def find(callback: BodyResponseCallback[Schema$FindFullHashesResponse]): Unit = js.native
  def find(params: ParamsDollarResourceDollarFullhashesDollarFind): GaxiosPromise[Schema$FindFullHashesResponse] = js.native
  def find(
    params: ParamsDollarResourceDollarFullhashesDollarFind,
    callback: BodyResponseCallback[Schema$FindFullHashesResponse]
  ): Unit = js.native
  def find(
    params: ParamsDollarResourceDollarFullhashesDollarFind,
    options: BodyResponseCallback[Schema$FindFullHashesResponse],
    callback: BodyResponseCallback[Schema$FindFullHashesResponse]
  ): Unit = js.native
  def find(params: ParamsDollarResourceDollarFullhashesDollarFind, options: MethodOptions): GaxiosPromise[Schema$FindFullHashesResponse] = js.native
  def find(
    params: ParamsDollarResourceDollarFullhashesDollarFind,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FindFullHashesResponse]
  ): Unit = js.native
}

