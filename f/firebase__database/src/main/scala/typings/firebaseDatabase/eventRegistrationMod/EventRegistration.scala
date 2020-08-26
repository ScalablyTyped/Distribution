package typings.firebaseDatabase.eventRegistrationMod

import typings.firebaseDatabase.changeMod.Change
import typings.firebaseDatabase.eventMod.CancelEvent
import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRegistration extends js.Object {
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  def createCancelEvent(error: Error, path: Path): CancelEvent | Null = js.native
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  def createEvent(change: Change, query: Query): Event = js.native
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  def getEventRunner(eventData: Event): js.Function0[Unit] = js.native
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  def hasAnyCallback(): Boolean = js.native
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  def matches(other: EventRegistration): Boolean = js.native
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  def respondsTo(eventType: String): Boolean = js.native
}

object EventRegistration {
  @scala.inline
  def apply(
    createCancelEvent: (Error, Path) => CancelEvent | Null,
    createEvent: (Change, Query) => Event,
    getEventRunner: Event => js.Function0[Unit],
    hasAnyCallback: () => Boolean,
    matches: EventRegistration => Boolean,
    respondsTo: String => Boolean
  ): EventRegistration = {
    val __obj = js.Dynamic.literal(createCancelEvent = js.Any.fromFunction2(createCancelEvent), createEvent = js.Any.fromFunction2(createEvent), getEventRunner = js.Any.fromFunction1(getEventRunner), hasAnyCallback = js.Any.fromFunction0(hasAnyCallback), matches = js.Any.fromFunction1(matches), respondsTo = js.Any.fromFunction1(respondsTo))
    __obj.asInstanceOf[EventRegistration]
  }
  @scala.inline
  implicit class EventRegistrationOps[Self <: EventRegistration] (val x: Self) extends AnyVal {
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
    def setCreateCancelEvent(value: (Error, Path) => CancelEvent | Null): Self = this.set("createCancelEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateEvent(value: (Change, Query) => Event): Self = this.set("createEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setGetEventRunner(value: Event => js.Function0[Unit]): Self = this.set("getEventRunner", js.Any.fromFunction1(value))
    @scala.inline
    def setHasAnyCallback(value: () => Boolean): Self = this.set("hasAnyCallback", js.Any.fromFunction0(value))
    @scala.inline
    def setMatches(value: EventRegistration => Boolean): Self = this.set("matches", js.Any.fromFunction1(value))
    @scala.inline
    def setRespondsTo(value: String => Boolean): Self = this.set("respondsTo", js.Any.fromFunction1(value))
  }
  
}

