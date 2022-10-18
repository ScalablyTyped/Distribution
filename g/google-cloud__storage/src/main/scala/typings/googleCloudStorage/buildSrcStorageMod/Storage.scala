package typings.googleCloudStorage.buildSrcStorageMod

import org.scalablytyped.runtime.Instantiable3
import typings.googleCloudStorage.anon.OWNERROLE
import typings.googleCloudStorage.buildSrcBucketMod.Bucket
import typings.googleCloudStorage.buildSrcChannelMod.Channel
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidator
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.buildSrcFileMod.File
import typings.googleCloudStorage.buildSrcFileMod.FileOptions
import typings.googleCloudStorage.buildSrcHmacKeyMod.HmacKey
import typings.googleCloudStorage.buildSrcHmacKeyMod.HmacKeyOptions
import typings.googleCloudStorage.buildSrcNodejsCommonMod.Service
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/storage", "Storage")
@js.native
/**
  * @callback Crc32cGeneratorToStringCallback
  * A method returning the CRC32C as a base64-encoded string.
  *
  * @returns {string}
  *
  * @example
  * Hashing the string 'data' should return 'rth90Q=='
  *
  * ```js
  * const buffer = Buffer.from('data');
  * crc32c.update(buffer);
  * crc32c.toString(); // 'rth90Q=='
  * ```
  **/
/**
  * @callback Crc32cGeneratorValidateCallback
  * A method validating a base64-encoded CRC32C string.
  *
  * @param {string} [value] base64-encoded CRC32C string to validate
  * @returns {boolean}
  *
  * @example
  * Should return `true` if the value matches, `false` otherwise
  *
  * ```js
  * const buffer = Buffer.from('data');
  * crc32c.update(buffer);
  * crc32c.validate('DkjKuA=='); // false
  * crc32c.validate('rth90Q=='); // true
  * ```
  **/
/**
  * @callback Crc32cGeneratorUpdateCallback
  * A method for passing `Buffer`s for CRC32C generation.
  *
  * @param {Buffer} [data] data to update CRC32C value with
  * @returns {undefined}
  *
  * @example
  * Hashing buffers from 'some ' and 'text\n'
  *
  * ```js
  * const buffer1 = Buffer.from('some ');
  * crc32c.update(buffer1);
  *
  * const buffer2 = Buffer.from('text\n');
  * crc32c.update(buffer2);
  *
  * crc32c.toString(); // 'DkjKuA=='
  * ```
  **/
/**
  * @typedef {object} CRC32CValidator
  * @property {Crc32cGeneratorToStringCallback}
  * @property {Crc32cGeneratorValidateCallback}
  * @property {Crc32cGeneratorUpdateCallback}
  */
/**
  * @callback Crc32cGeneratorCallback
  * @returns {CRC32CValidator}
  */
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
  * @property {object} [retryOptions] Options for customizing retries. Retriable server errors
  *     will be retried with exponential delay between them dictated by the formula
  *     max(maxRetryDelay, retryDelayMultiplier*retryNumber) until maxRetries or totalTimeout
  *     has been reached. Retries will only happen if autoRetry is set to true.
  * @property {boolean} [retryOptions.autoRetry=true] Automatically retry requests if the
  *     response is related to rate limits or certain intermittent server
  * errors. We will exponentially backoff subsequent requests by default.
  * @property {number} [retryOptions.retryDelayMultiplier = 2] the multiplier by which to
  *   increase the delay time between the completion of failed requests, and the
  *   initiation of the subsequent retrying request.
  * @property {number} [retryOptions.totalTimeout = 600] The total time, starting from
  *  when the initial request is sent, after which an error will
  *   be returned, regardless of the retrying attempts made meanwhile.
  * @property {number} [retryOptions.maxRetryDelay = 64] The maximum delay time between requests.
  *   When this value is reached, ``retryDelayMultiplier`` will no longer be used to
  *   increase delay time.
  * @property {number} [retryOptions.maxRetries=3] Maximum number of automatic retries
  *     attempted before returning the error.
  * @property {function} [retryOptions.retryableErrorFn] Function that returns true if a given
  *     error should be retried and false otherwise.
  * @property {enum} [retryOptions.idempotencyStrategy=IdempotencyStrategy.RetryConditional] Enumeration
  *     controls how conditionally idempotent operations are retried. Possible values are: RetryAlways -
  *     will respect other retry settings and attempt to retry conditionally idempotent operations. RetryConditional -
  *     will retry conditionally idempotent operations if the correct preconditions are set. RetryNever - never
  *     retry a conditionally idempotent operation.
  * @property {string} [userAgent] The value to be prepended to the User-Agent
  *     header in API requests.
  * @property {object} [authClient] `AuthClient` or `GoogleAuth` client to reuse instead of creating a new one.
  * @property {number} [timeout] The amount of time in milliseconds to wait per http request before timing out.
  * @property {object[]} [interceptors_] Array of custom request interceptors to be returned in the order they were assigned.
  * @property {string} [apiEndpoint = storage.google.com] The API endpoint of the service used to make requests.
  * @property {boolean} [useAuthWithCustomEndpoint = false] Controls whether or not to use authentication when using a custom endpoint.
  * @property {Crc32cGeneratorCallback} [callback] A function that generates a CRC32C Validator. Defaults to {@link CRC32C}
  */
