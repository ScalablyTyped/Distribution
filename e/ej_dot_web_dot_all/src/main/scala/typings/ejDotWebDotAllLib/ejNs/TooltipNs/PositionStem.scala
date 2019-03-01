package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionStem extends js.Object {
  /** Sets the arrow position again popup based on horizontal(x) value
    * @Default {center}
    */
  var horizontal: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the arrow position again popup based on vertical(y) value
    * @Default {bottom}
    */
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object PositionStem {
  @scala.inline
  def apply(horizontal: java.lang.String = null, vertical: java.lang.String = null): PositionStem = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PositionStem]
  }
}

