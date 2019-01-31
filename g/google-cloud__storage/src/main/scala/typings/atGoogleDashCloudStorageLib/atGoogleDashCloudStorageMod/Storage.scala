package typings
package atGoogleDashCloudStorageLib.atGoogleDashCloudStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage {
  def this(options: atGoogleDashCloudStorageLib.buildSrcStorageMod.StorageOptions) = this()
}

@JSImport("@google-cloud/storage", "Storage")
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

