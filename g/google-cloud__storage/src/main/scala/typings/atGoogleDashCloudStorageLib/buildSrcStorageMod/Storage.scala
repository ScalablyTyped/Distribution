package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/storage/build/src/storage", "Storage")
@js.native
class Storage ()
  extends atGoogleDashCloudCommonLib.commonMod.Service {
  def this(options: StorageOptions) = this()
  /**
       * Reference to {@link Storage.acl}.
       *
       * @name Storage#acl
       * @see Storage.acl
       */
  var acl: js.Any = js.native
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
  def bucket(name: java.lang.String): atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket = js.native
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
  def bucket(name: java.lang.String, options: BucketOptions): atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket = js.native
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
  def channel(id: java.lang.String, resourceId: java.lang.String): atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel = js.native
  /**
       * Metadata to set for the bucket.
       *
       * @typedef {object} CreateBucketRequest
       * @property {boolean} [coldline=false] Specify the storage class as Coldline.
       * @property {boolean} [dra=false] Specify the storage class as Durable Reduced
       *     Availability.
       * @property {boolean} [multiRegional=false] Specify the storage class as
       *     Multi-Regional.
       * @property {boolean} [nearline=false] Specify the storage class as Nearline.
       * @property {boolean} [regional=false] Specify the storage class as Regional.
       * @property {boolean} [requesterPays=false] **Early Access Testers Only**
       *     Force the use of the User Project metadata field to assign operational
       *     costs when an operation is made on a Bucket and its objects.
       * @property {string} [userProject] The ID of the project which will be billed
       *     for the request.
       */
  /**
       * @typedef {array} CreateBucketResponse
       * @property {Bucket} 0 The new {@link Bucket}.
       * @property {object} 1 The full API response.
       */
  /**
       * @callback CreateBucketCallback
       * @param {?Error} err Request error, if any.
       * @param {Bucket} bucket The new {@link Bucket}.
       * @param {object} apiResponse The full API response.
       */
  /**
       * Create a bucket.
       *
       * Cloud Storage uses a flat namespace, so you can't create a bucket with
       * a name that is already in use. For more information, see
       * [Bucket Naming
       * Guidelines](https://cloud.google.com/storage/docs/bucketnaming.html#requirements).
       *
       * @see [Buckets: insert API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/insert}
       * @see [Storage Classes]{@link https://cloud.google.com/storage/docs/storage-classes}
       *
       * @param {string} name Name of the bucket to create.
       * @param {CreateBucketRequest} [metadata] Metadata to set for the bucket.
       * @param {CreateBucketCallback} [callback] Callback function.
       * @returns {Promise<CreateBucketResponse>}
       * @throws {Error} If a name is not provided.
       * @see Bucket#create
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const callback = function(err, bucket, apiResponse) {
       *   // `bucket` is a Bucket object.
       * };
       *
       * storage.createBucket('new-bucket', callback);
       *
       * //-
       * // Create a bucket in a specific location and region. <em>See the <a
       * // href="https://cloud.google.com/storage/docs/json_api/v1/buckets/insert">
       * // Official JSON API docs</a> for complete details on the `location`
       * option.
       * // </em>
       * //-
       * const metadata = {
       *   location: 'US-CENTRAL1',
       *   regional: true
       * };
       *
       * storage.createBucket('new-bucket', metadata, callback);
       *
       * //-
       * // Create a bucket with a retention policy of 6 months.
       * //-
       * const metadata = {
       *   retentionPolicy: {
       *     retentionPeriod: 15780000 // 6 months in seconds.
       *   }
       * };
       *
       * storage.createBucket('new-bucket', metadata, callback);
       *
       * //-
       * // Enable versioning on a new bucket.
       * //-
       * const metadata = {
       *   versioning: {
       *     enabled: true
       *   }
       * };
       *
       * storage.createBucket('new-bucket', metadata, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * storage.createBucket('new-bucket').then(function(data) {
       *   const bucket = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/buckets.js</caption>
       * region_tag:storage_create_bucket
       * Another example:
       */
  def createBucket(name: java.lang.String): stdLib.Promise[CreateBucketResponse] = js.native
  def createBucket(name: java.lang.String, callback: BucketCallback): scala.Unit = js.native
  def createBucket(name: java.lang.String, metadata: CreateBucketRequest, callback: BucketCallback): scala.Unit = js.native
  /**
       * Query object for listing buckets.
       *
       * @typedef {object} GetBucketsRequest
       * @property {boolean} [autoPaginate=true] Have pagination handled
       *     automatically.
       * @property {number} [maxApiCalls] Maximum number of API calls to make.
       * @property {number} [maxResults] Maximum number of items plus prefixes to
       *     return.
       * @property {string} [pageToken] A previously-returned page token
       *     representing part of the larger set of results to view.
       * @property {string} [userProject] The ID of the project which will be billed
       *     for the request.
       */
  /**
       * @typedef {array} GetBucketsResponse
       * @property {Bucket[]} 0 Array of {@link Bucket} instances.
       */
  /**
       * @callback GetBucketsCallback
       * @param {?Error} err Request error, if any.
       * @param {Bucket[]} buckets Array of {@link Bucket} instances.
       */
  /**
       * Get Bucket objects for all of the buckets in your project.
       *
       * @see [Buckets: list API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/list}
       *
       * @param {GetBucketsRequest} [query] Query object for listing buckets.
       * @param {GetBucketsCallback} [callback] Callback function.
       * @returns {Promise<GetBucketsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * storage.getBuckets(function(err, buckets) {
       *   if (!err) {
       *     // buckets is an array of Bucket objects.
       *   }
       * });
       *
       * //-
       * // To control how many API requests are made and page through the results
       * // manually, set `autoPaginate` to `false`.
       * //-
       * const callback = function(err, buckets, nextQuery, apiResponse) {
       *   if (nextQuery) {
       *     // More results exist.
       *     storage.getBuckets(nextQuery, callback);
       *   }
       *
       *   // The `metadata` property is populated for you with the metadata at the
       *   // time of fetching.
       *   buckets[0].metadata;
       *
       *   // However, in cases where you are concerned the metadata could have
       *   // changed, use the `getMetadata` method.
       *   buckets[0].getMetadata(function(err, metadata, apiResponse) {});
       * };
       *
       * storage.getBuckets({
       *   autoPaginate: false
       * }, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * storage.getBuckets().then(function(data) {
       *   const buckets = data[0];
       * });
       *
       * @example <caption>include:samples/buckets.js</caption>
       * region_tag:storage_list_buckets
       * Another example:
       */
  def getBuckets(): stdLib.Promise[GetBucketsResponse] = js.native
  def getBuckets(callback: GetBucketsCallback): scala.Unit = js.native
  /**
       * Query object for listing buckets.
       *
       * @typedef {object} GetBucketsRequest
       * @property {boolean} [autoPaginate=true] Have pagination handled
       *     automatically.
       * @property {number} [maxApiCalls] Maximum number of API calls to make.
       * @property {number} [maxResults] Maximum number of items plus prefixes to
       *     return.
       * @property {string} [pageToken] A previously-returned page token
       *     representing part of the larger set of results to view.
       * @property {string} [userProject] The ID of the project which will be billed
       *     for the request.
       */
  /**
       * @typedef {array} GetBucketsResponse
       * @property {Bucket[]} 0 Array of {@link Bucket} instances.
       */
  /**
       * @callback GetBucketsCallback
       * @param {?Error} err Request error, if any.
       * @param {Bucket[]} buckets Array of {@link Bucket} instances.
       */
  /**
       * Get Bucket objects for all of the buckets in your project.
       *
       * @see [Buckets: list API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/list}
       *
       * @param {GetBucketsRequest} [query] Query object for listing buckets.
       * @param {GetBucketsCallback} [callback] Callback function.
       * @returns {Promise<GetBucketsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * storage.getBuckets(function(err, buckets) {
       *   if (!err) {
       *     // buckets is an array of Bucket objects.
       *   }
       * });
       *
       * //-
       * // To control how many API requests are made and page through the results
       * // manually, set `autoPaginate` to `false`.
       * //-
       * const callback = function(err, buckets, nextQuery, apiResponse) {
       *   if (nextQuery) {
       *     // More results exist.
       *     storage.getBuckets(nextQuery, callback);
       *   }
       *
       *   // The `metadata` property is populated for you with the metadata at the
       *   // time of fetching.
       *   buckets[0].metadata;
       *
       *   // However, in cases where you are concerned the metadata could have
       *   // changed, use the `getMetadata` method.
       *   buckets[0].getMetadata(function(err, metadata, apiResponse) {});
       * };
       *
       * storage.getBuckets({
       *   autoPaginate: false
       * }, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * storage.getBuckets().then(function(data) {
       *   const buckets = data[0];
       * });
       *
       * @example <caption>include:samples/buckets.js</caption>
       * region_tag:storage_list_buckets
       * Another example:
       */
  def getBuckets(options: GetBucketsRequest): stdLib.Promise[GetBucketsResponse] = js.native
  def getBuckets(options: GetBucketsRequest, callback: GetBucketsCallback): scala.Unit = js.native
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
  def getBucketsStream(): nodeLib.streamMod.Readable = js.native
  /**
       * @typedef {array} GetServiceAccountResponse
       * @property {object} 0 The service account resource.
       * @property {object} 1 The full
       * [API
       * response](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount#resource).
       */
  /**
       * @callback GetServiceAccountCallback
       * @param {?Error} err Request error, if any.
       * @param {object} serviceAccount The serviceAccount resource.
       * @param {string} serviceAccount.emailAddress The service account email
       *     address.
       * @param {object} apiResponse The full
       * [API
       * response](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount#resource).
       */
  /**
       * Get the email address of this project's Google Cloud Storage service
       * account.
       *
       * @see [Projects.serviceAccount: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount/get}
       * @see [Projects.serviceAccount Resource]{@link https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount#resource}
       *
       * @param {object} [options] Configuration object.
       * @param {string} [options.userProject] User project to be billed for this
       *     request.
       * @param {GetServiceAccountCallback} [callback] Callback function.
       * @returns {Promise<GetServiceAccountResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       *
       * storage.getServiceAccount(function(err, serviceAccount, apiResponse) {
       *   if (!err) {
       *     const serviceAccountEmail = serviceAccount.emailAddress;
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * storage.getServiceAccount().then(function(data) {
       *   const serviceAccountEmail = data[0].emailAddress;
       *   const apiResponse = data[1];
       * });
       */
  def getServiceAccount(): stdLib.Promise[GetServiceAccountResponse] = js.native
  def getServiceAccount(callback: GetServiceAccountCallback): scala.Unit = js.native
  /**
       * @typedef {array} GetServiceAccountResponse
       * @property {object} 0 The service account resource.
       * @property {object} 1 The full
       * [API
       * response](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount#resource).
       */
  /**
       * @callback GetServiceAccountCallback
       * @param {?Error} err Request error, if any.
       * @param {object} serviceAccount The serviceAccount resource.
       * @param {string} serviceAccount.emailAddress The service account email
       *     address.
       * @param {object} apiResponse The full
       * [API
       * response](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount#resource).
       */
  /**
       * Get the email address of this project's Google Cloud Storage service
       * account.
       *
       * @see [Projects.serviceAccount: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount/get}
       * @see [Projects.serviceAccount Resource]{@link https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount#resource}
       *
       * @param {object} [options] Configuration object.
       * @param {string} [options.userProject] User project to be billed for this
       *     request.
       * @param {GetServiceAccountCallback} [callback] Callback function.
       * @returns {Promise<GetServiceAccountResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       *
       * storage.getServiceAccount(function(err, serviceAccount, apiResponse) {
       *   if (!err) {
       *     const serviceAccountEmail = serviceAccount.emailAddress;
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * storage.getServiceAccount().then(function(data) {
       *   const serviceAccountEmail = data[0].emailAddress;
       *   const apiResponse = data[1];
       * });
       */
  def getServiceAccount(options: GetServiceAccountOptions): stdLib.Promise[GetServiceAccountResponse] = js.native
  def getServiceAccount(options: GetServiceAccountOptions, callback: GetServiceAccountCallback): scala.Unit = js.native
}

