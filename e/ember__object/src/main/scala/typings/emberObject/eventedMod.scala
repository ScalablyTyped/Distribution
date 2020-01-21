package typings.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/evented", JSImport.Namespace)
@js.native
object eventedMod extends js.Object {
  /**
    * This mixin allows for Ember objects to subscribe to and emit events.
    */
  @js.native
  trait Evented extends js.Object {
    /**
      * Checks to see if object has any subscriptions for named event.
      */
    def has(name: String): Boolean = js.native
    def off(name: String, method: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Cancels subscription for given name, target, and method.
      */
    def off[Target](
      name: String,
      target: Target,
      method: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Unit]
    ): this.type = js.native
    def on(name: String, method: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Subscribes to a named event with given function.
      */
    def on[Target](
      name: String,
      target: Target,
      method: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Unit]
    ): this.type = js.native
    def one(name: String, method: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Subscribes a function to a named event and then cancels the subscription
      * after the first time the event is triggered. It is good to use ``one`` when
      * you only care about the first time an event has taken place.
      */
    def one[Target](
      name: String,
      target: Target,
      method: js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Unit]
    ): this.type = js.native
    /**
      * Triggers a named event for the object. Any additional arguments
      * will be passed as parameters to the functions that are subscribed to the
      * event.
      */
    def trigger(name: String, args: js.Any*): js.Any = js.native
  }
  
  val default: typings.emberObject.mixinMod.default[Evented, typings.emberObject.mod.default] = js.native
  def on(eventNames: String, func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Unit] = js.native
}

