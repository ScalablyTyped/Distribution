package typings.firebaseMessaging

import typings.firebaseMessaging.firebaseMessagingStrings.notificationclick
import typings.firebaseMessaging.firebaseMessagingStrings.push
import typings.firebaseMessaging.firebaseMessagingStrings.pushsubscriptionchange
import typings.std.AddEventListenerOptions
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerGlobalScope extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, js.Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(`type`: push, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, js.Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushsubscriptionchange(
    `type`: pushsubscriptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushsubscriptionchange(
    `type`: pushsubscriptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, js.Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushsubscriptionchange(
    `type`: pushsubscriptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val clients: Clients = js.native
  
  val location: WorkerLocation = js.native
  
  val registration: ServiceWorkerRegistration = js.native
}
