package typings.firebaseMessaging

import typings.firebaseMessaging.firebaseMessagingStrings.notificationclick
import typings.firebaseMessaging.firebaseMessagingStrings.push
import typings.firebaseMessaging.firebaseMessagingStrings.pushsubscriptionchange
import typings.std.AddEventListenerOptions
import typings.std.Blob
import typings.std.ClientTypes
import typings.std.Event
import typings.std.Notification
import typings.std.PushSubscription
import typings.std.ServiceWorkerRegistration
import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swTypesMod {
  
  @js.native
  trait Client extends StObject {
    
    val id: String = js.native
    
    def postMessage(message: Any): Unit = js.native
    def postMessage(message: Any, transfer: js.Array[Transferable]): Unit = js.native
    
    val `type`: ClientTypes = js.native
    
    val url: String = js.native
  }
  
  trait ClientQueryOptions extends StObject {
    
    var includeReserved: js.UndefOr[Boolean] = js.undefined
    
    var includeUncontrolled: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[ClientTypes] = js.undefined
  }
  object ClientQueryOptions {
    
    inline def apply(): ClientQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientQueryOptions]
    }
    
    extension [Self <: ClientQueryOptions](x: Self) {
      
      inline def setIncludeReserved(value: Boolean): Self = StObject.set(x, "includeReserved", value.asInstanceOf[js.Any])
      
      inline def setIncludeReservedUndefined: Self = StObject.set(x, "includeReserved", js.undefined)
      
      inline def setIncludeUncontrolled(value: Boolean): Self = StObject.set(x, "includeUncontrolled", value.asInstanceOf[js.Any])
      
      inline def setIncludeUncontrolledUndefined: Self = StObject.set(x, "includeUncontrolled", js.undefined)
      
      inline def setType(value: ClientTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Clients extends StObject {
    
    def claim(): js.Promise[Unit] = js.native
    
    def get(id: String): js.Promise[Any] = js.native
    
    def matchAll(): js.Promise[js.Array[Client]] = js.native
    def matchAll(options: ClientQueryOptions): js.Promise[js.Array[Client]] = js.native
    
    def openWindow(url: String): js.Promise[WindowClient | Null] = js.native
  }
  
  @js.native
  trait ExtendableEvent
    extends StObject
       with Event {
    
    def waitUntil(f: js.Promise[Any]): Unit = js.native
  }
  
  @js.native
  trait NotificationEvent
    extends StObject
       with ExtendableEvent {
    
    val action: String = js.native
    
    val notification: Notification = js.native
  }
  
  @js.native
  trait PushEvent
    extends StObject
       with ExtendableEvent {
    
    val data: PushMessageData | Null = js.native
  }
  
  trait PushMessageData extends StObject {
    
    def arrayBuffer(): js.typedarray.ArrayBuffer
    
    def blob(): Blob
    
    def json(): Any
    
    def text(): String
  }
  object PushMessageData {
    
    inline def apply(
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      blob: () => Blob,
      json: () => Any,
      text: () => String
    ): PushMessageData = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[PushMessageData]
    }
    
    extension [Self <: PushMessageData](x: Self) {
      
      inline def setArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => Blob): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setJson(value: () => Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PushSubscriptionChangeEvent
    extends StObject
       with ExtendableEvent {
    
    val newSubscription: PushSubscription | Null = js.native
    
    val oldSubscription: PushSubscription | Null = js.native
  }
  
  @js.native
  trait ServiceWorkerGlobalScope extends StObject {
    
    @JSName("addEventListener")
    def addEventListener_notificationclick(
      `type`: notificationclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_notificationclick(
      `type`: notificationclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_notificationclick(
      `type`: notificationclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_push(`type`: push, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_push(
      `type`: push,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_push(
      `type`: push,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pushsubscriptionchange(
      `type`: pushsubscriptionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pushsubscriptionchange(
      `type`: pushsubscriptionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, Any],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pushsubscriptionchange(
      `type`: pushsubscriptionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    val clients: Clients = js.native
    
    val location: WorkerLocation = js.native
    
    val registration: ServiceWorkerRegistration = js.native
  }
  
  trait ServiceWorkerGlobalScopeEventMap extends StObject {
    
    var notificationclick: NotificationEvent
    
    var push: PushEvent
    
    var pushsubscriptionchange: PushSubscriptionChangeEvent
  }
  object ServiceWorkerGlobalScopeEventMap {
    
    inline def apply(
      notificationclick: NotificationEvent,
      push: PushEvent,
      pushsubscriptionchange: PushSubscriptionChangeEvent
    ): ServiceWorkerGlobalScopeEventMap = {
      val __obj = js.Dynamic.literal(notificationclick = notificationclick.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], pushsubscriptionchange = pushsubscriptionchange.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceWorkerGlobalScopeEventMap]
    }
    
    extension [Self <: ServiceWorkerGlobalScopeEventMap](x: Self) {
      
      inline def setNotificationclick(value: NotificationEvent): Self = StObject.set(x, "notificationclick", value.asInstanceOf[js.Any])
      
      inline def setPush(value: PushEvent): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushsubscriptionchange(value: PushSubscriptionChangeEvent): Self = StObject.set(x, "pushsubscriptionchange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WindowClient
    extends StObject
       with Client {
    
    def focus(): js.Promise[WindowClient] = js.native
    
    val focused: Boolean = js.native
    
    def navigate(url: String): js.Promise[WindowClient] = js.native
    
    val visibilityState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any = js.native
  }
  
  trait WorkerLocation extends StObject {
    
    val hash: String
    
    val host: String
    
    val hostname: String
    
    val href: String
    
    val origin: String
    
    val pathname: String
    
    val port: String
    
    val protocol: String
    
    val search: String
  }
  object WorkerLocation {
    
    inline def apply(
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      pathname: String,
      port: String,
      protocol: String,
      search: String
    ): WorkerLocation = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerLocation]
    }
    
    extension [Self <: WorkerLocation](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
