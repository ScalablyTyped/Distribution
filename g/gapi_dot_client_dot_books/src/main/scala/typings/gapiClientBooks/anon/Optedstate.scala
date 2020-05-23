package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optedstate extends js.Object {
  var opted_state: js.UndefOr[String] = js.undefined
}

object Optedstate {
  @scala.inline
  def apply(opted_state: String = null): Optedstate = {
    val __obj = js.Dynamic.literal()
    if (opted_state != null) __obj.updateDynamic("opted_state")(opted_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optedstate]
  }
}

