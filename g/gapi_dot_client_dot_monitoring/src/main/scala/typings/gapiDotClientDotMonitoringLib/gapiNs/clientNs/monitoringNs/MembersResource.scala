package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: gapiDotClientDotMonitoringLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListGroupMembersResponse]
}

object MembersResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListGroupMembersResponse]
    ]
  ): MembersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[MembersResource]
  }
}

