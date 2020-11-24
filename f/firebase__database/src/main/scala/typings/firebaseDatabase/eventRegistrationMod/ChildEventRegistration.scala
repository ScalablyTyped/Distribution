package typings.firebaseDatabase.eventRegistrationMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.eventMod.CancelEvent
import typings.firebaseDatabase.eventMod.DataEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/EventRegistration", "ChildEventRegistration")
@js.native
/**
  * @param {?Object.<string, function(!DataSnapshot, ?string=)>} callbacks_
  * @param {?function(Error)} cancelCallback_
  * @param {Object=} context_
  */
class ChildEventRegistration () extends EventRegistration {
  def this(callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]]) = this()
  def this(
    callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
    cancelCallback_ : js.Function1[/* e */ Error, Unit]
  ) = this()
  def this(callbacks_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit]) = this()
  def this(
    callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
    cancelCallback_ : js.Function1[/* e */ Error, Unit],
    context_ : js.Object
  ) = this()
  def this(
    callbacks_ : StringDictionary[js.Function2[/* d */ DataSnapshot, /* s */ js.UndefOr[String | Null], Unit]],
    cancelCallback_ : Null,
    context_ : js.Object
  ) = this()
  def this(callbacks_ : Null, cancelCallback_ : js.Function1[/* e */ Error, Unit], context_ : js.Object) = this()
  def this(callbacks_ : Null, cancelCallback_ : Null, context_ : js.Object) = this()
  
  var callbacks_ : js.Any = js.native
  
  var cancelCallback_ : js.Any = js.native
  
  var context_ : js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
  def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
}
