package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Resource$Media")
@js.native
class Resource$Media protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plusDomains.media.insert
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.media.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection
    * @param {string} params.userId The ID of the user to create the activity on behalf of.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Media] = js.native
  def insert(callback: BodyResponseCallback[Schema$Media]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMediaDollarInsert): GaxiosPromise[Schema$Media] = js.native
  def insert(params: ParamsDollarResourceDollarMediaDollarInsert, callback: BodyResponseCallback[Schema$Media]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarMediaDollarInsert,
    options: BodyResponseCallback[Schema$Media],
    callback: BodyResponseCallback[Schema$Media]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMediaDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Media] = js.native
  def insert(
    params: ParamsDollarResourceDollarMediaDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Media]
  ): Unit = js.native
}

