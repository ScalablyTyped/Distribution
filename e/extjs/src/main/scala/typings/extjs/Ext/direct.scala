package typings.extjs.Ext

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direct {
  
  @js.native
  trait IEvent extends IBase {
    
    /** [Method] Return the raw data for this event
      * @returns Mixed The data from the event
      */
    var getData: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Return the name for this event
      * @returns String The name of event
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.native
  }
  object IEvent {
    
    @scala.inline
    def apply(): IEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetData(value: () => _): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      @scala.inline
      def setGetName(value: () => java.lang.String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    }
  }
  
  type IExceptionEvent = IRemotingEvent
  
  @js.native
  trait IJsonProvider extends IProvider {
    
    /** [Method] Create an event from a response object
      * @param response Object Response object
      * @returns Ext.direct.Event The event
      */
    var createEvent: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IEvent]] = js.native
    
    /** [Method] Creates a set of events based on the XHR response
      * @param response Object The XHR response
      * @returns Ext.direct.Event[] An array of Ext.direct.Event
      */
    var createEvents: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], Array]] = js.native
  }
  object IJsonProvider {
    
    @scala.inline
    def apply(): IJsonProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJsonProvider]
    }
    
    @scala.inline
    implicit class IJsonProviderMutableBuilder[Self <: IJsonProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateEvent(value: /* response */ js.UndefOr[js.Any] => IEvent): Self = StObject.set(x, "createEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateEventUndefined: Self = StObject.set(x, "createEvent", js.undefined)
      
      @scala.inline
      def setCreateEvents(value: /* response */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "createEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateEventsUndefined: Self = StObject.set(x, "createEvents", js.undefined)
    }
  }
  
  @js.native
  trait IManager extends IObservable
  object IManager {
    
    @scala.inline
    def apply(): IManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IManager]
    }
  }
  
  @js.native
  trait IPollingProvider extends IJsonProvider {
    
    /** [Config Option] (Object) */
    var baseParams: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var interval: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String/Function) */
    var url: js.UndefOr[js.Any] = js.native
  }
  object IPollingProvider {
    
    @scala.inline
    def apply(): IPollingProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPollingProvider]
    }
    
    @scala.inline
    implicit class IPollingProviderMutableBuilder[Self <: IPollingProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseParams(value: js.Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait IProvider extends IObservable {
    
    /** [Method] Abstract method for subclasses to implement  */
    var connect: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Abstract method for subclasses to implement  */
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var id: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Returns whether or not the server side is currently connected  */
    var isConnected: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String[]) */
    var relayedEvents: js.UndefOr[Array] = js.native
  }
  object IProvider {
    
    @scala.inline
    def apply(): IProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProvider]
    }
    
    @scala.inline
    implicit class IProviderMutableBuilder[Self <: IProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      @scala.inline
      def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsConnected(value: () => Unit): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
      
      @scala.inline
      def setRelayedEvents(value: Array): Self = StObject.set(x, "relayedEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelayedEventsUndefined: Self = StObject.set(x, "relayedEvents", js.undefined)
    }
  }
  
  @js.native
  trait IRemotingEvent extends IEvent {
    
    /** [Method] Get the transaction associated with this event
      * @returns Ext.direct.Transaction The transaction
      */
    var getTransaction: js.UndefOr[js.Function0[ITransaction]] = js.native
  }
  object IRemotingEvent {
    
    @scala.inline
    def apply(): IRemotingEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingEvent]
    }
    
    @scala.inline
    implicit class IRemotingEventMutableBuilder[Self <: IRemotingEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTransaction(value: () => ITransaction): Self = StObject.set(x, "getTransaction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTransactionUndefined: Self = StObject.set(x, "getTransaction", js.undefined)
    }
  }
  
  @js.native
  trait IRemotingMethod extends IBase {
    
    /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
      * @param args Array The arguments passed to the direct call
      * @returns Object An object with 3 properties: args, callback &amp; scope.
      */
    var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], _]] = js.native
  }
  object IRemotingMethod {
    
    @scala.inline
    def apply(): IRemotingMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingMethod]
    }
    
    @scala.inline
    implicit class IRemotingMethodMutableBuilder[Self <: IRemotingMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCallData(value: /* args */ js.UndefOr[Array] => _): Self = StObject.set(x, "getCallData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCallDataUndefined: Self = StObject.set(x, "getCallData", js.undefined)
    }
  }
  
  @js.native
  trait IRemotingProvider extends IJsonProvider {
    
    /** [Config Option] (Object) */
    var actions: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var disableNestedActions: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number/Boolean) */
    var enableBuffer: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var enableUrlEncode: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var maxRetries: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String/Object) */
    var namespace: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var timeout: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String) */
    var url: js.UndefOr[java.lang.String] = js.native
  }
  object IRemotingProvider {
    
    @scala.inline
    def apply(): IRemotingProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingProvider]
    }
    
    @scala.inline
    implicit class IRemotingProviderMutableBuilder[Self <: IRemotingProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setDisableNestedActions(value: Boolean): Self = StObject.set(x, "disableNestedActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNestedActionsUndefined: Self = StObject.set(x, "disableNestedActions", js.undefined)
      
      @scala.inline
      def setEnableBuffer(value: js.Any): Self = StObject.set(x, "enableBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBufferUndefined: Self = StObject.set(x, "enableBuffer", js.undefined)
      
      @scala.inline
      def setEnableUrlEncode(value: java.lang.String): Self = StObject.set(x, "enableUrlEncode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUrlEncodeUndefined: Self = StObject.set(x, "enableUrlEncode", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setNamespace(value: js.Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait ITransaction extends IBase {
    
    /** [Config Option] (Ext.direct.Provider) */
    var provider: js.UndefOr[IProvider] = js.native
  }
  object ITransaction {
    
    @scala.inline
    def apply(): ITransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransaction]
    }
    
    @scala.inline
    implicit class ITransactionMutableBuilder[Self <: ITransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: IProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  @js.native
  trait Manager extends StObject
}
