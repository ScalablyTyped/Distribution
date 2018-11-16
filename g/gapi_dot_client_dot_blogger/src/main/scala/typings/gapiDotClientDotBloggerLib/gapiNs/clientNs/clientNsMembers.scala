package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val blogUserInfos: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.BlogUserInfosResource = js.native
  val blogs: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.BlogsResource = js.native
  val comments: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.CommentsResource = js.native
  val pageViews: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.PageViewsResource = js.native
  val pages: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.PagesResource = js.native
  val postUserInfos: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.PostUserInfosResource = js.native
  val posts: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.PostsResource = js.native
  val users: gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs.UsersResource = js.native
  /** Load Blogger API v3 */
  def load(
    name: gapiDotClientDotBloggerLib.gapiDotClientDotBloggerLibStrings.blogger,
    version: gapiDotClientDotBloggerLib.gapiDotClientDotBloggerLibStrings.v3
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotBloggerLib.gapiDotClientDotBloggerLibStrings.blogger,
    version: gapiDotClientDotBloggerLib.gapiDotClientDotBloggerLibStrings.v3,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

