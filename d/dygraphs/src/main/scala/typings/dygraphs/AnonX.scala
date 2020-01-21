package typings.dygraphs

import typings.dygraphs.dygraphs.PerAxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: js.UndefOr[PerAxisOptions] = js.undefined
  var y: js.UndefOr[PerAxisOptions] = js.undefined
  var y2: js.UndefOr[PerAxisOptions] = js.undefined
}

object AnonX {
  @scala.inline
  def apply(x: PerAxisOptions = null, y: PerAxisOptions = null, y2: PerAxisOptions = null): AnonX = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

