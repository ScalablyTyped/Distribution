package typings.eventFrom

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventFrom(event: Record[String, Any]): EventFromInput = ^.asInstanceOf[js.Dynamic].applyDynamic("eventFrom")(event.asInstanceOf[js.Any]).asInstanceOf[EventFromInput]
  
  inline def setEventFrom(value: EventFromInput): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEventFrom")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.eventFrom.eventFromStrings.mouse
    - typings.eventFrom.eventFromStrings.touch
    - typings.eventFrom.eventFromStrings.key
  */
  trait EventFromInput extends StObject
  object EventFromInput {
    
    inline def key: typings.eventFrom.eventFromStrings.key = "key".asInstanceOf[typings.eventFrom.eventFromStrings.key]
    
    inline def mouse: typings.eventFrom.eventFromStrings.mouse = "mouse".asInstanceOf[typings.eventFrom.eventFromStrings.mouse]
    
    inline def touch: typings.eventFrom.eventFromStrings.touch = "touch".asInstanceOf[typings.eventFrom.eventFromStrings.touch]
  }
}
