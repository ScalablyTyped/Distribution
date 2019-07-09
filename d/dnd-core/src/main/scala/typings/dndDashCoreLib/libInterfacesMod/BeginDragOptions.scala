package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDragOptions extends js.Object {
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
  var getSourceClientOffset: js.UndefOr[js.Function1[/* sourceId */ Identifier, XYCoord]] = js.undefined
  var publishSource: js.UndefOr[scala.Boolean] = js.undefined
}

object BeginDragOptions {
  @scala.inline
  def apply(
    clientOffset: XYCoord = null,
    getSourceClientOffset: /* sourceId */ Identifier => XYCoord = null,
    publishSource: js.UndefOr[scala.Boolean] = js.undefined
  ): BeginDragOptions = {
    val __obj = js.Dynamic.literal()
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset)
    if (getSourceClientOffset != null) __obj.updateDynamic("getSourceClientOffset")(js.Any.fromFunction1(getSourceClientOffset))
    if (!js.isUndefined(publishSource)) __obj.updateDynamic("publishSource")(publishSource)
    __obj.asInstanceOf[BeginDragOptions]
  }
}