/**
  * Constructs the Storage client.
  *
  * @example
  * Create a client that uses Application Default Credentials
  * (ADC)
  * ```
  * const {Storage} = require('@google-cloud/storage');
  * const storage = new Storage();
  * ```
  *
  * @example
  * Create a client with explicit credentials
  * ```
  * const storage = new Storage({
  *   projectId: 'your-project-id',
  *   keyFilename: '/path/to/keyfile.json'
  * });
  * ```
  *
  * @example
  * Create a client with an `AuthClient` (e.g. `DownscopedClient`)
  * ```
  * const {DownscopedClient} = require('google-auth-library');
  * const authClient = new DownscopedClient({...});
  *
  * const storage = new Storage({authClient});
  * ```
  *
  * Additional samples:
  * - https://github.com/googleapis/google-auth-library-nodejs#sample-usage-1
  * - https://github.com/googleapis/google-auth-library-nodejs/blob/main/samples/downscopedclient.js
  *
  * @param {StorageOptions} [options] Configuration options.
  */
open class Storage () extends Service {
  def this(options: StorageOptions) = this()
  
  /**
    * Reference to {@link Storage.acl}.
    *
    * @name Storage#acl
    * @see Storage.acl
    */
  var acl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Storage.acl */ Any = js.native
  
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
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const albums = storage.bucket('albums');
    * const photos = storage.bucket('photos');
    * ```
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
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const channel = storage.channel('id', 'resource-id');
    * ```
    */
  def channel(id: String, resourceId: String): Channel = js.native
  
  def crc32cGenerator(): CRC32CValidator = js.native
  @JSName("crc32cGenerator")
  var crc32cGenerator_Original: CRC32CValidatorGenerator = js.native
  
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
    *     return per call.
    *     Note: By default will handle pagination automatically
    *     if more than 1 page worth of results are requested per call.
    *     When `autoPaginate` is set to `false` the smaller of `maxResults`
    *     or 1 page of results will be returned per call.
    * @property {string} [pageToken] A previously-returned page token
    *     representing part of the larger set of results to view.
    * @property {string} [userProject] This parameter is currently ignored.
    */
  /**
    * @typedef {array} GetHmacKeysResponse
    * @property {HmacKey[]} 0 Array of {@link HmacKey} instances.
    * @param {object} nextQuery 1 A query object to receive more results.
    * @param {object} apiResponse 2 The full API response.
    */
  /**
    * @callback GetHmacKeysCallback
    * @param {?Error} err Request error, if any.
    * @param {HmacKey[]} hmacKeys Array of {@link HmacKey} instances.
    * @param {object} nextQuery A query object to receive more results.
    * @param {object} apiResponse The full API response.
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
    * ```
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
    * ```
    */
  def getHmacKeys(): js.Promise[GetHmacKeysResponse] = js.native
  def getHmacKeys(callback: GetHmacKeysCallback): Unit = js.native
  def getHmacKeys(options: GetHmacKeysOptions): js.Promise[GetHmacKeysResponse] = js.native
  def getHmacKeys(options: GetHmacKeysOptions, callback: GetHmacKeysCallback): Unit = js.native
  
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
    * @param {HmacKeyOptions} options HmacKey constructor options.
    * @returns {HmacKey}
    * @see HmacKey
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const hmacKey = storage.hmacKey('ACCESS_ID');
    * ```
    */
  def hmacKey(accessId: String): HmacKey = js.native
  def hmacKey(accessId: String, options: HmacKeyOptions): HmacKey = js.native
  
  var retryOptions: RetryOptions = js.native
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
    /* options */ js.UndefOr[BucketOptions], 
    typings.googleCloudStorage.buildSrcBucketMod.Bucket
  ] = js.native
  inline def Bucket_=(
    x: Instantiable3[
      /* storage */ Storage, 
      /* name */ String, 
      /* options */ js.UndefOr[BucketOptions], 
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
    typings.googleCloudStorage.buildSrcChannelMod.Channel
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
    typings.googleCloudStorage.buildSrcFileMod.File
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
    typings.googleCloudStorage.buildSrcHmacKeyMod.HmacKey
  ] = js.native
  inline def HmacKey_=(
    x: Instantiable3[
      /* storage */ Storage, 
      /* accessId */ String, 
      /* options */ js.UndefOr[HmacKeyOptions], 
      HmacKey
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HmacKey")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/storage/build/src/storage", "Storage.acl")
  @js.native
  def acl: OWNERROLE = js.native
  inline def acl_=(x: OWNERROLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acl")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/storage/build/src/storage", "Storage.sanitizeEndpoint")
  @js.native
  def sanitizeEndpoint: Any = js.native
  inline def sanitizeEndpoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeEndpoint")(x.asInstanceOf[js.Any])
}
