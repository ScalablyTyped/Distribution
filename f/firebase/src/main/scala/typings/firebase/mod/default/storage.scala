package typings.firebase.mod.default

import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.storage.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
@JSImport("firebase", "storage")
@js.native
object storage extends js.Object {
  
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
    * @webonly
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
  def apply(): Storage = js.native
  def apply(app: App): Storage = js.native
  
  @js.native
  object StringFormat extends js.Object {
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    var BASE64: typings.firebase.mod.firebase.storage.StringFormat = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    var BASE64URL: typings.firebase.mod.firebase.storage.StringFormat = js.native
    
    /**
      * Indicates the string is a data URL, such as one obtained from
      * canvas.toDataURL().
      * Example: the string 'data:application/octet-stream;base64,aaaa'
      * becomes the byte sequence
      * 69 a6 9a
      * (the content-type "application/octet-stream" is also applied, but can
      * be overridden in the metadata object).
      */
    var DATA_URL: typings.firebase.mod.firebase.storage.StringFormat = js.native
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\ud83d\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    var RAW: typings.firebase.mod.firebase.storage.StringFormat = js.native
  }
  
  @js.native
  object TaskEvent extends js.Object {
    
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
    var STATE_CHANGED: typings.firebase.mod.firebase.storage.TaskEvent = js.native
  }
  
  @js.native
  object TaskState extends js.Object {
    
    var CANCELED: typings.firebase.mod.firebase.storage.TaskState = js.native
    
    var ERROR: typings.firebase.mod.firebase.storage.TaskState = js.native
    
    var PAUSED: typings.firebase.mod.firebase.storage.TaskState = js.native
    
    var RUNNING: typings.firebase.mod.firebase.storage.TaskState = js.native
    
    var SUCCESS: typings.firebase.mod.firebase.storage.TaskState = js.native
  }
}
