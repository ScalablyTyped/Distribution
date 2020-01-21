package typings.googleScriptClientSide.google.script.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.script.history.setChangeHandler")
@js.native
object setChangeHandler extends js.Object {
  /**
    * Sets a callback function to respond to changes in the browser history.
    * @param callback a client-side callback function to run upon a history change event, using the event object as the only argument.
    */
  def apply(handler: js.Function1[/* event */ HistoryChangeEvent, Unit]): Unit = js.native
}

