package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var recommended: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Category {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    description: java.lang.String = null,
    recommended: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): Anon_Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(recommended)) __obj.updateDynamic("recommended")(recommended)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Category]
  }
}

