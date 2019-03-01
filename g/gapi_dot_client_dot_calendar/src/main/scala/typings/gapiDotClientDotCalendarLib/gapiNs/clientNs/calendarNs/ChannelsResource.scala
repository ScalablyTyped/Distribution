package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: gapiDotClientDotCalendarLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(
    stop: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[ChannelsResource]
  }
}

