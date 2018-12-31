package typings
package atGoogleDashCloudStorageLib.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends atGoogleDashCloudStorageLib.buildSrcIamMod.Iam {
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket) = this()
}

