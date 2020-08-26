package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Bloguserinfos")
@js.native
class ResourceBloguserinfos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.blogUserInfos.get
    * @desc Gets one blog and user info pair by blogId and userId.
    * @alias blogger.blogUserInfos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog to get.
    * @param {integer=} params.maxPosts Maximum number of posts to pull back with the blog.
    * @param {string} params.userId ID of the user whose blogs are to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaBlogUserInfo]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(params: ParamsResourceBloguserinfosGet): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(params: ParamsResourceBloguserinfosGet, callback: BodyResponseCallback[SchemaBlogUserInfo]): Unit = js.native
  def get(
    params: ParamsResourceBloguserinfosGet,
    options: BodyResponseCallback[SchemaBlogUserInfo],
    callback: BodyResponseCallback[SchemaBlogUserInfo]
  ): Unit = js.native
  def get(params: ParamsResourceBloguserinfosGet, options: MethodOptions): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(
    params: ParamsResourceBloguserinfosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlogUserInfo]
  ): Unit = js.native
}

