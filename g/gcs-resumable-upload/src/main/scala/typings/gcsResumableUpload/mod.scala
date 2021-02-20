package typings.gcsResumableUpload

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.commonMod.GaxiosOptions
import typings.gcsResumableUpload.anon.Scopes
import typings.gcsResumableUpload.gcsResumableUploadStrings.Asterisk
import typings.gcsResumableUpload.gcsResumableUploadStrings.full
import typings.gcsResumableUpload.gcsResumableUploadStrings.noAcl
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.node.Buffer
import typings.pumpify.mod.^
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gcs-resumable-upload", "PROTOCOL_REGEX")
  @js.native
  val PROTOCOL_REGEX: RegExp = js.native
  
  @JSImport("gcs-resumable-upload", "Upload")
  @js.native
  class Upload_ protected () extends ^ {
    def this(cfg: UploadConfig) = this()
    
    var apiEndpoint: String = js.native
    
    var authClient: GoogleAuth = js.native
    
    var authConfig: js.UndefOr[Scopes] = js.native
    
    var baseURI: String = js.native
    
    var bucket: String = js.native
    
    var bufferStream: js.Any = js.native
    
    var cacheKey: String = js.native
    
    var configStore: typings.configstore.mod.^ = js.native
    
    var contentLength: Double | Asterisk = js.native
    
    var continueUploading: js.Any = js.native
    
    def createURI(): js.Promise[String] = js.native
    def createURI(callback: CreateUriCallback): Unit = js.native
    
    /* protected */ def createURIAsync(): js.Promise[String] = js.native
    
    var customRequestOptions: GaxiosOptions = js.native
    
    def deleteConfig(): Unit = js.native
    
    var encryption: js.UndefOr[Encryption] = js.native
    
    var file: String = js.native
    
    var generation: js.UndefOr[Double] = js.native
    
    var get: js.Any = js.native
    
    var getAndSetOffset: js.Any = js.native
    
    var key: js.UndefOr[String | Buffer] = js.native
    
    var kmsKeyName: js.UndefOr[String] = js.native
    
    var makeRequest: js.Any = js.native
    
    var makeRequestStream: js.Any = js.native
    
    var metadata: ConfigMetadata = js.native
    
    var numBytesWritten: Double = js.native
    
    var numRetries: Double = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var offsetStream: js.Any = js.native
    
    var onChunk: js.Any = js.native
    
    /**
      * @return {bool} is the request good?
      */
    var onResponse: js.Any = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var params: QueryParameters = js.native
    
    var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
    
    var `private`: js.UndefOr[Boolean] = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    var restart: js.Any = js.native
    
    var sanitizeEndpoint: js.Any = js.native
    
    var set: js.Any = js.native
    
    var startUploading: js.Any = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var uriProvidedManually: Boolean = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  
  @JSImport("gcs-resumable-upload", "createURI")
  @js.native
  def createURI(cfg: UploadConfig): js.Promise[String] = js.native
  @JSImport("gcs-resumable-upload", "createURI")
  @js.native
  def createURI(cfg: UploadConfig, callback: CreateUriCallback): Unit = js.native
  
  @JSImport("gcs-resumable-upload", "upload")
  @js.native
  def upload(cfg: UploadConfig): Upload_ = js.native
  
  @js.native
  trait ConfigMetadata
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Set the length of the file being uploaded.
      */
    var contentLength: js.UndefOr[Double] = js.native
    
    /**
      * Set the content type of the incoming data.
      */
    var contentType: js.UndefOr[String] = js.native
  }
  object ConfigMetadata {
    
    @scala.inline
    def apply(): ConfigMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigMetadata]
    }
    
    @scala.inline
    implicit class ConfigMetadataMutableBuilder[Self <: ConfigMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    }
  }
  
  type CreateUriCallback = js.Function2[/* err */ Error | Null, /* uri */ js.UndefOr[String], Unit]
  
  @js.native
  trait Encryption extends StObject
  
  @js.native
  trait ErrorWithCode extends Error {
    
    var code: Double = js.native
  }
  object ErrorWithCode {
    
    @scala.inline
    def apply(code: Double, message: String, name: String): ErrorWithCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithCode]
    }
    
    @scala.inline
    implicit class ErrorWithCodeMutableBuilder[Self <: ErrorWithCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead
    - typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl
    - typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead
    - typings.gcsResumableUpload.gcsResumableUploadStrings.`private`
    - typings.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate
    - typings.gcsResumableUpload.gcsResumableUploadStrings.publicRead
  */
  trait PredefinedAcl extends StObject
  object PredefinedAcl {
    
    @scala.inline
    def authenticatedRead: typings.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead = "authenticatedRead".asInstanceOf[typings.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead]
    
    @scala.inline
    def bucketOwnerFullControl: typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl]
    
    @scala.inline
    def bucketOwnerRead: typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead = "bucketOwnerRead".asInstanceOf[typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead]
    
    @scala.inline
    def `private`: typings.gcsResumableUpload.gcsResumableUploadStrings.`private` = "private".asInstanceOf[typings.gcsResumableUpload.gcsResumableUploadStrings.`private`]
    
    @scala.inline
    def projectPrivate: typings.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate = "projectPrivate".asInstanceOf[typings.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate]
    
    @scala.inline
    def publicRead: typings.gcsResumableUpload.gcsResumableUploadStrings.publicRead = "publicRead".asInstanceOf[typings.gcsResumableUpload.gcsResumableUploadStrings.publicRead]
  }
  
  @js.native
  trait QueryParameters extends StObject {
    
    var contentEncoding: js.UndefOr[String] = js.native
    
    var ifGenerationMatch: js.UndefOr[Double] = js.native
    
    var ifGenerationNotMatch: js.UndefOr[Double] = js.native
    
    var ifMetagenerationMatch: js.UndefOr[Double] = js.native
    
    var ifMetagenerationNotMatch: js.UndefOr[Double] = js.native
    
    var kmsKeyName: js.UndefOr[String] = js.native
    
    var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
    
    var projection: js.UndefOr[full | noAcl] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object QueryParameters {
    
    @scala.inline
    def apply(): QueryParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParameters]
    }
    
    @scala.inline
    implicit class QueryParametersMutableBuilder[Self <: QueryParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setIfGenerationMatch(value: Double): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
      
      @scala.inline
      def setIfGenerationNotMatch(value: Double): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
      
      @scala.inline
      def setIfMetagenerationMatch(value: Double): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
      
      @scala.inline
      def setIfMetagenerationNotMatch(value: Double): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
      
      @scala.inline
      def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      
      @scala.inline
      def setPredefinedAcl(value: PredefinedAcl): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
      
      @scala.inline
      def setProjection(value: full | noAcl): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  @js.native
  trait UploadConfig extends StObject {
    
    /**
      * The API endpoint used for the request.
      * Defaults to `storage.googleapis.com`.
      */
    var apiEndpoint: js.UndefOr[String] = js.native
    
    /**
      * If you want to re-use an auth client from google-auto-auth, pass an
      * instance here.
      */
    var authClient: js.UndefOr[GoogleAuth] = js.native
    
    /**
      * The GoogleAuthOptions passed to google-auth-library
      */
    var authConfig: js.UndefOr[GoogleAuthOptions] = js.native
    
    /**
      * The name of the destination bucket.
      */
    var bucket: String = js.native
    
    /**
      * Where the gcs-resumable-upload configuration file should be stored on your
      * system. This maps to the configstore option by the same name.
      */
    var configPath: js.UndefOr[String] = js.native
    
    /**
      * For each API request we send, you may specify custom request options that
      * we'll add onto the request. The request options follow the gaxios API:
      * https://github.com/googleapis/gaxios#request-options.
      */
    var customRequestOptions: js.UndefOr[GaxiosOptions] = js.native
    
    /**
      * The name of the destination file.
      */
    var file: String = js.native
    
    /**
      * This will cause the upload to fail if the current generation of the remote
      * object does not match the one provided here.
      */
    var generation: js.UndefOr[Double] = js.native
    
    /**
      * A customer-supplied encryption key. See
      * https://cloud.google.com/storage/docs/encryption#customer-supplied.
      */
    var key: js.UndefOr[String | Buffer] = js.native
    
    /**
      * Resource name of the Cloud KMS key, of the form
      * `projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key`,
      * that will be used to encrypt the object. Overrides the object metadata's
      * `kms_key_name` value, if any.
      */
    var kmsKeyName: js.UndefOr[String] = js.native
    
    /**
      * Any metadata you wish to set on the object.
      */
    var metadata: js.UndefOr[ConfigMetadata] = js.native
    
    /**
      * The starting byte of the upload stream, for resuming an interrupted upload.
      * See
      * https://cloud.google.com/storage/docs/json_api/v1/how-tos/resumable-upload#resume-upload.
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Set an Origin header when creating the resumable upload URI.
      */
    var origin: js.UndefOr[String] = js.native
    
    /**
      * Specify query parameters that go along with the initial upload request. See
      * https://cloud.google.com/storage/docs/json_api/v1/objects/insert#parameters
      */
    var params: js.UndefOr[QueryParameters] = js.native
    
    /**
      * Apply a predefined set of access controls to the created file.
      */
    var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
    
    /**
      * Make the uploaded file private. (Alias for config.predefinedAcl =
      * 'private')
      */
    var `private`: js.UndefOr[Boolean] = js.native
    
    /**
      * Make the uploaded file public. (Alias for config.predefinedAcl =
      * 'publicRead')
      */
    var public: js.UndefOr[Boolean] = js.native
    
    /**
      * If you already have a resumable URI from a previously-created resumable
      * upload, just pass it in here and we'll use that.
      */
    var uri: js.UndefOr[String] = js.native
    
    /**
      * If the bucket being accessed has requesterPays functionality enabled, this
      * can be set to control which project is billed for the access of this file.
      */
    var userProject: js.UndefOr[String] = js.native
  }
  object UploadConfig {
    
    @scala.inline
    def apply(bucket: String, file: String): UploadConfig = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadConfig]
    }
    
    @scala.inline
    implicit class UploadConfigMutableBuilder[Self <: UploadConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setAuthClient(value: GoogleAuth): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      @scala.inline
      def setAuthConfig(value: GoogleAuthOptions): Self = StObject.set(x, "authConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthConfigUndefined: Self = StObject.set(x, "authConfig", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      @scala.inline
      def setCustomRequestOptions(value: GaxiosOptions): Self = StObject.set(x, "customRequestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRequestOptionsUndefined: Self = StObject.set(x, "customRequestOptions", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      
      @scala.inline
      def setMetadata(value: ConfigMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setParams(value: QueryParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPredefinedAcl(value: PredefinedAcl): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
}
