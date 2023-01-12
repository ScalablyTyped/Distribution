package typings.dispatchr

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.dispatchr.anon.ActionName
import typings.dispatchr.anon.FnCall
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dispatchr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDispatcher(options: DispatcherOption): Dispatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatcher")(options.asInstanceOf[js.Any]).asInstanceOf[Dispatcher]
  
  @js.native
  trait Dispatcher extends StObject {
    
    def createContext(context: js.Object): DispatcherContext = js.native
    
    def getStoreName(store: String): String = js.native
    def getStoreName(store: StoreClass): String = js.native
    
    def isRegistered(store: String): Boolean = js.native
    def isRegistered(store: StoreClass): Boolean = js.native
    
    def registerStore(store: StoreClass): Unit = js.native
  }
  
  @js.native
  trait DispatcherContext extends StObject {
    
    def dehydrate(): DispatcherState = js.native
    
    def dispatch(actionName: String, payload: Any): Unit = js.native
    
    var dispatcherInterface: DispatcherInterface = js.native
    
    def getStore(name: String): Store[js.Object] = js.native
    def getStore[T /* <: StoreClass */](name: T): T = js.native
    
    def rehydrate(dispatcherState: DispatcherState): Unit = js.native
    
    def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait DispatcherError extends StObject {
    
    var message: String
    
    var meta: ActionName
    
    var `type`: String
  }
  object DispatcherError {
    
    inline def apply(message: String, meta: ActionName, `type`: String): DispatcherError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatcherError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DispatcherError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: ActionName): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DispatcherInterface extends StObject {
    
    def getContext(): DispatcherContext
    
    def getStore(name: String): Store[js.Object]
    def getStore[T /* <: StoreClass */](name: T): T
    @JSName("getStore")
    var getStore_Original: FnCall
    
    def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit
    @JSName("waitFor")
    var waitFor_Original: js.Function2[/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit], Unit]
  }
  object DispatcherInterface {
    
    inline def apply(
      getContext: () => DispatcherContext,
      getStore: FnCall,
      waitFor: (/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit]) => Unit
    ): DispatcherInterface = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getStore = getStore.asInstanceOf[js.Any], waitFor = js.Any.fromFunction2(waitFor))
      __obj.asInstanceOf[DispatcherInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DispatcherInterface] (val x: Self) extends AnyVal {
      
      inline def setGetContext(value: () => DispatcherContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
      
      inline def setGetStore(value: FnCall): Self = StObject.set(x, "getStore", value.asInstanceOf[js.Any])
      
      inline def setWaitFor(value: (/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction2(value))
    }
  }
  
  trait DispatcherOption extends StObject {
    
    var errorHandler: js.UndefOr[js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, Unit]] = js.undefined
    
    var stores: js.UndefOr[js.Array[StoreClass]] = js.undefined
  }
  object DispatcherOption {
    
    inline def apply(): DispatcherOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DispatcherOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DispatcherOption] (val x: Self) extends AnyVal {
      
      inline def setErrorHandler(value: (/* e */ DispatcherError, /* context */ DispatcherContext) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setStores(value: js.Array[StoreClass]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      inline def setStoresVarargs(value: StoreClass*): Self = StObject.set(x, "stores", js.Array(value*))
    }
  }
  
  trait DispatcherState extends StObject {
    
    var stores: StringDictionary[Any]
  }
  object DispatcherState {
    
    inline def apply(stores: StringDictionary[Any]): DispatcherState = {
      val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatcherState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DispatcherState] (val x: Self) extends AnyVal {
      
      inline def setStores(value: StringDictionary[Any]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Store[S] extends EventEmitter {
    
    var dehydrate: js.UndefOr[js.Function0[S]] = js.native
    
    def emitChange(): Unit = js.native
    
    var rehydrate: js.UndefOr[js.Function1[/* state */ S, Unit]] = js.native
    
    var shouldDehydrate: js.UndefOr[js.Function0[Boolean]] = js.native
  }
  
  @js.native
  trait StoreClass
    extends StObject
       with Instantiable0[Store[js.Object]] {
    
    var storeName: String = js.native
  }
}
