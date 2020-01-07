package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TitleUrl extends js.Object {
  var title: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_TitleUrl {
  @scala.inline
  def apply(title: String = null, url: String = null): Anon_TitleUrl = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TitleUrl]
  }
}

