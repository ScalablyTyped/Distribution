package typings.firebaseAdmin.messagingMod.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the status of a message sent to an individual device
  * via the FCM legacy APIs.
  *
  * See
  * [Send to individual devices](/docs/cloud-messaging/admin/send-messages#send_to_individual_devices)
  * for code samples and detailed documentation.
  */
trait MessagingDeviceResult extends js.Object {
  /**
    * The canonical registration token for the client app that the message was
    * processed and sent to. You should use this value as the registration token
    * for future requests. Otherwise, future messages might be rejected.
    */
  var canonicalRegistrationToken: js.UndefOr[String] = js.undefined
  /**
    * The error that occurred when processing the message for the recipient.
    */
  var error: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.FirebaseError */ js.Any
  ] = js.undefined
  /**
    * A unique ID for the successfully processed message.
    */
  var messageId: js.UndefOr[String] = js.undefined
}

object MessagingDeviceResult {
  @scala.inline
  def apply(
    canonicalRegistrationToken: String = null,
    error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.FirebaseError */ js.Any = null,
    messageId: String = null
  ): MessagingDeviceResult = {
    val __obj = js.Dynamic.literal()
    if (canonicalRegistrationToken != null) __obj.updateDynamic("canonicalRegistrationToken")(canonicalRegistrationToken.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingDeviceResult]
  }
}

