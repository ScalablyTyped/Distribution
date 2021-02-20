package typings.eventEmitter

import typings.eventEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeMod {
  
  @JSImport("event-emitter/pipe", JSImport.Namespace)
  @js.native
  def apply(source: Emitter, target: Emitter): EmitterPipe = js.native
  @JSImport("event-emitter/pipe", JSImport.Namespace)
  @js.native
  def apply(source: Emitter, target: Emitter, emitMethodName: String): EmitterPipe = js.native
  @JSImport("event-emitter/pipe", JSImport.Namespace)
  @js.native
  def apply(source: Emitter, target: Emitter, emitMethodName: js.Symbol): EmitterPipe = js.native
  
  @js.native
  trait EmitterPipe extends StObject {
    
    def close(): Unit = js.native
  }
  object EmitterPipe {
    
    @scala.inline
    def apply(close: () => Unit): EmitterPipe = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[EmitterPipe]
    }
    
    @scala.inline
    implicit class EmitterPipeMutableBuilder[Self <: EmitterPipe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
}
