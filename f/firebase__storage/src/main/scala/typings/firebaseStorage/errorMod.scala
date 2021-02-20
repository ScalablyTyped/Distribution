package typings.firebaseStorage

import typings.firebaseStorage.anon.ServerResponse
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  object Code {
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.APP_DELETED")
    @js.native
    def APP_DELETED: String = js.native
    @scala.inline
    def APP_DELETED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_DELETED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.BUCKET_NOT_FOUND")
    @js.native
    def BUCKET_NOT_FOUND: String = js.native
    @scala.inline
    def BUCKET_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUCKET_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.CANCELED")
    @js.native
    def CANCELED: String = js.native
    @scala.inline
    def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.CANNOT_SLICE_BLOB")
    @js.native
    def CANNOT_SLICE_BLOB: String = js.native
    @scala.inline
    def CANNOT_SLICE_BLOB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANNOT_SLICE_BLOB")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INTERNAL_ERROR")
    @js.native
    def INTERNAL_ERROR: String = js.native
    @scala.inline
    def INTERNAL_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_ARGUMENT")
    @js.native
    def INVALID_ARGUMENT: String = js.native
    @scala.inline
    def INVALID_ARGUMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_ARGUMENT_COUNT")
    @js.native
    def INVALID_ARGUMENT_COUNT: String = js.native
    @scala.inline
    def INVALID_ARGUMENT_COUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT_COUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_CHECKSUM")
    @js.native
    def INVALID_CHECKSUM: String = js.native
    @scala.inline
    def INVALID_CHECKSUM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CHECKSUM")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_DEFAULT_BUCKET")
    @js.native
    def INVALID_DEFAULT_BUCKET: String = js.native
    @scala.inline
    def INVALID_DEFAULT_BUCKET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_DEFAULT_BUCKET")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_EVENT_NAME")
    @js.native
    def INVALID_EVENT_NAME: String = js.native
    @scala.inline
    def INVALID_EVENT_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_FORMAT")
    @js.native
    def INVALID_FORMAT: String = js.native
    @scala.inline
    def INVALID_FORMAT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_FORMAT")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_ROOT_OPERATION")
    @js.native
    def INVALID_ROOT_OPERATION: String = js.native
    @scala.inline
    def INVALID_ROOT_OPERATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ROOT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.INVALID_URL")
    @js.native
    def INVALID_URL: String = js.native
    @scala.inline
    def INVALID_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.NO_DEFAULT_BUCKET")
    @js.native
    def NO_DEFAULT_BUCKET: String = js.native
    @scala.inline
    def NO_DEFAULT_BUCKET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_DEFAULT_BUCKET")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.NO_DOWNLOAD_URL")
    @js.native
    def NO_DOWNLOAD_URL: String = js.native
    @scala.inline
    def NO_DOWNLOAD_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_DOWNLOAD_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.OBJECT_NOT_FOUND")
    @js.native
    def OBJECT_NOT_FOUND: String = js.native
    @scala.inline
    def OBJECT_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.PROJECT_NOT_FOUND")
    @js.native
    def PROJECT_NOT_FOUND: String = js.native
    @scala.inline
    def PROJECT_NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.QUOTA_EXCEEDED")
    @js.native
    def QUOTA_EXCEEDED: String = js.native
    @scala.inline
    def QUOTA_EXCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_EXCEEDED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.RETRY_LIMIT_EXCEEDED")
    @js.native
    def RETRY_LIMIT_EXCEEDED: String = js.native
    @scala.inline
    def RETRY_LIMIT_EXCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETRY_LIMIT_EXCEEDED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.SERVER_FILE_WRONG_SIZE")
    @js.native
    def SERVER_FILE_WRONG_SIZE: String = js.native
    @scala.inline
    def SERVER_FILE_WRONG_SIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_FILE_WRONG_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNAUTHENTICATED")
    @js.native
    def UNAUTHENTICATED: String = js.native
    @scala.inline
    def UNAUTHENTICATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHENTICATED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNAUTHORIZED")
    @js.native
    def UNAUTHORIZED: String = js.native
    @scala.inline
    def UNAUTHORIZED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAUTHORIZED")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNKNOWN")
    @js.native
    def UNKNOWN: String = js.native
    @scala.inline
    def UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/error", "Code.UNSUPPORTED_ENVIRONMENT")
    @js.native
    def UNSUPPORTED_ENVIRONMENT: String = js.native
    @scala.inline
    def UNSUPPORTED_ENVIRONMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_ENVIRONMENT")(x.asInstanceOf[js.Any])
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
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "appDeleted")
  @js.native
  def appDeleted(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "bucketNotFound")
  @js.native
  def bucketNotFound(bucket: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "canceled")
  @js.native
  def canceled(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "cannotSliceBlob")
  @js.native
  def cannotSliceBlob(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "internalError")
  @js.native
  def internalError(message: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidArgument")
  @js.native
  def invalidArgument(message: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidArgumentCount")
  @js.native
  def invalidArgumentCount(argMin: Double, argMax: Double, fnName: String, real: Double): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidChecksum")
  @js.native
  def invalidChecksum(path: String, checksum: String, calculated: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidDefaultBucket")
  @js.native
  def invalidDefaultBucket(bucket: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidEventName")
  @js.native
  def invalidEventName(name: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidFormat")
  @js.native
  def invalidFormat(format: String, message: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidRootOperation")
  @js.native
  def invalidRootOperation(name: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "invalidUrl")
  @js.native
  def invalidUrl(url: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "noDefaultBucket")
  @js.native
  def noDefaultBucket(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "noDownloadURL")
  @js.native
  def noDownloadURL(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "objectNotFound")
  @js.native
  def objectNotFound(path: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "prependCode")
  @js.native
  def prependCode(code: Code): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "projectNotFound")
  @js.native
  def projectNotFound(project: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "quotaExceeded")
  @js.native
  def quotaExceeded(bucket: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "retryLimitExceeded")
  @js.native
  def retryLimitExceeded(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "serverFileWrongSize")
  @js.native
  def serverFileWrongSize(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "unauthenticated")
  @js.native
  def unauthenticated(): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "unauthorized")
  @js.native
  def unauthorized(path: String): FirebaseStorageError = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/error", "unknown")
  @js.native
  def unknown(): FirebaseStorageError = js.native
}
