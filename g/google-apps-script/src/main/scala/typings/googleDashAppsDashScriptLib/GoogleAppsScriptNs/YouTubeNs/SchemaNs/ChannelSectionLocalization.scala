package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionLocalization extends js.Object {
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelSectionLocalization {
  @scala.inline
  def apply(title: java.lang.String = null): ChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChannelSectionLocalization]
  }
}

