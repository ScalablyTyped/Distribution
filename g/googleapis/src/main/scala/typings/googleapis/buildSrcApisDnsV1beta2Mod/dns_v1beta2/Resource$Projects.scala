package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.projects.get
    * @alias dns.projects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Project] = js.native
  def get(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
}

