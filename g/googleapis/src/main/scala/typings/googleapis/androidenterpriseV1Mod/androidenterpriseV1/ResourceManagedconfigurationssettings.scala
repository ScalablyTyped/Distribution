package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationssettings")
@js.native
class ResourceManagedconfigurationssettings protected () extends js.Object {
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
  def list(): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(params: ParamsResourceManagedconfigurationssettingsList): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    options: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse],
    callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedconfigurationssettingsList, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsSettingsListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationssettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfigurationsSettingsListResponse]
  ): Unit = js.native
}

