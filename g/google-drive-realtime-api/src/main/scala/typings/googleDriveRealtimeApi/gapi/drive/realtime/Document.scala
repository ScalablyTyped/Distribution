package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  // Whether the document is closed. Read-only; call close() to close the document.
  var isClosed: Boolean = js.native
  // Whether the document is stored in Google Drive. Read-only.
  // This property is false for documents created using gapi.drive.realtime.newInMemoryDocument or
  // gapi.drive.realtime.loadFromJson and true for all other documents.
  var isInGoogleDrive: Boolean = js.native
  // The approximate amount of time (in milliseconds) that changes have been waiting to be saved in Google Drive.
  // If there are no unsaved changes or this is an in-memory document, this value is always 0.
  // This value should remain low (for example, less than a few seconds) as long as the network is healthy and
  // changes are being saved as quickly as they are generated. If the network is unreliable or down, or if changes
  // are being made to the model more quickly than they can be saved, this value will continue to grow until the
  // network catches up and the changes are successfully saved.
  var saveDelay: Double = js.native
  // Adds an event listener to the event target. The same handler can only be added once per the type.
  // Even if you add the same handler multiple times using the same type then it will only be called once when
  // the event is dispatched.
  def addEventListener(`type`: String, listener: GoogEventHandler): Unit = js.native
  def addEventListener(`type`: String, listener: GoogEventHandler, opt_capture: Boolean): Unit = js.native
  // Closes the document and disconnects from the server.
  // After this function is called, event listeners will no longer fire and attempts to access the document, model,
  // or model objects will throw a gapi.drive.realtime.DocumentClosedError.
  // Calling this function after the document has been closed will have no effect.
  def close(): Unit = js.native
  // Gets an array of collaborators active in this session. Each collaborator is a jsMap with these fields:
  // sessionId, userId, displayName, color, isMe, isAnonymous.
  def getCollaborators(): js.Array[Collaborator] = js.native
  // Gets the collaborative model associated with this document.
  // @return non-null Model
  def getModel(): Model = js.native
  // Removes all event listeners from this object.
  def removeAllEventListeners(): Unit = js.native
  // Removes an event listener from the event target. The handler must be the same object as the one added.
  // If the handler has not been added then nothing is done.
  def removeEventListener(`type`: String, listener: GoogEventHandler): Unit = js.native
  def removeEventListener(`type`: String, listener: GoogEventHandler, opt_capture: Boolean): Unit = js.native
  // Saves a copy of this document to a new file. After this function is called, all changes to this document no
  // longer affect the old document and are instead saved to the new file.
  // The provided file ID must refer to a valid file in Drive which does not have any Realtime data for your app.
  // This function can also be used on an in-memory file to convert it to a Drive-connected file.
  def saveAs(fileId: String): Unit = js.native
}

