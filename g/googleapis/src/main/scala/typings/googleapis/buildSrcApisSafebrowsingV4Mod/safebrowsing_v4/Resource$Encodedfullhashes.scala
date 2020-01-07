package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Encodedfullhashes")
@js.native
class Resource$Encodedfullhashes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.encodedFullHashes.get
    * @alias safebrowsing.encodedFullHashes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientId A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing API.
    * @param {string=} params.clientVersion The version of the client implementation.
    * @param {string} params.encodedRequest A serialized FindFullHashesRequest proto.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FindFullHashesResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$FindFullHashesResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEncodedfullhashesDollarGet): GaxiosPromise[Schema$FindFullHashesResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarEncodedfullhashesDollarGet,
    callback: BodyResponseCallback[Schema$FindFullHashesResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEncodedfullhashesDollarGet,
    options: BodyResponseCallback[Schema$FindFullHashesResponse],
    callback: BodyResponseCallback[Schema$FindFullHashesResponse]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEncodedfullhashesDollarGet, options: MethodOptions): GaxiosPromise[Schema$FindFullHashesResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarEncodedfullhashesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FindFullHashesResponse]
  ): Unit = js.native
}

