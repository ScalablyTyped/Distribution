package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Access control list for storage buckets and files.
     */

trait Acl extends AclActions {
  var default: AclEntity
  var owners: AclEntity
  var readers: AclEntity
  var writers: AclEntity
}

