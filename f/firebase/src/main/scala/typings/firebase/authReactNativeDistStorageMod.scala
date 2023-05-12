package typings.firebase

import typings.firebase.firebaseStrings.base64
import typings.firebase.firebaseStrings.base64url
import typings.firebase.firebaseStrings.data_url
import typings.firebase.firebaseStrings.raw
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseStorage.anon.MockUserToken
import typings.firebaseStorage.mod.FirebaseStorage
import typings.firebaseStorage.mod.FullMetadata
import typings.firebaseStorage.mod.ListOptions
import typings.firebaseStorage.mod.ListResult
import typings.firebaseStorage.mod.SettableMetadata
import typings.firebaseStorage.mod.StorageErrorCode
import typings.firebaseStorage.mod.StorageReference
import typings.firebaseStorage.mod.StringFormat
import typings.firebaseStorage.mod.UploadMetadata
import typings.firebaseStorage.mod.UploadResult
import typings.firebaseStorage.mod.UploadTask
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authReactNativeDistStorageMod {
  
  @JSImport("firebase/auth/react-native/dist/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/auth/react-native/dist/storage", "StorageError")
  @js.native
  open class StorageError protected ()
    extends typings.firebaseStorage.mod.StorageError {
    /**
      * @param code - A `StorageErrorCode` string to be prefixed with 'storage/' and
      *  added to the end of the message.
      * @param message  - Error message.
      * @param status_ - Corresponding HTTP Status Code
      */
    def this(code: StorageErrorCode, message: String) = this()
    def this(code: StorageErrorCode, message: String, status_ : Double) = this()
  }
  
  @JSImport("firebase/auth/react-native/dist/storage", "StorageErrorCode")
  @js.native
  object StorageErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.firebaseStorage.mod.StorageErrorCode & String] = js.native
    
    /* "app-deleted" */ val APP_DELETED: typings.firebaseStorage.mod.StorageErrorCode.APP_DELETED & String = js.native
    
    /* "bucket-not-found" */ val BUCKET_NOT_FOUND: typings.firebaseStorage.mod.StorageErrorCode.BUCKET_NOT_FOUND & String = js.native
    
    /* "canceled" */ val CANCELED: typings.firebaseStorage.mod.StorageErrorCode.CANCELED & String = js.native
    
    /* "cannot-slice-blob" */ val CANNOT_SLICE_BLOB: typings.firebaseStorage.mod.StorageErrorCode.CANNOT_SLICE_BLOB & String = js.native
    
    /* "internal-error" */ val INTERNAL_ERROR: typings.firebaseStorage.mod.StorageErrorCode.INTERNAL_ERROR & String = js.native
    
    /* "invalid-argument" */ val INVALID_ARGUMENT: typings.firebaseStorage.mod.StorageErrorCode.INVALID_ARGUMENT & String = js.native
    
    /* "invalid-argument-count" */ val INVALID_ARGUMENT_COUNT: typings.firebaseStorage.mod.StorageErrorCode.INVALID_ARGUMENT_COUNT & String = js.native
    
    /* "invalid-checksum" */ val INVALID_CHECKSUM: typings.firebaseStorage.mod.StorageErrorCode.INVALID_CHECKSUM & String = js.native
    
    /* "invalid-default-bucket" */ val INVALID_DEFAULT_BUCKET: typings.firebaseStorage.mod.StorageErrorCode.INVALID_DEFAULT_BUCKET & String = js.native
    
    /* "invalid-event-name" */ val INVALID_EVENT_NAME: typings.firebaseStorage.mod.StorageErrorCode.INVALID_EVENT_NAME & String = js.native
    
    /* "invalid-format" */ val INVALID_FORMAT: typings.firebaseStorage.mod.StorageErrorCode.INVALID_FORMAT & String = js.native
    
    /* "invalid-root-operation" */ val INVALID_ROOT_OPERATION: typings.firebaseStorage.mod.StorageErrorCode.INVALID_ROOT_OPERATION & String = js.native
    
    /* "invalid-url" */ val INVALID_URL: typings.firebaseStorage.mod.StorageErrorCode.INVALID_URL & String = js.native
    
    /* "no-default-bucket" */ val NO_DEFAULT_BUCKET: typings.firebaseStorage.mod.StorageErrorCode.NO_DEFAULT_BUCKET & String = js.native
    
    /* "no-download-url" */ val NO_DOWNLOAD_URL: typings.firebaseStorage.mod.StorageErrorCode.NO_DOWNLOAD_URL & String = js.native
    
    /* "object-not-found" */ val OBJECT_NOT_FOUND: typings.firebaseStorage.mod.StorageErrorCode.OBJECT_NOT_FOUND & String = js.native
    
    /* "project-not-found" */ val PROJECT_NOT_FOUND: typings.firebaseStorage.mod.StorageErrorCode.PROJECT_NOT_FOUND & String = js.native
    
    /* "quota-exceeded" */ val QUOTA_EXCEEDED: typings.firebaseStorage.mod.StorageErrorCode.QUOTA_EXCEEDED & String = js.native
    
    /* "retry-limit-exceeded" */ val RETRY_LIMIT_EXCEEDED: typings.firebaseStorage.mod.StorageErrorCode.RETRY_LIMIT_EXCEEDED & String = js.native
    
    /* "server-file-wrong-size" */ val SERVER_FILE_WRONG_SIZE: typings.firebaseStorage.mod.StorageErrorCode.SERVER_FILE_WRONG_SIZE & String = js.native
    
    /* "unauthenticated" */ val UNAUTHENTICATED: typings.firebaseStorage.mod.StorageErrorCode.UNAUTHENTICATED & String = js.native
    
    /* "unauthorized" */ val UNAUTHORIZED: typings.firebaseStorage.mod.StorageErrorCode.UNAUTHORIZED & String = js.native
    
    /* "unauthorized-app" */ val UNAUTHORIZED_APP: typings.firebaseStorage.mod.StorageErrorCode.UNAUTHORIZED_APP & String = js.native
    
    /* "unknown" */ val UNKNOWN: typings.firebaseStorage.mod.StorageErrorCode.UNKNOWN & String = js.native
    
    /* "unsupported-environment" */ val UNSUPPORTED_ENVIRONMENT: typings.firebaseStorage.mod.StorageErrorCode.UNSUPPORTED_ENVIRONMENT & String = js.native
  }
  
  object StringFormat {
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("firebase/auth/react-native/dist/storage", "StringFormat.BASE64")
    @js.native
    val BASE64: base64 = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("firebase/auth/react-native/dist/storage", "StringFormat.BASE64URL")
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
    @JSImport("firebase/auth/react-native/dist/storage", "StringFormat.DATA_URL")
    @js.native
    val DATA_URL: data_url = js.native
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\\ud83d\\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("firebase/auth/react-native/dist/storage", "StringFormat.RAW")
    @js.native
    val RAW: raw = js.native
  }
  
  inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectStorageEmulator(storage: FirebaseStorage, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteObject(ref: StorageReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBlob(ref: StorageReference): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def getBlob(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  inline def getBytes(ref: StorageReference): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def getBytes(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def getDownloadURL(ref: StorageReference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadURL")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(ref: StorageReference): js.Promise[FullMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FullMetadata]]
  
  inline def getStorage(): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")().asInstanceOf[FirebaseStorage]
  inline def getStorage(app: Unit, bucketUrl: String): FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorage]
  inline def getStorage(app: FirebaseApp): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorage]
  inline def getStorage(app: FirebaseApp, bucketUrl: String): FirebaseStorage = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any], bucketUrl.asInstanceOf[js.Any])).asInstanceOf[FirebaseStorage]
  
  inline def getStream(ref: StorageReference): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def getStream(ref: StorageReference, maxDownloadSizeBytes: Double): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
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
  
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.ArrayBuffer): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.Uint8Array): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: js.typedarray.Uint8Array, metadata: UploadMetadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: Blob): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  inline def uploadBytesResumable(ref: StorageReference, data: Blob, metadata: UploadMetadata): UploadTask = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadBytesResumable")(ref.asInstanceOf[js.Any], data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[UploadTask]
  
  inline def uploadString(ref: StorageReference, value: String): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: StorageReference, value: String, format: Unit, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: StorageReference, value: String, format: StringFormat): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
  inline def uploadString(ref: StorageReference, value: String, format: StringFormat, metadata: UploadMetadata): js.Promise[UploadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadString")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadResult]]
}
