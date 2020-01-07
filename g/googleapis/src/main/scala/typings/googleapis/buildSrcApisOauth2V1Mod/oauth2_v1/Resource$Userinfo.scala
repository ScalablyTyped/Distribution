package typings.googleapis.buildSrcApisOauth2V1Mod.oauth2_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/oauth2/v1", "oauth2_v1.Resource$Userinfo")
@js.native
class Resource$Userinfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var v2: ResourceDollarUserinfoDollarV2 = js.native
  /**
    * oauth2.userinfo.get
    * @desc Get user info
    * @alias oauth2.userinfo.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Userinfoplus] = js.native
  def get(callback: BodyResponseCallback[Schema$Userinfoplus]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserinfoDollarGet): GaxiosPromise[Schema$Userinfoplus] = js.native
  def get(
    params: ParamsDollarResourceDollarUserinfoDollarGet,
    callback: BodyResponseCallback[Schema$Userinfoplus]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUserinfoDollarGet,
    options: BodyResponseCallback[Schema$Userinfoplus],
    callback: BodyResponseCallback[Schema$Userinfoplus]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserinfoDollarGet, options: MethodOptions): GaxiosPromise[Schema$Userinfoplus] = js.native
  def get(
    params: ParamsDollarResourceDollarUserinfoDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Userinfoplus]
  ): Unit = js.native
}

