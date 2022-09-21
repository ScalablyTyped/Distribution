package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.aclMod.Acl
import typings.googleCloudStorage.crc32cMod.CRC32CValidator
import typings.googleCloudStorage.crc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.fileMod.File
import typings.googleCloudStorage.fileMod.FileOptions
import typings.googleCloudStorage.iamMod.Iam
import typings.googleCloudStorage.nodejsCommonMod.ServiceObject
import typings.googleCloudStorage.notificationMod.Notification
import typings.googleCloudStorage.signerMod.GetSignedUrlCallback
import typings.googleCloudStorage.signerMod.GetSignedUrlResponse
import typings.googleCloudStorage.signerMod.URLSigner
import typings.googleCloudStorage.storageMod.BucketOptions
import typings.googleCloudStorage.storageMod.Cors
import typings.googleCloudStorage.storageMod.PreconditionOptions
import typings.googleCloudStorage.storageMod.Storage
import typings.node.streamMod.Readable
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * A function that generates a CRC32C Validator. Defaults to {@link CRC32C}
  *
  * @name Bucket#crc32cGenerator
  * @type {CRC32CValidator}
  */
/**
  * Get and set IAM policies for your bucket.
  *
  * @name Bucket#iam
  * @mixes Iam
  *
  * See {@link https://cloud.google.com/storage/docs/access-control/iam#short_title_iam_management| Cloud Storage IAM Management}
  * See {@link https://cloud.google.com/iam/docs/granting-changing-revoking-access| Granting, Changing, and Revoking Access}
  * See {@link https://cloud.google.com/iam/docs/understanding-roles| IAM Roles}
  *
  * @example
  * ```
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
  * ```
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
  * {@link https://cloud.google.com/storage/docs/access-control/lists#default| default ACLs}
  * for all created files. Default ACLs specify permissions that all new
  * objects added to the bucket will inherit by default. You can add, delete,
  * get, and update entities and permissions for these as well with
  * {@link Bucket#acl.default}.
  *
  * See {@link http://goo.gl/6qBBPO| About Access Control Lists}
  * See {@link https://cloud.google.com/storage/docs/access-control/lists#default| Default ACLs}
  *
  * @name Bucket#acl
  * @mixes Acl
  * @property {Acl} default Cloud Storage Buckets have
  * {@link https://cloud.google.com/storage/docs/access-control/lists#default| default ACLs}
  * for all created files. You can add, delete, get, and update entities and
  * permissions for these as well. The method signatures and examples are all
  * the same, after only prefixing the method call with `default`.
  *
  * @example
  * ```
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
  * ```
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
/**
  * The API-formatted resource description of the bucket.
  *
  * Note: This is not guaranteed to be up-to-date when accessed. To get the
  * latest record, call the `getMetadata()` method.
  *
  * @name Bucket#metadata
  * @type {object}
  */
/**
  * The bucket's name.
  * @name Bucket#name
  * @type {string}
  */
/**
  * Get {@link File} objects for the files currently in the bucket as a
  * readable object stream.
  *
  * @method Bucket#getFilesStream
  * @param {GetFilesOptions} [query] Query object for listing files.
  * @returns {ReadableStream} A readable stream that emits {@link File} instances.
  *
  * @example
  * ```
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
  *
  * //-
  * // If you're filtering files with a delimiter, you should use
  * // {@link Bucket#getFiles} and set `autoPaginate: false` in order to
  * // preserve the `apiResponse` argument.
  * //-
  * const prefixes = [];
  *
  * function callback(err, files, nextQuery, apiResponse) {
  *   prefixes = prefixes.concat(apiResponse.prefixes);
  *
  *   if (nextQuery) {
  *     bucket.getFiles(nextQuery, callback);
  *   } else {
  *     // prefixes = The finished array of prefixes.
  *   }
  * }
  *
  * bucket.getFiles({
  *   autoPaginate: false,
  *   delimiter: '/'
  * }, callback);
  * ```
  */
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
  * ```
  * const {Storage} = require('@google-cloud/storage');
  * const storage = new Storage();
  * const bucket = storage.bucket('albums');
  * ```
  */
@JSImport("@google-cloud/storage/build/src/bucket", "Bucket")
@js.native
open class Bucket protected () extends ServiceObject[Any] {
  def this(storage: Storage, name: String) = this()
  def this(storage: Storage, name: String, options: BucketOptions) = this()
  
  var acl: Acl = js.native
  
