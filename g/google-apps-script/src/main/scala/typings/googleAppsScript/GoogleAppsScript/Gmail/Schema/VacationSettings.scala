package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VacationSettings extends js.Object {
  
  var enableAutoReply: js.UndefOr[Boolean] = js.native
  
  var endTime: js.UndefOr[String] = js.native
  
  var responseBodyHtml: js.UndefOr[String] = js.native
  
  var responseBodyPlainText: js.UndefOr[String] = js.native
  
  var responseSubject: js.UndefOr[String] = js.native
  
  var restrictToContacts: js.UndefOr[Boolean] = js.native
  
  var restrictToDomain: js.UndefOr[Boolean] = js.native
  
  var startTime: js.UndefOr[String] = js.native
}
object VacationSettings {
  
  @scala.inline
  def apply(): VacationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VacationSettings]
  }
  
  @scala.inline
  implicit class VacationSettingsOps[Self <: VacationSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableAutoReply(value: Boolean): Self = this.set("enableAutoReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoReply: Self = this.set("enableAutoReply", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setResponseBodyHtml(value: String): Self = this.set("responseBodyHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBodyHtml: Self = this.set("responseBodyHtml", js.undefined)
    
    @scala.inline
    def setResponseBodyPlainText(value: String): Self = this.set("responseBodyPlainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBodyPlainText: Self = this.set("responseBodyPlainText", js.undefined)
    
    @scala.inline
    def setResponseSubject(value: String): Self = this.set("responseSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseSubject: Self = this.set("responseSubject", js.undefined)
    
    @scala.inline
    def setRestrictToContacts(value: Boolean): Self = this.set("restrictToContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictToContacts: Self = this.set("restrictToContacts", js.undefined)
    
    @scala.inline
    def setRestrictToDomain(value: Boolean): Self = this.set("restrictToDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictToDomain: Self = this.set("restrictToDomain", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