@JSImport("@google-cloud/storage/build/src/storage", "Storage")
@js.native
object Storage extends js.Object {
  /**
       * {@link Bucket} class.
       *
       * @name Storage.Bucket
       * @see Bucket
       * @type {Constructor}
       */
  var Bucket: ScalablyTyped.runtime.Instantiable3[
    /* storage */ atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, 
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ atGoogleDashCloudStorageLib.buildSrcBucketMod.BucketOptions], 
    atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket
  ] = js.native
  /**
       * {@link Channel} class.
       *
       * @name Storage.Channel
       * @see Channel
       * @type {Constructor}
       */
  var Channel: ScalablyTyped.runtime.Instantiable3[
    /* storage */ atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, 
    /* id */ java.lang.String, 
    /* resourceId */ java.lang.String, 
    atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel
  ] = js.native
  /**
       * {@link File} class.
       *
       * @name Storage.File
       * @see File
       * @type {Constructor}
       */
  var File: ScalablyTyped.runtime.Instantiable3[
    /* bucket */ atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, 
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ atGoogleDashCloudStorageLib.buildSrcFileMod.FileOptions], 
    atGoogleDashCloudStorageLib.buildSrcFileMod.File
  ] = js.native
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
  var acl: atGoogleDashCloudStorageLib.Anon_OWNERROLE = js.native
}

