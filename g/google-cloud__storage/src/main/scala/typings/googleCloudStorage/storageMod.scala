package typings.googleCloudStorage

import org.scalablytyped.runtime.Instantiable3
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleCloudCommon.mod.Service
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudStorage.anon.OWNERROLE
import typings.googleCloudStorage.bucketMod.Bucket
import typings.googleCloudStorage.channelMod.Channel
import typings.googleCloudStorage.fileMod.File
import typings.googleCloudStorage.fileMod.FileOptions
import typings.googleCloudStorage.hmacKeyMod.HmacKey
import typings.googleCloudStorage.hmacKeyMod.HmacKeyMetadata
import typings.googleCloudStorage.hmacKeyMod.HmacKeyOptions
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.PromiseConstructor
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  @JSImport("@google-cloud/storage/build/src/storage", "PROTOCOL_REGEX")
  @js.native
  val PROTOCOL_REGEX: RegExp = js.native
  
  @JSImport("@google-cloud/storage/build/src/storage", "Storage")
  @js.native
  /**
    * @typedef {object} StorageOptions
    * @property {string} [projectId] The project ID from the Google Developer's
    *     Console, e.g. 'grape-spaceship-123'. We will also check the environment
    *     variable `GCLOUD_PROJECT` for your project ID. If your app is running
    * in an environment which supports {@link
    * https://cloud.google.com/docs/authentication/production#providing_credentials_to_your_application
    * Application Default Credentials}, your project ID will be detected
    * automatically.
    * @property {string} [keyFilename] Full path to the a .json, .pem, or .p12 key
    *     downloaded from the Google Developers Console. If you provide a path to
    * a JSON file, the `projectId` option above is not necessary. NOTE: .pem and
    *     .p12 require you to specify the `email` option as well.
    * @property {string} [email] Account email address. Required when using a .pem
    *     or .p12 keyFilename.
    * @property {object} [credentials] Credentials object.
    * @property {string} [credentials.client_email]
    * @property {string} [credentials.private_key]
    * @property {boolean} [autoRetry=true] Automatically retry requests if the
    *     response is related to rate limits or certain intermittent server
    * errors. We will exponentially backoff subsequent requests by default.
    * @property {number} [maxRetries=3] Maximum number of automatic retries
    *     attempted before returning the error.
    * @property {Constructor} [promise] Custom promise module to use instead of
    *     native Promises.
    * @property {string} [userAgent] The value to be prepended to the User-Agent
    *     header in API requests.
    */
  /**
    * Constructs the Storage client.
    *
    * @example <caption>Create a client that uses Application Default Credentials
    * (ADC)</caption> const {Storage} = require('@google-cloud/storage'); const
    * storage = new Storage();
    *
    * @example <caption>Create a client with explicit credentials</caption>
    * storage');/storage');
    * const storage = new Storage({
    *   projectId: 'your-project-id',
    *   keyFilename: '/path/to/keyfile.json'
    * });
    *
    * @param {StorageOptions} [options] Configuration options.
    */
  class Storage () extends Service {
    def this(options: StorageOptions) = this()
    
    /**
      * Reference to {@link Storage.acl}.
      *
      * @name Storage#acl
      * @see Storage.acl
      */
    var acl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Storage.acl */ js.Any = js.native
    
    /**
      * Get a reference to a Cloud Storage bucket.
      *
      * @param {string} name Name of the bucket.
      * @param {object} [options] Configuration object.
      * @param {string} [options.kmsKeyName] A Cloud KMS key that will be used to
      *     encrypt objects inserted into this bucket, if no encryption method is
      *     specified.
      * @param {string} [options.userProject] User project to be billed for all
      *     requests made from this Bucket object.
      * @returns {Bucket}
      * @see Bucket
      *
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const albums = storage.bucket('albums');
      * const photos = storage.bucket('photos');
      */
    def bucket(name: String): Bucket = js.native
    def bucket(name: String, options: BucketOptions): Bucket = js.native
    
    /**
      * Reference a channel to receive notifications about changes to your bucket.
      *
      * @param {string} id The ID of the channel.
      * @param {string} resourceId The resource ID of the channel.
      * @returns {Channel}
      * @see Channel
      *
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const channel = storage.channel('id', 'resource-id');
      */
    def channel(id: String, resourceId: String): Channel = js.native
    
    def createBucket(name: String): js.Promise[CreateBucketResponse] = js.native
    def createBucket(name: String, callback: BucketCallback): Unit = js.native
    def createBucket(name: String, metadata: CreateBucketRequest): js.Promise[CreateBucketResponse] = js.native
    def createBucket(name: String, metadata: CreateBucketRequest, callback: BucketCallback): Unit = js.native
    
    def createHmacKey(serviceAccountEmail: String): js.Promise[CreateHmacKeyResponse] = js.native
    def createHmacKey(serviceAccountEmail: String, callback: CreateHmacKeyCallback): Unit = js.native
    def createHmacKey(serviceAccountEmail: String, options: CreateHmacKeyOptions): js.Promise[CreateHmacKeyResponse] = js.native
    def createHmacKey(serviceAccountEmail: String, options: CreateHmacKeyOptions, callback: CreateHmacKeyCallback): Unit = js.native
    
    def getBuckets(): js.Promise[GetBucketsResponse] = js.native
    def getBuckets(callback: GetBucketsCallback): Unit = js.native
    def getBuckets(options: GetBucketsRequest): js.Promise[GetBucketsResponse] = js.native
    def getBuckets(options: GetBucketsRequest, callback: GetBucketsCallback): Unit = js.native
    
    /**
      * Get {@link Bucket} objects for all of the buckets in your project as
      * a readable object stream.
      *
      * @method Storage#getBucketsStream
      * @param {GetBucketsRequest} [query] Query object for listing buckets.
      * @returns {ReadableStream} A readable stream that emits {@link Bucket} instances.
      *
      * @example
      * storage.getBucketsStream()
      *   .on('error', console.error)
      *   .on('data', function(bucket) {
      *     // bucket is a Bucket object.
      *   })
      *   .on('end', function() {
      *     // All buckets retrieved.
      *   });
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * storage.getBucketsStream()
      *   .on('data', function(bucket) {
      *     this.end();
      *   });
      */
    def getBucketsStream(): Readable = js.native
    
    /**
      * Query object for listing HMAC keys.
      *
      * @typedef {object} GetHmacKeysOptions
      * @property {string} [projectId] The project ID of the project that owns
      *     the service account of the requested HMAC key. If not provided,
      *     the project ID used to instantiate the Storage client will be used.
      * @property {string} [serviceAccountEmail] If present, only HMAC keys for the
      *     given service account are returned.
      * @property {boolean} [showDeletedKeys=false] If true, include keys in the DELETE
      *     state. Default is false.
      * @property {boolean} [autoPaginate=true] Have pagination handled
      *     automatically.
      * @property {number} [maxApiCalls] Maximum number of API calls to make.
      * @property {number} [maxResults] Maximum number of items plus prefixes to
      *     return.
      * @property {string} [pageToken] A previously-returned page token
      *     representing part of the larger set of results to view.
      * @property {string} [userProject] This parameter is currently ignored.
      */
    /**
      * @typedef {array} GetHmacKeysResponse
      * @property {HmacKey[]} 0 Array of {@link HmacKey} instances.
      */
    /**
      * @callback GetHmacKeysCallback
      * @param {?Error} err Request error, if any.
      * @param {HmacKey[]} hmacKeys Array of {@link HmacKey} instances.
      */
    /**
      * Retrieves a list of HMAC keys matching the criteria.
      *
      * The authenticated user must have storage.hmacKeys.list permission for the project in which the key exists.
      *
      * @param {GetHmacKeysOption} options Configuration options.
      * @param {GetHmacKeysCallback} callback Callback function.
      * @return {Promise<GetHmacKeysResponse>}
      *
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * storage.getHmacKeys(function(err, hmacKeys) {
      *   if (!err) {
      *     // hmacKeys is an array of HmacKey objects.
      *   }
      * });
      *
      * //-
      * // To control how many API requests are made and page through the results
      * // manually, set `autoPaginate` to `false`.
      * //-
      * const callback = function(err, hmacKeys, nextQuery, apiResponse) {
      *   if (nextQuery) {
      *     // More results exist.
      *     storage.getHmacKeys(nextQuery, callback);
      *   }
      *
      *   // The `metadata` property is populated for you with the metadata at the
      *   // time of fetching.
      *   hmacKeys[0].metadata;
      * };
      *
      * storage.getHmacKeys({
      *   autoPaginate: false
      * }, callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * storage.getHmacKeys().then(function(data) {
      *   const hmacKeys = data[0];
      * });
      */
    def getHmacKeys(): js.Promise[GetHmacKeysResponse] = js.native
    def getHmacKeys(callback: GetHmacKeysCallback): Unit = js.native
    def getHmacKeys(options: GetHmacKeysOptions): js.Promise[GetHmacKeysResponse] = js.native
    def getHmacKeys(options: GetHmacKeysOptions, callback: GetHmacKeysCallback): Unit = js.native
    
    /**
      * Get {@link HmacKey} objects for all of the HMAC keys in the project in
      * a readable object stream.
      *
      * @method Storage#getHmacKeysStream
      * @param {GetHmacKeysOptions} [options] Configuration options.
      * @returns {ReadableStream} A readable stream that emits {@link HmacKey} instances.
      *
      * @example
      * storage.getHmacKeysStream()
      *   .on('error', console.error)
      *   .on('data', function(hmacKey) {
      *     // hmacKey is an HmacKey object.
      *   })
      *   .on('end', function() {
      *     // All HmacKey retrieved.
      *   });
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * storage.getHmacKeysStream()
      *   .on('data', function(bucket) {
      *     this.end();
      *   });
      */
    def getHmacKeysStream(): Readable = js.native
    
    def getServiceAccount(): js.Promise[GetServiceAccountResponse] = js.native
    def getServiceAccount(callback: GetServiceAccountCallback): Unit = js.native
    def getServiceAccount(options: GetServiceAccountOptions): js.Promise[GetServiceAccountResponse] = js.native
    def getServiceAccount(options: GetServiceAccountOptions, callback: GetServiceAccountCallback): Unit = js.native
    
    /**
      * Get a reference to an HmacKey object.
      * Note: this does not fetch the HMAC key's metadata. Use HmacKey#get() to
      * retrieve and populate the metadata.
      *
      * To get a reference to an HMAC key that's not created for a service
      * account in the same project used to instantiate the Storage client,
      * supply the project's ID as `projectId` in the `options` argument.
      *
      * @param {string} accessId The HMAC key's access ID.
      * @param {HmacKeyOptions} options HmacKey constructor owptions.
      * @returns {HmacKey}
      * @see HmacKey
      *
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const hmacKey = storage.hmacKey('ACCESS_ID');
      */
    def hmacKey(accessId: String): HmacKey = js.native
    def hmacKey(accessId: String, options: HmacKeyOptions): HmacKey = js.native
  }
  /* static members */
  object Storage {
    
    @JSImport("@google-cloud/storage/build/src/storage", "Storage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * {@link Bucket} class.
      *
      * @name Storage.Bucket
      * @see Bucket
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.Bucket")
    @js.native
    def Bucket: Instantiable3[
        /* storage */ Storage, 
        /* name */ String, 
        /* options */ js.UndefOr[typings.googleCloudStorage.bucketMod.BucketOptions], 
        typings.googleCloudStorage.bucketMod.Bucket
      ] = js.native
    @scala.inline
    def Bucket_=(
      x: Instantiable3[
          /* storage */ Storage, 
          /* name */ String, 
          /* options */ js.UndefOr[typings.googleCloudStorage.bucketMod.BucketOptions], 
          Bucket
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(x.asInstanceOf[js.Any])
    
    /**
      * {@link Channel} class.
      *
      * @name Storage.Channel
      * @see Channel
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.Channel")
    @js.native
    def Channel: Instantiable3[
        /* storage */ Storage, 
        /* id */ String, 
        /* resourceId */ String, 
        typings.googleCloudStorage.channelMod.Channel
      ] = js.native
    @scala.inline
    def Channel_=(x: Instantiable3[/* storage */ Storage, /* id */ String, /* resourceId */ String, Channel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Channel")(x.asInstanceOf[js.Any])
    
    /**
      * {@link File} class.
      *
      * @name Storage.File
      * @see File
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.File")
    @js.native
    def File: Instantiable3[
        /* bucket */ Bucket, 
        /* name */ String, 
        /* options */ js.UndefOr[FileOptions], 
        typings.googleCloudStorage.fileMod.File
      ] = js.native
    @scala.inline
    def File_=(
      x: Instantiable3[/* bucket */ Bucket, /* name */ String, /* options */ js.UndefOr[FileOptions], File]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /**
      * {@link HmacKey} class.
      *
      * @name Storage.HmacKey
      * @see HmacKey
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.HmacKey")
    @js.native
    def HmacKey: Instantiable3[
        /* storage */ Storage, 
        /* accessId */ String, 
        /* options */ js.UndefOr[HmacKeyOptions], 
        typings.googleCloudStorage.hmacKeyMod.HmacKey
      ] = js.native
    @scala.inline
    def HmacKey_=(
      x: Instantiable3[
          /* storage */ Storage, 
          /* accessId */ String, 
          /* options */ js.UndefOr[HmacKeyOptions], 
          HmacKey
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HmacKey")(x.asInstanceOf[js.Any])
    
    /**
      * Cloud Storage uses access control lists (ACLs) to manage object and
      * bucket access. ACLs are the mechanism you use to share objects with other
      * users and allow other users to access your buckets and objects.
      *
      * This object provides constants to refer to the three permission levels that
      * can be granted to an entity:
      *
      *   - `gcs.acl.OWNER_ROLE` - ("OWNER")
      *   - `gcs.acl.READER_ROLE` - ("READER")
      *   - `gcs.acl.WRITER_ROLE` - ("WRITER")
      *
      * @see [About Access Control Lists]{@link https://cloud.google.com/storage/docs/access-control/lists}
      *
      * @name Storage.acl
      * @type {object}
      * @property {string} OWNER_ROLE
      * @property {string} READER_ROLE
      * @property {string} WRITER_ROLE
      *
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const albums = storage.bucket('albums');
      *
      * //-
      * // Make all of the files currently in a bucket publicly readable.
      * //-
      * const options = {
      *   entity: 'allUsers',
      *   role: storage.acl.READER_ROLE
      * };
      *
      * albums.acl.add(options, function(err, aclObject) {});
      *
      * //-
      * // Make any new objects added to a bucket publicly readable.
      * //-
      * albums.acl.default.add(options, function(err, aclObject) {});
      *
      * //-
      * // Grant a user ownership permissions to a bucket.
      * //-
      * albums.acl.add({
      *   entity: 'user-useremail@example.com',
      *   role: storage.acl.OWNER_ROLE
      * }, function(err, aclObject) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * albums.acl.add(options).then(function(data) {
      *   const aclObject = data[0];
      *   const apiResponse = data[1];
      * });
      */
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.acl")
    @js.native
    def acl: OWNERROLE = js.native
    @scala.inline
    def acl_=(x: OWNERROLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acl")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.sanitizeEndpoint")
    @js.native
    def sanitizeEndpoint: js.Any = js.native
    @scala.inline
    def sanitizeEndpoint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeEndpoint")(x.asInstanceOf[js.Any])
  }
  
  type BucketCallback = js.Function3[
    /* err */ Error | Null, 
    /* bucket */ js.UndefOr[Bucket | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait BucketOptions extends StObject {
    
    var kmsKeyName: js.UndefOr[String] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object BucketOptions {
    
    @scala.inline
    def apply(): BucketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketOptions]
    }
    
    @scala.inline
    implicit class BucketOptionsMutableBuilder[Self <: BucketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  @js.native
  trait Cors extends StObject {
    
    var maxAgeSeconds: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[js.Array[String]] = js.native
    
    var origin: js.UndefOr[js.Array[String]] = js.native
    
    var responseHeader: js.UndefOr[js.Array[String]] = js.native
  }
  object Cors {
    
    @scala.inline
    def apply(): Cors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cors]
    }
    
    @scala.inline
    implicit class CorsMutableBuilder[Self <: Cors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      @scala.inline
      def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      @scala.inline
      def setResponseHeader(value: js.Array[String]): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
      
      @scala.inline
      def setResponseHeaderVarargs(value: String*): Self = StObject.set(x, "responseHeader", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CreateBucketQuery extends StObject {
    
    var project: String = js.native
    
    var userProject: String = js.native
  }
  object CreateBucketQuery {
    
    @scala.inline
    def apply(project: String, userProject: String): CreateBucketQuery = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], userProject = userProject.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBucketQuery]
    }
    
    @scala.inline
    implicit class CreateBucketQueryMutableBuilder[Self <: CreateBucketQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateBucketRequest extends StObject {
    
    var archive: js.UndefOr[Boolean] = js.native
    
    var coldline: js.UndefOr[Boolean] = js.native
    
    var cors: js.UndefOr[js.Array[Cors]] = js.native
    
    var dra: js.UndefOr[Boolean] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var multiRegional: js.UndefOr[Boolean] = js.native
    
    var nearline: js.UndefOr[Boolean] = js.native
    
    var regional: js.UndefOr[Boolean] = js.native
    
    var requesterPays: js.UndefOr[Boolean] = js.native
    
    var retentionPolicy: js.UndefOr[js.Object] = js.native
    
    var standard: js.UndefOr[Boolean] = js.native
    
    var storageClass: js.UndefOr[String] = js.native
    
    var userProject: js.UndefOr[String] = js.native
    
    var versioning: js.UndefOr[Versioning] = js.native
  }
  object CreateBucketRequest {
    
    @scala.inline
    def apply(): CreateBucketRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBucketRequest]
    }
    
    @scala.inline
    implicit class CreateBucketRequestMutableBuilder[Self <: CreateBucketRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchiveUndefined: Self = StObject.set(x, "archive", js.undefined)
      
      @scala.inline
      def setColdline(value: Boolean): Self = StObject.set(x, "coldline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColdlineUndefined: Self = StObject.set(x, "coldline", js.undefined)
      
      @scala.inline
      def setCors(value: js.Array[Cors]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setCorsVarargs(value: Cors*): Self = StObject.set(x, "cors", js.Array(value :_*))
      
      @scala.inline
      def setDra(value: Boolean): Self = StObject.set(x, "dra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraUndefined: Self = StObject.set(x, "dra", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMultiRegional(value: Boolean): Self = StObject.set(x, "multiRegional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiRegionalUndefined: Self = StObject.set(x, "multiRegional", js.undefined)
      
      @scala.inline
      def setNearline(value: Boolean): Self = StObject.set(x, "nearline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearlineUndefined: Self = StObject.set(x, "nearline", js.undefined)
      
      @scala.inline
      def setRegional(value: Boolean): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
      
      @scala.inline
      def setRequesterPays(value: Boolean): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
      
      @scala.inline
      def setRetentionPolicy(value: js.Object): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
      
      @scala.inline
      def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      
      @scala.inline
      def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
      
      @scala.inline
      def setVersioning(value: Versioning): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    }
  }
  
  type CreateBucketResponse = js.Tuple2[Bucket, Metadata]
  
  type CreateHmacKeyCallback = js.Function4[
    /* err */ Error | Null, 
    /* hmacKey */ js.UndefOr[HmacKey | Null], 
    /* secret */ js.UndefOr[String | Null], 
    /* apiResponse */ js.UndefOr[HmacKeyResourceResponse], 
    Unit
  ]
  
  @js.native
  trait CreateHmacKeyOptions extends StObject {
    
    var projectId: js.UndefOr[String] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object CreateHmacKeyOptions {
    
    @scala.inline
    def apply(): CreateHmacKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateHmacKeyOptions]
    }
    
    @scala.inline
    implicit class CreateHmacKeyOptionsMutableBuilder[Self <: CreateHmacKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type CreateHmacKeyResponse = js.Tuple3[HmacKey, String, HmacKeyResourceResponse]
  
  type GetBucketsCallback = js.Function4[
    /* err */ Error | Null, 
    /* buckets */ js.Array[Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait GetBucketsRequest extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var maxApiCalls: js.UndefOr[Double] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    var pageToken: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var project: js.UndefOr[String] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object GetBucketsRequest {
    
    @scala.inline
    def apply(): GetBucketsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBucketsRequest]
    }
    
    @scala.inline
    implicit class GetBucketsRequestMutableBuilder[Self <: GetBucketsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      @scala.inline
      def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetBucketsResponse = js.Tuple3[js.Array[Bucket], js.Object, Metadata]
  
  type GetHmacKeysCallback = js.Function4[
    /* err */ Error | Null, 
    /* hmacKeys */ js.Array[HmacKey] | Null, 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait GetHmacKeysOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var maxApiCalls: js.UndefOr[Double] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    var pageToken: js.UndefOr[String] = js.native
    
    var projectId: js.UndefOr[String] = js.native
    
    var serviceAccountEmail: js.UndefOr[String] = js.native
    
    var showDeletedKeys: js.UndefOr[Boolean] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object GetHmacKeysOptions {
    
    @scala.inline
    def apply(): GetHmacKeysOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHmacKeysOptions]
    }
    
    @scala.inline
    implicit class GetHmacKeysOptionsMutableBuilder[Self <: GetHmacKeysOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      @scala.inline
      def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
      
      @scala.inline
      def setShowDeletedKeys(value: Boolean): Self = StObject.set(x, "showDeletedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDeletedKeysUndefined: Self = StObject.set(x, "showDeletedKeys", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetHmacKeysResponse = js.Array[js.Array[HmacKey]]
  
  type GetServiceAccountCallback = js.Function3[
    /* err */ Error | Null, 
    /* serviceAccount */ js.UndefOr[ServiceAccount], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait GetServiceAccountOptions extends StObject {
    
    var userProject: js.UndefOr[String] = js.native
  }
  object GetServiceAccountOptions {
    
    @scala.inline
    def apply(): GetServiceAccountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceAccountOptions]
    }
    
    @scala.inline
    implicit class GetServiceAccountOptionsMutableBuilder[Self <: GetServiceAccountOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetServiceAccountResponse = js.Tuple2[ServiceAccount, Metadata]
  
  @js.native
  trait HmacKeyResourceResponse extends StObject {
    
    var metadata: HmacKeyMetadata = js.native
    
    var secret: String = js.native
  }
  object HmacKeyResourceResponse {
    
    @scala.inline
    def apply(metadata: HmacKeyMetadata, secret: String): HmacKeyResourceResponse = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[HmacKeyResourceResponse]
    }
    
    @scala.inline
    implicit class HmacKeyResourceResponseMutableBuilder[Self <: HmacKeyResourceResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: HmacKeyMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceAccount extends StObject {
    
    var emailAddress: js.UndefOr[String] = js.native
  }
  object ServiceAccount {
    
    @scala.inline
    def apply(): ServiceAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceAccount]
    }
    
    @scala.inline
    implicit class ServiceAccountMutableBuilder[Self <: ServiceAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    }
  }
  
  @js.native
  trait StorageOptions extends GoogleAuthOptions {
    
    /**
      * The API endpoint of the service used to make requests.
      * Defaults to `storage.googleapis.com`.
      */
    var apiEndpoint: js.UndefOr[String] = js.native
    
    var autoRetry: js.UndefOr[Boolean] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var promise: js.UndefOr[PromiseConstructor] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object StorageOptions {
    
    @scala.inline
    def apply(): StorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageOptions]
    }
    
    @scala.inline
    implicit class StorageOptionsMutableBuilder[Self <: StorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait Versioning extends StObject {
    
    var enabled: Boolean = js.native
  }
  object Versioning {
    
    @scala.inline
    def apply(enabled: Boolean): Versioning = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Versioning]
    }
    
    @scala.inline
    implicit class VersioningMutableBuilder[Self <: Versioning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
