package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConversionPing extends js.Object {
  /** Defines the context of the ping. */
  var context: js.UndefOr[String] = js.undefined
  /**
    * The url (without the schema) that the player shall send the ping to. It's at caller's descretion to decide which schema to use (http vs https) Example
    * of a returned url: //googleads.g.doubleclick.net/pagead/ viewthroughconversion/962985656/?data=path%3DtHe_path%3Btype%3D
    * cview%3Butuid%3DGISQtTNGYqaYl4sKxoVvKA&labe=default The caller must append biscotti authentication (ms param in case of mobile, for example) to this
    * ping.
    */
  var conversionUrl: js.UndefOr[String] = js.undefined
}

object ChannelConversionPing {
  @scala.inline
  def apply(context: String = null, conversionUrl: String = null): ChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (conversionUrl != null) __obj.updateDynamic("conversionUrl")(conversionUrl)
    __obj.asInstanceOf[ChannelConversionPing]
  }
}

