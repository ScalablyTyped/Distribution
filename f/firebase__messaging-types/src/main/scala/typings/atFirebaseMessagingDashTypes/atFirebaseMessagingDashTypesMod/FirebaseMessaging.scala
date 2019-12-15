package typings.atFirebaseMessagingDashTypes.atFirebaseMessagingDashTypesMod

import typings.atFirebaseUtil.distSrcSubscribeMod.CompleteFn
import typings.atFirebaseUtil.distSrcSubscribeMod.ErrorFn
import typings.atFirebaseUtil.distSrcSubscribeMod.NextFn
import typings.atFirebaseUtil.distSrcSubscribeMod.Observer
import typings.atFirebaseUtil.distSrcSubscribeMod.Unsubscribe
import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging-types", "FirebaseMessaging")
@js.native
class FirebaseMessaging protected () extends js.Object {
  def deleteToken(token: String): js.Promise[Boolean] = js.native
  def getToken(): js.Promise[String] = js.native
  def onMessage(nextOrObserver: NextFn[_]): Unsubscribe = js.native
  def onMessage(nextOrObserver: NextFn[_], error: ErrorFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: NextFn[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_]): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_], error: ErrorFn): Unsubscribe = js.native
  def onMessage(nextOrObserver: Observer[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: NextFn[_]): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_]): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_], error: ErrorFn): Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: Observer[_], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
  /**
    * @deprecated Use Notification.requestPermission() instead.
    * https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission
    */
  def requestPermission(): js.Promise[Unit] = js.native
  def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | Unit]): Unit = js.native
  def usePublicVapidKey(b64PublicKey: String): Unit = js.native
  def useServiceWorker(registration: ServiceWorkerRegistration): Unit = js.native
}

