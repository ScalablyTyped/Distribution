package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowAdding extends js.Object {
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  var allowDeleting: js.UndefOr[Boolean] = js.undefined
  var allowDragging: js.UndefOr[Boolean] = js.undefined
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  var allowUpdating: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowAdding {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowDeleting: js.UndefOr[Boolean] = js.undefined,
    allowDragging: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowUpdating: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowAdding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleting)) __obj.updateDynamic("allowDeleting")(allowDeleting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragging)) __obj.updateDynamic("allowDragging")(allowDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUpdating)) __obj.updateDynamic("allowUpdating")(allowUpdating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowAdding]
  }
}

