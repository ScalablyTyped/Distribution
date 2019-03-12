package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Gets one user by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[User]
}

object UsersResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotBloggerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[User]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UsersResource]
  }
}

