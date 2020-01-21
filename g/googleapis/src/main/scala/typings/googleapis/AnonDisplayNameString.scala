package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayNameString extends js.Object {
  var displayName: js.UndefOr[String] = js.native
}

object AnonDisplayNameString {
  @scala.inline
  def apply(displayName: String = null): AnonDisplayNameString = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayNameString]
  }
}

