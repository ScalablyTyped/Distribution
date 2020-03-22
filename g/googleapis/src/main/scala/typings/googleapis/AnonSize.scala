package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSize extends js.Object {
  var family: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
}

object AnonSize {
  @scala.inline
  def apply(family: String = null, size: String = null): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

