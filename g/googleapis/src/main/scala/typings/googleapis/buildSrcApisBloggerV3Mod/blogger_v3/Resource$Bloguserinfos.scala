package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Bloguserinfos")
@js.native
class Resource$Bloguserinfos protected () extends js.Object {
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
  def get(): GaxiosPromise[Schema$BlogUserInfo] = js.native
  def get(callback: BodyResponseCallback[Schema$BlogUserInfo]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBloguserinfosDollarGet): GaxiosPromise[Schema$BlogUserInfo] = js.native
  def get(
    params: ParamsDollarResourceDollarBloguserinfosDollarGet,
    callback: BodyResponseCallback[Schema$BlogUserInfo]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBloguserinfosDollarGet,
    options: BodyResponseCallback[Schema$BlogUserInfo],
    callback: BodyResponseCallback[Schema$BlogUserInfo]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBloguserinfosDollarGet, options: MethodOptions): GaxiosPromise[Schema$BlogUserInfo] = js.native
  def get(
    params: ParamsDollarResourceDollarBloguserinfosDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BlogUserInfo]
  ): Unit = js.native
}

