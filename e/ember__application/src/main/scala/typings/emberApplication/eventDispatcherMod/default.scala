package typings.emberApplication.eventDispatcherMod

import typings.emberApplication.typesMod.EventDispatcherEvents
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/-private/event-dispatcher", JSImport.Default)
@js.native
class default () extends EventDispatcher {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /**
    * The set of events names (and associated handler function names) to be setup
    * and dispatched by the `EventDispatcher`. Modifications to this list can be done
    * at setup time, generally via the `Ember.Application.customEvents` hash.
    */
  /* CompleteClass */
  override var events: EventDispatcherEvents = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: PropertyKey): Boolean = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
}

