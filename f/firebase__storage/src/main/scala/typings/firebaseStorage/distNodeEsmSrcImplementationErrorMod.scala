package typings.firebaseStorage

import typings.firebaseStorage.anon.ServerResponse
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationErrorMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/error", "StorageError")
  @js.native
  open class StorageError protected () extends FirebaseError {
    /**
      * @param code - A `StorageErrorCode` string to be prefixed with 'storage/' and
      *  added to the end of the message.
      * @param message  - Error message.
      * @param status_ - Corresponding HTTP Status Code
      */
    def this(code: StorageErrorCode, message: String) = this()
    def this(code: StorageErrorCode, message: String, status_ : Double) = this()
    
    /* private */ val _baseMessage: Any = js.native
    
    /**
      * Compares a `StorageErrorCode` against this error's code, filtering out the prefix.
      */
    def _codeEquals(code: StorageErrorCode): Boolean = js.native
    
    /**
      * Stores custom error data unique to the `StorageError`.
      */
    @JSName("customData")
    var customData_StorageError: ServerResponse = js.native
    
    /**
      * Optional response message that was added by the server.
      */
    def serverResponse: Null | String = js.native
    def serverResponse_=(serverResponse: String | Null): Unit = js.native
    
    def status: Double = js.native
    
    /* private */ var status_ : Any = js.native
    
    def status_=(status: Double): Unit = js.native
  }
  
  @js.native
  sealed trait StorageErrorCode extends StObject
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/error", "StorageErrorCode")
  @js.native
  object StorageErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StorageErrorCode & String] = js.native
    
    @js.native
    sealed trait APP_DELETED
      extends StObject
         with StorageErrorCode
    /* "app-deleted" */ val APP_DELETED: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.APP_DELETED & String = js.native
    
    @js.native
    sealed trait BUCKET_NOT_FOUND
      extends StObject
         with StorageErrorCode
    /* "bucket-not-found" */ val BUCKET_NOT_FOUND: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.BUCKET_NOT_FOUND & String = js.native
    
    @js.native
    sealed trait CANCELED
      extends StObject
         with StorageErrorCode
    /* "canceled" */ val CANCELED: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.CANCELED & String = js.native
    
    @js.native
    sealed trait CANNOT_SLICE_BLOB
      extends StObject
         with StorageErrorCode
    /* "cannot-slice-blob" */ val CANNOT_SLICE_BLOB: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.CANNOT_SLICE_BLOB & String = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with StorageErrorCode
    /* "internal-error" */ val INTERNAL_ERROR: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INTERNAL_ERROR & String = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with StorageErrorCode
    /* "invalid-argument" */ val INVALID_ARGUMENT: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_ARGUMENT & String = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT_COUNT
      extends StObject
         with StorageErrorCode
    /* "invalid-argument-count" */ val INVALID_ARGUMENT_COUNT: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_ARGUMENT_COUNT & String = js.native
    
    @js.native
    sealed trait INVALID_CHECKSUM
      extends StObject
         with StorageErrorCode
    /* "invalid-checksum" */ val INVALID_CHECKSUM: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_CHECKSUM & String = js.native
    
    @js.native
    sealed trait INVALID_DEFAULT_BUCKET
      extends StObject
         with StorageErrorCode
    /* "invalid-default-bucket" */ val INVALID_DEFAULT_BUCKET: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_DEFAULT_BUCKET & String = js.native
    
    @js.native
    sealed trait INVALID_EVENT_NAME
      extends StObject
         with StorageErrorCode
    /* "invalid-event-name" */ val INVALID_EVENT_NAME: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_EVENT_NAME & String = js.native
    
    @js.native
    sealed trait INVALID_FORMAT
      extends StObject
         with StorageErrorCode
    /* "invalid-format" */ val INVALID_FORMAT: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_FORMAT & String = js.native
    
    @js.native
    sealed trait INVALID_ROOT_OPERATION
      extends StObject
         with StorageErrorCode
    /* "invalid-root-operation" */ val INVALID_ROOT_OPERATION: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_ROOT_OPERATION & String = js.native
    
    @js.native
    sealed trait INVALID_URL
      extends StObject
         with StorageErrorCode
    /* "invalid-url" */ val INVALID_URL: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.INVALID_URL & String = js.native
    
    @js.native
    sealed trait NO_DEFAULT_BUCKET
      extends StObject
         with StorageErrorCode
    /* "no-default-bucket" */ val NO_DEFAULT_BUCKET: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.NO_DEFAULT_BUCKET & String = js.native
    
    @js.native
    sealed trait NO_DOWNLOAD_URL
      extends StObject
         with StorageErrorCode
    /* "no-download-url" */ val NO_DOWNLOAD_URL: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.NO_DOWNLOAD_URL & String = js.native
    
    @js.native
    sealed trait OBJECT_NOT_FOUND
      extends StObject
         with StorageErrorCode
    /* "object-not-found" */ val OBJECT_NOT_FOUND: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.OBJECT_NOT_FOUND & String = js.native
    
    @js.native
    sealed trait PROJECT_NOT_FOUND
      extends StObject
         with StorageErrorCode
    /* "project-not-found" */ val PROJECT_NOT_FOUND: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.PROJECT_NOT_FOUND & String = js.native
    
    @js.native
    sealed trait QUOTA_EXCEEDED
      extends StObject
         with StorageErrorCode
    /* "quota-exceeded" */ val QUOTA_EXCEEDED: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.QUOTA_EXCEEDED & String = js.native
    
    @js.native
    sealed trait RETRY_LIMIT_EXCEEDED
      extends StObject
         with StorageErrorCode
    /* "retry-limit-exceeded" */ val RETRY_LIMIT_EXCEEDED: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.RETRY_LIMIT_EXCEEDED & String = js.native
    
    @js.native
    sealed trait SERVER_FILE_WRONG_SIZE
      extends StObject
         with StorageErrorCode
    /* "server-file-wrong-size" */ val SERVER_FILE_WRONG_SIZE: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.SERVER_FILE_WRONG_SIZE & String = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED
      extends StObject
         with StorageErrorCode
    /* "unauthenticated" */ val UNAUTHENTICATED: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.UNAUTHENTICATED & String = js.native
    
    @js.native
    sealed trait UNAUTHORIZED
      extends StObject
         with StorageErrorCode
    /* "unauthorized" */ val UNAUTHORIZED: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.UNAUTHORIZED & String = js.native
    
    @js.native
    sealed trait UNAUTHORIZED_APP
      extends StObject
         with StorageErrorCode
    /* "unauthorized-app" */ val UNAUTHORIZED_APP: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.UNAUTHORIZED_APP & String = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with StorageErrorCode
    /* "unknown" */ val UNKNOWN: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.UNKNOWN & String = js.native
    
    @js.native
    sealed trait UNSUPPORTED_ENVIRONMENT
      extends StObject
         with StorageErrorCode
    /* "unsupported-environment" */ val UNSUPPORTED_ENVIRONMENT: typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageErrorCode.UNSUPPORTED_ENVIRONMENT & String = js.native
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
  
  inline def missingPolyFill(polyFill: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("missingPolyFill")(polyFill.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
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
}
