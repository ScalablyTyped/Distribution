package typings.firebaseStorage

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.anon.MockUserToken
import typings.firebaseStorage.distNodeEsmSrcImplementationErrorMod.StorageError
import typings.firebaseStorage.distNodeEsmSrcImplementationStringMod.StringData
import typings.firebaseStorage.distNodeEsmSrcImplementationStringMod.StringFormat
import typings.firebaseStorage.distNodeEsmSrcMetadataMod.Metadata
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.FirebaseStorage
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.FullMetadata
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.ListOptions
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.ListResult
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.SettableMetadata
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.StorageReference
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadMetadata
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadResult
import typings.firebaseStorage.firebaseStorageStrings.base64
import typings.firebaseStorage.firebaseStorageStrings.base64url
import typings.firebaseStorage.firebaseStorageStrings.canceled
import typings.firebaseStorage.firebaseStorageStrings.data_url
import typings.firebaseStorage.firebaseStorageStrings.error
import typings.firebaseStorage.firebaseStorageStrings.paused
import typings.firebaseStorage.firebaseStorageStrings.raw
import typings.firebaseStorage.firebaseStorageStrings.running
import typings.firebaseStorage.firebaseStorageStrings.success
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcApiMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/api", "_FbsBlob")
  @js.native
  open class FbsBlob protected ()
    extends typings.firebaseStorage.distNodeEsmSrcImplementationBlobMod.FbsBlob {
    def this(data: js.typedarray.ArrayBuffer) = this()
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: Blob) = this()
    def this(data: js.typedarray.ArrayBuffer, elideCopy: Boolean) = this()
    def this(data: js.typedarray.Uint8Array, elideCopy: Boolean) = this()
    def this(data: Blob, elideCopy: Boolean) = this()
  }
  /* static members */
  object FbsBlob {
    
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_FbsBlob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBlob(args: (String | typings.firebaseStorage.distNodeEsmSrcImplementationBlobMod.FbsBlob)*): typings.firebaseStorage.distNodeEsmSrcImplementationBlobMod.FbsBlob | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcImplementationBlobMod.FbsBlob | Null]
  }
  
  @JSImport("@firebase/storage/dist/node-esm/src/api", "_FirebaseStorageImpl")
  @js.native
  open class FirebaseStorageImpl protected ()
    extends typings.firebaseStorage.distNodeEsmSrcServiceMod.FirebaseStorageImpl {
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName]
    ) = this()
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName],
      /**
      * @internal
      */
    _url: String
    ) = this()
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName],
      /**
      * @internal
      */
    _url: String,
      _firebaseVersion: String
    ) = this()
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName],
      /**
      * @internal
      */
    _url: Unit,
      _firebaseVersion: String
    ) = this()
  }
  
  @JSImport("@firebase/storage/dist/node-esm/src/api", "_Location")
  @js.native
  open class Location protected ()
    extends typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location {
    def this(bucket: String, path: String) = this()
  }
  /* static members */
  object Location {
    
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_Location")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromBucketSpec(bucketString: String, host: String): typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromBucketSpec")(bucketString.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location]
    
    inline def makeFromUrl(url: String, host: String): typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromUrl")(url.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location]
  }
  
  @JSImport("@firebase/storage/dist/node-esm/src/api", "_Reference")
  @js.native
  open class Reference protected ()
    extends typings.firebaseStorage.distNodeEsmSrcReferenceMod.Reference {
    def this(_service: typings.firebaseStorage.distNodeEsmSrcServiceMod.FirebaseStorageImpl, location: String) = this()
    def this(
      _service: typings.firebaseStorage.distNodeEsmSrcServiceMod.FirebaseStorageImpl,
      location: typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location
    ) = this()
  }
  
  object StringFormat {
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "StringFormat.BASE64")
    @js.native
    val BASE64: base64 = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "StringFormat.BASE64URL")
    @js.native
    val BASE64URL: base64url = js.native
    
    /**
      * Indicates the string is a data URL, such as one obtained from
      * canvas.toDataURL().
      * Example: the string 'data:application/octet-stream;base64,aaaa'
      * becomes the byte sequence
      * 69 a6 9a
      * (the content-type "application/octet-stream" is also applied, but can
      * be overridden in the metadata object).
      */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "StringFormat.DATA_URL")
    @js.native
    val DATA_URL: data_url = js.native
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\\ud83d\\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "StringFormat.RAW")
    @js.native
    val RAW: raw = js.native
  }
  
  object TaskEvent {
    
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * For this event,
      * <ul>
      *   <li>The `next` function is triggered on progress updates and when the
      *       task is paused/resumed with an `UploadTaskSnapshot` as the first
      *       argument.</li>
      *   <li>The `error` function is triggered if the upload is canceled or fails
      *       for another reason.</li>
      *   <li>The `complete` function is triggered if the upload completes
      *       successfully.</li>
      * </ul>
      */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskEvent.STATE_CHANGED")
    @js.native
    def STATE_CHANGED: String = js.native
    inline def STATE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  
  object TaskState {
    
    /** The task was canceled. */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskState.CANCELED")
    @js.native
    val CANCELED: canceled = js.native
    
    /** The task failed with an error. */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskState.ERROR")
    @js.native
    val ERROR: error = js.native
    
    /** The task was paused by the user. */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskState.PAUSED")
    @js.native
    val PAUSED: paused = js.native
    
    /** The task is currently transferring data. */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskState.RUNNING")
    @js.native
    val RUNNING: running = js.native
    
    /** The task completed successfully. */
    @JSImport("@firebase/storage/dist/node-esm/src/api", "_TaskState.SUCCESS")
    @js.native
    val SUCCESS: success = js.native
  }
  
  @JSImport("@firebase/storage/dist/node-esm/src/api", "_UploadTask")
  @js.native
  open class UploadTask protected ()
    extends typings.firebaseStorage.distNodeEsmSrcTaskMod.UploadTask {
    /**
      * @param ref - The firebaseStorage.Reference object this task came
      *     from, untyped to avoid cyclic dependencies.
      * @param blob - The blob to upload.
      */
    def this(
      ref: typings.firebaseStorage.distNodeEsmSrcReferenceMod.Reference,
      blob: typings.firebaseStorage.distNodeEsmSrcImplementationBlobMod.FbsBlob
    ) = this()
    def this(
      ref: typings.firebaseStorage.distNodeEsmSrcReferenceMod.Reference,
      blob: typings.firebaseStorage.distNodeEsmSrcImplementationBlobMod.FbsBlob,
      metadata: Metadata
    ) = this()
  }
  
  inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dataFromString(format: StringFormat, stringData: String): StringData = (^.asInstanceOf[js.Dynamic].applyDynamic("_dataFromString")(format.asInstanceOf[js.Any], stringData.asInstanceOf[js.Any])).asInstanceOf[StringData]
  
  inline def deleteObject(ref: StorageReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBytes(ref: StorageReference): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def getBytes(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def getChild(ref: StorageReference, childPath: String): typings.firebaseStorage.distNodeEsmSrcReferenceMod.Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("_getChild")(ref.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcReferenceMod.Reference]
  
  inline def getDownloadURL(ref: StorageReference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(ref: StorageReference): js.Promise[FullMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FullMetadata]]
  
  inline def getStorage(): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")().asInstanceOf[FirebaseStorage]
  inline def getStorage(app: Unit, bucketUrl: String): FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorage]
  inline def getStorage(app: FirebaseApp): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorage]
  inline def getStorage(app: FirebaseApp, bucketUrl: String): FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorage]
  
  inline def invalidArgument(message: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("_invalidArgument")(message.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def invalidRootOperation(name: String): StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("_invalidRootOperation")(name.asInstanceOf[js.Any]).asInstanceOf[StorageError]
  
  inline def list(ref: StorageReference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  inline def list(ref: StorageReference, options: ListOptions): js.Promise[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListResult]]
  
  inline def listAll(ref: StorageReference): js.Promise[ListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAll")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult]]
  
  inline def ref(storageOrRef: StorageReference): StorageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any]).asInstanceOf[StorageReference]
  inline def ref(storageOrRef: StorageReference, path: String): StorageReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[StorageReference]
  inline def ref(storage: FirebaseStorage): StorageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storage.asInstanceOf[js.Any]).asInstanceOf[StorageReference]
  inline def ref(storage: FirebaseStorage, url: String): StorageReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storage.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[StorageReference]
  
  inline def updateMetadata(ref: StorageReference, metadata: SettableMetadata): js.Promise[FullMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMetadata")(ref.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FullMetadata]]
  
  inline def uploadBytes(ref: StorageReference, data: js.typedarray.ArrayBuffer): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: StorageReference, data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: StorageReference, data: js.typedarray.Uint8Array): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: StorageReference, data: js.typedarray.Uint8Array, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: StorageReference, data: Blob): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadBytes(ref: StorageReference, data: Blob, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytes")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.ArrayBuffer): typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.Uint8Array): typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.Uint8Array, metadata: UploadMetadata): typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: Blob): typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: Blob, metadata: UploadMetadata): typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.UploadTask]
  
  inline def uploadString(ref: StorageReference, value: String): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: StorageReference, value: String, format: Unit, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: StorageReference, value: String, format: StringFormat): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: StorageReference, value: String, format: StringFormat, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var storage: FirebaseStorage
    }
    object NameServiceMapping {
      
      inline def apply(storage: FirebaseStorage): NameServiceMapping = {
        val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setStorage(value: FirebaseStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      }
    }
  }
}
