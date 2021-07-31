package typings.googleDriveRealtimeApi

import typings.googleDriveRealtimeApi.gapi.drive.realtime.CollaborativeObjectType
import typings.googleDriveRealtimeApi.gapi.drive.realtime.ErrorType
import typings.googleDriveRealtimeApi.gapi.drive.realtime.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleDriveRealtimeApiStrings {
  
  @js.native
  sealed trait EditableString
    extends StObject
       with CollaborativeObjectType
  @scala.inline
  def EditableString: EditableString = "EditableString".asInstanceOf[EditableString]
  
  @js.native
  sealed trait List
    extends StObject
       with CollaborativeObjectType
  @scala.inline
  def List: List = "List".asInstanceOf[List]
  
  @js.native
  sealed trait Map
    extends StObject
       with CollaborativeObjectType
  @scala.inline
  def Map: Map = "Map".asInstanceOf[Map]
  
  @js.native
  sealed trait attribute_changed
    extends StObject
       with EventType
  @scala.inline
  def attribute_changed: attribute_changed = "attribute_changed".asInstanceOf[attribute_changed]
  
  @js.native
  sealed trait client_error
    extends StObject
       with ErrorType
  @scala.inline
  def client_error: client_error = "client_error".asInstanceOf[client_error]
  
  @js.native
  sealed trait collaborator_joined
    extends StObject
       with EventType
  @scala.inline
  def collaborator_joined: collaborator_joined = "collaborator_joined".asInstanceOf[collaborator_joined]
  
  @js.native
  sealed trait collaborator_left
    extends StObject
       with EventType
  @scala.inline
  def collaborator_left: collaborator_left = "collaborator_left".asInstanceOf[collaborator_left]
  
  @js.native
  sealed trait concurrent_creation
    extends StObject
       with ErrorType
  @scala.inline
  def concurrent_creation: concurrent_creation = "concurrent_creation".asInstanceOf[concurrent_creation]
  
  @js.native
  sealed trait document_save_state_changed
    extends StObject
       with EventType
  @scala.inline
  def document_save_state_changed: document_save_state_changed = "document_save_state_changed".asInstanceOf[document_save_state_changed]
  
  @js.native
  sealed trait fatal_network_error
    extends StObject
       with ErrorType
  @scala.inline
  def fatal_network_error: fatal_network_error = "fatal_network_error".asInstanceOf[fatal_network_error]
  
  @js.native
  sealed trait forbidden
    extends StObject
       with ErrorType
  @scala.inline
  def forbidden: forbidden = "forbidden".asInstanceOf[forbidden]
  
  @js.native
  sealed trait invalid_compound_operation
    extends StObject
       with ErrorType
  @scala.inline
  def invalid_compound_operation: invalid_compound_operation = "invalid_compound_operation".asInstanceOf[invalid_compound_operation]
  
  @js.native
  sealed trait invalid_element_type
    extends StObject
       with ErrorType
  @scala.inline
  def invalid_element_type: invalid_element_type = "invalid_element_type".asInstanceOf[invalid_element_type]
  
  @js.native
  sealed trait invalid_json_syntax
    extends StObject
       with ErrorType
  @scala.inline
  def invalid_json_syntax: invalid_json_syntax = "invalid_json_syntax".asInstanceOf[invalid_json_syntax]
  
  @js.native
  sealed trait missing_property
    extends StObject
       with ErrorType
  @scala.inline
  def missing_property: missing_property = "missing_property".asInstanceOf[missing_property]
  
  @js.native
  sealed trait no_write_permission
    extends StObject
       with ErrorType
  @scala.inline
  def no_write_permission: no_write_permission = "no_write_permission".asInstanceOf[no_write_permission]
  
  @js.native
  sealed trait not_found
    extends StObject
       with ErrorType
  @scala.inline
  def not_found: not_found = "not_found".asInstanceOf[not_found]
  
  @js.native
  sealed trait object_changed
    extends StObject
       with EventType
  @scala.inline
  def object_changed: object_changed = "object_changed".asInstanceOf[object_changed]
  
  @js.native
  sealed trait reference_shifted
    extends StObject
       with EventType
  @scala.inline
  def reference_shifted: reference_shifted = "reference_shifted".asInstanceOf[reference_shifted]
  
  @js.native
  sealed trait server_error
    extends StObject
       with ErrorType
  @scala.inline
  def server_error: server_error = "server_error".asInstanceOf[server_error]
  
  @js.native
  sealed trait text_deleted
    extends StObject
       with EventType
  @scala.inline
  def text_deleted: text_deleted = "text_deleted".asInstanceOf[text_deleted]
  
  @js.native
  sealed trait text_inserted
    extends StObject
       with EventType
  @scala.inline
  def text_inserted: text_inserted = "text_inserted".asInstanceOf[text_inserted]
  
  @js.native
  sealed trait token_refresh_required
    extends StObject
       with ErrorType
  @scala.inline
  def token_refresh_required: token_refresh_required = "token_refresh_required".asInstanceOf[token_refresh_required]
  
  @js.native
  sealed trait undo_redo_state_changed
    extends StObject
       with EventType
  @scala.inline
  def undo_redo_state_changed: undo_redo_state_changed = "undo_redo_state_changed".asInstanceOf[undo_redo_state_changed]
  
  @js.native
  sealed trait unexpected_element
    extends StObject
       with ErrorType
  @scala.inline
  def unexpected_element: unexpected_element = "unexpected_element".asInstanceOf[unexpected_element]
  
  @js.native
  sealed trait value_changed
    extends StObject
       with EventType
  @scala.inline
  def value_changed: value_changed = "value_changed".asInstanceOf[value_changed]
  
  @js.native
  sealed trait values_added
    extends StObject
       with EventType
  @scala.inline
  def values_added: values_added = "values_added".asInstanceOf[values_added]
  
  @js.native
  sealed trait values_removed
    extends StObject
       with EventType
  @scala.inline
  def values_removed: values_removed = "values_removed".asInstanceOf[values_removed]
  
  @js.native
  sealed trait values_set
    extends StObject
       with EventType
  @scala.inline
  def values_set: values_set = "values_set".asInstanceOf[values_set]
}
