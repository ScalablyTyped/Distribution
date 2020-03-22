package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(filter: js.Any = null, group: js.Any = null): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

