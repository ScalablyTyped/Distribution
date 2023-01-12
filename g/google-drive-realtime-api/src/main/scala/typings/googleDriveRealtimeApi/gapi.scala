package typings.googleDriveRealtimeApi

import org.scalablytyped.runtime.Instantiable11
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.Instantiable8
import typings.std.Element
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object drive {
    
    object realtime {
      
      @js.native
      trait BaseModelEvent
        extends StObject
           with /* Parameters:
        target
        gapi.drive.realtime.CollaborativeObject
        The collaborative object that initiated the event.
        Value must not be null.
        sessionId
        string
        The id of the session that initiated the event.
        userId
        string
        The user id of the user that initiated the event.
        compoundOperationNames
        Array of string
        The list of names from the hierarchy of compound operations that initiated the event.
        Value must not be null.
        isLocal
        boolean
        True if the event originated in the local session.
        isUndo
        boolean
        True if the event originated from an undo call.
        isRedo
        boolean
        True if the event originated from a redo call.
        */
      Instantiable7[
                  /* target */ CollaborativeObject, 
                  /* sessionId */ String, 
                  /* userId */ String, 
                  /* compoundOperationNames */ js.Array[String], 
                  /* isLocal */ Boolean, 
                  /* isUndo */ Boolean, 
                  /* isRedo */ Boolean, 
                  BaseModelEvent
                ] {
        
        // Whether this event bubbles.
        var bubbles: Boolean = js.native
        
        // The list of names from the hierarchy of compound operations that initiated this event.
        var compoundOperationNames: js.Array[String] = js.native
        
        // True if this event originated in the local session.
        var isLocal: Boolean = js.native
        
        // True if this event originated from a redo call.
        var isRedo: Boolean = js.native
        
        // True if this event originated from an undo call.
        var isUndo: Boolean = js.native
        
        // Prevents an event from performing its default action. In the Realtime API, this function is only present
        // for compatibility with the DOM event interface and therefore it does nothing.
        def preventDefault(): Unit = js.native
        
        // The id of the session that initiated this event.
        var sessionId: String = js.native
        
        // Stops an event which bubbles from propagating to the target's parent.
        def stopPropagation(): Unit = js.native
        
        // The collaborative object that initiated this event.
        var target: CollaborativeObject = js.native
        
        // The type of the event.
        var `type`: EventType = js.native
        
        // The user id of the user that initiated this event.
        var userId: String = js.native
      }
      
      @js.native
      trait CollaborativeList[V]
        extends StObject
           with CollaborativeObject {
        
        // Returns a copy of the contents of this collaborative list as an array.
        // Changes to the returned object will not affect the original collaborative list.
        def asArray(): js.Array[V] = js.native
        
        // Removes all values from the list.
        def clear(): Unit = js.native
        
        // Gets the value at the given index.
        def get(ind: Double): V = js.native
        
        //Returns the first index of the given value, or -1 if it cannot be found.
        def indexOf(value: V): Double = js.native
        def indexOf(value: V, opt_comparatorFn: js.Function2[/* x1 */ V, /* x2 */ V, Boolean]): Double = js.native
        
        //Inserts an item into the list at a given index.
        def insert(index: Double, value: V): Unit = js.native
        
        // Inserts a list of items into the list at a given index.
        def insertAll(index: Double, values: js.Array[V]): Unit = js.native
        
        // Returns the last index of the given value, or -1 if it cannot be found.
        def lastIndexOf(value: V): Double = js.native
        def lastIndexOf(value: V, opt_comparatorFn: js.Function2[/* x1 */ V, /* x2 */ V, Boolean]): Double = js.native
        
        // The number of entries in the list. Assign to this field to reduce the size of the list.
        // Note that the length given must be less than or equal to the current size.
        // The length of a list cannot be extended in this way.
        var length: Double = js.native
        
        //Moves a single element in this list (at index) to immediately before destinationIndex.
        //Both indices are with respect to the position of elements before the move.
        //For example, given the list: ['A', 'B', 'C']
        //move(0, 0) is a no-op
        //move(0, 1) is a no-op
        //move(0, 2) yields ['B', 'A', 'C'] ('A' is moved to immediately before 'C')
        //move(0, 3) yields ['B', 'C', 'A'] ('A' is moved to immediately before an imaginary element after the list end)
        //move(1, 0) yields ['B', 'A', 'C'] ('B' is moved to immediately before 'A')
        //move(1, 1) is a no-op
        //move(1, 2) is a no-op
        //move(1, 3) yields ['A', 'C', 'B'] ('B' is moved to immediately before an imaginary element after the list end)
        def move(index: Double, destinationIndex: Double): Unit = js.native
        
        // Moves a single element in this list (at index) to immediately before destinationIndex in the list destination.
        // Both indices are with respect to the position of elements before the move.
        // If the provided destination is this list, this function is identical to move(index, destinationIndex).
        def moveToList(index: Double, destination: CollaborativeList[V], destinationIndex: Double): Unit = js.native
        
        // Adds an item to the end of the list.
        // @return the new length of the list
        def push(value: V): Double = js.native
        
        // Adds an array of values to the end of the list.
        def pushAll(values: js.Array[V]): Unit = js.native
        
        // Creates an IndexReference at the given index. If canBeDeleted is true, then a delete over the index will delete
        // the reference. Otherwise the reference will shift to the beginning of the deleted range.
        def registerReference(index: Double, canBeDeleted: Boolean): IndexReference[CollaborativeList[V]] = js.native
        
        // Removes the item at the given index from the list.
        def remove(index: Double): Unit = js.native
        
        // Removes the items between startIndex (inclusive) and endIndex (exclusive).
        def removeRange(startIndex: Double, endIndex: Double): Unit = js.native
        
        // Removes the first instance of the given value from the list.
        // @return whether the item was removed
        def removeValue(value: V): Boolean = js.native
        
        // Replaces items in the list with the given items, starting at the given index.
        def replaceRange(index: Double, values: js.Array[V]): Unit = js.native
        
        // Sets the item at the given index
        def set(index: Double, value: V): Unit = js.native
      }
      
      @js.native
      trait CollaborativeMap[V]
        extends StObject
           with CollaborativeObject {
        
        // Removes all entries.
        def clear(): Unit = js.native
        
        // Removes the entry for the given key (if such an entry exists).
        // @return the value that was mapped to this key, or null if there was no existing value.
        def delete(key: String): V = js.native
        
        // Returns the value mapped to the given key.
        def get(key: String): V = js.native
        
        // Checks if this map contains an entry for the given key.
        def has(key: String): Boolean = js.native
        
        // Returns whether this map is empty.
        def isEmpty(): Boolean = js.native
        
        // Returns an array containing a copy of the items in this map. Modifications to the returned array do
        // not modify this collaborative map.
        // @return non-null Array of Arrays, where the inner arrays are tupples [string, V]
        def items(): js.Array[js.Tuple2[String, V]] = js.native
        
        // Returns an array containing a copy of the keys in this map. Modifications to the returned array
        // do not modify this collaborative map.
        def keys(): js.Array[String] = js.native
        
        // Put the value into the map with the given key, overwriting an existing value for that key.
        // @return the old map value, if any, that used to be mapped to the given key.
        def set(key: String, value: V): V = js.native
        
        var size: Double = js.native
        
        // Returns an array containing a copy of the values in this map. Modifications to the returned array
        // do not modify this collaborative map.
        def values(): js.Array[V] = js.native
      }
      
      @js.native
      trait CollaborativeObject extends StObject {
        
        // Adds an event listener to the event target. The same handler can only be added once per the type.
        // Even if you add the same handler multiple times using the same type then it will only be called once
        // when the event is dispatched.
        def addEventListener(`type`: String, listener: GoogEventHandler): Unit = js.native
        def addEventListener(`type`: String, listener: GoogEventHandler, opt_capture: Boolean): Unit = js.native
        
        // The id of this collaborative object. Read-only.
        var id: String = js.native
        
        // Removes all event listeners from this object.
        def removeAllEventListeners(): Unit = js.native
        
        // Removes an event listener from the event target. The handler must be the same object as the one added.
        // If the handler has not been added then nothing is done.
        def removeEventListener(`type`: String, listener: GoogEventHandler): Unit = js.native
        def removeEventListener(`type`: String, listener: GoogEventHandler, opt_capture: Boolean): Unit = js.native
        
        // The type of this collaborative object. For standard collaborative objects,
        // see gapi.drive.realtime.CollaborrativeType for possible values; for custom collaborative objects, this value is
        // application-defined.
        // Addition: the possible values for standard objects are EditableString, List, and Map.
        var `type`: CollaborativeObjectType = js.native
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.EditableString
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.Map
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.List
      */
      trait CollaborativeObjectType extends StObject
      object CollaborativeObjectType {
        
        inline def EditableString: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.EditableString = "EditableString".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.EditableString]
        
        inline def List: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.List = "List".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.List]
        
        inline def Map: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.Map = "Map".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.Map]
      }
      
      @js.native
      trait CollaborativeString
        extends StObject
           with CollaborativeObject {
        
        // Appends a string to the end of this one.
        def append(text: String): Unit = js.native
        
        // Gets a string representation of the collaborative string.
        def getText(): String = js.native
        
        // Inserts a string into the collaborative string at a specific index.
        def insertString(index: Double, text: String): Unit = js.native
        
        // The length of the string. Read only.
        var length: Double = js.native
        
        // Creates an IndexReference at the given {@code index}. If {@code canBeDeleted} is set, then a delete
        // over the index will delete the reference. Otherwise the reference will shift to the beginning of the deleted range.
        def registerReference(index: Double, canBeDeleted: Boolean): IndexReference[CollaborativeString] = js.native
        
        // Deletes the text between startIndex (inclusive) and endIndex (exclusive).
        def removeRange(startIndex: Double, endIndex: Double): Unit = js.native
        
        // Sets the contents of this collaborative string. Note that this method performs a text diff between the
        // current string contents and the new contents so that the string will be modified using the minimum number
        // of text inserts and deletes possible to change the current contents to the newly-specified contents.
        def setText(text: String): Unit = js.native
        
        // The text of this collaborative string. Reading from this property is equivalent to calling getText(). Writing to this property is equivalent to calling setText().
        var text: String = js.native
      }
      
      trait Collaborator extends StObject {
        
        // The HTML color associated with this collaborator. When possible, collaborators are assigned unique colors.
        var color: String
        
        // The display name for this collaborator.
        var displayName: String
        
        // True if this collaborator is anonymous, false otherwise.
        var isAnonymous: Boolean
        
        // True if this collaborator is the local user, false otherwise.
        var isMe: Boolean
        
        // The permission ID for this collaborator. This ID is stable for a given user and is compatible with the
        // Drive API permissions APIs. Use the userId property for all other uses.
        var permissionId: String
        
        // A URL that points to the profile photo for this collaborator, or to a generic profile photo for
        // anonymous collaborators.
        var photoUrl: String
        
        // The session ID for this collaborator. A single user may have multiple sessions if they have the same document
        // open on multiple devices or in multiple browser tabs.
        var sessionId: String
        
        // The user ID for this collaborator. This ID is stable for a given user and is compatible with most Google APIs
        // except the Drive API permission APIs. For an ID which is compatible with the Drive API permission APIs,
        // use the permissionId property.
        var userId: String
      }
      object Collaborator {
        
        inline def apply(
          color: String,
          displayName: String,
          isAnonymous: Boolean,
          isMe: Boolean,
          permissionId: String,
          photoUrl: String,
          sessionId: String,
          userId: String
        ): Collaborator = {
          val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isAnonymous = isAnonymous.asInstanceOf[js.Any], isMe = isMe.asInstanceOf[js.Any], permissionId = permissionId.asInstanceOf[js.Any], photoUrl = photoUrl.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
          __obj.asInstanceOf[Collaborator]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Collaborator] (val x: Self) extends AnyVal {
          
          inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
          
          inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
          
          inline def setIsAnonymous(value: Boolean): Self = StObject.set(x, "isAnonymous", value.asInstanceOf[js.Any])
          
          inline def setIsMe(value: Boolean): Self = StObject.set(x, "isMe", value.asInstanceOf[js.Any])
          
          inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
          
          inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
          
          inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
          
          inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Document extends StObject {
        
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
        
        // Whether the document is closed. Read-only; call close() to close the document.
        var isClosed: Boolean = js.native
        
        // Whether the document is stored in Google Drive. Read-only.
        // This property is false for documents created using gapi.drive.realtime.newInMemoryDocument or
        // gapi.drive.realtime.loadFromJson and true for all other documents.
        var isInGoogleDrive: Boolean = js.native
        
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
        
        // The approximate amount of time (in milliseconds) that changes have been waiting to be saved in Google Drive.
        // If there are no unsaved changes or this is an in-memory document, this value is always 0.
        // This value should remain low (for example, less than a few seconds) as long as the network is healthy and
        // changes are being saved as quickly as they are generated. If the network is unreliable or down, or if changes
        // are being made to the model more quickly than they can be saved, this value will continue to grow until the
        // network catches up and the changes are successfully saved.
        var saveDelay: Double = js.native
      }
      
      trait Error extends StObject {
        
        // Whether the error is fatal. Fatal errors cannot be recovered
        // from and require the document to be reloaded.
        var isFatal: Boolean
        
        // A message describing the error.
        var message: String
        
        // The type of the error that occurred.
        var `type`: ErrorType
      }
      object Error {
        
        inline def apply(isFatal: Boolean, message: String, `type`: ErrorType): Error = {
          val __obj = js.Dynamic.literal(isFatal = isFatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[Error]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
          
          inline def setIsFatal(value: Boolean): Self = StObject.set(x, "isFatal", value.asInstanceOf[js.Any])
          
          inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          inline def setType(value: ErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.concurrent_creation
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_compound_operation
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_json_syntax
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.missing_property
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.not_found
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.forbidden
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.server_error
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.client_error
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.token_refresh_required
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_element_type
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.no_write_permission
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.fatal_network_error
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.unexpected_element
      */
      trait ErrorType extends StObject
      object ErrorType {
        
        inline def client_error: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.client_error = "client_error".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.client_error]
        
        inline def concurrent_creation: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.concurrent_creation = "concurrent_creation".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.concurrent_creation]
        
        inline def fatal_network_error: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.fatal_network_error = "fatal_network_error".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.fatal_network_error]
        
        inline def forbidden: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.forbidden = "forbidden".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.forbidden]
        
        inline def invalid_compound_operation: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_compound_operation = "invalid_compound_operation".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_compound_operation]
        
        inline def invalid_element_type: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_element_type = "invalid_element_type".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_element_type]
        
        inline def invalid_json_syntax: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_json_syntax = "invalid_json_syntax".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.invalid_json_syntax]
        
        inline def missing_property: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.missing_property = "missing_property".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.missing_property]
        
        inline def no_write_permission: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.no_write_permission = "no_write_permission".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.no_write_permission]
        
        inline def not_found: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.not_found = "not_found".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.not_found]
        
        inline def server_error: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.server_error = "server_error".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.server_error]
        
        inline def token_refresh_required: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.token_refresh_required = "token_refresh_required".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.token_refresh_required]
        
        inline def unexpected_element: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.unexpected_element = "unexpected_element".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.unexpected_element]
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.object_changed
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_set
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_added
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_removed
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.value_changed
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_inserted
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_deleted
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_joined
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_left
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.reference_shifted
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.document_save_state_changed
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.undo_redo_state_changed
        - typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.attribute_changed
      */
      trait EventType extends StObject
      object EventType {
        
        inline def attribute_changed: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.attribute_changed = "attribute_changed".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.attribute_changed]
        
        inline def collaborator_joined: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_joined = "collaborator_joined".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_joined]
        
        inline def collaborator_left: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_left = "collaborator_left".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_left]
        
        inline def document_save_state_changed: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.document_save_state_changed = "document_save_state_changed".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.document_save_state_changed]
        
        inline def object_changed: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.object_changed = "object_changed".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.object_changed]
        
        inline def reference_shifted: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.reference_shifted = "reference_shifted".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.reference_shifted]
        
        inline def text_deleted: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_deleted = "text_deleted".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_deleted]
        
        inline def text_inserted: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_inserted = "text_inserted".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_inserted]
        
        inline def undo_redo_state_changed: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.undo_redo_state_changed = "undo_redo_state_changed".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.undo_redo_state_changed]
        
        inline def value_changed: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.value_changed = "value_changed".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.value_changed]
        
        inline def values_added: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_added = "values_added".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_added]
        
        inline def values_removed: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_removed = "values_removed".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_removed]
        
        inline def values_set: typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_set = "values_set".asInstanceOf[typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_set]
      }
      
      type GoogEventHandler = (js.Function1[(/* e */ Event) | (/* evt */ ObjectChangedEvent), Unit]) | EventListener
      
      @js.native
      trait IndexReference[V]
        extends StObject
           with CollaborativeObject {
        
        // The behavior of this index reference when the element it points at is deleted.
        // @return one of the elements of DeleteMode
        def deleteMode(): String = js.native
        
        //The index of the current location the reference points to. Write to this property to change the referenced index.
        var index: Double = js.native
        
        // The object this reference points to. Read-only.
        def referencedObject(): V = js.native
      }
      
      @js.native
      trait Model extends StObject {
        
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
        def beginCompoundOperation(opt_name: String): Unit = js.native
        def beginCompoundOperation(opt_name: String, opt_isUndoable: Boolean): Unit = js.native
        def beginCompoundOperation(opt_name: Unit, opt_isUndoable: Boolean): Unit = js.native
        
        // An estimate of the number of bytes used by data stored in the model.
        var bytesUsed: Double = js.native
        
        // True if the model can currently redo.
        var canRedo: Boolean = js.native
        
        // True if the model can currently undo.
        var canUndo: Boolean = js.native
        
        // Creates and returns a new collaborative object. This can be used to create custom collaborative objects.
        // For built in types, use the specific create* functions.
        // @return non-null Object
        def create(ref: String, var_args: Any*): Any = js.native
        def create(ref: js.Function, var_args: Any*): Any = js.native
        
        // Creates the native JS object for a given collaborative object type.
        // @return non-null Object
        def createJsObject(typeName: String): Any = js.native
        
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
        def getRoot(): CollaborativeMap[Any] = js.native
        
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
        def toJson(opt_appId: String): String = js.native
        def toJson(opt_appId: String, opt_revision: Double): String = js.native
        def toJson(opt_appId: Unit, opt_revision: Double): String = js.native
        
        // Undo the last thing the active collaborator did.
        def undo(): Unit = js.native
      }
      
      @js.native
      trait ObjectChangedEvent
        extends StObject
           with BaseModelEvent
           with // parameters as in BaseModelEvent above except for addition of:
      // events:
      // Array of gapi.drive.realtime.BaseModelEvent
      // The specific events that document the changes that occurred on the object.
      // Value must not be null.
      Instantiable8[
                  /* target */ CollaborativeObject, 
                  /* sessionId */ String, 
                  /* userId */ String, 
                  /* compoundOperationNames */ js.Array[String], 
                  /* isLocal */ Boolean, 
                  /* isUndo */ Boolean, 
                  /* isRedo */ Boolean, 
                  /* events */ js.Array[BaseModelEvent], 
                  ObjectChangedEvent
                ] {
        
        // The specific events that document the changes that occurred on the object.
        var events: js.Array[BaseModelEvent] = js.native
      }
      
      @js.native
      trait ValuesAddedEvent[V]
        extends StObject
           with BaseModelEvent
           with Instantiable11[
                  /* target */ CollaborativeObject, 
                  /* sessionId */ String, 
                  /* userId */ String, 
                  /* compoundOperationNames */ js.Array[String], 
                  /* isLocal */ Boolean, 
                  /* isUndo */ Boolean, 
                  /* isRedo */ Boolean, 
                  /* index */ Double, 
                  /* values */ js.Array[V], 
                  /* movedFromList */ CollaborativeList[V], 
                  /* movedFromIndex */ Double, 
                  ValuesAddedEvent[V]
                ] {
        
        // The index of the first added value
        var index: Double = js.native
        
        // The index in the source collaborative list that the values were moved from, or null if this insert is not the result of a move operation.
        var movedFromIndex: Double = js.native
        
        // The collaborative list that the values were moved from, or null if this insertion is not the result of a move operation.
        var movedFromList: CollaborativeList[V] = js.native
      }
      
      @js.native
      trait ValuesRemovedEvent[V]
        extends StObject
           with BaseModelEvent
           with Instantiable11[
                  /* target */ CollaborativeObject, 
                  /* sessionId */ String, 
                  /* userId */ String, 
                  /* compoundOperationNames */ js.Array[String], 
                  /* isLocal */ Boolean, 
                  /* isUndo */ Boolean, 
                  /* isRedo */ Boolean, 
                  /* index */ Double, 
                  /* values */ js.Array[V], 
                  /* movedToList */ CollaborativeList[V], 
                  /* movedToIndex */ Double, 
                  ValuesRemovedEvent[V]
                ] {
        
        // The index of the first removed value.
        var index: Double = js.native
        
        // The index in the collaborative list that the values were moved to, or null if this delete is not the result of a move operation.
        var movedToIndex: Double = js.native
        
        // The collaborative list that the values were moved to, or null if this delete is not the result of a move operation.
        var movedToList: CollaborativeList[V] = js.native
      }
      
      object databinding {
        
        trait Binding extends StObject {
          
          // Throws gapi.drive.realtime.databinding.AlreadyBoundError If domElement has already been bound.
          // The collaborative object to bind.
          var collaborativeObject: CollaborativeObject
          
          // The DOM element that the collaborative object is bound to. Value must not be null.
          var domElement: Element
          
          // Unbinds the domElement from collaborativeObject.
          def unbind(): Unit
        }
        object Binding {
          
          inline def apply(collaborativeObject: CollaborativeObject, domElement: Element, unbind: () => Unit): Binding = {
            val __obj = js.Dynamic.literal(collaborativeObject = collaborativeObject.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], unbind = js.Any.fromFunction0(unbind))
            __obj.asInstanceOf[Binding]
          }
          
          @scala.inline
          implicit open class MutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
            
            inline def setCollaborativeObject(value: CollaborativeObject): Self = StObject.set(x, "collaborativeObject", value.asInstanceOf[js.Any])
            
            inline def setDomElement(value: Element): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
            
            inline def setUnbind(value: () => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
          }
        }
      }
    }
  }
}
