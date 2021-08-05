package typings.eventEmitterEs6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-emitter-es6", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with EventEmitter {
    def this(options: Options) = this()
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    def destroy(): Unit = js.native
    
    def emit(`type`: String, eventArgs: js.Any*): Unit = js.native
    
    def emitSync(`type`: String, eventArgs: js.Any*): Unit = js.native
    
    def off(`type`: String): Unit = js.native
    def off(`type`: String, listener: Listener): Unit = js.native
    
    def on(`type`: String, listener: Listener): Unit = js.native
    
    def once(`type`: String, listener: Listener): Unit = js.native
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var emitDelay: js.UndefOr[Double] = js.undefined
    
    var strictMode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEmitDelay(value: Double): Self = StObject.set(x, "emitDelay", value.asInstanceOf[js.Any])
      
      inline def setEmitDelayUndefined: Self = StObject.set(x, "emitDelay", js.undefined)
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
    }
  }
}
