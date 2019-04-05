package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConversionPing extends js.Object {
  var context: js.UndefOr[java.lang.String] = js.undefined
  var conversionUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelConversionPing {
  @scala.inline
  def apply(context: java.lang.String = null, conversionUrl: java.lang.String = null): ChannelConversionPing = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (conversionUrl != null) __obj.updateDynamic("conversionUrl")(conversionUrl)
    __obj.asInstanceOf[ChannelConversionPing]
  }
}

