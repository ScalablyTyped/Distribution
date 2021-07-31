package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Applications")
@js.native
class ResourceEnterprisesApplications protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceEnterprisesApplicationsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    options: BodyResponseCallback[SchemaApplication],
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesApplicationsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceEnterprisesApplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
}
