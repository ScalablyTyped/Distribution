package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libMessagingMessagingApiMod.BatchResponse
import typings.firebaseAdmin.libMessagingMessagingApiMod.Message
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingConditionResponse
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingDeviceGroupResponse
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingDevicesResponse
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingOptions
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingPayload
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingTopicManagementResponse
import typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingTopicResponse
import typings.firebaseAdmin.libMessagingMessagingApiMod.MulticastMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMessagingMod {
  
  @JSImport("firebase-admin/lib/messaging/messaging", "Messaging")
  @js.native
  open class Messaging () extends StObject {
    
    /**
      * The {@link firebase-admin.app#App} associated with the current `Messaging` service
      * instance.
      *
      * @example
      * ```javascript
      * var app = messaging.app;
      * ```
      */
    def app: App = js.native
    
    /* private */ val appInternal: Any = js.native
    
    /* private */ var getUrlPath: Any = js.native
    
    /* private */ val messagingRequestHandler: Any = js.native
    
    /**
      * Normalizes the provided topic name by prepending it with '/topics/', if necessary.
      *
      * @param topic - The topic name to normalize.
      *
      * @returns The normalized topic name.
      */
    /* private */ var normalizeTopic: Any = js.native
    
    /**
      * Sends the given message via FCM.
      *
      * @param message - The message payload.
      * @param dryRun - Whether to send the message in the dry-run
      *   (validation only) mode.
      * @returns A promise fulfilled with a unique message ID
      *   string after the message has been successfully handed off to the FCM
      *   service for delivery.
      */
    def send(message: Message): js.Promise[String] = js.native
    def send(message: Message, dryRun: Boolean): js.Promise[String] = js.native
    
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
      * @param messages - A non-empty array
      *   containing up to 500 messages.
      * @param dryRun - Whether to send the messages in the dry-run
      *   (validation only) mode.
      * @returns A Promise fulfilled with an object representing the result of the
      *   send operation.
      */
    def sendAll(messages: js.Array[Message]): js.Promise[BatchResponse] = js.native
    def sendAll(messages: js.Array[Message], dryRun: Boolean): js.Promise[BatchResponse] = js.native
    
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
      * @param message - A multicast message
      *   containing up to 500 tokens.
      * @param dryRun - Whether to send the message in the dry-run
      *   (validation only) mode.
      * @returns A Promise fulfilled with an object representing the result of the
      *   send operation.
      */
    def sendMulticast(message: MulticastMessage): js.Promise[BatchResponse] = js.native
    def sendMulticast(message: MulticastMessage, dryRun: Boolean): js.Promise[BatchResponse] = js.native
    
    /**
      * Sends an FCM message to a condition.
      *
      * See {@link https://firebase.google.com/docs/cloud-messaging/admin/legacy-fcm#send_to_a_condition |
      * Send to a condition}
      * for code samples and detailed documentation.
      *
      * @param condition - The condition determining to which topics to send
      *   the message.
      * @param payload - The message payload.
      * @param options - Optional options to
      *   alter the message.
      *
      * @returns A promise fulfilled with the server's response after the message
      *   has been sent.
      */
    def sendToCondition(condition: String, payload: MessagingPayload): js.Promise[MessagingConditionResponse] = js.native
    def sendToCondition(condition: String, payload: MessagingPayload, options: MessagingOptions): js.Promise[MessagingConditionResponse] = js.native
    
    /**
      * Sends an FCM message to a single device corresponding to the provided
      * registration token.
      *
      * See {@link https://firebase.google.com/docs/cloud-messaging/admin/legacy-fcm#send_to_individual_devices |
      * Send to individual devices}
      * for code samples and detailed documentation. Takes either a
      * `registrationToken` to send to a single device or a
      * `registrationTokens` parameter containing an array of tokens to send
      * to multiple devices.
      *
      * @param registrationToken - A device registration token or an array of
      *   device registration tokens to which the message should be sent.
      * @param payload - The message payload.
      * @param options - Optional options to
      *   alter the message.
      *
      * @returns A promise fulfilled with the server's response after the message
      *   has been sent.
      */
    def sendToDevice(registrationTokenOrTokens: String, payload: MessagingPayload): js.Promise[MessagingDevicesResponse] = js.native
    def sendToDevice(registrationTokenOrTokens: String, payload: MessagingPayload, options: MessagingOptions): js.Promise[MessagingDevicesResponse] = js.native
    def sendToDevice(registrationTokenOrTokens: js.Array[String], payload: MessagingPayload): js.Promise[MessagingDevicesResponse] = js.native
    def sendToDevice(registrationTokenOrTokens: js.Array[String], payload: MessagingPayload, options: MessagingOptions): js.Promise[MessagingDevicesResponse] = js.native
    
    /**
      * Sends an FCM message to a device group corresponding to the provided
      * notification key.
      *
      * See {@link https://firebase.google.com/docs/cloud-messaging/admin/legacy-fcm#send_to_a_device_group |
      * Send to a device group} for code samples and detailed documentation.
      *
      * @param notificationKey - The notification key for the device group to
      *   which to send the message.
      * @param payload - The message payload.
      * @param options - Optional options to
      *   alter the message.
      *
      * @returns A promise fulfilled with the server's response after the message
      *   has been sent.
      */
    def sendToDeviceGroup(notificationKey: String, payload: MessagingPayload): js.Promise[MessagingDeviceGroupResponse] = js.native
    def sendToDeviceGroup(notificationKey: String, payload: MessagingPayload, options: MessagingOptions): js.Promise[MessagingDeviceGroupResponse] = js.native
    
    /**
      * Sends an FCM message to a topic.
      *
      * See {@link https://firebase.google.com/docs/cloud-messaging/admin/legacy-fcm#send_to_a_topic |
      * Send to a topic} for code samples and detailed documentation.
      *
      * @param topic - The topic to which to send the message.
      * @param payload - The message payload.
      * @param options - Optional options to
      *   alter the message.
      *
      * @returns A promise fulfilled with the server's response after the message
      *   has been sent.
      */
    def sendToTopic(topic: String, payload: MessagingPayload): js.Promise[MessagingTopicResponse] = js.native
    def sendToTopic(topic: String, payload: MessagingPayload, options: MessagingOptions): js.Promise[MessagingTopicResponse] = js.native
    
    /**
      * Helper method which sends and handles topic subscription management requests.
      *
      * @param registrationTokenOrTokens - The registration token or an array of
      *     registration tokens to unsubscribe from the topic.
      * @param topic - The topic to which to subscribe.
      * @param methodName - The name of the original method called.
      * @param path - The endpoint path to use for the request.
      *
      * @returns A Promise fulfilled with the parsed server
      *   response.
      */
    /* private */ var sendTopicManagementRequest: Any = js.native
    
    /**
      * Subscribes a device to an FCM topic.
      *
      * See {@link https://firebase.google.com/docs/cloud-messaging/manage-topics#suscribe_and_unsubscribe_using_the |
      * Subscribe to a topic}
      * for code samples and detailed documentation. Optionally, you can provide an
      * array of tokens to subscribe multiple devices.
      *
      * @param registrationTokens - A token or array of registration tokens
      *   for the devices to subscribe to the topic.
      * @param topic - The topic to which to subscribe.
      *
      * @returns A promise fulfilled with the server's response after the device has been
      *   subscribed to the topic.
      */
    def subscribeToTopic(registrationTokenOrTokens: String, topic: String): js.Promise[MessagingTopicManagementResponse] = js.native
    def subscribeToTopic(registrationTokenOrTokens: js.Array[String], topic: String): js.Promise[MessagingTopicManagementResponse] = js.native
    
    /**
      * Unsubscribes a device from an FCM topic.
      *
      * See {@link https://firebase.google.com/docs/cloud-messaging/admin/manage-topic-subscriptions#unsubscribe_from_a_topic |
      * Unsubscribe from a topic}
      * for code samples and detailed documentation.  Optionally, you can provide an
      * array of tokens to unsubscribe multiple devices.
      *
      * @param registrationTokens - A device registration token or an array of
      *   device registration tokens to unsubscribe from the topic.
      * @param topic - The topic from which to unsubscribe.
      *
      * @returns A promise fulfilled with the server's response after the device has been
      *   unsubscribed from the topic.
      */
    def unsubscribeFromTopic(registrationTokenOrTokens: String, topic: String): js.Promise[MessagingTopicManagementResponse] = js.native
    def unsubscribeFromTopic(registrationTokenOrTokens: js.Array[String], topic: String): js.Promise[MessagingTopicManagementResponse] = js.native
    
    /* private */ var urlPath: Any = js.native
    
    /**
      * Validates the messaging options. If invalid, an error will be thrown.
      *
      * @param options - The messaging options to validate.
      *
      * @returns A copy of the provided options with whitelisted properties switched
      *   from camelCase to underscore_case.
      */
    /* private */ var validateMessagingOptions: Any = js.native
    
    /**
      * Validates the messaging payload. If invalid, an error will be thrown.
      *
      * @param payload - The messaging payload to validate.
      *
      * @returns A copy of the provided payload with whitelisted properties switched
      *     from camelCase to underscore_case.
      */
    /* private */ var validateMessagingPayload: Any = js.native
    
    /**
      * Validates the types of the messaging payload and options. If invalid, an error will be thrown.
      *
      * @param payload - The messaging payload to validate.
      * @param options - The messaging options to validate.
      */
    /* private */ var validateMessagingPayloadAndOptionsTypes: Any = js.native
    
    /**
      * Validates the provided registration tokens. If invalid, an error will be thrown.
      *
      * @param registrationTokenOrTokens - The registration token or an array of
      *     registration tokens to validate.
      * @param method - The method name to use in error messages.
      * @param errorInfo - The error info to use if the registration tokens are invalid.
      */
    /* private */ var validateRegistrationTokens: Any = js.native
    
    /**
      * Validates the type of the provided registration token(s). If invalid, an error will be thrown.
      *
      * @param registrationTokenOrTokens - The registration token(s) to validate.
      * @param method - The method name to use in error messages.
      * @param errorInfo - The error info to use if the registration tokens are invalid.
      */
    /* private */ var validateRegistrationTokensType: Any = js.native
    
    /**
      * Validates the provided topic. If invalid, an error will be thrown.
      *
      * @param topic - The topic to validate.
      * @param method - The method name to use in error messages.
      * @param errorInfo - The error info to use if the topic is invalid.
      */
    /* private */ var validateTopic: Any = js.native
    
    /**
      * Validates the type of the provided topic. If invalid, an error will be thrown.
      *
      * @param topic - The topic to validate.
      * @param method - The method name to use in error messages.
      * @param errorInfo - The error info to use if the topic is invalid.
      */
    /* private */ var validateTopicType: Any = js.native
  }
}
