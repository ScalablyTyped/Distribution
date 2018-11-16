package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Bucket configuration.
     */

trait BucketConfig extends js.Object {
  var coldline: js.UndefOr[scala.Boolean] = js.undefined
  var dra: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var multiRegional: js.UndefOr[scala.Boolean] = js.undefined
  var nearline: js.UndefOr[scala.Boolean] = js.undefined
  var regional: js.UndefOr[scala.Boolean] = js.undefined
  // Note: This is not documented, but it is used in examples (https://cloud.google.com/nodejs/docs/reference/storage/1.7.x/Storage)
  var storageClass: js.UndefOr[
    atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.COLDLINE | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.DURABLE_REDUCED_AVAILABILITY | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.MULTI_REGIONAL | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.NEARLINE | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.REGIONAL
  ] = js.undefined
  var versioning: js.UndefOr[atGoogleDashCloudStorageLib.Anon_Enabled] = js.undefined
}

