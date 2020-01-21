package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsExpanded extends js.Object {
  /* Set to *true* for expanded tree item. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /* ID used to track the expanded/collapsed state of the row. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var rowId: js.UndefOr[String] = js.undefined
}

object AnonIsExpanded {
  @scala.inline
  def apply(isExpanded: js.UndefOr[Boolean] = js.undefined, rowId: String = null): AnonIsExpanded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsExpanded]
  }
}

