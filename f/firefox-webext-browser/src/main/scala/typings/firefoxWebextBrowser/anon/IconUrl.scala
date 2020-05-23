package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconUrl extends js.Object {
  var iconUrl: js.UndefOr[String] = js.undefined
  var title: String
}

object IconUrl {
  @scala.inline
  def apply(title: String, iconUrl: String = null): IconUrl = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconUrl]
  }
}

