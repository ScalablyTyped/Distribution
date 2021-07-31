package typings.eventemitterAsyncresource

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.eventemitterAsyncresource.mod.EventEmitterAsyncResource
import typings.eventemitterAsyncresource.mod.Options
import typings.node.asyncHooksMod.AsyncResource
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[EventEmitter]
       with Instantiable1[
          /* import warning: importer.ImportType#apply Failed type conversion: infer T */ /* options */ js.Any, 
          EventEmitter
        ]
  
  @js.native
  trait InstantiableAsyncResource
    extends StObject
       with Instantiable1[/* name */ String, AsyncResource]
       with Instantiable2[
          /* name */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer T */ /* options */ js.Any, 
          AsyncResource
        ]
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait TypeofAsyncResource extends StObject {
    
    /**
      * Binds the given function to the current execution context.
      * @param fn The function to bind to the current execution context.
      * @param type An optional name to associate with the underlying `AsyncResource`.
      */
    /* static member */
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, js.Any] */](fn: Func): Func & typings.node.anon.AsyncResource = js.native
    def bind[Func /* <: js.Function1[/* repeated */ js.Any, js.Any] */](fn: Func, `type`: String): Func & typings.node.anon.AsyncResource = js.native
  }
  
  @js.native
  trait TypeofEventEmitter extends StObject {
    
    /* static member */
    var defaultMaxListeners: Double = js.native
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`
      * events. Listeners installed using this symbol are called before the regular
      * `'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an
      * `'error'` event is emitted, therefore the process will still crash if no
      * regular `'error'` listener is installed.
      */
    /* static member */
    val errorMonitor: js.Symbol = js.native
    
    /** @deprecated since v4.0.0 */
    /* static member */
    def listenerCount(emitter: EventEmitter, event: String): Double = js.native
    def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = js.native
  }
  
  @js.native
  trait TypeofEventEmitterAsyncRe
    extends StObject
       with Instantiable0[EventEmitterAsyncResource]
       with Instantiable1[(/* options */ Options) | (/* options */ String), EventEmitterAsyncResource] {
    
    def EventEmitterAsyncResource: /* import warning: importer.ImportType#apply Failed type conversion: typeof EventEmitterAsyncResource */ js.Any = js.native
  }
}
