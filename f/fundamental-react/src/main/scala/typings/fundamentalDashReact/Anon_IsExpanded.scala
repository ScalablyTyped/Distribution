package typings.fundamentalDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsExpanded extends js.Object {
  /* Set to *true* for expanded tree item. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /* ID used to track the expanded/collapsed state of the row. This variable is handled internally, but can be overridden by the consumer through this prop. */
  var rowId: js.UndefOr[String] = js.undefined
}

object Anon_IsExpanded {
  @scala.inline
  def apply(isExpanded: js.UndefOr[Boolean] = js.undefined, rowId: String = null): Anon_IsExpanded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsExpanded]
  }
}

