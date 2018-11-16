package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusCode extends js.Object

@JSImport("dialogflow", "StatusCode")
@js.native
object StatusCode extends js.Object {
  // The operation was aborted, typically due to a concurrency issue such as
  // a sequencer check failure or transaction abort.
  //
  // See the guidelines above for deciding between `FAILED_PRECONDITION`,
  // `ABORTED`, and `UNAVAILABLE`.
  //
  // HTTP Mapping: 409 Conflict
  @js.native
  sealed trait ABORTED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The entity that a client attempted to create (e.g., file or directory)
  // already exists.
  //
  // HTTP Mapping: 409 Conflict
  @js.native
  sealed trait ALREADY_EXISTS
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The operation was cancelled, typically by the caller.
  //
  // HTTP Mapping: 499 Client Closed Request
  @js.native
  sealed trait CANCELLED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // Unrecoverable data loss or corruption.
  //
  // HTTP Mapping: 500 Internal Server Error
  @js.native
  sealed trait DATA_LOSS
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The deadline expired before the operation could complete. For operations
  // that change the state of the system, this error may be returned
  // even if the operation has completed successfully.  For example, a
  // successful response from a server could have been delayed long
  // enough for the deadline to expire.
  //
  // HTTP Mapping: 504 Gateway Timeout
  @js.native
  sealed trait DEADLINE_EXCEEDED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The operation was rejected because the system is not in a state
  // required for the operation's execution.  For example, the directory
  // to be deleted is non-empty, an rmdir operation is applied to
  // a non-directory, etc.
  //
  // Service implementors can use the following guidelines to decide
  // between `FAILED_PRECONDITION`, `ABORTED`, and `UNAVAILABLE`:
  //  (a) Use `UNAVAILABLE` if the client can retry just the failing call.
  //  (b) Use `ABORTED` if the client should retry at a higher level
  //      (e.g., when a client-specified test-and-set fails, indicating the
  //      client should restart a read-modify-write sequence).
  //  (c) Use `FAILED_PRECONDITION` if the client should not retry until
  //      the system state has been explicitly fixed.  E.g., if an "rmdir"
  //      fails because the directory is non-empty, `FAILED_PRECONDITION`
  //      should be returned since the client should not retry unless
  //      the files are deleted from the directory.
  //
  // HTTP Mapping: 400 Bad Request
  @js.native
  sealed trait FAILED_PRECONDITION
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // Internal errors.  This means that some invariants expected by the
  // underlying system have been broken.  This error code is reserved
  // for serious errors.
  //
  // HTTP Mapping: 500 Internal Server Error
  @js.native
  sealed trait INTERNAL
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The client specified an invalid argument.  Note that this differs
  // from `FAILED_PRECONDITION`.  `INVALID_ARGUMENT` indicates arguments
  // that are problematic regardless of the state of the system
  // (e.g., a malformed file name).
  //
  // HTTP Mapping: 400 Bad Request
  @js.native
  sealed trait INVALID_ARGUMENT
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // Some requested entity (e.g., file or directory) was not found.
  //
  // Note to server developers: if a request is denied for an entire class
  // of users, such as gradual feature rollout or undocumented whitelist,
  // `NOT_FOUND` may be used. If a request is denied for some users within
  // a class of users, such as user-based access control, `PERMISSION_DENIED`
  // must be used.
  //
  // HTTP Mapping: 404 Not Found
  @js.native
  sealed trait NOT_FOUND
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // Not an error; returned on success
  //
  // HTTP Mapping: 200 OK
  @js.native
  sealed trait OK
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The operation was attempted past the valid range.  E.g., seeking or
  // reading past end-of-file.
  //
  // Unlike `INVALID_ARGUMENT`, this error indicates a problem that may
  // be fixed if the system state changes. For example, a 32-bit file
  // system will generate `INVALID_ARGUMENT` if asked to read at an
  // offset that is not in the range [0,2^32-1], but it will generate
  // `OUT_OF_RANGE` if asked to read from an offset past the current
  // file size.
  //
  // There is a fair bit of overlap between `FAILED_PRECONDITION` and
  // `OUT_OF_RANGE`.  We recommend using `OUT_OF_RANGE` (the more specific
  // error) when it applies so that callers who are iterating through
  // a space can easily look for an `OUT_OF_RANGE` error to detect when
  // they are done.
  //
  // HTTP Mapping: 400 Bad Request
  @js.native
  sealed trait OUT_OF_RANGE
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The caller does not have permission to execute the specified
  // operation. `PERMISSION_DENIED` must not be used for rejections
  // caused by exhausting some resource (use `RESOURCE_EXHAUSTED`
  // instead for those errors). `PERMISSION_DENIED` must not be
  // used if the caller can not be identified (use `UNAUTHENTICATED`
  // instead for those errors). This error code does not imply the
  // request is valid or the requested entity exists or satisfies
  // other pre-conditions.
  //
  // HTTP Mapping: 403 Forbidden
  @js.native
  sealed trait PERMISSION_DENIED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // Some resource has been exhausted, perhaps a per-user quota, or
  // perhaps the entire file system is out of space.
  //
  // HTTP Mapping: 429 Too Many Requests
  @js.native
  sealed trait RESOURCE_EXHAUSTED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The request does not have valid authentication credentials for the
  // operation.
  //
  // HTTP Mapping: 401 Unauthorized
  @js.native
  sealed trait UNAUTHENTICATED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The service is currently unavailable.  This is most likely a
  // transient condition, which can be corrected by retrying with
  // a backoff.
  //
  // See the guidelines above for deciding between `FAILED_PRECONDITION`,
  // `ABORTED`, and `UNAVAILABLE`.
  //
  // HTTP Mapping: 503 Service Unavailable
  @js.native
  sealed trait UNAVAILABLE
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // The operation is not implemented or is not supported/enabled in this
  // service.
  //
  // HTTP Mapping: 501 Not Implemented
  @js.native
  sealed trait UNIMPLEMENTED
    extends dialogflowLib.dialogflowMod.StatusCode
  
