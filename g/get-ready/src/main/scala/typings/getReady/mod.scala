package typings.getReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-ready", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Ready
  /* static members */
  object default {
    
    @JSImport("get-ready", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Object} obj - an object that be mixed
      */
    inline def mixin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")().asInstanceOf[Unit]
    inline def mixin(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type CallbackFunction = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  @js.native
  trait Ready extends StObject {
    
    /* private */ var `private`: Any = js.native
    
    def ready(): js.UndefOr[js.Promise[Unit]] = js.native
    def ready(flagOrFunction: ReadyFunctionArg): js.UndefOr[js.Promise[Unit]] = js.native
  }
  
  type ReadyFunctionArg = js.UndefOr[Boolean | js.Error | CallbackFunction]
}
