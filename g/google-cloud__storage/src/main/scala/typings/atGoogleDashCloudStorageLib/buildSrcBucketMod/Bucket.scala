package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a Bucket object to interact with a Cloud Storage bucket.
  *
  * @class
  * @hideconstructor
  *
  * @param {Storage} storage A {@link Storage} instance.
  * @param {string} name The name of the bucket.
  * @param {object} [options] Configuration object.
  * @param {string} [options.userProject] User project.
  *
  * @example
  * const {Storage} = require('@google-cloud/storage');
  * const storage = new Storage();
  * const bucket = storage.bucket('albums');
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any
- Dropped any */ @JSImport("@google-cloud/storage/build/src/bucket", "Bucket")
@js.native
class Bucket protected () extends js.Object {
  def this(storage: atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, name: java.lang.String) = this()
  def this(storage: atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, name: java.lang.String, options: BucketOptions) = this()
  /**
    * Cloud Storage uses access control lists (ACLs) to manage object and
    * bucket access. ACLs are the mechanism you use to share objects with other
    * users and allow other users to access your buckets and objects.
    *
    * An ACL consists of one or more entries, where each entry grants permissions
    * to an entity. Permissions define the actions that can be performed against
    * an object or bucket (for example, `READ` or `WRITE`); the entity defines
    * who the permission applies to (for example, a specific user or group of
    * users).
    *
    * The `acl` object on a Bucket instance provides methods to get you a list of
    * the ACLs defined on your bucket, as well as set, update, and delete them.
    *
    * Buckets also have
    * [default
    * ACLs](https://cloud.google.com/storage/docs/access-control/lists#default)
    * for all created files. Default ACLs specify permissions that all new
    * objects added to the bucket will inherit by default. You can add, delete,
    * get, and update entities and permissions for these as well with
    * {@link Bucket#acl.default}.
    *
    * @see [About Access Control Lists]{@link http://goo.gl/6qBBPO}
    * @see [Default ACLs]{@link https://cloud.google.com/storage/docs/access-control/lists#default}
    *
    * @name Bucket#acl
    * @mixes Acl
    * @property {Acl} default Cloud Storage Buckets have
    * [default
    * ACLs](https://cloud.google.com/storage/docs/access-control/lists#default)
    * for all created files. You can add, delete, get, and update entities and
    * permissions for these as well. The method signatures and examples are all
    * the same, after only prefixing the method call with `default`.
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    *
    * //-
    * // Make a bucket's contents publicly readable.
    * //-
    * const myBucket = storage.bucket('my-bucket');
    *
    * const options = {
    *   entity: 'allUsers',
    *   role: storage.acl.READER_ROLE
    * };
    *
    * myBucket.acl.add(options, function(err, aclObject) {});
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * myBucket.acl.add(options).then(function(data) {
    *   const aclObject = data[0];
    *   const apiResponse = data[1];
    * });
    *
    * @example <caption>include:samples/acl.js</caption>
    * region_tag:storage_print_bucket_acl
    * Example of printing a bucket's ACL:
    *
    * @example <caption>include:samples/acl.js</caption>
    * region_tag:storage_print_bucket_acl_for_user
    * Example of printing a bucket's ACL for a specific user:
    *
    * @example <caption>include:samples/acl.js</caption>
    * region_tag:storage_add_bucket_owner
    * Example of adding an owner to a bucket:
    *
    * @example <caption>include:samples/acl.js</caption>
    * region_tag:storage_remove_bucket_owner
    * Example of removing an owner from a bucket:
    *
    * @example <caption>include:samples/acl.js</caption>
    * region_tag:storage_add_bucket_default_owner
    * Example of adding a default owner to a bucket:
    *
    * @example <caption>include:samples/acl.js</caption>
    * region_tag:storage_remove_bucket_default_owner
    * Example of removing a default owner from a bucket:
    */
  var acl: atGoogleDashCloudStorageLib.buildSrcAclMod.Acl = js.native
  /**
    * Get {@link File} objects for the files currently in the bucket as a
    * readable object stream.
    *
    * @method Bucket#getFilesStream
    * @param {GetFilesOptions} [query] Query object for listing files.
    * @returns {ReadableStream} A readable stream that emits {@link File} instances.
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    *
    * bucket.getFilesStream()
    *   .on('error', console.error)
    *   .on('data', function(file) {
    *     // file is a File object.
    *   })
    *   .on('end', function() {
    *     // All files retrieved.
    *   });
    *
    * //-
    * // If you anticipate many results, you can end a stream early to prevent
    * // unnecessary processing and API requests.
    * //-
    * bucket.getFilesStream()
    *   .on('data', function(file) {
    *     this.end();
    *   });
    */
  var getFilesStream: js.Function = js.native
  /**
    * Get and set IAM policies for your bucket.
    *
    * @name Bucket#iam
    * @mixes Iam
    *
    * @see [Cloud Storage IAM Management](https://cloud.google.com/storage/docs/access-control/iam#short_title_iam_management)
    * @see [Granting, Changing, and Revoking Access](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
    * @see [IAM Roles](https://cloud.google.com/iam/docs/understanding-roles)
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    *
    * //-
    * // Get the IAM policy for your bucket.
    * //-
    * bucket.iam.getPolicy(function(err, policy) {
    *   console.log(policy);
    * });
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * bucket.iam.getPolicy().then(function(data) {
    *   const policy = data[0];
    *   const apiResponse = data[1];
    * });
    *
    * @example <caption>include:samples/iam.js</caption>
    * region_tag:storage_view_bucket_iam_members
    * Example of retrieving a bucket's IAM policy:
    *
    * @example <caption>include:samples/iam.js</caption>
    * region_tag:storage_add_bucket_iam_member
    * Example of adding to a bucket's IAM policy:
    *
    * @example <caption>include:samples/iam.js</caption>
    * region_tag:storage_remove_bucket_iam_member
    * Example of removing from a bucket's IAM policy:
    */
  var iam: atGoogleDashCloudStorageLib.buildSrcIamMod.Iam = js.native
  /**
    * The bucket's name.
    * @name Bucket#name
    * @type {string}
    */
  var name: java.lang.String = js.native
  /**
    * A reference to the {@link Storage} associated with this {@link Bucket}
    * instance.
    * @name Bucket#storage
    * @type {Storage}
    */
  var storage: atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage = js.native
  /**
    * A user project to apply to each request from this bucket.
    * @name Bucket#userProject
    * @type {string}
    */
  var userProject: js.UndefOr[java.lang.String] = js.native
  def addLifecycleRule(rule: LifecycleRule): js.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: LifecycleRule, callback: SetBucketMetadataCallback): scala.Unit = js.native
  def addLifecycleRule(rule: LifecycleRule, options: AddLifecycleRuleOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: LifecycleRule, options: AddLifecycleRuleOptions, callback: SetBucketMetadataCallback): scala.Unit = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: atGoogleDashCloudStorageLib.buildSrcFileMod.File,
    callback: CombineCallback
  ): scala.Unit = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: atGoogleDashCloudStorageLib.buildSrcFileMod.File,
    options: CombineOptions
  ): js.Promise[CombineResponse] = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: atGoogleDashCloudStorageLib.buildSrcFileMod.File,
    options: CombineOptions,
    callback: CombineCallback
  ): scala.Unit = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: java.lang.String,
    callback: CombineCallback
  ): scala.Unit = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: java.lang.String,
    options: CombineOptions
  ): js.Promise[CombineResponse] = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: java.lang.String,
    options: CombineOptions,
    callback: CombineCallback
  ): scala.Unit = js.native
  def createChannel(id: java.lang.String, config: CreateChannelConfig): js.Promise[CreateChannelResponse] = js.native
  def createChannel(id: java.lang.String, config: CreateChannelConfig, callback: CreateChannelCallback): scala.Unit = js.native
  def createChannel(id: java.lang.String, config: CreateChannelConfig, options: CreateChannelOptions): js.Promise[CreateChannelResponse] = js.native
  def createChannel(
    id: java.lang.String,
    config: CreateChannelConfig,
    options: CreateChannelOptions,
    callback: CreateChannelCallback
  ): scala.Unit = js.native
  def createNotification(topic: java.lang.String): js.Promise[CreateNotificationResponse] = js.native
  def createNotification(topic: java.lang.String, callback: CreateNotificationCallback): scala.Unit = js.native
  def createNotification(topic: java.lang.String, options: CreateNotificationOptions): js.Promise[CreateNotificationResponse] = js.native
  def createNotification(topic: java.lang.String, options: CreateNotificationOptions, callback: CreateNotificationCallback): scala.Unit = js.native
  def delete(): js.Promise[DeleteBucketResponse] = js.native
  def delete(callback: DeleteBucketCallback): scala.Unit = js.native
  def delete(options: DeleteBucketOptions): js.Promise[DeleteBucketResponse] = js.native
  def delete(options: DeleteBucketOptions, callback: DeleteBucketCallback): scala.Unit = js.native
  def deleteFiles(): js.Promise[scala.Unit] = js.native
  def deleteFiles(callback: DeleteFilesCallback): scala.Unit = js.native
  def deleteFiles(query: DeleteFilesOptions): js.Promise[scala.Unit] = js.native
  def deleteFiles(query: DeleteFilesOptions, callback: DeleteFilesCallback): scala.Unit = js.native
  def deleteLabels(): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(callback: DeleteLabelsCallback): scala.Unit = js.native
  def deleteLabels(labels: java.lang.String): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: java.lang.String, callback: DeleteLabelsCallback): scala.Unit = js.native
  def deleteLabels(labels: js.Array[java.lang.String]): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: js.Array[java.lang.String], callback: DeleteLabelsCallback): scala.Unit = js.native
  def disableRequesterPays(): js.Promise[DisableRequesterPaysResponse] = js.native
  def disableRequesterPays(callback: DisableRequesterPaysCallback): scala.Unit = js.native
  def enableRequesterPays(): js.Promise[EnableRequesterPaysResponse] = js.native
  def enableRequesterPays(callback: EnableRequesterPaysCallback): scala.Unit = js.native
  def exists(): js.Promise[BucketExistsResponse] = js.native
  def exists(callback: BucketExistsCallback): scala.Unit = js.native
  def exists(options: BucketExistsOptions): js.Promise[BucketExistsResponse] = js.native
  def exists(options: BucketExistsOptions, callback: BucketExistsCallback): scala.Unit = js.native
  /**
    * Create a {@link File} object. See {@link File} to see how to handle
    * the different use cases you may have.
    *
    * @param {string} name The name of the file in this bucket.
    * @param {object} [options] Configuration options.
    * @param {string|number} [options.generation] Only use a specific revision of
    *     this file.
    * @param {string} [options.encryptionKey] A custom encryption key. See
    *     [Customer-supplied Encryption
    * Keys](https://cloud.google.com/storage/docs/encryption#customer-supplied).
    * @param {string} [options.kmsKeyName] The name of the Cloud KMS key that will
    *     be used to encrypt the object. Must be in the format:
    *     `projects/my-project/locations/location/keyRings/my-kr/cryptoKeys/my-key`.
    *     KMS key ring must use the same location as the bucket.
    * @returns {File}
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    * const file = bucket.file('my-existing-file.png');
    */
  def file(name: java.lang.String): atGoogleDashCloudStorageLib.buildSrcFileMod.File = js.native
  def file(name: java.lang.String, options: atGoogleDashCloudStorageLib.buildSrcFileMod.FileOptions): atGoogleDashCloudStorageLib.buildSrcFileMod.File = js.native
  def get(): js.Promise[GetBucketResponse] = js.native
  def get(callback: GetBucketCallback): scala.Unit = js.native
  def get(options: GetBucketOptions): js.Promise[GetBucketResponse] = js.native
  def get(options: GetBucketOptions, callback: GetBucketCallback): scala.Unit = js.native
  def getFiles(): js.Promise[js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]] = js.native
  def getFiles(callback: GetFilesCallback): scala.Unit = js.native
  def getFiles(query: GetFilesOptions): js.Promise[js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]] = js.native
  def getFiles(query: GetFilesOptions, callback: GetFilesCallback): scala.Unit = js.native
  def getId(): java.lang.String = js.native
  def getLabels(callback: GetLabelsCallback): scala.Unit = js.native
  def getLabels(options: GetLabelsOptions): js.Promise[GetLabelsResponse] = js.native
  def getLabels(options: GetLabelsOptions, callback: GetLabelsCallback): scala.Unit = js.native
  def getMetadata(): js.Promise[GetBucketMetadataResponse] = js.native
  def getMetadata(callback: GetBucketMetadataCallback): scala.Unit = js.native
  def getMetadata(options: GetBucketMetadataOptions): js.Promise[GetBucketMetadataResponse] = js.native
  def getMetadata(options: GetBucketMetadataOptions, callback: GetBucketMetadataCallback): scala.Unit = js.native
  def getNotifications(): js.Promise[GetNotificationsResponse] = js.native
  def getNotifications(callback: GetNotificationsCallback): scala.Unit = js.native
  def getNotifications(options: GetNotificationsOptions): js.Promise[GetNotificationsResponse] = js.native
  def getNotifications(options: GetNotificationsOptions, callback: GetNotificationsCallback): scala.Unit = js.native
  def lock(metageneration: java.lang.String): js.Promise[BucketLockResponse] = js.native
  def lock(metageneration: java.lang.String, callback: BucketLockCallback): scala.Unit = js.native
  def lock(metageneration: scala.Double): js.Promise[BucketLockResponse] = js.native
  def lock(metageneration: scala.Double, callback: BucketLockCallback): scala.Unit = js.native
  def `makeAllFilesPublicPrivate_`(): js.Promise[MakeAllFilesPublicPrivateResponse] = js.native
  def `makeAllFilesPublicPrivate_`(callback: MakeAllFilesPublicPrivateCallback): scala.Unit = js.native
  def `makeAllFilesPublicPrivate_`(options: MakeAllFilesPublicPrivateOptions): js.Promise[MakeAllFilesPublicPrivateResponse] = js.native
  def `makeAllFilesPublicPrivate_`(options: MakeAllFilesPublicPrivateOptions, callback: MakeAllFilesPublicPrivateCallback): scala.Unit = js.native
  def makePrivate(): js.Promise[MakeBucketPrivateResponse] = js.native
  def makePrivate(callback: MakeBucketPrivateCallback): scala.Unit = js.native
  def makePrivate(options: MakeBucketPrivateOptions): js.Promise[MakeBucketPrivateResponse] = js.native
  def makePrivate(options: MakeBucketPrivateOptions, callback: MakeBucketPrivateCallback): scala.Unit = js.native
  def makePublic(): js.Promise[MakeBucketPublicResponse] = js.native
  def makePublic(callback: MakeBucketPublicCallback): scala.Unit = js.native
  def makePublic(options: MakeBucketPublicOptions): js.Promise[MakeBucketPublicResponse] = js.native
  def makePublic(options: MakeBucketPublicOptions, callback: MakeBucketPublicCallback): scala.Unit = js.native
  /**
    * Get a reference to a Cloud Pub/Sub Notification.
    *
    * @param {string} id ID of notification.
    * @returns {Notification}
    * @see Notification
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    * const notification = bucket.notification('1');
    */
  def notification(id: java.lang.String): atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification = js.native
  def removeRetentionPeriod(): js.Promise[SetBucketMetadataResponse] = js.native
  def removeRetentionPeriod(callback: SetBucketMetadataCallback): scala.Unit = js.native
  def request(
    reqOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecorateRequestOptions */ js.Any
  ): js.Promise[requestLib.requestMod.requestNs.Response] = js.native
  def request(
    reqOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DecorateRequestOptions */ js.Any,
    callback: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BodyResponseCallback */ js.Any
  ): scala.Unit = js.native
  def setLabels(labels: Labels, callback: SetLabelsCallback): scala.Unit = js.native
  def setLabels(labels: Labels, options: SetLabelsOptions): js.Promise[SetLabelsResponse] = js.native
  def setLabels(labels: Labels, options: SetLabelsOptions, callback: SetLabelsCallback): scala.Unit = js.native
  def setMetadata(
    metadata: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Metadata */ js.Any
  ): js.Promise[SetBucketMetadataResponse] = js.native
  def setMetadata(
    metadata: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Metadata */ js.Any,
    callback: SetBucketMetadataCallback
  ): scala.Unit = js.native
  def setMetadata(
    metadata: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Metadata */ js.Any,
    options: SetBucketMetadataOptions
  ): js.Promise[SetBucketMetadataResponse] = js.native
  def setMetadata(
    metadata: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Metadata */ js.Any,
    options: SetBucketMetadataOptions,
    callback: SetBucketMetadataCallback
  ): scala.Unit = js.native
  def setRetentionPeriod(duration: scala.Double): js.Promise[SetBucketMetadataResponse] = js.native
  def setRetentionPeriod(duration: scala.Double, callback: SetBucketMetadataCallback): scala.Unit = js.native
  def setStorageClass(storageClass: java.lang.String, callback: SetBucketStorageClassCallback): scala.Unit = js.native
  def setStorageClass(storageClass: java.lang.String, options: SetBucketStorageClassOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def setStorageClass(
    storageClass: java.lang.String,
    options: SetBucketStorageClassOptions,
    callback: SetBucketStorageClassCallback
  ): scala.Unit = js.native
  /**
    * Set a user project to be billed for all requests made from this Bucket
    * object and any files referenced from this Bucket object.
    *
    * @param {string} userProject The user project.
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    *
    * bucket.setUserProject('grape-spaceship-123');
    */
  def setUserProject(userProject: java.lang.String): scala.Unit = js.native
  def upload(pathString: java.lang.String): js.Promise[UploadResponse] = js.native
  def upload(pathString: java.lang.String, callback: UploadCallback): scala.Unit = js.native
  def upload(pathString: java.lang.String, options: UploadOptions): js.Promise[UploadResponse] = js.native
  def upload(pathString: java.lang.String, options: UploadOptions, callback: UploadCallback): scala.Unit = js.native
}

