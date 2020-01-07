package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Clientid")
@js.native
class ResourceDollarManagementDollarClientid protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.clientId.hashClientId
    * @desc Hashes the given Client ID.
    * @alias analytics.management.clientId.hashClientId
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().HashClientIdRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def hashClientId(): GaxiosPromise[Schema$HashClientIdResponse] = js.native
  def hashClientId(callback: BodyResponseCallback[Schema$HashClientIdResponse]): Unit = js.native
  def hashClientId(params: ParamsDollarResourceDollarManagementDollarClientidDollarHashclientid): GaxiosPromise[Schema$HashClientIdResponse] = js.native
  def hashClientId(
    params: ParamsDollarResourceDollarManagementDollarClientidDollarHashclientid,
    callback: BodyResponseCallback[Schema$HashClientIdResponse]
  ): Unit = js.native
  def hashClientId(
    params: ParamsDollarResourceDollarManagementDollarClientidDollarHashclientid,
    options: BodyResponseCallback[Schema$HashClientIdResponse],
    callback: BodyResponseCallback[Schema$HashClientIdResponse]
  ): Unit = js.native
  def hashClientId(
    params: ParamsDollarResourceDollarManagementDollarClientidDollarHashclientid,
    options: MethodOptions
  ): GaxiosPromise[Schema$HashClientIdResponse] = js.native
  def hashClientId(
    params: ParamsDollarResourceDollarManagementDollarClientidDollarHashclientid,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HashClientIdResponse]
  ): Unit = js.native
}

