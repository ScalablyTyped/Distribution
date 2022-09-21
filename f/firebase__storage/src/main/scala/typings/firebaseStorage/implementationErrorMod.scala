package typings.firebaseStorage

import typings.firebaseStorage.anon.ServerResponse
import typings.firebaseStorage.firebaseStorageStrings.`app-deleted`
import typings.firebaseStorage.firebaseStorageStrings.`bucket-not-found`
import typings.firebaseStorage.firebaseStorageStrings.`cannot-slice-blob`
import typings.firebaseStorage.firebaseStorageStrings.`internal-error`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-argument-count`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-argument`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-checksum`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-default-bucket`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-event-name`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-format`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-root-operation`
import typings.firebaseStorage.firebaseStorageStrings.`invalid-url`
import typings.firebaseStorage.firebaseStorageStrings.`no-default-bucket`
import typings.firebaseStorage.firebaseStorageStrings.`no-download-url`
import typings.firebaseStorage.firebaseStorageStrings.`object-not-found`
import typings.firebaseStorage.firebaseStorageStrings.`project-not-found`
import typings.firebaseStorage.firebaseStorageStrings.`quota-exceeded`
import typings.firebaseStorage.firebaseStorageStrings.`retry-limit-exceeded`
import typings.firebaseStorage.firebaseStorageStrings.`server-file-wrong-size`
import typings.firebaseStorage.firebaseStorageStrings.`unauthorized-app`
import typings.firebaseStorage.firebaseStorageStrings.`unsupported-environment`
import typings.firebaseStorage.firebaseStorageStrings.canceled
import typings.firebaseStorage.firebaseStorageStrings.unauthenticated
import typings.firebaseStorage.firebaseStorageStrings.unauthorized
import typings.firebaseStorage.firebaseStorageStrings.unknown
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationErrorMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "StorageError")
  @js.native
  open class StorageError protected () extends FirebaseError {
    /**
      * @param code - A StorageErrorCode string to be prefixed with 'storage/' and
      *  added to the end of the message.
      * @param message  - Error message.
      */
    def this(code: StorageErrorCode, message: String) = this()
    
    /* private */ val _baseMessage: Any = js.native
    
    /**
      * Compares a StorageErrorCode against this error's code, filtering out the prefix.
      */
    def _codeEquals(code: StorageErrorCode): Boolean = js.native
    
    /**
      * Stores custom error data unque to StorageError.
      */
    @JSName("customData")
    var customData_StorageError: ServerResponse = js.native
    
    /**
      * Optional response message that was added by the server.
      */
    def serverResponse: Null | String = js.native
    def serverResponse_=(serverResponse: String | Null): Unit = js.native
  }
  
  inline def appDeleted(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("appDeleted")().asInstanceOf[StorageError]
  
  inline def bucketNotFound(bucket: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketNotFound")(bucket.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def canceled(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("canceled")().asInstanceOf[StorageError]
  
  inline def cannotSliceBlob(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotSliceBlob")().asInstanceOf[StorageError]
  
  inline def internalError(message: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("internalError")(message.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def invalidArgument(message: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidArgument")(message.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def invalidArgumentCount(argMin: Double, argMax: Double, fnName: String, real: Double): StorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidArgumentCount")(argMin.asInstanceOf[js.Any], argMax.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], real.asInstanceOf[js.Any])).asInstanceOf[StorageError]
  
  inline def invalidChecksum(path: String, checksum: String, calculated: String): StorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidChecksum")(path.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any], calculated.asInstanceOf[js.Any])).asInstanceOf[StorageError]
  
  inline def invalidDefaultBucket(bucket: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidDefaultBucket")(bucket.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def invalidEventName(name: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidEventName")(name.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def invalidFormat(format: String, message: String): StorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidFormat")(format.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[StorageError]
  
  inline def invalidRootOperation(name: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidRootOperation")(name.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def invalidUrl(url: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidUrl")(url.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def noDefaultBucket(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("noDefaultBucket")().asInstanceOf[StorageError]
  
  inline def noDownloadURL(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("noDownloadURL")().asInstanceOf[StorageError]
  
  inline def objectNotFound(path: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("objectNotFound")(path.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def prependCode(code: StorageErrorCode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prependCode")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def projectNotFound(project: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("projectNotFound")(project.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def quotaExceeded(bucket: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("quotaExceeded")(bucket.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def retryLimitExceeded(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("retryLimitExceeded")().asInstanceOf[StorageError]
  
  inline def serverFileWrongSize(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("serverFileWrongSize")().asInstanceOf[StorageError]
  
  inline def unauthenticated(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthenticated")().asInstanceOf[StorageError]
  
  inline def unauthorized(path: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(path.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def unauthorizedApp(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorizedApp")().asInstanceOf[StorageError]
  
  inline def unknown(): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unknown")().asInstanceOf[StorageError]
  
  inline def unsupportedEnvironment(message: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedEnvironment")(message.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseStorage.firebaseStorageStrings.unknown
    - typings.firebaseStorage.firebaseStorageStrings.`object-not-found`
    - typings.firebaseStorage.firebaseStorageStrings.`bucket-not-found`
    - typings.firebaseStorage.firebaseStorageStrings.`project-not-found`
    - typings.firebaseStorage.firebaseStorageStrings.`quota-exceeded`
    - typings.firebaseStorage.firebaseStorageStrings.unauthenticated
    - typings.firebaseStorage.firebaseStorageStrings.unauthorized
    - typings.firebaseStorage.firebaseStorageStrings.`unauthorized-app`
    - typings.firebaseStorage.firebaseStorageStrings.`retry-limit-exceeded`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-checksum`
    - typings.firebaseStorage.firebaseStorageStrings.canceled
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-event-name`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-url`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-default-bucket`
    - typings.firebaseStorage.firebaseStorageStrings.`no-default-bucket`
    - typings.firebaseStorage.firebaseStorageStrings.`cannot-slice-blob`
    - typings.firebaseStorage.firebaseStorageStrings.`server-file-wrong-size`
    - typings.firebaseStorage.firebaseStorageStrings.`no-download-url`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-argument`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-argument-count`
    - typings.firebaseStorage.firebaseStorageStrings.`app-deleted`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-root-operation`
    - typings.firebaseStorage.firebaseStorageStrings.`invalid-format`
    - typings.firebaseStorage.firebaseStorageStrings.`internal-error`
    - typings.firebaseStorage.firebaseStorageStrings.`unsupported-environment`
  */
  trait StorageErrorCode extends StObject
  object StorageErrorCode {
    
    inline def APP_DELETED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
    
    inline def BUCKET_NOT_FOUND: `bucket-not-found` = "bucket-not-found".asInstanceOf[`bucket-not-found`]
    
    inline def CANCELED: canceled = "canceled".asInstanceOf[canceled]
    
    inline def CANNOT_SLICE_BLOB: `cannot-slice-blob` = "cannot-slice-blob".asInstanceOf[`cannot-slice-blob`]
    
    inline def INTERNAL_ERROR: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
    
    inline def INVALID_ARGUMENT: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
    
    inline def INVALID_ARGUMENT_COUNT: `invalid-argument-count` = "invalid-argument-count".asInstanceOf[`invalid-argument-count`]
    
    inline def INVALID_CHECKSUM: `invalid-checksum` = "invalid-checksum".asInstanceOf[`invalid-checksum`]
    
    inline def INVALID_DEFAULT_BUCKET: `invalid-default-bucket` = "invalid-default-bucket".asInstanceOf[`invalid-default-bucket`]
    
    inline def INVALID_EVENT_NAME: `invalid-event-name` = "invalid-event-name".asInstanceOf[`invalid-event-name`]
    
    inline def INVALID_FORMAT: `invalid-format` = "invalid-format".asInstanceOf[`invalid-format`]
    
    inline def INVALID_ROOT_OPERATION: `invalid-root-operation` = "invalid-root-operation".asInstanceOf[`invalid-root-operation`]
    
    inline def INVALID_URL: `invalid-url` = "invalid-url".asInstanceOf[`invalid-url`]
    
    inline def NO_DEFAULT_BUCKET: `no-default-bucket` = "no-default-bucket".asInstanceOf[`no-default-bucket`]
    
    inline def NO_DOWNLOAD_URL: `no-download-url` = "no-download-url".asInstanceOf[`no-download-url`]
    
    inline def OBJECT_NOT_FOUND: `object-not-found` = "object-not-found".asInstanceOf[`object-not-found`]
    
    inline def PROJECT_NOT_FOUND: `project-not-found` = "project-not-found".asInstanceOf[`project-not-found`]
    
    inline def QUOTA_EXCEEDED: `quota-exceeded` = "quota-exceeded".asInstanceOf[`quota-exceeded`]
    
    inline def RETRY_LIMIT_EXCEEDED: `retry-limit-exceeded` = "retry-limit-exceeded".asInstanceOf[`retry-limit-exceeded`]
    
    inline def SERVER_FILE_WRONG_SIZE: `server-file-wrong-size` = "server-file-wrong-size".asInstanceOf[`server-file-wrong-size`]
    
    inline def UNAUTHENTICATED: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
    
    inline def UNAUTHORIZED: unauthorized = "unauthorized".asInstanceOf[unauthorized]
    
    inline def UNAUTHORIZED_APP: `unauthorized-app` = "unauthorized-app".asInstanceOf[`unauthorized-app`]
    
    inline def UNKNOWN: unknown = "unknown".asInstanceOf[unknown]
    
    inline def UNSUPPORTED_ENVIRONMENT: `unsupported-environment` = "unsupported-environment".asInstanceOf[`unsupported-environment`]
  }
}
