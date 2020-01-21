package typings.firebaseDatabase.eventRegistrationMod

import typings.firebaseDatabase.changeMod.Change
import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.eventMod.CancelEvent
import typings.firebaseDatabase.eventMod.DataEvent
import typings.firebaseDatabase.eventMod.Event
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ValueEventRegistration")
@js.native
class ValueEventRegistration () extends EventRegistration {
  def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit]) = this()
  def this(
    callback_ : js.Function1[/* d */ DataSnapshot, Unit],
    cancelCallback_ : js.Function1[/* e */ Error, Unit]
  ) = this()
  def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit]) = this()
  /**
    * @param {?function(!DataSnapshot)} callback_
    * @param {?function(Error)} cancelCallback_
    * @param {?Object} context_
    */
  def this(
    callback_ : js.Function1[/* d */ DataSnapshot, Unit],
    cancelCallback_ : js.Function1[/* e */ Error, Unit],
    context_ : js.Object
  ) = this()
  def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit], cancelCallback_ : Null, context_ : js.Object) = this()
  def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit], context_ : js.Object) = this()
  def this(callback_ : Null, cancelCallback_ : Null, context_ : js.Object) = this()
  var callback_ : js.Any = js.native
  var cancelCallback_ : js.Any = js.native
  var context_ : js.Any = js.native
  /**
    * @param {!Error} error
    * @param {!Path} path
    * @return {?CancelEvent}
    */
  /* CompleteClass */
  override def createCancelEvent(error: Error, path: Path): CancelEvent | Null = js.native
  /**
    * @param {!Change} change
    * @param {!Query} query
    * @return {!Event}
    */
  /* CompleteClass */
  override def createEvent(change: Change, query: Query): Event = js.native
  /**
    * @inheritDoc
    */
  def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
  def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
  /**
    * Given event data, return a function to trigger the user's callback
    * @param {!Event} eventData
    * @return {function()}
    */
  /* CompleteClass */
  override def getEventRunner(eventData: Event): js.Function0[Unit] = js.native
  /**
    * False basically means this is a "dummy" callback container being used as a sentinel
    * to remove all callback containers of a particular type.  (e.g. if the user does
    * ref.off('value') without specifying a specific callback).
    *
    * (TODO: Rework this, since it's hacky)
    *
    * @return {boolean}
    */
  /* CompleteClass */
  override def hasAnyCallback(): Boolean = js.native
  /**
    * @param {!EventRegistration} other
    * @return {boolean}
    */
  /* CompleteClass */
  override def matches(other: EventRegistration): Boolean = js.native
  /**
    * True if this container has a callback to trigger for this event type
    * @param {!string} eventType
    * @return {boolean}
    */
  /* CompleteClass */
  override def respondsTo(eventType: String): Boolean = js.native
}

