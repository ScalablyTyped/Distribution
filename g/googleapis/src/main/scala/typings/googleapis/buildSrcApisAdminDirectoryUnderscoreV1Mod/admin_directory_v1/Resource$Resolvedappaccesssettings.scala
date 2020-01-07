package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resolvedappaccesssettings")
@js.native
class Resource$Resolvedappaccesssettings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.resolvedAppAccessSettings.GetSettings
    * @desc Retrieves resolved app access settings of the logged in user.
    * @alias directory.resolvedAppAccessSettings.GetSettings
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def GetSettings(): GaxiosPromise[Schema$AppAccessCollections] = js.native
  def GetSettings(callback: BodyResponseCallback[Schema$AppAccessCollections]): Unit = js.native
  def GetSettings(params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarGetsettings): GaxiosPromise[Schema$AppAccessCollections] = js.native
  def GetSettings(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarGetsettings,
    callback: BodyResponseCallback[Schema$AppAccessCollections]
  ): Unit = js.native
  def GetSettings(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarGetsettings,
    options: BodyResponseCallback[Schema$AppAccessCollections],
    callback: BodyResponseCallback[Schema$AppAccessCollections]
  ): Unit = js.native
  def GetSettings(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarGetsettings,
    options: MethodOptions
  ): GaxiosPromise[Schema$AppAccessCollections] = js.native
  def GetSettings(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarGetsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppAccessCollections]
  ): Unit = js.native
  /**
    * directory.resolvedAppAccessSettings.ListTrustedApps
    * @desc Retrieves the list of apps trusted by the admin of the logged in
    * user.
    * @alias directory.resolvedAppAccessSettings.ListTrustedApps
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def ListTrustedApps(): GaxiosPromise[Schema$TrustedApps] = js.native
  def ListTrustedApps(callback: BodyResponseCallback[Schema$TrustedApps]): Unit = js.native
  def ListTrustedApps(params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarListtrustedapps): GaxiosPromise[Schema$TrustedApps] = js.native
  def ListTrustedApps(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarListtrustedapps,
    callback: BodyResponseCallback[Schema$TrustedApps]
  ): Unit = js.native
  def ListTrustedApps(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarListtrustedapps,
    options: BodyResponseCallback[Schema$TrustedApps],
    callback: BodyResponseCallback[Schema$TrustedApps]
  ): Unit = js.native
  def ListTrustedApps(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarListtrustedapps,
    options: MethodOptions
  ): GaxiosPromise[Schema$TrustedApps] = js.native
  def ListTrustedApps(
    params: ParamsDollarResourceDollarResolvedappaccesssettingsDollarListtrustedapps,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TrustedApps]
  ): Unit = js.native
}

