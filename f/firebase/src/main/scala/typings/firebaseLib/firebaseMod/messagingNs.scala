package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @webonly
  */
@JSImport("firebase", "messaging")
@js.native
object messagingNs extends js.Object {
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
      * To forceably stop a registration token from being used, delete it
      * by calling this method.
      *
      * @param token The token to delete.
      * @return The promise resolves when the token has been
      *   successfully deleted.
      */
    def deleteToken(token: java.lang.String): js.Promise[scala.Boolean] = js.native
    /**
      * After calling `requestPermission()` you can call this method to get an FCM
      * registration token that can be used to send push messages to this user.
      *
      * @return The promise resolves if an FCM token can
      *   be retrieved. This method returns null if the current origin does not have
      *   permission to show notifications.
      */
    def getToken(): js.Promise[java.lang.String | scala.Null] = js.native
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
    def onMessage(nextOrObserver: firebaseLib.firebaseMod.NextFn[_]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onMessage(
      nextOrObserver: firebaseLib.firebaseMod.NextFn[_],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onMessage(
      nextOrObserver: firebaseLib.firebaseMod.NextFn[_],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error],
      completed: firebaseLib.firebaseMod.CompleteFn
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onMessage(nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onMessage(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onMessage(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error],
      completed: firebaseLib.firebaseMod.CompleteFn
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
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
    def onTokenRefresh(nextOrObserver: firebaseLib.firebaseMod.NextFn[_]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onTokenRefresh(
      nextOrObserver: firebaseLib.firebaseMod.NextFn[_],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onTokenRefresh(
      nextOrObserver: firebaseLib.firebaseMod.NextFn[_],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error],
      completed: firebaseLib.firebaseMod.CompleteFn
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error]): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onTokenRefresh(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error]
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    def onTokenRefresh(
      nextOrObserver: firebaseLib.firebaseMod.Observer[_, stdLib.Error],
      error: firebaseLib.firebaseMod.ErrorFn[stdLib.Error],
      completed: firebaseLib.firebaseMod.CompleteFn
    ): firebaseLib.firebaseMod.Unsubscribe = js.native
    /**
      * Notification permissions are required to send a user push messages.
      * Calling this method displays the permission dialog to the user and
      * resolves if the permission is granted.
      *
      * @return The promise resolves if permission is
      *   granted. Otherwise, the promise is rejected with an error.
      */
    def requestPermission(): js.Promise[scala.Unit] = js.native
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
    def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | scala.Unit]): scala.Unit = js.native
    def usePublicVapidKey(b64PublicKey: java.lang.String): scala.Unit = js.native
    /**
      * To use your own service worker for receiving push messages, you
      * can pass in your service worker registration in this method.
      *
      * @param registration The service worker
      *   registration you wish to use for push messaging.
      */
    def useServiceWorker(registration: stdLib.ServiceWorkerRegistration): scala.Unit = js.native
  }
  
  def isSupported(): scala.Boolean = js.native
}

