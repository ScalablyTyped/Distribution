package typings.gapiClientBlogger

import typings.gapiClientBlogger.gapi.client.blogger.BlogUserInfosResource
import typings.gapiClientBlogger.gapi.client.blogger.BlogsResource
import typings.gapiClientBlogger.gapi.client.blogger.CommentsResource
import typings.gapiClientBlogger.gapi.client.blogger.PageViewsResource
import typings.gapiClientBlogger.gapi.client.blogger.PagesResource
import typings.gapiClientBlogger.gapi.client.blogger.PostUserInfosResource
import typings.gapiClientBlogger.gapi.client.blogger.PostsResource
import typings.gapiClientBlogger.gapi.client.blogger.UsersResource
import typings.gapiClientBlogger.gapiClientBloggerStrings.blogger
import typings.gapiClientBlogger.gapiClientBloggerStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val blogUserInfos: BlogUserInfosResource = js.native
      val blogs: BlogsResource = js.native
      val comments: CommentsResource = js.native
      val pageViews: PageViewsResource = js.native
      val pages: PagesResource = js.native
      val postUserInfos: PostUserInfosResource = js.native
      val posts: PostsResource = js.native
      val users: UsersResource = js.native
      /** Load Blogger API v3 */
      def load(name: blogger, version: v3): js.Thenable[Unit] = js.native
      def load(name: blogger, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