  def addLifecycleRule(rule: js.Array[LifecycleRule]): js.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: js.Array[LifecycleRule], callback: SetBucketMetadataCallback): Unit = js.native
  def addLifecycleRule(rule: js.Array[LifecycleRule], options: AddLifecycleRuleOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(
    rule: js.Array[LifecycleRule],
    options: AddLifecycleRuleOptions,
    callback: SetBucketMetadataCallback
  ): Unit = js.native
  def addLifecycleRule(rule: LifecycleRule): js.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: LifecycleRule, callback: SetBucketMetadataCallback): Unit = js.native
  def addLifecycleRule(rule: LifecycleRule, options: AddLifecycleRuleOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: LifecycleRule, options: AddLifecycleRuleOptions, callback: SetBucketMetadataCallback): Unit = js.native
  
  /**
    * The bucket's Cloud Storage URI (`gs://`)
    *
    * @example
    * ```ts
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    *
    * // `gs://my-bucket`
    * const href = bucket.cloudStorageURI.href;
    * ```
    */
  def cloudStorageURI: URL_ = js.native
  
  def combine(sources: js.Array[File | String], destination: String): js.Promise[CombineResponse] = js.native
  def combine(sources: js.Array[File | String], destination: String, callback: CombineCallback): Unit = js.native
  def combine(sources: js.Array[File | String], destination: String, options: CombineOptions): js.Promise[CombineResponse] = js.native
  def combine(
    sources: js.Array[File | String],
    destination: String,
    options: CombineOptions,
    callback: CombineCallback
  ): Unit = js.native
  def combine(sources: js.Array[File | String], destination: File): js.Promise[CombineResponse] = js.native
  def combine(sources: js.Array[File | String], destination: File, callback: CombineCallback): Unit = js.native
  def combine(sources: js.Array[File | String], destination: File, options: CombineOptions): js.Promise[CombineResponse] = js.native
  def combine(
    sources: js.Array[File | String],
    destination: File,
    options: CombineOptions,
    callback: CombineCallback
  ): Unit = js.native
  
  def crc32cGenerator(): CRC32CValidator = js.native
  @JSName("crc32cGenerator")
  var crc32cGenerator_Original: CRC32CValidatorGenerator = js.native
  
  def createChannel(id: String, config: CreateChannelConfig): js.Promise[CreateChannelResponse] = js.native
  def createChannel(id: String, config: CreateChannelConfig, callback: CreateChannelCallback): Unit = js.native
  def createChannel(id: String, config: CreateChannelConfig, options: CreateChannelOptions): js.Promise[CreateChannelResponse] = js.native
  def createChannel(
    id: String,
    config: CreateChannelConfig,
    options: CreateChannelOptions,
    callback: CreateChannelCallback
  ): Unit = js.native
  
  def createNotification(topic: String): js.Promise[CreateNotificationResponse] = js.native
  def createNotification(topic: String, callback: CreateNotificationCallback): Unit = js.native
  def createNotification(topic: String, options: CreateNotificationOptions): js.Promise[CreateNotificationResponse] = js.native
  def createNotification(topic: String, options: CreateNotificationOptions, callback: CreateNotificationCallback): Unit = js.native
  
  def deleteFiles(): js.Promise[Unit] = js.native
  def deleteFiles(callback: DeleteFilesCallback): Unit = js.native
  def deleteFiles(query: DeleteFilesOptions): js.Promise[Unit] = js.native
  def deleteFiles(query: DeleteFilesOptions, callback: DeleteFilesCallback): Unit = js.native
  
  def deleteLabels(): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(callback: DeleteLabelsCallback): Unit = js.native
  def deleteLabels(labels: String): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: String, callback: DeleteLabelsCallback): Unit = js.native
  def deleteLabels(labels: String, options: DeleteLabelsOptions): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: String, options: DeleteLabelsOptions, callback: DeleteLabelsCallback): Unit = js.native
  def deleteLabels(labels: js.Array[String]): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: js.Array[String], callback: DeleteLabelsCallback): Unit = js.native
  def deleteLabels(labels: js.Array[String], options: DeleteLabelsOptions): js.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: js.Array[String], options: DeleteLabelsOptions, callback: DeleteLabelsCallback): Unit = js.native
  def deleteLabels(options: DeleteLabelsOptions): js.Promise[DeleteLabelsResponse] = js.native
  
  def disableAutoRetryConditionallyIdempotent_(coreOpts: Any, methodType: AvailableServiceObjectMethods): Unit = js.native
  def disableAutoRetryConditionallyIdempotent_(
    coreOpts: Any,
    methodType: AvailableServiceObjectMethods,
    localPreconditionOptions: PreconditionOptions
  ): Unit = js.native
  
  def disableRequesterPays(): js.Promise[DisableRequesterPaysResponse] = js.native
  def disableRequesterPays(callback: DisableRequesterPaysCallback): Unit = js.native
  def disableRequesterPays(options: DisableRequesterPaysOptions): js.Promise[DisableRequesterPaysResponse] = js.native
  def disableRequesterPays(options: DisableRequesterPaysOptions, callback: DisableRequesterPaysCallback): Unit = js.native
  
  def enableLogging(config: EnableLoggingOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def enableLogging(config: EnableLoggingOptions, callback: SetBucketMetadataCallback): Unit = js.native
  
  def enableRequesterPays(): js.Promise[EnableRequesterPaysResponse] = js.native
  def enableRequesterPays(callback: EnableRequesterPaysCallback): Unit = js.native
  def enableRequesterPays(options: EnableRequesterPaysOptions): js.Promise[EnableRequesterPaysResponse] = js.native
  def enableRequesterPays(options: EnableRequesterPaysOptions, callback: EnableRequesterPaysCallback): Unit = js.native
  
  /**
    * Create a {@link File} object. See {@link File} to see how to handle
    * the different use cases you may have.
    *
    * @param {string} name The name of the file in this bucket.
    * @param {FileOptions} [options] Configuration options.
    * @param {string|number} [options.generation] Only use a specific revision of
    *     this file.
    * @param {string} [options.encryptionKey] A custom encryption key. See
    *     {@link https://cloud.google.com/storage/docs/encryption#customer-supplied| Customer-supplied Encryption Keys}.
    * @param {string} [options.kmsKeyName] The name of the Cloud KMS key that will
    *     be used to encrypt the object. Must be in the format:
    *     `projects/my-project/locations/location/keyRings/my-kr/cryptoKeys/my-key`.
    *     KMS key ring must use the same location as the bucket.
    * @param {string} [options.userProject] The ID of the project which will be
    *     billed for all requests made from File object.
    * @returns {File}
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    * const file = bucket.file('my-existing-file.png');
    * ```
    */
  def file(name: String): File = js.native
  def file(name: String, options: FileOptions): File = js.native
  
  def getFiles(): js.Promise[GetFilesResponse] = js.native
  def getFiles(callback: GetFilesCallback): Unit = js.native
  def getFiles(query: GetFilesOptions): js.Promise[GetFilesResponse] = js.native
  def getFiles(query: GetFilesOptions, callback: GetFilesCallback): Unit = js.native
  
  def getFilesStream(): Readable = js.native
  def getFilesStream(query: GetFilesOptions): Readable = js.native
  
  def getId(): String = js.native
  
  def getLabels(): js.Promise[GetLabelsResponse] = js.native
  def getLabels(callback: GetLabelsCallback): Unit = js.native
  def getLabels(options: GetLabelsOptions): js.Promise[GetLabelsResponse] = js.native
  def getLabels(options: GetLabelsOptions, callback: GetLabelsCallback): Unit = js.native
  
  def getNotifications(): js.Promise[GetNotificationsResponse] = js.native
  def getNotifications(callback: GetNotificationsCallback): Unit = js.native
  def getNotifications(options: GetNotificationsOptions): js.Promise[GetNotificationsResponse] = js.native
  def getNotifications(options: GetNotificationsOptions, callback: GetNotificationsCallback): Unit = js.native
  
  def getSignedUrl(cfg: GetBucketSignedUrlConfig): js.Promise[GetSignedUrlResponse] = js.native
  def getSignedUrl(cfg: GetBucketSignedUrlConfig, callback: GetSignedUrlCallback): Unit = js.native
  
  var iam: Iam = js.native
  
  var instancePreconditionOpts: js.UndefOr[PreconditionOptions] = js.native
  
  /* private */ var instanceRetryValue: Any = js.native
  
  def lock(metageneration: String): js.Promise[BucketLockResponse] = js.native
  def lock(metageneration: String, callback: BucketLockCallback): Unit = js.native
  def lock(metageneration: Double): js.Promise[BucketLockResponse] = js.native
  def lock(metageneration: Double, callback: BucketLockCallback): Unit = js.native
  
  def makeAllFilesPublicPrivate_(): js.Promise[MakeAllFilesPublicPrivateResponse] = js.native
  def makeAllFilesPublicPrivate_(callback: MakeAllFilesPublicPrivateCallback): Unit = js.native
  def makeAllFilesPublicPrivate_(options: MakeAllFilesPublicPrivateOptions): js.Promise[MakeAllFilesPublicPrivateResponse] = js.native
  def makeAllFilesPublicPrivate_(options: MakeAllFilesPublicPrivateOptions, callback: MakeAllFilesPublicPrivateCallback): Unit = js.native
  
  def makePrivate(): js.Promise[MakeBucketPrivateResponse] = js.native
  def makePrivate(callback: MakeBucketPrivateCallback): Unit = js.native
  def makePrivate(options: MakeBucketPrivateOptions): js.Promise[MakeBucketPrivateResponse] = js.native
  def makePrivate(options: MakeBucketPrivateOptions, callback: MakeBucketPrivateCallback): Unit = js.native
  
  def makePublic(): js.Promise[MakeBucketPublicResponse] = js.native
  def makePublic(callback: MakeBucketPublicCallback): Unit = js.native
  def makePublic(options: MakeBucketPublicOptions): js.Promise[MakeBucketPublicResponse] = js.native
  def makePublic(options: MakeBucketPublicOptions, callback: MakeBucketPublicCallback): Unit = js.native
  
  var name: String = js.native
  
  /**
    * Get a reference to a Cloud Pub/Sub Notification.
    *
    * @param {string} id ID of notification.
    * @returns {Notification}
    * @see Notification
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    * const notification = bucket.notification('1');
    * ```
    */
  def notification(id: String): Notification = js.native
  
  def removeRetentionPeriod(): js.Promise[SetBucketMetadataResponse] = js.native
  def removeRetentionPeriod(callback: SetBucketMetadataCallback): Unit = js.native
  def removeRetentionPeriod(options: SetBucketMetadataOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def removeRetentionPeriod(options: SetBucketMetadataOptions, callback: SetBucketMetadataCallback): Unit = js.native
  
  def setCorsConfiguration(corsConfiguration: js.Array[Cors]): js.Promise[SetBucketMetadataResponse] = js.native
  def setCorsConfiguration(corsConfiguration: js.Array[Cors], callback: SetBucketMetadataCallback): Unit = js.native
  def setCorsConfiguration(corsConfiguration: js.Array[Cors], options: SetBucketMetadataOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def setCorsConfiguration(
    corsConfiguration: js.Array[Cors],
    options: SetBucketMetadataOptions,
    callback: SetBucketMetadataCallback
  ): Unit = js.native
  
  def setLabels(labels: Labels): js.Promise[SetLabelsResponse] = js.native
  def setLabels(labels: Labels, callback: SetLabelsCallback): Unit = js.native
  def setLabels(labels: Labels, options: SetLabelsOptions): js.Promise[SetLabelsResponse] = js.native
  def setLabels(labels: Labels, options: SetLabelsOptions, callback: SetLabelsCallback): Unit = js.native
  
  def setRetentionPeriod(duration: Double): js.Promise[SetBucketMetadataResponse] = js.native
  def setRetentionPeriod(duration: Double, callback: SetBucketMetadataCallback): Unit = js.native
  def setRetentionPeriod(duration: Double, options: SetBucketMetadataOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def setRetentionPeriod(duration: Double, options: SetBucketMetadataOptions, callback: SetBucketMetadataCallback): Unit = js.native
  
  def setStorageClass(storageClass: String): js.Promise[SetBucketMetadataResponse] = js.native
  def setStorageClass(storageClass: String, callback: SetBucketStorageClassCallback): Unit = js.native
  def setStorageClass(storageClass: String, options: SetBucketStorageClassOptions): js.Promise[SetBucketMetadataResponse] = js.native
  def setStorageClass(
    storageClass: String,
    options: SetBucketStorageClassOptions,
    callback: SetBucketStorageClassCallback
  ): Unit = js.native
  
  /**
    * Set a user project to be billed for all requests made from this Bucket
    * object and any files referenced from this Bucket object.
    *
    * @param {string} userProject The user project.
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    *
    * bucket.setUserProject('grape-spaceship-123');
    * ```
    */
  def setUserProject(userProject: String): Unit = js.native
  
  var signer: js.UndefOr[URLSigner] = js.native
  
  /**
    * A reference to the {@link Storage} associated with this {@link Bucket}
    * instance.
    * @name Bucket#storage
    * @type {Storage}
    */
  var storage: Storage = js.native
  
  def upload(pathString: String): js.Promise[UploadResponse] = js.native
  def upload(pathString: String, callback: UploadCallback): Unit = js.native
  def upload(pathString: String, options: UploadOptions): js.Promise[UploadResponse] = js.native
  def upload(pathString: String, options: UploadOptions, callback: UploadCallback): Unit = js.native
  
  /**
    * A user project to apply to each request from this bucket.
    * @name Bucket#userProject
    * @type {string}
    */
  var userProject: js.UndefOr[String] = js.native
}
