package typings.googleCloudStorage

import org.scalablytyped.runtime.Instantiable3
import typings.googleCloudStorage.anon.OWNERROLE
import typings.googleCloudStorage.bucketMod.BucketOptions
import typings.googleCloudStorage.fileMod.FileOptions
import typings.googleCloudStorage.hmacKeyMod.HmacKeyOptions
import typings.googleCloudStorage.storageMod.StorageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("@google-cloud/storage", "Bucket")
  @js.native
  class Bucket protected ()
    extends typings.googleCloudStorage.bucketMod.Bucket {
    def this(storage: typings.googleCloudStorage.storageMod.Storage, name: String) = this()
    def this(storage: typings.googleCloudStorage.storageMod.Storage, name: String, options: BucketOptions) = this()
  }
  
  /**
    * Create a channel object to interact with a Cloud Storage channel.
    *
    * @see [Object Change Notification]{@link https://cloud.google.com/storage/docs/object-change-notification}
    *
    * @class
    *
    * @param {string} id The ID of the channel.
    * @param {string} resourceId The resource ID of the channel.
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const channel = storage.channel('id', 'resource-id');
    */
  @JSImport("@google-cloud/storage", "Channel")
  @js.native
  class Channel protected ()
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
  class File protected ()
    extends typings.googleCloudStorage.fileMod.File {
    /**
      * @typedef {object} FileOptions Options passed to the File constructor.
      * @property {string} [encryptionKey] A custom encryption key.
      * @property {number} [generation] Generation to scope the file to.
      * @property {string} [kmsKeyName] Cloud KMS Key used to encrypt this
      *     object, if the object is encrypted by such a key. Limited availability;
      *     usable only by enabled projects.
      * @property {string} [userProject] The ID of the project which will be
      *     billed for all requests made from File object.
      */
    /**
      * Constructs a file object.
      *
      * @param {Bucket} bucket The Bucket instance this file is
      *     attached to.
      * @param {string} name The name of the remote file.
      * @param {FileOptions} [options] Configuration options.
      * @example
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const myBucket = storage.bucket('my-bucket');
      *
      * const file = myBucket.file('my-file');
      */
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket, name: String) = this()
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket, name: String, options: FileOptions) = this()
  }
  
  @JSImport("@google-cloud/storage", "HmacKey")
  @js.native
  class HmacKey protected ()
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
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const hmacKey = storage.hmacKey('access-id');
      */
    def this(storage: typings.googleCloudStorage.storageMod.Storage, accessId: String) = this()
    def this(storage: typings.googleCloudStorage.storageMod.Storage, accessId: String, options: HmacKeyOptions) = this()
  }
  
  /**
    * Get and set IAM policies for your Cloud Storage bucket.
    *
    * @see [Cloud Storage IAM Management](https://cloud.google.com/storage/docs/access-control/iam#short_title_iam_management)
    * @see [Granting, Changing, and Revoking Access](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
    * @see [IAM Roles](https://cloud.google.com/iam/docs/understanding-roles)
    *
    * @constructor Iam
    * @mixin
    *
    * @param {Bucket} bucket The parent instance.
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    * // bucket.iam
    */
  @JSImport("@google-cloud/storage", "Iam")
  @js.native
  class Iam protected ()
    extends typings.googleCloudStorage.iamMod.Iam {
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket) = this()
  }
  
  /**
    * A Notification object is created from your {@link Bucket} object using
    * {@link Bucket#notification}. Use it to interact with Cloud Pub/Sub
    * notifications.
    *
    * @see [Cloud Pub/Sub Notifications for Google Cloud Storage]{@link https://cloud.google.com/storage/docs/pubsub-notifications}
    *
    * @class
    * @hideconstructor
    *
    * @param {Bucket} bucket The bucket instance this notification is attached to.
    * @param {string} id The ID of the notification.
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const notification = myBucket.notification('1');
    */
  @JSImport("@google-cloud/storage", "Notification")
  @js.native
  class Notification protected ()
    extends typings.googleCloudStorage.notificationMod.Notification {
    def this(bucket: typings.googleCloudStorage.bucketMod.Bucket, id: String) = this()
  }
  
  @JSImport("@google-cloud/storage", "Storage")
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
  class Storage ()
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
    @JSImport("@google-cloud/storage", "Storage.acl")
    @js.native
    def acl: OWNERROLE = js.native
    inline def acl_=(x: OWNERROLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acl")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/storage", "Storage.sanitizeEndpoint")
    @js.native
    def sanitizeEndpoint: js.Any = js.native
    inline def sanitizeEndpoint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeEndpoint")(x.asInstanceOf[js.Any])
  }
}
