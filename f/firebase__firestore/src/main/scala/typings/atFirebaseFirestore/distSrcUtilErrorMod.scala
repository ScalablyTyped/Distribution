package typings.atFirebaseFirestore

import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreErrorCode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/error", JSImport.Namespace)
@js.native
object distSrcUtilErrorMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreError because var conflicts: message, name, stack. Inlined code */ @js.native
  class FirestoreError protected () extends Error {
    def this(code: Code, message: String) = this()
    val code: Code | FirestoreErrorCode = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  object Code extends js.Object {
    /**
      * The operation was aborted, typically due to a concurrency issue like
      * sequencer check failures, transaction aborts, etc.
      *
      * See litmus test above for deciding between FAILED_PRECONDITION, ABORTED,
      * and UNAVAILABLE.
      */
    var ABORTED: FirestoreErrorCode = js.native
    /**
      * Some entity that we attempted to create (e.g., file or directory) already
      * exists.
      */
    var ALREADY_EXISTS: FirestoreErrorCode = js.native
    /** The operation was cancelled (typically by the caller). */
    var CANCELLED: FirestoreErrorCode = js.native
    /** Unrecoverable data loss or corruption. */
    var DATA_LOSS: FirestoreErrorCode = js.native
    /**
      * Deadline expired before operation could complete. For operations that
      * change the state of the system, this error may be returned even if the
      * operation has completed successfully. For example, a successful response
      * from a server could have been delayed long enough for the deadline to
      * expire.
      */
    var DEADLINE_EXCEEDED: FirestoreErrorCode = js.native
    /**
      * Operation was rejected because the system is not in a state required for
      * the operation's execution. For example, directory to be deleted may be
      * non-empty, an rmdir operation is applied to a non-directory, etc.
      *
      * A litmus test that may help a service implementor in deciding
      * between FAILED_PRECONDITION, ABORTED, and UNAVAILABLE:
      *  (a) Use UNAVAILABLE if the client can retry just the failing call.
      *  (b) Use ABORTED if the client should retry at a higher-level
      *      (e.g., restarting a read-modify-write sequence).
      *  (c) Use FAILED_PRECONDITION if the client should not retry until
      *      the system state has been explicitly fixed. E.g., if an "rmdir"
      *      fails because the directory is non-empty, FAILED_PRECONDITION
      *      should be returned since the client should not retry unless
      *      they have first fixed up the directory by deleting files from it.
      *  (d) Use FAILED_PRECONDITION if the client performs conditional
      *      REST Get/Update/Delete on a resource and the resource on the
      *      server does not match the condition. E.g., conflicting
      *      read-modify-write on the same resource.
      */
    var FAILED_PRECONDITION: FirestoreErrorCode = js.native
    /**
      * Internal errors. Means some invariants expected by underlying System has
      * been broken. If you see one of these errors, Something is very broken.
      */
    var INTERNAL: FirestoreErrorCode = js.native
    /**
      * Client specified an invalid argument. Note that this differs from
      * FAILED_PRECONDITION. INVALID_ARGUMENT indicates arguments that are
      * problematic regardless of the state of the system (e.g., a malformed file
      * name).
      */
    var INVALID_ARGUMENT: FirestoreErrorCode = js.native
    /** Some requested entity (e.g., file or directory) was not found. */
    var NOT_FOUND: FirestoreErrorCode = js.native
    /** Not an error; returned on success. */
    var OK: FirestoreErrorCode = js.native
    /**
      * Operation was attempted past the valid range. E.g., seeking or reading
      * past end of file.
      *
      * Unlike INVALID_ARGUMENT, this error indicates a problem that may be fixed
      * if the system state changes. For example, a 32-bit file system will
      * generate INVALID_ARGUMENT if asked to read at an offset that is not in the
      * range [0,2^32-1], but it will generate OUT_OF_RANGE if asked to read from
      * an offset past the current file size.
      *
      * There is a fair bit of overlap between FAILED_PRECONDITION and
      * OUT_OF_RANGE. We recommend using OUT_OF_RANGE (the more specific error)
      * when it applies so that callers who are iterating through a space can
      * easily look for an OUT_OF_RANGE error to detect when they are done.
      */
    var OUT_OF_RANGE: FirestoreErrorCode = js.native
    /**
      * The caller does not have permission to execute the specified operation.
      * PERMISSION_DENIED must not be used for rejections caused by exhausting
      * some resource (use RESOURCE_EXHAUSTED instead for those errors).
      * PERMISSION_DENIED must not be used if the caller can not be identified
      * (use UNAUTHENTICATED instead for those errors).
      */
    var PERMISSION_DENIED: FirestoreErrorCode = js.native
    /**
      * Some resource has been exhausted, perhaps a per-user quota, or perhaps the
      * entire file system is out of space.
      */
    var RESOURCE_EXHAUSTED: FirestoreErrorCode = js.native
    /**
      * The request does not have valid authentication credentials for the
      * operation.
      */
    var UNAUTHENTICATED: FirestoreErrorCode = js.native
    /**
      * The service is currently unavailable. This is a most likely a transient
      * condition and may be corrected by retrying with a backoff.
      *
      * See litmus test above for deciding between FAILED_PRECONDITION, ABORTED,
      * and UNAVAILABLE.
      */
    var UNAVAILABLE: FirestoreErrorCode = js.native
    /** Operation is not implemented or not supported/enabled in this service. */
    var UNIMPLEMENTED: FirestoreErrorCode = js.native
    /** Unknown error or an error from a different error domain. */
    var UNKNOWN: FirestoreErrorCode = js.native
  }
  
  type Code = FirestoreErrorCode
}

