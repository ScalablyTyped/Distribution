package typings.eventEmitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-emitter", JSImport.Namespace)
  @js.native
  def apply(): Emitter = js.native
  @JSImport("event-emitter", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any): Emitter = js.native
  
  @js.native
  trait Emitter extends StObject {
    
    def emit(`type`: String, args: js.Any*): Unit = js.native
    
    def off(`type`: String, listener: EventListener): Unit = js.native
    @JSName("off")
    var off_Original: EmitterMethod = js.native
    
    def on(`type`: String, listener: EventListener): Unit = js.native
    @JSName("on")
    var on_Original: EmitterMethod = js.native
    
    def once(`type`: String, listener: EventListener): Unit = js.native
    @JSName("once")
    var once_Original: EmitterMethod = js.native
  }
  
  type EmitterMethod = js.Function2[/* type */ String, /* listener */ EventListener, Unit]
  
  type EventListener = js.Function1[/* repeated */ js.Any, Unit]
}
