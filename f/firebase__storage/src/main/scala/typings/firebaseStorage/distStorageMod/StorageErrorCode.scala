package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageErrorCode extends StObject
@JSImport("@firebase/storage/dist/storage", "StorageErrorCode")
@js.native
object StorageErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StorageErrorCode & String] = js.native
  
  @js.native
  sealed trait APP_DELETED
    extends StObject
       with StorageErrorCode
  /* "app-deleted" */ val APP_DELETED: typings.firebaseStorage.distStorageMod.StorageErrorCode.APP_DELETED & String = js.native
  
  @js.native
  sealed trait BUCKET_NOT_FOUND
    extends StObject
       with StorageErrorCode
  /* "bucket-not-found" */ val BUCKET_NOT_FOUND: typings.firebaseStorage.distStorageMod.StorageErrorCode.BUCKET_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with StorageErrorCode
  /* "canceled" */ val CANCELED: typings.firebaseStorage.distStorageMod.StorageErrorCode.CANCELED & String = js.native
  
  @js.native
  sealed trait CANNOT_SLICE_BLOB
    extends StObject
       with StorageErrorCode
  /* "cannot-slice-blob" */ val CANNOT_SLICE_BLOB: typings.firebaseStorage.distStorageMod.StorageErrorCode.CANNOT_SLICE_BLOB & String = js.native
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with StorageErrorCode
  /* "internal-error" */ val INTERNAL_ERROR: typings.firebaseStorage.distStorageMod.StorageErrorCode.INTERNAL_ERROR & String = js.native
  
  @js.native
  sealed trait INVALID_ARGUMENT
    extends StObject
       with StorageErrorCode
  /* "invalid-argument" */ val INVALID_ARGUMENT: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_ARGUMENT & String = js.native
  
  @js.native
  sealed trait INVALID_ARGUMENT_COUNT
    extends StObject
       with StorageErrorCode
  /* "invalid-argument-count" */ val INVALID_ARGUMENT_COUNT: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_ARGUMENT_COUNT & String = js.native
  
  @js.native
  sealed trait INVALID_CHECKSUM
    extends StObject
       with StorageErrorCode
  /* "invalid-checksum" */ val INVALID_CHECKSUM: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_CHECKSUM & String = js.native
  
  @js.native
  sealed trait INVALID_DEFAULT_BUCKET
    extends StObject
       with StorageErrorCode
  /* "invalid-default-bucket" */ val INVALID_DEFAULT_BUCKET: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_DEFAULT_BUCKET & String = js.native
  
  @js.native
  sealed trait INVALID_EVENT_NAME
    extends StObject
       with StorageErrorCode
  /* "invalid-event-name" */ val INVALID_EVENT_NAME: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_EVENT_NAME & String = js.native
  
  @js.native
  sealed trait INVALID_FORMAT
    extends StObject
       with StorageErrorCode
  /* "invalid-format" */ val INVALID_FORMAT: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_FORMAT & String = js.native
  
  @js.native
  sealed trait INVALID_ROOT_OPERATION
    extends StObject
       with StorageErrorCode
  /* "invalid-root-operation" */ val INVALID_ROOT_OPERATION: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_ROOT_OPERATION & String = js.native
  
  @js.native
  sealed trait INVALID_URL
    extends StObject
       with StorageErrorCode
  /* "invalid-url" */ val INVALID_URL: typings.firebaseStorage.distStorageMod.StorageErrorCode.INVALID_URL & String = js.native
  
  @js.native
  sealed trait NO_DEFAULT_BUCKET
    extends StObject
       with StorageErrorCode
  /* "no-default-bucket" */ val NO_DEFAULT_BUCKET: typings.firebaseStorage.distStorageMod.StorageErrorCode.NO_DEFAULT_BUCKET & String = js.native
  
  @js.native
  sealed trait NO_DOWNLOAD_URL
    extends StObject
       with StorageErrorCode
  /* "no-download-url" */ val NO_DOWNLOAD_URL: typings.firebaseStorage.distStorageMod.StorageErrorCode.NO_DOWNLOAD_URL & String = js.native
  
  @js.native
  sealed trait OBJECT_NOT_FOUND
    extends StObject
       with StorageErrorCode
  /* "object-not-found" */ val OBJECT_NOT_FOUND: typings.firebaseStorage.distStorageMod.StorageErrorCode.OBJECT_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait PROJECT_NOT_FOUND
    extends StObject
       with StorageErrorCode
  /* "project-not-found" */ val PROJECT_NOT_FOUND: typings.firebaseStorage.distStorageMod.StorageErrorCode.PROJECT_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait QUOTA_EXCEEDED
    extends StObject
       with StorageErrorCode
  /* "quota-exceeded" */ val QUOTA_EXCEEDED: typings.firebaseStorage.distStorageMod.StorageErrorCode.QUOTA_EXCEEDED & String = js.native
  
  @js.native
  sealed trait RETRY_LIMIT_EXCEEDED
    extends StObject
       with StorageErrorCode
  /* "retry-limit-exceeded" */ val RETRY_LIMIT_EXCEEDED: typings.firebaseStorage.distStorageMod.StorageErrorCode.RETRY_LIMIT_EXCEEDED & String = js.native
  
  @js.native
  sealed trait SERVER_FILE_WRONG_SIZE
    extends StObject
       with StorageErrorCode
  /* "server-file-wrong-size" */ val SERVER_FILE_WRONG_SIZE: typings.firebaseStorage.distStorageMod.StorageErrorCode.SERVER_FILE_WRONG_SIZE & String = js.native
  
  @js.native
  sealed trait UNAUTHENTICATED
    extends StObject
       with StorageErrorCode
  /* "unauthenticated" */ val UNAUTHENTICATED: typings.firebaseStorage.distStorageMod.StorageErrorCode.UNAUTHENTICATED & String = js.native
  
  @js.native
  sealed trait UNAUTHORIZED
    extends StObject
       with StorageErrorCode
  /* "unauthorized" */ val UNAUTHORIZED: typings.firebaseStorage.distStorageMod.StorageErrorCode.UNAUTHORIZED & String = js.native
  
  @js.native
  sealed trait UNAUTHORIZED_APP
    extends StObject
       with StorageErrorCode
  /* "unauthorized-app" */ val UNAUTHORIZED_APP: typings.firebaseStorage.distStorageMod.StorageErrorCode.UNAUTHORIZED_APP & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with StorageErrorCode
  /* "unknown" */ val UNKNOWN: typings.firebaseStorage.distStorageMod.StorageErrorCode.UNKNOWN & String = js.native
  
  @js.native
  sealed trait UNSUPPORTED_ENVIRONMENT
    extends StObject
       with StorageErrorCode
  /* "unsupported-environment" */ val UNSUPPORTED_ENVIRONMENT: typings.firebaseStorage.distStorageMod.StorageErrorCode.UNSUPPORTED_ENVIRONMENT & String = js.native
}
