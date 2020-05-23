package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleUrl extends js.Object {
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object TitleUrl {
  @scala.inline
  def apply(title: String, url: String = null): TitleUrl = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleUrl]
  }
}

