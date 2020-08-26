package typings.googleDriveRealtimeApi.global

import typings.googleDriveRealtimeApi.anon.SHIFTAFTERDELETE
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
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi")
@js.native
object gapi extends js.Object {
  @js.native
  object drive extends js.Object {
    @js.native
    object realtime extends js.Object {
      @js.native
      class CollaborativeList[V] ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeList[V]
      
      @js.native
      class CollaborativeMap[V] ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeMap[V]
      
      @js.native
      class CollaborativeObject ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeObject
      
      @js.native
      class CollaborativeString ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeString
      
      @js.native
      class Collaborator protected ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.Collaborator {
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
      }
      
      @js.native
      class Document ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.Document
      
      @js.native
      class Error protected ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.Error {
        def this(`type`: String, message: String, isFatal: Boolean) = this()
      }
      
      @js.native
      class IndexReference[V] ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.IndexReference[V]
      
      @js.native
      class Model ()
        extends typings.googleDriveRealtimeApi.gapi.drive.realtime.Model
      
      def debug(): Unit = js.native
      def load(fileId: String): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.UndefOr[scala.Nothing],
        opt_initializerFn: js.UndefOr[scala.Nothing],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.UndefOr[scala.Nothing],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
      ): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.UndefOr[scala.Nothing],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit]
      ): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.UndefOr[scala.Nothing],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
      ): Unit = js.native
      def load(
        fileId: String,
        onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): Unit = js.native
      def loadAppDataDocument(onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit]): Unit = js.native
      def loadAppDataDocument(
        onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.UndefOr[scala.Nothing],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): Unit = js.native
      def loadAppDataDocument(
        onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
      ): Unit = js.native
      def loadAppDataDocument(
        onLoaded: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.Function1[/* x */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): Unit = js.native
      def loadFromJson(json: String): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def loadFromJson(
        json: String,
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.UndefOr[scala.Nothing],
        opt_initializerFn: js.UndefOr[scala.Nothing],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.UndefOr[scala.Nothing],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.UndefOr[scala.Nothing],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.UndefOr[scala.Nothing],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      def newInMemoryDocument(
        opt_onLoaded: js.Function1[/* d */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Document, Unit],
        opt_initializerFn: js.Function1[/* m */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Model, Unit],
        opt_errorFn: js.Function1[/* e */ typings.googleDriveRealtimeApi.gapi.drive.realtime.Error, Unit]
      ): typings.googleDriveRealtimeApi.gapi.drive.realtime.Document = js.native
      /* static members */
      @js.native
      object CollaborativeList extends js.Object {
        var `type`: List = js.native
      }
      
      /* static members */
      @js.native
      object CollaborativeMap extends js.Object {
        var `type`: Map = js.native
      }
      
      /* static members */
      @js.native
      object CollaborativeString extends js.Object {
        var `type`: EditableString = js.native
      }
      
      @js.native
      object ErrorType extends js.Object {
        // An internal error occurred in the Drive Realtime API client.
        var CLIENT_ERROR: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // Another user created the document's initial state after
        // gapi.drive.realtime.load was called but before the local
        // creation was saved.
        var CONCURRENT_CREATION: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // A network error occurred on a request to the
        // Realtime API server for a request which can not be
        // retried. The document may no longer be used after
        // this error has occurred. This error can only be
        // corrected by reloading the document.
        var FATAL_NETWORK_ERROR: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The user associated with the provided OAuth token
        // is not authorized to access the provided document
        // ID.
        var FORBIDDEN: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // A compound operation was still open at the end of a
        // synchronous block. Compound operations must always
        // be ended in the same synchronous block that they
        // are started.
        var INVALID_COMPOUND_OPERATION: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The provided JSON element does not have the
        // expected type.
        var INVALID_ELEMENT_TYPE: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The user tried to decode a brix model that
        // contained invalid json.
        var INVALID_JSON_SYNTAX: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The user tried to decode a brix model that was
        // missing a neccessary property.
        var MISSING_PROPERTY: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The provided document ID could not be found.
        var NOT_FOUND: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The user does not have permission to edit the
        // document.
        var NO_WRITE_PERMISSION: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // An internal error occurred in the Drive Realtime
        // API server.
        var SERVER_ERROR: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The provided OAuth token is no longer valid and
        // must be refreshed.
        var TOKEN_REFRESH_REQUIRED: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
        // The provided JSON element has the correct JSON type
        // but does not have the correct expected Realtime
        // type.
        var UNEXPECTED_ELEMENT: typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType = js.native
      }
      
      @js.native
      object EventType extends js.Object {
        // A metadata attribute of the document changed. This is fired on changes to:
        // gapi.drive.realtime.Attribute.IS_READ_ONLY
        // Listen on the gapi.drive.realtime.Document for these changes.
        // attribute_changed
        var ATTRIBUTE_CHANGED: attribute_changed = js.native
        // A new collaborator joined the document. Listen on the gapi.drive.realtime.Document for these changes.
        // collaborator_joined
        var COLLABORATOR_JOINED: collaborator_joined = js.native
        // A collaborator left the document. Listen on the gapi.drive.realtime.Document for these changes.
        // collaborator_left
        var COLLABORATOR_LEFT: collaborator_left = js.native
        // The document save state changed. Listen on the gapi.drive.realtime.Document for these changes.
        // document_save_state_changed
        var DOCUMENT_SAVE_STATE_CHANGED: document_save_state_changed = js.native
        // A collaborative object has changed. This event wraps a specific event, and bubbles to ancestors.
        // Defaults to object_changed.
        var OBJECT_CHANGED: object_changed = js.native
        // An index reference changed.
        // reference_shifted
        var REFERENCE_SHIFTED: reference_shifted = js.native
        // Text has been removed from a string.
        // text_deleted
        var TEXT_DELETED: text_deleted = js.native
        // Text has been inserted into a string.
        // text_inserted
        var TEXT_INSERTED: text_inserted = js.native
        // The model canUndo/canRedo state changed. Listen on the gapi.drive.realtime.Model for these changes.
        // undo_redo_state_changed
        var UNDO_REDO_STATE_CHANGED: undo_redo_state_changed = js.native
        // New values have been added to the list.
        // values_added
        var VALUES_ADDED: values_added = js.native
        // Values have been removed from the list.
        // values_removed
        var VALUES_REMOVED: values_removed = js.native
        // Values in a list are changed in place.
        // Defaults to values_set.
        var VALUES_SET: values_set = js.native
        // A map or custom object value has changed. Note this could be a new value or deleted value.
        // value_changed
        var VALUE_CHANGED: value_changed = js.native
      }
      
      /* static members */
      @js.native
      object IndexReference extends js.Object {
        // (Categories of) the shift behavior of an index reference when the element it points at is deleted.
        var DeleteMode: SHIFTAFTERDELETE = js.native
      }
      
      @js.native
      object databinding extends js.Object {
        def bindString(
          s: typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeString,
          textinput: HTMLInputElement
        ): Binding = js.native
      }
      
    }
    
  }
  
}

