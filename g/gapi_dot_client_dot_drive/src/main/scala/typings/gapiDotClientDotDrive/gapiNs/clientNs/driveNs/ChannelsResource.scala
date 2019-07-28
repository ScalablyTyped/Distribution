package typings.gapiDotClientDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDrive.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: Anon_Alt): Request[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: Anon_Alt => Request[Unit]): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

