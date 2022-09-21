package typings.eventEmitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Emitter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Emitter]
  inline def apply(obj: Any): Emitter = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Emitter]
  
  @JSImport("event-emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Emitter extends StObject {
    
    def emit(`type`: String, args: Any*): Unit
    
    def off(`type`: String, listener: EventListener): Unit
    @JSName("off")
    var off_Original: EmitterMethod
    
    def on(`type`: String, listener: EventListener): Unit
    @JSName("on")
    var on_Original: EmitterMethod
    
    def once(`type`: String, listener: EventListener): Unit
    @JSName("once")
    var once_Original: EmitterMethod
  }
  object Emitter {
    
    inline def apply(
      emit: (String, /* repeated */ Any) => Unit,
      off: (/* type */ String, /* listener */ EventListener) => Unit,
      on: (/* type */ String, /* listener */ EventListener) => Unit,
      once: (/* type */ String, /* listener */ EventListener) => Unit
    ): Emitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[Emitter]
    }
    
    extension [Self <: Emitter](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setOff(value: (/* type */ String, /* listener */ EventListener) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (/* type */ String, /* listener */ EventListener) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (/* type */ String, /* listener */ EventListener) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  type EmitterMethod = js.Function2[/* type */ String, /* listener */ EventListener, Unit]
  
  @js.native
  trait EventListener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}
