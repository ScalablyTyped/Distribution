package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitleUrl extends js.Object {
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object AnonTitleUrl {
  @scala.inline
  def apply(title: String, url: String = null): AnonTitleUrl = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitleUrl]
  }
}

