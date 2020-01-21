package typings.googleScriptClientSide.google.script.history

import typings.googleScriptClientSide.google.script.UrlLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryChangeEvent extends js.Object {
  /**
    * A location object associated with the popped event
    */
  var location: UrlLocation
  /**
    * The state object associated with the popped event.
    * This object is identical to the state object that used in the corresponding push() or replace() method that added the popped state to the history stack.
    */
  var state: State
}

object HistoryChangeEvent {
  @scala.inline
  def apply(location: UrlLocation, state: State = null): HistoryChangeEvent = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryChangeEvent]
  }
}

