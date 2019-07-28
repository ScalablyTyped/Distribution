package typings.atFirebaseDatabase.distSrcCoreViewEventMod

import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.` child_added`
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.` child_changed`
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.` child_moved`
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.` child_removed`
import typings.atFirebaseDatabase.atFirebaseDatabaseStrings.value
import typings.atFirebaseDatabase.distSrcApiDataSnapshotMod.DataSnapshot
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.atFirebaseDatabase.distSrcCoreViewEventRegistrationMod.EventRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/Event", "DataEvent")
@js.native
class DataEvent protected () extends Event {
  def this(eventType: ` child_added`, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
  def this(eventType: ` child_changed`, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
  def this(eventType: ` child_moved`, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
  def this(eventType: ` child_removed`, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
  /**
    * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
    * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
    * @param {!DataSnapshot} snapshot The data backing the event
    * @param {?string=} prevName Optional, the name of the previous child for child_* events.
    */
  def this(eventType: value, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
  def this(
    eventType: ` child_added`,
    eventRegistration: EventRegistration,
    snapshot: DataSnapshot,
    prevName: String
  ) = this()
  def this(
    eventType: ` child_changed`,
    eventRegistration: EventRegistration,
    snapshot: DataSnapshot,
    prevName: String
  ) = this()
  def this(
    eventType: ` child_moved`,
    eventRegistration: EventRegistration,
    snapshot: DataSnapshot,
    prevName: String
  ) = this()
  def this(
    eventType: ` child_removed`,
    eventRegistration: EventRegistration,
    snapshot: DataSnapshot,
    prevName: String
  ) = this()
  def this(eventType: value, eventRegistration: EventRegistration, snapshot: DataSnapshot, prevName: String) = this()
  var eventRegistration: EventRegistration = js.native
  var eventType: value | (` child_added`) | (` child_changed`) | (` child_moved`) | (` child_removed`) = js.native
  var prevName: js.UndefOr[String | Null] = js.native
  var snapshot: DataSnapshot = js.native
  /**
    * @return {!function()}
    */
  /* CompleteClass */
  override def getEventRunner(): js.Function0[Unit] = js.native
  /**
    * @return {!string}
    */
  /* CompleteClass */
  override def getEventType(): String = js.native
  /**
    * @return {!Path}
    */
  /* CompleteClass */
  override def getPath(): Path = js.native
}

