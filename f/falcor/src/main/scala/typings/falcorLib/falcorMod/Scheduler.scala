package typings
package falcorLib.falcorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): Scheduler
  def catchException(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): Scheduler
}

object Scheduler {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* exception */ js.Any, scala.Boolean] => Scheduler,
    catchException: js.Function1[/* exception */ js.Any, scala.Boolean] => Scheduler
  ): Scheduler = {
    val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.asInstanceOf[Scheduler]
  }
}

