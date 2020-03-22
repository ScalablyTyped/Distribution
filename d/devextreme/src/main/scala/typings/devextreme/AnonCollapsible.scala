package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollapsible extends js.Object {
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[AnonCommandsArray]] = js.undefined
}

object AnonCollapsible {
  @scala.inline
  def apply(
    collapsible: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[AnonCommandsArray] = null
  ): AnonCollapsible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollapsible]
  }
}

