package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCategory extends js.Object {
  var category: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
}

object AnonCategory {
  @scala.inline
  def apply(category: String = null, iconUrl: String = null, size: Int | Double = null): AnonCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
}

