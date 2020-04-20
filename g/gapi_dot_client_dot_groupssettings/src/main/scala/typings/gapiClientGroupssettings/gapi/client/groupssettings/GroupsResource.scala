package typings.gapiClientGroupssettings.gapi.client.groupssettings

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGroupssettings.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: AnonAlt): Request_[Groups]
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[Groups]
  /** Updates an existing resource. */
  def update(request: AnonAlt): Request_[Groups]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Groups],
    patch: AnonAlt => Request_[Groups],
    update: AnonAlt => Request_[Groups]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
}

