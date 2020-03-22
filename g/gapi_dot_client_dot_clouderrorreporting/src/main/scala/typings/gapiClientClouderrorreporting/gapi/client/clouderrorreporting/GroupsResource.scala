package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouderrorreporting.AnonBearertoken
import typings.gapiClientClouderrorreporting.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: AnonBearertoken): Request_[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: AnonCallback): Request_[ErrorGroup]
}

object GroupsResource {
  @scala.inline
  def apply(get: AnonBearertoken => Request_[ErrorGroup], update: AnonCallback => Request_[ErrorGroup]): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

