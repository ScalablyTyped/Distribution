package typings
package firebaseLib.firebaseMod.firebaseNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends js.Object {
  def deleteToken(token: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getToken(): js.Promise[java.lang.String | scala.Null] = js.native
  def onMessage(nextOrObserver: firebaseLib.firebaseMod.firebaseNs.NextFn[_]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.NextFn[_],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.NextFn[_],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error],
    completed: firebaseLib.firebaseMod.firebaseNs.CompleteFn
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onMessage(nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onMessage(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error],
    completed: firebaseLib.firebaseMod.firebaseNs.CompleteFn
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: firebaseLib.firebaseMod.firebaseNs.NextFn[_]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.NextFn[_],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.NextFn[_],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error],
    completed: firebaseLib.firebaseMod.firebaseNs.CompleteFn
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onTokenRefresh(nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error]): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error]
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def onTokenRefresh(
    nextOrObserver: firebaseLib.firebaseMod.firebaseNs.Observer[_, nodeLib.Error],
    error: firebaseLib.firebaseMod.firebaseNs.ErrorFn[nodeLib.Error],
    completed: firebaseLib.firebaseMod.firebaseNs.CompleteFn
  ): firebaseLib.firebaseMod.firebaseNs.Unsubscribe = js.native
  def requestPermission(): js.Promise[scala.Unit] = js.native
  def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | scala.Unit]): scala.Unit = js.native
  def usePublicVapidKey(b64PublicKey: java.lang.String): scala.Unit = js.native
  def useServiceWorker(registration: stdLib.ServiceWorkerRegistration): scala.Unit = js.native
}

