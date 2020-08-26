package typings.firebaseDatabase.eventMod

import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.eventRegistrationMod.EventRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/Event", "DataEvent")
@js.native
class DataEvent protected () extends Event {
  /**
    * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
    * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
    * @param {!DataSnapshot} snapshot The data backing the event
    * @param {?string=} prevName Optional, the name of the previous child for child_* events.
    */
  def this(eventType: EventType, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
  def this(
    eventType: EventType,
    eventRegistration: EventRegistration,
    snapshot: DataSnapshot,
    prevName: String
  ) = this()
  var eventRegistration: EventRegistration = js.native
  var eventType: EventType = js.native
  var prevName: js.UndefOr[String | Null] = js.native
  var snapshot: DataSnapshot = js.native
}

