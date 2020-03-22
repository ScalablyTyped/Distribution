package typings.gestalt.mod

import typings.gestalt.gestaltStrings.middle
import typings.gestalt.gestaltStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var position: js.UndefOr[middle | top] = js.undefined
  var text: String
}

object BadgeProps {
  @scala.inline
  def apply(text: String, position: middle | top = null): BadgeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

