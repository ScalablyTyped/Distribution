package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Firebase Storage service interface.
  *
  * Do not call this constructor directly. Instead, use
  * {@link firebase.storage `firebase.storage()`}.
  *
  * See
  * {@link
  *   https://firebase.google.com/docs/storage/web/start/
  *   Get Started on Web}
  * for a full guide on how to use the Firebase Storage service.
  */
@js.native
trait Storage extends js.Object {
  /**
    * The {@link firebase.app.App app} associated with the `Storage` service
    * instance.
    *
    * @example
    * ```
    * var app = storage.app;
    * ```
    */
  var app: firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  /**
    * The maximum time to retry operations other than uploads or downloads in
    * milliseconds.
    */
  var maxOperationRetryTime: scala.Double = js.native
  /**
    * The maximum time to retry uploads in milliseconds.
    */
  var maxUploadRetryTime: scala.Double = js.native
  /**
    * Returns a reference for the given path in the default bucket.
    * @param {string=} path A relative path to initialize the reference with,
    *     for example `path/to/image.jpg`. If not passed, the returned reference
    *     points to the bucket root.
    * @return {!firebase.storage.Reference} A reference for the given path.
    */
  def ref(): Reference = js.native
  def ref(path: java.lang.String): Reference = js.native
  /**
    * Returns a reference for the given absolute URL.
    * @param {string} url A URL in the form: <br />
    *     1) a gs:// URL, for example `gs://bucket/files/image.png` <br />
    *     2) a download URL taken from object metadata. <br />
    *     @see {@link firebase.storage.FullMetadata.prototype.downloadURLs}
    * @return {!firebase.storage.Reference} A reference for the given URL.
    */
  def refFromURL(url: java.lang.String): Reference = js.native
  /**
    * @param {number} time The new maximum operation retry time in milliseconds.
    * @see {@link firebase.storage.Storage.prototype.maxOperationRetryTime}
    */
  def setMaxOperationRetryTime(time: scala.Double): js.Any = js.native
  /**
    * @param {number} time The new maximum upload retry time in milliseconds.
    * @see {@link firebase.storage.Storage.prototype.maxUploadRetryTime}
    */
  def setMaxUploadRetryTime(time: scala.Double): js.Any = js.native
}

