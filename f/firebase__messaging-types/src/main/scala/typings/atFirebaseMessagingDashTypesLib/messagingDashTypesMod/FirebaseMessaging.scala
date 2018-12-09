package typings
package atFirebaseMessagingDashTypesLib.messagingDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging-types", "FirebaseMessaging")
@js.native
class FirebaseMessaging protected () extends js.Object {
  def deleteToken(token: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getToken(): js.Promise[java.lang.String | scala.Null] = js.native
  def onMessage(nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.NextFn[_]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.NextFn[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.NextFn[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn,
    completed: atFirebaseUtilLib.distSrcSubscribeMod.CompleteFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onMessage(nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn,
    completed: atFirebaseUtilLib.distSrcSubscribeMod.CompleteFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.NextFn[_]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.NextFn[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.NextFn[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn,
    completed: atFirebaseUtilLib.distSrcSubscribeMod.CompleteFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_]): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: atFirebaseUtilLib.distSrcSubscribeMod.Observer[_],
    error: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn,
    completed: atFirebaseUtilLib.distSrcSubscribeMod.CompleteFn
  ): atFirebaseUtilLib.distSrcSubscribeMod.Unsubscribe = js.native
  def requestPermission(): js.Promise[scala.Unit] = js.native
  def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | scala.Unit]): scala.Unit = js.native
  def usePublicVapidKey(b64PublicKey: java.lang.String): scala.Unit = js.native
  def useServiceWorker(registration: stdLib.ServiceWorkerRegistration): scala.Unit = js.native
}

