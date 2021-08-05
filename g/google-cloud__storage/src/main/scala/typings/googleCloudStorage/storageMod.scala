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
    inline def Bucket_=(
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
    inline def Channel_=(x: Instantiable3[/* storage */ Storage, /* id */ String, /* resourceId */ String, Channel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Channel")(x.asInstanceOf[js.Any])
    
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
    inline def File_=(
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
    inline def HmacKey_=(
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
    inline def acl_=(x: OWNERROLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acl")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/storage/build/src/storage", "Storage.sanitizeEndpoint")
    @js.native
    def sanitizeEndpoint: js.Any = js.native
    inline def sanitizeEndpoint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeEndpoint")(x.asInstanceOf[js.Any])
  }
  
  type BucketCallback = js.Function3[
    /* err */ Error | Null, 
    /* bucket */ js.UndefOr[Bucket | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait BucketOptions extends StObject {
    
    var kmsKeyName: js.UndefOr[String] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object BucketOptions {
    
    inline def apply(): BucketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketOptions]
    }
    
    extension [Self <: BucketOptions](x: Self) {
      
      inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  trait Cors extends StObject {
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[js.Array[String]] = js.undefined
    
    var origin: js.UndefOr[js.Array[String]] = js.undefined
    
    var responseHeader: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Cors {
    
    inline def apply(): Cors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cors]
    }
    
    extension [Self <: Cors](x: Self) {
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      inline def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      inline def setResponseHeader(value: js.Array[String]): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
      
      inline def setResponseHeaderVarargs(value: String*): Self = StObject.set(x, "responseHeader", js.Array(value :_*))
    }
  }
  
  trait CreateBucketQuery extends StObject {
    
    var project: String
    
    var userProject: String
  }
  object CreateBucketQuery {
    
    inline def apply(project: String, userProject: String): CreateBucketQuery = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], userProject = userProject.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBucketQuery]
    }
    
    extension [Self <: CreateBucketQuery](x: Self) {
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateBucketRequest extends StObject {
    
    var archive: js.UndefOr[Boolean] = js.undefined
    
    var coldline: js.UndefOr[Boolean] = js.undefined
    
    var cors: js.UndefOr[js.Array[Cors]] = js.undefined
    
    var dra: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var multiRegional: js.UndefOr[Boolean] = js.undefined
    
    var nearline: js.UndefOr[Boolean] = js.undefined
    
    var regional: js.UndefOr[Boolean] = js.undefined
    
    var requesterPays: js.UndefOr[Boolean] = js.undefined
    
    var retentionPolicy: js.UndefOr[js.Object] = js.undefined
    
    var standard: js.UndefOr[Boolean] = js.undefined
    
    var storageClass: js.UndefOr[String] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
    
    var versioning: js.UndefOr[Versioning] = js.undefined
  }
  object CreateBucketRequest {
    
    inline def apply(): CreateBucketRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBucketRequest]
    }
    
    extension [Self <: CreateBucketRequest](x: Self) {
      
      inline def setArchive(value: Boolean): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
      
      inline def setArchiveUndefined: Self = StObject.set(x, "archive", js.undefined)
      
      inline def setColdline(value: Boolean): Self = StObject.set(x, "coldline", value.asInstanceOf[js.Any])
      
      inline def setColdlineUndefined: Self = StObject.set(x, "coldline", js.undefined)
      
      inline def setCors(value: js.Array[Cors]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setCorsVarargs(value: Cors*): Self = StObject.set(x, "cors", js.Array(value :_*))
      
      inline def setDra(value: Boolean): Self = StObject.set(x, "dra", value.asInstanceOf[js.Any])
      
      inline def setDraUndefined: Self = StObject.set(x, "dra", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMultiRegional(value: Boolean): Self = StObject.set(x, "multiRegional", value.asInstanceOf[js.Any])
      
      inline def setMultiRegionalUndefined: Self = StObject.set(x, "multiRegional", js.undefined)
      
      inline def setNearline(value: Boolean): Self = StObject.set(x, "nearline", value.asInstanceOf[js.Any])
      
      inline def setNearlineUndefined: Self = StObject.set(x, "nearline", js.undefined)
      
      inline def setRegional(value: Boolean): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
      
      inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
      
      inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
      
      inline def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
      
      inline def setRetentionPolicy(value: js.Object): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
      
      inline def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
      
      inline def setStandard(value: Boolean): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      
      inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
      
      inline def setVersioning(value: Versioning): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
      
      inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
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
  
  trait CreateHmacKeyOptions extends StObject {
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object CreateHmacKeyOptions {
    
    inline def apply(): CreateHmacKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateHmacKeyOptions]
    }
    
    extension [Self <: CreateHmacKeyOptions](x: Self) {
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
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
  
  trait GetBucketsRequest extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.undefined
    
    var maxApiCalls: js.UndefOr[Double] = js.undefined
    
    var maxResults: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetBucketsRequest {
    
    inline def apply(): GetBucketsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBucketsRequest]
    }
    
    extension [Self <: GetBucketsRequest](x: Self) {
      
      inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      inline def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      inline def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
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
  
  trait GetHmacKeysOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.undefined
    
    var maxApiCalls: js.UndefOr[Double] = js.undefined
    
    var maxResults: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var serviceAccountEmail: js.UndefOr[String] = js.undefined
    
    var showDeletedKeys: js.UndefOr[Boolean] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetHmacKeysOptions {
    
    inline def apply(): GetHmacKeysOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHmacKeysOptions]
    }
    
    extension [Self <: GetHmacKeysOptions](x: Self) {
      
      inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      inline def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      inline def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
      
      inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
      
      inline def setShowDeletedKeys(value: Boolean): Self = StObject.set(x, "showDeletedKeys", value.asInstanceOf[js.Any])
      
      inline def setShowDeletedKeysUndefined: Self = StObject.set(x, "showDeletedKeys", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetHmacKeysResponse = js.Array[js.Array[HmacKey]]
  
  type GetServiceAccountCallback = js.Function3[
    /* err */ Error | Null, 
    /* serviceAccount */ js.UndefOr[ServiceAccount], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait GetServiceAccountOptions extends StObject {
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetServiceAccountOptions {
    
    inline def apply(): GetServiceAccountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceAccountOptions]
    }
    
    extension [Self <: GetServiceAccountOptions](x: Self) {
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetServiceAccountResponse = js.Tuple2[ServiceAccount, Metadata]
  
  trait HmacKeyResourceResponse extends StObject {
    
    var metadata: HmacKeyMetadata
    
    var secret: String
  }
  object HmacKeyResourceResponse {
    
    inline def apply(metadata: HmacKeyMetadata, secret: String): HmacKeyResourceResponse = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[HmacKeyResourceResponse]
    }
    
    extension [Self <: HmacKeyResourceResponse](x: Self) {
      
      inline def setMetadata(value: HmacKeyMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceAccount extends StObject {
    
    var emailAddress: js.UndefOr[String] = js.undefined
  }
  object ServiceAccount {
    
    inline def apply(): ServiceAccount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceAccount]
    }
    
    extension [Self <: ServiceAccount](x: Self) {
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    }
  }
  
  trait StorageOptions
    extends StObject
       with GoogleAuthOptions {
    
    /**
      * The API endpoint of the service used to make requests.
      * Defaults to `storage.googleapis.com`.
      */
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var autoRetry: js.UndefOr[Boolean] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object StorageOptions {
    
    inline def apply(): StorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageOptions]
    }
    
    extension [Self <: StorageOptions](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
      
      inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait Versioning extends StObject {
    
    var enabled: Boolean
  }
  object Versioning {
    
    inline def apply(enabled: Boolean): Versioning = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Versioning]
    }
    
    extension [Self <: Versioning](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
