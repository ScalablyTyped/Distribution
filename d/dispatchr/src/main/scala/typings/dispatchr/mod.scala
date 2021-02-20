package typings.dispatchr

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.dispatchr.anon.ActionName
import typings.dispatchr.anon.FnCall
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dispatchr", "createDispatcher")
  @js.native
  def createDispatcher(options: DispatcherOption): Dispatcher = js.native
  
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
    
    def dispatch(actionName: String, payload: js.Any): Unit = js.native
    
    var dispatcherInterface: DispatcherInterface = js.native
    
    def getStore(name: String): Store[js.Object] = js.native
    def getStore[T /* <: StoreClass */](name: T): T = js.native
    
    def rehydrate(dispatcherState: DispatcherState): Unit = js.native
    
    def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait DispatcherError extends StObject {
    
    var message: String = js.native
    
    var meta: ActionName = js.native
    
    var `type`: String = js.native
  }
  object DispatcherError {
    
    @scala.inline
    def apply(message: String, meta: ActionName, `type`: String): DispatcherError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatcherError]
    }
    
    @scala.inline
    implicit class DispatcherErrorMutableBuilder[Self <: DispatcherError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: ActionName): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DispatcherInterface extends StObject {
    
    def getContext(): DispatcherContext = js.native
    
    def getStore(name: String): Store[js.Object] = js.native
    def getStore[T /* <: StoreClass */](name: T): T = js.native
    @JSName("getStore")
    var getStore_Original: FnCall = js.native
    
    def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
    @JSName("waitFor")
    var waitFor_Original: js.Function2[/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit], Unit] = js.native
  }
  
  @js.native
  trait DispatcherOption extends StObject {
    
    var errorHandler: js.UndefOr[js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, Unit]] = js.native
    
    var stores: js.UndefOr[js.Array[StoreClass]] = js.native
  }
  object DispatcherOption {
    
    @scala.inline
    def apply(): DispatcherOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DispatcherOption]
    }
    
    @scala.inline
    implicit class DispatcherOptionMutableBuilder[Self <: DispatcherOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorHandler(value: (/* e */ DispatcherError, /* context */ DispatcherContext) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setStores(value: js.Array[StoreClass]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      @scala.inline
      def setStoresVarargs(value: StoreClass*): Self = StObject.set(x, "stores", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DispatcherState extends StObject {
    
    var stores: StringDictionary[js.Any] = js.native
  }
  object DispatcherState {
    
    @scala.inline
    def apply(stores: StringDictionary[js.Any]): DispatcherState = {
      val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatcherState]
    }
    
    @scala.inline
    implicit class DispatcherStateMutableBuilder[Self <: DispatcherState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStores(value: StringDictionary[js.Any]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
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
    extends Instantiable0[Store[js.Object]] {
    
    var storeName: String = js.native
  }
}
