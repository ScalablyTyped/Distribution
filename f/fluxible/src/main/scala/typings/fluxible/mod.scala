package typings.fluxible

import org.scalablytyped.runtime.Instantiable1
import typings.dispatchr.mod.Dispatcher
import typings.dispatchr.mod.DispatcherInterface
import typings.dispatchr.mod.StoreClass
import typings.fluxible.addonsBaseStoreMod.^
import typings.fluxible.anon.Create
import typings.fluxible.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible", "ActionContext")
  @js.native
  open class ActionContext () extends StObject {
    
    /**
      * Dispatches a payload to all registered callbacks.
      * @param action Action name
      * @param payload
      */
    def dispatch(action: String): Unit = js.native
    def dispatch(action: String, payload: Any): Unit = js.native
    
    /**
      * Proxy function to execute action
      * @param action function that will be executed
      * @param payload
      * @param callback
      */
    def executeAction(
      action: js.Function3[
          /* context */ this.type, 
          /* params */ js.Object, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
    ): Unit = js.native
    def executeAction(
      action: js.Function3[
          /* context */ this.type, 
          /* params */ js.Object, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ],
      payload: Any
    ): Unit = js.native
    def executeAction(
      action: js.Function3[
          /* context */ this.type, 
          /* params */ js.Object, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ],
      payload: Any,
      callback: Any
    ): Unit = js.native
    def executeAction(
      action: js.Function3[
          /* context */ this.type, 
          /* params */ js.Object, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ],
      payload: Unit,
      callback: Any
    ): Unit = js.native
    
    /**
      * Getter for store from dispatcher
      */
    def getStore[T /* <: ^[js.Object] */](store: Instantiable[T]): T = js.native
    
    /**
      * Data service. available only if fetch plugin is added
      */
    var service: js.UndefOr[Create] = js.native
  }
  
  @JSImport("fluxible", "ComponentContext")
  @js.native
  open class ComponentContext () extends StObject {
    
    /**
      * Proxy function to execute action
      * @param action function that will be executed
      * @param payload
      * @param callback
      */
    def executeAction(
      action: js.Function3[
          /* context */ ActionContext, 
          /* params */ js.Object, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
    ): Unit = js.native
    def executeAction(
      action: js.Function3[
          /* context */ ActionContext, 
          /* params */ js.Object, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ],
      payload: Any
    ): Unit = js.native
    
    /**
      * Getter for store from dispatcher
      */
    def getStore[T /* <: ^[js.Object] */](store: Instantiable[T]): T = js.native
  }
  
  @JSImport("fluxible", "Fluxible")
  @js.native
  /**
    * @param [options]
    * @example
    *      var app = new Fluxible({
    *          component: require('./components/App.jsx')
    *      });
    */
  open class Fluxible () extends StObject {
    def this(options: FluxibleConfiguration) = this()
    
    /**
      * Creates an isolated context for a request/session
      * @param [contextOptions] The options object.  Please refer to FluxibleContext's constructor
      *         doc for supported subfields and detailed description.
      */
    def createContext(): FluxibleContext = js.native
    def createContext(contextOptions: Any): FluxibleContext = js.native
    
    /**
      * Creates a new dispatcher instance using the application's dispatchr class. Used by
      * FluxibleContext to create new dispatcher instance
      * @param contextOptions The context options to be provided to each store instance
      */
    def createDispatcherInstance(): Dispatcher = js.native
    def createDispatcherInstance(contextOptions: Any): Dispatcher = js.native
    
    /**
      * Creates a serializable state of the application and a given context for sending to the client
      * @param context
      */
    def dehydrate(): Any = js.native
    def dehydrate(context: FluxibleContext): Any = js.native
    
    /**
      * Getter for the top level react component for the application
      */
    def getComponent(): Any = js.native
    
    /**
      * Provides access to a plugin instance by name
      * @param pluginName The plugin name
      */
    def getPlugin(pluginName: String): Any = js.native
    
    /**
      * Provides plugin mechanism for adding application level settings that are persisted
      * between server/client and also modification of the FluxibleContext
      * @param plugin
      * @param plugin.name Name of the plugin
      * @param plugin.plugContext Method called after context is created to allow
      *  dynamically plugging the context
      * @param [plugin.dehydrate] Method called to serialize the plugin settings to be persisted
      *  to the client
      * @param [plugin.rehydrate] Method called to rehydrate the plugin settings from the server
      */
    def plug(plugin: Any): Unit = js.native
    
    def registerStore(store: Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]): Unit = js.native
    /**
      * Registers a store to the dispatcher so it can listen for actions
      */
    def registerStore(store: StoreClass): Unit = js.native
    
    /**
      * Rehydrates the application and creates a new context with the state from the server
      * @param obj Raw object of dehydrated state
      * @param obj.plugins Dehydrated app plugin state
      * @param obj.context Dehydrated context state. See FluxibleContext's
      *                 rehydrate() for subfields in this object.
      * @param callback
      * @async Rehydration may require more asset loading or async IO calls
      */
    def rehydrate(state: Any): Unit = js.native
    def rehydrate(state: Any, callback: js.Function2[/* err */ js.Error, /* context */ FluxibleContext, Unit]): Unit = js.native
  }
  
  @JSImport("fluxible", "FluxibleContext")
  @js.native
  /**
    * @param options The options sharable by the context and context plugins
    */
  open class FluxibleContext () extends StObject {
    def this(options: FluxibleConfiguration) = this()
    
    /**
      * Returns a serializable context state
      */
    def dehydrate(): Any = js.native
    
    /**
      * Returns the context for action controllers
      * @return Action context information
      */
    def getActionContext(): ActionContext = js.native
    
    /**
      * Returns the context for action controllers
      * @return Component context information
      */
    def getComponentContext(): ComponentContext = js.native
    
    /**
      * Getter for store from dispatcher
      */
    def getStore[T /* <: ^[js.Object] */](store: Instantiable[T]): T = js.native
    
    /**
      * Returns the context for stores
      * @return Store context information
      */
    def getStoreContext(): StoreContext = js.native
    
    /**
      * Provides plugin mechanism for adding application level settings that are persisted
      * between server/client and also modification of the FluxibleContext
      */
    def plug(plugin: Any): Unit = js.native
    
    /**
      * Rehydrates the context state
      */
    def rehydrate(state: Any): Unit = js.native
  }
  
  @JSImport("fluxible", "StoreContext")
  @js.native
  open class StoreContext () extends StObject
  
  trait FluxibleConfiguration extends StObject {
    
    /**
      * Stores your top level React component for access using `getComponent()`
      */
    var component: Any
    
    /**
      * App level component action handler
      */
    var componentActionHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object FluxibleConfiguration {
    
    inline def apply(component: Any): FluxibleConfiguration = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxibleConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluxibleConfiguration] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentActionHandler(value: () => Unit): Self = StObject.set(x, "componentActionHandler", js.Any.fromFunction0(value))
      
      inline def setComponentActionHandlerUndefined: Self = StObject.set(x, "componentActionHandler", js.undefined)
    }
  }
}
