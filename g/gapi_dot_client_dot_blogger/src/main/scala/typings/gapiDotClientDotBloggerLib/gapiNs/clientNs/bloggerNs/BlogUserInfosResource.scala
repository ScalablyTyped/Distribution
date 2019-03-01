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
  def apply(
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BlogUserInfo]
    ]
  ): BlogUserInfosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[BlogUserInfosResource]
  }
}

