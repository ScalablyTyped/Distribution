package typings.googleDriveRealtimeApi

import typings.googleDriveRealtimeApi.anon.SHIFTAFTERDELETE
import typings.googleDriveRealtimeApi.gapi.drive.realtime.Error
import typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType
import typings.googleDriveRealtimeApi.gapi.drive.realtime.databinding.Binding
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.EditableString
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.List
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.Map
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.attribute_changed
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_joined
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_left
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.document_save_state_changed
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.object_changed
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.reference_shifted
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_deleted
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_inserted
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.undo_redo_state_changed
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.value_changed
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_added
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_removed
import typings.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_set
import typings.googleDriveRealtimeApi.rtclient.DriveAPIFileResource
import typings.googleDriveRealtimeApi.rtclient.LoaderOptions
import typings.googleDriveRealtimeApi.rtclient.RealtimeLoader
import typings.googleDriveRealtimeApi.rtclient.RealtimeLoaderFactory
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object drive {
      
      object realtime {
        
        @JSGlobal("gapi.drive.realtime")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("gapi.drive.realtime.CollaborativeList")
        @js.native
        open class CollaborativeList[V] ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeList[V]
        /* static members */
        object CollaborativeList {
          
          @JSGlobal("gapi.drive.realtime.CollaborativeList.type")
          @js.native
          val `type`: List = js.native
        }
        
        @JSGlobal("gapi.drive.realtime.CollaborativeMap")
        @js.native
        open class CollaborativeMap[V] ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeMap[V]
        /* static members */
        object CollaborativeMap {
          
          @JSGlobal("gapi.drive.realtime.CollaborativeMap.type")
          @js.native
          val `type`: Map = js.native
        }
        
        @JSGlobal("gapi.drive.realtime.CollaborativeObject")
        @js.native
        open class CollaborativeObject ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeObject
        
        @JSGlobal("gapi.drive.realtime.CollaborativeString")
        @js.native
        open class CollaborativeString ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeString
        /* static members */
        object CollaborativeString {
          
          @JSGlobal("gapi.drive.realtime.CollaborativeString.type")
          @js.native
          val `type`: EditableString = js.native
        }
        
        @JSGlobal("gapi.drive.realtime.Collaborator")
        @js.native
        open class Collaborator protected ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.Collaborator {
          def this(
            sessionId: String,
            userId: String,
            displayName: String,
            color: String,
            isMe: Boolean,
            isAnonymous: Boolean,
            photoUrl: String,
            permissionId: String
          ) = this()
          
          // The HTML color associated with this collaborator. When possible, collaborators are assigned unique colors.
          /* CompleteClass */
          var color: String = js.native
          
          // The display name for this collaborator.
          /* CompleteClass */
          var displayName: String = js.native
          
          // True if this collaborator is anonymous, false otherwise.
          /* CompleteClass */
          var isAnonymous: Boolean = js.native
          
          // True if this collaborator is the local user, false otherwise.
          /* CompleteClass */
          var isMe: Boolean = js.native
          
          // The permission ID for this collaborator. This ID is stable for a given user and is compatible with the
          // Drive API permissions APIs. Use the userId property for all other uses.
          /* CompleteClass */
          var permissionId: String = js.native
          
          // A URL that points to the profile photo for this collaborator, or to a generic profile photo for
          // anonymous collaborators.
          /* CompleteClass */
          var photoUrl: String = js.native
          
          // The session ID for this collaborator. A single user may have multiple sessions if they have the same document
          // open on multiple devices or in multiple browser tabs.
          /* CompleteClass */
          var sessionId: String = js.native
          
          // The user ID for this collaborator. This ID is stable for a given user and is compatible with most Google APIs
          // except the Drive API permission APIs. For an ID which is compatible with the Drive API permission APIs,
          // use the permissionId property.
          /* CompleteClass */
          var userId: String = js.native
        }
        
        @JSGlobal("gapi.drive.realtime.Document")
        @js.native
        open class Document ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.Document
        
        @JSGlobal("gapi.drive.realtime.Error")
        @js.native
        open class Error protected ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.Error {
          def this(`type`: String, message: String, isFatal: Boolean) = this()
          
          // Whether the error is fatal. Fatal errors cannot be recovered
          // from and require the document to be reloaded.
          /* CompleteClass */
          var isFatal: Boolean = js.native
          
          // A message describing the error.
          /* CompleteClass */
          var message: String = js.native
          
          // The type of the error that occurred.
          /* CompleteClass */
          var `type`: ErrorType = js.native
        }
        
        object ErrorType {
          
          @JSGlobal("gapi.drive.realtime.ErrorType")
          @js.native
          val ^ : js.Any = js.native
          
          // An internal error occurred in the Drive Realtime API client.
          @JSGlobal("gapi.drive.realtime.ErrorType.CLIENT_ERROR")
          @js.native
          def CLIENT_ERROR: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def CLIENT_ERROR_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_ERROR")(x.asInstanceOf[js.Any])
          
          // Another user created the document's initial state after
          // gapi.drive.realtime.load was called but before the local
          // creation was saved.
          @JSGlobal("gapi.drive.realtime.ErrorType.CONCURRENT_CREATION")
          @js.native
          def CONCURRENT_CREATION: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def CONCURRENT_CREATION_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONCURRENT_CREATION")(x.asInstanceOf[js.Any])
          
          // A network error occurred on a request to the
          // Realtime API server for a request which can not be
          // retried. The document may no longer be used after
          // this error has occurred. This error can only be
          // corrected by reloading the document.
          @JSGlobal("gapi.drive.realtime.ErrorType.FATAL_NETWORK_ERROR")
          @js.native
          def FATAL_NETWORK_ERROR: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def FATAL_NETWORK_ERROR_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FATAL_NETWORK_ERROR")(x.asInstanceOf[js.Any])
          
          // The user associated with the provided OAuth token
          // is not authorized to access the provided document
          // ID.
          @JSGlobal("gapi.drive.realtime.ErrorType.FORBIDDEN")
          @js.native
          def FORBIDDEN: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def FORBIDDEN_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORBIDDEN")(x.asInstanceOf[js.Any])
          
          // A compound operation was still open at the end of a
          // synchronous block. Compound operations must always
          // be ended in the same synchronous block that they
          // are started.
          @JSGlobal("gapi.drive.realtime.ErrorType.INVALID_COMPOUND_OPERATION")
          @js.native
          def INVALID_COMPOUND_OPERATION: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def INVALID_COMPOUND_OPERATION_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_COMPOUND_OPERATION")(x.asInstanceOf[js.Any])
          
          // The provided JSON element does not have the
          // expected type.
          @JSGlobal("gapi.drive.realtime.ErrorType.INVALID_ELEMENT_TYPE")
          @js.native
          def INVALID_ELEMENT_TYPE: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def INVALID_ELEMENT_TYPE_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ELEMENT_TYPE")(x.asInstanceOf[js.Any])
          
          // The user tried to decode a brix model that
          // contained invalid json.
          @JSGlobal("gapi.drive.realtime.ErrorType.INVALID_JSON_SYNTAX")
          @js.native
          def INVALID_JSON_SYNTAX: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def INVALID_JSON_SYNTAX_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_JSON_SYNTAX")(x.asInstanceOf[js.Any])
          
          // The user tried to decode a brix model that was
          // missing a neccessary property.
          @JSGlobal("gapi.drive.realtime.ErrorType.MISSING_PROPERTY")
          @js.native
          def MISSING_PROPERTY: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def MISSING_PROPERTY_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_PROPERTY")(x.asInstanceOf[js.Any])
          
          // The provided document ID could not be found.
          @JSGlobal("gapi.drive.realtime.ErrorType.NOT_FOUND")
          @js.native
          def NOT_FOUND: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def NOT_FOUND_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
          
          // The user does not have permission to edit the
          // document.
          @JSGlobal("gapi.drive.realtime.ErrorType.NO_WRITE_PERMISSION")
          @js.native
          def NO_WRITE_PERMISSION: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def NO_WRITE_PERMISSION_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_WRITE_PERMISSION")(x.asInstanceOf[js.Any])
          
          // An internal error occurred in the Drive Realtime
          // API server.
          @JSGlobal("gapi.drive.realtime.ErrorType.SERVER_ERROR")
          @js.native
          def SERVER_ERROR: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def SERVER_ERROR_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_ERROR")(x.asInstanceOf[js.Any])
          
          // The provided OAuth token is no longer valid and
          // must be refreshed.
          @JSGlobal("gapi.drive.realtime.ErrorType.TOKEN_REFRESH_REQUIRED")
          @js.native
          def TOKEN_REFRESH_REQUIRED: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def TOKEN_REFRESH_REQUIRED_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOKEN_REFRESH_REQUIRED")(x.asInstanceOf[js.Any])
          
          // The provided JSON element has the correct JSON type
          // but does not have the correct expected Realtime
          // type.
          @JSGlobal("gapi.drive.realtime.ErrorType.UNEXPECTED_ELEMENT")
          @js.native
          def UNEXPECTED_ELEMENT: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
          inline def UNEXPECTED_ELEMENT_=(x: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNEXPECTED_ELEMENT")(x.asInstanceOf[js.Any])
        }
        
        object EventType {
          
          @JSGlobal("gapi.drive.realtime.EventType")
          @js.native
          val ^ : js.Any = js.native
          
          // A metadata attribute of the document changed. This is fired on changes to:
          // gapi.drive.realtime.Attribute.IS_READ_ONLY
          // Listen on the gapi.drive.realtime.Document for these changes.
          // attribute_changed
          @JSGlobal("gapi.drive.realtime.EventType.ATTRIBUTE_CHANGED")
          @js.native
          def ATTRIBUTE_CHANGED: attribute_changed = js.native
          inline def ATTRIBUTE_CHANGED_=(x: attribute_changed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_CHANGED")(x.asInstanceOf[js.Any])
          
          // A new collaborator joined the document. Listen on the gapi.drive.realtime.Document for these changes.
          // collaborator_joined
          @JSGlobal("gapi.drive.realtime.EventType.COLLABORATOR_JOINED")
          @js.native
          def COLLABORATOR_JOINED: collaborator_joined = js.native
          inline def COLLABORATOR_JOINED_=(x: collaborator_joined): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLABORATOR_JOINED")(x.asInstanceOf[js.Any])
          
          // A collaborator left the document. Listen on the gapi.drive.realtime.Document for these changes.
          // collaborator_left
          @JSGlobal("gapi.drive.realtime.EventType.COLLABORATOR_LEFT")
          @js.native
          def COLLABORATOR_LEFT: collaborator_left = js.native
          inline def COLLABORATOR_LEFT_=(x: collaborator_left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLABORATOR_LEFT")(x.asInstanceOf[js.Any])
          
          // The document save state changed. Listen on the gapi.drive.realtime.Document for these changes.
          // document_save_state_changed
          @JSGlobal("gapi.drive.realtime.EventType.DOCUMENT_SAVE_STATE_CHANGED")
          @js.native
          def DOCUMENT_SAVE_STATE_CHANGED: document_save_state_changed = js.native
          inline def DOCUMENT_SAVE_STATE_CHANGED_=(x: document_save_state_changed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_SAVE_STATE_CHANGED")(x.asInstanceOf[js.Any])
          
          // A collaborative object has changed. This event wraps a specific event, and bubbles to ancestors.
          // Defaults to object_changed.
          @JSGlobal("gapi.drive.realtime.EventType.OBJECT_CHANGED")
          @js.native
          def OBJECT_CHANGED: object_changed = js.native
          inline def OBJECT_CHANGED_=(x: object_changed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_CHANGED")(x.asInstanceOf[js.Any])
          
          // An index reference changed.
          // reference_shifted
          @JSGlobal("gapi.drive.realtime.EventType.REFERENCE_SHIFTED")
          @js.native
          def REFERENCE_SHIFTED: reference_shifted = js.native
          inline def REFERENCE_SHIFTED_=(x: reference_shifted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REFERENCE_SHIFTED")(x.asInstanceOf[js.Any])
          
          // Text has been removed from a string.
          // text_deleted
          @JSGlobal("gapi.drive.realtime.EventType.TEXT_DELETED")
          @js.native
          def TEXT_DELETED: text_deleted = js.native
          inline def TEXT_DELETED_=(x: text_deleted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_DELETED")(x.asInstanceOf[js.Any])
          
          // Text has been inserted into a string.
          // text_inserted
          @JSGlobal("gapi.drive.realtime.EventType.TEXT_INSERTED")
          @js.native
          def TEXT_INSERTED: text_inserted = js.native
          inline def TEXT_INSERTED_=(x: text_inserted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_INSERTED")(x.asInstanceOf[js.Any])
          
          // The model canUndo/canRedo state changed. Listen on the gapi.drive.realtime.Model for these changes.
          // undo_redo_state_changed
          @JSGlobal("gapi.drive.realtime.EventType.UNDO_REDO_STATE_CHANGED")
          @js.native
          def UNDO_REDO_STATE_CHANGED: undo_redo_state_changed = js.native
          inline def UNDO_REDO_STATE_CHANGED_=(x: undo_redo_state_changed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNDO_REDO_STATE_CHANGED")(x.asInstanceOf[js.Any])
          
          // New values have been added to the list.
          // values_added
          @JSGlobal("gapi.drive.realtime.EventType.VALUES_ADDED")
          @js.native
          def VALUES_ADDED: values_added = js.native
          inline def VALUES_ADDED_=(x: values_added): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUES_ADDED")(x.asInstanceOf[js.Any])
          
          // Values have been removed from the list.
          // values_removed
          @JSGlobal("gapi.drive.realtime.EventType.VALUES_REMOVED")
          @js.native
          def VALUES_REMOVED: values_removed = js.native
          inline def VALUES_REMOVED_=(x: values_removed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUES_REMOVED")(x.asInstanceOf[js.Any])
          
          // Values in a list are changed in place.
          // Defaults to values_set.
          @JSGlobal("gapi.drive.realtime.EventType.VALUES_SET")
          @js.native
          def VALUES_SET: values_set = js.native
          inline def VALUES_SET_=(x: values_set): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUES_SET")(x.asInstanceOf[js.Any])
          
          // A map or custom object value has changed. Note this could be a new value or deleted value.
          // value_changed
          @JSGlobal("gapi.drive.realtime.EventType.VALUE_CHANGED")
          @js.native
          def VALUE_CHANGED: value_changed = js.native
          inline def VALUE_CHANGED_=(x: value_changed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_CHANGED")(x.asInstanceOf[js.Any])
        }
        
        @JSGlobal("gapi.drive.realtime.IndexReference")
        @js.native
        open class IndexReference[V] ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.IndexReference[V]
        /* static members */
        object IndexReference {
          
          @JSGlobal("gapi.drive.realtime.IndexReference")
          @js.native
          val ^ : js.Any = js.native
          
          // (Categories of) the shift behavior of an index reference when the element it points at is deleted.
          @JSGlobal("gapi.drive.realtime.IndexReference.DeleteMode")
          @js.native
          def DeleteMode: SHIFTAFTERDELETE = js.native
          inline def DeleteMode_=(x: SHIFTAFTERDELETE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeleteMode")(x.asInstanceOf[js.Any])
        }
        
        @JSGlobal("gapi.drive.realtime.Model")
        @js.native
        open class Model ()
          extends StObject
             with typings.googleDriveRealtimeApi.gapi.drive.realtime.Model
        
        object databinding {
          
          @JSGlobal("gapi.drive.realtime.databinding")
          @js.native
          val ^ : js.Any = js.native
          
          inline def bindString(
            s: typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeString,
            textinput: HTMLInputElement
          ): Binding = (^.asInstanceOf[js.Dynamic].applyDynamic("bindString")(s.asInstanceOf[js.Any], textinput.asInstanceOf[js.Any])).asInstanceOf[Binding]
        }
        
        inline def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
        
        inline def load(fileId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: Unit,
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: Unit,
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: Unit,
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def load(
          fileId: String,
          onLoaded: Unit,
          opt_initializerFn: Unit,
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fileId.asInstanceOf[js.Any], onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def loadAppDataDocument(onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAppDataDocument")(onLoaded.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def loadAppDataDocument(
          onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAppDataDocument")(onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def loadAppDataDocument(
          onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAppDataDocument")(onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def loadAppDataDocument(
          onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: Unit,
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAppDataDocument")(onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def loadFromJson(json: String): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromJson")(json.asInstanceOf[js.Any]).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def loadFromJson(
          json: String,
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromJson")(json.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        
        inline def newInMemoryDocument(): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")().asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any]).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
          opt_initializerFn: Unit,
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: Unit,
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: Unit,
          opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
        inline def newInMemoryDocument(
          opt_onLoaded: Unit,
          opt_initializerFn: Unit,
          opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
        ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("newInMemoryDocument")(opt_onLoaded.asInstanceOf[js.Any], opt_initializerFn.asInstanceOf[js.Any], opt_errorFn.asInstanceOf[js.Any])).asInstanceOf[typings.googleDriveRealtimeApi.gapi.drive.realtime.Document]
      }
    }
  }
  
  // rtclient is a global var introduced by realtime-client-utils.js
  object rtclient {
    
    @JSGlobal("rtclient")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("rtclient.RealtimeLoader")
    @js.native
    def RealtimeLoader: RealtimeLoaderFactory = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("rtclient.RealtimeLoader")
    @js.native
    open class RealtimeLoaderCls protected ()
      extends StObject
         with RealtimeLoader {
      def this(options: LoaderOptions) = this()
      
      /* CompleteClass */
      override def handleErrors(e: Error): Unit = js.native
      
      /* CompleteClass */
      override def load(): Unit = js.native
      
      /* CompleteClass */
      override def start(): Unit = js.native
    }
    
    inline def RealtimeLoader_=(x: RealtimeLoaderFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RealtimeLoader")(x.asInstanceOf[js.Any])
    
    inline def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createRealtimeFile")(title.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // INCOMPLETE
    object params {
      
      @JSGlobal("rtclient.params")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("rtclient.params.fileIds")
      @js.native
      def fileIds: String = js.native
      inline def fileIds_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileIds")(x.asInstanceOf[js.Any])
    }
  }
}
