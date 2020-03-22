package typings.devextreme

import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onHover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelayName extends js.Object {
  var delay: js.UndefOr[AnonShow | Double] = js.undefined
  var name: js.UndefOr[onClick | onHover] = js.undefined
}

object AnonDelayName {
  @scala.inline
  def apply(delay: AnonShow | Double = null, name: onClick | onHover = null): AnonDelayName = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelayName]
  }
}

