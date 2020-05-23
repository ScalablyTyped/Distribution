package typings.dropboxjs.Dropbox.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSource extends js.Object {
  def addListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource
  def dispatch(event: js.Object): Boolean
  def removeListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource
}

object EventSource {
  @scala.inline
  def apply(
    addListener: js.Function1[/* event */ js.Any, Unit] => EventSource,
    dispatch: js.Object => Boolean,
    removeListener: js.Function1[/* event */ js.Any, Unit] => EventSource
  ): EventSource = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), dispatch = js.Any.fromFunction1(dispatch), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[EventSource]
  }
}

