package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationErrorMod.Code
import typings.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/error", JSImport.Namespace)
@js.native
object distSrcImplementationErrorMod extends js.Object {
  @js.native
  class FirebaseStorageError protected () extends Error {
    def this(code: Code, message: String) = this()
    var code_ : js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    var message_ : js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    var name_ : js.Any = js.native
    var serverResponse_ : js.Any = js.native
    def code(): String = js.native
    def codeEquals(code: Code): Boolean = js.native
    def codeProp(): String = js.native
    @JSName("message")
    def message_MFirebaseStorageError(): String = js.native
    @JSName("name")
    def name_MFirebaseStorageError(): String = js.native
    def serverResponse(): Null | String = js.native
    def serverResponseProp(): String | Null = js.native
    def setServerResponseProp(): Unit = js.native
    def setServerResponseProp(serverResponse: String): Unit = js.native
  }
  
  def appDeleted(): FirebaseStorageError = js.native
  def bucketNotFound(bucket: String): FirebaseStorageError = js.native
  def canceled(): FirebaseStorageError = js.native
  def cannotSliceBlob(): FirebaseStorageError = js.native
  def internalError(message: String): FirebaseStorageError = js.native
  def invalidArgument(index: Double, fnName: String, message: String): FirebaseStorageError = js.native
  def invalidArgumentCount(argMin: Double, argMax: Double, fnName: String, real: Double): FirebaseStorageError = js.native
  def invalidChecksum(path: String, checksum: String, calculated: String): FirebaseStorageError = js.native
  def invalidDefaultBucket(bucket: String): FirebaseStorageError = js.native
  def invalidEventName(name: String): FirebaseStorageError = js.native
  def invalidFormat(format: String, message: String): FirebaseStorageError = js.native
  def invalidRootOperation(name: String): FirebaseStorageError = js.native
  def invalidUrl(url: String): FirebaseStorageError = js.native
  def noDefaultBucket(): FirebaseStorageError = js.native
  def noDownloadURL(): FirebaseStorageError = js.native
  def objectNotFound(path: String): FirebaseStorageError = js.native
  def prependCode(code: Code): String = js.native
  def projectNotFound(project: String): FirebaseStorageError = js.native
  def quotaExceeded(bucket: String): FirebaseStorageError = js.native
  def retryLimitExceeded(): FirebaseStorageError = js.native
  def serverFileWrongSize(): FirebaseStorageError = js.native
  def unauthenticated(): FirebaseStorageError = js.native
  def unauthorized(path: String): FirebaseStorageError = js.native
  def unknown(): FirebaseStorageError = js.native
  @js.native
  object Code extends js.Object {
    var APP_DELETED: String = js.native
    var BUCKET_NOT_FOUND: String = js.native
    var CANCELED: String = js.native
    var CANNOT_SLICE_BLOB: String = js.native
    var INTERNAL_ERROR: String = js.native
    var INVALID_ARGUMENT: String = js.native
    var INVALID_ARGUMENT_COUNT: String = js.native
    var INVALID_CHECKSUM: String = js.native
    var INVALID_DEFAULT_BUCKET: String = js.native
    var INVALID_EVENT_NAME: String = js.native
    var INVALID_FORMAT: String = js.native
    var INVALID_ROOT_OPERATION: String = js.native
    var INVALID_URL: String = js.native
    var NO_DEFAULT_BUCKET: String = js.native
    var NO_DOWNLOAD_URL: String = js.native
    var OBJECT_NOT_FOUND: String = js.native
    var PROJECT_NOT_FOUND: String = js.native
    var QUOTA_EXCEEDED: String = js.native
    var RETRY_LIMIT_EXCEEDED: String = js.native
    var SERVER_FILE_WRONG_SIZE: String = js.native
    var UNAUTHENTICATED: String = js.native
    var UNAUTHORIZED: String = js.native
    var UNKNOWN: String = js.native
  }
  
  type Code = String
}

