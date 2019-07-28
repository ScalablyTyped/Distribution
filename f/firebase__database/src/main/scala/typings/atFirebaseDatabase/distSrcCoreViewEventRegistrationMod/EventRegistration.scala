package typings.atFirebaseDatabase.distSrcCoreViewEventRegistrationMod

import typings.atFirebaseDatabase.distSrcApiQueryMod.Query
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.atFirebaseDatabase.distSrcCoreViewChangeMod.Change
import typings.atFirebaseDatabase.distSrcCoreViewEventMod.CancelEvent
import typings.atFirebaseDatabase.distSrcCoreViewEventMod.Event
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegistration extends js.Object {
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  def createCancelEvent(error: Error, path: Path): CancelEvent | Null
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  def createEvent(change: Change, query: Query): Event
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  def getEventRunner(eventData: Event): js.Function0[Unit]
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  def hasAnyCallback(): Boolean
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  def matches(other: EventRegistration): Boolean
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  def respondsTo(eventType: String): Boolean
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
}

