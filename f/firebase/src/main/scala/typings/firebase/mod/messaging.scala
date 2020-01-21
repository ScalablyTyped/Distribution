package typings.firebase.mod

import typings.firebase.mod.app.App
import typings.std.Error
import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @webonly
  */
@JSImport("firebase", "messaging")
@js.native
object messaging extends js.Object {
  /**
    * The Firebase Messaging service interface.
    *
    * Do not call this constructor directly. Instead, use
    * {@link firebase.messaging `firebase.messaging()`}.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/cloud-messaging/js/client
    *   Set Up a JavaScript Firebase Cloud Messaging Client App}
    * for a full guide on how to use the Firebase Messaging service.
    *
    */
  @js.native
  trait Messaging extends js.Object {
    /**
      * To forcibly stop a registration token from being used, delete it
      * by calling this method.
      *
      * @param token The token to delete.
      * @return The promise resolves when the token has been
      *   successfully deleted.
      */
    def deleteToken(token: String): js.Promise[Boolean] = js.native
    /**
      * Subscribes the user to push notifications and returns an FCM registration
      * token that can be used to send push messages to the user.
      *
      * If notification permission isn't already granted, this method asks the
      * user for permission. The returned promise rejects if the user does not
      * allow the app to show notifications.
      *
      * @return The promise resolves with the FCM token string.
      */
    def getToken(): js.Promise[String] = js.native
    /**
      * When a push message is received and the user is currently on a page
      * for your origin, the message is passed to the page and an `onMessage()`
      * event is dispatched with the payload of the push message.
      *
      * NOTE: These events are dispatched when you have called
      * `setBackgroundMessageHandler()` in your service worker.
      *
      * @param
      *     nextOrObserver This function, or observer object with `next` defined,
      *     is called when a message is received and the user is currently viewing your page.
      * @return To stop listening for messages
      *    execute this returned function.
      */
    def onMessage(nextOrObserver: NextFn[_]): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[_], error: ErrorFn[Error]): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[_], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error], error: ErrorFn[Error]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    /**
      * You should listen for token refreshes so your web app knows when FCM
      * has invalidated your existing token and you need to call `getToken()`
      * to get a new token.
      *
      * @param
      *     nextOrObserver This function, or observer object with `next` defined,
      *     is called when a token refresh has occurred.
      * @return To stop listening for token
      *   refresh events execute this returned function.
      */
    def onTokenRefresh(nextOrObserver: NextFn[_]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn[Error]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error], error: ErrorFn[Error]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    /**
      * Notification permissions are required to send a user push messages.
      * Calling this method displays the permission dialog to the user and
      * resolves if the permission is granted. It is not necessary to call this
      * method, as `getToken()` will do this automatically if required.
      *
      * @return The promise resolves if permission is
      *   granted. Otherwise, the promise is rejected with an error.
      *
      * @deprecated Use Notification.requestPermission() instead.
      * https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission
      */
    def requestPermission(): js.Promise[Unit] = js.native
    /**
      * FCM directs push messages to your web page's `onMessage()` callback
      * if the user currently has it open. Otherwise, it calls
      * your callback passed into `setBackgroundMessageHandler()`.
      *
      * Your callback should return a promise that, once resolved, has
      * shown a notification.
      *
      * @param callback The function to handle the push message.
      */
    def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | Unit]): Unit = js.native
    def usePublicVapidKey(b64PublicKey: String): Unit = js.native
    /**
      * To use your own service worker for receiving push messages, you
      * can pass in your service worker registration in this method.
      *
      * @param registration The service worker
      *   registration you wish to use for push messaging.
      */
    def useServiceWorker(registration: ServiceWorkerRegistration): Unit = js.native
  }
  
  /**
    * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
    * default app or a given app.
    *
    * `firebase.messaging()` can be called with no arguments to access the default
    * app's {@link firebase.messaging.Messaging `Messaging`} service or as
    * `firebase.messaging(app)` to access the
    * {@link firebase.messaging.Messaging `Messaging`} service associated with a
    * specific app.
    *
    * Calling `firebase.messaging()` in a service worker results in Firebase
    * generating notifications if the push message payload has a `notification`
    * parameter.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Messaging service for the default app
    * var defaultMessaging = firebase.messaging();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Messaging service for a given app
    * var otherMessaging = firebase.messaging(otherApp);
    * ```
    *
    * @namespace
    * @param app The app to create a Messaging service for.
    *     If not passed, uses the default app.
    */
  def apply(): Messaging = js.native
  def apply(app: App): Messaging = js.native
  def isSupported(): Boolean = js.native
}

