package typings.gapiDotClientDotGroupssettings.gapi.client.groupssettings

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGroupssettings.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: Anon_Alt): Request[Groups]
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[Groups]
  /** Updates an existing resource. */
  def update(request: Anon_Alt): Request[Groups]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: Anon_Alt => Request[Groups],
    patch: Anon_Alt => Request[Groups],
    update: Anon_Alt => Request[Groups]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

