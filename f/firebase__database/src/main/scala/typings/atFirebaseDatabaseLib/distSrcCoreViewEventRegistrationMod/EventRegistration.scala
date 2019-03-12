package typings
package atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegistration extends js.Object {
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  def createCancelEvent(error: stdLib.Error, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreViewEventMod.CancelEvent | scala.Null
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  def createEvent(
    change: atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change,
    query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query
  ): atFirebaseDatabaseLib.distSrcCoreViewEventMod.Event
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  def getEventRunner(eventData: atFirebaseDatabaseLib.distSrcCoreViewEventMod.Event): js.Function0[scala.Unit]
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  def hasAnyCallback(): scala.Boolean
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  def matches(other: EventRegistration): scala.Boolean
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  def respondsTo(eventType: java.lang.String): scala.Boolean
}

object EventRegistration {
  @scala.inline
  def apply(
    createCancelEvent: (stdLib.Error, atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path) => atFirebaseDatabaseLib.distSrcCoreViewEventMod.CancelEvent | scala.Null,
    createEvent: (atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change, atFirebaseDatabaseLib.distSrcApiQueryMod.Query) => atFirebaseDatabaseLib.distSrcCoreViewEventMod.Event,
    getEventRunner: atFirebaseDatabaseLib.distSrcCoreViewEventMod.Event => js.Function0[scala.Unit],
    hasAnyCallback: () => scala.Boolean,
    matches: EventRegistration => scala.Boolean,
    respondsTo: java.lang.String => scala.Boolean
  ): EventRegistration = {
    val __obj = js.Dynamic.literal(createCancelEvent = js.Any.fromFunction2(createCancelEvent), createEvent = js.Any.fromFunction2(createEvent), getEventRunner = js.Any.fromFunction1(getEventRunner), hasAnyCallback = js.Any.fromFunction0(hasAnyCallback), matches = js.Any.fromFunction1(matches), respondsTo = js.Any.fromFunction1(respondsTo))
  
    __obj.asInstanceOf[EventRegistration]
  }
}

