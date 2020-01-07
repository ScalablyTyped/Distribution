package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Applications")
@js.native
class ResourceDollarEnterprisesDollarApplications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.applications.get
    * @desc Gets info about an application.
    * @alias androidmanagement.enterprises.applications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode The preferred language for localized application info, as a BCP47 tag (e.g. "en-US", "de"). If not specified the default language of the application will be used.
    * @param {string} params.name The name of the application in the form enterprises/{enterpriseId}/applications/{package_name}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Application] = js.native
  def get(callback: BodyResponseCallback[Schema$Application]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarApplicationsDollarGet): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarApplicationsDollarGet,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarApplicationsDollarGet,
    options: BodyResponseCallback[Schema$Application],
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarApplicationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarApplicationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
}

