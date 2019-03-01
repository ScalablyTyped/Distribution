package typings
package expressDashBruteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var reset: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[scala.Unit]], scala.Unit]] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(reset: js.Function1[/* callback */ js.UndefOr[js.Function0[scala.Unit]], scala.Unit] = null): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    if (reset != null) __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Anon_Callback]
  }
}

