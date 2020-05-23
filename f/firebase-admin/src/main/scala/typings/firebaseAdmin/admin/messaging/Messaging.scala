package typings.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets the {@link admin.messaging.Messaging `Messaging`} service for the
  * current app.
  *
  * @example
  * ```javascript
  * var messaging = app.messaging();
  * // The above is shorthand for:
  * // var messaging = admin.messaging(app);
  * ```
  *
  * @return The `Messaging` service for the current app.
  */
@js.native
trait Messaging extends js.Object {
  /**
    * The {@link admin.app.App app} associated with the current `Messaging` service
    * instance.
    *
    * @example
    * ```javascript
    * var app = messaging.app;
    * ```
    */
  var app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.app.App */ js.Any = js.native
  /**
    * Sends the given message via FCM.
    *
    * @param message The message payload.
    * @param dryRun Whether to send the message in the dry-run
    *   (validation only) mode.
    * @return A promise fulfilled with a unique message ID
    *   string after the message has been successfully handed off to the FCM
    *   service for delivery.
    */
  def send(message: typings.firebaseAdmin.messagingMod.admin.messaging.Message): js.Promise[String] = js.native
  def send(message: typings.firebaseAdmin.messagingMod.admin.messaging.Message, dryRun: Boolean): js.Promise[String] = js.native
  /**
    * Sends all the messages in the given array via Firebase Cloud Messaging.
    * Employs batching to send the entire list as a single RPC call. Compared
    * to the `send()` method, this method is a significantly more efficient way
    * to send multiple messages.
    *
    * The responses list obtained from the return value
    * corresponds to the order of tokens in the `MulticastMessage`. An error
    * from this method indicates a total failure -- i.e. none of the messages in
    * the list could be sent. Partial failures are indicated by a `BatchResponse`
    * return value.
    *
    * @param messages A non-empty array
    *   containing up to 500 messages.
    * @param dryRun Whether to send the messages in the dry-run
    *   (validation only) mode.
    * @return A Promise fulfilled with an object representing the result of the
    *   send operation.
    */
  def sendAll(messages: js.Array[typings.firebaseAdmin.messagingMod.admin.messaging.Message]): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.BatchResponse] = js.native
  def sendAll(messages: js.Array[typings.firebaseAdmin.messagingMod.admin.messaging.Message], dryRun: Boolean): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.BatchResponse] = js.native
  /**
    * Sends the given multicast message to all the FCM registration tokens
    * specified in it.
    *
    * This method uses the `sendAll()` API under the hood to send the given
    * message to all the target recipients. The responses list obtained from the
    * return value corresponds to the order of tokens in the `MulticastMessage`.
    * An error from this method indicates a total failure -- i.e. the message was
    * not sent to any of the tokens in the list. Partial failures are indicated by
    * a `BatchResponse` return value.
    *
    * @param message A multicast message
    *   containing up to 500 tokens.
    * @param dryRun Whether to send the message in the dry-run
    *   (validation only) mode.
    * @return A Promise fulfilled with an object representing the result of the
    *   send operation.
    */
  def sendMulticast(message: typings.firebaseAdmin.messagingMod.admin.messaging.MulticastMessage): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.BatchResponse] = js.native
  def sendMulticast(message: typings.firebaseAdmin.messagingMod.admin.messaging.MulticastMessage, dryRun: Boolean): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.BatchResponse] = js.native
  /**
    * Sends an FCM message to a condition.
    *
    * See
    * [Send to a condition](/docs/cloud-messaging/admin/legacy-fcm#send_to_a_condition)
    * for code samples and detailed documentation.
    *
    * @param condition The condition determining to which topics to send
    *   the message.
    * @param payload The message payload.
    * @param options Optional options to
    *   alter the message.
    *
    * @return A promise fulfilled with the server's response after the message
    *   has been sent.
    */
  def sendToCondition(condition: String, payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingConditionResponse] = js.native
  def sendToCondition(
    condition: String,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload,
    options: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingOptions
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingConditionResponse] = js.native
  /**
    * Sends an FCM message to a single device corresponding to the provided
    * registration token.
    *
    * See
    * [Send to individual devices](/docs/cloud-messaging/admin/legacy-fcm#send_to_individual_devices)
    * for code samples and detailed documentation. Takes either a
    * `registrationToken` to send to a single device or a
    * `registrationTokens` parameter containing an array of tokens to send
    * to multiple devices.
    *
    * @param registrationToken A device registration token or an array of
    *   device registration tokens to which the message should be sent.
    * @param payload The message payload.
    * @param options Optional options to
    *   alter the message.
    *
    * @return A promise fulfilled with the server's response after the message
    *   has been sent.
    */
  def sendToDevice(
    registrationToken: String,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingDevicesResponse] = js.native
  def sendToDevice(
    registrationToken: String,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload,
    options: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingOptions
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingDevicesResponse] = js.native
  def sendToDevice(
    registrationToken: js.Array[String],
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingDevicesResponse] = js.native
  def sendToDevice(
    registrationToken: js.Array[String],
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload,
    options: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingOptions
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingDevicesResponse] = js.native
  /**
    * Sends an FCM message to a device group corresponding to the provided
    * notification key.
    *
    * See
    * [Send to a device group](/docs/cloud-messaging/admin/legacy-fcm#send_to_a_device_group)
    * for code samples and detailed documentation.
    *
    * @param notificationKey The notification key for the device group to
    *   which to send the message.
    * @param payload The message payload.
    * @param options Optional options to
    *   alter the message.
    *
    * @return A promise fulfilled with the server's response after the message
    *   has been sent.
    */
  def sendToDeviceGroup(
    notificationKey: String,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingDeviceGroupResponse] = js.native
  def sendToDeviceGroup(
    notificationKey: String,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload,
    options: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingOptions
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingDeviceGroupResponse] = js.native
  /**
    * Sends an FCM message to a topic.
    *
    * See
    * [Send to a topic](/docs/cloud-messaging/admin/legacy-fcm#send_to_a_topic)
    * for code samples and detailed documentation.
    *
    * @param topic The topic to which to send the message.
    * @param payload The message payload.
    * @param options Optional options to
    *   alter the message.
    *
    * @return A promise fulfilled with the server's response after the message
    *   has been sent.
    */
  def sendToTopic(topic: String, payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingTopicResponse] = js.native
  def sendToTopic(
    topic: String,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingPayload,
    options: typings.firebaseAdmin.messagingMod.admin.messaging.MessagingOptions
  ): js.Promise[typings.firebaseAdmin.messagingMod.admin.messaging.MessagingTopicResponse] = js.native
  /**
    * Subscribes a device to an FCM topic.
    *
    * See [Subscribe to a
    * topic](/docs/cloud-messaging/manage-topics#suscribe_and_unsubscribe_using_the)
    * for code samples and detailed documentation. Optionally, you can provide an
    * array of tokens to subscribe multiple devices.
    *
    * @param registrationTokens A token or array of registration tokens
    *   for the devices to subscribe to the topic.
    * @param topic The topic to which to subscribe.
    *
    * @return A promise fulfilled with the server's response after the device has been
    *   subscribed to the topic.
    */
  def subscribeToTopic(registrationTokens: String, topic: String): js.Promise[
    typings.firebaseAdmin.messagingMod.admin.messaging.MessagingTopicManagementResponse
  ] = js.native
  def subscribeToTopic(registrationTokens: js.Array[String], topic: String): js.Promise[
    typings.firebaseAdmin.messagingMod.admin.messaging.MessagingTopicManagementResponse
  ] = js.native
  /**
    * Unsubscribes a device from an FCM topic.
    *
    * See [Unsubscribe from a
    * topic](/docs/cloud-messaging/admin/manage-topic-subscriptions#unsubscribe_from_a_topic)
    * for code samples and detailed documentation.  Optionally, you can provide an
    * array of tokens to unsubscribe multiple devices.
    *
    * @param registrationTokens A device registration token or an array of
    *   device registration tokens to unsubscribe from the topic.
    * @param topic The topic from which to unsubscribe.
    *
    * @return A promise fulfilled with the server's response after the device has been
    *   unsubscribed from the topic.
    */
  def unsubscribeFromTopic(registrationTokens: String, topic: String): js.Promise[
    typings.firebaseAdmin.messagingMod.admin.messaging.MessagingTopicManagementResponse
  ] = js.native
  def unsubscribeFromTopic(registrationTokens: js.Array[String], topic: String): js.Promise[
    typings.firebaseAdmin.messagingMod.admin.messaging.MessagingTopicManagementResponse
  ] = js.native
}

