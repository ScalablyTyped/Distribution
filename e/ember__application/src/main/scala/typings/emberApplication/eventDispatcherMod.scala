package typings.emberApplication

import typings.emberApplication.typesMod.EventDispatcherEvents
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDispatcherMod {
  
  @JSImport("@ember/application/-private/event-dispatcher", JSImport.Default)
  @js.native
  class default () extends EventDispatcher
  
  @js.native
  trait EventDispatcher extends Object {
    
    /**
      * The set of events names (and associated handler function names) to be setup
      * and dispatched by the `EventDispatcher`. Modifications to this list can be done
      * at setup time, generally via the `Ember.Application.customEvents` hash.
      */
    var events: EventDispatcherEvents = js.native
  }
  object EventDispatcher {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      events: EventDispatcherEvents,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): EventDispatcher = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[EventDispatcher]
    }
    
    @scala.inline
    implicit class EventDispatcherMutableBuilder[Self <: EventDispatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: EventDispatcherEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
}
