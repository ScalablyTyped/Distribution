package typings.googleDriveRealtimeApi.gapi.drive.realtime

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  // Adds an event listener to the event target.
  // The same handler can only be added once per the type. Even if you add the same handler multiple times using the
  // same type then it will only be called once when the event is dispatched.
  def addEventListener(`type`: String, listener: js.Function0[Unit | EventListener]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function0[Unit | EventListener], opt_capture: Boolean): Unit = js.native
  
  // Starts a compound operation. If a name is given, that name will be recorded in the mutation for use in revision
  // history, undo menus, etc. When beginCompoundOperation() is called, all subsequent edits to the data model will
  // be batched together in the undo stack and revision history until endCompoundOperation() is called.
  // Compound operations may be nested inside other compound operations.
  // If the root compound operation is undoable, all nested compound operations must be undoable as well.
  // If the root compound operation is non-undoable, nested operations can be undoable, although the entire operation
  // will obey the root's opt_isUndoable value.
  // Note that the compound operation MUST start and end in the same synchronous execution block. If this invariant
  // is violated, the data model will become invalid and all future changes will fail.
  def beginCompoundOperation(): Unit = js.native
  def beginCompoundOperation(opt_name: js.UndefOr[scala.Nothing], opt_isUndoable: Boolean): Unit = js.native
  def beginCompoundOperation(opt_name: String): Unit = js.native
  def beginCompoundOperation(opt_name: String, opt_isUndoable: Boolean): Unit = js.native
  
  // An estimate of the number of bytes used by data stored in the model.
  var bytesUsed: Double = js.native
  
  // True if the model can currently redo.
  var canRedo: Boolean = js.native
  
  // True if the model can currently undo.
  var canUndo: Boolean = js.native
  
  // Creates and returns a new collaborative object. This can be used to create custom collaborative objects.
  // For built in types, use the specific create* functions.
  // @return non-null Object
  def create(ref: String, var_args: js.Any*): js.Any = js.native
  def create(ref: js.Function, var_args: js.Any*): js.Any = js.native
  
  // Creates the native JS object for a given collaborative object type.
  // @return non-null Object
  def createJsObject(typeName: String): js.Any = js.native
  
  // Creates a collaborative list.
  def createList[T](): CollaborativeList[T] = js.native
  def createList[T](opt_initialValue: js.Array[T]): CollaborativeList[T] = js.native
  
  // Creates a collaborative map.
  def createMap[T](): CollaborativeMap[T] = js.native
  def createMap[T](opt_initialValue: js.Array[js.Tuple2[String, T]]): CollaborativeMap[T] = js.native
  
  // Creates a collaborative string.
  def createString(): CollaborativeString = js.native
  def createString(opt_initialValue: String): CollaborativeString = js.native
  
  //Ends a compound operation. This method will throw an exception if no compound operation is in progress.
  def endCompoundOperation(): Unit = js.native
  
  // Returns the collaborative object with the given id.
  // @return non-null Object
  def getObject(id: String): CollaborativeObject = js.native
  
  // Returns the root of the object model.
  def getRoot(): CollaborativeMap[_] = js.native
  
  // The mode of the document. If true, the document is read-only. If false, it is editable.
  def isReadOnly(): Boolean = js.native
  
  // Redo the last thing the active collaborator undid.
  def redo(): Unit = js.native
  
  // Removes all event listeners from this object.
  def removeAllEventListeners(): Unit = js.native
  
  // Removes an event listener from the event target. The handler must be the same object as the one added.
  // If the handler has not been added then nothing is done.
  def removeEventListener(`type`: String, listener: js.Function0[Unit | EventListener]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function0[Unit | EventListener], opt_capture: Boolean): Unit = js.native
  
  // The current server revision number for this model. The revision number begins at 1 (the initial empty model)
  // and is incremented each time the model is changed on the server (either by the current session or any
  // other collaborator). Because this revision number includes only changes that the server knows about,
  // it is only updated while this client is connected to the Realtime API server and it does not include changes
  // that have not yet been saved to the server.
  def serverRevision(): Double = js.native
  
  // Serializes this data model to a JSON-based format which is compatible with the Realtime API's import/export
  // REST API. The exported JSON can also be used with gapi.drive.realtime.loadFromJson to load an in-memory
  // version of this data model which does not require a network connection.
  // See https://developers.google.com/drive/v2/reference/realtime/update for more information.
  def toJson(): String = js.native
  def toJson(opt_appId: js.UndefOr[scala.Nothing], opt_revision: Double): String = js.native
  def toJson(opt_appId: String): String = js.native
  def toJson(opt_appId: String, opt_revision: Double): String = js.native
  
  // Undo the last thing the active collaborator did.
  def undo(): Unit = js.native
}
