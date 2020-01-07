package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Organizations")
@js.native
class Resource$Organizations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var assets: ResourceDollarOrganizationsDollarAssets = js.native
  var context: APIRequestContext = js.native
  var operations: ResourceDollarOrganizationsDollarOperations = js.native
  var sources: ResourceDollarOrganizationsDollarSources = js.native
  /**
    * securitycenter.organizations.getOrganizationSettings
    * @desc Gets the settings for an organization.
    * @alias securitycenter.organizations.getOrganizationSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the organization to get organization settings for. Its format is "organizations/[organization_id]/organizationSettings".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOrganizationSettings(): GaxiosPromise[Schema$OrganizationSettings] = js.native
  def getOrganizationSettings(callback: BodyResponseCallback[Schema$OrganizationSettings]): Unit = js.native
  def getOrganizationSettings(params: ParamsDollarResourceDollarOrganizationsDollarGetorganizationsettings): GaxiosPromise[Schema$OrganizationSettings] = js.native
  def getOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorganizationsettings,
    callback: BodyResponseCallback[Schema$OrganizationSettings]
  ): Unit = js.native
  def getOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorganizationsettings,
    options: BodyResponseCallback[Schema$OrganizationSettings],
    callback: BodyResponseCallback[Schema$OrganizationSettings]
  ): Unit = js.native
  def getOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorganizationsettings,
    options: MethodOptions
  ): GaxiosPromise[Schema$OrganizationSettings] = js.native
  def getOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarGetorganizationsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrganizationSettings]
  ): Unit = js.native
  /**
    * securitycenter.organizations.updateOrganizationSettings
    * @desc Updates an organization's settings.
    * @alias securitycenter.organizations.updateOrganizationSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the settings. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/organizationSettings".
    * @param {string=} params.updateMask The FieldMask to use when updating the settings resource.   If empty all mutable fields will be updated.
    * @param {().OrganizationSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateOrganizationSettings(): GaxiosPromise[Schema$OrganizationSettings] = js.native
  def updateOrganizationSettings(callback: BodyResponseCallback[Schema$OrganizationSettings]): Unit = js.native
  def updateOrganizationSettings(params: ParamsDollarResourceDollarOrganizationsDollarUpdateorganizationsettings): GaxiosPromise[Schema$OrganizationSettings] = js.native
  def updateOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdateorganizationsettings,
    callback: BodyResponseCallback[Schema$OrganizationSettings]
  ): Unit = js.native
  def updateOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdateorganizationsettings,
    options: BodyResponseCallback[Schema$OrganizationSettings],
    callback: BodyResponseCallback[Schema$OrganizationSettings]
  ): Unit = js.native
  def updateOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdateorganizationsettings,
    options: MethodOptions
  ): GaxiosPromise[Schema$OrganizationSettings] = js.native
  def updateOrganizationSettings(
    params: ParamsDollarResourceDollarOrganizationsDollarUpdateorganizationsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrganizationSettings]
  ): Unit = js.native
}

