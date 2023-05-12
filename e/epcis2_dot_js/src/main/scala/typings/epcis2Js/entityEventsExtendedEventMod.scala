package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEventsExtendedEventMod {
  
  @JSImport("epcis2.js/entity/events/ExtendedEvent", JSImport.Default)
  @js.native
  open class default () extends ExtendedEvent
  
  @js.native
  trait ExtendedEvent
    extends typings.epcis2Js.entityEventsEventMod.default {
    
    /**
      * Set the type property
      * @return the extendedEvent instance
      */
    def setType(`type`: String): ExtendedEvent = js.native
  }
}
