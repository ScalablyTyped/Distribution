package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptedstate extends js.Object {
  var opted_state: js.UndefOr[String] = js.native
}

object AnonOptedstate {
  @scala.inline
  def apply(opted_state: String = null): AnonOptedstate = {
    val __obj = js.Dynamic.literal()
    if (opted_state != null) __obj.updateDynamic("opted_state")(opted_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptedstate]
  }
}

