package typings
package globDashWatcherLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Complete extends js.Object {
  def subscribe(): js.Any = js.native
  def subscribe(next: js.Function1[/* value */ js.Any, scala.Unit]): js.Any = js.native
  def subscribe(
    next: js.Function1[/* value */ js.Any, scala.Unit],
    error: js.Function1[/* error */ js.Any, scala.Unit]
  ): js.Any = js.native
  def subscribe(
    next: js.Function1[/* value */ js.Any, scala.Unit],
    error: js.Function1[/* error */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): js.Any = js.native
}

