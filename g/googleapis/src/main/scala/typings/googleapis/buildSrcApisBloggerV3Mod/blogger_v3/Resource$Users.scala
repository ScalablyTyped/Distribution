package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Users")
@js.native
class Resource$Users protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.users.get
    * @desc Gets one user by ID.
    * @alias blogger.users.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The ID of the user to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$User] = js.native
  def get(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet): GaxiosPromise[Schema$User] = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarGet,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
}

