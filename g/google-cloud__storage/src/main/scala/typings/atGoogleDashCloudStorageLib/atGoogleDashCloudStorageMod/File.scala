package typings
package atGoogleDashCloudStorageLib.atGoogleDashCloudStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A File object is created from your {@link Bucket} object using
  * {@link Bucket#file}.
  *
  * @class
  */
@JSImport("@google-cloud/storage", "File")
@js.native
class File protected ()
  extends atGoogleDashCloudStorageLib.buildSrcFileMod.File {
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
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, name: java.lang.String) = this()
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, name: java.lang.String, options: atGoogleDashCloudStorageLib.buildSrcFileMod.FileOptions) = this()
}

