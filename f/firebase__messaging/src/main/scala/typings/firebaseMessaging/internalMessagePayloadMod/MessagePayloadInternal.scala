package typings.firebaseMessaging.internalMessagePayloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePayloadInternal extends js.Object {
  
  var collapse_key: String = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var fcmOptions: js.UndefOr[FcmOptionsInternal] = js.native
  
  var from: String = js.native
  
  var isFirebaseMessaging: js.UndefOr[Boolean] = js.native
  
  var messageType: js.UndefOr[MessageType] = js.native
  
  var notification: js.UndefOr[NotificationPayloadInternal] = js.native
}
object MessagePayloadInternal {
  
  @scala.inline
  def apply(collapse_key: String, from: String): MessagePayloadInternal = {
    val __obj = js.Dynamic.literal(collapse_key = collapse_key.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePayloadInternal]
  }
  
  @scala.inline
  implicit class MessagePayloadInternalOps[Self <: MessagePayloadInternal] (val x: Self) extends AnyVal {
    
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
    def setCollapse_key(value: String): Self = this.set("collapse_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: FcmOptionsInternal): Self = this.set("fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFcmOptions: Self = this.set("fcmOptions", js.undefined)
    
    @scala.inline
    def setIsFirebaseMessaging(value: Boolean): Self = this.set("isFirebaseMessaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFirebaseMessaging: Self = this.set("isFirebaseMessaging", js.undefined)
    
    @scala.inline
    def setMessageType(value: MessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    
    @scala.inline
    def setNotification(value: NotificationPayloadInternal): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
  }
}
