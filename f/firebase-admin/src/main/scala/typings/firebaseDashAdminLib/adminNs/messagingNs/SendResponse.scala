package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the status of an individual message that was sent as
  * part of a batch request.
  */
trait SendResponse extends js.Object {
  /**
    * An error, if the message was not handed off to FCM successfully.
    */
  var error: js.UndefOr[firebaseDashAdminLib.adminNs.FirebaseError] = js.undefined
  /**
    * A unique message ID string, if the message was handed off to FCM for
    * delivery.
    *
    */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean indicating if the message was successfully handed off to FCM or
    * not. When true, the `messageId` attribute is guaranteed to be set. When
    * false, the `error` attribute is guaranteed to be set.
    */
  var success: scala.Boolean
}

object SendResponse {
  @scala.inline
  def apply(
    success: scala.Boolean,
    error: firebaseDashAdminLib.adminNs.FirebaseError = null,
    messageId: java.lang.String = null
  ): SendResponse = {
    val __obj = js.Dynamic.literal(success = success)
    if (error != null) __obj.updateDynamic("error")(error)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    __obj.asInstanceOf[SendResponse]
  }
}

