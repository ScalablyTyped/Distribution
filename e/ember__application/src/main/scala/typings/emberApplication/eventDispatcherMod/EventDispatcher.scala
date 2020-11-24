package typings.emberApplication.eventDispatcherMod

import typings.emberApplication.typesMod.EventDispatcherEvents
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class EventDispatcherOps[Self <: EventDispatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvents(value: EventDispatcherEvents): Self = this.set("events", value.asInstanceOf[js.Any])
  }
}
