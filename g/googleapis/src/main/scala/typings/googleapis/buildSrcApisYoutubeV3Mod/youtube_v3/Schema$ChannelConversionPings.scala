package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The conversionPings object encapsulates information about conversion pings
  * that need to be respected by the channel.
  */
@js.native
trait Schema$ChannelConversionPings extends js.Object {
  /**
    * Pings that the app shall fire (authenticated by biscotti cookie). Each
    * ping has a context, in which the app must fire the ping, and a url
    * identifying the ping.
    */
  var pings: js.UndefOr[js.Array[Schema$ChannelConversionPing]] = js.native
}

object Schema$ChannelConversionPings {
  @scala.inline
  def apply(pings: js.Array[Schema$ChannelConversionPing] = null): Schema$ChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    if (pings != null) __obj.updateDynamic("pings")(pings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelConversionPings]
  }
}

