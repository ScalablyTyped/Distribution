package typings
package atFirebaseDatabaseLib.distSrcCoreViewEventMod

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
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_added`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_changed`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_moved`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_removed`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.value, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_added`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, prevName: java.lang.String) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_changed`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, prevName: java.lang.String) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_moved`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, prevName: java.lang.String) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_removed`, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, prevName: java.lang.String) = this()
  /**
       * @param {!string} eventType One of: value, child_added, child_changed, child_moved, child_removed
       * @param {!EventRegistration} eventRegistration The function to call to with the event data. User provided
       * @param {!DataSnapshot} snapshot The data backing the event
       * @param {?string=} prevName Optional, the name of the previous child for child_* events.
       */
  def this(eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.value, eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration, snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, prevName: java.lang.String) = this()
  var eventRegistration: atFirebaseDatabaseLib.distSrcCoreViewEventRegistrationMod.EventRegistration = js.native
  var eventType: atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.value | (atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_added`) | (atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_changed`) | (atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_moved`) | (atFirebaseDatabaseLib.atFirebaseDatabaseLibStrings.` child_removed`) = js.native
  var prevName: java.lang.String | scala.Null = js.native
  var snapshot: atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot = js.native
  /**
       * @return {!function()}
       */
  /* CompleteClass */
  override def getEventRunner(): js.Function0[scala.Unit] = js.native
  /**
       * @return {!string}
       */
  /* CompleteClass */
  override def getEventType(): java.lang.String = js.native
  /**
       * @return {!Path}
       */
  /* CompleteClass */
  override def getPath(): atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path = js.native
}

