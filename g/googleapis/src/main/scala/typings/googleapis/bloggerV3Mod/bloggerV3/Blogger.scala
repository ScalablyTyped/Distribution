package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Blogger")
@js.native
open class Blogger protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var blogUserInfos: ResourceBloguserinfos = js.native
  
  var blogs: ResourceBlogs = js.native
  
  var comments: ResourceComments = js.native
  
  var context: APIRequestContext = js.native
  
  var pageViews: ResourcePageviews = js.native
  
  var pages: ResourcePages = js.native
  
  var postUserInfos: ResourcePostuserinfos = js.native
  
  var posts: ResourcePosts = js.native
  
  var users: ResourceUsers = js.native
}
