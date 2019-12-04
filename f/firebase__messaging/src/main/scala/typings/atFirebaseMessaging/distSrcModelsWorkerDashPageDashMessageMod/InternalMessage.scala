package typings.atFirebaseMessaging.distSrcModelsWorkerDashPageDashMessageMod

import typings.atFirebaseMessaging.distSrcInterfacesMessageDashPayloadMod.MessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalMessage extends js.Object {
  var firebaseMessagingData: MessagePayload
  var firebaseMessagingType: MessageType
}

object InternalMessage {
  @scala.inline
  def apply(firebaseMessagingData: MessagePayload, firebaseMessagingType: MessageType): InternalMessage = {
    val __obj = js.Dynamic.literal(firebaseMessagingData = firebaseMessagingData.asInstanceOf[js.Any], firebaseMessagingType = firebaseMessagingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalMessage]
  }
}

