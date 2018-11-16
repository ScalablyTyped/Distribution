package typings
package gapiDotClientDotGroupssettingsLib.gapiNs.clientNs.groupssettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: gapiDotClientDotGroupssettingsLib.Anon_GroupUniqueId): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGroupssettingsLib.Anon_GroupUniqueId): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
  /** Updates an existing resource. */
  def update(request: gapiDotClientDotGroupssettingsLib.Anon_GroupUniqueId): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
}

