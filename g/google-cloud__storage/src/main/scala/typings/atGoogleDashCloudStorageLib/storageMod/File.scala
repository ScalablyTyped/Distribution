package typings
package atGoogleDashCloudStorageLib.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A File object is created from your {@link Bucket} object using
 * {@link Bucket#file}.
 *
 * @class
 * @param {Bucket} bucket The Bucket instance this file is
 *     attached to.
 * @param {string} name The name of the remote file.
 * @param {object} [options] Configuration options.
 * @param {string} [options.encryptionKey] A custom encryption key.
 * @param {number} [options.generation] Generation to scope the file to.
 * @param {string} [options.kmsKeyName] Cloud KMS Key used to encrypt this
 *     object, if the object is encrypted by such a key. Limited availability;
 *     usable only by enabled projects.
 * @param {string} [options.userProject] The ID of the project which will be
 *     billed for all requests made from File object.
 * @example
 * const {Storage} = require('@google-cloud/storage');
 * const storage = new Storage();
 * const myBucket = storage.bucket('my-bucket');
 *
 * const file = myBucket.file('my-file');
 */
@JSImport("@google-cloud/storage", "File")
@js.native
class File protected ()
  extends atGoogleDashCloudStorageLib.buildSrcFileMod.File {
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, name: java.lang.String) = this()
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, name: java.lang.String, options: atGoogleDashCloudStorageLib.buildSrcFileMod.FileOptions) = this()
}

