package typings.eslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var recommended: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Category {
  @scala.inline
  def apply(
    category: String = null,
    description: String = null,
    recommended: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(recommended)) __obj.updateDynamic("recommended")(recommended.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

