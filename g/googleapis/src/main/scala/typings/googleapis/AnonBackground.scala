package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackground extends js.Object {
  var background: js.UndefOr[String] = js.native
  var border: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonBackground {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    text: String = null,
    title: String = null,
    url: String = null
  ): AnonBackground = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

