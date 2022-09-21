package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreStrings.unknown_
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  object Code {
    
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The operation was aborted, typically due to a concurrency issue like
      * sequencer check failures, transaction aborts, etc.
      *
      * See litmus test above for deciding between FAILED_PRECONDITION, ABORTED,
      * and UNAVAILABLE.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.ABORTED")
    @js.native
    def ABORTED: FirestoreErrorCode = js.native
    inline def ABORTED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORTED")(x.asInstanceOf[js.Any])
    
    /**
      * Some entity that we attempted to create (e.g., file or directory) already
      * exists.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.ALREADY_EXISTS")
    @js.native
    def ALREADY_EXISTS: FirestoreErrorCode = js.native
    inline def ALREADY_EXISTS_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALREADY_EXISTS")(x.asInstanceOf[js.Any])
    
    /** The operation was cancelled (typically by the caller). */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.CANCELLED")
    @js.native
    def CANCELLED: FirestoreErrorCode = js.native
    inline def CANCELLED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    /** Unrecoverable data loss or corruption. */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.DATA_LOSS")
    @js.native
    def DATA_LOSS: FirestoreErrorCode = js.native
    inline def DATA_LOSS_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_LOSS")(x.asInstanceOf[js.Any])
    
    /**
      * Deadline expired before operation could complete. For operations that
      * change the state of the system, this error may be returned even if the
      * operation has completed successfully. For example, a successful response
      * from a server could have been delayed long enough for the deadline to
      * expire.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.DEADLINE_EXCEEDED")
    @js.native
    def DEADLINE_EXCEEDED: FirestoreErrorCode = js.native
    inline def DEADLINE_EXCEEDED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEADLINE_EXCEEDED")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.FAILED_PRECONDITION")
    @js.native
    def FAILED_PRECONDITION: FirestoreErrorCode = js.native
    inline def FAILED_PRECONDITION_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED_PRECONDITION")(x.asInstanceOf[js.Any])
    
    /**
      * Internal errors. Means some invariants expected by underlying System has
      * been broken. If you see one of these errors, Something is very broken.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.INTERNAL")
    @js.native
    def INTERNAL: FirestoreErrorCode = js.native
    inline def INTERNAL_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL")(x.asInstanceOf[js.Any])
    
    /**
      * Client specified an invalid argument. Note that this differs from
      * FAILED_PRECONDITION. INVALID_ARGUMENT indicates arguments that are
      * problematic regardless of the state of the system (e.g., a malformed file
      * name).
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.INVALID_ARGUMENT")
    @js.native
    def INVALID_ARGUMENT: FirestoreErrorCode = js.native
    inline def INVALID_ARGUMENT_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT")(x.asInstanceOf[js.Any])
    
    /** Some requested entity (e.g., file or directory) was not found. */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.NOT_FOUND")
    @js.native
    def NOT_FOUND: FirestoreErrorCode = js.native
    inline def NOT_FOUND_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
    
    /** Not an error; returned on success. */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.OK")
    @js.native
    def OK: FirestoreErrorCode = js.native
    inline def OK_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.OUT_OF_RANGE")
    @js.native
    def OUT_OF_RANGE: FirestoreErrorCode = js.native
    inline def OUT_OF_RANGE_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUT_OF_RANGE")(x.asInstanceOf[js.Any])
    
    /**
      * The caller does not have permission to execute the specified operation.
      * PERMISSION_DENIED must not be used for rejections caused by exhausting
      * some resource (use RESOURCE_EXHAUSTED instead for those errors).
      * PERMISSION_DENIED must not be used if the caller can not be identified
      * (use UNAUTHENTICATED instead for those errors).
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.PERMISSION_DENIED")
    @js.native
    def PERMISSION_DENIED: FirestoreErrorCode = js.native
    inline def PERMISSION_DENIED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED")(x.asInstanceOf[js.Any])
    
    /**
      * Some resource has been exhausted, perhaps a per-user quota, or perhaps the
      * entire file system is out of space.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.RESOURCE_EXHAUSTED")
    @js.native
    def RESOURCE_EXHAUSTED: FirestoreErrorCode = js.native
    inline def RESOURCE_EXHAUSTED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESOURCE_EXHAUSTED")(x.asInstanceOf[js.Any])
    
    /**
      * The request does not have valid authentication credentials for the
      * operation.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.UNAUTHENTICATED")
    @js.native
    def UNAUTHENTICATED: FirestoreErrorCode = js.native
    inline def UNAUTHENTICATED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHENTICATED")(x.asInstanceOf[js.Any])
    
    /**
      * The service is currently unavailable. This is a most likely a transient
      * condition and may be corrected by retrying with a backoff.
      *
      * See litmus test above for deciding between FAILED_PRECONDITION, ABORTED,
      * and UNAVAILABLE.
      */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.UNAVAILABLE")
    @js.native
    def UNAVAILABLE: FirestoreErrorCode = js.native
    inline def UNAVAILABLE_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAVAILABLE")(x.asInstanceOf[js.Any])
    
    /** Operation is not implemented or not supported/enabled in this service. */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.UNIMPLEMENTED")
    @js.native
    def UNIMPLEMENTED: FirestoreErrorCode = js.native
    inline def UNIMPLEMENTED_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIMPLEMENTED")(x.asInstanceOf[js.Any])
    
    /** Unknown error or an error from a different error domain. */
    @JSImport("@firebase/firestore/dist/firestore/src/util/error", "Code.UNKNOWN")
    @js.native
    def UNKNOWN: FirestoreErrorCode = js.native
    inline def UNKNOWN_=(x: FirestoreErrorCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
  }
  type Code = FirestoreErrorCode
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/error", "FirestoreError")
  @js.native
  open class FirestoreError protected () extends FirebaseError {
    /** @hideconstructor */
    def this(
      /**
      * The backend error code associated with this error.
      */
    code: FirestoreErrorCode,
      /**
      * A custom error description.
      */
    message: String
    ) = this()
    
    /**
      * The backend error code associated with this error.
      */
    @JSName("code")
    val code_FirestoreError: FirestoreErrorCode = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.cancelled
    - typings.firebaseFirestore.firebaseFirestoreStrings.unknown_
    - typings.firebaseFirestore.firebaseFirestoreStrings.`invalid-argument`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`deadline-exceeded`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-found`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`already-exists`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`permission-denied`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`resource-exhausted`
    - typings.firebaseFirestore.firebaseFirestoreStrings.`failed-precondition`
    - typings.firebaseFirestore.firebaseFirestoreStrings.aborted
    - typings.firebaseFirestore.firebaseFirestoreStrings.`out-of-range`
    - typings.firebaseFirestore.firebaseFirestoreStrings.unimplemented
    - typings.firebaseFirestore.firebaseFirestoreStrings.internal
    - typings.firebaseFirestore.firebaseFirestoreStrings.unavailable
    - typings.firebaseFirestore.firebaseFirestoreStrings.`data-loss`
    - typings.firebaseFirestore.firebaseFirestoreStrings.unauthenticated
  */
  trait FirestoreErrorCode extends StObject
  object FirestoreErrorCode {
    
    inline def aborted: typings.firebaseFirestore.firebaseFirestoreStrings.aborted = "aborted".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.aborted]
    
    inline def `already-exists`: typings.firebaseFirestore.firebaseFirestoreStrings.`already-exists` = "already-exists".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`already-exists`]
    
    inline def cancelled: typings.firebaseFirestore.firebaseFirestoreStrings.cancelled = "cancelled".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.cancelled]
    
    inline def `data-loss`: typings.firebaseFirestore.firebaseFirestoreStrings.`data-loss` = "data-loss".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typings.firebaseFirestore.firebaseFirestoreStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typings.firebaseFirestore.firebaseFirestoreStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`failed-precondition`]
    
    inline def internal: typings.firebaseFirestore.firebaseFirestoreStrings.internal = "internal".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.internal]
    
    inline def `invalid-argument`: typings.firebaseFirestore.firebaseFirestoreStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`invalid-argument`]
    
    inline def `not-found`: typings.firebaseFirestore.firebaseFirestoreStrings.`not-found` = "not-found".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`not-found`]
    
    inline def `out-of-range`: typings.firebaseFirestore.firebaseFirestoreStrings.`out-of-range` = "out-of-range".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`out-of-range`]
    
    inline def `permission-denied`: typings.firebaseFirestore.firebaseFirestoreStrings.`permission-denied` = "permission-denied".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typings.firebaseFirestore.firebaseFirestoreStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`resource-exhausted`]
    
    inline def unauthenticated: typings.firebaseFirestore.firebaseFirestoreStrings.unauthenticated = "unauthenticated".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.unauthenticated]
    
    inline def unavailable: typings.firebaseFirestore.firebaseFirestoreStrings.unavailable = "unavailable".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.unavailable]
    
    inline def unimplemented: typings.firebaseFirestore.firebaseFirestoreStrings.unimplemented = "unimplemented".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.unimplemented]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
}
