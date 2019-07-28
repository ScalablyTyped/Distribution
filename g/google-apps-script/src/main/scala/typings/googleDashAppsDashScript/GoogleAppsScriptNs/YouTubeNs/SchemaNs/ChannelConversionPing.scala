package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConversionPing extends js.Object {
  var context: js.UndefOr[String] = js.undefined
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

