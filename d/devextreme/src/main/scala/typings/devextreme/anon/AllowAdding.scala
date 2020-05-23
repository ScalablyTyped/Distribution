package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowAdding extends js.Object {
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  var allowDeleting: js.UndefOr[Boolean] = js.undefined
  var allowDragging: js.UndefOr[Boolean] = js.undefined
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  var allowUpdating: js.UndefOr[Boolean] = js.undefined
}

object AllowAdding {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowDeleting: js.UndefOr[Boolean] = js.undefined,
    allowDragging: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowUpdating: js.UndefOr[Boolean] = js.undefined
  ): AllowAdding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleting)) __obj.updateDynamic("allowDeleting")(allowDeleting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragging)) __obj.updateDynamic("allowDragging")(allowDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUpdating)) __obj.updateDynamic("allowUpdating")(allowUpdating.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowAdding]
  }
}

