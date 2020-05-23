package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameUrl extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object NameUrl {
  @scala.inline
  def apply(name: String = null, url: String = null): NameUrl = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameUrl]
  }
}

