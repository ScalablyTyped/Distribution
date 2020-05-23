package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
}

object Filter {
  @scala.inline
  def apply(filter: js.Any = null, group: js.Any = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

