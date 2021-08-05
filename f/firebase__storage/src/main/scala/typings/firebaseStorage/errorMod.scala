package typings.firebaseStorage

import typings.firebaseStorage.anon.ServerResponse
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Code {
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.APP_DELETED")
    @js.native
    def APP_DELETED: String = js.native
    inline def APP_DELETED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_DELETED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.BUCKET_NOT_FOUND")
    @js.native
    def BUCKET_NOT_FOUND: String = js.native
    inline def BUCKET_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUCKET_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.CANCELED")
    @js.native
    def CANCELED: String = js.native
    inline def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.CANNOT_SLICE_BLOB")
    @js.native
    def CANNOT_SLICE_BLOB: String = js.native
    inline def CANNOT_SLICE_BLOB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANNOT_SLICE_BLOB")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INTERNAL_ERROR")
    @js.native
    def INTERNAL_ERROR: String = js.native
    inline def INTERNAL_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_ARGUMENT")
    @js.native
    def INVALID_ARGUMENT: String = js.native
    inline def INVALID_ARGUMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_ARGUMENT_COUNT")
    @js.native
    def INVALID_ARGUMENT_COUNT: String = js.native
    inline def INVALID_ARGUMENT_COUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT_COUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_CHECKSUM")
    @js.native
    def INVALID_CHECKSUM: String = js.native
    inline def INVALID_CHECKSUM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CHECKSUM")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_DEFAULT_BUCKET")
    @js.native
    def INVALID_DEFAULT_BUCKET: String = js.native
    inline def INVALID_DEFAULT_BUCKET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_DEFAULT_BUCKET")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_EVENT_NAME")
    @js.native
    def INVALID_EVENT_NAME: String = js.native
    inline def INVALID_EVENT_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_FORMAT")
    @js.native
    def INVALID_FORMAT: String = js.native
    inline def INVALID_FORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_FORMAT")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_ROOT_OPERATION")
    @js.native
    def INVALID_ROOT_OPERATION: String = js.native
    inline def INVALID_ROOT_OPERATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ROOT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_URL")
    @js.native
    def INVALID_URL: String = js.native
    inline def INVALID_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.NO_DEFAULT_BUCKET")
    @js.native
    def NO_DEFAULT_BUCKET: String = js.native
    inline def NO_DEFAULT_BUCKET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_DEFAULT_BUCKET")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.NO_DOWNLOAD_URL")
    @js.native
    def NO_DOWNLOAD_URL: String = js.native
    inline def NO_DOWNLOAD_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_DOWNLOAD_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.OBJECT_NOT_FOUND")
    @js.native
    def OBJECT_NOT_FOUND: String = js.native
    inline def OBJECT_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.PROJECT_NOT_FOUND")
    @js.native
    def PROJECT_NOT_FOUND: String = js.native
    inline def PROJECT_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.QUOTA_EXCEEDED")
    @js.native
    def QUOTA_EXCEEDED: String = js.native
    inline def QUOTA_EXCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_EXCEEDED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.RETRY_LIMIT_EXCEEDED")
    @js.native
    def RETRY_LIMIT_EXCEEDED: String = js.native
    inline def RETRY_LIMIT_EXCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETRY_LIMIT_EXCEEDED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.SERVER_FILE_WRONG_SIZE")
    @js.native
    def SERVER_FILE_WRONG_SIZE: String = js.native
    inline def SERVER_FILE_WRONG_SIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_FILE_WRONG_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNAUTHENTICATED")
    @js.native
    def UNAUTHENTICATED: String = js.native
    inline def UNAUTHENTICATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHENTICATED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNAUTHORIZED")
    @js.native
    def UNAUTHORIZED: String = js.native
    inline def UNAUTHORIZED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHORIZED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNKNOWN")
    @js.native
    def UNKNOWN: String = js.native
    inline def UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNSUPPORTED_ENVIRONMENT")
    @js.native
    def UNSUPPORTED_ENVIRONMENT: String = js.native
    inline def UNSUPPORTED_ENVIRONMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_ENVIRONMENT")(x.asInstanceOf[js.Any])
  }
  type Code = String
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "FirebaseStorageError")
  @js.native
  class FirebaseStorageError protected () extends FirebaseError {
    def this(code: Code, message: String) = this()
    
    def codeEquals(code: Code): Boolean = js.native
    
    @JSName("customData")
    var customData_FirebaseStorageError: ServerResponse = js.native
    
    @JSName("message")
    def message_MFirebaseStorageError: String = js.native
    
    def serverResponse: Null | String = js.native
    def serverResponse_=(serverResponse: String | Null): Unit = js.native
  }
  
  inline def appDeleted(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("appDeleted")().asInstanceOf[FirebaseStorageError]
  
  inline def bucketNotFound(bucket: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketNotFound")(bucket.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def canceled(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("canceled")().asInstanceOf[FirebaseStorageError]
  
  inline def cannotSliceBlob(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotSliceBlob")().asInstanceOf[FirebaseStorageError]
  
  inline def internalError(message: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("internalError")(message.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def invalidArgument(message: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidArgument")(message.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def invalidArgumentCount(argMin: Double, argMax: Double, fnName: String, real: Double): FirebaseStorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidArgumentCount")(argMin.asInstanceOf[js.Any], argMax.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], real.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorageError]
  
  inline def invalidChecksum(path: String, checksum: String, calculated: String): FirebaseStorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidChecksum")(path.asInstanceOf[js.Any], checksum.asInstanceOf[js.Any], calculated.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorageError]
  
  inline def invalidDefaultBucket(bucket: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidDefaultBucket")(bucket.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def invalidEventName(name: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidEventName")(name.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def invalidFormat(format: String, message: String): FirebaseStorageError = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidFormat")(format.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorageError]
  
  inline def invalidRootOperation(name: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidRootOperation")(name.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def invalidUrl(url: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidUrl")(url.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def noDefaultBucket(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("noDefaultBucket")().asInstanceOf[FirebaseStorageError]
  
  inline def noDownloadURL(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("noDownloadURL")().asInstanceOf[FirebaseStorageError]
  
  inline def objectNotFound(path: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("objectNotFound")(path.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def prependCode(code: Code): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prependCode")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def projectNotFound(project: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("projectNotFound")(project.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def quotaExceeded(bucket: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("quotaExceeded")(bucket.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def retryLimitExceeded(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("retryLimitExceeded")().asInstanceOf[FirebaseStorageError]
  
  inline def serverFileWrongSize(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("serverFileWrongSize")().asInstanceOf[FirebaseStorageError]
  
  inline def unauthenticated(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthenticated")().asInstanceOf[FirebaseStorageError]
  
  inline def unauthorized(path: String): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(path.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorageError]
  
  inline def unknown(): FirebaseStorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("unknown")().asInstanceOf[FirebaseStorageError]
}
