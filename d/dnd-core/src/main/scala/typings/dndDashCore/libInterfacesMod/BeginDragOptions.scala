package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDragOptions extends js.Object {
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
  var getSourceClientOffset: js.UndefOr[js.Function1[/* sourceId */ Identifier, XYCoord]] = js.undefined
  var publishSource: js.UndefOr[Boolean] = js.undefined
}

object BeginDragOptions {
  @scala.inline
  def apply(
    clientOffset: XYCoord = null,
    getSourceClientOffset: /* sourceId */ Identifier => XYCoord = null,
    publishSource: js.UndefOr[Boolean] = js.undefined
  ): BeginDragOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset.asInstanceOf[js.Any])
    if (getSourceClientOffset != null) __obj.updateDynamic("getSourceClientOffset")(js.Any.fromFunction1(getSourceClientOffset))
    if (!js.isUndefined(publishSource)) __obj.updateDynamic("publishSource")(publishSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDragOptions]
  }
}

