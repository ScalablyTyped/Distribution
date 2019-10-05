package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBlogger.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Gets one user by ID. */
  def get(request: Anon_AltFieldsKey): Request[User]
}

object UsersResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKey => Request[User]): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UsersResource]
  }
}

