package typings.elasticTransport

import org.scalablytyped.runtime.Instantiable1
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestParams
import typings.elasticTransport.libConnectionMod.BaseConnection
import typings.elasticTransport.libConnectionMod.Connection
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ALIVE extends StObject {
    
    var ALIVE: String
    
    var DEAD: String
  }
  object ALIVE {
    
    inline def apply(ALIVE: String, DEAD: String): ALIVE = {
      val __obj = js.Dynamic.literal(ALIVE = ALIVE.asInstanceOf[js.Any], DEAD = DEAD.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALIVE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ALIVE] (val x: Self) extends AnyVal {
      
      inline def setALIVE(value: String): Self = StObject.set(x, "ALIVE", value.asInstanceOf[js.Any])
      
      inline def setDEAD(value: String): Self = StObject.set(x, "DEAD", value.asInstanceOf[js.Any])
    }
  }
  
  trait Aborted[TContext] extends StObject {
    
    var aborted: Boolean
    
    var attempts: Double
    
    var connection: Connection | Null
    
    var context: TContext
    
    var name: String | js.Symbol
    
    var request: Options
    
    var sniff: js.UndefOr[Hosts] = js.undefined
  }
  object Aborted {
    
    inline def apply[TContext](aborted: Boolean, attempts: Double, context: TContext, name: String | js.Symbol, request: Options): Aborted[TContext] = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], connection = null)
      __obj.asInstanceOf[Aborted[TContext]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aborted[?], TContext] (val x: Self & Aborted[TContext]) extends AnyVal {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionNull: Self = StObject.set(x, "connection", null)
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setName(value: String | js.Symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSniff(value: Hosts): Self = StObject.set(x, "sniff", value.asInstanceOf[js.Any])
      
      inline def setSniffUndefined: Self = StObject.set(x, "sniff", js.undefined)
    }
  }
  
  trait Accept extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var jsonContentType: js.UndefOr[String] = js.undefined
    
    var ndjsonContentType: js.UndefOr[String] = js.undefined
  }
  object Accept {
    
    inline def apply(): Accept = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accept]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setJsonContentType(value: String): Self = StObject.set(x, "jsonContentType", value.asInstanceOf[js.Any])
      
      inline def setJsonContentTypeUndefined: Self = StObject.set(x, "jsonContentType", js.undefined)
      
      inline def setNdjsonContentType(value: String): Self = StObject.set(x, "ndjsonContentType", value.asInstanceOf[js.Any])
      
      inline def setNdjsonContentTypeUndefined: Self = StObject.set(x, "ndjsonContentType", js.undefined)
    }
  }
  
  trait Apikey extends StObject {
    
    var api_key: String
    
    var id: String
  }
  object Apikey {
    
    inline def apply(api_key: String, id: String): Apikey = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Apikey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Apikey] (val x: Self) extends AnyVal {
      
      inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConstructorAction extends StObject {
    
    var constructorAction: String
    
    var protoAction: String
  }
  object ConstructorAction {
    
    inline def apply(constructorAction: String, protoAction: String): ConstructorAction = {
      val __obj = js.Dynamic.literal(constructorAction = constructorAction.asInstanceOf[js.Any], protoAction = protoAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorAction] (val x: Self) extends AnyVal {
      
      inline def setConstructorAction(value: String): Self = StObject.set(x, "constructorAction", value.asInstanceOf[js.Any])
      
      inline def setProtoAction(value: String): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
    }
  }
  
  trait DEFAULT extends StObject {
    
    var DEFAULT: String
    
    var SNIFF_INTERVAL: String
    
    var SNIFF_ON_CONNECTION_FAULT: String
    
    var SNIFF_ON_START: String
  }
  object DEFAULT {
    
    inline def apply(DEFAULT: String, SNIFF_INTERVAL: String, SNIFF_ON_CONNECTION_FAULT: String, SNIFF_ON_START: String): DEFAULT = {
      val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], SNIFF_INTERVAL = SNIFF_INTERVAL.asInstanceOf[js.Any], SNIFF_ON_CONNECTION_FAULT = SNIFF_ON_CONNECTION_FAULT.asInstanceOf[js.Any], SNIFF_ON_START = SNIFF_ON_START.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEFAULT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DEFAULT] (val x: Self) extends AnyVal {
      
      inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      inline def setSNIFF_INTERVAL(value: String): Self = StObject.set(x, "SNIFF_INTERVAL", value.asInstanceOf[js.Any])
      
      inline def setSNIFF_ON_CONNECTION_FAULT(value: String): Self = StObject.set(x, "SNIFF_ON_CONNECTION_FAULT", value.asInstanceOf[js.Any])
      
      inline def setSNIFF_ON_START(value: String): Self = StObject.set(x, "SNIFF_ON_START", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(options: String): ClientRequest = js.native
    def apply(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(options: RequestOptions): ClientRequest = js.native
    def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(options: URL): ClientRequest = js.native
    def apply(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(url: String, options: RequestOptions): ClientRequest = js.native
    def apply(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(url: URL, options: RequestOptions): ClientRequest = js.native
    def apply(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  }
  
  @js.native
  trait FnCallUrlOptionsCallback extends StObject {
    
    def apply(options: String): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(
      options: String,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(options: URL): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(
      options: URL,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(url: String, options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(
      url: String,
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(url: URL, options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def apply(
      url: URL,
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
  }
  
  trait Hosts extends StObject {
    
    var hosts: js.Array[Any]
    
    var reason: String
  }
  object Hosts {
    
    inline def apply(hosts: js.Array[Any], reason: String): Hosts = {
      val __obj = js.Dynamic.literal(hosts = hosts.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hosts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hosts] (val x: Self) extends AnyVal {
      
      inline def setHosts(value: js.Array[Any]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsVarargs(value: Any*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait None extends StObject {
    
    var none: Double
    
    var optimistic: Double
    
    var ping: Double
  }
  object None {
    
    inline def apply(none: Double, optimistic: Double, ping: Double): None = {
      val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any])
      __obj.asInstanceOf[None]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: None] (val x: Self) extends AnyVal {
      
      inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setOptimistic(value: Double): Self = StObject.set(x, "optimistic", value.asInstanceOf[js.Any])
      
      inline def setPing(value: Double): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var id: Any
    
    var options: TransportRequestOptions
    
    var params: ConnectionRequestParams
  }
  object Options {
    
    inline def apply(id: Any, options: TransportRequestOptions, params: ConnectionRequestParams): Options = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: TransportRequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParams(value: ConnectionRequestParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBaseConnection
    extends StObject
       with Instantiable1[/* opts */ ConnectionOptions, BaseConnection] {
    
    var statuses: ALIVE = js.native
  }
}
