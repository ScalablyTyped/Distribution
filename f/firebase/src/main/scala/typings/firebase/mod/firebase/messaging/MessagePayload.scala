package typings.firebase.mod.firebase.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePayload extends js.Object {
  
  /**
    * The collapse key of this message. See
    * {@link https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages
    * Collapsible and non-collapsible messages}.
    */
  var collapseKey: String = js.native
  
  /**
    * Arbitrary key/value pairs.
    */
  var data: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * See {@link firebase.messaging.FcmOptions}.
    */
  var fcmOptions: js.UndefOr[FcmOptions] = js.native
  
  /**
    * The sender of this message.
    */
  var from: String = js.native
  
  /**
    * See {@link firebase.messaging.NotificationPayload}.
    */
  var notification: js.UndefOr[NotificationPayload] = js.native
}
object MessagePayload {
  
  @scala.inline
  def apply(collapseKey: String, from: String): MessagePayload = {
    val __obj = js.Dynamic.literal(collapseKey = collapseKey.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayload]
  }
  
  @scala.inline
  implicit class MessagePayloadOps[Self <: MessagePayload] (val x: Self) extends AnyVal {
    
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
    def setCollapseKey(value: String): Self = this.set("collapseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: FcmOptions): Self = this.set("fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFcmOptions: Self = this.set("fcmOptions", js.undefined)
    
    @scala.inline
    def setNotification(value: NotificationPayload): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
  }
}
