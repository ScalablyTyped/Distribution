package typings.googleapis.buildSrcApisPlaycustomappV1Mod.playcustomapp_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/playcustomapp/v1", "playcustomapp_v1.Resource$Accounts$Customapps")
@js.native
class ResourceDollarAccountsDollarCustomapps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * playcustomapp.accounts.customApps.create
    * @desc Create and publish a new custom app.
    * @alias playcustomapp.accounts.customApps.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.account Developer account ID.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$CustomApp] = js.native
  def create(callback: BodyResponseCallback[Schema$CustomApp]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarCustomappsDollarCreate): GaxiosPromise[Schema$CustomApp] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarCustomappsDollarCreate,
    callback: BodyResponseCallback[Schema$CustomApp]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarCustomappsDollarCreate,
    options: BodyResponseCallback[Schema$CustomApp],
    callback: BodyResponseCallback[Schema$CustomApp]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarCustomappsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$CustomApp] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarCustomappsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomApp]
  ): Unit = js.native
}

