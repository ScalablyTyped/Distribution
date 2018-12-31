package typings
package googleDashDriveDashRealtimeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NOWRITEPERMISSION extends js.Object {
  // An internal error occurred in the Drive Realtime API client.
  var CLIENT_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // Another user created the document's initial state after
  // gapi.drive.realtime.load was called but before the local
  // creation was saved.
  var CONCURRENT_CREATION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // A network error occurred on a request to the
  // Realtime API server for a request which can not be
  // retried. The document may no longer be used after
  // this error has occurred. This error can only be
  // corrected by reloading the document.
  var FATAL_NETWORK_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The user associated with the provided OAuth token
  // is not authorized to access the provided document
  // ID.
  var FORBIDDEN: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // A compound operation was still open at the end of a
  // synchronous block. Compound operations must always
  // be ended in the same synchronous block that they
  // are started.
  var INVALID_COMPOUND_OPERATION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The provided JSON element does not have the
  // expected type.
  var INVALID_ELEMENT_TYPE: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The user tried to decode a brix model that
  // contained invalid json.
  var INVALID_JSON_SYNTAX: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The user tried to decode a brix model that was
  // missing a neccessary property.
  var MISSING_PROPERTY: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The provided document ID could not be found.
  var NOT_FOUND: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The user does not have permission to edit the
  // document.
  var NO_WRITE_PERMISSION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // An internal error occurred in the Drive Realtime
  // API server.
  var SERVER_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The provided OAuth token is no longer valid and
  // must be refreshed.
  var TOKEN_REFRESH_REQUIRED: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  // The provided JSON element has the correct JSON type
  // but does not have the correct expected Realtime
  // type.
  var UNEXPECTED_ELEMENT: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
}

