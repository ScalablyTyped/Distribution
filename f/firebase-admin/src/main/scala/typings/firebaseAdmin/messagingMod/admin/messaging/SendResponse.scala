package typings.firebaseAdmin.messagingMod.admin.messaging

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
  var error: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.FirebaseError */ js.Any
  ] = js.undefined
  /**
    * A unique message ID string, if the message was handed off to FCM for
    * delivery.
    *
    */
  var messageId: js.UndefOr[String] = js.undefined
  /**
    * A boolean indicating if the message was successfully handed off to FCM or
    * not. When true, the `messageId` attribute is guaranteed to be set. When
    * false, the `error` attribute is guaranteed to be set.
    */
  var success: Boolean
}

object SendResponse {
  @scala.inline
  def apply(
    success: Boolean,
    error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.FirebaseError */ js.Any = null,
    messageId: String = null
  ): SendResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendResponse]
  }
}

