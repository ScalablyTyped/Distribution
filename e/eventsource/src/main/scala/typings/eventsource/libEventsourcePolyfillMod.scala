package typings.eventsource

import typings.eventsource.mod.EventSourceInitDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventsourcePolyfillMod {
  
  @JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typings.eventsource.mod.^ {
    def this(url: String) = this()
    def this(url: String, eventSourceInitDict: EventSourceInitDict) = this()
  }
  
  /* static member */
  @JSImport("eventsource/lib/eventsource-polyfill", "CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  /* static member */
  @JSImport("eventsource/lib/eventsource-polyfill", "CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  /* static member */
  @JSImport("eventsource/lib/eventsource-polyfill", "OPEN")
  @js.native
  val OPEN: Double = js.native
  
  @JSImport("eventsource/lib/eventsource-polyfill", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.eventsource.mod.ReadyState & Double] = js.native
    
    /* 2 */ val CLOSED: typings.eventsource.mod.ReadyState.CLOSED & Double = js.native
    
    /* 0 */ val CONNECTING: typings.eventsource.mod.ReadyState.CONNECTING & Double = js.native
    
    /* 1 */ val OPEN: typings.eventsource.mod.ReadyState.OPEN & Double = js.native
  }
}
