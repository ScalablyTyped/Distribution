package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleUrl extends js.Object {
  var title: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object TitleUrl {
  @scala.inline
  def apply(title: String = null, url: String = null): TitleUrl = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleUrl]
  }
}

