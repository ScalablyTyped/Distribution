package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConversionPings extends js.Object {
  var pings: js.UndefOr[js.Array[ChannelConversionPing]] = js.undefined
}

object ChannelConversionPings {
  @scala.inline
  def apply(pings: js.Array[ChannelConversionPing] = null): ChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    if (pings != null) __obj.updateDynamic("pings")(pings)
    __obj.asInstanceOf[ChannelConversionPings]
  }
}

