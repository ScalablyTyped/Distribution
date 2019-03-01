package typings
package googleDashDriveDashRealtimeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CLIENTERROR extends js.Object {
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

object Anon_CLIENTERROR {
  @scala.inline
  def apply(
    CLIENT_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    CONCURRENT_CREATION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    FATAL_NETWORK_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    FORBIDDEN: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    INVALID_COMPOUND_OPERATION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    INVALID_ELEMENT_TYPE: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    INVALID_JSON_SYNTAX: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    MISSING_PROPERTY: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    NOT_FOUND: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    NO_WRITE_PERMISSION: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    SERVER_ERROR: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    TOKEN_REFRESH_REQUIRED: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType,
    UNEXPECTED_ELEMENT: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.ErrorType
  ): Anon_CLIENTERROR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CLIENT_ERROR")(CLIENT_ERROR)
    __obj.updateDynamic("CONCURRENT_CREATION")(CONCURRENT_CREATION)
    __obj.updateDynamic("FATAL_NETWORK_ERROR")(FATAL_NETWORK_ERROR)
    __obj.updateDynamic("FORBIDDEN")(FORBIDDEN)
    __obj.updateDynamic("INVALID_COMPOUND_OPERATION")(INVALID_COMPOUND_OPERATION)
    __obj.updateDynamic("INVALID_ELEMENT_TYPE")(INVALID_ELEMENT_TYPE)
    __obj.updateDynamic("INVALID_JSON_SYNTAX")(INVALID_JSON_SYNTAX)
    __obj.updateDynamic("MISSING_PROPERTY")(MISSING_PROPERTY)
    __obj.updateDynamic("NOT_FOUND")(NOT_FOUND)
    __obj.updateDynamic("NO_WRITE_PERMISSION")(NO_WRITE_PERMISSION)
    __obj.updateDynamic("SERVER_ERROR")(SERVER_ERROR)
    __obj.updateDynamic("TOKEN_REFRESH_REQUIRED")(TOKEN_REFRESH_REQUIRED)
    __obj.updateDynamic("UNEXPECTED_ELEMENT")(UNEXPECTED_ELEMENT)
    __obj.asInstanceOf[Anon_CLIENTERROR]
  }
}

