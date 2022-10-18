package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.buildSrcCommonMod.GaxiosOptions
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleCloudStorage.anon.Request
import typings.googleCloudStorage.anon.Scopes
import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import typings.googleCloudStorage.buildSrcStorageMod.RetryOptions
import typings.googleCloudStorage.googleCloudStorageStrings.Asterisk
import typings.googleCloudStorage.googleCloudStorageStrings.full
import typings.googleCloudStorage.googleCloudStorageStrings.noAcl
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResumableUploadMod {
  
  @JSImport("@google-cloud/storage/build/src/resumable-upload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/storage/build/src/resumable-upload", "PROTOCOL_REGEX")
  @js.native
  val PROTOCOL_REGEX: js.RegExp = js.native
  
  @JSImport("@google-cloud/storage/build/src/resumable-upload", "Upload")
  @js.native
  open class Upload_ protected () extends Writable {
    def this(cfg: UploadConfig) = this()
    
    /**
      * Prevent 'finish' event until the upload has succeeded.
      *
      * @param fireFinishEvent The finish callback
      */
    def _final(): Unit = js.native
    def _final(fireFinishEvent: js.Function0[Unit]): Unit = js.native
    
    def _write(chunk: String, encoding: BufferEncoding): Unit = js.native
    def _write(chunk: String, encoding: BufferEncoding, readCallback: js.Function0[Unit]): Unit = js.native
    /**
      * Handles incoming data from upstream
      *
      * @param chunk The chunk to append to the buffer
      * @param encoding The encoding of the chunk
      * @param readCallback A callback for when the buffer has been read downstream
      */
    def _write(chunk: Buffer, encoding: BufferEncoding): Unit = js.native
    def _write(chunk: Buffer, encoding: BufferEncoding, readCallback: js.Function0[Unit]): Unit = js.native
    
    var apiEndpoint: String = js.native
    
    /**
      * @param resp GaxiosResponse object from previous attempt
      */
    /* private */ var attemptDelayedRetry: Any = js.native
    
    var authClient: Request = js.native
    
    var authConfig: js.UndefOr[Scopes] = js.native
    
    var baseURI: String = js.native
    
    var bucket: String = js.native
    
    var cacheKey: String = js.native
    
    /* private */ var chunkBufferEncoding: Any = js.native
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var contentLength: Double | Asterisk = js.native
    
    /* private */ var continueUploading: Any = js.native
    
    def createURI(): js.Promise[String] = js.native
    def createURI(callback: CreateUriCallback): Unit = js.native
    
    /* protected */ def createURIAsync(): js.Promise[String] = js.native
    
    /* private */ var currentInvocationId: Any = js.native
    
    var customRequestOptions: GaxiosOptions = js.native
    
    var encryption: js.UndefOr[Encryption] = js.native
    
    var file: String = js.native
    
    var generation: js.UndefOr[Double] = js.native
    
    /* private */ var getAndSetOffset: Any = js.native
    
    /**
      * @returns {number} the amount of time to wait before retrying the request
      */
    /* private */ var getRetryDelay: Any = js.native
    
    /**
      * Check if a given status code is 2xx
      *
      * @param status The status code to check
      * @returns if the status is 2xx
      */
    def isSuccessfulResponse(status: Double): Boolean = js.native
    
    var key: js.UndefOr[String | Buffer] = js.native
    
    var kmsKeyName: js.UndefOr[String] = js.native
    
    /**
      * A chunk used for caching the most recent upload chunk.
      * We should not assume that the server received all bytes sent in the request.
      *  - https://cloud.google.com/storage/docs/performing-resumable-uploads#chunked-upload
      */
    /* private */ var lastChunkSent: Any = js.native
    
    /* private */ var makeRequest: Any = js.native
    
    /* private */ var makeRequestStream: Any = js.native
    
    var metadata: ConfigMetadata = js.native
    
    var numBytesWritten: Double = js.native
    
    /* private */ var numChunksReadInRequest: Any = js.native
    
    var numRetries: Double = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * @return {bool} is the request good?
      */
    /* private */ var onResponse: Any = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var params: QueryParameters = js.native
    
    var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    /**
      * Retrieves data from upstream's buffer.
      *
      * @param limit The maximum amount to return from the buffer.
      * @returns The data requested.
      */
    /* private */ var pullFromChunkBuffer: Any = js.native
    
    /* private */ var responseHandler: Any = js.native
    
    var retryOptions: RetryOptions = js.native
    
    /* private */ var sanitizeEndpoint: Any = js.native
    
    def startUploading(): js.Promise[Unit] = js.native
    
    var timeOfFirstRequest: Double = js.native
    
    /**
      * Prepends data back to the upstream chunk buffer.
      *
      * @param chunk The data to prepend
      */
    /* private */ var unshiftChunkBuffer: Any = js.native
    
    /* private */ var upstreamChunkBuffer: Any = js.native
    
    /* private */ var upstreamEnded: Any = js.native
    
    /**
      * Reads data from upstream up to the provided `limit`.
      * Ends when the limit has reached or no data is expected to be pushed from upstream.
      *
      * @param limit The most amount of data this iterator should return. `Infinity` by default.
      * @param oneChunkMode Determines if one, exhaustive chunk is yielded for the iterator
      */
    /* private */ var upstreamIterator: Any = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var uriProvidedManually: Boolean = js.native
    
    var userProject: js.UndefOr[String] = js.native
    
    /**
      * A handler for determining if data is ready to be read from upstream.
      *
      * @returns If there will be more chunks to read in the future
      */
    /* private */ var waitForNextChunk: Any = js.native
  }
  
  inline def createURI(cfg: UploadConfig): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createURI")(cfg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def createURI(cfg: UploadConfig, callback: CreateUriCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createURI")(cfg.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def upload(cfg: UploadConfig): Upload_ = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")(cfg.asInstanceOf[js.Any]).asInstanceOf[Upload_]
  
  trait ApiError
    extends StObject
       with Error {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var errors: js.UndefOr[js.Array[GoogleInnerError]] = js.undefined
  }
  object ApiError {
    
    inline def apply(message: String, name: String): ApiError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiError]
    }
    
    extension [Self <: ApiError](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setErrors(value: js.Array[GoogleInnerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: GoogleInnerError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  trait ConfigMetadata
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Set the length of the file being uploaded.
      */
    var contentLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the content type of the incoming data.
      */
    var contentType: js.UndefOr[String] = js.undefined
  }
  object ConfigMetadata {
    
    inline def apply(): ConfigMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigMetadata]
    }
    
    extension [Self <: ConfigMetadata](x: Self) {
      
      inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
      
      inline def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  type CreateUriCallback = js.Function2[/* err */ js.Error | Null, /* uri */ js.UndefOr[String], Unit]
  
  trait Encryption extends StObject
  
  trait ErrorWithCode
    extends StObject
       with Error {
    
    var code: Double
  }
  object ErrorWithCode {
    
    inline def apply(code: Double, message: String, name: String): ErrorWithCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithCode]
    }
    
    extension [Self <: ErrorWithCode](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait GoogleInnerError extends StObject {
    
    var reason: js.UndefOr[String] = js.undefined
  }
  object GoogleInnerError {
    
    inline def apply(): GoogleInnerError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleInnerError]
    }
    
    extension [Self <: GoogleInnerError](x: Self) {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudStorage.googleCloudStorageStrings.authenticatedRead
    - typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl
    - typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead
    - typings.googleCloudStorage.googleCloudStorageStrings.`private`
    - typings.googleCloudStorage.googleCloudStorageStrings.projectPrivate
    - typings.googleCloudStorage.googleCloudStorageStrings.publicRead
  */
  trait PredefinedAcl extends StObject
  object PredefinedAcl {
    
    inline def authenticatedRead: typings.googleCloudStorage.googleCloudStorageStrings.authenticatedRead = "authenticatedRead".asInstanceOf[typings.googleCloudStorage.googleCloudStorageStrings.authenticatedRead]
    
    inline def bucketOwnerFullControl: typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl]
    
    inline def bucketOwnerRead: typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead = "bucketOwnerRead".asInstanceOf[typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead]
    
    inline def `private`: typings.googleCloudStorage.googleCloudStorageStrings.`private` = "private".asInstanceOf[typings.googleCloudStorage.googleCloudStorageStrings.`private`]
    
    inline def projectPrivate: typings.googleCloudStorage.googleCloudStorageStrings.projectPrivate = "projectPrivate".asInstanceOf[typings.googleCloudStorage.googleCloudStorageStrings.projectPrivate]
    
    inline def publicRead: typings.googleCloudStorage.googleCloudStorageStrings.publicRead = "publicRead".asInstanceOf[typings.googleCloudStorage.googleCloudStorageStrings.publicRead]
  }
  
  trait QueryParameters
    extends StObject
       with PreconditionOptions {
    
    var contentEncoding: js.UndefOr[String] = js.undefined
    
    var kmsKeyName: js.UndefOr[String] = js.undefined
    
    var predefinedAcl: js.UndefOr[PredefinedAcl] = js.undefined
    
    var projection: js.UndefOr[full | noAcl] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object QueryParameters {
    
    inline def apply(): QueryParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParameters]
    }
    
    extension [Self <: QueryParameters](x: Self) {
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      
      inline def setPredefinedAcl(value: PredefinedAcl): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
      
      inline def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
      
      inline def setProjection(value: full | noAcl): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  trait UploadConfig extends StObject {
    
    /**
      * The API endpoint used for the request.
      * Defaults to `storage.googleapis.com`.
      * **Warning**:
      * If this value does not match the pattern *.googleapis.com,
      * an emulator context will be assumed and authentication will be bypassed.
      */
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    /**
      * If you want to re-use an auth client from google-auto-auth, pass an
      * instance here.
      * Defaults to GoogleAuth and gets automatically overridden if an
      * emulator context is detected.
      */
    var authClient: js.UndefOr[Request] = js.undefined
    
    /**
      * The GoogleAuthOptions passed to google-auth-library
      */
    var authConfig: js.UndefOr[GoogleAuthOptions[JSONClient]] = js.undefined
    
    /**
      * The name of the destination bucket.
      */
    var bucket: String
    
    /**
      * Create a separate request per chunk.
      *
      * This value is in bytes and should be a multiple of 256 KiB (2^18).
      * We recommend using at least 8 MiB for the chunk size.
      *
      * @link https://cloud.google.com/storage/docs/performing-resumable-uploads#chunked-upload
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * For each API request we send, you may specify custom request options that
      * we'll add onto the request. The request options follow the gaxios API:
      * https://github.com/googleapis/gaxios#request-options.
      */
    var customRequestOptions: js.UndefOr[GaxiosOptions] = js.undefined
    
    /**
      * The name of the destination file.
      */
    var file: String
    
    /**
      * This will cause the upload to fail if the current generation of the remote
      * object does not match the one provided here.
      */
    var generation: js.UndefOr[Double] = js.undefined
    
    /**
      * A customer-supplied encryption key. See
      * https://cloud.google.com/storage/docs/encryption#customer-supplied.
      */
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Resource name of the Cloud KMS key, of the form
      * `projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key`,
      * that will be used to encrypt the object. Overrides the object metadata's
      * `kms_key_name` value, if any.
      */
    var kmsKeyName: js.UndefOr[String] = js.undefined
    
    /**
      * Any metadata you wish to set on the object.
      */
    var metadata: js.UndefOr[ConfigMetadata] = js.undefined
    
    /**
      * The starting byte of the upload stream, for resuming an interrupted upload.
      * See
      * https://cloud.google.com/storage/docs/json_api/v1/how-tos/resumable-upload#resume-upload.
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Set an Origin header when creating the resumable upload URI.
      */
    var origin: js.UndefOr[String] = js.undefined
    
    /**
      * Specify query parameters that go along with the initial upload request. See
      * https://cloud.google.com/storage/docs/json_api/v1/objects/insert#parameters
      */
    var params: js.UndefOr[QueryParameters] = js.undefined
    
    /**
      * Apply a predefined set of access controls to the created file.
      */
    var predefinedAcl: js.UndefOr[PredefinedAcl] = js.undefined
    
    /**
      * Make the uploaded file private. (Alias for config.predefinedAcl =
      * 'private')
      */
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make the uploaded file public. (Alias for config.predefinedAcl =
      * 'publicRead')
      */
    var public: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration options for retrying retryable errors.
      */
    var retryOptions: RetryOptions
    
    /**
      * If you already have a resumable URI from a previously-created resumable
      * upload, just pass it in here and we'll use that.
      */
    var uri: js.UndefOr[String] = js.undefined
    
    /**
      * If the bucket being accessed has requesterPays functionality enabled, this
      * can be set to control which project is billed for the access of this file.
      */
    var userProject: js.UndefOr[String] = js.undefined
  }
  object UploadConfig {
    
    inline def apply(bucket: String, file: String, retryOptions: RetryOptions): UploadConfig = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], retryOptions = retryOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadConfig]
    }
    
    extension [Self <: UploadConfig](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setAuthClient(value: Request): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      inline def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      inline def setAuthConfig(value: GoogleAuthOptions[JSONClient]): Self = StObject.set(x, "authConfig", value.asInstanceOf[js.Any])
      
      inline def setAuthConfigUndefined: Self = StObject.set(x, "authConfig", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setCustomRequestOptions(value: GaxiosOptions): Self = StObject.set(x, "customRequestOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomRequestOptionsUndefined: Self = StObject.set(x, "customRequestOptions", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      
      inline def setMetadata(value: ConfigMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setParams(value: QueryParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPredefinedAcl(value: PredefinedAcl): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
      
      inline def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
}
