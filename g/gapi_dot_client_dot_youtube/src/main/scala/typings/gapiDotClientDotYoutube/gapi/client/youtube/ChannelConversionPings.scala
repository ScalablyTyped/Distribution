package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConversionPings extends js.Object {
  /**
    * Pings that the app shall fire (authenticated by biscotti cookie). Each ping has a context, in which the app must fire the ping, and a url identifying
    * the ping.
    */
  var pings: js.UndefOr[js.Array[ChannelConversionPing]] = js.undefined
}

object ChannelConversionPings {
  @scala.inline
  def apply(pings: js.Array[ChannelConversionPing] = null): ChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    if (pings != null) __obj.updateDynamic("pings")(pings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConversionPings]
  }
}

