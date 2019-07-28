package typings.driftless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var customClearTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(customClearTimeout: /* repeated */ js.Any => Unit = null): Anon_Args = {
    val __obj = js.Dynamic.literal()
    if (customClearTimeout != null) __obj.updateDynamic("customClearTimeout")(js.Any.fromFunction1(customClearTimeout))
    __obj.asInstanceOf[Anon_Args]
  }
}

