package typings.firebaseStorage.distStorageMod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  * Error codes that can be attached to `StorageError`s.
  */
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
