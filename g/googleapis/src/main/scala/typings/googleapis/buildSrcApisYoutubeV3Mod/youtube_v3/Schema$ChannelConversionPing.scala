package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pings that the app shall fire (authenticated by biscotti cookie). Each ping
  * has a context, in which the app must fire the ping, and a url identifying
  * the ping.
  */
@js.native
trait Schema$ChannelConversionPing extends js.Object {
  /**
    * Defines the context of the ping.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * The url (without the schema) that the player shall send the ping to.
    * It&#39;s at caller&#39;s descretion to decide which schema to use (http
    * vs https) Example of a returned url:
    * //googleads.g.doubleclick.net/pagead/
    * viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
    * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&amp;labe=default The caller must
    * append biscotti authentication (ms param in case of mobile, for example)
    * to this ping.
    */
  var conversionUrl: js.UndefOr[String] = js.native
}

object Schema$ChannelConversionPing {
  @scala.inline
  def apply(context: String = null, conversionUrl: String = null): Schema$ChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (conversionUrl != null) __obj.updateDynamic("conversionUrl")(conversionUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelConversionPing]
  }
}

