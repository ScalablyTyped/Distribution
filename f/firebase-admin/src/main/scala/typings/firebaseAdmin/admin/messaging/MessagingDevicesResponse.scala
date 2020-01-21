package typings.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the server response from the legacy
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.messaging.Messaging#sendToDevice `sendToDevice()`} method.
  *
  * See
  * [Send to individual devices](/docs/cloud-messaging/admin/send-messages#send_to_individual_devices)
  * for code samples and detailed documentation.
  */
trait MessagingDevicesResponse extends js.Object {
  /**
    * The number of results that contain a canonical registration token. A
    * canonical registration token is the registration token corresponding to the
    * last registration requested by the client app. This is the token that you
    * should use when sending future messages to the device.
    *
    * You can access the canonical registration tokens within the
    * [`results`](#results) property.
    */
  var canonicalRegistrationTokenCount: Double
  /**
    * The number of messages that could not be processed and resulted in an error.
    */
  var failureCount: Double
  /**
    * The unique ID number identifying this multicast message.
    */
  var multicastId: Double
  /**
    * An array of `MessagingDeviceResult` objects representing the status of the
    * processed messages. The objects are listed in the same order as in the
    * request. That is, for each registration token in the request, its result has
    * the same index in this array. If only a single registration token is
    * provided, this array will contain a single object.
    */
  var results: js.Array[MessagingDeviceResult]
  /**
    * The number of messages that were successfully processed and sent.
    */
  var successCount: Double
}

object MessagingDevicesResponse {
  @scala.inline
  def apply(
    canonicalRegistrationTokenCount: Double,
    failureCount: Double,
    multicastId: Double,
    results: js.Array[MessagingDeviceResult],
    successCount: Double
  ): MessagingDevicesResponse = {
    val __obj = js.Dynamic.literal(canonicalRegistrationTokenCount = canonicalRegistrationTokenCount.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], multicastId = multicastId.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessagingDevicesResponse]
  }
}

