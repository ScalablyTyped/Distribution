package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleUrl extends js.Object {
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object Anon_TitleUrl {
  @scala.inline
  def apply(title: String, url: String = null): Anon_TitleUrl = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TitleUrl]
  }
}

