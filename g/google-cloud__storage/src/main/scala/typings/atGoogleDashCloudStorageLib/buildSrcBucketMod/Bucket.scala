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
@JSImport("@google-cloud/storage/build/src/bucket", "Bucket")
@js.native
class Bucket protected ()
  extends atGoogleDashCloudCommonLib.commonMod.ServiceObject[js.Object] {
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
  /**
       * Add an object lifecycle management rule to the bucket.
       *
       * By default, an Object Lifecycle Management rule provided to this method
       * will be included to the existing policy. To replace all existing rules,
       * supply the `options` argument, setting `append` to `false`.
       *
       * @see [Object Lifecycle Management]{@link https://cloud.google.com/storage/docs/lifecycle}
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {LifecycleRule} rule The new lifecycle rule to be added to objects
       *     in this bucket.
       * @param {string} [rule.storageClass] When using the `setStorageClass`
       *     action, provide this option to dictate which storage class the object
       *     should update to.
       * @param {AddLifecycleRuleOptions} [options] Configuration object.
       * @param {boolean} [options.append=true] Append the new rule to the existing
       *     policy.
       * @param {SetBucketMetadataCallback} [callback] Callback function.
       * @returns {Promise<SetBucketMetadataResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Automatically have an object deleted from this bucket once it is 3 years
       * // of age.
       * //-
       * bucket.addLifecycleRule({
       *   action: 'delete',
       *   condition: {
       *     age: 365 * 3 // Specified in days.
       *   }
       * }, function(err, apiResponse) {
       *   if (err) {
       *     // Error handling omitted.
       *   }
       *
       *   const lifecycleRules = bucket.metadata.lifecycle.rule;
       *
       *   // Iterate over the Object Lifecycle Management rules on this bucket.
       *   lifecycleRules.forEach(lifecycleRule => {});
       * });
       *
       * //-
       * // By default, the rule you provide will be added to the existing policy.
       * // Optionally, you can disable this behavior to replace all of the
       * // pre-existing rules.
       * //-
       * const options = {
       *   append: false
       * };
       *
       * bucket.addLifecycleRule({
       *   action: 'delete',
       *   condition: {
       *     age: 365 * 3 // Specified in days.
       *   }
       * }, options, function(err, apiResponse) {
       *   if (err) {
       *     // Error handling omitted.
       *   }
       *
       *   // All rules have been replaced with the new "delete" rule.
       *
       *   // Iterate over the Object Lifecycle Management rules on this bucket.
       *   lifecycleRules.forEach(lifecycleRule => {});
       * });
       *
       * //-
       * // For objects created before 2018, "downgrade" the storage class.
       * //-
       * bucket.addLifecycleRule({
       *   action: 'setStorageClass',
       *   storageClass: 'COLDLINE',
       *   condition: {
       *     createdBefore: new Date('2018')
       *   }
       * }, function(err, apiResponse) {});
       *
       * //-
       * // Delete objects created before 2016 which have the Coldline storage
       * // class.
       * //-
       * bucket.addLifecycleRule({
       *   action: 'delete',
       *   condition: {
       *     matchesStorageClass: [
       *       'COLDLINE'
       *     ],
       *     createdBefore: new Date('2016')
       *   }
       * }, function(err, apiResponse) {});
       */
  def addLifecycleRule(rule: LifecycleRule): stdLib.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: LifecycleRule, callback: SetBucketMetadataCallback): scala.Unit = js.native
  /**
       * Add an object lifecycle management rule to the bucket.
       *
       * By default, an Object Lifecycle Management rule provided to this method
       * will be included to the existing policy. To replace all existing rules,
       * supply the `options` argument, setting `append` to `false`.
       *
       * @see [Object Lifecycle Management]{@link https://cloud.google.com/storage/docs/lifecycle}
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {LifecycleRule} rule The new lifecycle rule to be added to objects
       *     in this bucket.
       * @param {string} [rule.storageClass] When using the `setStorageClass`
       *     action, provide this option to dictate which storage class the object
       *     should update to.
       * @param {AddLifecycleRuleOptions} [options] Configuration object.
       * @param {boolean} [options.append=true] Append the new rule to the existing
       *     policy.
       * @param {SetBucketMetadataCallback} [callback] Callback function.
       * @returns {Promise<SetBucketMetadataResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Automatically have an object deleted from this bucket once it is 3 years
       * // of age.
       * //-
       * bucket.addLifecycleRule({
       *   action: 'delete',
       *   condition: {
       *     age: 365 * 3 // Specified in days.
       *   }
       * }, function(err, apiResponse) {
       *   if (err) {
       *     // Error handling omitted.
       *   }
       *
       *   const lifecycleRules = bucket.metadata.lifecycle.rule;
       *
       *   // Iterate over the Object Lifecycle Management rules on this bucket.
       *   lifecycleRules.forEach(lifecycleRule => {});
       * });
       *
       * //-
       * // By default, the rule you provide will be added to the existing policy.
       * // Optionally, you can disable this behavior to replace all of the
       * // pre-existing rules.
       * //-
       * const options = {
       *   append: false
       * };
       *
       * bucket.addLifecycleRule({
       *   action: 'delete',
       *   condition: {
       *     age: 365 * 3 // Specified in days.
       *   }
       * }, options, function(err, apiResponse) {
       *   if (err) {
       *     // Error handling omitted.
       *   }
       *
       *   // All rules have been replaced with the new "delete" rule.
       *
       *   // Iterate over the Object Lifecycle Management rules on this bucket.
       *   lifecycleRules.forEach(lifecycleRule => {});
       * });
       *
       * //-
       * // For objects created before 2018, "downgrade" the storage class.
       * //-
       * bucket.addLifecycleRule({
       *   action: 'setStorageClass',
       *   storageClass: 'COLDLINE',
       *   condition: {
       *     createdBefore: new Date('2018')
       *   }
       * }, function(err, apiResponse) {});
       *
       * //-
       * // Delete objects created before 2016 which have the Coldline storage
       * // class.
       * //-
       * bucket.addLifecycleRule({
       *   action: 'delete',
       *   condition: {
       *     matchesStorageClass: [
       *       'COLDLINE'
       *     ],
       *     createdBefore: new Date('2016')
       *   }
       * }, function(err, apiResponse) {});
       */
  def addLifecycleRule(rule: LifecycleRule, options: AddLifecycleRuleOptions): stdLib.Promise[SetBucketMetadataResponse] = js.native
  def addLifecycleRule(rule: LifecycleRule, options: AddLifecycleRuleOptions, callback: SetBucketMetadataCallback): scala.Unit = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: atGoogleDashCloudStorageLib.buildSrcFileMod.File,
    callback: CombineCallback
  ): scala.Unit = js.native
  /**
       * Combine multiple files into one new file.
       *
       * @see [Objects: compose API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/compose}
       *
       * @throws {Error} if a non-array is provided as sources argument.
       * @throws {Error} if less than two sources are provided.
       * @throws {Error} if no destination is provided.
       *
       * @param {string[]|File[]} sources The source files that will be
       *     combined.
       * @param {string|File} destination The file you would like the
       *     source files combined into.
       * @param {CombineOptions} [options] Configuration options.
       * @param {CombineCallback} [callback] Callback function.
       * @returns {Promise<CombineResponse>}
       *
       * @example
       * const logBucket = storage.bucket('log-bucket');
       *
       * const sources = [
       *   logBucket.file('2013-logs.txt'),
       *   logBucket.file('2014-logs.txt')
       * ];
       *
       * const allLogs = logBucket.file('all-logs.txt');
       *
       * logBucket.combine(sources, allLogs, function(err, newFile, apiResponse) {
       *   // newFile === allLogs
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * logBucket.combine(sources, allLogs).then(function(data) {
       *   const newFile = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: atGoogleDashCloudStorageLib.buildSrcFileMod.File,
    options: CombineOptions
  ): stdLib.Promise[CombineResponse] = js.native
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
  /**
       * Combine multiple files into one new file.
       *
       * @see [Objects: compose API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/compose}
       *
       * @throws {Error} if a non-array is provided as sources argument.
       * @throws {Error} if less than two sources are provided.
       * @throws {Error} if no destination is provided.
       *
       * @param {string[]|File[]} sources The source files that will be
       *     combined.
       * @param {string|File} destination The file you would like the
       *     source files combined into.
       * @param {CombineOptions} [options] Configuration options.
       * @param {CombineCallback} [callback] Callback function.
       * @returns {Promise<CombineResponse>}
       *
       * @example
       * const logBucket = storage.bucket('log-bucket');
       *
       * const sources = [
       *   logBucket.file('2013-logs.txt'),
       *   logBucket.file('2014-logs.txt')
       * ];
       *
       * const allLogs = logBucket.file('all-logs.txt');
       *
       * logBucket.combine(sources, allLogs, function(err, newFile, apiResponse) {
       *   // newFile === allLogs
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * logBucket.combine(sources, allLogs).then(function(data) {
       *   const newFile = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: java.lang.String,
    options: CombineOptions
  ): stdLib.Promise[CombineResponse] = js.native
  def combine(
    sources: js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File | java.lang.String],
    destination: java.lang.String,
    options: CombineOptions,
    callback: CombineCallback
  ): scala.Unit = js.native
  /**
       * Create a channel that will be notified when objects in this bucket changes.
       *
       * @throws {Error} If an ID is not provided.
       * @throws {Error} If an address is not provided.
       *
       * @see [Objects: watchAll API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/watchAll}
       *
       * @param {string} id The ID of the channel to create.
       * @param {CreateChannelConfig} config Configuration for creating channel.
       * @param {CreateChannelOptions} [options] Configuration options.
       * @param {CreateChannelCallback} [callback] Callback function.
       * @returns {Promise<CreateChannelResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       * const id = 'new-channel-id';
       *
       * const config = {
       *   address: 'https://...'
       * };
       *
       * bucket.createChannel(id, config, function(err, channel, apiResponse) {
       *   if (!err) {
       *     // Channel created successfully.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.createChannel(id, config).then(function(data) {
       *   const channel = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def createChannel(id: java.lang.String, config: CreateChannelConfig): stdLib.Promise[CreateChannelResponse] = js.native
  def createChannel(id: java.lang.String, config: CreateChannelConfig, callback: CreateChannelCallback): scala.Unit = js.native
  /**
       * Create a channel that will be notified when objects in this bucket changes.
       *
       * @throws {Error} If an ID is not provided.
       * @throws {Error} If an address is not provided.
       *
       * @see [Objects: watchAll API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/watchAll}
       *
       * @param {string} id The ID of the channel to create.
       * @param {CreateChannelConfig} config Configuration for creating channel.
       * @param {CreateChannelOptions} [options] Configuration options.
       * @param {CreateChannelCallback} [callback] Callback function.
       * @returns {Promise<CreateChannelResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       * const id = 'new-channel-id';
       *
       * const config = {
       *   address: 'https://...'
       * };
       *
       * bucket.createChannel(id, config, function(err, channel, apiResponse) {
       *   if (!err) {
       *     // Channel created successfully.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.createChannel(id, config).then(function(data) {
       *   const channel = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def createChannel(id: java.lang.String, config: CreateChannelConfig, options: CreateChannelOptions): stdLib.Promise[CreateChannelResponse] = js.native
  def createChannel(
    id: java.lang.String,
    config: CreateChannelConfig,
    options: CreateChannelOptions,
    callback: CreateChannelCallback
  ): scala.Unit = js.native
  /**
       * Creates a notification subscription for the bucket.
       *
       * @see [Notifications: insert]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/insert}
       *
       * @param {Topic|string} topic The Cloud PubSub topic to which this
       *     subscription publishes. If the project ID is omitted, the current
       * project ID will be used.
       *
       *     Acceptable formats are:
       *     - `projects/grape-spaceship-123/topics/my-topic`
       *
       *     - `my-topic`
       * @param {CreateNotificationOptions} [options] Metadata to set for the
       *     notification.
       * @param {CreateNotificationCallback} [callback] Callback function.
       * @returns {Promise<CreateNotificationResponse>}
       * @throws {Error} If a valid topic is not provided.
       * @see Notification#create
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const myBucket = storage.bucket('my-bucket');
       *
       * const callback = function(err, notification, apiResponse) {
       *   if (!err) {
       *     // The notification was created successfully.
       *   }
       * };
       *
       * myBucket.createNotification('my-topic', callback);
       *
       * //-
       * // Configure the nofiication by providing Notification metadata.
       * //-
       * const metadata = {
       *   objectNamePrefix: 'prefix-'
       * };
       *
       * myBucket.createNotification('my-topic', metadata, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myBucket.createNotification('my-topic').then(function(data) {
       *   const notification = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/notifications.js</caption>
       * region_tag:storage_create_notification
       * Another example:
       */
  def createNotification(topic: java.lang.String): stdLib.Promise[CreateNotificationResponse] = js.native
  def createNotification(topic: java.lang.String, callback: CreateNotificationCallback): scala.Unit = js.native
  /**
       * Creates a notification subscription for the bucket.
       *
       * @see [Notifications: insert]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/insert}
       *
       * @param {Topic|string} topic The Cloud PubSub topic to which this
       *     subscription publishes. If the project ID is omitted, the current
       * project ID will be used.
       *
       *     Acceptable formats are:
       *     - `projects/grape-spaceship-123/topics/my-topic`
       *
       *     - `my-topic`
       * @param {CreateNotificationOptions} [options] Metadata to set for the
       *     notification.
       * @param {CreateNotificationCallback} [callback] Callback function.
       * @returns {Promise<CreateNotificationResponse>}
       * @throws {Error} If a valid topic is not provided.
       * @see Notification#create
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const myBucket = storage.bucket('my-bucket');
       *
       * const callback = function(err, notification, apiResponse) {
       *   if (!err) {
       *     // The notification was created successfully.
       *   }
       * };
       *
       * myBucket.createNotification('my-topic', callback);
       *
       * //-
       * // Configure the nofiication by providing Notification metadata.
       * //-
       * const metadata = {
       *   objectNamePrefix: 'prefix-'
       * };
       *
       * myBucket.createNotification('my-topic', metadata, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * myBucket.createNotification('my-topic').then(function(data) {
       *   const notification = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/notifications.js</caption>
       * region_tag:storage_create_notification
       * Another example:
       */
  def createNotification(topic: java.lang.String, options: CreateNotificationOptions): stdLib.Promise[CreateNotificationResponse] = js.native
  def createNotification(topic: java.lang.String, options: CreateNotificationOptions, callback: CreateNotificationCallback): scala.Unit = js.native
  def delete(callback: DeleteBucketCallback): scala.Unit = js.native
  /**
       * Delete the bucket.
       *
       * @see [Buckets: delete API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/delete}
       *
       * @param {DeleteBucketOptions} [options] Configuration options.
       * @param {DeleteBucketCallback} [callback] Callback function.
       * @returns {Promise<DeleteBucketResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       * bucket.delete(function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.delete().then(function(data) {
       *   const apiResponse = data[0];
       * });
       *
       * @example <caption>include:samples/buckets.js</caption>
       * region_tag:storage_delete_bucket
       * Another example:
       */
  def delete(options: DeleteBucketOptions): stdLib.Promise[DeleteBucketResponse] = js.native
  def delete(options: DeleteBucketOptions, callback: DeleteBucketCallback): scala.Unit = js.native
  /**
       * Iterate over the bucket's files, calling `file.delete()` on each.
       *
       * <strong>This is not an atomic request.</strong> A delete attempt will be
       * made for each file individually. Any one can fail, in which case only a
       * portion of the files you intended to be deleted would have.
       *
       * Operations are performed in parallel, up to 10 at once. The first error
       * breaks the loop and will execute the provided callback with it. Specify
       * `{ force: true }` to suppress the errors until all files have had a chance
       * to be processed.
       *
       * The `query` object passed as the first argument will also be passed to
       * {@link Bucket#getFiles}.
       *
       * @see [Objects: delete API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/delete}
       *
       * @param {DeleteFilesOptions} [query] Query object. See {@link Bucket#getFiles}
       * @param {DeleteFilesCallback} [callback] Callback function.
       * @returns {Promise}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Delete all of the files in the bucket.
       * //-
       * bucket.deleteFiles(function(err) {});
       *
       * //-
       * // By default, if a file cannot be deleted, this method will stop deleting
       * // files from your bucket. You can override this setting with `force:
       * true`.
       * //-
       * bucket.deleteFiles({
       *   force: true
       * }, function(errors) {
       *   // `errors`:
       *   //    Array of errors if any occurred, otherwise null.
       * });
       *
       * //-
       * // The first argument to this method acts as a query to
       * // {@link Bucket#getFiles}. As an example, you can delete files
       * // which match a prefix.
       * //-
       * bucket.deleteFiles({
       *   prefix: 'images/'
       * }, function(err) {
       *   if (!err) {
       *     // All files in the `images` directory have been deleted.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.deleteFiles().then(function() {});
       */
  def deleteFiles(): stdLib.Promise[scala.Unit] = js.native
  def deleteFiles(callback: DeleteFilesCallback): scala.Unit = js.native
  /**
       * Iterate over the bucket's files, calling `file.delete()` on each.
       *
       * <strong>This is not an atomic request.</strong> A delete attempt will be
       * made for each file individually. Any one can fail, in which case only a
       * portion of the files you intended to be deleted would have.
       *
       * Operations are performed in parallel, up to 10 at once. The first error
       * breaks the loop and will execute the provided callback with it. Specify
       * `{ force: true }` to suppress the errors until all files have had a chance
       * to be processed.
       *
       * The `query` object passed as the first argument will also be passed to
       * {@link Bucket#getFiles}.
       *
       * @see [Objects: delete API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/delete}
       *
       * @param {DeleteFilesOptions} [query] Query object. See {@link Bucket#getFiles}
       * @param {DeleteFilesCallback} [callback] Callback function.
       * @returns {Promise}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Delete all of the files in the bucket.
       * //-
       * bucket.deleteFiles(function(err) {});
       *
       * //-
       * // By default, if a file cannot be deleted, this method will stop deleting
       * // files from your bucket. You can override this setting with `force:
       * true`.
       * //-
       * bucket.deleteFiles({
       *   force: true
       * }, function(errors) {
       *   // `errors`:
       *   //    Array of errors if any occurred, otherwise null.
       * });
       *
       * //-
       * // The first argument to this method acts as a query to
       * // {@link Bucket#getFiles}. As an example, you can delete files
       * // which match a prefix.
       * //-
       * bucket.deleteFiles({
       *   prefix: 'images/'
       * }, function(err) {
       *   if (!err) {
       *     // All files in the `images` directory have been deleted.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.deleteFiles().then(function() {});
       */
  def deleteFiles(query: DeleteFilesOptions): stdLib.Promise[scala.Unit] = js.native
  def deleteFiles(query: DeleteFilesOptions, callback: DeleteFilesCallback): scala.Unit = js.native
  /**
       * Delete one or more labels from this bucket.
       *
       * @param {string|string[]} labels The labels to delete. If no labels are
       *     provided, all of the labels are removed.
       * @param {DeleteLabelsCallback} [callback] Callback function.
       * @returns {Promise<DeleteLabelsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Delete all of the labels from this bucket.
       * //-
       * bucket.deleteLabels(function(err, apiResponse) {});
       *
       * //-
       * // Delete a single label.
       * //-
       * bucket.deleteLabels('labelone', function(err, apiResponse) {});
       *
       * //-
       * // Delete a specific set of labels.
       * //-
       * bucket.deleteLabels([
       *   'labelone',
       *   'labeltwo'
       * ], function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.deleteLabels().then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def deleteLabels(): stdLib.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(callback: DeleteLabelsCallback): scala.Unit = js.native
  /**
       * Delete one or more labels from this bucket.
       *
       * @param {string|string[]} labels The labels to delete. If no labels are
       *     provided, all of the labels are removed.
       * @param {DeleteLabelsCallback} [callback] Callback function.
       * @returns {Promise<DeleteLabelsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Delete all of the labels from this bucket.
       * //-
       * bucket.deleteLabels(function(err, apiResponse) {});
       *
       * //-
       * // Delete a single label.
       * //-
       * bucket.deleteLabels('labelone', function(err, apiResponse) {});
       *
       * //-
       * // Delete a specific set of labels.
       * //-
       * bucket.deleteLabels([
       *   'labelone',
       *   'labeltwo'
       * ], function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.deleteLabels().then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def deleteLabels(labels: java.lang.String): stdLib.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: java.lang.String, callback: DeleteLabelsCallback): scala.Unit = js.native
  /**
       * Delete one or more labels from this bucket.
       *
       * @param {string|string[]} labels The labels to delete. If no labels are
       *     provided, all of the labels are removed.
       * @param {DeleteLabelsCallback} [callback] Callback function.
       * @returns {Promise<DeleteLabelsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Delete all of the labels from this bucket.
       * //-
       * bucket.deleteLabels(function(err, apiResponse) {});
       *
       * //-
       * // Delete a single label.
       * //-
       * bucket.deleteLabels('labelone', function(err, apiResponse) {});
       *
       * //-
       * // Delete a specific set of labels.
       * //-
       * bucket.deleteLabels([
       *   'labelone',
       *   'labeltwo'
       * ], function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.deleteLabels().then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def deleteLabels(labels: js.Array[java.lang.String]): stdLib.Promise[DeleteLabelsResponse] = js.native
  def deleteLabels(labels: js.Array[java.lang.String], callback: DeleteLabelsCallback): scala.Unit = js.native
  /**
       * <div class="notice">
       *   <strong>Early Access Testers Only</strong>
       *   <p>
       *     This feature is not yet widely-available.
       *   </p>
       * </div>
       *
       * Disable `requesterPays` functionality from this bucket.
       *
       * @param {DisableRequesterPaysCallback} [callback] Callback function.
       * @returns {Promise<DisableRequesterPaysCallback>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.disableRequesterPays(function(err, apiResponse) {
       *   if (!err) {
       *     // requesterPays functionality disabled successfully.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.disableRequesterPays().then(function(data) {
       *   const apiResponse = data[0];
       * });
       *
       * @example <caption>include:samples/requesterPays.js</caption>
       * region_tag:storage_disable_requester_pays
       * Example of disabling requester pays:
       */
  def disableRequesterPays(): stdLib.Promise[DisableRequesterPaysResponse] = js.native
  def disableRequesterPays(callback: DisableRequesterPaysCallback): scala.Unit = js.native
  /**
       * <div class="notice">
       *   <strong>Early Access Testers Only</strong>
       *   <p>
       *     This feature is not yet widely-available.
       *   </p>
       * </div>
       *
       * Enable `requesterPays` functionality for this bucket. This enables you, the
       * bucket owner, to have the requesting user assume the charges for the access
       * to your bucket and its contents.
       *
       * @param {EnableRequesterPaysCallback} [callback] Callback function.
       * @returns {Promise<EnableRequesterPaysResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.enableRequesterPays(function(err, apiResponse) {
       *   if (!err) {
       *     // requesterPays functionality enabled successfully.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.enableRequesterPays().then(function(data) {
       *   const apiResponse = data[0];
       * });
       *
       * @example <caption>include:samples/requesterPays.js</caption>
       * region_tag:storage_enable_requester_pays
       * Example of enabling requester pays:
       */
  def enableRequesterPays(): stdLib.Promise[EnableRequesterPaysResponse] = js.native
  def enableRequesterPays(callback: EnableRequesterPaysCallback): scala.Unit = js.native
  /**
       * Check if the bucket exists.
       *
       * @param {BucketExistsOptions} [options] Configuration options.
       * @param {BucketExistsCallback} [callback] Callback function.
       * @returns {Promise<BucketExistsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.exists(function(err, exists) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.exists().then(function(data) {
       *   const exists = data[0];
       * });
       */
  def exists(options: BucketExistsOptions): stdLib.Promise[BucketExistsResponse] = js.native
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
  def file(name: java.lang.String, options: atGoogleDashCloudStorageLib.buildSrcFileMod.FileOptions): atGoogleDashCloudStorageLib.buildSrcFileMod.File = js.native
  def get(callback: GetBucketCallback): scala.Unit = js.native
  /**
       * Get a bucket if it exists.
       *
       * You may optionally use this to "get or create" an object by providing an
       * object with `autoCreate` set to `true`. Any extra configuration that is
       * normally required for the `create` method must be contained within this
       * object as well.
       *
       * @param {GetBucketOptions} [options] Configuration options.
       * @param {GetBucketCallback} [callback] Callback function.
       * @returns {Promise<GetBucketResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.get(function(err, bucket, apiResponse) {
       *   // `bucket.metadata` has been populated.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.get().then(function(data) {
       *   const bucket = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def get(options: GetBucketOptions): stdLib.Promise[GetBucketResponse] = js.native
  def get(options: GetBucketOptions, callback: GetBucketCallback): scala.Unit = js.native
  /**
       * @typedef {array} GetFilesResponse
       * @property {File[]} 0 Array of {@link File} instances.
       */
  /**
       * Get {@link File} objects for the files currently in the bucket.
       *
       * @see [Objects: list API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/list}
       *
       * @param {GetFilesOptions} [query] Query object for listing files.
       * @param {GetFilesCallback} [callback] Callback function.
       * @returns {Promise<GetFilesResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.getFiles(function(err, files) {
       *   if (!err) {
       *     // files is an array of File objects.
       *   }
       * });
       *
       * //-
       * // If your bucket has versioning enabled, you can get all of your files
       * // scoped to their generation.
       * //-
       * bucket.getFiles({
       *   versions: true
       * }, function(err, files) {
       *   // Each file is scoped to its generation.
       * });
       *
       * //-
       * // To control how many API requests are made and page through the results
       * // manually, set `autoPaginate` to `false`.
       * //-
       * const callback = function(err, files, nextQuery, apiResponse) {
       *   if (nextQuery) {
       *     // More results exist.
       *     bucket.getFiles(nextQuery, callback);
       *   }
       *
       *   // The `metadata` property is populated for you with the metadata at the
       *   // time of fetching.
       *   files[0].metadata;
       *
       *   // However, in cases where you are concerned the metadata could have
       *   // changed, use the `getMetadata` method.
       *   files[0].getMetadata(function(err, metadata) {});
       * };
       *
       * bucket.getFiles({
       *   autoPaginate: false
       * }, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.getFiles().then(function(data) {
       *   const files = data[0];
       * });
       *
       * @example <caption>include:samples/files.js</caption>
       * region_tag:storage_list_files
       * Another example:
       *
       * @example <caption>include:samples/files.js</caption>
       * region_tag:storage_list_files_with_prefix
       * Example of listing files, filtered by a prefix:
       */
  def getFiles(): stdLib.Promise[js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]] = js.native
  def getFiles(callback: GetFilesCallback): scala.Unit = js.native
  /**
       * @typedef {array} GetFilesResponse
       * @property {File[]} 0 Array of {@link File} instances.
       */
  /**
       * Get {@link File} objects for the files currently in the bucket.
       *
       * @see [Objects: list API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/list}
       *
       * @param {GetFilesOptions} [query] Query object for listing files.
       * @param {GetFilesCallback} [callback] Callback function.
       * @returns {Promise<GetFilesResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.getFiles(function(err, files) {
       *   if (!err) {
       *     // files is an array of File objects.
       *   }
       * });
       *
       * //-
       * // If your bucket has versioning enabled, you can get all of your files
       * // scoped to their generation.
       * //-
       * bucket.getFiles({
       *   versions: true
       * }, function(err, files) {
       *   // Each file is scoped to its generation.
       * });
       *
       * //-
       * // To control how many API requests are made and page through the results
       * // manually, set `autoPaginate` to `false`.
       * //-
       * const callback = function(err, files, nextQuery, apiResponse) {
       *   if (nextQuery) {
       *     // More results exist.
       *     bucket.getFiles(nextQuery, callback);
       *   }
       *
       *   // The `metadata` property is populated for you with the metadata at the
       *   // time of fetching.
       *   files[0].metadata;
       *
       *   // However, in cases where you are concerned the metadata could have
       *   // changed, use the `getMetadata` method.
       *   files[0].getMetadata(function(err, metadata) {});
       * };
       *
       * bucket.getFiles({
       *   autoPaginate: false
       * }, callback);
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.getFiles().then(function(data) {
       *   const files = data[0];
       * });
       *
       * @example <caption>include:samples/files.js</caption>
       * region_tag:storage_list_files
       * Another example:
       *
       * @example <caption>include:samples/files.js</caption>
       * region_tag:storage_list_files_with_prefix
       * Example of listing files, filtered by a prefix:
       */
  def getFiles(query: GetFilesOptions): stdLib.Promise[js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]] = js.native
  def getFiles(query: GetFilesOptions, callback: GetFilesCallback): scala.Unit = js.native
  def getId(): java.lang.String = js.native
  def getLabels(callback: GetLabelsCallback): scala.Unit = js.native
  /**
       * Get the labels currently set on this bucket.
       *
       * @param {object} [options] Configuration options.
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {GetLabelsCallback} [callback] Callback function.
       * @returns {Promise<GetLabelsCallback>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.getLabels(function(err, labels) {
       *   if (err) {
       *     // Error handling omitted.
       *   }
       *
       *   // labels = {
       *   //   label: 'labelValue',
       *   //   ...
       *   // }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.getLabels().then(function(data) {
       *   const labels = data[0];
       * });
       */
  def getLabels(options: GetLabelsOptions): stdLib.Promise[GetLabelsResponse] = js.native
  def getLabels(options: GetLabelsOptions, callback: GetLabelsCallback): scala.Unit = js.native
  /**
       * Get the bucket's metadata.
       *
       * To set metadata, see {@link Bucket#setMetadata}.
       *
       * @see [Buckets: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/get}
       *
       * @param {GetBucketMetadataOptions} [options] Configuration options.
       * @param {GetBucketMetadataCallback} [callback] Callback function.
       * @returns {Promise<GetBucketMetadataResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.getMetadata(function(err, metadata, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.getMetadata().then(function(data) {
       *   const metadata = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/requesterPays.js</caption>
       * region_tag:storage_get_requester_pays_status
       * Example of retrieving the requester pays status of a bucket:
       */
  def getMetadata(options: GetBucketMetadataOptions): stdLib.Promise[GetBucketMetadataResponse] = js.native
  def getMetadata(options: GetBucketMetadataOptions, callback: GetBucketMetadataCallback): scala.Unit = js.native
  /**
       * Retrieves a list of notification subscriptions for a given bucket.
       *
       * @see [Notifications: list]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/list}
       *
       * @param {GetNotificationsOptions} [options] Configuration options.
       * @param {GetNotificationsCallback} [callback] Callback function.
       * @returns {Promise<GetNotificationsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * bucket.getNotifications(function(err, notifications, apiResponse) {
       *   if (!err) {
       *     // notifications is an array of Notification objects.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.getNotifications().then(function(data) {
       *   const notifications = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/notifications.js</caption>
       * region_tag:storage_list_notifications
       * Another example:
       */
  def getNotifications(): stdLib.Promise[GetNotificationsResponse] = js.native
  def getNotifications(callback: GetNotificationsCallback): scala.Unit = js.native
  /**
       * Retrieves a list of notification subscriptions for a given bucket.
       *
       * @see [Notifications: list]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/list}
       *
       * @param {GetNotificationsOptions} [options] Configuration options.
       * @param {GetNotificationsCallback} [callback] Callback function.
       * @returns {Promise<GetNotificationsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('my-bucket');
       *
       * bucket.getNotifications(function(err, notifications, apiResponse) {
       *   if (!err) {
       *     // notifications is an array of Notification objects.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.getNotifications().then(function(data) {
       *   const notifications = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/notifications.js</caption>
       * region_tag:storage_list_notifications
       * Another example:
       */
  def getNotifications(options: GetNotificationsOptions): stdLib.Promise[GetNotificationsResponse] = js.native
  def getNotifications(options: GetNotificationsOptions, callback: GetNotificationsCallback): scala.Unit = js.native
  /**
       * Lock a previously-defined retention policy. This will prevent changes to
       * the policy.
       *
       * @throws {Error} if a metageneration is not provided.
       *
       * @param {Number|String} metageneration The bucket's metageneration. This is
       *     accesssible from calling {@link File#getMetadata}.
       * @param {BucketLockCallback} [callback] Callback function.
       * @returns {Promise<BucketLockResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const bucket = storage.bucket('albums');
       *
       * const metageneration = 2;
       *
       * bucket.lock(metageneration, function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.lock(metageneration).then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def lock(metageneration: java.lang.String): stdLib.Promise[BucketLockResponse] = js.native
  def lock(metageneration: java.lang.String, callback: BucketLockCallback): scala.Unit = js.native
  /**
       * Lock a previously-defined retention policy. This will prevent changes to
       * the policy.
       *
       * @throws {Error} if a metageneration is not provided.
       *
       * @param {Number|String} metageneration The bucket's metageneration. This is
       *     accesssible from calling {@link File#getMetadata}.
       * @param {BucketLockCallback} [callback] Callback function.
       * @returns {Promise<BucketLockResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const bucket = storage.bucket('albums');
       *
       * const metageneration = 2;
       *
       * bucket.lock(metageneration, function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.lock(metageneration).then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def lock(metageneration: scala.Double): stdLib.Promise[BucketLockResponse] = js.native
  def lock(metageneration: scala.Double, callback: BucketLockCallback): scala.Unit = js.native
  /**
       * Iterate over all of a bucket's files, calling `file.makePublic()` (public)
       * or `file.makePrivate()` (private) on each.
       *
       * Operations are performed in parallel, up to 10 at once. The first error
       * breaks the loop, and will execute the provided callback with it. Specify
       * `{ force: true }` to suppress the errors.
       *
       * @private
       *
       * @param {MakeAllFilesPublicPrivateOptions} [options] Configuration options.
       * @param {MakeAllFilesPublicPrivateCallback} callback Callback function.
       *
       * @return {Promise<MakeAllFilesPublicPrivateResponse>}
       */
  def `makeAllFilesPublicPrivate_`(): stdLib.Promise[MakeAllFilesPublicPrivateResponse] = js.native
  def `makeAllFilesPublicPrivate_`(callback: MakeAllFilesPublicPrivateCallback): scala.Unit = js.native
  /**
       * Iterate over all of a bucket's files, calling `file.makePublic()` (public)
       * or `file.makePrivate()` (private) on each.
       *
       * Operations are performed in parallel, up to 10 at once. The first error
       * breaks the loop, and will execute the provided callback with it. Specify
       * `{ force: true }` to suppress the errors.
       *
       * @private
       *
       * @param {MakeAllFilesPublicPrivateOptions} [options] Configuration options.
       * @param {MakeAllFilesPublicPrivateCallback} callback Callback function.
       *
       * @return {Promise<MakeAllFilesPublicPrivateResponse>}
       */
  def `makeAllFilesPublicPrivate_`(options: MakeAllFilesPublicPrivateOptions): stdLib.Promise[MakeAllFilesPublicPrivateResponse] = js.native
  def `makeAllFilesPublicPrivate_`(options: MakeAllFilesPublicPrivateOptions, callback: MakeAllFilesPublicPrivateCallback): scala.Unit = js.native
  /**
       * Make the bucket listing private.
       *
       * You may also choose to make the contents of the bucket private by
       * specifying `includeFiles: true`. This will automatically run
       * {@link File#makePrivate} for every file in the bucket.
       *
       * When specifying `includeFiles: true`, use `force: true` to delay execution
       * of your callback until all files have been processed. By default, the
       * callback is executed after the first error. Use `force` to queue such
       * errors until all files have been processed, after which they will be
       * returned as an array as the first argument to your callback.
       *
       * NOTE: This may cause the process to be long-running and use a high number
       * of requests. Use with caution.
       *
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {MakeBucketPrivateOptions} [options] Configuration options.
       * @param {MakeBucketPrivateCallback} [callback] Callback function.
       * @returns {Promise<MakeBucketPrivateResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Make the bucket private.
       * //-
       * bucket.makePrivate(function(err) {});
       *
       * //-
       * // Make the bucket and its contents private.
       * //-
       * const opts = {
       *   includeFiles: true
       * };
       *
       * bucket.makePrivate(opts, function(err, files) {
       *   // `err`:
       *   //    The first error to occur, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made private in the bucket.
       * });
       *
       * //-
       * // Make the bucket and its contents private, using force to suppress errors
       * // until all files have been processed.
       * //-
       * const opts = {
       *   includeFiles: true,
       *   force: true
       * };
       *
       * bucket.makePrivate(opts, function(errors, files) {
       *   // `errors`:
       *   //    Array of errors if any occurred, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made private in the bucket.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.makePrivate(opts).then(function(data) {
       *   const files = data[0];
       * });
       */
  def makePrivate(): stdLib.Promise[MakeBucketPrivateResponse] = js.native
  def makePrivate(callback: MakeBucketPrivateCallback): scala.Unit = js.native
  /**
       * Make the bucket listing private.
       *
       * You may also choose to make the contents of the bucket private by
       * specifying `includeFiles: true`. This will automatically run
       * {@link File#makePrivate} for every file in the bucket.
       *
       * When specifying `includeFiles: true`, use `force: true` to delay execution
       * of your callback until all files have been processed. By default, the
       * callback is executed after the first error. Use `force` to queue such
       * errors until all files have been processed, after which they will be
       * returned as an array as the first argument to your callback.
       *
       * NOTE: This may cause the process to be long-running and use a high number
       * of requests. Use with caution.
       *
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {MakeBucketPrivateOptions} [options] Configuration options.
       * @param {MakeBucketPrivateCallback} [callback] Callback function.
       * @returns {Promise<MakeBucketPrivateResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Make the bucket private.
       * //-
       * bucket.makePrivate(function(err) {});
       *
       * //-
       * // Make the bucket and its contents private.
       * //-
       * const opts = {
       *   includeFiles: true
       * };
       *
       * bucket.makePrivate(opts, function(err, files) {
       *   // `err`:
       *   //    The first error to occur, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made private in the bucket.
       * });
       *
       * //-
       * // Make the bucket and its contents private, using force to suppress errors
       * // until all files have been processed.
       * //-
       * const opts = {
       *   includeFiles: true,
       *   force: true
       * };
       *
       * bucket.makePrivate(opts, function(errors, files) {
       *   // `errors`:
       *   //    Array of errors if any occurred, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made private in the bucket.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.makePrivate(opts).then(function(data) {
       *   const files = data[0];
       * });
       */
  def makePrivate(options: MakeBucketPrivateOptions): stdLib.Promise[MakeBucketPrivateResponse] = js.native
  def makePrivate(options: MakeBucketPrivateOptions, callback: MakeBucketPrivateCallback): scala.Unit = js.native
  /**
       * Make the bucket publicly readable.
       *
       * You may also choose to make the contents of the bucket publicly readable by
       * specifying `includeFiles: true`. This will automatically run
       * {@link File#makePublic} for every file in the bucket.
       *
       * When specifying `includeFiles: true`, use `force: true` to delay execution
       * of your callback until all files have been processed. By default, the
       * callback is executed after the first error. Use `force` to queue such
       * errors until all files have been processed, after which they will be
       * returned as an array as the first argument to your callback.
       *
       * NOTE: This may cause the process to be long-running and use a high number
       * of requests. Use with caution.
       *
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {MakeBucketPublicOptions} [options] Configuration options.
       * @param {MakeBucketPublicCallback} [callback] Callback function.
       * @returns {Promise<MakeBucketPublicResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Make the bucket publicly readable.
       * //-
       * bucket.makePublic(function(err) {});
       *
       * //-
       * // Make the bucket and its contents publicly readable.
       * //-
       * const opts = {
       *   includeFiles: true
       * };
       *
       * bucket.makePublic(opts, function(err, files) {
       *   // `err`:
       *   //    The first error to occur, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made public in the bucket.
       * });
       *
       * //-
       * // Make the bucket and its contents publicly readable, using force to
       * // suppress errors until all files have been processed.
       * //-
       * const opts = {
       *   includeFiles: true,
       *   force: true
       * };
       *
       * bucket.makePublic(opts, function(errors, files) {
       *   // `errors`:
       *   //    Array of errors if any occurred, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made public in the bucket.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.makePublic(opts).then(function(data) {
       *   const files = data[0];
       * });
       */
  def makePublic(): stdLib.Promise[MakeBucketPublicResponse] = js.native
  def makePublic(callback: MakeBucketPublicCallback): scala.Unit = js.native
  /**
       * Make the bucket publicly readable.
       *
       * You may also choose to make the contents of the bucket publicly readable by
       * specifying `includeFiles: true`. This will automatically run
       * {@link File#makePublic} for every file in the bucket.
       *
       * When specifying `includeFiles: true`, use `force: true` to delay execution
       * of your callback until all files have been processed. By default, the
       * callback is executed after the first error. Use `force` to queue such
       * errors until all files have been processed, after which they will be
       * returned as an array as the first argument to your callback.
       *
       * NOTE: This may cause the process to be long-running and use a high number
       * of requests. Use with caution.
       *
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {MakeBucketPublicOptions} [options] Configuration options.
       * @param {MakeBucketPublicCallback} [callback] Callback function.
       * @returns {Promise<MakeBucketPublicResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Make the bucket publicly readable.
       * //-
       * bucket.makePublic(function(err) {});
       *
       * //-
       * // Make the bucket and its contents publicly readable.
       * //-
       * const opts = {
       *   includeFiles: true
       * };
       *
       * bucket.makePublic(opts, function(err, files) {
       *   // `err`:
       *   //    The first error to occur, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made public in the bucket.
       * });
       *
       * //-
       * // Make the bucket and its contents publicly readable, using force to
       * // suppress errors until all files have been processed.
       * //-
       * const opts = {
       *   includeFiles: true,
       *   force: true
       * };
       *
       * bucket.makePublic(opts, function(errors, files) {
       *   // `errors`:
       *   //    Array of errors if any occurred, otherwise null.
       *   //
       *   // `files`:
       *   //    Array of files successfully made public in the bucket.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.makePublic(opts).then(function(data) {
       *   const files = data[0];
       * });
       */
  def makePublic(options: MakeBucketPublicOptions): stdLib.Promise[MakeBucketPublicResponse] = js.native
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
  /**
       * Remove an already-existing retention policy from this bucket, if it is not
       * locked.
       *
       * @param {SetBucketMetadataCallback} [callback] Callback function.
       * @returns {Promise<SetBucketMetadataResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const bucket = storage.bucket('albums');
       *
       * bucket.removeRetentionPeriod(function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.removeRetentionPeriod().then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def removeRetentionPeriod(): stdLib.Promise[SetBucketMetadataResponse] = js.native
  def removeRetentionPeriod(callback: SetBucketMetadataCallback): scala.Unit = js.native
  def setLabels(labels: Labels, callback: SetLabelsCallback): scala.Unit = js.native
  /**
       * Set labels on the bucket.
       *
       * This makes an underlying call to {@link Bucket#setMetadata}, which
       * is a PATCH request. This means an individual label can be overwritten, but
       * unmentioned labels will not be touched.
       *
       * @param {object<string, string>} labels Labels to set on the bucket.
       * @param {object} [options] Configuration options.
       * @param {SetLabelsCallback} [callback] Callback function.
       * @returns {Promise<SetLabelsResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * const labels = {
       *   labelone: 'labelonevalue',
       *   labeltwo: 'labeltwovalue'
       * };
       *
       * bucket.setLabels(labels, function(err, metadata) {
       *   if (!err) {
       *     // Labels set successfully.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.setLabels(labels).then(function(data) {
       *   const metadata = data[0];
       * });
       */
  def setLabels(labels: Labels, options: SetLabelsOptions): stdLib.Promise[SetLabelsResponse] = js.native
  def setLabels(labels: Labels, options: SetLabelsOptions, callback: SetLabelsCallback): scala.Unit = js.native
  /**
       * Set the bucket's metadata.
       *
       * @see [Buckets: patch API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/buckets/patch}
       *
       * @param {object<string, *>} metadata The metadata you wish to set.
       * @param {SetBucketMetadataOptions} [options] Configuration options.
       * @param {SetBucketMetadataCallback} [callback] Callback function.
       * @returns {Promise<SetBucketMetadataResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Set website metadata field on the bucket.
       * //-
       * const metadata = {
       *   website: {
       *     mainPageSuffix: 'http://example.com',
       *     notFoundPage: 'http://example.com/404.html'
       *   }
       * };
       *
       * bucket.setMetadata(metadata, function(err, apiResponse) {});
       *
       * //-
       * // Enable versioning for your bucket.
       * //-
       * bucket.setMetadata({
       *   versioning: {
       *     enabled: true
       *   }
       * }, function(err, apiResponse) {});
       *
       * //-
       * // Enable KMS encryption for objects within this bucket.
       * //-
       * bucket.setMetadata({
       *   encryption: {
       *     defaultKmsKeyName: 'projects/grape-spaceship-123/...'
       *   }
       * }, function(err, apiResponse) {});
       *
       * //-
       * // Set the default event-based hold value for new objects in this bucket.
       * //-
       * bucket.setMetadata({
       *   defaultEventBasedHold: true
       * }, function(err, apiResponse) {});
       *
       * //-
       * // Remove object lifecycle rules.
       * //-
       * bucket.setMetadata({
       *   lifecycle: null
       * }, function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.setMetadata(metadata).then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def setMetadata(
    metadata: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata,
    options: SetBucketMetadataOptions
  ): stdLib.Promise[SetBucketMetadataResponse] = js.native
  def setMetadata(
    metadata: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata,
    options: SetBucketMetadataOptions,
    callback: SetBucketMetadataCallback
  ): scala.Unit = js.native
  /**
       * Lock all objects contained in the bucket, based on their creation time. Any
       * attempt to overwrite or delete objects younger than the retention period
       * will result in a `PERMISSION_DENIED` error.
       *
       * An unlocked retention policy can be modified or removed from the bucket via
       * {@link File#removeRetentionPeriod} and {@link File#setRetentionPeriod}. A
       * locked retention policy cannot be removed or shortened in duration for the
       * lifetime of the bucket. Attempting to remove or decrease period of a locked
       * retention policy will result in a `PERMISSION_DENIED` error. You can still
       * increase the policy.
       *
       * @param {*} duration In seconds, the minimum retention time for all objects
       *     contained in this bucket.
       * @param {SetBucketMetadataCallback} [callback] Callback function.
       * @returns {Promise<SetBucketMetadataResponse>}
       *
       * @example
       * const storage = require('@google-cloud/storage')();
       * const bucket = storage.bucket('albums');
       *
       * const DURATION_SECONDS = 15780000; // 6 months.
       *
       * //-
       * // Lock the objects in this bucket for 6 months.
       * //-
       * bucket.setRetentionPeriod(DURATION_SECONDS, function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.setRetentionPeriod(DURATION_SECONDS).then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def setRetentionPeriod(duration: scala.Double): stdLib.Promise[SetBucketMetadataResponse] = js.native
  def setRetentionPeriod(duration: scala.Double, callback: SetBucketMetadataCallback): scala.Unit = js.native
  def setStorageClass(storageClass: java.lang.String, callback: SetBucketStorageClassCallback): scala.Unit = js.native
  /**
       * Set the default storage class for new files in this bucket.
       *
       * @see [Storage Classes]{@link https://cloud.google.com/storage/docs/storage-classes}
       *
       * @param {string} storageClass The new storage class. (`multi_regional`,
       *     `regional`, `standard`, `nearline`, `coldline`, or
       *     `durable_reduced_availability`)
       * @param {object} [options] Configuration options.
       * @param {string} [options.userProject] - The ID of the project which will be
       *     billed for the request.
       * @param {SetStorageClassCallback} [callback] Callback function.
       * @returns {Promise}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * bucket.setStorageClass('regional', function(err, apiResponse) {
       *   if (err) {
       *     // Error handling omitted.
       *   }
       *
       *   // The storage class was updated successfully.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.setStorageClass('regional').then(function() {});
       */
  def setStorageClass(storageClass: java.lang.String, options: SetBucketStorageClassOptions): stdLib.Promise[SetBucketMetadataResponse] = js.native
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
  /**
       * Upload a file to the bucket. This is a convenience method that wraps
       * {@link File#createWriteStream}.
       *
       * You can specify whether or not an upload is resumable by setting
       * `options.resumable`. *Resumable uploads are enabled by default if your
       * input file is larger than 5 MB.*
       *
       * For faster crc32c computation, you must manually install
       * [`fast-crc32c`](http://www.gitnpm.com/fast-crc32c):
       *
       *     $ npm install --save fast-crc32c
       *
       * @see [Upload Options (Simple or Resumable)]{@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload#uploads}
       * @see [Objects: insert API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/insert}
       *
       * @param {string} pathString The fully qualified path to the file you
       *     wish to upload to your bucket.
       * @param {UploadOptions} [options] Configuration options.
       * @param {UploadCallback} [callback] Callback function.
       * @returns {Promise<UploadResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Upload a file from a local path.
       * //-
       * bucket.upload('/local/path/image.png', function(err, file, apiResponse) {
       *   // Your bucket now contains:
       *   // - "image.png" (with the contents of `/local/path/image.png')
       *
       *   // `file` is an instance of a File object that refers to your new file.
       * });
       *
       *
       * //-
       * // It's not always that easy. You will likely want to specify the filename
       * // used when your new file lands in your bucket.
       * //
       * // You may also want to set metadata or customize other options.
       * //-
       * const options = {
       *   destination: 'new-image.png',
       *   resumable: true,
       *   validation: 'crc32c',
       *   metadata: {
       *     metadata: {
       *       event: 'Fall trip to the zoo'
       *     }
       *   }
       * };
       *
       * bucket.upload('local-image.png', options, function(err, file) {
       *   // Your bucket now contains:
       *   // - "new-image.png" (with the contents of `local-image.png')
       *
       *   // `file` is an instance of a File object that refers to your new file.
       * });
       *
       * //-
       * // You can also have a file gzip'd on the fly.
       * //-
       * bucket.upload('index.html', { gzip: true }, function(err, file) {
       *   // Your bucket now contains:
       *   // - "index.html" (automatically compressed with gzip)
       *
       *   // Downloading the file with `file.download` will automatically decode
       * the
       *   // file.
       * });
       *
       * //-
       * // You may also re-use a File object, {File}, that references
       * // the file you wish to create or overwrite.
       * //-
       * const options = {
       *   destination: bucket.file('existing-file.png'),
       *   resumable: false
       * };
       *
       * bucket.upload('local-img.png', options, function(err, newFile) {
       *   // Your bucket now contains:
       *   // - "existing-file.png" (with the contents of `local-img.png')
       *
       *   // Note:
       *   // The `newFile` parameter is equal to `file`.
       * });
       *
       * //-
       * // To use
       * // <a
       * href="https://cloud.google.com/storage/docs/encryption#customer-supplied">
       * // Customer-supplied Encryption Keys</a>, provide the `encryptionKey`
       * option.
       * //-
       * const crypto = require('crypto');
       * const encryptionKey = crypto.randomBytes(32);
       *
       * bucket.upload('img.png', {
       *   encryptionKey: encryptionKey
       * }, function(err, newFile) {
       *   // `img.png` was uploaded with your custom encryption key.
       *
       *   // `newFile` is already configured to use the encryption key when making
       *   // operations on the remote object.
       *
       *   // However, to use your encryption key later, you must create a `File`
       *   // instance with the `key` supplied:
       *   const file = bucket.file('img.png', {
       *     encryptionKey: encryptionKey
       *   });
       *
       *   // Or with `file#setEncryptionKey`:
       *   const file = bucket.file('img.png');
       *   file.setEncryptionKey(encryptionKey);
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.upload('local-image.png').then(function(data) {
       *   const file = data[0];
       * });
       *
       * To upload a file from a URL, use {@link File#createWriteStream}.
       *
       * @example <caption>include:samples/files.js</caption>
       * region_tag:storage_upload_file
       * Another example:
       *
       * @example <caption>include:samples/encryption.js</caption>
       * region_tag:storage_upload_encrypted_file
       * Example of uploading an encrypted file:
       */
  def upload(pathString: java.lang.String): stdLib.Promise[UploadResponse] = js.native
  def upload(pathString: java.lang.String, callback: UploadCallback): scala.Unit = js.native
  /**
       * Upload a file to the bucket. This is a convenience method that wraps
       * {@link File#createWriteStream}.
       *
       * You can specify whether or not an upload is resumable by setting
       * `options.resumable`. *Resumable uploads are enabled by default if your
       * input file is larger than 5 MB.*
       *
       * For faster crc32c computation, you must manually install
       * [`fast-crc32c`](http://www.gitnpm.com/fast-crc32c):
       *
       *     $ npm install --save fast-crc32c
       *
       * @see [Upload Options (Simple or Resumable)]{@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload#uploads}
       * @see [Objects: insert API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/insert}
       *
       * @param {string} pathString The fully qualified path to the file you
       *     wish to upload to your bucket.
       * @param {UploadOptions} [options] Configuration options.
       * @param {UploadCallback} [callback] Callback function.
       * @returns {Promise<UploadResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const bucket = storage.bucket('albums');
       *
       * //-
       * // Upload a file from a local path.
       * //-
       * bucket.upload('/local/path/image.png', function(err, file, apiResponse) {
       *   // Your bucket now contains:
       *   // - "image.png" (with the contents of `/local/path/image.png')
       *
       *   // `file` is an instance of a File object that refers to your new file.
       * });
       *
       *
       * //-
       * // It's not always that easy. You will likely want to specify the filename
       * // used when your new file lands in your bucket.
       * //
       * // You may also want to set metadata or customize other options.
       * //-
       * const options = {
       *   destination: 'new-image.png',
       *   resumable: true,
       *   validation: 'crc32c',
       *   metadata: {
       *     metadata: {
       *       event: 'Fall trip to the zoo'
       *     }
       *   }
       * };
       *
       * bucket.upload('local-image.png', options, function(err, file) {
       *   // Your bucket now contains:
       *   // - "new-image.png" (with the contents of `local-image.png')
       *
       *   // `file` is an instance of a File object that refers to your new file.
       * });
       *
       * //-
       * // You can also have a file gzip'd on the fly.
       * //-
       * bucket.upload('index.html', { gzip: true }, function(err, file) {
       *   // Your bucket now contains:
       *   // - "index.html" (automatically compressed with gzip)
       *
       *   // Downloading the file with `file.download` will automatically decode
       * the
       *   // file.
       * });
       *
       * //-
       * // You may also re-use a File object, {File}, that references
       * // the file you wish to create or overwrite.
       * //-
       * const options = {
       *   destination: bucket.file('existing-file.png'),
       *   resumable: false
       * };
       *
       * bucket.upload('local-img.png', options, function(err, newFile) {
       *   // Your bucket now contains:
       *   // - "existing-file.png" (with the contents of `local-img.png')
       *
       *   // Note:
       *   // The `newFile` parameter is equal to `file`.
       * });
       *
       * //-
       * // To use
       * // <a
       * href="https://cloud.google.com/storage/docs/encryption#customer-supplied">
       * // Customer-supplied Encryption Keys</a>, provide the `encryptionKey`
       * option.
       * //-
       * const crypto = require('crypto');
       * const encryptionKey = crypto.randomBytes(32);
       *
       * bucket.upload('img.png', {
       *   encryptionKey: encryptionKey
       * }, function(err, newFile) {
       *   // `img.png` was uploaded with your custom encryption key.
       *
       *   // `newFile` is already configured to use the encryption key when making
       *   // operations on the remote object.
       *
       *   // However, to use your encryption key later, you must create a `File`
       *   // instance with the `key` supplied:
       *   const file = bucket.file('img.png', {
       *     encryptionKey: encryptionKey
       *   });
       *
       *   // Or with `file#setEncryptionKey`:
       *   const file = bucket.file('img.png');
       *   file.setEncryptionKey(encryptionKey);
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * bucket.upload('local-image.png').then(function(data) {
       *   const file = data[0];
       * });
       *
       * To upload a file from a URL, use {@link File#createWriteStream}.
       *
       * @example <caption>include:samples/files.js</caption>
       * region_tag:storage_upload_file
       * Another example:
       *
       * @example <caption>include:samples/encryption.js</caption>
       * region_tag:storage_upload_encrypted_file
       * Example of uploading an encrypted file:
       */
  def upload(pathString: java.lang.String, options: UploadOptions): stdLib.Promise[UploadResponse] = js.native
  def upload(pathString: java.lang.String, options: UploadOptions, callback: UploadCallback): scala.Unit = js.native
}

