package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @JSImport("@google-cloud/storage/build/src/storage", "Storage")
@js.native
class Storage () extends js.Object {
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
  def bucket(name: java.lang.String): atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket = js.native
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
  def createBucket(name: java.lang.String): js.Promise[CreateBucketResponse] = js.native
  def createBucket(name: java.lang.String, callback: BucketCallback): scala.Unit = js.native
  def createBucket(name: java.lang.String, metadata: CreateBucketRequest, callback: BucketCallback): scala.Unit = js.native
  def getBuckets(): js.Promise[GetBucketsResponse] = js.native
  def getBuckets(callback: GetBucketsCallback): scala.Unit = js.native
  def getBuckets(options: GetBucketsRequest): js.Promise[GetBucketsResponse] = js.native
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
  def getServiceAccount(): js.Promise[GetServiceAccountResponse] = js.native
  def getServiceAccount(callback: GetServiceAccountCallback): scala.Unit = js.native
  def getServiceAccount(options: GetServiceAccountOptions): js.Promise[GetServiceAccountResponse] = js.native
  def getServiceAccount(options: GetServiceAccountOptions, callback: GetServiceAccountCallback): scala.Unit = js.native
}

/* RemoveDifficultInheritance: 
- Dropped any */ @JSImport("@google-cloud/storage/build/src/storage", "Storage")
@js.native
object Storage extends js.Object {
  /**
    * {@link Bucket} class.
    *
    * @name Storage.Bucket
    * @see Bucket
    * @type {Constructor}
    */
  var Bucket: org.scalablytyped.runtime.Instantiable3[
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
  var Channel: org.scalablytyped.runtime.Instantiable3[
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
  var File: org.scalablytyped.runtime.Instantiable3[
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

