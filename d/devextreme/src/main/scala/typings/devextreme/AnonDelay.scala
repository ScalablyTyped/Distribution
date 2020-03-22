package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AnonDelay {
  @scala.inline
  def apply(delay: Int | Double = null, name: String = null): AnonDelay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

