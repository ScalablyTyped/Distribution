package typings.gapiDotClientDotBlogger.gapiNs.clientNs

import typings.gapiDotClientDotBlogger.gapiDotClientDotBloggerStrings.blogger
import typings.gapiDotClientDotBlogger.gapiDotClientDotBloggerStrings.v3
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.BlogUserInfosResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.BlogsResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.CommentsResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.PageViewsResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.PagesResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.PostUserInfosResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.PostsResource
import typings.gapiDotClientDotBlogger.gapiNs.clientNs.bloggerNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
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

