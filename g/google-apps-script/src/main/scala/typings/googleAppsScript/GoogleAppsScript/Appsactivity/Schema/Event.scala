package typings.googleAppsScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.native
  
  var eventTimeMillis: js.UndefOr[String] = js.native
  
  var fromUserDeletion: js.UndefOr[Boolean] = js.native
  
  var move: js.UndefOr[Move] = js.native
  
  var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.native
  
  var primaryEventType: js.UndefOr[String] = js.native
  
  var rename: js.UndefOr[Rename] = js.native
  
  var target: js.UndefOr[Target] = js.native
  
  var user: js.UndefOr[User] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setAdditionalEventTypesVarargs(value: String*): Self = this.set("additionalEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalEventTypes(value: js.Array[String]): Self = this.set("additionalEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalEventTypes: Self = this.set("additionalEventTypes", js.undefined)
    
    @scala.inline
    def setEventTimeMillis(value: String): Self = this.set("eventTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTimeMillis: Self = this.set("eventTimeMillis", js.undefined)
    
    @scala.inline
    def setFromUserDeletion(value: Boolean): Self = this.set("fromUserDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromUserDeletion: Self = this.set("fromUserDeletion", js.undefined)
    
    @scala.inline
    def setMove(value: Move): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setPermissionChangesVarargs(value: PermissionChange*): Self = this.set("permissionChanges", js.Array(value :_*))
    
    @scala.inline
    def setPermissionChanges(value: js.Array[PermissionChange]): Self = this.set("permissionChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionChanges: Self = this.set("permissionChanges", js.undefined)
    
    @scala.inline
    def setPrimaryEventType(value: String): Self = this.set("primaryEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryEventType: Self = this.set("primaryEventType", js.undefined)
    
    @scala.inline
    def setRename(value: Rename): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
