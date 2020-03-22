package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowSearch extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAllowSearch {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    width: Int | Double = null
  ): AnonAllowSearch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowSearch]
  }
}

