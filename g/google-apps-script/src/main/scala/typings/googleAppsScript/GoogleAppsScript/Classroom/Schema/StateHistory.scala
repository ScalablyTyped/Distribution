package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateHistory extends js.Object {
  
  var actorUserId: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var stateTimestamp: js.UndefOr[String] = js.native
}
object StateHistory {
  
  @scala.inline
  def apply(): StateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateHistory]
  }
  
  @scala.inline
  implicit class StateHistoryOps[Self <: StateHistory] (val x: Self) extends AnyVal {
    
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
    def setActorUserId(value: String): Self = this.set("actorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActorUserId: Self = this.set("actorUserId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateTimestamp(value: String): Self = this.set("stateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateTimestamp: Self = this.set("stateTimestamp", js.undefined)
  }
}
