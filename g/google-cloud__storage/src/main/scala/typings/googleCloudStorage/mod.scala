package typings.googleCloudStorage

import org.scalablytyped.runtime.Instantiable3
import typings.googleCloudStorage.anon.OWNERROLE
import typings.googleCloudStorage.anon.PartialHashStreamValidato
import typings.googleCloudStorage.crc32cMod.CRC32CValidator
import typings.googleCloudStorage.crc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.fileMod.FileOptions
import typings.googleCloudStorage.hmacKeyMod.HmacKeyOptions
import typings.googleCloudStorage.storageMod.BucketOptions
import typings.googleCloudStorage.storageMod.StorageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("@google-cloud/storage", "Bucket")
  @js.native
  open class Bucket protected ()
    extends typings.googleCloudStorage.bucketMod.Bucket {
    def this(storage: typings.googleCloudStorage.storageMod.Storage, name: String) = this()
    def this(storage: typings.googleCloudStorage.storageMod.Storage, name: String, options: BucketOptions) = this()
  }
  
  @JSImport("@google-cloud/storage", "CRC32C")
  @js.native
  /**
    * Constructs a new `CRC32C` object.
    *
    * Reconstruction is recommended via the `CRC32C.from` static method.
    *
    * @param initialValue An initial CRC32C value - a signed 32-bit integer.
    */
  open class CRC32C ()
    extends typings.googleCloudStorage.crc32cMod.CRC32C {
    def this(initialValue: Double) = this()
  }
  object CRC32C {
    
    @JSImport("@google-cloud/storage", "CRC32C")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@google-cloud/storage", "CRC32C.CRC32C_EXTENSIONS")
    @js.native
    val CRC32C_EXTENSIONS: js.Array[Any] = js.native
    
    /* static member */
    @JSImport("@google-cloud/storage", "CRC32C.CRC32C_EXTENSION_TABLE")
    @js.native
    val CRC32C_EXTENSION_TABLE: js.typedarray.Int32Array = js.native
    
    inline def from(value: String): typings.googleCloudStorage.crc32cMod.CRC32C = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudStorage.crc32cMod.CRC32C]
    /**
      * Generates a `CRC32C` from a variety of compatable types.
      *
      * @param value A number, 4-byte `ArrayBufferView`/`Buffer`/`TypedArray`, or 4-byte base64-encoded data (string)
      */
    /* static member */
    inline def from(value: js.typedarray.ArrayBuffer): typings.googleCloudStorage.crc32cMod.CRC32C = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudStorage.crc32cMod.CRC32C]
    inline def from(value: js.typedarray.ArrayBufferView): typings.googleCloudStorage.crc32cMod.CRC32C = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudStorage.crc32cMod.CRC32C]
    inline def from(value: Double): typings.googleCloudStorage.crc32cMod.CRC32C = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudStorage.crc32cMod.CRC32C]
    inline def from(value: CRC32CValidator): typings.googleCloudStorage.crc32cMod.CRC32C = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudStorage.crc32cMod.CRC32C]
    
    /**
      * Generates a `CRC32C` from a compatible buffer format.
      *
      * @param value 4-byte `ArrayBufferView`/`Buffer`/`TypedArray`
      */
    /* static member */
    @JSImport("@google-cloud/storage", "CRC32C.fromBuffer")
    @js.native
    def fromBuffer: Any = js.native
    inline def fromBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromBuffer")(x.asInstanceOf[js.Any])
    
    /**
      * Generates a `CRC32C` from a safe, unsigned 32-bit integer.
      *
      * @param value an unsigned 32-bit integer
      */
    /* static member */
    @JSImport("@google-cloud/storage", "CRC32C.fromNumber")
    @js.native
    def fromNumber: Any = js.native
    inline def fromNumber_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromNumber")(x.asInstanceOf[js.Any])
    
    /**
      * Generates a `CRC32C` from 4-byte base64-encoded data (string).
      *
      * @param value 4-byte base64-encoded data (string)
      */
    /* static member */
    @JSImport("@google-cloud/storage", "CRC32C.fromString")
    @js.native
    def fromString: Any = js.native
    inline def fromString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromString")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/storage", "CRC32C_DEFAULT_VALIDATOR_GENERATOR")
  @js.native
  val CRC32C_DEFAULT_VALIDATOR_GENERATOR: CRC32CValidatorGenerator = js.native
  
  object CRC32C_EXCEPTION_MESSAGES {
    
    @JSImport("@google-cloud/storage", "CRC32C_EXCEPTION_MESSAGES")
    @js.native
    val ^ : js.Any = js.native
    
    inline def INVALID_INIT_BASE64_RANGE(l: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_INIT_BASE64_RANGE")(l.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def INVALID_INIT_BUFFER_LENGTH(l: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_INIT_BUFFER_LENGTH")(l.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def INVALID_INIT_INTEGER(l: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("INVALID_INIT_INTEGER")(l.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * Ported from {@link https://github.com/google/crc32c/blob/21fc8ef30415a635e7351ffa0e5d5367943d4a94/src/crc32c_portable.cc#L16-L59 github.com/google/crc32c}
    */
  @JSImport("@google-cloud/storage", "CRC32C_EXTENSIONS")
  @js.native
  val CRC32C_EXTENSIONS: js.Array[Any] = js.native
  
  @JSImport("@google-cloud/storage", "CRC32C_EXTENSION_TABLE")
  @js.native
  val CRC32C_EXTENSION_TABLE: js.typedarray.Int32Array = js.native
  
  /**
    * Create a channel object to interact with a Cloud Storage channel.
    *
    * See {@link https://cloud.google.com/storage/docs/object-change-notification| Object Change Notification}
    *
    * @class
    *
    * @param {string} id The ID of the channel.
    * @param {string} resourceId The resource ID of the channel.
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const channel = storage.channel('id', 'resource-id');
    * ```
    */
  @JSImport("@google-cloud/storage", "Channel")
  @js.native
  open class Channel protected ()
    extends typings.googleCloudStorage.channelMod.Channel {
    def this(storage: typings.googleCloudStorage.storageMod.Storage, id: String, resourceId: String) = this()
  }
  
  /**
    * A File object is created from your {@link Bucket} object using
    * {@link Bucket#file}.
    *
    * @class
    */
  @JSImport("@google-cloud/storage", "File")
  @js.native
  open class File protected ()
    extends typings.googleCloudStorage.fileMod.File {
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
      * The `acl` object on a File instance provides methods to get you a list of
      * the ACLs defined on your bucket, as well as set, update, and delete them.
      *
      * See {@link http://goo.gl/6qBBPO| About Access Control lists}
      *
      * @name File#acl
      * @mixes Acl
      *
      * @example
      * ```
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const myBucket = storage.bucket('my-bucket');
      *
      * const file = myBucket.file('my-file');
      * //-
      * // Make a file publicly readable.
      * //-
      * const options = {
      *   entity: 'allUsers',
      *   role: storage.acl.READER_ROLE
      * };
      *
      * file.acl.add(options, function(err, aclObject) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * file.acl.add(options).then(function(data) {
      *   const aclObject = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    /**
      * The API-formatted resource description of the file.
      *
      * Note: This is not guaranteed to be up-to-date when accessed. To get the
      * latest record, call the `getMetadata()` method.
      *
      * @name File#metadata
      * @type {object}
      */
    /**
      * The file's name.
      * @name File#name
      * @type {string}
      */
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
      * @typedef {object} FileOptions Options passed to the File constructor.
      * @property {string} [encryptionKey] A custom encryption key.
      * @property {number} [generation] Generation to scope the file to.
      * @property {string} [kmsKeyName] Cloud KMS Key used to encrypt this
      *     object, if the object is encrypted by such a key. Limited availability;
      *     usable only by enabled projects.
      * @property {string} [userProject] The ID of the project which will be
      *     billed for all requests made from File object.
      * @property {Crc32cGeneratorCallback} [callback] A function that generates a CRC32C Validator. Defaults to {@link CRC32C}
      */
    /**
      * Constructs a file object.
      *
      * @param {Bucket} bucket The Bucket instance this file is
      *     attached to.
      * @param {string} name The name of the remote file.
      * @param {FileOptions} [options] Configuration options.
      * @example
      * ```
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const myBucket = storage.bucket('my-bucket');
      *
      * const file = myBucket.file('my-file');
      * ```
      */
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket, name: String) = this()
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket, name: String, options: FileOptions) = this()
  }
  
  @JSImport("@google-cloud/storage", "HashStreamValidator")
  @js.native
  open class HashStreamValidator ()
    extends typings.googleCloudStorage.hashStreamValidatorMod.HashStreamValidator {
    def this(options: PartialHashStreamValidato) = this()
  }
  
  @JSImport("@google-cloud/storage", "HmacKey")
  @js.native
  open class HmacKey protected ()
    extends typings.googleCloudStorage.hmacKeyMod.HmacKey {
    /**
      * @typedef {object} HmacKeyOptions
      * @property {string} [projectId] The project ID of the project that owns
      *     the service account of the requested HMAC key. If not provided,
      *     the project ID used to instantiate the Storage client will be used.
      */
    /**
      * Constructs an HmacKey object.
      *
      * Note: this only create a local reference to an HMAC key, to create
      * an HMAC key, use {@link Storage#createHmacKey}.
      *
      * @param {Storage} storage The Storage instance this HMAC key is
      *     attached to.
      * @param {string} accessId The unique accessId for this HMAC key.
      * @param {HmacKeyOptions} options Constructor configurations.
      * @example
      * ```
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const hmacKey = storage.hmacKey('access-id');
      * ```
      */
    def this(storage: typings.googleCloudStorage.storageMod.Storage, accessId: String) = this()
    def this(storage: typings.googleCloudStorage.storageMod.Storage, accessId: String, options: HmacKeyOptions) = this()
  }
  
  /**
    * Get and set IAM policies for your Cloud Storage bucket.
    *
    * See {@link https://cloud.google.com/storage/docs/access-control/iam#short_title_iam_management| Cloud Storage IAM Management}
    * See {@link https://cloud.google.com/iam/docs/granting-changing-revoking-access| Granting, Changing, and Revoking Access}
    * See {@link https://cloud.google.com/iam/docs/understanding-roles| IAM Roles}
    *
    * @constructor Iam
    *
    * @param {Bucket} bucket The parent instance.
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    * // bucket.iam
    * ```
    */
  @JSImport("@google-cloud/storage", "Iam")
  @js.native
  open class Iam protected ()
    extends typings.googleCloudStorage.iamMod.Iam {
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket) = this()
  }
  
  @JSImport("@google-cloud/storage", "IdempotencyStrategy")
  @js.native
  object IdempotencyStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleCloudStorage.storageMod.IdempotencyStrategy & Double] = js.native
    
    /* 0 */ val RetryAlways: typings.googleCloudStorage.storageMod.IdempotencyStrategy.RetryAlways & Double = js.native
    
    /* 1 */ val RetryConditional: typings.googleCloudStorage.storageMod.IdempotencyStrategy.RetryConditional & Double = js.native
    
    /* 2 */ val RetryNever: typings.googleCloudStorage.storageMod.IdempotencyStrategy.RetryNever & Double = js.native
  }
  
  /**
    * The API-formatted resource description of the notification.
    *
    * Note: This is not guaranteed to be up-to-date when accessed. To get the
    * latest record, call the `getMetadata()` method.
    *
    * @name Notification#metadata
    * @type {object}
    */
  /**
    * A Notification object is created from your {@link Bucket} object using
    * {@link Bucket#notification}. Use it to interact with Cloud Pub/Sub
    * notifications.
    *
    * See {@link https://cloud.google.com/storage/docs/pubsub-notifications| Cloud Pub/Sub Notifications for Google Cloud Storage}
    *
    * @class
    * @hideconstructor
    *
    * @param {Bucket} bucket The bucket instance this notification is attached to.
    * @param {string} id The ID of the notification.
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const notification = myBucket.notification('1');
    * ```
    */
  @JSImport("@google-cloud/storage", "Notification")
  @js.native
  open class Notification protected ()
    extends typings.googleCloudStorage.notificationMod.Notification {
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket, id: String) = this()
  }
  
  @JSImport("@google-cloud/storage", "Storage")
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
  open class Storage ()
    extends typings.googleCloudStorage.storageMod.Storage {
    def this(options: StorageOptions) = this()
  }
  /* static members */
  object Storage {
    
    @JSImport("@google-cloud/storage", "Storage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * {@link Bucket} class.
      *
      * @name Storage.Bucket
      * @see Bucket
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage", "Storage.Bucket")
    @js.native
    def Bucket: Instantiable3[
        /* storage */ typings.googleCloudStorage.storageMod.Storage, 
        /* name */ String, 
        /* options */ js.UndefOr[BucketOptions], 
        typings.googleCloudStorage.bucketMod.Bucket
      ] = js.native
    inline def Bucket_=(
      x: Instantiable3[
          /* storage */ typings.googleCloudStorage.storageMod.Storage, 
          /* name */ String, 
          /* options */ js.UndefOr[BucketOptions], 
          typings.googleCloudStorage.bucketMod.Bucket
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(x.asInstanceOf[js.Any])
    
    /**
      * {@link Channel} class.
      *
      * @name Storage.Channel
      * @see Channel
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage", "Storage.Channel")
    @js.native
    def Channel: Instantiable3[
        /* storage */ typings.googleCloudStorage.storageMod.Storage, 
        /* id */ String, 
        /* resourceId */ String, 
        typings.googleCloudStorage.channelMod.Channel
      ] = js.native
    inline def Channel_=(
      x: Instantiable3[
          /* storage */ typings.googleCloudStorage.storageMod.Storage, 
          /* id */ String, 
          /* resourceId */ String, 
          typings.googleCloudStorage.channelMod.Channel
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Channel")(x.asInstanceOf[js.Any])
    
    /**
      * {@link File} class.
      *
      * @name Storage.File
      * @see File
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage", "Storage.File")
    @js.native
    def File: Instantiable3[
        /* bucket */ typings.googleCloudStorage.bucketMod.Bucket, 
        /* name */ String, 
        /* options */ js.UndefOr[FileOptions], 
        typings.googleCloudStorage.fileMod.File
      ] = js.native
    inline def File_=(
      x: Instantiable3[
          /* bucket */ typings.googleCloudStorage.bucketMod.Bucket, 
          /* name */ String, 
          /* options */ js.UndefOr[FileOptions], 
          typings.googleCloudStorage.fileMod.File
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /**
      * {@link HmacKey} class.
      *
      * @name Storage.HmacKey
      * @see HmacKey
      * @type {Constructor}
      */
    @JSImport("@google-cloud/storage", "Storage.HmacKey")
    @js.native
    def HmacKey: Instantiable3[
        /* storage */ typings.googleCloudStorage.storageMod.Storage, 
        /* accessId */ String, 
        /* options */ js.UndefOr[HmacKeyOptions], 
        typings.googleCloudStorage.hmacKeyMod.HmacKey
      ] = js.native
    inline def HmacKey_=(
      x: Instantiable3[
          /* storage */ typings.googleCloudStorage.storageMod.Storage, 
          /* accessId */ String, 
          /* options */ js.UndefOr[HmacKeyOptions], 
          typings.googleCloudStorage.hmacKeyMod.HmacKey
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HmacKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/storage", "Storage.acl")
    @js.native
    def acl: OWNERROLE = js.native
    inline def acl_=(x: OWNERROLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acl")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/storage", "Storage.sanitizeEndpoint")
    @js.native
    def sanitizeEndpoint: Any = js.native
    inline def sanitizeEndpoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeEndpoint")(x.asInstanceOf[js.Any])
  }
}
