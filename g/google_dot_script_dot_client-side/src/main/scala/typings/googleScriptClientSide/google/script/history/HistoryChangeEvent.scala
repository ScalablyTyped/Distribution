package typings.googleScriptClientSide.google.script.history

import typings.googleScriptClientSide.google.script.UrlLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryChangeEvent extends js.Object {
  
  /**
    * A location object associated with the popped event
    */
  var location: UrlLocation = js.native
  
  /**
    * The state object associated with the popped event.
    * This object is identical to the state object that used in the corresponding push() or replace() method that added the popped state to the history stack.
    */
  var state: State = js.native
}
object HistoryChangeEvent {
  
  @scala.inline
  def apply(location: UrlLocation): HistoryChangeEvent = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryChangeEvent]
  }
  
  @scala.inline
  implicit class HistoryChangeEventOps[Self <: HistoryChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocation(value: UrlLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}
