package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogUserInfosResource extends js.Object {
  /** Gets one blog and user info pair by blogId and userId. */
  def get(request: gapiDotClientDotBloggerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BlogUserInfo]
}

object BlogUserInfosResource {
  @scala.inline
  def apply(get: gapiDotClientDotBloggerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[BlogUserInfo]): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[BlogUserInfosResource]
  }
}

