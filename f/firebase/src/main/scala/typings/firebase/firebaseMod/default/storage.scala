package typings.firebase.firebaseMod.default

import typings.firebase.firebaseMod.firebase.app.App
import typings.firebase.firebaseMod.firebase.storage.Storage
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
    def BASE64: typings.firebase.firebaseMod.firebase.storage.StringFormat = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("firebase/compat", "default.storage.StringFormat.BASE64URL")
    @js.native
    def BASE64URL: typings.firebase.firebaseMod.firebase.storage.StringFormat = js.native
    inline def BASE64URL_=(x: typings.firebase.firebaseMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE64URL")(x.asInstanceOf[js.Any])
    
    inline def BASE64_=(x: typings.firebase.firebaseMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE64")(x.asInstanceOf[js.Any])
    
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
    def DATA_URL: typings.firebase.firebaseMod.firebase.storage.StringFormat = js.native
    inline def DATA_URL_=(x: typings.firebase.firebaseMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_URL")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\ud83d\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("firebase/compat", "default.storage.StringFormat.RAW")
    @js.native
    def RAW: typings.firebase.firebaseMod.firebase.storage.StringFormat = js.native
    inline def RAW_=(x: typings.firebase.firebaseMod.firebase.storage.StringFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW")(x.asInstanceOf[js.Any])
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
    def STATE_CHANGED: typings.firebase.firebaseMod.firebase.storage.TaskEvent = js.native
    inline def STATE_CHANGED_=(x: typings.firebase.firebaseMod.firebase.storage.TaskEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  
  object TaskState {
    
    @JSImport("firebase/compat", "default.storage.TaskState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase/compat", "default.storage.TaskState.CANCELED")
    @js.native
    def CANCELED: typings.firebase.firebaseMod.firebase.storage.TaskState = js.native
    inline def CANCELED_=(x: typings.firebase.firebaseMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.ERROR")
    @js.native
    def ERROR: typings.firebase.firebaseMod.firebase.storage.TaskState = js.native
    inline def ERROR_=(x: typings.firebase.firebaseMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.PAUSED")
    @js.native
    def PAUSED: typings.firebase.firebaseMod.firebase.storage.TaskState = js.native
    inline def PAUSED_=(x: typings.firebase.firebaseMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.RUNNING")
    @js.native
    def RUNNING: typings.firebase.firebaseMod.firebase.storage.TaskState = js.native
    inline def RUNNING_=(x: typings.firebase.firebaseMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(x.asInstanceOf[js.Any])
    
    @JSImport("firebase/compat", "default.storage.TaskState.SUCCESS")
    @js.native
    def SUCCESS: typings.firebase.firebaseMod.firebase.storage.TaskState = js.native
    inline def SUCCESS_=(x: typings.firebase.firebaseMod.firebase.storage.TaskState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  }
}
