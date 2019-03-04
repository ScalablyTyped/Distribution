package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: gapiDotClientDotAdminLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(
    stop: js.Function1[
      gapiDotClientDotAdminLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = stop)
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

