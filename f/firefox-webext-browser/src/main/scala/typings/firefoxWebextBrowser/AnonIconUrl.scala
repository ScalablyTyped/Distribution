package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconUrl extends js.Object {
  var iconUrl: js.UndefOr[String] = js.undefined
  var title: String
}

object AnonIconUrl {
  @scala.inline
  def apply(title: String, iconUrl: String = null): AnonIconUrl = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIconUrl]
  }
}

