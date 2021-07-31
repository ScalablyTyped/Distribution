package typings.fluxxor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.eventemitter3.mod.EventEmitter
import typings.fluxxor.anon.TypeofReact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxxor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fluxxor", "Dispatcher")
  @js.native
  class Dispatcher protected () extends StObject {
    def this(stores: js.Any) = this()
    
    def addStore(name: String, store: Store): Unit = js.native
    
    def dispatch(action: js.Function): Unit = js.native
    
    def doDispatchLoop(action: js.Function): Unit = js.native
    
    def waitForStores(store: Store, stores: js.Array[String], fn: js.Function): Unit = js.native
  }
  
  @JSImport("fluxxor", "Flux")
  @js.native
  class Flux protected ()
    extends StObject
       with EventEmitter[String | js.Symbol, js.Any] {
    def this(stores: js.Any, actions: js.Any) = this()
    
    var actions: js.Any = js.native
    
    def addAction(args: (String | js.Function)*): Unit = js.native
    def addAction(names: js.Array[String], action: js.Function): Unit = js.native
    
    def addActions(actions: js.Any): Unit = js.native
    
    def addStore(name: String, store: Store): Unit = js.native
    
    def addStores(stores: js.Any): Unit = js.native
    
    def store(name: String): js.Any = js.native
    
    var stores: js.Any = js.native
  }
  
  trait FluxChildMixin extends StObject {
    
    def getFlux(): Flux
  }
  object FluxChildMixin {
    
    @JSImport("fluxxor", "FluxChildMixin")
    @js.native
    def apply(react: TypeofReact): FluxChildMixin = js.native
    
    @scala.inline
    implicit class FluxChildMixinMutableBuilder[Self <: FluxChildMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFlux(value: () => Flux): Self = StObject.set(x, "getFlux", js.Any.fromFunction0(value))
    }
  }
  
  trait FluxMixin extends StObject {
    
    def getFlux(): Flux
  }
  object FluxMixin {
    
    @JSImport("fluxxor", "FluxMixin")
    @js.native
    def apply(react: TypeofReact): FluxMixin = js.native
    
    @scala.inline
    implicit class FluxMixinMutableBuilder[Self <: FluxMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFlux(value: () => Flux): Self = StObject.set(x, "getFlux", js.Any.fromFunction0(value))
    }
  }
  
  trait StoreWatchMixin[StoreState] extends StObject {
    
    def getStateFromFlux(): StoreState
  }
  object StoreWatchMixin {
    
    @JSImport("fluxxor", "StoreWatchMixin")
    @js.native
    def apply[StoreState](storeNames: String*): StoreWatchMixin[StoreState] = js.native
    
    @scala.inline
    implicit class StoreWatchMixinMutableBuilder[Self <: StoreWatchMixin[?], StoreState] (val x: Self & StoreWatchMixin[StoreState]) extends AnyVal {
      
      @scala.inline
      def setGetStateFromFlux(value: () => StoreState): Self = StObject.set(x, "getStateFromFlux", js.Any.fromFunction0(value))
    }
  }
  
  @scala.inline
  def createStore(spec: StoreSpec): StoreClass = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(spec.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
  
  @JSImport("fluxxor", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait Context extends StObject {
    
    var flux: Flux
  }
  object Context {
    
    @scala.inline
    def apply(flux: Flux): Context = {
      val __obj = js.Dynamic.literal(flux = flux.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlux(value: Flux): Self = StObject.set(x, "flux", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Store
    extends StObject
       with EventEmitter[String | js.Symbol, js.Any] {
    
    def bindActions(args: (String | js.Function)*): Unit = js.native
    def bindActions(args: js.Array[String | js.Function]): Unit = js.native
    
    def waitFor(stores: js.Array[String], fn: js.Function): Unit = js.native
  }
  
  @js.native
  trait StoreClass
    extends StObject
       with Instantiable0[js.Any]
       with Instantiable1[/* options */ js.Object, js.Any]
  
  trait StoreSpec extends StObject {
    
    var actions: js.UndefOr[js.Any] = js.undefined
    
    var initialize: js.UndefOr[
        js.Function2[/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object], Unit]
      ] = js.undefined
  }
  object StoreSpec {
    
    @scala.inline
    def apply(): StoreSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreSpec]
    }
    
    @scala.inline
    implicit class StoreSpecMutableBuilder[Self <: StoreSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setInitialize(value: (/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    }
  }
}
