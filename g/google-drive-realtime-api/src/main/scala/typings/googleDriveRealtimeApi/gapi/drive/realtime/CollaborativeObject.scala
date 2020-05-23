package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollaborativeObject extends js.Object {
  // The id of this collaborative object. Read-only.
  var id: String = js.native
  // The type of this collaborative object. For standard collaborative objects,
  // see gapi.drive.realtime.CollaborrativeType for possible values; for custom collaborative objects, this value is
  // application-defined.
  // Addition: the possible values for standard objects are EditableString, List, and Map.
  var `type`: CollaborativeObjectType = js.native
  // Adds an event listener to the event target. The same handler can only be added once per the type.
  // Even if you add the same handler multiple times using the same type then it will only be called once
  // when the event is dispatched.
  def addEventListener(`type`: String, listener: GoogEventHandler): Unit = js.native
  def addEventListener(`type`: String, listener: GoogEventHandler, opt_capture: Boolean): Unit = js.native
  // Removes all event listeners from this object.
  def removeAllEventListeners(): Unit = js.native
  // Removes an event listener from the event target. The handler must be the same object as the one added.
  // If the handler has not been added then nothing is done.
  def removeEventListener(`type`: String, listener: GoogEventHandler): Unit = js.native
  def removeEventListener(`type`: String, listener: GoogEventHandler, opt_capture: Boolean): Unit = js.native
}

