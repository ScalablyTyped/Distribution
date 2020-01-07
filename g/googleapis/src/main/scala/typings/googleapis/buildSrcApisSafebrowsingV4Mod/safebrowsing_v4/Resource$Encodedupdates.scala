package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Encodedupdates")
@js.native
class Resource$Encodedupdates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.encodedUpdates.get
    * @alias safebrowsing.encodedUpdates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientId A client ID that uniquely identifies the client implementation of the Safe Browsing API.
    * @param {string=} params.clientVersion The version of the client implementation.
    * @param {string} params.encodedRequest A serialized FetchThreatListUpdatesRequest proto.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FetchThreatListUpdatesResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEncodedupdatesDollarGet): GaxiosPromise[Schema$FetchThreatListUpdatesResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarEncodedupdatesDollarGet,
    callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEncodedupdatesDollarGet,
    options: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse],
    callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEncodedupdatesDollarGet, options: MethodOptions): GaxiosPromise[Schema$FetchThreatListUpdatesResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarEncodedupdatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FetchThreatListUpdatesResponse]
  ): Unit = js.native
}

