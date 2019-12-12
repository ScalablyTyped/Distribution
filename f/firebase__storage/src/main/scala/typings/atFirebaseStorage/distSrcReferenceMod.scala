package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationAuthwrapperMod.AuthWrapper
import typings.atFirebaseStorage.distSrcImplementationLocationMod.Location
import typings.atFirebaseStorage.distSrcImplementationMetadataMod.Mappings
import typings.atFirebaseStorage.distSrcImplementationStringMod.StringFormat
import typings.atFirebaseStorage.distSrcListMod.ListOptions
import typings.atFirebaseStorage.distSrcListMod.ListResult
import typings.atFirebaseStorage.distSrcMetadataMod.Metadata
import typings.atFirebaseStorage.distSrcReferenceMod.Reference
import typings.atFirebaseStorage.distSrcServiceMod.Service
import typings.atFirebaseStorage.distSrcTaskMod.UploadTask
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/reference", JSImport.Namespace)
@js.native
object distSrcReferenceMod extends js.Object {
  @js.native
  class Reference protected () extends js.Object {
    def this(authWrapper: AuthWrapper, location: String) = this()
    def this(authWrapper: AuthWrapper, location: Location) = this()
    var authWrapper: AuthWrapper = js.native
    var listAllHelper: js.Any = js.native
    var location: Location = js.native
    var throwIfRoot_ : js.Any = js.native
    def bucket(): String = js.native
    /**
      * @return A reference to the object obtained by
      *     appending childPath, removing any duplicate, beginning, or trailing
      *     slashes.
      */
    def child(childPath: String): Reference = js.native
    /**
      * Deletes the object at this location.
      * @return A promise that resolves if the deletion succeeds.
      */
    def delete(): js.Promise[Unit] = js.native
    def fullPath(): String = js.native
    /**
      * @return A promise that resolves with the download
      *     URL for this object.
      */
    def getDownloadURL(): js.Promise[String] = js.native
    /**
      *     A promise that resolves with the metadata for this object. If this
      *     object doesn't exist or metadata cannot be retreived, the promise is
      *     rejected.
      */
    def getMetadata(): js.Promise[Metadata] = js.native
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
      * list() may fail if there are too many unsupported objects in the bucket.
      *
      * @param options See ListOptions for details.
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
      * This is a helper method for calling list() repeatedly until there are
      * no more results. The default pagination size is 1000.
      *
      * Note: The results may not be consistent if objects are changed while this
      * operation is running.
      *
      * Warning: listAll may potentially consume too many resources if there are
      * too many results.
      *
      * @return A Promise that resolves with all the items and prefixes under
      *      the current storage reference. `prefixes` contains references to
      *      sub-directories and `items` contains references to objects in this
      *      folder. `nextPageToken` is never returned.
      */
    def listAll(): js.Promise[ListResult] = js.native
    /* protected */ def mappings(): Mappings = js.native
    def name(): String = js.native
    /* protected */ def newRef(authWrapper: AuthWrapper, location: Location): Reference = js.native
    /**
      * @return A reference to the parent of the
      *     current object, or null if the current object is the root.
      */
    def parent(): Reference | Null = js.native
    def put(data: ArrayBuffer): UploadTask = js.native
    def put(data: ArrayBuffer, metadata: Metadata): UploadTask = js.native
    /**
      * Uploads a blob to this object's location.
      * @param data The blob to upload.
      * @return An UploadTask that lets you control and
      *     observe the upload.
      */
    def put(data: Blob): UploadTask = js.native
    def put(data: Blob, metadata: Metadata): UploadTask = js.native
    def put(data: Uint8Array): UploadTask = js.native
    def put(data: Uint8Array, metadata: Metadata): UploadTask = js.native
    /**
      * Uploads a string to this object's location.
      * @param value The string to upload.
      * @param format The format of the string to upload.
      * @return An UploadTask that lets you control and
      *     observe the upload.
      */
    def putString(value: String): UploadTask = js.native
    def putString(value: String, format: StringFormat): UploadTask = js.native
    def putString(value: String, format: StringFormat, metadata: Metadata): UploadTask = js.native
    /**
      * @return An reference to the root of this
      *     object's bucket.
      */
    def root(): Reference = js.native
    def storage(): Service = js.native
    /**
      * Updates the metadata for this object.
      * @param metadata The new metadata for the object.
      *     Only values that have been explicitly set will be changed. Explicitly
      *     setting a value to null will remove the metadata.
      * @return A promise that resolves
      *     with the new metadata for this object.
      *     @see firebaseStorage.Reference.prototype.getMetadata
      */
    def updateMetadata(metadata: Metadata): js.Promise[Metadata] = js.native
  }
  
}

