package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouderrorreporting.AnonAccesstokenAltBearertoken
import typings.gapiClientClouderrorreporting.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: AnonAccesstokenAltBearertoken): Request_[ErrorGroup]
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: AnonAccesstokenAltBearertokenCallback): Request_[ErrorGroup]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: AnonAccesstokenAltBearertoken => Request_[ErrorGroup],
    update: AnonAccesstokenAltBearertokenCallback => Request_[ErrorGroup]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

