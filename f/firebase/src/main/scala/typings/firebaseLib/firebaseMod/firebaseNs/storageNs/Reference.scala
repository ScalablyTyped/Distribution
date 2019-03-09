package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a reference to a Google Cloud Storage object. Developers can
  * upload, download, and delete objects, as well as get/set object metadata.
  */
@js.native
trait Reference extends js.Object {
  /**
    * The name of the bucket containing this reference's object.
    */
  var bucket: java.lang.String = js.native
  /**
    * The full path of this object.
    */
  var fullPath: java.lang.String = js.native
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: java.lang.String = js.native
  /**
    * A reference pointing to the parent location of this reference, or null if
    * this reference is the root.
    */
  var parent: Reference | scala.Null = js.native
  /**
    * A reference to the root of this reference's bucket.
    */
  var root: Reference = js.native
  /**
    * The storage service associated with this reference.
    */
  var storage: Storage = js.native
  /**
    * Returns a reference to a relative path from this reference.
    * @param {string} path The relative path from this reference.
    *     Leading, trailing, and consecutive slashes are removed.
    * @return {!firebase.storage.Reference} The reference to the given path.
    */
  def child(path: java.lang.String): Reference = js.native
  /**
    * Deletes the object at this reference's location.
    * @return {!firebase.Promise<void>} A Promise that resolves if the deletion
    *     succeeded and rejects if it failed, including if the object didn't exist.
    */
  def delete(): js.Promise[_] = js.native
  /**
    * Fetches a long lived download URL for this object.
    * @return {!firebase.Promise<string>} A Promise that resolves with the download
    *     URL or rejects if the fetch failed, including if the object did not
    *     exist.
    */
  def getDownloadURL(): js.Promise[_] = js.native
  /**
    * Fetches metadata for the object at this location, if one exists.
    * @return {!firebase.Promise<firebase.storage.FullMetadata>} A Promise that
    *     resolves with the metadata, or rejects if the fetch failed, including if
    *     the object did not exist.
    */
  def getMetadata(): js.Promise[_] = js.native
  /**
    * Uploads data to this reference's location.
    * @param {!Blob|!Uint8Array|!ArrayBuffer} data The data to upload.
    * @param {!firebase.storage.UploadMetadata=} metadata Metadata for the newly
    *     uploaded object.
    * @return {!firebase.storage.UploadTask} An object that can be used to monitor
    *     and manage the upload.
    */
  def put(data: js.Any): UploadTask = js.native
  def put(data: js.Any, metadata: UploadMetadata): UploadTask = js.native
  /**
    * Uploads string data to this reference's location.
    * @param {string} data The string to upload.
    * @param {!firebase.storage.StringFormat=} format The format of the string to
    *     upload.
    * @param {!firebase.storage.UploadMetadata=} metadata Metadata for the newly
    *     uploaded object.
    * @return {!firebase.storage.UploadTask}
    * @throws If the format is not an allowed format, or if the given string
    *     doesn't conform to the specified format.
    */
  def putString(data: java.lang.String): UploadTask = js.native
  def putString(data: java.lang.String, format: StringFormat): UploadTask = js.native
  def putString(data: java.lang.String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
  /**
    * Updates the metadata for the object at this location, if one exists.
    * @param {!firebase.storage.SettableMetadata} metadata The new metadata.
    *     Setting a property to 'null' removes it on the server, while leaving
    *     a property as 'undefined' has no effect.
    * @return {!firebase.Promise<firebase.storage.FullMetadata>} A Promise that
    *     resolves with the full updated metadata or rejects if the updated failed,
    *     including if the object did not exist.
    */
  def updateMetadata(metadata: SettableMetadata): js.Promise[_] = js.native
}

