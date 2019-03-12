package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Retrieves a list of activities for a specific customer and application. */
  def list(request: gapiDotClientDotAdminLib.Anon_ActorIpAddress): gapiDotClientLib.gapiNs.clientNs.Request[Activities]
  /** Push changes to activities */
  def watch(request: gapiDotClientDotAdminLib.Anon_ActorIpAddress): gapiDotClientLib.gapiNs.clientNs.Request[Channel]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAdminLib.Anon_ActorIpAddress => gapiDotClientLib.gapiNs.clientNs.Request[Activities],
    watch: gapiDotClientDotAdminLib.Anon_ActorIpAddress => gapiDotClientLib.gapiNs.clientNs.Request[Channel]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), watch = js.Any.fromFunction1(watch))
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

