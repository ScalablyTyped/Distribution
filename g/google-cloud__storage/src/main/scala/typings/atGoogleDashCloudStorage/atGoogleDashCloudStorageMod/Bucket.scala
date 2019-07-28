package typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageMod

import typings.atGoogleDashCloudStorage.buildSrcBucketMod.BucketOptions
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
@JSImport("@google-cloud/storage", "Bucket")
@js.native
class Bucket protected ()
  extends typings.atGoogleDashCloudStorage.buildSrcBucketMod.Bucket {
  def this(storage: typings.atGoogleDashCloudStorage.buildSrcStorageMod.Storage, name: String) = this()
  def this(
    storage: typings.atGoogleDashCloudStorage.buildSrcStorageMod.Storage,
    name: String,
    options: BucketOptions
  ) = this()
}

