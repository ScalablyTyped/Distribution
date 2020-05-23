package typings.gapiClientGroupssettings.gapi.client.groupssettings

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGroupssettings.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: Alt): Request[Groups]
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: Alt): Request[Groups]
  /** Updates an existing resource. */
  def update(request: Alt): Request[Groups]
}

object GroupsResource {
  @scala.inline
  def apply(get: Alt => Request[Groups], patch: Alt => Request[Groups], update: Alt => Request[Groups]): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
}

