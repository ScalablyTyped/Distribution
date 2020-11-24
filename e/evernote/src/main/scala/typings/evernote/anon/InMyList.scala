package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InMyList extends js.Object {
  
  var inMyList: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object InMyList {
  
  @scala.inline
  def apply(): InMyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InMyList]
  }
  
  @scala.inline
  implicit class InMyListOps[Self <: InMyList] (val x: Self) extends AnyVal {
    
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
    def setInMyList(value: Boolean): Self = this.set("inMyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInMyList: Self = this.set("inMyList", js.undefined)
    
    @scala.inline
    def setReminderNotifyEmail(value: Boolean): Self = this.set("reminderNotifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderNotifyEmail: Self = this.set("reminderNotifyEmail", js.undefined)
    
    @scala.inline
    def setReminderNotifyInApp(value: Boolean): Self = this.set("reminderNotifyInApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderNotifyInApp: Self = this.set("reminderNotifyInApp", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
