package typings.firebaseStorage

import typings.firebaseStorage.anon.PartialMetadata
import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.publicTypesMod.ListOptions
import typings.firebaseStorage.publicTypesMod.UploadResult
import typings.firebaseStorage.serviceMod.FirebaseStorageImpl
import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.stringMod.StringFormat
import typings.firebaseStorage.taskMod.UploadTask
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/reference", "Reference")
  @js.native
  open class Reference protected () extends StObject {
    def this(_service: FirebaseStorageImpl, location: String) = this()
    def this(_service: FirebaseStorageImpl, location: Location) = this()
    
    var _location: Location = js.native
    
    /* protected */ def _newRef(service: FirebaseStorageImpl, location: Location): Reference = js.native
    
    /* private */ var _service: Any = js.native
    
    /**
      * Utility function to throw an error in methods that do not accept a root reference.
      */
    def _throwIfRoot(name: String): Unit = js.native
    
    /**
      * The name of the bucket containing this reference's object.
      */
    def bucket: String = js.native
    
    /**
      * The full path of this object.
      */
    def fullPath: String = js.native
    
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    def name: String = js.native
    
    /**
      * A `StorageReference` pointing to the parent location of this `StorageReference`, or null if
      * this reference is the root.
      */
    def parent: Reference | Null = js.native
    
    /**
      * A reference to the root of this object's bucket.
      */
    def root: Reference = js.native
    
    /**
      * The `StorageService` instance this `StorageReference` is associated with.
      */
    def storage: FirebaseStorageImpl = js.native
  }
  
  inline def deleteObject(ref: Reference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBlobInternal(ref: Reference): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlobInternal")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def getBlobInternal(ref: Reference, maxDownloadSizeBytes: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlobInternal")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  inline def getBytesInternal(ref: Reference): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesInternal")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def getBytesInternal(ref: Reference, maxDownloadSizeBytes: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytesInternal")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def getChild(ref: Reference, childPath: String): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("_getChild")(ref.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any])).asInstanceOf[Reference]
  
  inline def getDownloadURL(ref: Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(ref: Reference): js.Promise[Metadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Metadata]]
  
  inline def getStreamInternal(ref: Reference): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamInternal")(ref.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  inline def getStreamInternal(ref: Reference, maxDownloadSizeBytes: Double): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStreamInternal")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
  
  inline def list(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  inline def list(ref: Reference, options: ListOptions): js.Promise[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListResult]]
  
  inline def listAll(ref: Reference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAll")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  
  inline def updateMetadata(ref: Reference, metadata: PartialMetadata): js.Promise[Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMetadata")(ref.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Metadata]]
  
  inline def uploadBytes(ref: Reference, data: js.typedarray.ArrayBuffer): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: Reference, data: js.typedarray.ArrayBuffer, metadata: Metadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: Reference, data: js.typedarray.Uint8Array): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: Reference, data: js.typedarray.Uint8Array, metadata: Metadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: Reference, data: Blob): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: Reference, data: Blob, metadata: Metadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  
  inline def uploadBytesResumable(ref: Reference, data: js.typedarray.ArrayBuffer): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: js.typedarray.ArrayBuffer, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: js.typedarray.Uint8Array): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: js.typedarray.Uint8Array, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: Blob): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: Reference, data: Blob, metadata: Metadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  
  inline def uploadString(ref: Reference, value: String): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: Reference, value: String, format: Unit, metadata: Metadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: Reference, value: String, format: StringFormat): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: Reference, value: String, format: StringFormat, metadata: Metadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
}
