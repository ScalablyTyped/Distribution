package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearFilter extends js.Object {
  var clearFilter: js.UndefOr[String] = js.undefined
  var createFilter: js.UndefOr[String] = js.undefined
  var filterEnabledHint: js.UndefOr[String] = js.undefined
}

object ClearFilter {
  @scala.inline
  def apply(clearFilter: String = null, createFilter: String = null, filterEnabledHint: String = null): ClearFilter = {
    val __obj = js.Dynamic.literal()
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(clearFilter.asInstanceOf[js.Any])
    if (createFilter != null) __obj.updateDynamic("createFilter")(createFilter.asInstanceOf[js.Any])
    if (filterEnabledHint != null) __obj.updateDynamic("filterEnabledHint")(filterEnabledHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearFilter]
  }
}

