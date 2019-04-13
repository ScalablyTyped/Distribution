package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.concurrent_creation
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.invalid_compound_operation
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.invalid_json_syntax
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.missing_property
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.not_found
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.forbidden
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.server_error
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.client_error
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.token_refresh_required
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.invalid_element_type
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.no_write_permission
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.fatal_network_error
  - googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.unexpected_element
*/
trait ErrorType extends js.Object

@JSGlobal("gapi.drive.realtime.ErrorType")
@js.native
object ErrorType extends js.Object {
  // An internal error occurred in the Drive Realtime API client.
  var CLIENT_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // Another user created the document's initial state after
  // gapi.drive.realtime.load was called but before the local
  // creation was saved.
  var CONCURRENT_CREATION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // A network error occurred on a request to the
  // Realtime API server for a request which can not be
  // retried. The document may no longer be used after
  // this error has occurred. This error can only be
  // corrected by reloading the document.
  var FATAL_NETWORK_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The user associated with the provided OAuth token
  // is not authorized to access the provided document
  // ID.
  var FORBIDDEN: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // A compound operation was still open at the end of a
  // synchronous block. Compound operations must always
  // be ended in the same synchronous block that they
  // are started.
  var INVALID_COMPOUND_OPERATION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The provided JSON element does not have the
  // expected type.
  var INVALID_ELEMENT_TYPE: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The user tried to decode a brix model that
  // contained invalid json.
  var INVALID_JSON_SYNTAX: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The user tried to decode a brix model that was
  // missing a neccessary property.
  var MISSING_PROPERTY: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The provided document ID could not be found.
  var NOT_FOUND: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The user does not have permission to edit the
  // document.
  var NO_WRITE_PERMISSION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // An internal error occurred in the Drive Realtime
  // API server.
  var SERVER_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The provided OAuth token is no longer valid and
  // must be refreshed.
  var TOKEN_REFRESH_REQUIRED: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
  // The provided JSON element has the correct JSON type
  // but does not have the correct expected Realtime
  // type.
  var UNEXPECTED_ELEMENT: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType = js.native
}

