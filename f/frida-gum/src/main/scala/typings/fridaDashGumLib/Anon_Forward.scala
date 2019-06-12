package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Forward extends js.Object {
  /**
    * Gets notified about the method name that we’re about to forward a call to. This might be where you’d
    * start out with a temporary callback that just logs the names to help you decide which methods to
    * override.
    *
    * @param name Name of method that is about to get called.
    */
  var forward: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Unit]] = js.undefined
}

object Anon_Forward {
  @scala.inline
  def apply(forward: /* name */ java.lang.String => scala.Unit = null): Anon_Forward = {
    val __obj = js.Dynamic.literal()
    if (forward != null) __obj.updateDynamic("forward")(js.Any.fromFunction1(forward))
    __obj.asInstanceOf[Anon_Forward]
  }
}

