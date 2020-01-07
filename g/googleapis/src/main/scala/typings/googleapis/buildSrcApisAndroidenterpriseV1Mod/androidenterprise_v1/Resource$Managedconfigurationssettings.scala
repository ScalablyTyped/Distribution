package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationssettings")
@js.native
class Resource$Managedconfigurationssettings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.managedconfigurationssettings.list
    * @desc Lists all the managed configurations settings for the specified
    * app. Only the ID and the name is set.
    * @alias androidenterprise.managedconfigurationssettings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.productId The ID of the product for which the managed configurations settings applies to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ManagedConfigurationsSettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ManagedConfigurationsSettingsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedconfigurationssettingsDollarList): GaxiosPromise[Schema$ManagedConfigurationsSettingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationssettingsDollarList,
    callback: BodyResponseCallback[Schema$ManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationssettingsDollarList,
    options: BodyResponseCallback[Schema$ManagedConfigurationsSettingsListResponse],
    callback: BodyResponseCallback[Schema$ManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedconfigurationssettingsDollarList, options: MethodOptions): GaxiosPromise[Schema$ManagedConfigurationsSettingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationssettingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
}

