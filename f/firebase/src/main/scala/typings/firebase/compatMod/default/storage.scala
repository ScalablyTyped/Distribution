package typings.firebase.compatMod.default

import typings.firebase.compatMod.firebase.app.App
import typings.firebase.compatMod.firebase.storage.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  /**
    * Gets the {@link firebase.storage.Storage `Storage`} service for the default
    * app or a given app.
    *
    * `firebase.storage()` can be called with no arguments to access the default
    * app's {@link firebase.storage.Storage `Storage`} service or as
    * `firebase.storage(app)` to access the
    * {@link firebase.storage.Storage `Storage`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Storage service for the default app
    * var defaultStorage = firebase.storage();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Storage service for a given app
    * var otherStorage = firebase.storage(otherApp);
    * ```
    *
    * @param app The app to create a storage service for.
    *     If not passed, uses the default app.
    */
  inline def apply(): Storage = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Storage]
  inline def apply(app: App): Storage = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Storage]
  
  @JSImport("firebase/compat", "default.storage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat", "default.storage.StorageErrorCode")
  @js.native
  object StorageErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.firebase.compatMod.firebase.storage.StorageErrorCode & String] = js.native
    
    /* "app-deleted" */ val APP_DELETED: typings.firebase.compatMod.firebase.storage.StorageErrorCode.APP_DELETED & String = js.native
    
    /* "bucket-not-found" */ val BUCKET_NOT_FOUND: typings.firebase.compatMod.firebase.storage.StorageErrorCode.BUCKET_NOT_FOUND & String = js.native
    
    /* "canceled" */ val CANCELED: typings.firebase.compatMod.firebase.storage.StorageErrorCode.CANCELED & String = js.native
    
    /* "cannot-slice-blob" */ val CANNOT_SLICE_BLOB: typings.firebase.compatMod.firebase.storage.StorageErrorCode.CANNOT_SLICE_BLOB & String = js.native
    
    /* "internal-error" */ val INTERNAL_ERROR: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INTERNAL_ERROR & String = js.native
    
    /* "invalid-argument" */ val INVALID_ARGUMENT: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_ARGUMENT & String = js.native
    
    /* "invalid-argument-count" */ val INVALID_ARGUMENT_COUNT: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_ARGUMENT_COUNT & String = js.native
    
    /* "invalid-checksum" */ val INVALID_CHECKSUM: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_CHECKSUM & String = js.native
    
    /* "invalid-default-bucket" */ val INVALID_DEFAULT_BUCKET: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_DEFAULT_BUCKET & String = js.native
    
    /* "invalid-event-name" */ val INVALID_EVENT_NAME: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_EVENT_NAME & String = js.native
    
    /* "invalid-format" */ val INVALID_FORMAT: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_FORMAT & String = js.native
    
    /* "invalid-root-operation" */ val INVALID_ROOT_OPERATION: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_ROOT_OPERATION & String = js.native
    
    /* "invalid-url" */ val INVALID_URL: typings.firebase.compatMod.firebase.storage.StorageErrorCode.INVALID_URL & String = js.native
    
    /* "no-default-bucket" */ val NO_DEFAULT_BUCKET: typings.firebase.compatMod.firebase.storage.StorageErrorCode.NO_DEFAULT_BUCKET & String = js.native
    
    /* "no-download-url" */ val NO_DOWNLOAD_URL: typings.firebase.compatMod.firebase.storage.StorageErrorCode.NO_DOWNLOAD_URL & String = js.native
    
    /* "object-not-found" */ val OBJECT_NOT_FOUND: typings.firebase.compatMod.firebase.storage.StorageErrorCode.OBJECT_NOT_FOUND & String = js.native
    
    /* "project-not-found" */ val PROJECT_NOT_FOUND: typings.firebase.compatMod.firebase.storage.StorageErrorCode.PROJECT_NOT_FOUND & String = js.native
    
    /* "quota-exceeded" */ val QUOTA_EXCEEDED: typings.firebase.compatMod.firebase.storage.StorageErrorCode.QUOTA_EXCEEDED & String = js.native
    
    /* "retry-limit-exceeded" */ val RETRY_LIMIT_EXCEEDED: typings.firebase.compatMod.firebase.storage.StorageErrorCode.RETRY_LIMIT_EXCEEDED & String = js.native
    
    /* "server-file-wrong-size" */ val SERVER_FILE_WRONG_SIZE: typings.firebase.compatMod.firebase.storage.StorageErrorCode.SERVER_FILE_WRONG_SIZE & String = js.native
    
    /* "unauthenticated" */ val UNAUTHENTICATED: typings.firebase.compatMod.firebase.storage.StorageErrorCode.UNAUTHENTICATED & String = js.native
    
    /* "unauthorized" */ val UNAUTHORIZED: typings.firebase.compatMod.firebase.storage.StorageErrorCode.UNAUTHORIZED & String = js.native
    
    /* "unauthorized-app" */ val UNAUTHORIZED_APP: typings.firebase.compatMod.firebase.storage.StorageErrorCode.UNAUTHORIZED_APP & String = js.native
    
    /* "unknown" */ val UNKNOWN: typings.firebase.compatMod.firebase.storage.StorageErrorCode.UNKNOWN & String = js.native
    
    /* "unsupported-environment" */ val UNSUPPORTED_ENVIRONMENT: typings.firebase.compatMod.firebase.storage.StorageErrorCode.UNSUPPORTED_ENVIRONMENT & String = js.native
  }
  
  object StringFormat {
    
    @JSImport("firebase/compat", "default.storage.StringFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("firebase/compat", "default.storage.StringFormat.BASE64")
    @js.native
    def BASE64: typings.firebase.compatMod.firebase.storage.StringFormat = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("firebase/compat", "default.storage.StringFormat.BASE64URL")
    @js.native
    def BASE64URL: typings.firebase.compatMod.firebase.storage.StringFormat = js.native
    inline def BASE64URL_=(x: typings.firebase.compatMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE64URL")(x.asInstanceOf[js.Any])
    
    inline def BASE64_=(x: typings.firebase.compatMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE64")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates the string is a data URL, such as one obtained from
      * canvas.toDataURL().
      * Example: the string 'data:application/octet-stream;base64,aaaa'
      * becomes the byte sequence
      * 69 a6 9a
      * (the content-type "application/octet-stream" is also applied, but can
      * be overridden in the metadata object).
      */
    @JSImport("firebase/compat", "default.storage.StringFormat.DATA_URL")
    @js.native
    def DATA_URL: typings.firebase.compatMod.firebase.storage.StringFormat = js.native
    inline def DATA_URL_=(x: typings.firebase.compatMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_URL")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\ud83d\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("firebase/compat", "default.storage.StringFormat.RAW")
    @js.native
    def RAW: typings.firebase.compatMod.firebase.storage.StringFormat = js.native
    inline def RAW_=(x: typings.firebase.compatMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW")(x.asInstanceOf[js.Any])
  }
  
  object TaskEvent {
    
    @JSImport("firebase/compat", "default.storage.TaskEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For this event,
      * <ul>
      *   <li>The `next` function is triggered on progress updates and when the
      *       task is paused/resumed with a
      *       {@link firebase.storage.UploadTaskSnapshot} as the first
      *       argument.</li>
      *   <li>The `error` function is triggered if the upload is canceled or fails
      *       for another reason.</li>
      *   <li>The `complete` function is triggered if the upload completes
      *       successfully.</li>
      * </ul>
      */
    @JSImport("firebase/compat", "default.storage.TaskEvent.STATE_CHANGED")
    @js.native
    def STATE_CHANGED: typings.firebase.compatMod.firebase.storage.TaskEvent = js.native
    inline def STATE_CHANGED_=(x: typings.firebase.compatMod.firebase.storage.TaskEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  
  object TaskState {
    
    @JSImport("firebase/compat", "default.storage.TaskState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase/compat", "default.storage.TaskState.CANCELED")
    @js.native
    def CANCELED: typings.firebase.compatMod.firebase.storage.TaskState = js.native
    inline def CANCELED_=(x: typings.firebase.compatMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.ERROR")
    @js.native
    def ERROR: typings.firebase.compatMod.firebase.storage.TaskState = js.native
    inline def ERROR_=(x: typings.firebase.compatMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.PAUSED")
    @js.native
    def PAUSED: typings.firebase.compatMod.firebase.storage.TaskState = js.native
    inline def PAUSED_=(x: typings.firebase.compatMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.RUNNING")
    @js.native
    def RUNNING: typings.firebase.compatMod.firebase.storage.TaskState = js.native
    inline def RUNNING_=(x: typings.firebase.compatMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.SUCCESS")
    @js.native
    def SUCCESS: typings.firebase.compatMod.firebase.storage.TaskState = js.native
    inline def SUCCESS_=(x: typings.firebase.compatMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  }
}
