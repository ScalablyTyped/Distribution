package typings.enigmaJs

import typings.enigmaJs.anon.Api
import typings.enigmaJs.enigmaJsStrings.changed
import typings.enigmaJs.enigmaJsStrings.closed
import typings.enigmaJs.enigmaJsStrings.opened
import typings.enigmaJs.enigmaJsStrings.resumed
import typings.enigmaJs.enigmaJsStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enigmaJS {
  
  /**
    * This section describes the configuration object that is sent into enigma.create(config).
    */
  trait IConfig extends StObject {
    
    /**
      * ES6-compatible Promise library.
      */
    var Promise: js.UndefOr[Any] = js.undefined
    
    /**
      * A function to use when instantiating the WebSocket, mandatory for Node.js.
      */
    var createSocket: js.UndefOr[Any] = js.undefined
    
    /**
      * Mixins to extend/augment the QIX Engine API.
      * See Mixins section for more information how each entry in this array should look like.
      * Mixins are applied in the array order.
      */
    var mixins: js.UndefOr[js.Array[IMixin]] = js.undefined
    
    /**
      * An object containing additional JSON-RPC request parameters.
      * protocol.delta :  Set to false to disable the use of the bandwidth-reducing delta protocol.
      */
    var protocol: js.UndefOr[Any] = js.undefined
    
    /**
      * Interceptors for augmenting requests before they are sent to QIX Engine.
      * See Interceptors section for more information how each entry in this array should look like.
      * Interceptors are applied in the array order.
      */
    var requestInterceptors: js.UndefOr[js.Array[IRequestInterceptors]] = js.undefined
    
    /**
      * Interceptors for augmenting responses before they are sent to QIX Engine.
      * See Interceptors section for more information how each entry in this array should look like.
      * Interceptors are applied in the array order.
      */
    var responseInterceptors: js.UndefOr[js.Array[IResponseInterceptors]] = js.undefined
    
    /**
      * Object containing the specification for the API to generate. Corresponds to a specific version of the QIX Engine API.
      */
    var schema: js.Object
    
    /**
      * Set to true if the session should be suspended instead of closed when the websocket is closed.
      */
    var suspendOnClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String containing a proper websocket URL to QIX Engine.
      */
    var url: String
  }
  object IConfig {
    
    inline def apply(schema: js.Object, url: String): IConfig = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      inline def setCreateSocket(value: Any): Self = StObject.set(x, "createSocket", value.asInstanceOf[js.Any])
      
      inline def setCreateSocketUndefined: Self = StObject.set(x, "createSocket", js.undefined)
      
      inline def setMixins(value: js.Array[IMixin]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: IMixin*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setPromise(value: Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setProtocol(value: Any): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequestInterceptors(value: js.Array[IRequestInterceptors]): Self = StObject.set(x, "requestInterceptors", value.asInstanceOf[js.Any])
      
      inline def setRequestInterceptorsUndefined: Self = StObject.set(x, "requestInterceptors", js.undefined)
      
      inline def setRequestInterceptorsVarargs(value: IRequestInterceptors*): Self = StObject.set(x, "requestInterceptors", js.Array(value*))
      
      inline def setResponseInterceptors(value: js.Array[IResponseInterceptors]): Self = StObject.set(x, "responseInterceptors", value.asInstanceOf[js.Any])
      
      inline def setResponseInterceptorsUndefined: Self = StObject.set(x, "responseInterceptors", js.undefined)
      
      inline def setResponseInterceptorsVarargs(value: IResponseInterceptors*): Self = StObject.set(x, "responseInterceptors", js.Array(value*))
      
      inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSuspendOnClose(value: Boolean): Self = StObject.set(x, "suspendOnClose", value.asInstanceOf[js.Any])
      
      inline def setSuspendOnCloseUndefined: Self = StObject.set(x, "suspendOnClose", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGeneratedAPI extends StObject {
    
    /**
      * manual emit an events
      * @param event - event that occures
      */
    def emit(event: changed | closed): Unit
    
    /**
      * Despite the name, this property corresponds to the qInfo.qType property on your generic object's properties object.
      */
    var genericType: String
    
    /**
      * This property contains the handle QIX Engine assigned to the API.
      * Used internally in enigma.js for caches and JSON-RPC
      */
    var handle: Double
    
    /**
      * This property contains the unique identifier for this API.
      */
    var id: String
    
    /**
      * register a function for events
      * @param event - function called if this event occures
      * @param func - function that is called
      */
    def on(event: changed | closed, func: js.Function0[Unit]): Unit
    
    /**
      * This property contains a reference to the session that this API belongs to.
      */
    var session: ISession
    
    /**
      * This property contains the schema class name for this API.
      */
    var `type`: String
  }
  object IGeneratedAPI {
    
    inline def apply(
      emit: changed | closed => Unit,
      genericType: String,
      handle: Double,
      id: String,
      on: (changed | closed, js.Function0[Unit]) => Unit,
      session: ISession,
      `type`: String
    ): IGeneratedAPI = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), genericType = genericType.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), session = session.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeneratedAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGeneratedAPI] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: changed | closed => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setGenericType(value: String): Self = StObject.set(x, "genericType", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (changed | closed, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMixin extends StObject {
    
    /**
      * mixin.extend is an object containing methods to extend the generated API with. These method names cannot already exist or enigma.js will throw an error.
      */
    var extend: js.UndefOr[Any] = js.undefined
    
    def init(args: Api): Unit
    
    /**
      * mixin.override is an object containing methods that overrides existing API methods.
      * These method names needs to exist already* or engima.js will throw an error.
      * Be careful when overriding, you may break expected behaviors in other mixins or your application.
      * base is a reference to the previous mixin method, can be used to invoke the mixin chain before this mixin method.
      */
    var `override`: js.UndefOr[Any] = js.undefined
    
    /**
      * QIX Engine types like for example GenericObject, Doc, GenericBookmark, are supported but also custom GenericObject
      * types such as barchart, story and myCustomType.
      * An API will get both their generic type as well as custom type mixins applied.
      */
    var types: js.Array[MixinType]
  }
  object IMixin {
    
    inline def apply(init: Api => Unit, types: js.Array[MixinType]): IMixin = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMixin] (val x: Self) extends AnyVal {
      
      inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setInit(value: Api => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setOverride(value: Any): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setTypes(value: js.Array[MixinType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: MixinType*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait IProtocol extends StObject {
    
    // Set to false to disable the use of the bandwidth-reducing delta protocol.
    var delta: js.UndefOr[Boolean] = js.undefined
  }
  object IProtocol {
    
    inline def apply(): IProtocol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProtocol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProtocol] (val x: Self) extends AnyVal {
      
      inline def setDelta(value: Boolean): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    }
  }
  
  trait IRequestInterceptors extends StObject {
    
    /**
      * This method is invoked when a request is about to be sent to QIX Engine.
      * @param session refers to the session executing the interceptor.
      * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
      * @returns request the new request
      */
    var onFulfilled: js.UndefOr[js.Function3[/* session */ ISession, /* request */ Any, /* result */ Any, Any]] = js.undefined
  }
  object IRequestInterceptors {
    
    inline def apply(): IRequestInterceptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestInterceptors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRequestInterceptors] (val x: Self) extends AnyVal {
      
      inline def setOnFulfilled(value: (/* session */ ISession, /* request */ Any, /* result */ Any) => Any): Self = StObject.set(x, "onFulfilled", js.Any.fromFunction3(value))
      
      inline def setOnFulfilledUndefined: Self = StObject.set(x, "onFulfilled", js.undefined)
    }
  }
  
  trait IResponseInterceptors extends StObject {
    
    /**
      * This method is invoked when a promise has been successfully resolved, use this to modify the result or reject the promise chain before it is sent to mixins.
      * @param session refers to the session executing the interceptor.
      * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
      * @param error is whatever the previous interceptor resolved with.
      */
    var onFulfilled: js.UndefOr[
        js.Function3[/* session */ ISession, /* request */ Any, /* result */ Any, js.Promise[Any]]
      ] = js.undefined
    
    /**
      * This method is invoked when a previous interceptor has rejected the promise, use this to handle for example errors before they are sent into mixins.
      * @param session refers to the session executing the interceptor.
      * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
      * @param error is whatever the previous interceptor rejected with.
      */
    var onRejected: js.UndefOr[
        js.Function3[/* session */ ISession, /* request */ Any, /* error */ Any, js.Promise[Any]]
      ] = js.undefined
  }
  object IResponseInterceptors {
    
    inline def apply(): IResponseInterceptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResponseInterceptors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResponseInterceptors] (val x: Self) extends AnyVal {
      
      inline def setOnFulfilled(value: (/* session */ ISession, /* request */ Any, /* result */ Any) => js.Promise[Any]): Self = StObject.set(x, "onFulfilled", js.Any.fromFunction3(value))
      
      inline def setOnFulfilledUndefined: Self = StObject.set(x, "onFulfilled", js.undefined)
      
      inline def setOnRejected(value: (/* session */ ISession, /* request */ Any, /* error */ Any) => js.Promise[Any]): Self = StObject.set(x, "onRejected", js.Any.fromFunction3(value))
      
      inline def setOnRejectedUndefined: Self = StObject.set(x, "onRejected", js.undefined)
    }
  }
  
  @js.native
  trait ISession extends StObject {
    
    /**
      * Closes the websocket and cleans up internal caches, also triggers the closed event on all generated APIs.
      * Eventually resolved when the websocket has been closed.
      *
      * Note: you need to manually invoke this when you want to close a session and config.suspendOnClose is true.
      * @return Promise.
      */
    def close(): js.Promise[Any] = js.native
    
    def on(event: opened | closed | suspended | resumed, func: Any): Unit = js.native
    /**
      * Handle opened state. This event is triggered whenever the websocket is connected and ready for communication.
      *
      * Handle closed state. This event is triggered when the underlying websocket is closed and config.suspendOnClose is false.
      *
      * Handle suspended state. This event is triggered in two cases (listed below). It is useful in scenarios where you for example
      * want to block interaction in your application until you are resumed again.
      * If config.suspendOnClose is true and there was a network disconnect (socked closed)
      * If you ran session.suspend()
      * The evt.initiator value is a string indicating what triggered the suspended state. Possible values: network, manual.
      *
      * Handle resumed state. This event is triggered when the session was properly resumed.
      * It is useful in scenarios where you for example can close blocking modal dialogs and allow the user to interact with your application again.
      *
      * notification:*
      * @param event - Event that triggers the function
      * @param func - Called function
      */
    def on(event: String, func: Any): Unit = js.native
    
    /**
      * Establishes the websocket against the configured URL. Eventually resolved with the QIX global interface when the connection has been established.
      * @return Promise.
      */
    def open[T /* <: IGeneratedAPI */](): js.Promise[T] = js.native
    
    /**
      * Resume a previously suspended enigma.js session by re-creating the websocket and, if possible, re-open the document
      * as well as refreshing the internal caches. If successful, changed events will be triggered on all generated APIs,
      * and on the ones it was unable to restore, the closed event will be triggered.
      * @param onlyIfAttached onlyIfAttached can be used to only allow resuming if the QIX Engine session was reattached properly.
      * @return Promise.
      * Note: Eventually resolved when the websocket (and potentially the previously opened document, and generated APIs) has been restored,
      * rejected when it fails any of those steps, or when onlyIfAttached is true and a new QIX Engine session was created.
      */
    def resume(): js.Promise[Any] = js.native
    def resume(onlyIfAttached: Boolean): js.Promise[Any] = js.native
    
    /**
      * Suspends the enigma.js session by closing the websocket and rejecting all method calls until it has been resumed again.
      * @return Promise.
      */
    def suspend(): js.Promise[Any] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.enigmaJs.enigmaJsStrings.Doc
    - typings.enigmaJs.enigmaJsStrings.GenericObject
    - typings.enigmaJs.enigmaJsStrings.GenericBookmark
    - java.lang.String
  */
  type MixinType = _MixinType | String
  
  trait _MixinType extends StObject
}
