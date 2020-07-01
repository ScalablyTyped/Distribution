package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  var category: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
}

object Category {
  @scala.inline
  def apply(category: String = null, iconUrl: String = null, size: js.UndefOr[Double] = js.undefined): Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

