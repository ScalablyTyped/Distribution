package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /** Sets the arrow position again popup.
    */
  var stem: js.UndefOr[PositionStem] = js.undefined
  /** Sets the Tooltip position against target.
    */
  var target: js.UndefOr[PositionTarget] = js.undefined
}

object Position {
  @scala.inline
  def apply(stem: PositionStem = null, target: PositionTarget = null): Position = {
    val __obj = js.Dynamic.literal()
    if (stem != null) __obj.updateDynamic("stem")(stem.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

