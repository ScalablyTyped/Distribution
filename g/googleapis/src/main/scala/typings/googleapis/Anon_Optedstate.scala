package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Optedstate extends js.Object {
  var opted_state: js.UndefOr[String] = js.native
}

object Anon_Optedstate {
  @scala.inline
  def apply(opted_state: String = null): Anon_Optedstate = {
    val __obj = js.Dynamic.literal()
    if (opted_state != null) __obj.updateDynamic("opted_state")(opted_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Optedstate]
  }
}

