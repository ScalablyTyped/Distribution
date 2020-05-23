package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouderrorreporting.anon.Bearertoken
import typings.gapiClientClouderrorreporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: Bearertoken): Request[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: Callback): Request[ErrorGroup]
}

object GroupsResource {
  @scala.inline
  def apply(get: Bearertoken => Request[ErrorGroup], update: Callback => Request[ErrorGroup]): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
}