  // Unknown error.  For example, this error may be returned when
  // a `Status` value received from another address space belongs to
  // an error space that is not known in this address space.  Also
  // errors raised by APIs that do not return enough error information
  // may be converted to this error.
  //
  // HTTP Mapping: 500 Internal Server Error
  @js.native
  sealed trait UNKNOWN
    extends dialogflowLib.dialogflowMod.StatusCode
  
  /* 10 */ val ABORTED: ABORTED with scala.Double = js.native
  /* 6 */ val ALREADY_EXISTS: ALREADY_EXISTS with scala.Double = js.native
  /* 1 */ val CANCELLED: CANCELLED with scala.Double = js.native
  /* 15 */ val DATA_LOSS: DATA_LOSS with scala.Double = js.native
  /* 4 */ val DEADLINE_EXCEEDED: DEADLINE_EXCEEDED with scala.Double = js.native
  /* 9 */ val FAILED_PRECONDITION: FAILED_PRECONDITION with scala.Double = js.native
  /* 13 */ val INTERNAL: INTERNAL with scala.Double = js.native
  /* 3 */ val INVALID_ARGUMENT: INVALID_ARGUMENT with scala.Double = js.native
  /* 5 */ val NOT_FOUND: NOT_FOUND with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 11 */ val OUT_OF_RANGE: OUT_OF_RANGE with scala.Double = js.native
  /* 7 */ val PERMISSION_DENIED: PERMISSION_DENIED with scala.Double = js.native
  /* 8 */ val RESOURCE_EXHAUSTED: RESOURCE_EXHAUSTED with scala.Double = js.native
  /* 16 */ val UNAUTHENTICATED: UNAUTHENTICATED with scala.Double = js.native
  /* 14 */ val UNAVAILABLE: UNAVAILABLE with scala.Double = js.native
  /* 12 */ val UNIMPLEMENTED: UNIMPLEMENTED with scala.Double = js.native
  /* 2 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dialogflowLib.dialogflowMod.StatusCode with scala.Double] = js.native
}

