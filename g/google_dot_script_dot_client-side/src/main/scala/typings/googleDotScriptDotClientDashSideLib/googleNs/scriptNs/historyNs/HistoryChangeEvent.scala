package typings
package googleDotScriptDotClientDashSideLib.googleNs.scriptNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryChangeEvent extends js.Object {
  /**
    * A location object associated with the popped event
    */
  var location: googleDotScriptDotClientDashSideLib.googleNs.scriptNs.UrlLocation
  /**
    * The state object associated with the popped event.
    * This object is identical to the state object that used in the corresponding push() or replace() method that added the popped state to the history stack.
    */
  var state: State
}

object HistoryChangeEvent {
  @scala.inline
  def apply(location: googleDotScriptDotClientDashSideLib.googleNs.scriptNs.UrlLocation, state: State): HistoryChangeEvent = {
    val __obj = js.Dynamic.literal(location = location, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HistoryChangeEvent]
  }
}

