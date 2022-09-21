package typings.fluxxor

import typings.fluxxor.anon.TypeofReact
import typings.fluxxor.mod.StoreClass
import typings.fluxxor.mod.StoreSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Fluxxor {
    
    @JSGlobal("Fluxxor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Fluxxor.Dispatcher")
    @js.native
    open class Dispatcher protected ()
      extends typings.fluxxor.mod.Dispatcher {
      def this(stores: Any) = this()
    }
    
    @JSGlobal("Fluxxor.Flux")
    @js.native
    open class Flux protected ()
      extends typings.fluxxor.mod.Flux {
      def this(stores: Any, actions: Any) = this()
    }
    
    inline def FluxChildMixin(react: TypeofReact): typings.fluxxor.mod.FluxChildMixin = ^.asInstanceOf[js.Dynamic].applyDynamic("FluxChildMixin")(react.asInstanceOf[js.Any]).asInstanceOf[typings.fluxxor.mod.FluxChildMixin]
    
    inline def FluxMixin(react: TypeofReact): typings.fluxxor.mod.FluxMixin = ^.asInstanceOf[js.Dynamic].applyDynamic("FluxMixin")(react.asInstanceOf[js.Any]).asInstanceOf[typings.fluxxor.mod.FluxMixin]
    
    inline def StoreWatchMixin[StoreState](storeNames: String*): typings.fluxxor.mod.StoreWatchMixin[StoreState] = ^.asInstanceOf[js.Dynamic].applyDynamic("StoreWatchMixin")(storeNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.fluxxor.mod.StoreWatchMixin[StoreState]]
    
    inline def createStore(spec: StoreSpec): StoreClass = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(spec.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
    
    @JSGlobal("Fluxxor.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
