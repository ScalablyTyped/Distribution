package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionLocalization extends js.Object {
  var title: js.UndefOr[String] = js.undefined
}

object ChannelSectionLocalization {
  @scala.inline
  def apply(title: String = null): ChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChannelSectionLocalization]
  }
}

