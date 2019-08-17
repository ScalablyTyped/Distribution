package typings.atEmberApplication.dashPrivateEventDashDispatcherMod

import typings.atEmberApplication.typesMod.EventDispatcherEvents
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDispatcher extends Object {
  /**
    * The set of events names (and associated handler function names) to be setup
    * and dispatched by the `EventDispatcher`. Modifications to this list can be done
    * at setup time, generally via the `Ember.Application.customEvents` hash.
    */
  var events: EventDispatcherEvents
}

object EventDispatcher {
  @scala.inline
  def apply(
    constructor: js.Function,
    events: EventDispatcherEvents,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EventDispatcher = {
    val __obj = js.Dynamic.literal(constructor = constructor, events = events, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[EventDispatcher]
  }
}

