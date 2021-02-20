package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Users$Blogs")
@js.native
class ResourceUsersBlogs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * blogger.users.blogs.list
    * @desc Retrieves a list of blogs, possibly filtered.
    * @alias blogger.users.blogs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId ID of the user whose blogs are to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBlogList] = js.native
  def list(callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def list(params: ParamsResourceUsersBlogsList): GaxiosPromise[SchemaBlogList] = js.native
  def list(params: ParamsResourceUsersBlogsList, callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def list(
    params: ParamsResourceUsersBlogsList,
    options: BodyResponseCallback[SchemaBlogList],
    callback: BodyResponseCallback[SchemaBlogList]
  ): Unit = js.native
  def list(params: ParamsResourceUsersBlogsList, options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def list(
    params: ParamsResourceUsersBlogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlogList]
  ): Unit = js.native
}
