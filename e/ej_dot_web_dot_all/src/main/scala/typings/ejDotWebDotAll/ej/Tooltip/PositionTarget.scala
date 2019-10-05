package typings.ejDotWebDotAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionTarget extends js.Object {
  /** Sets the Tooltip position against target based on horizontal(x) value.
    * @Default {center}
    */
  var horizontal: js.UndefOr[String | Double] = js.undefined
  /** Sets the Tooltip position against target based on vertical(y) value.
    * @Default {top}
    */
  var vertical: js.UndefOr[String | Double] = js.undefined
}

object PositionTarget {
  @scala.inline
  def apply(horizontal: String | Double = null, vertical: String | Double = null): PositionTarget = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionTarget]
  }
}

