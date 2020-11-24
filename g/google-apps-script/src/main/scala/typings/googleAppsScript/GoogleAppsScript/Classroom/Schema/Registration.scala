package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registration extends js.Object {
  
  var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.native
  
  var expiryTime: js.UndefOr[String] = js.native
  
  var feed: js.UndefOr[Feed] = js.native
  
  var registrationId: js.UndefOr[String] = js.native
}
object Registration {
  
  @scala.inline
  def apply(): Registration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registration]
  }
  
  @scala.inline
  implicit class RegistrationOps[Self <: Registration] (val x: Self) extends AnyVal {
    
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
    def setCloudPubsubTopic(value: CloudPubsubTopic): Self = this.set("cloudPubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudPubsubTopic: Self = this.set("cloudPubsubTopic", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: String): Self = this.set("expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryTime: Self = this.set("expiryTime", js.undefined)
    
    @scala.inline
    def setFeed(value: Feed): Self = this.set("feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeed: Self = this.set("feed", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationId: Self = this.set("registrationId", js.undefined)
  }
}
