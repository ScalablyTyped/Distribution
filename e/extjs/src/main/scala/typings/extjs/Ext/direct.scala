package typings.extjs.Ext

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direct {
  
  trait IEvent
    extends StObject
       with IBase {
    
    /** [Method] Return the raw data for this event
      * @returns Mixed The data from the event
      */
    var getData: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Return the name for this event
      * @returns String The name of event
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  }
  object IEvent {
    
    inline def apply(): IEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      inline def setGetData(value: () => Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      inline def setGetName(value: () => java.lang.String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    }
  }
  
  type IExceptionEvent = IRemotingEvent
  
  trait IJsonProvider
    extends StObject
       with IProvider {
    
    /** [Method] Create an event from a response object
      * @param response Object Response object
      * @returns Ext.direct.Event The event
      */
    var createEvent: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], IEvent]] = js.undefined
    
    /** [Method] Creates a set of events based on the XHR response
      * @param response Object The XHR response
      * @returns Ext.direct.Event[] An array of Ext.direct.Event
      */
    var createEvents: js.UndefOr[js.Function1[/* response */ js.UndefOr[Any], Array]] = js.undefined
  }
  object IJsonProvider {
    
    inline def apply(): IJsonProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJsonProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJsonProvider] (val x: Self) extends AnyVal {
      
      inline def setCreateEvent(value: /* response */ js.UndefOr[Any] => IEvent): Self = StObject.set(x, "createEvent", js.Any.fromFunction1(value))
      
      inline def setCreateEventUndefined: Self = StObject.set(x, "createEvent", js.undefined)
      
      inline def setCreateEvents(value: /* response */ js.UndefOr[Any] => Array): Self = StObject.set(x, "createEvents", js.Any.fromFunction1(value))
      
      inline def setCreateEventsUndefined: Self = StObject.set(x, "createEvents", js.undefined)
    }
  }
  
  trait IManager
    extends StObject
       with IObservable
  object IManager {
    
    inline def apply(): IManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IManager]
    }
  }
  
  trait IPollingProvider
    extends StObject
       with IJsonProvider {
    
    /** [Config Option] (Object) */
    var baseParams: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String/Function) */
    var url: js.UndefOr[Any] = js.undefined
  }
  object IPollingProvider {
    
    inline def apply(): IPollingProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPollingProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPollingProvider] (val x: Self) extends AnyVal {
      
      inline def setBaseParams(value: Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
      
      inline def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait IProvider
    extends StObject
       with IObservable {
    
    /** [Method] Abstract method for subclasses to implement  */
    var connect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Abstract method for subclasses to implement  */
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var id: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns whether or not the server side is currently connected  */
    var isConnected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String[]) */
    var relayedEvents: js.UndefOr[Array] = js.undefined
  }
  object IProvider {
    
    inline def apply(): IProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProvider] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsConnected(value: () => Unit): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      inline def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
      
      inline def setRelayedEvents(value: Array): Self = StObject.set(x, "relayedEvents", value.asInstanceOf[js.Any])
      
      inline def setRelayedEventsUndefined: Self = StObject.set(x, "relayedEvents", js.undefined)
    }
  }
  
  trait IRemotingEvent
    extends StObject
       with IEvent {
    
    /** [Method] Get the transaction associated with this event
      * @returns Ext.direct.Transaction The transaction
      */
    var getTransaction: js.UndefOr[js.Function0[ITransaction]] = js.undefined
  }
  object IRemotingEvent {
    
    inline def apply(): IRemotingEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRemotingEvent] (val x: Self) extends AnyVal {
      
      inline def setGetTransaction(value: () => ITransaction): Self = StObject.set(x, "getTransaction", js.Any.fromFunction0(value))
      
      inline def setGetTransactionUndefined: Self = StObject.set(x, "getTransaction", js.undefined)
    }
  }
  
  trait IRemotingMethod
    extends StObject
       with IBase {
    
    /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
      * @param args Array The arguments passed to the direct call
      * @returns Object An object with 3 properties: args, callback &amp; scope.
      */
    var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Any]] = js.undefined
  }
  object IRemotingMethod {
    
    inline def apply(): IRemotingMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRemotingMethod] (val x: Self) extends AnyVal {
      
      inline def setGetCallData(value: /* args */ js.UndefOr[Array] => Any): Self = StObject.set(x, "getCallData", js.Any.fromFunction1(value))
      
      inline def setGetCallDataUndefined: Self = StObject.set(x, "getCallData", js.undefined)
    }
  }
  
  trait IRemotingProvider
    extends StObject
       with IJsonProvider {
    
    /** [Config Option] (Object) */
    var actions: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var disableNestedActions: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number/Boolean) */
    var enableBuffer: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var enableUrlEncode: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String/Object) */
    var namespace: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  object IRemotingProvider {
    
    inline def apply(): IRemotingProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRemotingProvider] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setDisableNestedActions(value: Boolean): Self = StObject.set(x, "disableNestedActions", value.asInstanceOf[js.Any])
      
      inline def setDisableNestedActionsUndefined: Self = StObject.set(x, "disableNestedActions", js.undefined)
      
      inline def setEnableBuffer(value: Any): Self = StObject.set(x, "enableBuffer", value.asInstanceOf[js.Any])
      
      inline def setEnableBufferUndefined: Self = StObject.set(x, "enableBuffer", js.undefined)
      
      inline def setEnableUrlEncode(value: java.lang.String): Self = StObject.set(x, "enableUrlEncode", value.asInstanceOf[js.Any])
      
      inline def setEnableUrlEncodeUndefined: Self = StObject.set(x, "enableUrlEncode", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setNamespace(value: Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ITransaction
    extends StObject
       with IBase {
    
    /** [Config Option] (Ext.direct.Provider) */
    var provider: js.UndefOr[IProvider] = js.undefined
  }
  object ITransaction {
    
    inline def apply(): ITransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITransaction] (val x: Self) extends AnyVal {
      
      inline def setProvider(value: IProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  trait Manager extends StObject
}
