package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseStorage.anon.MockUserToken
import typings.firebaseStorage.firebaseStorageStrings.base64
import typings.firebaseStorage.firebaseStorageStrings.base64url
import typings.firebaseStorage.firebaseStorageStrings.data_url
import typings.firebaseStorage.firebaseStorageStrings.raw
import typings.firebaseStorage.firebaseStorageStrings.state_changed
import typings.firebaseUtil.mod.CompleteFn
import typings.firebaseUtil.mod.FirebaseError
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Subscribe
import typings.firebaseUtil.mod.Unsubscribe
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined { readonly RAW :'raw',  readonly BASE64 :'base64',  readonly BASE64URL :'base64url',  readonly DATA_URL :'data_url'}[keyof { readonly RAW :'raw',  readonly BASE64 :'base64',  readonly BASE64URL :'base64url',  readonly DATA_URL :'data_url'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseStorage.firebaseStorageStrings.raw
    - typings.firebaseStorage.firebaseStorageStrings.base64
    - typings.firebaseStorage.firebaseStorageStrings.base64url
    - typings.firebaseStorage.firebaseStorageStrings.data_url
  */
  trait StringFormat extends StObject
  object StringFormat {
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage", "StringFormat.BASE64")
    @js.native
    val BASE64: base64 = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage", "StringFormat.BASE64URL")
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
    @JSImport("@firebase/storage", "StringFormat.DATA_URL")
    @js.native
    val DATA_URL: data_url = js.native
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\\ud83d\\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("@firebase/storage", "StringFormat.RAW")
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
  
  inline def getStream(ref: StorageReference): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  inline def getStream(ref: StorageReference, maxDownloadSizeBytes: Double): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
  
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
  
  trait FirebaseStorage extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} associated with this `FirebaseStorage` instance.
      */
    val app: FirebaseApp
    
    /**
      * The maximum time to retry operations other than uploads or downloads in
      * milliseconds.
      */
    var maxOperationRetryTime: Double
    
    /**
      * The maximum time to retry uploads in milliseconds.
      */
    var maxUploadRetryTime: Double
  }
  object FirebaseStorage {
    
    inline def apply(app: FirebaseApp, maxOperationRetryTime: Double, maxUploadRetryTime: Double): FirebaseStorage = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxOperationRetryTime = maxOperationRetryTime.asInstanceOf[js.Any], maxUploadRetryTime = maxUploadRetryTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseStorage]
    }
    
    extension [Self <: FirebaseStorage](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setMaxOperationRetryTime(value: Double): Self = StObject.set(x, "maxOperationRetryTime", value.asInstanceOf[js.Any])
      
      inline def setMaxUploadRetryTime(value: Double): Self = StObject.set(x, "maxUploadRetryTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullMetadata
    extends StObject
       with UploadMetadata {
    
    /**
      * The bucket this object is contained in.
      */
    var bucket: String
    
    /**
      * Tokens to allow access to the downloatd URL.
      */
    var downloadTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The full path of this object.
      */
    var fullPath: String
    
    /**
      * The object's generation.
      * {@link https://cloud.google.com/storage/docs/metadata#generation-number}
      */
    var generation: String
    
    /**
      * The object's metageneration.
      * {@link https://cloud.google.com/storage/docs/metadata#generation-number}
      */
    var metageneration: String
    
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    var name: String
    
    /**
      * `StorageReference` associated with this upload.
      */
    var ref: js.UndefOr[StorageReference] = js.undefined
    
    /**
      * The size of this object, in bytes.
      */
    var size: Double
    
    /**
      * A date string representing when this object was created.
      */
    var timeCreated: String
    
    /**
      * A date string representing when this object was last updated.
      */
    var updated: String
  }
  object FullMetadata {
    
    inline def apply(
      bucket: String,
      fullPath: String,
      generation: String,
      metageneration: String,
      name: String,
      size: Double,
      timeCreated: String,
      updated: String
    ): FullMetadata = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullMetadata]
    }
    
    extension [Self <: FullMetadata](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setDownloadTokens(value: js.Array[String]): Self = StObject.set(x, "downloadTokens", value.asInstanceOf[js.Any])
      
      inline def setDownloadTokensUndefined: Self = StObject.set(x, "downloadTokens", js.undefined)
      
      inline def setDownloadTokensVarargs(value: String*): Self = StObject.set(x, "downloadTokens", js.Array(value*))
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListOptions extends StObject {
    
    /**
      * If set, limits the total number of `prefixes` and `items` to return.
      * The default and maximum maxResults is 1000.
      */
    var maxResults: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The `nextPageToken` from a previous call to `list()`. If provided,
      * listing is resumed from the previous position.
      */
    var pageToken: js.UndefOr[String | Null] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ListResult extends StObject {
    
    /**
      * Objects in this directory.
      * You can call getMetadata() and getDownloadUrl() on them.
      */
    var items: js.Array[StorageReference]
    
    /**
      * If set, there might be more results for this list. Use this token to resume the list.
      */
    var nextPageToken: js.UndefOr[String] = js.undefined
    
    /**
      * References to prefixes (sub-folders). You can call list() on them to
      * get its contents.
      *
      * Folders are implicit based on '/' in the object paths.
      * For example, if a bucket has two objects '/a/b/1' and '/a/b/2', list('/a')
      * will return '/a/b' as a prefix.
      */
    var prefixes: js.Array[StorageReference]
  }
  object ListResult {
    
    inline def apply(items: js.Array[StorageReference], prefixes: js.Array[StorageReference]): ListResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResult]
    }
    
    extension [Self <: ListResult](x: Self) {
      
      inline def setItems(value: js.Array[StorageReference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: StorageReference*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      
      inline def setPrefixes(value: js.Array[StorageReference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: StorageReference*): Self = StObject.set(x, "prefixes", js.Array(value*))
    }
  }
  
  trait SettableMetadata extends StObject {
    
    /**
      * Served as the 'Cache-Control' header on object download.
      */
    var cacheControl: js.UndefOr[String] = js.undefined
    
    /**
      * Served as the 'Content-Disposition' header on object download.
      */
    var contentDisposition: js.UndefOr[String] = js.undefined
    
    /**
      * Served as the 'Content-Encoding' header on object download.
      */
    var contentEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * Served as the 'Content-Language' header on object download.
      */
    var contentLanguage: js.UndefOr[String] = js.undefined
    
    /**
      * Served as the 'Content-Type' header on object download.
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * Additional user-defined custom metadata.
      */
    var customMetadata: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object SettableMetadata {
    
    inline def apply(): SettableMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettableMetadata]
    }
    
    extension [Self <: SettableMetadata](x: Self) {
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    }
  }
  
  @js.native
  trait StorageError extends FirebaseError {
    
    /**
      * A server response message for the error, if applicable.
      */
    var serverResponse: String | Null = js.native
  }
  
  trait StorageObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn | Null] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* error */ StorageError, Unit | Null]] = js.undefined
    
    var next: js.UndefOr[NextFn[T] | Null] = js.undefined
  }
  object StorageObserver {
    
    inline def apply[T](): StorageObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageObserver[T]]
    }
    
    extension [Self <: StorageObserver[?], T](x: Self & StorageObserver[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteNull: Self = StObject.set(x, "complete", null)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ StorageError => Unit | Null): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait StorageReference extends StObject {
    
    /**
      * The name of the bucket containing this reference's object.
      */
    var bucket: String
    
    /**
      * The full path of this object.
      */
    var fullPath: String
    
    /**
      * The short name of this object, which is the last component of the full path.
      * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
      */
    var name: String
    
    /**
      * A reference pointing to the parent location of this reference, or null if
      * this reference is the root.
      */
    var parent: StorageReference | Null
    
    /**
      * A reference to the root of this object's bucket.
      */
    var root: StorageReference
    
    /**
      * The {@link FirebaseStorage} instance associated with this reference.
      */
    var storage: FirebaseStorage
  }
  object StorageReference {
    
    inline def apply(bucket: String, fullPath: String, name: String, root: StorageReference, storage: FirebaseStorage): StorageReference = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[StorageReference]
    }
    
    extension [Self <: StorageReference](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: StorageReference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setRoot(value: StorageReference): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: FirebaseStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskEvent = state_changed
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseStorage.firebaseStorageStrings.running
    - typings.firebaseStorage.firebaseStorageStrings.paused
    - typings.firebaseStorage.firebaseStorageStrings.success
    - typings.firebaseStorage.firebaseStorageStrings.canceled
    - typings.firebaseStorage.firebaseStorageStrings.error
  */
  trait TaskState extends StObject
  object TaskState {
    
    inline def canceled: typings.firebaseStorage.firebaseStorageStrings.canceled = "canceled".asInstanceOf[typings.firebaseStorage.firebaseStorageStrings.canceled]
    
    inline def error: typings.firebaseStorage.firebaseStorageStrings.error = "error".asInstanceOf[typings.firebaseStorage.firebaseStorageStrings.error]
    
    inline def paused: typings.firebaseStorage.firebaseStorageStrings.paused = "paused".asInstanceOf[typings.firebaseStorage.firebaseStorageStrings.paused]
    
    inline def running: typings.firebaseStorage.firebaseStorageStrings.running = "running".asInstanceOf[typings.firebaseStorage.firebaseStorageStrings.running]
    
    inline def success: typings.firebaseStorage.firebaseStorageStrings.success = "success".asInstanceOf[typings.firebaseStorage.firebaseStorageStrings.success]
  }
  
  trait UploadMetadata
    extends StObject
       with SettableMetadata {
    
    /**
      * A Base64-encoded MD5 hash of the object being uploaded.
      */
    var md5Hash: js.UndefOr[String] = js.undefined
  }
  object UploadMetadata {
    
    inline def apply(): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadMetadata]
    }
    
    extension [Self <: UploadMetadata](x: Self) {
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    }
  }
  
  trait UploadResult extends StObject {
    
    /**
      * Contains the metadata sent back from the server.
      */
    val metadata: FullMetadata
    
    /**
      * The reference that spawned this upload.
      */
    val ref: StorageReference
  }
  object UploadResult {
    
    inline def apply(metadata: FullMetadata, ref: StorageReference): UploadResult = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadResult]
    }
    
    extension [Self <: UploadResult](x: Self) {
      
      inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadTask extends StObject {
    
    /**
      * Cancels a running task. Has no effect on a complete or failed task.
      * @returns True if the cancel had an effect.
      */
    def cancel(): Boolean = js.native
    
    /**
      * Equivalent to calling `then(null, onRejected)`.
      */
    def `catch`(onRejected: js.Function1[/* error */ StorageError, Any]): js.Promise[Any] = js.native
    
    /**
      * Listens for events on this task.
      *
      * Events have three callback functions (referred to as `next`, `error`, and
      * `complete`).
      *
      * If only the event is passed, a function that can be used to register the
      * callbacks is returned. Otherwise, the callbacks are passed after the event.
      *
      * Callbacks can be passed either as three separate arguments <em>or</em> as the
      * `next`, `error`, and `complete` properties of an object. Any of the three
      * callbacks is optional, as long as at least one is specified. In addition,
      * when you add your callbacks, you get a function back. You can call this
      * function to unregister the associated callbacks.
      *
      * @example **Pass callbacks separately or in an object.**
      * ```javascript
      * var next = function(snapshot) {};
      * var error = function(error) {};
      * var complete = function() {};
      *
      * // The first example.
      * uploadTask.on(
      *     firebase.storage.TaskEvent.STATE_CHANGED,
      *     next,
      *     error,
      *     complete);
      *
      * // This is equivalent to the first example.
      * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, {
      *   'next': next,
      *   'error': error,
      *   'complete': complete
      * });
      *
      * // This is equivalent to the first example.
      * var subscribe = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
      * subscribe(next, error, complete);
      *
      * // This is equivalent to the first example.
      * var subscribe = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
      * subscribe({
      *   'next': next,
      *   'error': error,
      *   'complete': complete
      * });
      * ```
      *
      * @example **Any callback is optional.**
      * ```javascript
      * // Just listening for completion, this is legal.
      * uploadTask.on(
      *     firebase.storage.TaskEvent.STATE_CHANGED,
      *     null,
      *     null,
      *     function() {
      *       console.log('upload complete!');
      *     });
      *
      * // Just listening for progress/state changes, this is legal.
      * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, function(snapshot) {
      *   var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
      *   console.log(percent + "% done");
      * });
      *
      * // This is also legal.
      * uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED, {
      *   'complete': function() {
      *     console.log('upload complete!');
      *   }
      * });
      * ```
      *
      * @example **Use the returned function to remove callbacks.**
      * ```javascript
      * var unsubscribe = uploadTask.on(
      *     firebase.storage.TaskEvent.STATE_CHANGED,
      *     function(snapshot) {
      *       var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
      *       console.log(percent + "% done");
      *       // Stop after receiving one update.
      *       unsubscribe();
      *     });
      *
      * // This code is equivalent to the above.
      * var handle = uploadTask.on(firebase.storage.TaskEvent.STATE_CHANGED);
      * unsubscribe = handle(function(snapshot) {
      *   var percent = snapshot.bytesTransferred / snapshot.totalBytes * 100;
      *   console.log(percent + "% done");
      *   // Stop after receiving one update.
      *   unsubscribe();
      * });
      * ```
      *
      * @param event - The type of event to listen for.
      * @param nextOrObserver -
      *     The `next` function, which gets called for each item in
      *     the event stream, or an observer object with some or all of these three
      *     properties (`next`, `error`, `complete`).
      * @param error - A function that gets called with a `StorageError`
      *     if the event stream ends due to an error.
      * @param completed - A function that gets called if the
      *     event stream ends normally.
      * @returns
      *     If only the event argument is passed, returns a function you can use to
      *     add callbacks (see the examples above). If more than just the event
      *     argument is passed, returns a function you can call to unregister the
      *     callbacks.
      */
    def on(event: TaskEvent): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* a */ StorageError, Any]
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: js.Function1[/* a */ StorageError, Any],
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Null,
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      error: Unit,
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ StorageError, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* a */ StorageError, Any],
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Unit, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: js.Function1[/* a */ StorageError, Any]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Unit,
      error: js.Function1[/* a */ StorageError, Any],
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: Null, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: Unit, error: Unit, complete: Unsubscribe): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(event: TaskEvent, nextOrObserver: StorageObserver[UploadTaskSnapshot]): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* a */ StorageError, Any]
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: js.Function1[/* a */ StorageError, Any],
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Null,
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: StorageObserver[UploadTaskSnapshot],
      error: Unit,
      complete: Unsubscribe
    ): Unsubscribe | Subscribe[UploadTaskSnapshot] = js.native
    
    /**
      * Pauses a currently running task. Has no effect on a paused or failed task.
      * @returns True if the operation took effect, false if ignored.
      */
    def pause(): Boolean = js.native
    
    /**
      * Resumes a paused task. Has no effect on a currently running or failed task.
      * @returns True if the operation took effect, false if ignored.
      */
    def resume(): Boolean = js.native
    
    /**
      * A snapshot of the current task state.
      */
    var snapshot: UploadTaskSnapshot = js.native
    
    /**
      * This object behaves like a Promise, and resolves with its snapshot data
      * when the upload completes.
      * @param onFulfilled - The fulfillment callback. Promise chaining works as normal.
      * @param onRejected - The rejection callback.
      */
    def `then`(): js.Promise[Any] = js.native
    def `then`(onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any]): js.Promise[Any] = js.native
    def `then`(
      onFulfilled: js.Function1[/* snapshot */ UploadTaskSnapshot, Any],
      onRejected: js.Function1[/* error */ StorageError, Any]
    ): js.Promise[Any] = js.native
    def `then`(onFulfilled: Null, onRejected: js.Function1[/* error */ StorageError, Any]): js.Promise[Any] = js.native
    def `then`(onFulfilled: Unit, onRejected: js.Function1[/* error */ StorageError, Any]): js.Promise[Any] = js.native
  }
  
  trait UploadTaskSnapshot extends StObject {
    
    /**
      * The number of bytes that have been successfully uploaded so far.
      */
    var bytesTransferred: Double
    
    /**
      * Before the upload completes, contains the metadata sent to the server.
      * After the upload completes, contains the metadata sent back from the server.
      */
    var metadata: FullMetadata
    
    /**
      * The reference that spawned this snapshot's upload task.
      */
    var ref: StorageReference
    
    /**
      * The current state of the task.
      */
    var state: TaskState
    
    /**
      * The task of which this is a snapshot.
      */
    var task: UploadTask
    
    /**
      * The total number of bytes to be uploaded.
      */
    var totalBytes: Double
  }
  object UploadTaskSnapshot {
    
    inline def apply(
      bytesTransferred: Double,
      metadata: FullMetadata,
      ref: StorageReference,
      state: TaskState,
      task: UploadTask,
      totalBytes: Double
    ): UploadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadTaskSnapshot]
    }
    
    extension [Self <: UploadTaskSnapshot](x: Self) {
      
      inline def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTask(value: UploadTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
