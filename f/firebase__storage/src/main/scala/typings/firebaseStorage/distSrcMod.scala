package typings.firebaseStorage

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.anon.MockUserToken
import typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode
import typings.firebaseStorage.distSrcImplementationStringMod.StringData
import typings.firebaseStorage.distSrcImplementationStringMod.StringFormat
import typings.firebaseStorage.distSrcMetadataMod.Metadata
import typings.firebaseStorage.distSrcPublicTypesMod.FirebaseStorage
import typings.firebaseStorage.distSrcPublicTypesMod.FullMetadata
import typings.firebaseStorage.distSrcPublicTypesMod.ListOptions
import typings.firebaseStorage.distSrcPublicTypesMod.ListResult
import typings.firebaseStorage.distSrcPublicTypesMod.SettableMetadata
import typings.firebaseStorage.distSrcPublicTypesMod.StorageReference
import typings.firebaseStorage.distSrcPublicTypesMod.UploadMetadata
import typings.firebaseStorage.distSrcPublicTypesMod.UploadResult
import typings.firebaseStorage.firebaseStorageStrings.base64
import typings.firebaseStorage.firebaseStorageStrings.base64url
import typings.firebaseStorage.firebaseStorageStrings.canceled
import typings.firebaseStorage.firebaseStorageStrings.data_url
import typings.firebaseStorage.firebaseStorageStrings.error
import typings.firebaseStorage.firebaseStorageStrings.paused
import typings.firebaseStorage.firebaseStorageStrings.raw
import typings.firebaseStorage.firebaseStorageStrings.running
import typings.firebaseStorage.firebaseStorageStrings.success
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("@firebase/storage/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/src", "_FbsBlob")
  @js.native
  open class FbsBlob protected ()
    extends typings.firebaseStorage.distSrcApiMod.FbsBlob {
    def this(data: js.typedarray.ArrayBuffer) = this()
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: Blob) = this()
    def this(data: js.typedarray.ArrayBuffer, elideCopy: Boolean) = this()
    def this(data: js.typedarray.Uint8Array, elideCopy: Boolean) = this()
    def this(data: Blob, elideCopy: Boolean) = this()
  }
  /* static members */
  object FbsBlob {
    
    @JSImport("@firebase/storage/dist/src", "_FbsBlob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBlob(args: (String | typings.firebaseStorage.distSrcImplementationBlobMod.FbsBlob)*): typings.firebaseStorage.distSrcImplementationBlobMod.FbsBlob | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseStorage.distSrcImplementationBlobMod.FbsBlob | Null]
  }
  
  @JSImport("@firebase/storage/dist/src", "_FirebaseStorageImpl")
  @js.native
  open class FirebaseStorageImpl protected ()
    extends typings.firebaseStorage.distSrcApiMod.FirebaseStorageImpl {
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
  
  @JSImport("@firebase/storage/dist/src", "_Location")
  @js.native
  open class Location protected ()
    extends typings.firebaseStorage.distSrcApiMod.Location {
    def this(bucket: String, path: String) = this()
  }
  /* static members */
  object Location {
    
    @JSImport("@firebase/storage/dist/src", "_Location")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromBucketSpec(bucketString: String, host: String): typings.firebaseStorage.distSrcImplementationLocationMod.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromBucketSpec")(bucketString.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcImplementationLocationMod.Location]
    
    inline def makeFromUrl(url: String, host: String): typings.firebaseStorage.distSrcImplementationLocationMod.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromUrl")(url.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcImplementationLocationMod.Location]
  }
  
  @JSImport("@firebase/storage/dist/src", "_Reference")
  @js.native
  open class Reference protected ()
    extends typings.firebaseStorage.distSrcApiMod.Reference {
    def this(_service: typings.firebaseStorage.distSrcServiceMod.FirebaseStorageImpl, location: String) = this()
    def this(
      _service: typings.firebaseStorage.distSrcServiceMod.FirebaseStorageImpl,
      location: typings.firebaseStorage.distSrcImplementationLocationMod.Location
    ) = this()
  }
  
  @JSImport("@firebase/storage/dist/src", "StorageError")
  @js.native
  open class StorageError protected ()
    extends typings.firebaseStorage.distSrcApiMod.StorageError {
    /**
      * @param code - A `StorageErrorCode` string to be prefixed with 'storage/' and
      *  added to the end of the message.
      * @param message  - Error message.
      * @param status_ - Corresponding HTTP Status Code
      */
    def this(code: StorageErrorCode, message: String) = this()
    def this(code: StorageErrorCode, message: String, status_ : Double) = this()
  }
  
  @JSImport("@firebase/storage/dist/src", "StorageErrorCode")
  @js.native
  object StorageErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode & String] = js.native
    
    /* "app-deleted" */ val APP_DELETED: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.APP_DELETED & String = js.native
    
    /* "bucket-not-found" */ val BUCKET_NOT_FOUND: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.BUCKET_NOT_FOUND & String = js.native
    
    /* "canceled" */ val CANCELED: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.CANCELED & String = js.native
    
    /* "cannot-slice-blob" */ val CANNOT_SLICE_BLOB: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.CANNOT_SLICE_BLOB & String = js.native
    
    /* "internal-error" */ val INTERNAL_ERROR: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INTERNAL_ERROR & String = js.native
    
    /* "invalid-argument" */ val INVALID_ARGUMENT: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_ARGUMENT & String = js.native
    
    /* "invalid-argument-count" */ val INVALID_ARGUMENT_COUNT: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_ARGUMENT_COUNT & String = js.native
    
    /* "invalid-checksum" */ val INVALID_CHECKSUM: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_CHECKSUM & String = js.native
    
    /* "invalid-default-bucket" */ val INVALID_DEFAULT_BUCKET: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_DEFAULT_BUCKET & String = js.native
    
    /* "invalid-event-name" */ val INVALID_EVENT_NAME: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_EVENT_NAME & String = js.native
    
    /* "invalid-format" */ val INVALID_FORMAT: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_FORMAT & String = js.native
    
    /* "invalid-root-operation" */ val INVALID_ROOT_OPERATION: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_ROOT_OPERATION & String = js.native
    
    /* "invalid-url" */ val INVALID_URL: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.INVALID_URL & String = js.native
    
    /* "no-default-bucket" */ val NO_DEFAULT_BUCKET: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.NO_DEFAULT_BUCKET & String = js.native
    
    /* "no-download-url" */ val NO_DOWNLOAD_URL: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.NO_DOWNLOAD_URL & String = js.native
    
    /* "object-not-found" */ val OBJECT_NOT_FOUND: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.OBJECT_NOT_FOUND & String = js.native
    
    /* "project-not-found" */ val PROJECT_NOT_FOUND: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.PROJECT_NOT_FOUND & String = js.native
    
    /* "quota-exceeded" */ val QUOTA_EXCEEDED: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.QUOTA_EXCEEDED & String = js.native
    
    /* "retry-limit-exceeded" */ val RETRY_LIMIT_EXCEEDED: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.RETRY_LIMIT_EXCEEDED & String = js.native
    
    /* "server-file-wrong-size" */ val SERVER_FILE_WRONG_SIZE: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.SERVER_FILE_WRONG_SIZE & String = js.native
    
    /* "unauthenticated" */ val UNAUTHENTICATED: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.UNAUTHENTICATED & String = js.native
    
    /* "unauthorized" */ val UNAUTHORIZED: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.UNAUTHORIZED & String = js.native
    
    /* "unauthorized-app" */ val UNAUTHORIZED_APP: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.UNAUTHORIZED_APP & String = js.native
    
    /* "unknown" */ val UNKNOWN: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.UNKNOWN & String = js.native
    
    /* "unsupported-environment" */ val UNSUPPORTED_ENVIRONMENT: typings.firebaseStorage.distSrcImplementationErrorMod.StorageErrorCode.UNSUPPORTED_ENVIRONMENT & String = js.native
  }
  
  object StringFormat {
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage/dist/src", "StringFormat.BASE64")
    @js.native
    val BASE64: base64 = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage/dist/src", "StringFormat.BASE64URL")
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
    @JSImport("@firebase/storage/dist/src", "StringFormat.DATA_URL")
    @js.native
    val DATA_URL: data_url = js.native
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\\ud83d\\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("@firebase/storage/dist/src", "StringFormat.RAW")
    @js.native
    val RAW: raw = js.native
  }
  
  object TaskEvent {
    
    @JSImport("@firebase/storage/dist/src", "_TaskEvent")
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
    @JSImport("@firebase/storage/dist/src", "_TaskEvent.STATE_CHANGED")
    @js.native
    def STATE_CHANGED: String = js.native
    inline def STATE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(x.asInstanceOf[js.Any])
  }
  
  object TaskState {
    
    /** The task was canceled. */
    @JSImport("@firebase/storage/dist/src", "_TaskState.CANCELED")
    @js.native
    val CANCELED: canceled = js.native
    
    /** The task failed with an error. */
    @JSImport("@firebase/storage/dist/src", "_TaskState.ERROR")
    @js.native
    val ERROR: error = js.native
    
    /** The task was paused by the user. */
    @JSImport("@firebase/storage/dist/src", "_TaskState.PAUSED")
    @js.native
    val PAUSED: paused = js.native
    
    /** The task is currently transferring data. */
    @JSImport("@firebase/storage/dist/src", "_TaskState.RUNNING")
    @js.native
    val RUNNING: running = js.native
    
    /** The task completed successfully. */
    @JSImport("@firebase/storage/dist/src", "_TaskState.SUCCESS")
    @js.native
    val SUCCESS: success = js.native
  }
  
  @JSImport("@firebase/storage/dist/src", "_UploadTask")
  @js.native
  open class UploadTask protected ()
    extends typings.firebaseStorage.distSrcApiMod.UploadTask {
    /**
      * @param ref - The firebaseStorage.Reference object this task came
      *     from, untyped to avoid cyclic dependencies.
      * @param blob - The blob to upload.
      */
    def this(
      ref: typings.firebaseStorage.distSrcReferenceMod.Reference,
      blob: typings.firebaseStorage.distSrcImplementationBlobMod.FbsBlob
    ) = this()
    def this(
      ref: typings.firebaseStorage.distSrcReferenceMod.Reference,
      blob: typings.firebaseStorage.distSrcImplementationBlobMod.FbsBlob,
      metadata: Metadata
    ) = this()
  }
  
  inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dataFromString(format: StringFormat, stringData: String): StringData = (^.asInstanceOf[js.Dynamic].applyDynamic("_dataFromString")(format.asInstanceOf[js.Any], stringData.asInstanceOf[js.Any])).asInstanceOf[StringData]
  
  inline def deleteObject(ref: StorageReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBlob(ref: StorageReference): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def getBlob(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  inline def getBytes(ref: StorageReference): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def getBytes(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def getChild(ref: StorageReference, childPath: String): typings.firebaseStorage.distSrcReferenceMod.Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("_getChild")(ref.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcReferenceMod.Reference]
  
  inline def getDownloadURL(ref: StorageReference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(ref: StorageReference): js.Promise[FullMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FullMetadata]]
  
  inline def getStorage(): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")().asInstanceOf[FirebaseStorage]
  inline def getStorage(app: Unit, bucketUrl: String): FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorage]
  inline def getStorage(app: FirebaseApp): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorage]
  inline def getStorage(app: FirebaseApp, bucketUrl: String): FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorage]
  
  inline def getStream(ref: StorageReference): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def getStream(ref: StorageReference, maxDownloadSizeBytes: Double): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def invalidArgument(message: String): typings.firebaseStorage.distSrcImplementationErrorMod.StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("_invalidArgument")(message.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseStorage.distSrcImplementationErrorMod.StorageError]
  
  inline def invalidRootOperation(name: String): typings.firebaseStorage.distSrcImplementationErrorMod.StorageError = ^.asInstanceOf[js.Dynamic].applyDynamic("_invalidRootOperation")(name.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseStorage.distSrcImplementationErrorMod.StorageError]
  
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
  
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.ArrayBuffer): typings.firebaseStorage.distSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): typings.firebaseStorage.distSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.Uint8Array): typings.firebaseStorage.distSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.Uint8Array, metadata: UploadMetadata): typings.firebaseStorage.distSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: Blob): typings.firebaseStorage.distSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcPublicTypesMod.UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: Blob, metadata: UploadMetadata): typings.firebaseStorage.distSrcPublicTypesMod.UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseStorage.distSrcPublicTypesMod.UploadTask]
  
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def setStorage(value: FirebaseStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      }
    }
  }
}
