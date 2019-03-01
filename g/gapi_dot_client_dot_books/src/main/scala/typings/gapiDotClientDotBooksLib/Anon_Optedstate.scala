package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Optedstate extends js.Object {
  var opted_state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Optedstate {
  @scala.inline
  def apply(opted_state: java.lang.String = null): Anon_Optedstate = {
    val __obj = js.Dynamic.literal()
    if (opted_state != null) __obj.updateDynamic("opted_state")(opted_state)
    __obj.asInstanceOf[Anon_Optedstate]
  }
}

