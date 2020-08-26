package typings.firebaseDatabase.eventRegistrationMod

import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.eventMod.CancelEvent
import typings.firebaseDatabase.eventMod.DataEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ValueEventRegistration")
@js.native
/**
  * @param {?function(!DataSnapshot)} callback_
  * @param {?function(Error)} cancelCallback_
  * @param {?Object} context_
  */
class ValueEventRegistration () extends EventRegistration {
  def this(callback_ : js.Function1[/* d */ DataSnapshot, Unit]) = this()
  def this(
    callback_ : js.Function1[/* d */ DataSnapshot, Unit],
    cancelCallback_ : js.Function1[/* e */ Error, Unit]
  ) = this()
  def this(callback_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit]) = this()
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
    * @inheritDoc
    */
  def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
  def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
}

