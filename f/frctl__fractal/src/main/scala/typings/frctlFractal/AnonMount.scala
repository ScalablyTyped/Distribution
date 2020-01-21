package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMount extends js.Object {
  var mount: js.UndefOr[String] = js.undefined
}

object AnonMount {
  @scala.inline
  def apply(mount: String = null): AnonMount = {
    val __obj = js.Dynamic.literal()
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMount]
  }
}

