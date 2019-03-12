package typings
package gapiDotClientDotGroupssettingsLib.gapiNs.clientNs.groupssettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: gapiDotClientDotGroupssettingsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGroupssettingsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
  /** Updates an existing resource. */
  def update(request: gapiDotClientDotGroupssettingsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
}

object GroupsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotGroupssettingsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Groups],
    patch: gapiDotClientDotGroupssettingsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Groups],
    update: gapiDotClientDotGroupssettingsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Groups]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

