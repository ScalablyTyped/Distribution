package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleString extends js.Object {
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object TitleString {
  @scala.inline
  def apply(title: String, url: String = null): TitleString = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleString]
  }
}

