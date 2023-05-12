package typings.firebase.compatMod.firebase.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageErrorCode extends StObject
@JSImport("firebase/compat", "firebase.storage.StorageErrorCode")
@js.native
object StorageErrorCode extends StObject {
  
  @js.native
  sealed trait APP_DELETED
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait BUCKET_NOT_FOUND
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait CANNOT_SLICE_BLOB
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_ARGUMENT
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_ARGUMENT_COUNT
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_CHECKSUM
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_DEFAULT_BUCKET
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_EVENT_NAME
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_FORMAT
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_ROOT_OPERATION
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait INVALID_URL
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait NO_DEFAULT_BUCKET
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait NO_DOWNLOAD_URL
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait OBJECT_NOT_FOUND
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait PROJECT_NOT_FOUND
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait QUOTA_EXCEEDED
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait RETRY_LIMIT_EXCEEDED
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait SERVER_FILE_WRONG_SIZE
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait UNAUTHENTICATED
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait UNAUTHORIZED
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait UNAUTHORIZED_APP
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with StorageErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_ENVIRONMENT
    extends StObject
       with StorageErrorCode
}
