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
    get: js.Function1[
      gapiDotClientDotGroupssettingsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Groups]
    ],
    patch: js.Function1[
      gapiDotClientDotGroupssettingsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Groups]
    ],
    update: js.Function1[
      gapiDotClientDotGroupssettingsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Groups]
    ]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(get = get, patch = patch, update = update)
  
    __obj.asInstanceOf[GroupsResource]
  }
}

