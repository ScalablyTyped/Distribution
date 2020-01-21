package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ErrorType extends js.Object

@JSGlobal("gapi.drive.realtime.ErrorType")
@js.native
object ErrorType extends js.Object {
  // An internal error occurred in the Drive Realtime API client.
  var CLIENT_ERROR: ErrorType = js.native
  // Another user created the document's initial state after
  // gapi.drive.realtime.load was called but before the local
  // creation was saved.
  var CONCURRENT_CREATION: ErrorType = js.native
  // A network error occurred on a request to the
  // Realtime API server for a request which can not be
  // retried. The document may no longer be used after
  // this error has occurred. This error can only be
  // corrected by reloading the document.
  var FATAL_NETWORK_ERROR: ErrorType = js.native
  // The user associated with the provided OAuth token
  // is not authorized to access the provided document
  // ID.
  var FORBIDDEN: ErrorType = js.native
  // A compound operation was still open at the end of a
  // synchronous block. Compound operations must always
  // be ended in the same synchronous block that they
  // are started.
  var INVALID_COMPOUND_OPERATION: ErrorType = js.native
  // The provided JSON element does not have the
  // expected type.
  var INVALID_ELEMENT_TYPE: ErrorType = js.native
  // The user tried to decode a brix model that
  // contained invalid json.
  var INVALID_JSON_SYNTAX: ErrorType = js.native
  // The user tried to decode a brix model that was
  // missing a neccessary property.
  var MISSING_PROPERTY: ErrorType = js.native
  // The provided document ID could not be found.
  var NOT_FOUND: ErrorType = js.native
  // The user does not have permission to edit the
  // document.
  var NO_WRITE_PERMISSION: ErrorType = js.native
  // An internal error occurred in the Drive Realtime
  // API server.
  var SERVER_ERROR: ErrorType = js.native
  // The provided OAuth token is no longer valid and
  // must be refreshed.
  var TOKEN_REFRESH_REQUIRED: ErrorType = js.native
  // The provided JSON element has the correct JSON type
  // but does not have the correct expected Realtime
  // type.
  var UNEXPECTED_ELEMENT: ErrorType = js.native
}

