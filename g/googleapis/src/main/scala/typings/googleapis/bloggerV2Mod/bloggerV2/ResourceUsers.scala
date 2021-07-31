package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Users")
@js.native
class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var blogs: ResourceUsersBlogs = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * blogger.users.get
    * @desc Gets one user by id.
    * @alias blogger.users.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The ID of the user to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUser] = js.native
  def get(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
}
