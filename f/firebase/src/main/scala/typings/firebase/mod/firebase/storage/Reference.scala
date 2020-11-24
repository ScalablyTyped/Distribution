package typings.firebase.mod.firebase.storage

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a reference to a Google Cloud Storage object. Developers can
  * upload, download, and delete objects, as well as get/set object metadata.
  */
@js.native
trait Reference extends js.Object {
  
  /**
    * The name of the bucket containing this reference's object.
    */
  var bucket: String = js.native
  
  /**
    * Returns a reference to a relative path from this reference.
    * @param path The relative path from this reference.
    *     Leading, trailing, and consecutive slashes are removed.
    * @return The reference to the given path.
    */
  def child(path: String): Reference = js.native
  
  /**
    * Deletes the object at this reference's location.
    * @return A Promise that resolves if the deletion
    *     succeeded and rejects if it failed, including if the object didn't exist.
    */
  def delete(): js.Promise[_] = js.native
  
  /**
    * The full path of this object.
    */
  var fullPath: String = js.native
  
  /**
    * Fetches a long lived download URL for this object.
    * @return A Promise that resolves with the download
    *     URL or rejects if the fetch failed, including if the object did not
    *     exist.
    */
  def getDownloadURL(): js.Promise[_] = js.native
  
  /**
    * Fetches metadata for the object at this location, if one exists.
    * @return A Promise that
    *     resolves with the metadata, or rejects if the fetch failed, including if
    *     the object did not exist.
    */
  def getMetadata(): js.Promise[_] = js.native
  
  /**
    * List items (files) and prefixes (folders) under this storage reference.
    *
    * List API is only available for Firebase Rules Version 2.
    *
    * GCS is a key-blob store. Firebase Storage imposes the semantic of '/'
    * delimited folder structure.
    * Refer to GCS's List API if you want to learn more.
    *
    * To adhere to Firebase Rules's Semantics, Firebase Storage does not
    * support objects whose paths end with "/" or contain two consecutive
    * "/"s. Firebase Storage List API will filter these unsupported objects.
    * `list()` may fail if there are too many unsupported objects in the bucket.
    *
    * @param options See `ListOptions` for details.
    * @return A Promise that resolves with the items and prefixes.
    *      `prefixes` contains references to sub-folders and `items`
    *      contains references to objects in this folder. `nextPageToken`
    *      can be used to get the rest of the results.
    */
  def list(): js.Promise[ListResult] = js.native
  def list(options: ListOptions): js.Promise[ListResult] = js.native
  
  /**
    * List all items (files) and prefixes (folders) under this storage reference.
    *
    * This is a helper method for calling `list()` repeatedly until there are
    * no more results. The default pagination size is 1000.
    *
    * Note: The results may not be consistent if objects are changed while this
    * operation is running.
    *
    * Warning: `listAll` may potentially consume too many resources if there are
    * too many results.
    *
    * @return A Promise that resolves with all the items and prefixes under
    *      the current storage reference. `prefixes` contains references to
    *      sub-directories and `items` contains references to objects in this
    *      folder. `nextPageToken` is never returned.
    */
  def listAll(): js.Promise[ListResult] = js.native
  
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: String = js.native
  
  /**
    * A reference pointing to the parent location of this reference, or null if
    * this reference is the root.
    */
  var parent: Reference | Null = js.native
  
  def put(data: ArrayBuffer): UploadTask = js.native
  def put(data: ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
  /**
    * Uploads data to this reference's location.
    * @param data The data to upload.
    * @param metadata Metadata for the newly
    *     uploaded object.
    * @return An object that can be used to monitor
    *     and manage the upload.
    */
  def put(data: Blob): UploadTask = js.native
  def put(data: Blob, metadata: UploadMetadata): UploadTask = js.native
  def put(data: Uint8Array): UploadTask = js.native
  def put(data: Uint8Array, metadata: UploadMetadata): UploadTask = js.native
  
  /**
    * Uploads string data to this reference's location.
    * @param data The string to upload.
    * @param format The format of the string to
    *     upload.
    * @param metadata Metadata for the newly
    *     uploaded object.
    * @throws If the format is not an allowed format, or if the given string
    *     doesn't conform to the specified format.
    */
  def putString(data: String): UploadTask = js.native
  def putString(data: String, format: js.UndefOr[scala.Nothing], metadata: UploadMetadata): UploadTask = js.native
  def putString(data: String, format: StringFormat): UploadTask = js.native
  def putString(data: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
  
  /**
    * A reference to the root of this reference's bucket.
    */
  var root: Reference = js.native
  
  /**
    * The storage service associated with this reference.
    */
  var storage: Storage = js.native
  
  /**
    * Updates the metadata for the object at this location, if one exists.
    * @param metadata The new metadata.
    *     Setting a property to 'null' removes it on the server, while leaving
    *     a property as 'undefined' has no effect.
    * @return A Promise that
    *     resolves with the full updated metadata or rejects if the updated failed,
    *     including if the object did not exist.
    */
  def updateMetadata(metadata: SettableMetadata): js.Promise[_] = js.native
}
